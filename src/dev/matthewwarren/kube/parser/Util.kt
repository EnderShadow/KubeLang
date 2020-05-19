package dev.matthewwarren.kube.parser

const val DEBUG_MODE = true

fun hexToInt(hexChar: Char) = when(hexChar) {
    in '0'..'9' -> hexChar - '0'
    in 'a'..'f' -> hexChar - 'a' + 10
    in 'A'..'F' -> hexChar - 'A' + 10
    else -> throw IllegalArgumentException("Invalid hex character: $hexChar")
}

inline fun String.countWithIndex(predicate: (IndexedValue<Char>) -> Boolean) = withIndex().count(predicate)