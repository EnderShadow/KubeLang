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

fun parseModule(tokens: List<Token>, startIndex: Int): Pair<Module, Int> {
    expect(tokens, startIndex, TokenType.MODULE, TokenType.IDENTIFIER, TokenType.LEFT_CURLY_BRACKET)
    
    val name = tokens[startIndex + 1].text
    
    val (imports, contentIndex) = parseImports(tokens, startIndex + 3)
    val (contents, endIndex) = parseModuleContents(tokens, contentIndex)
    
    expect(tokens, endIndex, TokenType.RIGHT_CURLY_BRACKET)
    return Pair(Module(name, imports, contents), endIndex + 1)
}

fun parseImports(tokens: List<Token>, startIndex: Int): Pair<List<String>, Int> {
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

fun parseModuleContents(tokens: List<Token>, startIndex: Int): Pair<List<ModuleElement>, Int> {
    val moduleContents = mutableListOf<ModuleElement>()
    var index = startIndex
    
    while(!check(tokens, index, TokenType.RIGHT_CURLY_BRACKET)) {
        if(check(tokens, index, TokenType.INIT)) {
            val (initializer, newIndex) = parseInitializer(tokens, index)
            moduleContents.add(initializer)
            index = newIndex
        }
        else {
            var visibility = Visibility.DEFAULT
            if(check(tokens, index, setOf(TokenType.PRIVATE, TokenType.PUBLIC, TokenType.INTERNAL))) {
                visibility = Visibility.valueOf(tokens[index].type.name)
                index++
            }
            expect(tokens, index, setOf(TokenType.INTERFACE, TokenType.CLASS, TokenType.FUN, TokenType.VAL, TokenType.VAR))
            val (moduleContent, newIndex) = when(tokens[index].type) {
                TokenType.INTERFACE -> parseInterface(tokens, index, visibility)
                TokenType.CLASS -> parseClass(tokens, index, visibility)
                TokenType.FUN -> parseFunction(tokens, index, visibility, true)
                TokenType.VAL -> parseValue(tokens, index, visibility)
                TokenType.VAR -> parseVariable(tokens, index, visibility)
                else -> throw IllegalStateException("This cannot occur")
            }
            moduleContents.add(moduleContent)
            index = newIndex
        }
    }
    
    return Pair(moduleContents, index)
}

fun parseInitializer(tokens: List<Token>, startIndex: Int): Pair<Initializer, Int> {
    expect(tokens, startIndex, TokenType.INIT, TokenType.LEFT_CURLY_BRACKET)
    val (statements, newIndex) = parseStatements(tokens, startIndex + 2)
    expect(tokens, newIndex, TokenType.RIGHT_CURLY_BRACKET)
    return Pair(Initializer(statements), newIndex + 1)
}

fun parseInterface(tokens: List<Token>, startIndex: Int, visibility: Visibility): Pair<Interface, Int> {
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
    
    return Pair(Interface(visibility, name, genericDeclaration, superTypes, interfaceContents), index)
}

fun parseClass(tokens: List<Token>, startIndex: Int, visibility: Visibility): Pair<Class, Int> {
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
    
    return Pair(Class(visibility, name, genericDeclaration, superTypes, classContents), index)
}

fun parseFunction(tokens: List<Token>, startIndex: Int, visibility: Visibility, requiresBody: Boolean): Pair<Function, Int> {
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
        Type.Tuple0
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
    
    val function = Function(visibility, name, genericDeclaration, returnType, parameters, body)
    return Pair(function, index)
}

fun parseValue(tokens: List<Token>, startIndex: Int, visibility: Visibility): Pair<Value, Int> {
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
    
    return Pair(Value(visibility, name, type, expression, getter), index)
}

fun parseVariable(tokens: List<Token>, startIndex: Int, visibility: Visibility): Pair<Variable, Int> {
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
    
    return Pair(Variable(visibility, name, type, expression, getter, setter), index)
}

fun parseStatements(tokens: List<Token>, startIndex: Int): Pair<List<Statement>, Int> {
    val statements = mutableListOf<Statement>()
    var index = startIndex
    while(!check(tokens, index, TokenType.RIGHT_CURLY_BRACKET)) {
        val (statement, newIndex) = parseStatement(tokens, index)
        statements.add(statement)
        index = newIndex
    }
    return Pair(statements, index)
}

fun parseStatement(tokens: List<Token>, startIndex: Int): Pair<Statement, Int> {
    TODO()
}

fun parseExpression(tokens: List<Token>, startIndex: Int): Pair<Expression, Int> {
    TODO()
}

fun parseGenericDeclaration(tokens: List<Token>, startIndex: Int): Pair<GenericDeclaration, Int> {
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

fun parseTypeList(tokens: List<Token>, startIndex: Int): Pair<List<Type>, Int> {
    val types = mutableListOf<Type>()
    var index = startIndex
    do {
        val (type, newIndex) = parseType(tokens, index + 1)
        types.add(type)
        index = newIndex
    } while(check(tokens, index, TokenType.COMMA))
    
    return Pair(types, index)
}

fun parseInterfaceContents(tokens: List<Token>, startIndex: Int): Pair<List<InterfaceElement>, Int> {
    TODO()
}

fun parseClassContents(tokens: List<Token>, startIndex: Int): Pair<List<ClassElement>, Int> {
    TODO()
}

fun parseParameter(tokens: List<Token>, startIndex: Int): Pair<Pair<String, Type>, Int> {
    expect(tokens, startIndex, TokenType.IDENTIFIER, TokenType.COLON)
    val name = tokens[startIndex].text
    val (type, index) = parseType(tokens, startIndex + 2)
    return Pair(Pair(name, type), index)
}

fun parseType(tokens: List<Token>, startIndex: Int): Pair<Type, Int> {
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

data class Interface(val visibility: Visibility, val name: String, val generics: GenericDeclaration?, val superTypes: List<Type>, val children: List<InterfaceElement>): ModuleElement

data class Class(val visibility: Visibility, val name: String, val generics: GenericDeclaration?, val superTypes: List<Type>, val children: List<ClassElement>): ModuleElement

data class Function(val visibility: Visibility, val name: String, val generics: GenericDeclaration?, val returnType: Type, val parameters: List<Pair<String, Type>>, val children: List<Statement>?): ModuleElement, InterfaceElement, ClassElement

data class Variable(val visibility: Visibility, val name: String, var type: Type?, val expression: Expression?, val getter: List<Statement>, val setter: Pair<String, List<Statement>>): ModuleElement, InterfaceElement, ClassElement

data class Value(val visibility: Visibility, val name: String, var type: Type?, val expression: Expression?, val getter: List<Statement>): ModuleElement, InterfaceElement, ClassElement

enum class Visibility {
    PUBLIC, INTERNAL, PRIVATE;
    
    companion object {
        val DEFAULT = PUBLIC
    }
}

data class Statement(var expression: Expression)
data class Expression(val temp: Any?)
data class GenericDeclaration(val genericTypes: List<Pair<String, Type>>)

data class Generic(val generics: List<Type>) {
    override fun toString() = "<${generics.joinToString()}>"
}

sealed class Type(val name: String) {
    companion object {
        val ANY = ObjectType("Any", null)
        val Tuple0 = TupleType(emptyList())
    }
    
    override fun toString() = name
}

class ObjectType(name: String, val generic: Generic?): Type(if(generic == null) name else "$name$generic")
class TupleType(val types: List<Type>): Type("(${types.joinToString()})")
class FunctionType(val parameterTypes: List<Type>, val returnType: Type): Type("(${parameterTypes.joinToString()}) -> $returnType")
class IntersectionType(val types: List<Type>): Type("(${types.joinToString(" | ")})")
class UnionType(val types: List<Type>): Type("(${types.joinToString(" & ")})")