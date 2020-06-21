package dev.matthewwarren.kube.ast.simple

interface ASTNode

class ASTFile(val modules: List<ASTModule>): ASTNode
class ASTModule: ASTNode