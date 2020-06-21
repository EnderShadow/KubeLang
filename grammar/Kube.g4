grammar Kube;

file
	:	module*
	;

module
	:	'module' Identifier '{' importExpr* moduleContent* '}'
	;

importExpr
	:	'import' Identifier
	;

moduleContent
	:	initializer
	|	typeAlias
	|	alias
	|	annotation1* interface0
	|	annotation1* class0
	|   annotation1* object0
	|	annotation1* enum0
	|	annotation1* annotation0
	|	annotation1* function
	|	annotation1* variable
	|	annotation1* value
	;

alias
	:	'alias' Identifier '=' Identifier ('.' Identifier)?
	;

typeAlias
	:	'typeAlias' Identifier '=' type
	;

interface0
	:	'interface' Identifier genericDeclaration? (':' type)? ('{' interfaceElement* '}')?
	;

interfaceElement
	:	annotation1* variableDeclaration
	|	annotation1* valueDeclaration
	|	annotation1* functionDeclaration
	;

class0
	:	'class' Identifier genericDeclaration? primaryConstructor? (':' type)? (By expression (',' expression)*)? ('{' classElement* '}')?
	;

classElement
	:	annotation1* variable
	|	annotation1* value
	|	annotation1* function
	|	annotation1* constructor
	|	initializer
	|   finalizer
	;

object0
    :   'object' Identifier (':' type)? (By expression (',' expression)*)? ('{' objectElement* '}')
    ;

objectElement
	:	annotation1* variable
	|	annotation1* value
	|	annotation1* function
	|	initializer
	|   finalizer
	;

enum0
	:	'enum' Identifier primaryConstructor? (':' type)? '{' enumList ','? '}'
	|	'enum' Identifier primaryConstructor? (':' type)? '{' enumList ';' enumElement* '}'
	;

annotation0
	:	'annotation' Identifier
	;

annotation1
	:	'@' Identifier ('.' Identifier)?
	;

enumList
	:	enumValue (',' enumValue)*
	;

enumValue
	:	Identifier ('(' ')')?
	|	Identifier '(' parameterExpression (',' parameterExpression)* ')'
	;

parameterExpression
	:	(Identifier '=')? expression
	;

enumElement
	:	annotation1* value
	|	annotation1* function
	|	initializer
	;

variable
	:	variableDeclaration ('=' expression)? setter getter
	|	variableDeclaration ('=' expression)? getter? setter?
	|	variableDeclaration By expression
	;

variableDeclaration
	:	Var Identifier (':' type)?
	;

value
	:	valueDeclaration ('=' expression)? getter?
	|	valueDeclaration By expression
	;

valueDeclaration
	:	Val Identifier (':' type)?
	;

getter
	:	'get' '(' ')' '{' statement+ '}'
	;

setter
	:	'set' '(' Identifier ')' '{' statement+ '}'
	;

function
	:	functionDeclaration '{' statement* '}'
	;

functionDeclaration
	:	'fun' Identifier genericDeclaration? '(' ')' (':' type)?
	|	'fun' Identifier genericDeclaration? '(' parameter (',' parameter)* ')' (':' type)?
	;

parameter
	:	Identifier ':' type ('=' expression)?
	;

initializer
	:	'init' '{' statement* '}'
	;

finalizer
    :   'finalize' '{' statement* '}'
    ;

primaryConstructor
	:	'(' ')'
	|	'(' constructorParameter (',' constructorParameter)* ')'
	;

constructorParameter
	:	(Var | Val)? parameter
	;

constructor
	:	'constructor' '(' ')' constructorCall? '{' statement* '}'
	|	'constructor' '(' parameter (',' parameter)* ')' constructorCall? '{' statement* '}'
	;

constructorCall
	:	':' 'this' '(' ')'
	|	':' 'this' '(' parameterExpression (',' parameterExpression)* ')'
	;

statement
	:	variable
	|	value
	|	ifStatement
	|   whenStatement
	|	forLoop
	|	whileLoop
	|	doWhileLoop
	|	expression assignmentOperator expression
	|	expression
	;

