package dev.matthewwarren.kube.ast.simple

import org.antlr.v4.runtime.tree.TerminalNode

internal fun List<TerminalNode>.toStringPair(offset: Int = 0): Pair<String?, String> {
    return if(size == offset + 1)
        Pair(null, this[offset].text)
    else if(size == offset + 2)
        Pair(this[offset].text, this[offset + 1].text)
    else
        throw IllegalStateException("Incorrect call to List<TerminalNode>.toStringPair, not enough elements")
}