package dev.matthewwarren.kube.test

import dev.matthewwarren.kube.parser.Class
import dev.matthewwarren.kube.parser.Interface
import dev.matthewwarren.kube.parser.Parser
import dev.matthewwarren.kube.parser.Visibility
import java.io.File

fun parserTest(): Boolean {
    try {
        val modules = Parser.parseFiles(listOf(File("testFiles/basicParserTest.kb")))
        val module = modules[0]
        if(module.name != "ParserTest")
            return false
        if(module.imports[0] != "IO" || module.imports[1] != "Dummy")
            return false
        val child0 = module.children[0]
        if(child0 !is Interface || child0.visibility != Visibility.PUBLIC || child0.name != "Alice")
            return false
        val child1 = module.children[1]
        if(child1 !is Class || child1.visibility != Visibility.PRIVATE || child1.name != "Bob")
            return false
        val child2 = module.children[2]
        if(child2 !is Class || child2.visibility != Visibility.INTERNAL || child2.name != "Eve")
            return false
        
        return true
    }
    catch(_: Throwable) {
        return false
    }
}