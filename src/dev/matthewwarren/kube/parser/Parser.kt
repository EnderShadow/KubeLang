package dev.matthewwarren.kube.parser

import dev.matthewwarren.kube.exceptions.SyntaxException
import java.io.File

object Parser {
    fun parseFiles(files: List<File>): List<Module> {
        return files.flatMap {parseTokens(Lexer.parseFile(it))}
    }
    
    private fun parseTokens(tokens: List<Token>): List<Module> {
        val modules = mutableListOf<Module>()
        
        var index = 0
        while(index < tokens.size) {
            val (module, newIndex) = parseModule(tokens, index)
            modules.add(module)
            index = newIndex
        }
        
        return modules
    }
}

private fun parseModule(tokens: List<Token>, startIndex: Int): Pair<Module, Int> {
    expect(tokens, startIndex, TokenType.MODULE, TokenType.IDENTIFIER, TokenType.LEFT_CURLY_BRACKET)
    
    val name = tokens[startIndex + 1].text
    
    val (imports, contentIndex) = parseImports(tokens, startIndex + 3)
    val (contents, endIndex) = parseModuleContents(tokens, contentIndex)
    
    expect(tokens, endIndex, TokenType.RIGHT_CURLY_BRACKET)
    return Pair(Module(name, imports, contents), endIndex + 1)
}

private fun parseImports(tokens: List<Token>, startIndex: Int): Pair<List<String>, Int> {
    val imports = mutableListOf<String>()
    var index = startIndex
    while(index < tokens.size) {
        if(!check(tokens, index, TokenType.IMPORT))
            break
        expect(tokens, index, TokenType.IMPORT, TokenType.IDENTIFIER)
        imports.add(tokens[index + 1].text)
        index += 2
    }
    return Pair(imports, index)
}

private fun parseModuleContents(tokens: List<Token>, startIndex: Int): Pair<List<ModuleElement>, Int> {
    val moduleContents = mutableListOf<ModuleElement>()
    var index = startIndex
    
    while(!check(tokens, index, TokenType.RIGHT_CURLY_BRACKET)) {
        if(check(tokens, index, TokenType.INIT)) {
            val (initializer, newIndex) = parseInitializer(tokens, index)
            moduleContents.add(initializer)
            index = newIndex
        }
        else {
            val annotations = mutableListOf<String>()
            while(check(tokens, index, TokenType.ANNOTATION)) {
                annotations.add(tokens[index].text)
                index++
            }
            expect(tokens, index, setOf(TokenType.INTERFACE, TokenType.CLASS, TokenType.FUN, TokenType.VAL, TokenType.VAR))
            val (moduleContent, newIndex) = when(tokens[index].type) {
                TokenType.INTERFACE -> parseInterface(tokens, index, annotations)
                TokenType.CLASS -> parseClass(tokens, index, annotations)
                TokenType.FUN -> parseFunction(tokens, index, annotations, true)
                TokenType.VAL -> parseValue(tokens, index, annotations)
                TokenType.VAR -> parseVariable(tokens, index, annotations)
                else -> throw IllegalStateException("This cannot occur")
            }
            moduleContents.add(moduleContent)
            index = newIndex
        }
    }
    
    return Pair(moduleContents, index)
}

private fun parseInterfaceContents(tokens: List<Token>, startIndex: Int): Pair<List<InterfaceElement>, Int> {
    val interfaceContents = mutableListOf<InterfaceElement>()
    var index = startIndex
    
    while(!check(tokens, index, TokenType.RIGHT_CURLY_BRACKET)) {
        val annotations = mutableListOf<String>()
        while(check(tokens, index, TokenType.ANNOTATION)) {
            annotations.add(tokens[index].text)
            index++
        }
        expect(tokens, index, setOf(TokenType.FUN, TokenType.VAL, TokenType.VAR))
        val (interfaceContent, newIndex) = when(tokens[index].type) {
            TokenType.FUN -> parseFunction(tokens, index, annotations, false)
            TokenType.VAL -> parseValue(tokens, index, annotations)
            TokenType.VAR -> parseVariable(tokens, index, annotations)
            else -> throw IllegalStateException("This cannot occur")
        }
        interfaceContents.add(interfaceContent)
        index = newIndex
    }
    
    return Pair(interfaceContents, index)
}