ifStatement
	:	'if' '(' expression ')' statement elseBlock?
	|	'if' '(' expression ')' '{' statement* '}' elseBlock?
	;

elseBlock
	:	'else' statement
	|	'else' '{' statement* '}'
	;

whenStatement
    :   'when' '(' (valueDeclaration '=')? expression ')' '{' whenStatementEntry* '}'
    ;

whenStatementEntry
    :   whenCondition (',' whenCondition)* '->' statement
    |   whenCondition (',' whenCondition)* '->' '{' statement* '}'
    |   'else' '->' statement
    |   'else' '->' '{' statement* '}'
    ;

whenCondition
    :   expression
    |   rangeTest
    |   typeTest
    |   memberTest
    ;

rangeTest
    :   inOperator expression
    ;

typeTest
    :   isOperator type
    ;

memberTest
    :   hasOperator Identifier ':' type
    ;

forLoop
	:	'for' '(' Identifier 'in' expression ')' statement
	|	'for' '(' Identifier 'in' expression ')' '{' statement* '}'
	;

whileLoop
	:	'while' '(' expression ')' statement
	|	'while' '(' expression ')' '{' statement* '}'
	;

doWhileLoop
	:	'do' statement 'while' '(' expression ')'
	|	'do' '{' statement* '}' 'while' '(' expression ')'
	;

assignmentOperator
	:	'='
	|	'*='
	|	'/='
	|	'%='
	|	'+='
	|	'-='
	|	'<<='
	|	'>>='
	|	'>>>='
	|	'&='
	|	'^='
	|	'|='
	;

expression
	:	logicalOrExpression
	;

logicalOrExpression
	:	logicalAndExpression ('||' logicalAndExpression)*
	;

logicalAndExpression
	:	equalityExpression ('&&' equalityExpression)*
	;

equalityExpression
	:	comparisonExpression (equalityOperator comparisonExpression)*
	;

comparisonExpression
	:	infixOperation (relationalOperator infixOperation)?
	;

infixOperation
    :   elvisExpression (inOperator elvisExpression | isOperator type | hasOperator Identifier ':' type)*
    ;

elvisExpression
	:	rangeExpression ('?:' rangeExpression)*
	;

rangeExpression
	:	bitwiseExpression (rangeOperator bitwiseExpression)*
	;

bitwiseExpression
	:	additiveExpression (bitwiseOperator additiveExpression)*
	;

additiveExpression
	:	multiplicativeExpression (additiveOperator multiplicativeExpression)*
	;

multiplicativeExpression
	:	prefixUnaryExpression (multiplicativeOperator prefixUnaryExpression)*
	;

prefixUnaryExpression
	:	preUnaryOperator* postfixUnaryExpression
	;

postfixUnaryExpression
    :   primaryExpression
    |   primaryExpression postfixUnarySuffix+
    ;

postfixUnarySuffix
    :   postUnaryOperator
    |   generic
    |   callSuffix
    |   indexingSuffix
    |   navigationSuffix
    ;

callSuffix
    :   '(' ')'
    |   '(' parameterExpression (',' parameterExpression)*
    ;

indexingSuffix
    :   '[' expression (',' expression)* ']'
    ;

navigationSuffix
    :   memberAccess Identifier
    ;

primaryExpression
	:	'(' expression ')'
	|	Identifier
	|   literal
	|   thisExpression
	|	ifExpression
	|   whenExpression
	|   returnExpression
	;

thisExpression
    : 'this'
    ;

literal
	:	array
	|	map
	|	set
	|	tuple
	|   lambdaLiteral
	|   objectLiteral
	|	IntegerLiteral
	|	FloatingPointLiteral
	|	StringLiteral
	|	CharacterLiteral
	|	BooleanLiteral
	|	NoneLiteral
	;

array
	:	'[' ']'
	|	'[' expression (',' expression)* ']'
	;

map
	:	'{' '}'
	|	'{' expression 'to' expression (',' expression 'to' expression)* '}'
	;

set		// empty set conflicts with empty map and so it doesn't exist as a literal
	:	'{' expression (',' expression)* '}'
	;

tuple
	:	'(' ')'
	|	'(' expression ',' ')'
	|	'(' expression (',' expression)+ ','? ')'
	;

