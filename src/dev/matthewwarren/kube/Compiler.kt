package dev.matthewwarren.kube

import dev.matthewwarren.kube.antlr.KubeLexer
import dev.matthewwarren.kube.antlr.KubeParser
import dev.matthewwarren.kube.ast.simple.ASTFile
import dev.matthewwarren.kube.ast.simple.KubeVisitor
import dev.matthewwarren.kube.ast.simple.ASTModule
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main(args: Array<String>) {
    // TODO parse args
    
    // read files into a basic AST
    val files = args
    val modules = mutableListOf<ASTModule>()
    for(file in files) {
        val lexer = KubeLexer(CharStreams.fromFileName(file))
        val tokens = CommonTokenStream(lexer)
        val parser = KubeParser(tokens)
        val tree = parser.file()
        modules.addAll((KubeVisitor().visitFile(tree)).modules)
    }
    
    // Convert AST into a more concrete form
}