private fun parseClassContents(tokens: List<Token>, startIndex: Int): Pair<List<ClassElement>, Int> {
    val classContents = mutableListOf<ClassElement>()
    var index = startIndex
    
    while(!check(tokens, index, TokenType.RIGHT_CURLY_BRACKET)) {
        if(check(tokens, index, TokenType.INIT)) {
            val (initializer, newIndex) = parseInitializer(tokens, index)
            classContents.add(initializer)
            index = newIndex
        }
        else {
            val annotations = mutableListOf<String>()
            while(check(tokens, index, TokenType.ANNOTATION)) {
                annotations.add(tokens[index].text)
                index++
            }
            expect(tokens, index, setOf(TokenType.CONSTRUCTOR, TokenType.FUN, TokenType.VAL, TokenType.VAR))
            val (classContent, newIndex) = when(tokens[index].type) {
                TokenType.CONSTRUCTOR -> parseConstructor(tokens, index, annotations)
                TokenType.FUN -> parseFunction(tokens, index, annotations, true)
                TokenType.VAL -> parseValue(tokens, index, annotations)
                TokenType.VAR -> parseVariable(tokens, index, annotations)
                else -> throw IllegalStateException("This cannot occur")
            }
            classContents.add(classContent)
            index = newIndex
        }
    }
    
    return Pair(classContents, index)
}

private fun parseInitializer(tokens: List<Token>, startIndex: Int): Pair<Initializer, Int> {
    expect(tokens, startIndex, TokenType.INIT, TokenType.LEFT_CURLY_BRACKET)
    val (statements, newIndex) = parseStatements(tokens, startIndex + 2)
    expect(tokens, newIndex, TokenType.RIGHT_CURLY_BRACKET)
    return Pair(Initializer(statements), newIndex + 1)
}

private fun parseInterface(tokens: List<Token>, startIndex: Int, annotations: List<String>): Pair<Interface, Int> {
    expect(tokens, startIndex, TokenType.INTERFACE, TokenType.IDENTIFIER)
    val name = tokens[startIndex + 1].text
    var index = startIndex + 2
    val genericDeclaration = if(check(tokens, index, TokenType.LEFT_ANGLE_BRACKET)) {
        val (genericDeclaration, newIndex) = parseGenericDeclaration(tokens, index)
        index = newIndex
        genericDeclaration
    }
    else {
        null
    }
    
    val superTypes = if(check(tokens, index, TokenType.COLON)) {
        val (typeList, newIndex) = parseTypeList(tokens, index)
        index = newIndex
        typeList
    }
    else {
        emptyList()
    }
    
    val interfaceContents = if(check(tokens, index, TokenType.LEFT_CURLY_BRACKET)) {
        val (interfaceContents, newIndex) = parseInterfaceContents(tokens, index + 1)
        expect(tokens, newIndex, TokenType.RIGHT_CURLY_BRACKET)
        index = newIndex + 1
        interfaceContents
    }
    else {
        emptyList()
    }
    
    return Pair(Interface(annotations, name, genericDeclaration, superTypes, interfaceContents), index)
}

private fun parseClass(tokens: List<Token>, startIndex: Int, annotations: List<String>): Pair<Class, Int> {
    expect(tokens, startIndex, TokenType.CLASS, TokenType.IDENTIFIER)
    val name = tokens[startIndex + 1].text
    var index = startIndex + 2
    val genericDeclaration = if(check(tokens, index, TokenType.LEFT_ANGLE_BRACKET)) {
        val (genericDeclaration, newIndex) = parseGenericDeclaration(tokens, index)
        index = newIndex
        genericDeclaration
    }
    else {
        null
    }
    
    val superTypes = if(check(tokens, index, TokenType.COLON)) {
        val (typeList, newIndex) = parseTypeList(tokens, index)
        index = newIndex
        typeList
    }
    else {
        emptyList()
    }
    
    val classContents = if(check(tokens, index, TokenType.LEFT_CURLY_BRACKET)) {
        val (classContents, newIndex) = parseClassContents(tokens, index + 1)
        expect(tokens, newIndex, TokenType.RIGHT_CURLY_BRACKET)
        index = newIndex + 1
        classContents
    }
    else {
        emptyList()
    }
    
    return Pair(Class(annotations, name, genericDeclaration, superTypes, classContents), index)
}