lambdaLiteral
    :   '{' statement* '}'
    |   '{' lambdaParameter (',' lambdaParameter)* '->' statement* '}'
    ;

lambdaParameter
    :   Identifier (':' type)?
    ;

objectLiteral
    :   'object' (':' type)? (By expression (',' expression)*)? ('{' objectElement* '}')
    ;

returnExpression
	:	'return' expression?
	;

memberAccess
	:	NoneSafeAccess
	|	NonNoneAccess
	;

postUnaryOperator
	:	Increment
	|	Decrement
	;

preUnaryOperator
	:	Increment
	|	Decrement
	|	Plus
	|	Minus
	|	LogicalNot
	|	BitwiseNot
	;

multiplicativeOperator
	:	Multiply
	|	Divide
	|	Modulus
	|	DivideModulus
	;

additiveOperator
	:	Plus
	|	Minus
	;

bitwiseOperator
	:	LeftShift
	|	ArithmeticRightShift
	|	LogicalRightShift
	|	BitwiseAnd
	|	BitwiseXor
	|	BitwiseOr
	;

rangeOperator
	:	RangeTo
	|	RangeUntil
	;

relationalOperator
	:	LessThan
	|	LessThanEqual
	|	GreaterThan
	|	GreaterThanEqual
	;

isOperator
    :   Is
    |   NotIs
    ;

inOperator
    :   In
    |   NotIn
    ;

hasOperator
    :   Has
    |   NotHas
    ;

equalityOperator
	:	Equals
	|	NotEquals
	;

ifExpression
	:	'if' '(' expression ')' expression elseExpression
	|	'if' '(' expression ')' '{' statement* expression '}' elseExpression
	;

elseExpression
	:	'else' expression
	|	'else' '{' statement* expression '}'
	;

whenExpression
    :   'when' '(' (valueDeclaration '=')? expression ')' '{' whenExpressionEntry* '}'
    ;

whenExpressionEntry
    :   whenCondition (',' whenCondition)* '->' expression
    |   whenCondition (',' whenCondition)* '->' '{' statement* expression '}'
    |   'else' '->' expression
    |   'else' '->' '{' statement* expression '}'
    ;

genericDeclaration
	:	'<' genericTypeDeclaration (',' genericTypeDeclaration)* '>'
	;

genericTypeDeclaration
	:	Identifier (':' type)?
	;

generic
	:	'<' type (',' type)* '>'
	;

type
	:	unionType
	;

unionType
	:	sumType ('|' sumType)*
	;

sumType
	:	simpleType ('+' simpleType)*
	;

simpleType
	:	Identifier ('.' Identifier)? generic?
	;

Var
	:	'var'
	;

Val
	:	'val'
	;

NoneSafeAccess
	:	'?.'
	;

NonNoneAccess
	:	'.'
	;

Increment
	:	'++'
	;

Decrement
	:	'--'
	;

LogicalNot
	:	'!'
	;

BitwiseNot
	:	'~'
	;

Elvis
	:	'?:'
	;

Multiply
	:	'*'
	;

Divide
	:	'/'
	;

Modulus
	:	'%'
	;

DivideModulus
	:	'/%'
	;

Plus
	:	'+'
	;

Minus
	:	'-'
	;

LeftShift
	:	'<<'
	;

ArithmeticRightShift
	:	'>>'
	;

LogicalRightShift
	:	'>>>'
	;

BitwiseAnd
	:	'&'
	;

BitwiseXor
	:	'^'
	;

BitwiseOr
	:	'|'
	;

RangeTo
	:	'...'
	;

RangeUntil
	:	'..<'
	;

LessThan
	:	'<'
	;

LessThanEqual
	:	'<='
	;

GreaterThan
	:	'>'
	;

GreaterThanEqual
	:	'>='
	;

By
	:	'by'
	;

Is
	:	'is'
	;

NotIs
	:	'!is'
	;

In
	:	'in'
	;

NotIn
	:	'!in'
	;

Has
	:	'has'
	;

NotHas
	:	'!has'
	;

Equals
	:	'=='
	;

