package dev.matthewwarren.kube.parser

import dev.matthewwarren.kube.exceptions.LexerException
import java.io.File

object Lexer {
    fun parseFile(file: File, ignoreSet: Set<TokenType> = setOf(TokenType.COMMENT, TokenType.WHITESPACE)): List<Token> {
        val text = file.readText()
        val tokens = mutableListOf<Token>()
        var index = 0
        while(index < text.length) {
            val lineNum = text.countWithIndex {(i, character) -> i < index && character == '\n'} + 1
            val column = index - text.lastIndexOf('\n', index - 1)
            val possibleMatches = TokenType.values().asSequence().map {
                val match = it.regex.find(text, index)
                if(match != null)
                    Pair(it, match)
                else
                    null
            }.filterNotNull().filter {it.second.range.first == index}.sortedByDescending {it.second.range.last}.toList()
            
            val (tokenType, match) = if(possibleMatches.isEmpty())
                throw LexerException("Invalid token on line $lineNum, column $column, in file ${file.name}")
            else
                possibleMatches[0]
            
            if(DEBUG_MODE) {
                possibleMatches.filter {it.second.range.last == possibleMatches[0].second.range.last}
                        .takeIf {it.size == 2 && it[1].first != TokenType.IDENTIFIER || it.size > 2}?.let {
                            System.err.println("Multiple token types found on line $lineNum, column $column, in file ${file.name}!")
                            it.forEach {System.err.println("\t${it.first}")}
                        }
            }
            if(tokenType !in ignoreSet)
                tokens.add(Token(file, lineNum, column, tokenType, match.value))
            index = match.range.last + 1
        }
        return tokens
    }
}

data class Token(val file: File, val line: Int, val column: Int, val type: TokenType, val text: String)