private fun parseFunction(tokens: List<Token>, startIndex: Int, annotations: List<String>, requiresBody: Boolean): Pair<Function, Int> {
    expect(tokens, startIndex, TokenType.FUN, TokenType.IDENTIFIER)
    val name = tokens[startIndex + 1].text
    var index = startIndex + 2
    val genericDeclaration = if(check(tokens, index, TokenType.LEFT_ANGLE_BRACKET)) {
        val (genericDeclaration, newIndex) = parseGenericDeclaration(tokens, index)
        index = newIndex
        genericDeclaration
    }
    else {
        null
    }
    
    expect(tokens, index, TokenType.LEFT_PARENTHESIS)
    val parameters = if(!check(tokens, index + 1, TokenType.RIGHT_PARENTHESIS)) {
        val parameters = mutableListOf<Pair<String, Type>>()
        do {
            val (parameter, newIndex) = parseParameter(tokens, index + 1)
            parameters.add(parameter)
            index = newIndex
        } while(check(tokens, index, TokenType.COMMA))
        parameters
    }
    else {
        index++
        emptyList()
    }
    expect(tokens, index, TokenType.RIGHT_PARENTHESIS)
    index++
    val returnType = if(check(tokens, index, TokenType.COLON)) {
        val (type, newIndex) = parseType(tokens, index + 1)
        index = newIndex
        type
    }
    else {
        Type.UNIT
    }
    
    val body = if(requiresBody) {
        if(!check(tokens, index, TokenType.LEFT_CURLY_BRACKET))
            throw SyntaxException("Missing function body on line ${tokens[index].line}, column ${tokens[index].column}, in file ${tokens[index].file.name}")
        val (statements, newIndex) = parseStatements(tokens, index + 1)
        expect(tokens, newIndex, TokenType.RIGHT_CURLY_BRACKET)
        index = newIndex + 1
        statements
    }
    else {
        if(check(tokens, index, TokenType.LEFT_CURLY_BRACKET)) {
            val (statements, newIndex) = parseStatements(tokens, index + 1)
            expect(tokens, newIndex, TokenType.RIGHT_CURLY_BRACKET)
            index = newIndex + 1
            statements
        }
        else {
            null
        }
    }
    
    val function = Function(annotations, name, genericDeclaration, returnType, parameters, body)
    return Pair(function, index)
}

private fun parseConstructor(tokens: List<Token>, startIndex: Int, annotations: List<String>): Pair<Constructor, Int> {
    expect(tokens, startIndex, TokenType.CONSTRUCTOR, TokenType.LEFT_PARENTHESIS)
    
    var index = startIndex + 1
    val parameters = if(!check(tokens, index + 1, TokenType.RIGHT_PARENTHESIS)) {
        val parameters = mutableListOf<Pair<String, Type>>()
        do {
            val (parameter, newIndex) = parseParameter(tokens, index + 1)
            parameters.add(parameter)
            index = newIndex
        } while(check(tokens, index, TokenType.COMMA))
        parameters
    }
    else {
        index++
        emptyList()
    }
    expect(tokens, index, TokenType.RIGHT_PARENTHESIS)
    index++
    
    val callsSuper: Boolean
    val parentConstructorParameters: List<Expression>
    if(check(tokens, index, TokenType.COLON)) {
        expect(tokens, index + 1, setOf(TokenType.THIS, TokenType.SUPER))
        callsSuper = tokens[index + 1].type == TokenType.SUPER
        expect(tokens, index + 2, TokenType.LEFT_PARENTHESIS)
        if(!check(tokens, index + 3, TokenType.RIGHT_PARENTHESIS)) {
            parentConstructorParameters = mutableListOf()
            index += 2
            do {
                val (expression, newIndex) = parseExpression(tokens, index + 1)
                parentConstructorParameters.add(expression)
                index = newIndex
            }
            while(check(tokens, index, TokenType.COMMA))
            expect(tokens, index, TokenType.RIGHT_PARENTHESIS)
            index++
        }
        else {
            parentConstructorParameters = emptyList()
            index += 4
        }
    }
    else {
        callsSuper = true
        parentConstructorParameters = emptyList()
    }
    
    if(!check(tokens, index, TokenType.LEFT_CURLY_BRACKET))
        throw SyntaxException("Missing constructor body on line ${tokens[index].line}, column ${tokens[index].column}, in file ${tokens[index].file.name}")
    val (body, newIndex) = parseStatements(tokens, index + 1)
    expect(tokens, newIndex, TokenType.RIGHT_CURLY_BRACKET)
    index = newIndex + 1
    
    val constructor = Constructor(annotations, parameters, callsSuper, parentConstructorParameters, body)
    return Pair(constructor, index)
}

