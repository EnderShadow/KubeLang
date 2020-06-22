package dev.matthewwarren.kube.ast.simple

interface ASTNode
interface ASTModuleContentNode: ASTNode

sealed class Annotatable {
    val annotations = mutableListOf<Pair<String?, String>>()
}

class ASTFile(val modules: List<ASTModule>): ASTNode
class ASTModule(val name: String, val imports: List<String>, val children: List<ASTModuleContentNode>): ASTNode

class ASTInitializer(val statements: List<ASTStatement>): ASTModuleContentNode
class ASTTypeAlias(val newName: String, val oldType: ASTType): ASTModuleContentNode
class ASTAlias(val newName: String, val oldName: Pair<String?, String>): ASTModuleContentNode

class ASTInterface: ASTModuleContentNode, Annotatable()
class ASTClass: ASTModuleContentNode, Annotatable()
class ASTObject: ASTModuleContentNode, Annotatable()
class ASTEnum: ASTModuleContentNode, Annotatable()
class ASTAnnotation: ASTModuleContentNode, Annotatable()
class ASTFunction: ASTModuleContentNode, Annotatable()
class ASTVariable: ASTModuleContentNode, Annotatable()
class ASTValue: ASTModuleContentNode, Annotatable()

class ASTType: ASTNode
class ASTStatement: ASTNode