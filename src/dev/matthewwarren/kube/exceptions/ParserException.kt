package dev.matthewwarren.kube.exceptions

class ParserException(message: String?): RuntimeException(message) {
    constructor(message: String?, cause: Throwable?): this(message) {
        initCause(cause)
    }
    
    constructor(cause: Throwable?): this(cause?.toString(), cause)
}

class SyntaxException(message: String?): RuntimeException(message) {
    constructor(message: String?, cause: Throwable?): this(message) {
        initCause(cause)
    }
    
    constructor(cause: Throwable?): this(cause?.toString(), cause)
}

class LexicalException(message: String?): RuntimeException(message) {
    constructor(message: String?, cause: Throwable?): this(message) {
        initCause(cause)
    }
    
    constructor(cause: Throwable?): this(cause?.toString(), cause)
}