private fun parseValue(tokens: List<Token>, startIndex: Int, annotations: List<String>): Pair<Value, Int> {
    expect(tokens, startIndex, TokenType.VAL, TokenType.IDENTIFIER)
    val name = tokens[startIndex + 1].text
    var index = startIndex + 2
    val type = if(check(tokens, index, TokenType.COLON)) {
        val (type, newIndex) = parseType(tokens, index + 1)
        index = newIndex
        type
    }
    else {
        null // need to determine type from expression
    }
    
    val expression = if(check(tokens, index, TokenType.EQUALS)) {
        val (expression, newIndex) = parseExpression(tokens, index + 1)
        index = newIndex
        expression
    }
    else if(type == null) {
        throw SyntaxException("Missing type or initialization expression for value on line ${tokens[index].line}, column ${tokens[index].column}, in file ${tokens[index].file.name}")
    }
    else {
        null
    }
    
    val getter = if(check(tokens, index, TokenType.GET)) {
        expect(tokens, index, TokenType.GET, TokenType.LEFT_PARENTHESIS, TokenType.RIGHT_PARENTHESIS, TokenType.RIGHT_CURLY_BRACKET)
        val (statements, newIndex) = parseStatements(tokens, index + 4)
        index = newIndex
        statements
    }
    else {
        emptyList()
    }
    
    return Pair(Value(annotations, name, type, expression, getter), index)
}

private fun parseVariable(tokens: List<Token>, startIndex: Int, annotations: List<String>): Pair<Variable, Int> {
    expect(tokens, startIndex, TokenType.VAR, TokenType.IDENTIFIER)
    val name = tokens[startIndex + 1].text
    var index = startIndex + 2
    val type = if(check(tokens, index, TokenType.COLON)) {
        val (type, newIndex) = parseType(tokens, index + 1)
        index = newIndex
        type
    }
    else {
        null // need to determine type from expression
    }
    
    val expression = if(check(tokens, index, TokenType.EQUALS)) {
        val (expression, newIndex) = parseExpression(tokens, index + 1)
        index = newIndex
        expression
    }
    else if(type == null) {
        throw SyntaxException("Missing type or initialization expression for value on line ${tokens[index].line}, column ${tokens[index].column}, in file ${tokens[index].file.name}")
    }
    else {
        null
    }
    
    var getter = if(check(tokens, index, TokenType.GET)) {
        expect(tokens, index, TokenType.GET, TokenType.LEFT_PARENTHESIS, TokenType.RIGHT_PARENTHESIS, TokenType.RIGHT_CURLY_BRACKET)
        val (statements, newIndex) = parseStatements(tokens, index + 4)
        index = newIndex
        statements
    }
    else {
        emptyList()
    }
    
    val setter = if(check(tokens, index, TokenType.SET)) {
        expect(tokens, index, TokenType.SET, TokenType.LEFT_PARENTHESIS, TokenType.IDENTIFIER, TokenType.RIGHT_PARENTHESIS, TokenType.RIGHT_CURLY_BRACKET)
        val parameterName = tokens[index + 2].text
        val (statements, newIndex) = parseStatements(tokens, index + 5)
        index = newIndex
        Pair(parameterName, statements)
    }
    else {
        Pair("", emptyList())
    }
    
    if(getter.isEmpty() && check(tokens, index, TokenType.GET)) {
        expect(tokens, index, TokenType.GET, TokenType.LEFT_PARENTHESIS, TokenType.RIGHT_PARENTHESIS, TokenType.RIGHT_CURLY_BRACKET)
        val (statements, newIndex) = parseStatements(tokens, index + 4)
        index = newIndex
        getter = statements
    }
    
    return Pair(Variable(annotations, name, type, expression, getter, setter), index)
}

