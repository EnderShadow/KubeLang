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
                TokenType.FUN -> parseFunction(tokens, index, visibility)
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
    val statements = mutableListOf<Statement>()
    var index = startIndex + 2
    while(!check(tokens, index, TokenType.RIGHT_CURLY_BRACKET)) {
        val (statement, newIndex) = parseStatement(tokens, index)
        statements.add(statement)
        index = newIndex
    }
    expect(tokens, index, TokenType.RIGHT_CURLY_BRACKET)
    return Pair(Initializer(statements), index + 1)
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
        val (typeList, newIndex) = parseTypeList(tokens, index + 1)
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
        val (typeList, newIndex) = parseTypeList(tokens, index + 1)
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

fun parseFunction(tokens: List<Token>, startIndex: Int, visibility: Visibility): Pair<Function, Int> {
    TODO()
}

fun parseValue(tokens: List<Token>, startIndex: Int, visibility: Visibility): Pair<Value, Int> {
    TODO()
}

fun parseVariable(tokens: List<Token>, startIndex: Int, visibility: Visibility): Pair<Variable, Int> {
    TODO()
}

fun parseStatement(tokens: List<Token>, startIndex: Int): Pair<Statement, Int> {
    TODO()
}

fun parseGenericDeclaration(tokens: List<Token>, startIndex: Int): Pair<GenericDeclaration, Int> {
    TODO()
}

fun parseTypeList(tokens: List<Token>, startIndex: Int): Pair<List<Type>, Int> {
    TODO()
}

fun parseInterfaceContents(tokens: List<Token>, startIndex: Int): Pair<List<InterfaceElement>, Int> {
    TODO()
}

fun parseClassContents(tokens: List<Token>, startIndex: Int): Pair<List<ClassElement>, Int> {
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

data class Function(val visibility: Visibility, val name: String, val generics: GenericDeclaration?, val returnType: Type, val parameters: List<Pair<String, Type>>, val children: List<Statement>): ModuleElement, InterfaceElement, ClassElement

data class Variable(val visibility: Visibility, val name: String, var type: Type?, val expression: Expression?, val getter: List<Statement>, val setter: List<Statement>): ModuleElement, InterfaceElement, ClassElement

data class Value(val visibility: Visibility, val name: String, var type: Type?, val expression: Expression?, val getter: List<Statement>): ModuleElement, InterfaceElement, ClassElement

enum class Visibility {
    PUBLIC, INTERNAL, PRIVATE;
    
    companion object {
        val DEFAULT = PUBLIC
    }
}

data class Statement(var expression: Expression)

data class Expression(val temp: Any?)

data class GenericDeclaration(val temp: Any?)

data class Type(val temp: Any?)