enum class TokenType(val regex: Regex) {
    WHITESPACE(Regex("""\s+""")),
    COMMENT(Regex("""#.*""")),
    NULL_LITERAL(Regex("""null""")),
    CHARACTER_LITERAL(Regex("""'([^'\\]|\\[btnr\\"']|\\u[a-fA-F\d]{4}|\\U[a-fA-F\d]{6})'""")),
    STRING_LITERAL(Regex(""""([^"\\]|\\[btnr\\"']|\\u[a-fA-F\d]{4}|\\U[a-fA-F\d]{6})*"""")),
    RAW_STRING_LITERAL(Regex("""""\".*?""\"""")),
    BOOLEAN_LITERAL(Regex("""true|false""")),
    FLOATING_POINT_LITERAL(Regex("""\d+\.\d+([eE][+-]?\d+)?|0[xX][a-fA-F\d]+\.[a-fA-F\d]+([pP][+-]?\d+)?""")),
    INTEGER_LITERAL(Regex("""\d(_+\d|\d)*|0[xX][a-fA-F\d](_+[a-fA-F\d]|[a-fA-F\d])*|0[bB][01](_+[01]|[01])*""")),
    NULLABLE(Regex("""\?""")),
    LOGICAL_OR(Regex("""\|\|""")),
    LOGICAL_AND(Regex("""&&""")),
    NOT_EQUALS(Regex("""!=""")),
    EQUALS(Regex("""==""")),
    NOT_IN(Regex("""!in""")),
    IN(Regex("""in""")),
    IS(Regex("""is""")),
    NOT_IS(Regex("""!is""")),
    HAS(Regex("""has""")),
    NOT_HAS(Regex("""!has""")),
    GRREATER_THAN_EQUAL(Regex(""">=""")),
    GREATER_THAN(Regex(""">""")),
    LESS_THAN_EQUAL(Regex("""<=""")),
    LESS_THAN(Regex("""<""")),
    RANGE_UNTIL(Regex("""\.\.<""")),
    RANGE_TO(Regex("""\.\.\.""")),
    BITWISE_OR_TYPE_UNION(Regex("""\|""")),
    BITWISE_XOR(Regex("""\^""")),
    BITWISE_AND_TYPE_INTERSECTION(Regex("""&""")),
    LOGICAL_RIGHT_SHIFT(Regex(""">>>""")),
    ARITHMETIC_RIGHT_SHIFT(Regex(""">>""")),
    LEFT_SHIFT(Regex("""<<""")),
    MINUS(Regex("""-""")),
    PLUS(Regex("""\+""")),
    DIVIDE_MODULUS(Regex("""\\%""")),
    MODULUS(Regex("""%""")),
    DIVIDE(Regex("""\\""")),
    MULTIPLY(Regex("""\*""")),
    ELVIS(Regex("""\?:""")),
    BITWISE_NOT(Regex("""~""")),
    LOGICAL_NOT(Regex("""!""")),
    DECREMENT(Regex("""--""")),
    INCREMENT(Regex("""\+\+""")),
    NON_NULL_ACCESS(Regex("""\.""")),
    NULL_SAFE_ACCESS(Regex("""\?\.""")),
    LEFT_ANGLE_BRACKET(Regex("""<""")),
    RIGHT_ANGLE_BRACKET(Regex(""">""")),
    COMMA(Regex(""",""")),
    COLON(Regex(""":""")),
    ELSE(Regex("""else""")),
    LEFT_CURLY_BRACKET(Regex("""\{""")),
    RIGHT_CURLY_BRACKET(Regex("""}""")),
    LEFT_PARENTHESIS(Regex("""\(""")),
    RIGHT_PARENTHESIS(Regex("""\)""")),
    RIGHT_ARROW(Regex("""->""")),
    IF(Regex("""if""")),
    TO(Regex("""to""")),
    LEFT_SQUARE_BRACKET(Regex("""\[""")),
    RIGHT_SQUARE_BRACKET(Regex("""]""")),
    ASSIGN(Regex("""=""")),
    MULTIPLY_ASSIGN(Regex("""\*=""")),
    DIVIDE_ASSIGN(Regex("""//=""")),
    MODULUS_ASSIGN(Regex("""%=""")),
    ADD_ASSIGN(Regex("""\+=""")),
    SUBTRACT_ASSIGN(Regex("""-=""")),
    LEFT_SHIFT_ASSIGN(Regex("""<<=""")),
    ARITHMETIC_RIGHT_SHIFT_ASSIGN(Regex(""">>=""")),
    LOGICAL_RIGHT_SHIFT_ASSIGN(Regex(""">>>=""")),
    BITWISE_AND_ASSIGN(Regex("""&=""")),
    BITWISE_XOR_ASSIGN(Regex("""\^=""")),
    BITWISE_OR_ASSIGN(Regex("""\|=""")),
    DO(Regex("""do""")),
    WHILE(Regex("""while""")),
    FOR(Regex("""for""")),
    CONSTRUCTOR(Regex("""constructor""")),
    INIT(Regex("""init""")),
    VAR(Regex("""var""")),
    VAL(Regex("""val""")),
    FUN(Regex("""fun""")),
    SET(Regex("""set""")),
    GET(Regex("""get""")),
    RETURN(Regex("""return""")),
    THIS(Regex("""this""")),
    SUPER(Regex("""super""")),
    CLASS(Regex("""class""")),
    INTERFACE(Regex("""interface""")),
    IMPORT(Regex("""import""")),
    MODULE(Regex("""module""")),
    ANNOTATION(Regex("""@[a-zA-Z_][a-zA-Z\d_]*""")),
    // identifier goes last so that keywords take precedence
    IDENTIFIER(Regex("""[a-zA-Z_][a-zA-Z\d_]*"""))
}

/*class CharacterLiteralToken(line: Int, column: Int, text: String): Token(line, column, text) {
    fun toCodePoint(): Int {
        if(text[0] != '\\') {
            // It's not an escape sequence and so it MUST contain a single code point
            return text.codePointAt(0)
        }
        else {
            if(text.length < 2)
                throw IllegalStateException("Invalid escape sequence in character literal on line $line, column: $column")
            // It's an escape sequence
            // Check escape sequence type
            return when(text[1]) {
                'b' -> "\b".codePointAt(0)
                't' -> "\t".codePointAt(0)
                'n' -> "\n".codePointAt(0)
                'r' -> "\r".codePointAt(0)
                '"' -> "\"".codePointAt(0)
                '\'' -> "\'".codePointAt(0)
                '\\' -> "\\".codePointAt(0)
                'u' -> {
                    if(text.length < 6)
                        throw IllegalStateException("Invalid escape sequence in character literal on line $line, column: $column")
                    var codePoint = 0
                    for(i in 2..5)
                        codePoint = codePoint.shl(4).or(hexToInt(text[i]))
                    codePoint
                }
                'U' -> {
                    if(text.length < 8)
                        throw IllegalStateException("Invalid escape sequence in character literal on line $line, column: $column")
                    var codePoint = 0
                    for(i in 2..7)
                        codePoint = codePoint.shl(4).or(hexToInt(text[i]))
                    codePoint
                }
                else -> throw IllegalStateException("Invalid escape sequence in character literal on line $line, column: $column")
            }
        }
    }
}

class StringLiteralToken(line: Int, column: Int, text: String): Token(line, column, text) {
    fun toCodePoints(): IntArray {
        val codePoints = mutableListOf<Int>()
        var index = 0
        while(index < text.length) {
            if(text[index] != '\\') {
                // It's not an escape sequence and so we can directly get the code point
                val codePoint = text.codePointAt(index)
                codePoints.add(codePoint)
                if(Character.isSupplementaryCodePoint(codePoint))
                    index++
            }
            else {
                if(index + 1 >= text.length)
                    throw IllegalStateException("Invalid escape sequence in string literal on line $line, column: $column")
                // It's an escape sequence so we need to parse it
                // Check escape sequence type
                val codePoint = when(text[index + 1]) {
                    'b' -> "\b".codePointAt(0)
                    't' -> "\t".codePointAt(0)
                    'n' -> "\n".codePointAt(0)
                    'r' -> "\r".codePointAt(0)
                    '"' -> "\"".codePointAt(0)
                    '\'' -> "\'".codePointAt(0)
                    '\\' -> "\\".codePointAt(0)
                    'u' -> {
                        if(index + 5 >= text.length)
                            throw IllegalStateException("Invalid escape sequence in string literal on line $line, column: $column")
                        var codepoint = 0
                        for(i in 2..5)
                            codepoint = codepoint.shl(4).or(hexToInt(text[index + i]))
                        index += 4
                        codepoint
                    }
                    'U' -> {
                        if(index + 7 >= text.length)
                            throw IllegalStateException("Invalid escape sequence in string literal on line $line, column: $column")
                        var codepoint = 0
                        for(i in 2..7)
                            codepoint = codepoint.shl(4).or(hexToInt(text[index + i]))
                        index += 6
                        codepoint
                    }
                    else -> throw IllegalStateException("Invalid escape sequence in string literal on line $line, column: $column")
                }
                index++
                codePoints.add(codePoint)
            }
            index++
        }
        return codePoints.toIntArray()
    }
}

class BooleanLiteralToken(line: Int, column: Int, text: String): Token(line, column, text) {
    fun toBoolean() = when(text) {
        "true" -> true
        "false" -> false
        else -> throw IllegalStateException("Invalid boolean literal on line $line, column $column")
    }
}

class FloatingPointLiteralToken(line: Int, column: Int, text: String): Token(line, column, text) {
    fun toFloat() = text.toFloat()
    fun toDouble() = text.toDouble()
}

class IntegerLiteralToken(line: Int, column: Int, text: String): Token(line, column, text) {
    fun toByte(): Byte {
        if(text.startsWith("0x") || text.startsWith("0X"))
            return text.substring(2).toByte(16)
        if(text.startsWith("0b") || text.startsWith("0B"))
            return text.substring(2).toByte(2)
        return text.toByte()
    }
    
    fun toUnsignedByte(): UByte {
        if(text.startsWith("0x") || text.startsWith("0X"))
            return text.substring(2).toUByte(16)
        if(text.startsWith("0b") || text.startsWith("0B"))
            return text.substring(2).toUByte(2)
        return text.toUByte()
    }
    
    fun toShort(): Short {
        if(text.startsWith("0x") || text.startsWith("0X"))
            return text.substring(2).toShort(16)
        if(text.startsWith("0b") || text.startsWith("0B"))
            return text.substring(2).toShort(2)
        return text.toShort()
    }
    
    fun toUnsignedShort(): UShort {
        if(text.startsWith("0x") || text.startsWith("0X"))
            return text.substring(2).toUShort(16)
        if(text.startsWith("0b") || text.startsWith("0B"))
            return text.substring(2).toUShort(2)
        return text.toUShort()
    }
    
    fun toInt(): Int {
        if(text.startsWith("0x") || text.startsWith("0X"))
            return text.substring(2).toInt(16)
        if(text.startsWith("0b") || text.startsWith("0B"))
            return text.substring(2).toInt(2)
        return text.toInt()
    }
    
    fun toUnsignedInt(): UInt {
        if(text.startsWith("0x") || text.startsWith("0X"))
            return text.substring(2).toUInt(16)
        if(text.startsWith("0b") || text.startsWith("0B"))
            return text.substring(2).toUInt(2)
        return text.toUInt()
    }
    
    fun toLong(): Long {
        if(text.startsWith("0x") || text.startsWith("0X"))
            return text.substring(2).toLong(16)
        if(text.startsWith("0b") || text.startsWith("0B"))
            return text.substring(2).toLong(2)
        return text.toLong()
    }
    
    fun toUnsignedLong(): ULong {
        if(text.startsWith("0x") || text.startsWith("0X"))
            return text.substring(2).toULong(16)
        if(text.startsWith("0b") || text.startsWith("0B"))
            return text.substring(2).toULong(2)
        return text.toULong()
    }
}*/