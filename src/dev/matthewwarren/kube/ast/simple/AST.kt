package dev.matthewwarren.kube.ast.simple

interface ASTNode
interface ASTModuleContent: ASTNode
interface ASTInterfaceContent: ASTNode
interface ASTClassContent: ASTNode
interface ASTObjectContent: ASTNode
interface ASTEnumContent: ASTNode

sealed class Annotatable {
    val annotations = mutableListOf<ASTAnnotation>()
}

class ASTFile(val modules: List<ASTModule>): ASTNode
class ASTModule(val name: String, val imports: List<String>, val children: List<ASTModuleContent>): ASTNode

class ASTTypeAlias(val newName: String, val oldType: ASTType): ASTModuleContent
class ASTAlias(val newName: String, val oldName: Pair<String?, String>): ASTModuleContent

class ASTInterface(val name: String, val genericDeclaration: ASTGenericDeclaration?, val interfaces: ASTType?, val children: List<ASTInterfaceContent>): ASTModuleContent, Annotatable()
class ASTClass(val name: String, val genericDeclaration: ASTGenericDeclaration?, val primaryConstructor: List<ASTConstructorParameter>, val interfaces: ASTType?, val delegates: List<ASTExpression>, val children: List<ASTClassContent>): ASTModuleContent, Annotatable()
class ASTObject(val name: String, val interfaces: ASTType?, val delegates: List<ASTExpression>, val children: List<ASTObjectContent>): ASTModuleContent, Annotatable()
class ASTEnum(val name: String, val primaryConstructor: List<ASTConstructorParameter>, val interfaces: ASTType?, val valueList: List<ASTEnumValue>, val elements: List<ASTEnumContent>): ASTModuleContent, Annotatable()
class ASTFunction(val name: String, val genericDeclaration: ASTGenericDeclaration?, val parameters: List<ASTParameter>, val returnType: ASTType?, val body: List<ASTStatement>): ASTModuleContent, ASTClassContent, ASTObjectContent, ASTEnumContent, Annotatable()
class ASTVariable(val name: String, val type: ASTType?, val expression: ASTExpression?, val delegated: Boolean, val getter: ASTGetter?, val setter: ASTSetter?): ASTModuleContent, ASTClassContent, ASTObjectContent, Annotatable()
class ASTValue(val name: String, val type: ASTType?, val expression: ASTExpression?, val delegated: Boolean, val getter: ASTGetter?): ASTModuleContent, ASTClassContent, ASTObjectContent, ASTEnumContent, Annotatable()
class ASTConstructor(val parameters: List<ASTParameter>, val parentConstructorParameters: List<Pair<String?, ASTExpression>>, val body: List<ASTStatement>): ASTClassContent, Annotatable()

class ASTVariableDeclaration(val name: String, val type: ASTType?): ASTInterfaceContent, Annotatable()
class ASTValueDeclaration(val name: String, val type: ASTType?): ASTInterfaceContent, Annotatable()
class ASTFunctionDeclaration(val name: String, val genericDeclaration: ASTGenericDeclaration?, val parameters: List<ASTParameter>, val returnType: ASTType?): ASTInterfaceContent, Annotatable()

class ASTInitializer(val statements: List<ASTStatement>): ASTModuleContent, ASTClassContent, ASTObjectContent, ASTEnumContent
class ASTFinalizer(val statements: List<ASTStatement>): ASTClassContent, ASTObjectContent

class ASTEnumValue(val name: String, val parameters: List<Pair<String?, ASTExpression>>): ASTNode

class ASTAnnotation(val module: String?, val name: String, val parameters: List<Pair<String?, ASTExpression>>): ASTNode

class ASTParameter(val name: String, val type: ASTType, val expression: ASTExpression?): ASTNode
class ASTConstructorParameter(val variableType: VariableType, val name: String, val type: ASTType, val expression: ASTExpression?): ASTNode {
    constructor(variableType: VariableType, parameter: ASTParameter): this(variableType, parameter.name, parameter.type, parameter.expression)
}

class ASTGetter(val statements: List<ASTStatement>): ASTNode
class ASTSetter(val parameter: String, val statements: List<ASTStatement>): ASTNode

class ASTGenericDeclaration(val typeMaps: List<Pair<String, ASTType?>>): ASTNode
class ASTGeneric(val types: List<ASTType>): ASTNode

class ASTStatement: ASTNode
class ASTExpression: ASTNode

sealed class ASTType: ASTNode
class ASTUnionType(val intersectionTypes: List<ASTIntersectionType>): ASTType()
class ASTIntersectionType(val primaryTypes: List<ASTPrimaryType>): ASTType()
sealed class ASTPrimaryType: ASTType()
class ASTSimpleType(val module: String?, val name: String, val generic: ASTGeneric?): ASTPrimaryType()
class ASTFunctionType(val parameterTypes: List<ASTType>, val returnType: ASTType): ASTPrimaryType()
class ASTParenthesizedType(val type: ASTType): ASTPrimaryType()

enum class VariableType {
    VARIABLE,
    VALUE,
    CONSTRUCTOR_ONLY
}