NotEquals
	:	'!='
	;

LogicalAnd
	:	'&&'
	;

LogicalOr
	:	'||'
	;

Noneable
	:	'?'
	;

IntegerLiteral
	:	DecimalIntegerLiteral
	|	HexIntegerLiteral
	|	BinaryIntegerLiteral
	;

fragment
DecimalIntegerLiteral
	:	DecimalNumeral
	;

fragment
HexIntegerLiteral
	:	HexNumeral
	;

fragment
BinaryIntegerLiteral
	:	BinaryNumeral
	;

fragment
DecimalNumeral
	:	Digit (Digits? | Underscores Digits)
	;

fragment
Digits
	:	Digit (DigitsAndUnderscores? Digit)?
	;

fragment
Digit
	:	[0-9]
	;

fragment
DigitsAndUnderscores
	:	DigitOrUnderscore+
	;

fragment
DigitOrUnderscore
	:	Digit
	|	'_'
	;

fragment
Underscores
	:	'_'+
	;

fragment
HexNumeral
	:	'0' [xX] HexDigits
	;

fragment
HexDigits
	:	HexDigit (HexDigitsAndUnderscores? HexDigit)?
	;

fragment
HexDigit
	:	[0-9a-fA-F]
	;

fragment
HexDigitsAndUnderscores
	:	HexDigitOrUnderscore+
	;

fragment
HexDigitOrUnderscore
	:	HexDigit
	|	'_'
	;

fragment
BinaryNumeral
	:	'0' [bB] BinaryDigits
	;

fragment
BinaryDigits
	:	BinaryDigit (BinaryDigitsAndUnderscores? BinaryDigit)?
	;

fragment
BinaryDigit
	:	[01]
	;

fragment
BinaryDigitsAndUnderscores
	:	BinaryDigitOrUnderscore+
	;

fragment
BinaryDigitOrUnderscore
	:	BinaryDigit
	|	'_'
	;

FloatingPointLiteral
	:	DecimalFloatingPointLiteral
	|	HexadecimalFloatingPointLiteral
	;

fragment
DecimalFloatingPointLiteral
	:	Digits '.' Digits? ExponentPart?
	|	'.' Digits ExponentPart?
	|	Digits ExponentPart
	|	Digits
	;

fragment
ExponentPart
	:	ExponentIndicator SignedInteger
	;

fragment
ExponentIndicator
	:	[eE]
	;

fragment
SignedInteger
	:	Sign? Digits
	;

fragment
Sign
	:	[+-]
	;

fragment
HexadecimalFloatingPointLiteral
	:	HexSignificand BinaryExponent
	;

fragment
HexSignificand
	:	HexNumeral '.'?
	|	'0' [xX] HexDigits? '.' HexDigits
	;

fragment
BinaryExponent
	:	BinaryExponentIndicator SignedInteger
	;

fragment
BinaryExponentIndicator
	:	[pP]
	;

BooleanLiteral
	:	'true'
	|	'false'
	;

CharacterLiteral
	:	'\'' SingleCharacter '\''
	|	'\'' EscapeSequence '\''
	;

fragment
SingleCharacter
	:	~['\\]
	;

RawStringLiteral
	:	'"""' StringCharacter*? '"""'
	;

StringLiteral
	:	'"' StringCharacter* '"'
	;

fragment
StringCharacter
	:	~["\\]
	|	EscapeSequence
	;

fragment
EscapeSequence
	:	'\\' [btnr"'\\]
    |   UnicodeEscape
	;

fragment
UnicodeEscape
	:	'\\' 'u' HexDigit HexDigit HexDigit HexDigit
	|	'\\' 'U' ('0' HexDigit | '10') HexDigit HexDigit HexDigit HexDigit
	;

NoneLiteral
	:	'none'
	;

Identifier
	:	IdentifierStartChar IdentifierChar*
	;

fragment
IdentifierStartChar
	:	[a-zA-Z_]
	;

fragment
IdentifierChar
	:	[a-zA-Z0-9_]
	;
WS
	:	[ \t\r\n]+ -> skip
	;
LINE_COMMENT
    :   '#' ~[\r\n]* -> skip
    ;