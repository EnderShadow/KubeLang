package dev.matthewwarren.kube.exceptions

class LexerException(message: String?): RuntimeException(message) {
    constructor(message: String?, cause: Throwable?): this(message) {
        initCause(cause)
    }
    
    constructor(cause: Throwable?): this(cause?.toString(), cause)
}