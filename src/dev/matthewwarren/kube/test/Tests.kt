package dev.matthewwarren.kube.test

fun main() {
    println("Running tests")
    runTest("Lexer", ::lexerTest)
    runTest("Parser", ::parserTest)
    println("Tests completed")
}

inline fun runTest(testName: String, testFunction: () -> Boolean) {
    if(testFunction())
        println("$testName test passed")
    else
        println("$testName test failed")
}