private fun parseStatements(tokens: List<Token>, startIndex: Int): Pair<List<Statement>, Int> {
    val statements = mutableListOf<Statement>()
    var index = startIndex
    while(!check(tokens, index, TokenType.RIGHT_CURLY_BRACKET)) {
        val (statement, newIndex) = parseStatement(tokens, index)
        statements.add(statement)
        index = newIndex
    }
    return Pair(statements, index)
}

private fun parseStatement(tokens: List<Token>, startIndex: Int): Pair<Statement, Int> {
    return when(tokens[startIndex].type) {
        TokenType.VAL, TokenType.VAR -> parseLocalVariableStatement(tokens, startIndex)
        TokenType.IF -> parseIfElseStatement(tokens, startIndex)
        TokenType.FOR -> parseForStatement(tokens, startIndex)
        TokenType.WHILE -> parseWhileStatement(tokens, startIndex)
        TokenType.DO -> parseDoWhileStatement(tokens, startIndex)
        else -> {
            val (expression, index) = parseExpression(tokens, startIndex)
            if(check(tokens, index, setOf(TokenType.ASSIGN, TokenType.MULTIPLY_ASSIGN, TokenType.DIVIDE_ASSIGN, TokenType.MODULUS_ASSIGN, TokenType.ADD_ASSIGN,
                            TokenType.SUBTRACT_ASSIGN, TokenType.LEFT_SHIFT_ASSIGN, TokenType.ARITHMETIC_RIGHT_SHIFT_ASSIGN, TokenType.LOGICAL_RIGHT_SHIFT_ASSIGN,
                            TokenType.BITWISE_AND_ASSIGN, TokenType.BITWISE_XOR_ASSIGN, TokenType.BITWISE_OR_ASSIGN))) {
                val operator = when(tokens[index].type) {
                    TokenType.ASSIGN -> AssignmentOperator.ASSIGN
                    TokenType.MULTIPLY_ASSIGN -> AssignmentOperator.MULTIPLY_ASSIGN
                    TokenType.DIVIDE_ASSIGN -> AssignmentOperator.DIVIDE_ASSIGN
                    TokenType.MODULUS_ASSIGN -> AssignmentOperator.MODULUS_ASSIGN
                    TokenType.ADD_ASSIGN -> AssignmentOperator.ADD_ASSIGN
                    TokenType.SUBTRACT_ASSIGN -> AssignmentOperator.SUBTRACT_ASSIGN
                    TokenType.LEFT_SHIFT_ASSIGN -> AssignmentOperator.LEFT_SHIFT_ASSIGN
                    TokenType.ARITHMETIC_RIGHT_SHIFT_ASSIGN -> AssignmentOperator.ARITHMETIC_RIGHT_SHIFT_ASSIGN
                    TokenType.LOGICAL_RIGHT_SHIFT_ASSIGN -> AssignmentOperator.LOGICAL_RIGHT_SHIFT_ASSIGN
                    TokenType.BITWISE_AND_ASSIGN -> AssignmentOperator.AND_ASSIGN
                    TokenType.BITWISE_XOR_ASSIGN -> AssignmentOperator.XOR_ASSIGN
                    TokenType.BITWISE_OR_ASSIGN -> AssignmentOperator.OR_ASSIGN
                    else -> throw SyntaxException("This can never happen")
                }
                val (rightExpression, newIndex) = parseExpression(tokens, index + 1)
                Pair(AssignmentStatement(operator, expression, rightExpression), newIndex)
            }
            else {
                Pair(ExpressionStatement(expression), index)
            }
        }
    }
}

private fun parseLocalVariableStatement(tokens: List<Token>, startIndex: Int): Pair<LocalVariableStatement, Int> {
    TODO()
}

