package dev.matthewwarren.kube.test

import dev.matthewwarren.kube.parser.Lexer
import java.io.File

fun lexerTest(): Boolean {
    try {
        Lexer.parseFile(File("testFiles/helloworld.kb"))
        Lexer.parseFile(File("testFiles/multilinestring.kb"))
    }
    catch(_: Throwable) {
        return false
    }
    
    try {
        Lexer.parseFile(File("testFiles/shouldfail.kb"))
        return false
    }
    catch(_: Throwable) {
        return true
    }
}