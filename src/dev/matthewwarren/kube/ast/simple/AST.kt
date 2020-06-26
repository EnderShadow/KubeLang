package dev.matthewwarren.kube.ast.simple

interface ASTNode
interface ASTModuleContent: ASTNode
interface ASTInterfaceContent: ASTNode

sealed class Annotatable {
    val annotations = mutableListOf<ASTAnnotation>()
}

class ASTFile(val modules: List<ASTModule>): ASTNode
class ASTModule(val name: String, val imports: List<String>, val children: List<ASTModuleContent>): ASTNode

class ASTInitializer(val statements: List<ASTStatement>): ASTModuleContent
class ASTTypeAlias(val newName: String, val oldType: ASTType): ASTModuleContent
class ASTAlias(val newName: String, val oldName: Pair<String?, String>): ASTModuleContent

class ASTInterface(val name: String, val genericDeclaration: ASTGenericDeclaration?, val superType: ASTType?, val children: List<ASTInterfaceContent>): ASTModuleContent, Annotatable()
class ASTClass: ASTModuleContent, Annotatable()
class ASTObject: ASTModuleContent, Annotatable()
class ASTEnum: ASTModuleContent, Annotatable()
class ASTFunction: ASTModuleContent, Annotatable()
class ASTVariable: ASTModuleContent, Annotatable()
class ASTValue: ASTModuleContent, Annotatable()

class ASTAnnotation(module: String?, name: String, parameters: List<Pair<String?, ASTExpression>>): ASTNode

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