private fun parseIfElseStatement(tokens: List<Token>, startIndex: Int): Pair<IfElseStatement, Int> {
    TODO()
}

private fun parseForStatement(tokens: List<Token>, startIndex: Int): Pair<ForStatement, Int> {
    TODO()
}

private fun parseWhileStatement(tokens: List<Token>, startIndex: Int): Pair<WhileStatement, Int> {
    TODO()
}

private fun parseDoWhileStatement(tokens: List<Token>, startIndex: Int): Pair<DoWhileStatement, Int> {
    TODO()
}

private fun parseExpression(tokens: List<Token>, startIndex: Int): Pair<Expression, Int> {
    TODO()
}

private fun parseGenericDeclaration(tokens: List<Token>, startIndex: Int): Pair<GenericDeclaration, Int> {
    expect(tokens, startIndex, TokenType.LEFT_ANGLE_BRACKET)
    val genericTypes = mutableListOf<Pair<String, Type>>()
    var index = startIndex
    do {
        expect(tokens, index + 1, TokenType.IDENTIFIER)
        val name = tokens[index + 1].text
        val type = if(check(tokens, index + 2, TokenType.COLON)) {
            val (type, newIndex) = parseType(tokens, index + 3)
            index = newIndex
            type
        }
        else {
            index += 2
            Type.ANY
        }
        genericTypes.add(Pair(name, type))
    } while(check(tokens, index, TokenType.COMMA))
    
    expect(tokens, index, TokenType.RIGHT_ANGLE_BRACKET)
    return Pair(GenericDeclaration(genericTypes), index + 1)
}

private fun parseTypeList(tokens: List<Token>, startIndex: Int): Pair<List<Type>, Int> {
    val types = mutableListOf<Type>()
    var index = startIndex
    do {
        val (type, newIndex) = parseType(tokens, index + 1)
        types.add(type)
        index = newIndex
    } while(check(tokens, index, TokenType.COMMA))
    
    return Pair(types, index)
}

private fun parseParameter(tokens: List<Token>, startIndex: Int): Pair<Pair<String, Type>, Int> {
    expect(tokens, startIndex, TokenType.IDENTIFIER, TokenType.COLON)
    val name = tokens[startIndex].text
    val (type, index) = parseType(tokens, startIndex + 2)
    return Pair(Pair(name, type), index)
}

private fun parseType(tokens: List<Token>, startIndex: Int): Pair<Type, Int> {
    TODO()
}

/**
 * This function assumes that index - 1 is a valid index into the list if and only if index >= tokens.size
 */
private fun expect(tokens: List<Token>, index: Int, vararg expected: Set<TokenType>) {
    for((i, wanted) in expected.withIndex()) {
        if(index + i >= tokens.size) {
            val token = tokens[index + i - 1]
            throw SyntaxException("Expected one of ${wanted.joinToString()} but found nothing on line ${token.line}, column ${token.column + token.text.length}, in file ${token.file.name}")
        }
        if(tokens[index + i].type !in wanted) {
            val token = tokens[index + i]
            throw SyntaxException("Expected one of ${wanted.joinToString()} but found ${token.type} on line ${token.line}, column ${token.column}, in file ${token.file.name}")
        }
    }
}

/**
 * This function assumes that index - 1 is a valid index into the list if and only if index >= tokens.size
 */
private fun expect(tokens: List<Token>, index: Int, vararg expected: TokenType) {
    for((i, wanted) in expected.withIndex()) {
        if(index + i >= tokens.size) {
            val token = tokens[index + i - 1]
            throw SyntaxException("Expected $wanted but found nothing on line ${token.line}, column ${token.column + token.text.length}, in file ${token.file.name}")
        }
        if(tokens[index + i].type != wanted) {
            val token = tokens[index + i]
            throw SyntaxException("Expected $wanted but found ${token.type} on line ${token.line}, column ${token.column}, in file ${token.file.name}")
        }
    }
}

/**
 * This function assumes that index - 1 is a valid index into the list if and only if index >= tokens.size
 */
private fun check(tokens: List<Token>, index: Int, vararg expected: Set<TokenType>): Boolean {
    for((i, wanted) in expected.withIndex()) {
        if(index + i >= tokens.size)
            return false
        if(tokens[index + i].type !in wanted)
            return false
    }
    return true
}

/**
 * This function assumes that index - 1 is a valid index into the list if and only if index >= tokens.size
 */
private fun check(tokens: List<Token>, index: Int, vararg expected: TokenType): Boolean {
    for((i, wanted) in expected.withIndex()) {
        if(index + i >= tokens.size)
            return false
        if(tokens[index + i].type != wanted)
            return false
    }
    return true
}

data class Module(val name: String, val imports: List<String>, val children: List<ModuleElement>)

interface ModuleElement
interface InterfaceElement
interface ClassElement

data class Initializer(val statements: List<Statement>): ModuleElement, ClassElement
data class Interface(val annotations: List<String>, val name: String, val generics: GenericDeclaration?, val superTypes: List<Type>, val children: List<InterfaceElement>): ModuleElement
data class Class(val annotations: List<String>, val name: String, val generics: GenericDeclaration?, val superTypes: List<Type>, val children: List<ClassElement>): ModuleElement
data class Function(val annotations: List<String>, val name: String, val generics: GenericDeclaration?, val returnType: Type, val parameters: List<Pair<String, Type>>, val children: List<Statement>?): ModuleElement, InterfaceElement, ClassElement
data class Constructor(val annotations: List<String>, val parameters: List<Pair<String, Type>>, val callsSuper: Boolean, val parentConstructorParameters: List<Expression>, val children: List<Statement>?): ClassElement
data class Variable(val annotations: List<String>, val name: String, var type: Type?, val expression: Expression?, val getter: List<Statement>, val setter: Pair<String, List<Statement>>): ModuleElement, InterfaceElement, ClassElement
data class Value(val annotations: List<String>, val name: String, var type: Type?, val expression: Expression?, val getter: List<Statement>): ModuleElement, InterfaceElement, ClassElement

sealed class Statement
class LocalVariableStatement(val isValue: Boolean, val name: String, val type: Type?, val expression: Expression): Statement()
class IfElseStatement(val condition: Expression, thenBlock: List<Statement>, elseBlock: List<Statement>): Statement()
class ForStatement(val variableName: String, val iterable: Expression, statements: List<Statement>): Statement()
class WhileStatement(val condition: Expression, statements: List<Statement>): Statement()
class DoWhileStatement(val condition: Expression, statements: List<Statement>): Statement()
class AssignmentStatement(val operator: AssignmentOperator, val leftExpression: Expression, val rightExpression: Expression): Statement()
class ExpressionStatement(val expression: Expression): Statement()

enum class AssignmentOperator {
    ASSIGN,
    MULTIPLY_ASSIGN,
    DIVIDE_ASSIGN,
    MODULUS_ASSIGN,
    ADD_ASSIGN,
    SUBTRACT_ASSIGN,
    LEFT_SHIFT_ASSIGN,
    ARITHMETIC_RIGHT_SHIFT_ASSIGN,
    LOGICAL_RIGHT_SHIFT_ASSIGN,
    AND_ASSIGN,
    XOR_ASSIGN,
    OR_ASSIGN
}

data class Expression(val temp: Any?)
data class GenericDeclaration(val genericTypes: List<Pair<String, Type>>)

data class Generic(val generics: List<Type>) {
    override fun toString() = "<${generics.joinToString()}>"
}

sealed class Type(val name: String) {
    companion object {
        val ANY = ObjectType("Any", null)
        val UNIT = TupleType(emptyList())
    }
    
    override fun toString() = name
}

class ObjectType(name: String, val generic: Generic?): Type(if(generic == null) name else "$name$generic")
class TupleType(val types: List<Type>): Type("(${types.joinToString()})")
class FunctionType(val parameterTypes: List<Type>, val returnType: Type): Type("(${parameterTypes.joinToString()}) -> $returnType")
class IntersectionType(val types: List<Type>): Type("(${types.joinToString(" | ")})")
class UnionType(val types: List<Type>): Type("(${types.joinToString(" & ")})")