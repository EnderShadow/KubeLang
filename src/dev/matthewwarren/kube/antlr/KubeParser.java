// Generated from /home/matthew/Desktop/Programming/Kotlin/Projects/KubeCompiler/grammar/Kube.g4 by ANTLR 4.8
package dev.matthewwarren.kube.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KubeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, Var=47, Val=48, Fun=49, NoneSafeAccess=50, NonNoneAccess=51, 
		Increment=52, Decrement=53, LogicalNot=54, BitwiseNot=55, Elvis=56, Multiply=57, 
		Divide=58, Modulus=59, DivideModulus=60, Plus=61, Minus=62, LeftShift=63, 
		ArithmeticRightShift=64, LogicalRightShift=65, BitwiseAnd=66, BitwiseXor=67, 
		BitwiseOr=68, RangeTo=69, RangeUntil=70, LessThan=71, LessThanEqual=72, 
		GreaterThan=73, GreaterThanEqual=74, By=75, Is=76, NotIs=77, In=78, NotIn=79, 
		Has=80, NotHas=81, Equals=82, NotEquals=83, LogicalAnd=84, LogicalOr=85, 
		Noneable=86, IntegerLiteral=87, FloatingPointLiteral=88, BooleanLiteral=89, 
		CharacterLiteral=90, RawStringLiteral=91, StringLiteral=92, NoneLiteral=93, 
		Identifier=94, WS=95, LINE_COMMENT=96;
	public static final int
		RULE_file = 0, RULE_module = 1, RULE_importExpr = 2, RULE_moduleContent = 3, 
		RULE_alias = 4, RULE_typeAlias = 5, RULE_interface0 = 6, RULE_interfaceElement = 7, 
		RULE_class0 = 8, RULE_classElement = 9, RULE_object0 = 10, RULE_objectElement = 11, 
		RULE_enum0 = 12, RULE_annotation = 13, RULE_enumList = 14, RULE_enumValue = 15, 
		RULE_parameterExpression = 16, RULE_enumElement = 17, RULE_variable = 18, 
		RULE_variableDeclaration = 19, RULE_value = 20, RULE_valueDeclaration = 21, 
		RULE_getter = 22, RULE_setter = 23, RULE_function = 24, RULE_functionDeclaration = 25, 
		RULE_parameter = 26, RULE_initializer = 27, RULE_finalizer = 28, RULE_primaryConstructor = 29, 
		RULE_constructorParameter = 30, RULE_constructor = 31, RULE_constructorCall = 32, 
		RULE_statement = 33, RULE_ifStatement = 34, RULE_elseBlock = 35, RULE_whenStatement = 36, 
		RULE_whenStatementEntry = 37, RULE_whenCondition = 38, RULE_rangeTest = 39, 
		RULE_typeTest = 40, RULE_memberTest = 41, RULE_forLoop = 42, RULE_whileLoop = 43, 
		RULE_doWhileLoop = 44, RULE_assignmentOperator = 45, RULE_expression = 46, 
		RULE_logicalOrExpression = 47, RULE_logicalAndExpression = 48, RULE_equalityExpression = 49, 
		RULE_comparisonExpression = 50, RULE_infixOperation = 51, RULE_elvisExpression = 52, 
		RULE_rangeExpression = 53, RULE_bitwiseExpression = 54, RULE_additiveExpression = 55, 
		RULE_multiplicativeExpression = 56, RULE_prefixUnaryExpression = 57, RULE_postfixUnaryExpression = 58, 
		RULE_postfixUnarySuffix = 59, RULE_callSuffix = 60, RULE_indexingSuffix = 61, 
		RULE_navigationSuffix = 62, RULE_primaryExpression = 63, RULE_thisExpression = 64, 
		RULE_literal = 65, RULE_array = 66, RULE_map = 67, RULE_set = 68, RULE_tuple = 69, 
		RULE_lambdaLiteral = 70, RULE_lambdaParameter = 71, RULE_objectLiteral = 72, 
		RULE_returnExpression = 73, RULE_memberAccess = 74, RULE_postUnaryOperator = 75, 
		RULE_preUnaryOperator = 76, RULE_multiplicativeOperator = 77, RULE_additiveOperator = 78, 
		RULE_bitwiseOperator = 79, RULE_rangeOperator = 80, RULE_relationalOperator = 81, 
		RULE_isOperator = 82, RULE_inOperator = 83, RULE_hasOperator = 84, RULE_equalityOperator = 85, 
		RULE_ifExpression = 86, RULE_elseExpression = 87, RULE_whenExpression = 88, 
		RULE_whenExpressionEntry = 89, RULE_genericDeclaration = 90, RULE_genericTypeDeclaration = 91, 
		RULE_generic = 92, RULE_type = 93, RULE_unionType = 94, RULE_intersectionType = 95, 
		RULE_primaryType = 96, RULE_functionType = 97, RULE_functionParameterTypes = 98;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "module", "importExpr", "moduleContent", "alias", "typeAlias", 
			"interface0", "interfaceElement", "class0", "classElement", "object0", 
			"objectElement", "enum0", "annotation", "enumList", "enumValue", "parameterExpression", 
			"enumElement", "variable", "variableDeclaration", "value", "valueDeclaration", 
			"getter", "setter", "function", "functionDeclaration", "parameter", "initializer", 
			"finalizer", "primaryConstructor", "constructorParameter", "constructor", 
			"constructorCall", "statement", "ifStatement", "elseBlock", "whenStatement", 
			"whenStatementEntry", "whenCondition", "rangeTest", "typeTest", "memberTest", 
			"forLoop", "whileLoop", "doWhileLoop", "assignmentOperator", "expression", 
			"logicalOrExpression", "logicalAndExpression", "equalityExpression", 
			"comparisonExpression", "infixOperation", "elvisExpression", "rangeExpression", 
			"bitwiseExpression", "additiveExpression", "multiplicativeExpression", 
			"prefixUnaryExpression", "postfixUnaryExpression", "postfixUnarySuffix", 
			"callSuffix", "indexingSuffix", "navigationSuffix", "primaryExpression", 
			"thisExpression", "literal", "array", "map", "set", "tuple", "lambdaLiteral", 
			"lambdaParameter", "objectLiteral", "returnExpression", "memberAccess", 
			"postUnaryOperator", "preUnaryOperator", "multiplicativeOperator", "additiveOperator", 
			"bitwiseOperator", "rangeOperator", "relationalOperator", "isOperator", 
			"inOperator", "hasOperator", "equalityOperator", "ifExpression", "elseExpression", 
			"whenExpression", "whenExpressionEntry", "genericDeclaration", "genericTypeDeclaration", 
			"generic", "type", "unionType", "intersectionType", "primaryType", "functionType", 
			"functionParameterTypes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'module'", "'{'", "'}'", "'import'", "'alias'", "'='", "'typeAlias'", 
			"'interface'", "':'", "'class'", "'with'", "','", "'object'", "'enum'", 
			"';'", "'@'", "'('", "')'", "'get'", "'set'", "'init'", "'finalize'", 
			"'constructor'", "'this'", "'if'", "'else'", "'when'", "'->'", "'for'", 
			"'while'", "'do'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", 
			"'>>>='", "'&='", "'^='", "'|='", "'['", "']'", "'to'", "'return'", "'var'", 
			"'val'", "'fun'", "'?.'", "'.'", "'++'", "'--'", "'!'", "'~'", "'?:'", 
			"'*'", "'/'", "'%'", "'/%'", "'+'", "'-'", "'<<'", "'>>'", "'>>>'", "'&'", 
			"'^'", "'|'", "'...'", "'..<'", "'<'", "'<='", "'>'", "'>='", "'by'", 
			"'is'", "'!is'", "'in'", "'!in'", "'has'", "'!has'", "'=='", "'!='", 
			"'&&'", "'||'", "'?'", null, null, null, null, null, null, "'none'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "Var", 
			"Val", "Fun", "NoneSafeAccess", "NonNoneAccess", "Increment", "Decrement", 
			"LogicalNot", "BitwiseNot", "Elvis", "Multiply", "Divide", "Modulus", 
			"DivideModulus", "Plus", "Minus", "LeftShift", "ArithmeticRightShift", 
			"LogicalRightShift", "BitwiseAnd", "BitwiseXor", "BitwiseOr", "RangeTo", 
			"RangeUntil", "LessThan", "LessThanEqual", "GreaterThan", "GreaterThanEqual", 
			"By", "Is", "NotIs", "In", "NotIn", "Has", "NotHas", "Equals", "NotEquals", 
			"LogicalAnd", "LogicalOr", "Noneable", "IntegerLiteral", "FloatingPointLiteral", 
			"BooleanLiteral", "CharacterLiteral", "RawStringLiteral", "StringLiteral", 
			"NoneLiteral", "Identifier", "WS", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Kube.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KubeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public List<ModuleContext> module() {
			return getRuleContexts(ModuleContext.class);
		}
		public ModuleContext module(int i) {
			return getRuleContext(ModuleContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(198);
				module();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public List<ImportExprContext> importExpr() {
			return getRuleContexts(ImportExprContext.class);
		}
		public ImportExprContext importExpr(int i) {
			return getRuleContext(ImportExprContext.class,i);
		}
		public List<ModuleContentContext> moduleContent() {
			return getRuleContexts(ModuleContentContext.class);
		}
		public ModuleContentContext moduleContent(int i) {
			return getRuleContext(ModuleContentContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__0);
			setState(205);
			match(Identifier);
			setState(206);
			match(T__1);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(207);
				importExpr();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__20) | (1L << Var) | (1L << Val) | (1L << Fun))) != 0)) {
				{
				{
				setState(213);
				moduleContent();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportExprContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public ImportExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitImportExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportExprContext importExpr() throws RecognitionException {
		ImportExprContext _localctx = new ImportExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__3);
			setState(222);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContentContext extends ParserRuleContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Interface0Context interface0() {
			return getRuleContext(Interface0Context.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Class0Context class0() {
			return getRuleContext(Class0Context.class,0);
		}
		public Object0Context object0() {
			return getRuleContext(Object0Context.class,0);
		}
		public Enum0Context enum0() {
			return getRuleContext(Enum0Context.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ModuleContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitModuleContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContentContext moduleContent() throws RecognitionException {
		ModuleContentContext _localctx = new ModuleContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_moduleContent);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				initializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				typeAlias();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				alias();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(227);
					annotation();
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(233);
				interface0();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(234);
					annotation();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
				class0();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(241);
					annotation();
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247);
				object0();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(248);
					annotation();
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(254);
				enum0();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(255);
					annotation();
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
				function();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(262);
					annotation();
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(268);
				variable();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(269);
					annotation();
					}
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(275);
				value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(KubeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(KubeParser.Identifier, i);
		}
		public TerminalNode NonNoneAccess() { return getToken(KubeParser.NonNoneAccess, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__4);
			setState(279);
			match(Identifier);
			setState(280);
			match(T__5);
			setState(281);
			match(Identifier);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NonNoneAccess) {
				{
				setState(282);
				match(NonNoneAccess);
				setState(283);
				match(Identifier);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeAliasContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAlias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitTypeAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAliasContext typeAlias() throws RecognitionException {
		TypeAliasContext _localctx = new TypeAliasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__6);
			setState(287);
			match(Identifier);
			setState(288);
			match(T__5);
			setState(289);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface0Context extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public GenericDeclarationContext genericDeclaration() {
			return getRuleContext(GenericDeclarationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<InterfaceElementContext> interfaceElement() {
			return getRuleContexts(InterfaceElementContext.class);
		}
		public InterfaceElementContext interfaceElement(int i) {
			return getRuleContext(InterfaceElementContext.class,i);
		}
		public Interface0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface0; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitInterface0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface0Context interface0() throws RecognitionException {
		Interface0Context _localctx = new Interface0Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_interface0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__7);
			setState(292);
			match(Identifier);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(293);
				genericDeclaration();
				}
			}

			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(296);
				match(T__8);
				setState(297);
				type();
				}
			}

			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(300);
				match(T__1);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << Var) | (1L << Val) | (1L << Fun))) != 0)) {
					{
					{
					setState(301);
					interfaceElement();
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(307);
				match(T__2);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceElementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ValueDeclarationContext valueDeclaration() {
			return getRuleContext(ValueDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public InterfaceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitInterfaceElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceElementContext interfaceElement() throws RecognitionException {
		InterfaceElementContext _localctx = new InterfaceElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_interfaceElement);
		int _la;
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(310);
					annotation();
					}
					}
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(316);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(317);
					annotation();
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(323);
				valueDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(324);
					annotation();
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(330);
				functionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class0Context extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public GenericDeclarationContext genericDeclaration() {
			return getRuleContext(GenericDeclarationContext.class,0);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ClassElementContext> classElement() {
			return getRuleContexts(ClassElementContext.class);
		}
		public ClassElementContext classElement(int i) {
			return getRuleContext(ClassElementContext.class,i);
		}
		public Class0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class0; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitClass0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class0Context class0() throws RecognitionException {
		Class0Context _localctx = new Class0Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_class0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__9);
			setState(334);
			match(Identifier);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(335);
				genericDeclaration();
				}
			}

			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(338);
				primaryConstructor();
				}
			}

			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(341);
				match(T__8);
				setState(342);
				type();
				}
			}

			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(345);
				match(T__10);
				setState(346);
				expression();
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(347);
					match(T__11);
					setState(348);
					expression();
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(356);
				match(T__1);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << Var) | (1L << Val) | (1L << Fun))) != 0)) {
					{
					{
					setState(357);
					classElement();
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(363);
				match(T__2);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassElementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public FinalizerContext finalizer() {
			return getRuleContext(FinalizerContext.class,0);
		}
		public ClassElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitClassElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassElementContext classElement() throws RecognitionException {
		ClassElementContext _localctx = new ClassElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classElement);
		int _la;
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(366);
					annotation();
					}
					}
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(372);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(373);
					annotation();
					}
					}
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(379);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(380);
					annotation();
					}
					}
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(386);
				function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(387);
					annotation();
					}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(393);
				constructor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(394);
				initializer();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(395);
				finalizer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object0Context extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ObjectElementContext> objectElement() {
			return getRuleContexts(ObjectElementContext.class);
		}
		public ObjectElementContext objectElement(int i) {
			return getRuleContext(ObjectElementContext.class,i);
		}
		public Object0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object0; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitObject0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object0Context object0() throws RecognitionException {
		Object0Context _localctx = new Object0Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_object0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(T__12);
			setState(399);
			match(Identifier);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(400);
				match(T__8);
				setState(401);
				type();
				}
			}

			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(404);
				match(T__10);
				setState(405);
				expression();
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(406);
					match(T__11);
					setState(407);
					expression();
					}
					}
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(415);
			match(T__1);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << Var) | (1L << Val) | (1L << Fun))) != 0)) {
				{
				{
				setState(416);
				objectElement();
				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(422);
			match(T__2);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectElementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public FinalizerContext finalizer() {
			return getRuleContext(FinalizerContext.class,0);
		}
		public ObjectElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitObjectElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectElementContext objectElement() throws RecognitionException {
		ObjectElementContext _localctx = new ObjectElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_objectElement);
		int _la;
		try {
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(424);
					annotation();
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(430);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(431);
					annotation();
					}
					}
					setState(436);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(437);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(438);
					annotation();
					}
					}
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(444);
				function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(445);
				initializer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(446);
				finalizer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum0Context extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public EnumListContext enumList() {
			return getRuleContext(EnumListContext.class,0);
		}
		public PrimaryConstructorContext primaryConstructor() {
			return getRuleContext(PrimaryConstructorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<EnumElementContext> enumElement() {
			return getRuleContexts(EnumElementContext.class);
		}
		public EnumElementContext enumElement(int i) {
			return getRuleContext(EnumElementContext.class,i);
		}
		public Enum0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum0; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitEnum0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum0Context enum0() throws RecognitionException {
		Enum0Context _localctx = new Enum0Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_enum0);
		int _la;
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(T__13);
				setState(450);
				match(Identifier);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(451);
					primaryConstructor();
					}
				}

				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(454);
					match(T__8);
					setState(455);
					type();
					}
				}

				setState(458);
				match(T__1);
				setState(459);
				enumList();
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(460);
					match(T__11);
					}
				}

				setState(463);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(T__13);
				setState(466);
				match(Identifier);
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(467);
					primaryConstructor();
					}
				}

				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(470);
					match(T__8);
					setState(471);
					type();
					}
				}

				setState(474);
				match(T__1);
				setState(475);
				enumList();
				setState(476);
				match(T__14);
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << Val) | (1L << Fun))) != 0)) {
					{
					{
					setState(477);
					enumElement();
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(483);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(KubeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(KubeParser.Identifier, i);
		}
		public TerminalNode NonNoneAccess() { return getToken(KubeParser.NonNoneAccess, 0); }
		public List<ParameterExpressionContext> parameterExpression() {
			return getRuleContexts(ParameterExpressionContext.class);
		}
		public ParameterExpressionContext parameterExpression(int i) {
			return getRuleContext(ParameterExpressionContext.class,i);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_annotation);
		int _la;
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				match(T__15);
				setState(488);
				match(Identifier);
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NonNoneAccess) {
					{
					setState(489);
					match(NonNoneAccess);
					setState(490);
					match(Identifier);
					}
				}

				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(493);
					match(T__16);
					setState(494);
					match(T__17);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				match(T__15);
				setState(498);
				match(Identifier);
				{
				setState(499);
				match(NonNoneAccess);
				setState(500);
				match(Identifier);
				}
				setState(502);
				match(T__16);
				setState(503);
				parameterExpression();
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(504);
					match(T__11);
					setState(505);
					parameterExpression();
					}
					}
					setState(510);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(511);
				match(T__17);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumListContext extends ParserRuleContext {
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public EnumListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitEnumList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumListContext enumList() throws RecognitionException {
		EnumListContext _localctx = new EnumListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			enumValue();
			setState(520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(516);
					match(T__11);
					setState(517);
					enumValue();
					}
					} 
				}
				setState(522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumValueContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public List<ParameterExpressionContext> parameterExpression() {
			return getRuleContexts(ParameterExpressionContext.class);
		}
		public ParameterExpressionContext parameterExpression(int i) {
			return getRuleContext(ParameterExpressionContext.class,i);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enumValue);
		int _la;
		try {
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				match(Identifier);
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(524);
					match(T__16);
					setState(525);
					match(T__17);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				match(Identifier);
				setState(529);
				match(T__16);
				setState(530);
				parameterExpression();
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(531);
					match(T__11);
					setState(532);
					parameterExpression();
					}
					}
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(538);
				match(T__17);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public ParameterExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitParameterExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterExpressionContext parameterExpression() throws RecognitionException {
		ParameterExpressionContext _localctx = new ParameterExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameterExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(542);
				match(Identifier);
				setState(543);
				match(T__5);
				}
				break;
			}
			setState(546);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumElementContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public EnumElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitEnumElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumElementContext enumElement() throws RecognitionException {
		EnumElementContext _localctx = new EnumElementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enumElement);
		int _la;
		try {
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(548);
					annotation();
					}
					}
					setState(553);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(554);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(555);
					annotation();
					}
					}
					setState(560);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(561);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(562);
				initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode By() { return getToken(KubeParser.By, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variable);
		int _la;
		try {
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				variableDeclaration();
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(566);
					match(T__5);
					setState(567);
					expression();
					}
				}

				setState(570);
				setter();
				setState(571);
				getter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				variableDeclaration();
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(574);
					match(T__5);
					setState(575);
					expression();
					}
				}

				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(578);
					getter();
					}
				}

				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(581);
					setter();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				variableDeclaration();
				setState(585);
				match(By);
				setState(586);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(KubeParser.Var, 0); }
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(Var);
			setState(591);
			match(Identifier);
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(592);
				match(T__8);
				setState(593);
				type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ValueDeclarationContext valueDeclaration() {
			return getRuleContext(ValueDeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public TerminalNode By() { return getToken(KubeParser.By, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		int _la;
		try {
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				valueDeclaration();
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(597);
					match(T__5);
					setState(598);
					expression();
					}
				}

				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(601);
					getter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				valueDeclaration();
				setState(605);
				match(By);
				setState(606);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueDeclarationContext extends ParserRuleContext {
		public TerminalNode Val() { return getToken(KubeParser.Val, 0); }
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValueDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitValueDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueDeclarationContext valueDeclaration() throws RecognitionException {
		ValueDeclarationContext _localctx = new ValueDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_valueDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(Val);
			setState(611);
			match(Identifier);
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(612);
				match(T__8);
				setState(613);
				type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitGetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_getter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(T__18);
			setState(617);
			match(T__16);
			setState(618);
			match(T__17);
			setState(619);
			match(T__1);
			setState(621); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(620);
				statement();
				}
				}
				setState(623); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__16) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__42) | (1L << T__45) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0) );
			setState(625);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitSetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_setter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(T__19);
			setState(628);
			match(T__16);
			setState(629);
			match(Identifier);
			setState(630);
			match(T__17);
			setState(631);
			match(T__1);
			setState(633); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(632);
				statement();
				}
				}
				setState(635); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__16) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__42) | (1L << T__45) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0) );
			setState(637);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			functionDeclaration();
			setState(640);
			match(T__1);
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__16) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__42) | (1L << T__45) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
				{
				{
				setState(641);
				statement();
				}
				}
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(647);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Fun() { return getToken(KubeParser.Fun, 0); }
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public GenericDeclarationContext genericDeclaration() {
			return getRuleContext(GenericDeclarationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionDeclaration);
		int _la;
		try {
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				match(Fun);
				setState(650);
				match(Identifier);
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LessThan) {
					{
					setState(651);
					genericDeclaration();
					}
				}

				setState(654);
				match(T__16);
				setState(655);
				match(T__17);
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(656);
					match(T__8);
					setState(657);
					type();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				match(Fun);
				setState(661);
				match(Identifier);
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LessThan) {
					{
					setState(662);
					genericDeclaration();
					}
				}

				setState(665);
				match(T__16);
				setState(666);
				parameter();
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(667);
					match(T__11);
					setState(668);
					parameter();
					}
					}
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(674);
				match(T__17);
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(675);
					match(T__8);
					setState(676);
					type();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(Identifier);
			setState(682);
			match(T__8);
			setState(683);
			type();
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(684);
				match(T__5);
				setState(685);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(T__20);
			setState(689);
			match(T__1);
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__16) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__42) | (1L << T__45) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
				{
				{
				setState(690);
				statement();
				}
				}
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(696);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinalizerContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FinalizerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalizer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitFinalizer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalizerContext finalizer() throws RecognitionException {
		FinalizerContext _localctx = new FinalizerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_finalizer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(T__21);
			setState(699);
			match(T__1);
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__16) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__42) | (1L << T__45) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
				{
				{
				setState(700);
				statement();
				}
				}
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(706);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryConstructorContext extends ParserRuleContext {
		public List<ConstructorParameterContext> constructorParameter() {
			return getRuleContexts(ConstructorParameterContext.class);
		}
		public ConstructorParameterContext constructorParameter(int i) {
			return getRuleContext(ConstructorParameterContext.class,i);
		}
		public PrimaryConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitPrimaryConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryConstructorContext primaryConstructor() throws RecognitionException {
		PrimaryConstructorContext _localctx = new PrimaryConstructorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_primaryConstructor);
		int _la;
		try {
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				match(T__16);
				setState(709);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				match(T__16);
				setState(711);
				constructorParameter();
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(712);
					match(T__11);
					setState(713);
					constructorParameter();
					}
					}
					setState(718);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(719);
				match(T__17);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorParameterContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode Var() { return getToken(KubeParser.Var, 0); }
		public TerminalNode Val() { return getToken(KubeParser.Val, 0); }
		public ConstructorParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitConstructorParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorParameterContext constructorParameter() throws RecognitionException {
		ConstructorParameterContext _localctx = new ConstructorParameterContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constructorParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Var || _la==Val) {
				{
				setState(723);
				_la = _input.LA(1);
				if ( !(_la==Var || _la==Val) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(726);
			parameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorContext extends ParserRuleContext {
		public ConstructorCallContext constructorCall() {
			return getRuleContext(ConstructorCallContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constructor);
		int _la;
		try {
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				match(T__22);
				setState(729);
				match(T__16);
				setState(730);
				match(T__17);
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(731);
					constructorCall();
					}
				}

				setState(734);
				match(T__1);
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__16) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__42) | (1L << T__45) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(735);
					statement();
					}
					}
					setState(740);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(741);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				match(T__22);
				setState(743);
				match(T__16);
				setState(744);
				parameter();
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(745);
					match(T__11);
					setState(746);
					parameter();
					}
					}
					setState(751);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(752);
				match(T__17);
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(753);
					constructorCall();
					}
				}

				setState(756);
				match(T__1);
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__16) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__42) | (1L << T__45) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(757);
					statement();
					}
					}
					setState(762);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(763);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorCallContext extends ParserRuleContext {
		public List<ParameterExpressionContext> parameterExpression() {
			return getRuleContexts(ParameterExpressionContext.class);
		}
		public ParameterExpressionContext parameterExpression(int i) {
			return getRuleContext(ParameterExpressionContext.class,i);
		}
		public ConstructorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitConstructorCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorCallContext constructorCall() throws RecognitionException {
		ConstructorCallContext _localctx = new ConstructorCallContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constructorCall);
		int _la;
		try {
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				match(T__8);
				setState(768);
				match(T__23);
				setState(769);
				match(T__16);
				setState(770);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				match(T__8);
				setState(772);
				match(T__23);
				setState(773);
				match(T__16);
				setState(774);
				parameterExpression();
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(775);
					match(T__11);
					setState(776);
					parameterExpression();
					}
					}
					setState(781);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(782);
				match(T__17);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhenStatementContext whenStatement() {
			return getRuleContext(WhenStatementContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public DoWhileLoopContext doWhileLoop() {
			return getRuleContext(DoWhileLoopContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_statement);
		try {
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(788);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(789);
				whenStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(790);
				forLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(791);
				whileLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(792);
				doWhileLoop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(793);
				expression();
				setState(794);
				assignmentOperator();
				setState(795);
				expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(797);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ifStatement);
		int _la;
		try {
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				match(T__24);
				setState(801);
				match(T__16);
				setState(802);
				expression();
				setState(803);
				match(T__17);
				setState(804);
				statement();
				setState(806);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(805);
					elseBlock();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				match(T__24);
				setState(809);
				match(T__16);
				setState(810);
				expression();
				setState(811);
				match(T__17);
				setState(812);
				match(T__1);
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__16) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__42) | (1L << T__45) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(813);
					statement();
					}
					}
					setState(818);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(819);
				match(T__2);
				setState(821);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(820);
					elseBlock();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_elseBlock);
		int _la;
		try {
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(825);
				match(T__25);
				setState(826);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				match(T__25);
				setState(828);
				match(T__1);
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__16) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__42) | (1L << T__45) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(829);
					statement();
					}
					}
					setState(834);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(835);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueDeclarationContext valueDeclaration() {
			return getRuleContext(ValueDeclarationContext.class,0);
		}
		public List<WhenStatementEntryContext> whenStatementEntry() {
			return getRuleContexts(WhenStatementEntryContext.class);
		}
		public WhenStatementEntryContext whenStatementEntry(int i) {
			return getRuleContext(WhenStatementEntryContext.class,i);
		}
		public WhenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitWhenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenStatementContext whenStatement() throws RecognitionException {
		WhenStatementContext _localctx = new WhenStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_whenStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(T__26);
			setState(839);
			match(T__16);
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Val) {
				{
				setState(840);
				valueDeclaration();
				setState(841);
				match(T__5);
				}
			}

			setState(845);
			expression();
			setState(846);
			match(T__17);
			setState(847);
			match(T__1);
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__16) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__42) | (1L << T__45) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Is - 76)) | (1L << (NotIs - 76)) | (1L << (In - 76)) | (1L << (NotIn - 76)) | (1L << (Has - 76)) | (1L << (NotHas - 76)) | (1L << (IntegerLiteral - 76)) | (1L << (FloatingPointLiteral - 76)) | (1L << (BooleanLiteral - 76)) | (1L << (CharacterLiteral - 76)) | (1L << (StringLiteral - 76)) | (1L << (NoneLiteral - 76)) | (1L << (Identifier - 76)))) != 0)) {
				{
				{
				setState(848);
				whenStatementEntry();
				}
				}
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(854);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenStatementEntryContext extends ParserRuleContext {
		public List<WhenConditionContext> whenCondition() {
			return getRuleContexts(WhenConditionContext.class);
		}
		public WhenConditionContext whenCondition(int i) {
			return getRuleContext(WhenConditionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhenStatementEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenStatementEntry; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitWhenStatementEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenStatementEntryContext whenStatementEntry() throws RecognitionException {
		WhenStatementEntryContext _localctx = new WhenStatementEntryContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_whenStatementEntry);
		int _la;
		try {
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				whenCondition();
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(857);
					match(T__11);
					setState(858);
					whenCondition();
					}
					}
					setState(863);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(864);
				match(T__27);
				setState(865);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
				whenCondition();
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(868);
					match(T__11);
					setState(869);
					whenCondition();
					}
					}
					setState(874);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(875);
				match(T__27);
				setState(876);
				match(T__1);
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__16) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__42) | (1L << T__45) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(877);
					statement();
					}
					}
					setState(882);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(883);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(885);
				match(T__25);
				setState(886);
				match(T__27);
				setState(887);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(888);
				match(T__25);
				setState(889);
				match(T__27);
				setState(890);
				match(T__1);
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__16) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__42) | (1L << T__45) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(891);
					statement();
					}
					}
					setState(896);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(897);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RangeTestContext rangeTest() {
			return getRuleContext(RangeTestContext.class,0);
		}
		public TypeTestContext typeTest() {
			return getRuleContext(TypeTestContext.class,0);
		}
		public MemberTestContext memberTest() {
			return getRuleContext(MemberTestContext.class,0);
		}
		public WhenConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitWhenCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenConditionContext whenCondition() throws RecognitionException {
		WhenConditionContext _localctx = new WhenConditionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_whenCondition);
		try {
			setState(904);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__12:
			case T__16:
			case T__23:
			case T__24:
			case T__26:
			case T__42:
			case T__45:
			case Increment:
			case Decrement:
			case LogicalNot:
			case BitwiseNot:
			case Plus:
			case Minus:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NoneLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				expression();
				}
				break;
			case In:
			case NotIn:
				enterOuterAlt(_localctx, 2);
				{
				setState(901);
				rangeTest();
				}
				break;
			case Is:
			case NotIs:
				enterOuterAlt(_localctx, 3);
				{
				setState(902);
				typeTest();
				}
				break;
			case Has:
			case NotHas:
				enterOuterAlt(_localctx, 4);
				{
				setState(903);
				memberTest();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeTestContext extends ParserRuleContext {
		public InOperatorContext inOperator() {
			return getRuleContext(InOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RangeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitRangeTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeTestContext rangeTest() throws RecognitionException {
		RangeTestContext _localctx = new RangeTestContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_rangeTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			inOperator();
			setState(907);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTestContext extends ParserRuleContext {
		public IsOperatorContext isOperator() {
			return getRuleContext(IsOperatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitTypeTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTestContext typeTest() throws RecognitionException {
		TypeTestContext _localctx = new TypeTestContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			isOperator();
			setState(910);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberTestContext extends ParserRuleContext {
		public HasOperatorContext hasOperator() {
			return getRuleContext(HasOperatorContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MemberTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitMemberTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberTestContext memberTest() throws RecognitionException {
		MemberTestContext _localctx = new MemberTestContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_memberTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			hasOperator();
			setState(913);
			match(Identifier);
			setState(914);
			match(T__8);
			setState(915);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public TerminalNode In() { return getToken(KubeParser.In, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_forLoop);
		int _la;
		try {
			setState(940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				match(T__28);
				setState(918);
				match(T__16);
				setState(919);
				match(Identifier);
				setState(920);
				match(In);
				setState(921);
				expression();
				setState(922);
				match(T__17);
				setState(923);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(925);
				match(T__28);
				setState(926);
				match(T__16);
				setState(927);
				match(Identifier);
				setState(928);
				match(In);
				setState(929);
				expression();
				setState(930);
				match(T__17);
				setState(931);
				match(T__1);
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__16) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__42) | (1L << T__45) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(932);
					statement();
					}
					}
					setState(937);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(938);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_whileLoop);
		int _la;
		try {
			setState(961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(942);
				match(T__29);
				setState(943);
				match(T__16);
				setState(944);
				expression();
				setState(945);
				match(T__17);
				setState(946);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(948);
				match(T__29);
				setState(949);
				match(T__16);
				setState(950);
				expression();
				setState(951);
				match(T__17);
				setState(952);
				match(T__1);
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__16) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__42) | (1L << T__45) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(953);
					statement();
					}
					}
					setState(958);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(959);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileLoopContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileLoop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitDoWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileLoopContext doWhileLoop() throws RecognitionException {
		DoWhileLoopContext _localctx = new DoWhileLoopContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_doWhileLoop);
		int _la;
		try {
			setState(984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				match(T__30);
				setState(964);
				statement();
				setState(965);
				match(T__29);
				setState(966);
				match(T__16);
				setState(967);
				expression();
				setState(968);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(970);
				match(T__30);
				setState(971);
				match(T__1);
				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__16) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__42) | (1L << T__45) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(972);
					statement();
					}
					}
					setState(977);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(978);
				match(T__2);
				setState(979);
				match(T__29);
				setState(980);
				match(T__16);
				setState(981);
				expression();
				setState(982);
				match(T__17);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			logicalOrExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> LogicalOr() { return getTokens(KubeParser.LogicalOr); }
		public TerminalNode LogicalOr(int i) {
			return getToken(KubeParser.LogicalOr, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_logicalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			logicalAndExpression();
			setState(995);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(991);
					match(LogicalOr);
					setState(992);
					logicalAndExpression();
					}
					} 
				}
				setState(997);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> LogicalAnd() { return getTokens(KubeParser.LogicalAnd); }
		public TerminalNode LogicalAnd(int i) {
			return getToken(KubeParser.LogicalAnd, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_logicalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			equalityExpression();
			setState(1003);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(999);
					match(LogicalAnd);
					setState(1000);
					equalityExpression();
					}
					} 
				}
				setState(1005);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public List<EqualityOperatorContext> equalityOperator() {
			return getRuleContexts(EqualityOperatorContext.class);
		}
		public EqualityOperatorContext equalityOperator(int i) {
			return getRuleContext(EqualityOperatorContext.class,i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_equalityExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			comparisonExpression();
			setState(1012);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1007);
					equalityOperator();
					setState(1008);
					comparisonExpression();
					}
					} 
				}
				setState(1014);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<InfixOperationContext> infixOperation() {
			return getRuleContexts(InfixOperationContext.class);
		}
		public InfixOperationContext infixOperation(int i) {
			return getRuleContext(InfixOperationContext.class,i);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_comparisonExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			infixOperation();
			setState(1019);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1016);
				relationalOperator();
				setState(1017);
				infixOperation();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixOperationContext extends ParserRuleContext {
		public List<ElvisExpressionContext> elvisExpression() {
			return getRuleContexts(ElvisExpressionContext.class);
		}
		public ElvisExpressionContext elvisExpression(int i) {
			return getRuleContext(ElvisExpressionContext.class,i);
		}
		public List<InOperatorContext> inOperator() {
			return getRuleContexts(InOperatorContext.class);
		}
		public InOperatorContext inOperator(int i) {
			return getRuleContext(InOperatorContext.class,i);
		}
		public List<IsOperatorContext> isOperator() {
			return getRuleContexts(IsOperatorContext.class);
		}
		public IsOperatorContext isOperator(int i) {
			return getRuleContext(IsOperatorContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<HasOperatorContext> hasOperator() {
			return getRuleContexts(HasOperatorContext.class);
		}
		public HasOperatorContext hasOperator(int i) {
			return getRuleContext(HasOperatorContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(KubeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(KubeParser.Identifier, i);
		}
		public List<TerminalNode> Val() { return getTokens(KubeParser.Val); }
		public TerminalNode Val(int i) {
			return getToken(KubeParser.Val, i);
		}
		public List<TerminalNode> Var() { return getTokens(KubeParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(KubeParser.Var, i);
		}
		public List<TerminalNode> Fun() { return getTokens(KubeParser.Fun); }
		public TerminalNode Fun(int i) {
			return getToken(KubeParser.Fun, i);
		}
		public InfixOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixOperation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitInfixOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixOperationContext infixOperation() throws RecognitionException {
		InfixOperationContext _localctx = new InfixOperationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_infixOperation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			elvisExpression();
			setState(1036);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1034);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case In:
					case NotIn:
						{
						setState(1022);
						inOperator();
						setState(1023);
						elvisExpression();
						}
						break;
					case Is:
					case NotIs:
						{
						setState(1025);
						isOperator();
						setState(1026);
						type();
						}
						break;
					case Has:
					case NotHas:
						{
						setState(1028);
						hasOperator();
						setState(1029);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Var) | (1L << Val) | (1L << Fun))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1030);
						match(Identifier);
						setState(1031);
						match(T__8);
						setState(1032);
						type();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1038);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElvisExpressionContext extends ParserRuleContext {
		public List<RangeExpressionContext> rangeExpression() {
			return getRuleContexts(RangeExpressionContext.class);
		}
		public RangeExpressionContext rangeExpression(int i) {
			return getRuleContext(RangeExpressionContext.class,i);
		}
		public List<TerminalNode> Elvis() { return getTokens(KubeParser.Elvis); }
		public TerminalNode Elvis(int i) {
			return getToken(KubeParser.Elvis, i);
		}
		public ElvisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elvisExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitElvisExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElvisExpressionContext elvisExpression() throws RecognitionException {
		ElvisExpressionContext _localctx = new ElvisExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_elvisExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			rangeExpression();
			setState(1044);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1040);
					match(Elvis);
					setState(1041);
					rangeExpression();
					}
					} 
				}
				setState(1046);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeExpressionContext extends ParserRuleContext {
		public List<BitwiseExpressionContext> bitwiseExpression() {
			return getRuleContexts(BitwiseExpressionContext.class);
		}
		public BitwiseExpressionContext bitwiseExpression(int i) {
			return getRuleContext(BitwiseExpressionContext.class,i);
		}
		public List<RangeOperatorContext> rangeOperator() {
			return getRuleContexts(RangeOperatorContext.class);
		}
		public RangeOperatorContext rangeOperator(int i) {
			return getRuleContext(RangeOperatorContext.class,i);
		}
		public RangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeExpressionContext rangeExpression() throws RecognitionException {
		RangeExpressionContext _localctx = new RangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_rangeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			bitwiseExpression();
			setState(1053);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1048);
					rangeOperator();
					setState(1049);
					bitwiseExpression();
					}
					} 
				}
				setState(1055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitwiseExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<BitwiseOperatorContext> bitwiseOperator() {
			return getRuleContexts(BitwiseOperatorContext.class);
		}
		public BitwiseOperatorContext bitwiseOperator(int i) {
			return getRuleContext(BitwiseOperatorContext.class,i);
		}
		public BitwiseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitBitwiseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseExpressionContext bitwiseExpression() throws RecognitionException {
		BitwiseExpressionContext _localctx = new BitwiseExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_bitwiseExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			additiveExpression();
			setState(1062);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1057);
					bitwiseOperator();
					setState(1058);
					additiveExpression();
					}
					} 
				}
				setState(1064);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<AdditiveOperatorContext> additiveOperator() {
			return getRuleContexts(AdditiveOperatorContext.class);
		}
		public AdditiveOperatorContext additiveOperator(int i) {
			return getRuleContext(AdditiveOperatorContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			multiplicativeExpression();
			setState(1071);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1066);
					additiveOperator();
					setState(1067);
					multiplicativeExpression();
					}
					} 
				}
				setState(1073);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<PrefixUnaryExpressionContext> prefixUnaryExpression() {
			return getRuleContexts(PrefixUnaryExpressionContext.class);
		}
		public PrefixUnaryExpressionContext prefixUnaryExpression(int i) {
			return getRuleContext(PrefixUnaryExpressionContext.class,i);
		}
		public List<MultiplicativeOperatorContext> multiplicativeOperator() {
			return getRuleContexts(MultiplicativeOperatorContext.class);
		}
		public MultiplicativeOperatorContext multiplicativeOperator(int i) {
			return getRuleContext(MultiplicativeOperatorContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			prefixUnaryExpression();
			setState(1080);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1075);
					multiplicativeOperator();
					setState(1076);
					prefixUnaryExpression();
					}
					} 
				}
				setState(1082);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixUnaryExpressionContext extends ParserRuleContext {
		public PostfixUnaryExpressionContext postfixUnaryExpression() {
			return getRuleContext(PostfixUnaryExpressionContext.class,0);
		}
		public List<PreUnaryOperatorContext> preUnaryOperator() {
			return getRuleContexts(PreUnaryOperatorContext.class);
		}
		public PreUnaryOperatorContext preUnaryOperator(int i) {
			return getRuleContext(PreUnaryOperatorContext.class,i);
		}
		public PrefixUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixUnaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitPrefixUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixUnaryExpressionContext prefixUnaryExpression() throws RecognitionException {
		PrefixUnaryExpressionContext _localctx = new PrefixUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_prefixUnaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0)) {
				{
				{
				setState(1083);
				preUnaryOperator();
				}
				}
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1089);
			postfixUnaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixUnaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<PostfixUnarySuffixContext> postfixUnarySuffix() {
			return getRuleContexts(PostfixUnarySuffixContext.class);
		}
		public PostfixUnarySuffixContext postfixUnarySuffix(int i) {
			return getRuleContext(PostfixUnarySuffixContext.class,i);
		}
		public PostfixUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixUnaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitPostfixUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixUnaryExpressionContext postfixUnaryExpression() throws RecognitionException {
		PostfixUnaryExpressionContext _localctx = new PostfixUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_postfixUnaryExpression);
		try {
			int _alt;
			setState(1098);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1091);
				primaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092);
				primaryExpression();
				setState(1094); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1093);
						postfixUnarySuffix();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1096); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixUnarySuffixContext extends ParserRuleContext {
		public PostUnaryOperatorContext postUnaryOperator() {
			return getRuleContext(PostUnaryOperatorContext.class,0);
		}
		public GenericContext generic() {
			return getRuleContext(GenericContext.class,0);
		}
		public CallSuffixContext callSuffix() {
			return getRuleContext(CallSuffixContext.class,0);
		}
		public IndexingSuffixContext indexingSuffix() {
			return getRuleContext(IndexingSuffixContext.class,0);
		}
		public NavigationSuffixContext navigationSuffix() {
			return getRuleContext(NavigationSuffixContext.class,0);
		}
		public PostfixUnarySuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixUnarySuffix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitPostfixUnarySuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixUnarySuffixContext postfixUnarySuffix() throws RecognitionException {
		PostfixUnarySuffixContext _localctx = new PostfixUnarySuffixContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_postfixUnarySuffix);
		try {
			setState(1105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Increment:
			case Decrement:
				enterOuterAlt(_localctx, 1);
				{
				setState(1100);
				postUnaryOperator();
				}
				break;
			case LessThan:
				enterOuterAlt(_localctx, 2);
				{
				setState(1101);
				generic();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(1102);
				callSuffix();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 4);
				{
				setState(1103);
				indexingSuffix();
				}
				break;
			case NoneSafeAccess:
			case NonNoneAccess:
				enterOuterAlt(_localctx, 5);
				{
				setState(1104);
				navigationSuffix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallSuffixContext extends ParserRuleContext {
		public List<ParameterExpressionContext> parameterExpression() {
			return getRuleContexts(ParameterExpressionContext.class);
		}
		public ParameterExpressionContext parameterExpression(int i) {
			return getRuleContext(ParameterExpressionContext.class,i);
		}
		public CallSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callSuffix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitCallSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallSuffixContext callSuffix() throws RecognitionException {
		CallSuffixContext _localctx = new CallSuffixContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_callSuffix);
		try {
			int _alt;
			setState(1118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1107);
				match(T__16);
				setState(1108);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1109);
				match(T__16);
				setState(1110);
				parameterExpression();
				setState(1115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1111);
						match(T__11);
						setState(1112);
						parameterExpression();
						}
						} 
					}
					setState(1117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexingSuffixContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IndexingSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexingSuffix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitIndexingSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexingSuffixContext indexingSuffix() throws RecognitionException {
		IndexingSuffixContext _localctx = new IndexingSuffixContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_indexingSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			match(T__42);
			setState(1121);
			expression();
			setState(1126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(1122);
				match(T__11);
				setState(1123);
				expression();
				}
				}
				setState(1128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1129);
			match(T__43);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NavigationSuffixContext extends ParserRuleContext {
		public MemberAccessContext memberAccess() {
			return getRuleContext(MemberAccessContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public NavigationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigationSuffix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitNavigationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigationSuffixContext navigationSuffix() throws RecognitionException {
		NavigationSuffixContext _localctx = new NavigationSuffixContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_navigationSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			memberAccess();
			setState(1132);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ThisExpressionContext thisExpression() {
			return getRuleContext(ThisExpressionContext.class,0);
		}
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public WhenExpressionContext whenExpression() {
			return getRuleContext(WhenExpressionContext.class,0);
		}
		public ReturnExpressionContext returnExpression() {
			return getRuleContext(ReturnExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_primaryExpression);
		try {
			setState(1144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1134);
				match(T__16);
				setState(1135);
				expression();
				setState(1136);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1139);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1140);
				thisExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1141);
				ifExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1142);
				whenExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1143);
				returnExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThisExpressionContext extends ParserRuleContext {
		public ThisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisExpressionContext thisExpression() throws RecognitionException {
		ThisExpressionContext _localctx = new ThisExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_thisExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public LambdaLiteralContext lambdaLiteral() {
			return getRuleContext(LambdaLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode IntegerLiteral() { return getToken(KubeParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(KubeParser.FloatingPointLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(KubeParser.StringLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(KubeParser.CharacterLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(KubeParser.BooleanLiteral, 0); }
		public TerminalNode NoneLiteral() { return getToken(KubeParser.NoneLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_literal);
		try {
			setState(1160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1148);
				array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1149);
				map();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1150);
				set();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1151);
				tuple();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1152);
				lambdaLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1153);
				objectLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1154);
				match(IntegerLiteral);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1155);
				match(FloatingPointLiteral);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1156);
				match(StringLiteral);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1157);
				match(CharacterLiteral);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1158);
				match(BooleanLiteral);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1159);
				match(NoneLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_array);
		int _la;
		try {
			setState(1175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1162);
				match(T__42);
				setState(1163);
				match(T__43);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1164);
				match(T__42);
				setState(1165);
				expression();
				setState(1170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(1166);
					match(T__11);
					setState(1167);
					expression();
					}
					}
					setState(1172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1173);
				match(T__43);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_map);
		int _la;
		try {
			setState(1195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1177);
				match(T__1);
				setState(1178);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1179);
				match(T__1);
				setState(1180);
				expression();
				setState(1181);
				match(T__44);
				setState(1182);
				expression();
				setState(1190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(1183);
					match(T__11);
					setState(1184);
					expression();
					setState(1185);
					match(T__44);
					setState(1186);
					expression();
					}
					}
					setState(1192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1193);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			match(T__1);
			setState(1198);
			expression();
			setState(1203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(1199);
				match(T__11);
				setState(1200);
				expression();
				}
				}
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1206);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_tuple);
		int _la;
		try {
			int _alt;
			setState(1228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1208);
				match(T__16);
				setState(1209);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1210);
				match(T__16);
				setState(1211);
				expression();
				setState(1212);
				match(T__11);
				setState(1213);
				match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1215);
				match(T__16);
				setState(1216);
				expression();
				setState(1219); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1217);
						match(T__11);
						setState(1218);
						expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1221); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(1223);
					match(T__11);
					}
				}

				setState(1226);
				match(T__17);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaLiteralContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<LambdaParameterContext> lambdaParameter() {
			return getRuleContexts(LambdaParameterContext.class);
		}
		public LambdaParameterContext lambdaParameter(int i) {
			return getRuleContext(LambdaParameterContext.class,i);
		}
		public LambdaLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitLambdaLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaLiteralContext lambdaLiteral() throws RecognitionException {
		LambdaLiteralContext _localctx = new LambdaLiteralContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_lambdaLiteral);
		int _la;
		try {
			setState(1256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1230);
				match(T__1);
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__16) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__42) | (1L << T__45) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(1231);
					statement();
					}
					}
					setState(1236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1237);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1238);
				match(T__1);
				setState(1239);
				lambdaParameter();
				setState(1244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(1240);
					match(T__11);
					setState(1241);
					lambdaParameter();
					}
					}
					setState(1246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1247);
				match(T__27);
				setState(1251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__16) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__42) | (1L << T__45) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(1248);
					statement();
					}
					}
					setState(1253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1254);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LambdaParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitLambdaParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParameterContext lambdaParameter() throws RecognitionException {
		LambdaParameterContext _localctx = new LambdaParameterContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_lambdaParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			match(Identifier);
			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(1259);
				match(T__8);
				setState(1260);
				type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectLiteralContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ObjectElementContext> objectElement() {
			return getRuleContexts(ObjectElementContext.class);
		}
		public ObjectElementContext objectElement(int i) {
			return getRuleContext(ObjectElementContext.class,i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			match(T__12);
			setState(1266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(1264);
				match(T__8);
				setState(1265);
				type();
				}
			}

			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(1268);
				match(T__10);
				setState(1269);
				expression();
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(1270);
					match(T__11);
					setState(1271);
					expression();
					}
					}
					setState(1276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(1279);
			match(T__1);
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << Var) | (1L << Val) | (1L << Fun))) != 0)) {
				{
				{
				setState(1280);
				objectElement();
				}
				}
				setState(1285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1286);
			match(T__2);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitReturnExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnExpressionContext returnExpression() throws RecognitionException {
		ReturnExpressionContext _localctx = new ReturnExpressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_returnExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(T__45);
			setState(1290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1289);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberAccessContext extends ParserRuleContext {
		public TerminalNode NoneSafeAccess() { return getToken(KubeParser.NoneSafeAccess, 0); }
		public TerminalNode NonNoneAccess() { return getToken(KubeParser.NonNoneAccess, 0); }
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_memberAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			_la = _input.LA(1);
			if ( !(_la==NoneSafeAccess || _la==NonNoneAccess) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostUnaryOperatorContext extends ParserRuleContext {
		public TerminalNode Increment() { return getToken(KubeParser.Increment, 0); }
		public TerminalNode Decrement() { return getToken(KubeParser.Decrement, 0); }
		public PostUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postUnaryOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitPostUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostUnaryOperatorContext postUnaryOperator() throws RecognitionException {
		PostUnaryOperatorContext _localctx = new PostUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_postUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			_la = _input.LA(1);
			if ( !(_la==Increment || _la==Decrement) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreUnaryOperatorContext extends ParserRuleContext {
		public TerminalNode Increment() { return getToken(KubeParser.Increment, 0); }
		public TerminalNode Decrement() { return getToken(KubeParser.Decrement, 0); }
		public TerminalNode Plus() { return getToken(KubeParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(KubeParser.Minus, 0); }
		public TerminalNode LogicalNot() { return getToken(KubeParser.LogicalNot, 0); }
		public TerminalNode BitwiseNot() { return getToken(KubeParser.BitwiseNot, 0); }
		public PreUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitPreUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryOperatorContext preUnaryOperator() throws RecognitionException {
		PreUnaryOperatorContext _localctx = new PreUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_preUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeOperatorContext extends ParserRuleContext {
		public TerminalNode Multiply() { return getToken(KubeParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(KubeParser.Divide, 0); }
		public TerminalNode Modulus() { return getToken(KubeParser.Modulus, 0); }
		public TerminalNode DivideModulus() { return getToken(KubeParser.DivideModulus, 0); }
		public MultiplicativeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOperatorContext multiplicativeOperator() throws RecognitionException {
		MultiplicativeOperatorContext _localctx = new MultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << DivideModulus))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveOperatorContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(KubeParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(KubeParser.Minus, 0); }
		public AdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			_la = _input.LA(1);
			if ( !(_la==Plus || _la==Minus) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitwiseOperatorContext extends ParserRuleContext {
		public TerminalNode LeftShift() { return getToken(KubeParser.LeftShift, 0); }
		public TerminalNode ArithmeticRightShift() { return getToken(KubeParser.ArithmeticRightShift, 0); }
		public TerminalNode LogicalRightShift() { return getToken(KubeParser.LogicalRightShift, 0); }
		public TerminalNode BitwiseAnd() { return getToken(KubeParser.BitwiseAnd, 0); }
		public TerminalNode BitwiseXor() { return getToken(KubeParser.BitwiseXor, 0); }
		public TerminalNode BitwiseOr() { return getToken(KubeParser.BitwiseOr, 0); }
		public BitwiseOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitBitwiseOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseOperatorContext bitwiseOperator() throws RecognitionException {
		BitwiseOperatorContext _localctx = new BitwiseOperatorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_bitwiseOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (LeftShift - 63)) | (1L << (ArithmeticRightShift - 63)) | (1L << (LogicalRightShift - 63)) | (1L << (BitwiseAnd - 63)) | (1L << (BitwiseXor - 63)) | (1L << (BitwiseOr - 63)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeOperatorContext extends ParserRuleContext {
		public TerminalNode RangeTo() { return getToken(KubeParser.RangeTo, 0); }
		public TerminalNode RangeUntil() { return getToken(KubeParser.RangeUntil, 0); }
		public RangeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitRangeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeOperatorContext rangeOperator() throws RecognitionException {
		RangeOperatorContext _localctx = new RangeOperatorContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_rangeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
			_la = _input.LA(1);
			if ( !(_la==RangeTo || _la==RangeUntil) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalOperatorContext extends ParserRuleContext {
		public TerminalNode LessThan() { return getToken(KubeParser.LessThan, 0); }
		public TerminalNode LessThanEqual() { return getToken(KubeParser.LessThanEqual, 0); }
		public TerminalNode GreaterThan() { return getToken(KubeParser.GreaterThan, 0); }
		public TerminalNode GreaterThanEqual() { return getToken(KubeParser.GreaterThanEqual, 0); }
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitRelationalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LessThan - 71)) | (1L << (LessThanEqual - 71)) | (1L << (GreaterThan - 71)) | (1L << (GreaterThanEqual - 71)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsOperatorContext extends ParserRuleContext {
		public TerminalNode Is() { return getToken(KubeParser.Is, 0); }
		public TerminalNode NotIs() { return getToken(KubeParser.NotIs, 0); }
		public IsOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitIsOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsOperatorContext isOperator() throws RecognitionException {
		IsOperatorContext _localctx = new IsOperatorContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_isOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308);
			_la = _input.LA(1);
			if ( !(_la==Is || _la==NotIs) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InOperatorContext extends ParserRuleContext {
		public TerminalNode In() { return getToken(KubeParser.In, 0); }
		public TerminalNode NotIn() { return getToken(KubeParser.NotIn, 0); }
		public InOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitInOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InOperatorContext inOperator() throws RecognitionException {
		InOperatorContext _localctx = new InOperatorContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_inOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			_la = _input.LA(1);
			if ( !(_la==In || _la==NotIn) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HasOperatorContext extends ParserRuleContext {
		public TerminalNode Has() { return getToken(KubeParser.Has, 0); }
		public TerminalNode NotHas() { return getToken(KubeParser.NotHas, 0); }
		public HasOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hasOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitHasOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HasOperatorContext hasOperator() throws RecognitionException {
		HasOperatorContext _localctx = new HasOperatorContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_hasOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			_la = _input.LA(1);
			if ( !(_la==Has || _la==NotHas) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityOperatorContext extends ParserRuleContext {
		public TerminalNode Equals() { return getToken(KubeParser.Equals, 0); }
		public TerminalNode NotEquals() { return getToken(KubeParser.NotEquals, 0); }
		public EqualityOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitEqualityOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityOperatorContext equalityOperator() throws RecognitionException {
		EqualityOperatorContext _localctx = new EqualityOperatorContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			_la = _input.LA(1);
			if ( !(_la==Equals || _la==NotEquals) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ElseExpressionContext elseExpression() {
			return getRuleContext(ElseExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_ifExpression);
		try {
			int _alt;
			setState(1338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1316);
				match(T__24);
				setState(1317);
				match(T__16);
				setState(1318);
				expression();
				setState(1319);
				match(T__17);
				setState(1320);
				expression();
				setState(1321);
				elseExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1323);
				match(T__24);
				setState(1324);
				match(T__16);
				setState(1325);
				expression();
				setState(1326);
				match(T__17);
				setState(1327);
				match(T__1);
				setState(1331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1328);
						statement();
						}
						} 
					}
					setState(1333);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				}
				setState(1334);
				expression();
				setState(1335);
				match(T__2);
				setState(1336);
				elseExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitElseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseExpressionContext elseExpression() throws RecognitionException {
		ElseExpressionContext _localctx = new ElseExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_elseExpression);
		try {
			int _alt;
			setState(1353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1340);
				match(T__25);
				setState(1341);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1342);
				match(T__25);
				setState(1343);
				match(T__1);
				setState(1347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1344);
						statement();
						}
						} 
					}
					setState(1349);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				}
				setState(1350);
				expression();
				setState(1351);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueDeclarationContext valueDeclaration() {
			return getRuleContext(ValueDeclarationContext.class,0);
		}
		public List<WhenExpressionEntryContext> whenExpressionEntry() {
			return getRuleContexts(WhenExpressionEntryContext.class);
		}
		public WhenExpressionEntryContext whenExpressionEntry(int i) {
			return getRuleContext(WhenExpressionEntryContext.class,i);
		}
		public WhenExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitWhenExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenExpressionContext whenExpression() throws RecognitionException {
		WhenExpressionContext _localctx = new WhenExpressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_whenExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			match(T__26);
			setState(1356);
			match(T__16);
			setState(1360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Val) {
				{
				setState(1357);
				valueDeclaration();
				setState(1358);
				match(T__5);
				}
			}

			setState(1362);
			expression();
			setState(1363);
			match(T__17);
			setState(1364);
			match(T__1);
			setState(1368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__16) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__42) | (1L << T__45) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Is - 76)) | (1L << (NotIs - 76)) | (1L << (In - 76)) | (1L << (NotIn - 76)) | (1L << (Has - 76)) | (1L << (NotHas - 76)) | (1L << (IntegerLiteral - 76)) | (1L << (FloatingPointLiteral - 76)) | (1L << (BooleanLiteral - 76)) | (1L << (CharacterLiteral - 76)) | (1L << (StringLiteral - 76)) | (1L << (NoneLiteral - 76)) | (1L << (Identifier - 76)))) != 0)) {
				{
				{
				setState(1365);
				whenExpressionEntry();
				}
				}
				setState(1370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1371);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenExpressionEntryContext extends ParserRuleContext {
		public List<WhenConditionContext> whenCondition() {
			return getRuleContexts(WhenConditionContext.class);
		}
		public WhenConditionContext whenCondition(int i) {
			return getRuleContext(WhenConditionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhenExpressionEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenExpressionEntry; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitWhenExpressionEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenExpressionEntryContext whenExpressionEntry() throws RecognitionException {
		WhenExpressionEntryContext _localctx = new WhenExpressionEntryContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_whenExpressionEntry);
		int _la;
		try {
			int _alt;
			setState(1418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1373);
				whenCondition();
				setState(1378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(1374);
					match(T__11);
					setState(1375);
					whenCondition();
					}
					}
					setState(1380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1381);
				match(T__27);
				setState(1382);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1384);
				whenCondition();
				setState(1389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(1385);
					match(T__11);
					setState(1386);
					whenCondition();
					}
					}
					setState(1391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1392);
				match(T__27);
				setState(1393);
				match(T__1);
				setState(1397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1394);
						statement();
						}
						} 
					}
					setState(1399);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				}
				setState(1400);
				expression();
				setState(1401);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1403);
				match(T__25);
				setState(1404);
				match(T__27);
				setState(1405);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1406);
				match(T__25);
				setState(1407);
				match(T__27);
				setState(1408);
				match(T__1);
				setState(1412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1409);
						statement();
						}
						} 
					}
					setState(1414);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				}
				setState(1415);
				expression();
				setState(1416);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericDeclarationContext extends ParserRuleContext {
		public TerminalNode LessThan() { return getToken(KubeParser.LessThan, 0); }
		public List<GenericTypeDeclarationContext> genericTypeDeclaration() {
			return getRuleContexts(GenericTypeDeclarationContext.class);
		}
		public GenericTypeDeclarationContext genericTypeDeclaration(int i) {
			return getRuleContext(GenericTypeDeclarationContext.class,i);
		}
		public TerminalNode GreaterThan() { return getToken(KubeParser.GreaterThan, 0); }
		public GenericDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitGenericDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericDeclarationContext genericDeclaration() throws RecognitionException {
		GenericDeclarationContext _localctx = new GenericDeclarationContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_genericDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			match(LessThan);
			setState(1421);
			genericTypeDeclaration();
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(1422);
				match(T__11);
				setState(1423);
				genericTypeDeclaration();
				}
				}
				setState(1428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1429);
			match(GreaterThan);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public GenericTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitGenericTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericTypeDeclarationContext genericTypeDeclaration() throws RecognitionException {
		GenericTypeDeclarationContext _localctx = new GenericTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_genericTypeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			match(Identifier);
			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(1432);
				match(T__8);
				setState(1433);
				type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericContext extends ParserRuleContext {
		public TerminalNode LessThan() { return getToken(KubeParser.LessThan, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode GreaterThan() { return getToken(KubeParser.GreaterThan, 0); }
		public GenericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitGeneric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericContext generic() throws RecognitionException {
		GenericContext _localctx = new GenericContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_generic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
			match(LessThan);
			setState(1437);
			type();
			setState(1442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(1438);
				match(T__11);
				setState(1439);
				type();
				}
				}
				setState(1444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1445);
			match(GreaterThan);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public UnionTypeContext unionType() {
			return getRuleContext(UnionTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			unionType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionTypeContext extends ParserRuleContext {
		public List<IntersectionTypeContext> intersectionType() {
			return getRuleContexts(IntersectionTypeContext.class);
		}
		public IntersectionTypeContext intersectionType(int i) {
			return getRuleContext(IntersectionTypeContext.class,i);
		}
		public List<TerminalNode> BitwiseOr() { return getTokens(KubeParser.BitwiseOr); }
		public TerminalNode BitwiseOr(int i) {
			return getToken(KubeParser.BitwiseOr, i);
		}
		public UnionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitUnionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionTypeContext unionType() throws RecognitionException {
		UnionTypeContext _localctx = new UnionTypeContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_unionType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			intersectionType();
			setState(1454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1450);
					match(BitwiseOr);
					setState(1451);
					intersectionType();
					}
					} 
				}
				setState(1456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntersectionTypeContext extends ParserRuleContext {
		public List<PrimaryTypeContext> primaryType() {
			return getRuleContexts(PrimaryTypeContext.class);
		}
		public PrimaryTypeContext primaryType(int i) {
			return getRuleContext(PrimaryTypeContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(KubeParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(KubeParser.Plus, i);
		}
		public IntersectionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectionType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitIntersectionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntersectionTypeContext intersectionType() throws RecognitionException {
		IntersectionTypeContext _localctx = new IntersectionTypeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_intersectionType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			primaryType();
			setState(1462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1458);
					match(Plus);
					setState(1459);
					primaryType();
					}
					} 
				}
				setState(1464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(KubeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(KubeParser.Identifier, i);
		}
		public TerminalNode NonNoneAccess() { return getToken(KubeParser.NonNoneAccess, 0); }
		public GenericContext generic() {
			return getRuleContext(GenericContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PrimaryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitPrimaryType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryTypeContext primaryType() throws RecognitionException {
		PrimaryTypeContext _localctx = new PrimaryTypeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_primaryType);
		try {
			setState(1478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1465);
				match(Identifier);
				setState(1468);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1466);
					match(NonNoneAccess);
					setState(1467);
					match(Identifier);
					}
					break;
				}
				setState(1471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1470);
					generic();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1473);
				functionType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1474);
				match(T__16);
				setState(1475);
				type();
				setState(1476);
				match(T__17);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeContext extends ParserRuleContext {
		public FunctionParameterTypesContext functionParameterTypes() {
			return getRuleContext(FunctionParameterTypesContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			functionParameterTypes();
			setState(1481);
			match(T__27);
			setState(1482);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParameterTypesContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public FunctionParameterTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameterTypes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitFunctionParameterTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterTypesContext functionParameterTypes() throws RecognitionException {
		FunctionParameterTypesContext _localctx = new FunctionParameterTypesContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_functionParameterTypes);
		int _la;
		try {
			setState(1497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1484);
				match(T__16);
				setState(1485);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1486);
				match(T__16);
				setState(1487);
				type();
				setState(1492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(1488);
					match(T__11);
					setState(1489);
					type();
					}
					}
					setState(1494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1495);
				match(T__17);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3b\u05de\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\7\2\u00ca\n\2\f\2\16\2\u00cd\13\2\3\3"+
		"\3\3\3\3\3\3\7\3\u00d3\n\3\f\3\16\3\u00d6\13\3\3\3\7\3\u00d9\n\3\f\3\16"+
		"\3\u00dc\13\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u00e7\n\5\f\5\16"+
		"\5\u00ea\13\5\3\5\3\5\7\5\u00ee\n\5\f\5\16\5\u00f1\13\5\3\5\3\5\7\5\u00f5"+
		"\n\5\f\5\16\5\u00f8\13\5\3\5\3\5\7\5\u00fc\n\5\f\5\16\5\u00ff\13\5\3\5"+
		"\3\5\7\5\u0103\n\5\f\5\16\5\u0106\13\5\3\5\3\5\7\5\u010a\n\5\f\5\16\5"+
		"\u010d\13\5\3\5\3\5\7\5\u0111\n\5\f\5\16\5\u0114\13\5\3\5\5\5\u0117\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u011f\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\5\b\u0129\n\b\3\b\3\b\5\b\u012d\n\b\3\b\3\b\7\b\u0131\n\b\f\b\16\b"+
		"\u0134\13\b\3\b\5\b\u0137\n\b\3\t\7\t\u013a\n\t\f\t\16\t\u013d\13\t\3"+
		"\t\3\t\7\t\u0141\n\t\f\t\16\t\u0144\13\t\3\t\3\t\7\t\u0148\n\t\f\t\16"+
		"\t\u014b\13\t\3\t\5\t\u014e\n\t\3\n\3\n\3\n\5\n\u0153\n\n\3\n\5\n\u0156"+
		"\n\n\3\n\3\n\5\n\u015a\n\n\3\n\3\n\3\n\3\n\7\n\u0160\n\n\f\n\16\n\u0163"+
		"\13\n\5\n\u0165\n\n\3\n\3\n\7\n\u0169\n\n\f\n\16\n\u016c\13\n\3\n\5\n"+
		"\u016f\n\n\3\13\7\13\u0172\n\13\f\13\16\13\u0175\13\13\3\13\3\13\7\13"+
		"\u0179\n\13\f\13\16\13\u017c\13\13\3\13\3\13\7\13\u0180\n\13\f\13\16\13"+
		"\u0183\13\13\3\13\3\13\7\13\u0187\n\13\f\13\16\13\u018a\13\13\3\13\3\13"+
		"\3\13\5\13\u018f\n\13\3\f\3\f\3\f\3\f\5\f\u0195\n\f\3\f\3\f\3\f\3\f\7"+
		"\f\u019b\n\f\f\f\16\f\u019e\13\f\5\f\u01a0\n\f\3\f\3\f\7\f\u01a4\n\f\f"+
		"\f\16\f\u01a7\13\f\3\f\3\f\3\r\7\r\u01ac\n\r\f\r\16\r\u01af\13\r\3\r\3"+
		"\r\7\r\u01b3\n\r\f\r\16\r\u01b6\13\r\3\r\3\r\7\r\u01ba\n\r\f\r\16\r\u01bd"+
		"\13\r\3\r\3\r\3\r\5\r\u01c2\n\r\3\16\3\16\3\16\5\16\u01c7\n\16\3\16\3"+
		"\16\5\16\u01cb\n\16\3\16\3\16\3\16\5\16\u01d0\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u01d7\n\16\3\16\3\16\5\16\u01db\n\16\3\16\3\16\3\16\3\16\7"+
		"\16\u01e1\n\16\f\16\16\16\u01e4\13\16\3\16\3\16\5\16\u01e8\n\16\3\17\3"+
		"\17\3\17\3\17\5\17\u01ee\n\17\3\17\3\17\5\17\u01f2\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u01fd\n\17\f\17\16\17\u0200\13\17"+
		"\3\17\3\17\5\17\u0204\n\17\3\20\3\20\3\20\7\20\u0209\n\20\f\20\16\20\u020c"+
		"\13\20\3\21\3\21\3\21\5\21\u0211\n\21\3\21\3\21\3\21\3\21\3\21\7\21\u0218"+
		"\n\21\f\21\16\21\u021b\13\21\3\21\3\21\5\21\u021f\n\21\3\22\3\22\5\22"+
		"\u0223\n\22\3\22\3\22\3\23\7\23\u0228\n\23\f\23\16\23\u022b\13\23\3\23"+
		"\3\23\7\23\u022f\n\23\f\23\16\23\u0232\13\23\3\23\3\23\5\23\u0236\n\23"+
		"\3\24\3\24\3\24\5\24\u023b\n\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0243"+
		"\n\24\3\24\5\24\u0246\n\24\3\24\5\24\u0249\n\24\3\24\3\24\3\24\3\24\5"+
		"\24\u024f\n\24\3\25\3\25\3\25\3\25\5\25\u0255\n\25\3\26\3\26\3\26\5\26"+
		"\u025a\n\26\3\26\5\26\u025d\n\26\3\26\3\26\3\26\3\26\5\26\u0263\n\26\3"+
		"\27\3\27\3\27\3\27\5\27\u0269\n\27\3\30\3\30\3\30\3\30\3\30\6\30\u0270"+
		"\n\30\r\30\16\30\u0271\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\6\31\u027c"+
		"\n\31\r\31\16\31\u027d\3\31\3\31\3\32\3\32\3\32\7\32\u0285\n\32\f\32\16"+
		"\32\u0288\13\32\3\32\3\32\3\33\3\33\3\33\5\33\u028f\n\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0295\n\33\3\33\3\33\3\33\5\33\u029a\n\33\3\33\3\33\3\33\3"+
		"\33\7\33\u02a0\n\33\f\33\16\33\u02a3\13\33\3\33\3\33\3\33\5\33\u02a8\n"+
		"\33\5\33\u02aa\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u02b1\n\34\3\35\3\35"+
		"\3\35\7\35\u02b6\n\35\f\35\16\35\u02b9\13\35\3\35\3\35\3\36\3\36\3\36"+
		"\7\36\u02c0\n\36\f\36\16\36\u02c3\13\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\7\37\u02cd\n\37\f\37\16\37\u02d0\13\37\3\37\3\37\5\37\u02d4"+
		"\n\37\3 \5 \u02d7\n \3 \3 \3!\3!\3!\3!\5!\u02df\n!\3!\3!\7!\u02e3\n!\f"+
		"!\16!\u02e6\13!\3!\3!\3!\3!\3!\3!\7!\u02ee\n!\f!\16!\u02f1\13!\3!\3!\5"+
		"!\u02f5\n!\3!\3!\7!\u02f9\n!\f!\16!\u02fc\13!\3!\3!\5!\u0300\n!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u030c\n\"\f\"\16\"\u030f\13\"\3"+
		"\"\3\"\5\"\u0313\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0321\n#\3"+
		"$\3$\3$\3$\3$\3$\5$\u0329\n$\3$\3$\3$\3$\3$\3$\7$\u0331\n$\f$\16$\u0334"+
		"\13$\3$\3$\5$\u0338\n$\5$\u033a\n$\3%\3%\3%\3%\3%\7%\u0341\n%\f%\16%\u0344"+
		"\13%\3%\5%\u0347\n%\3&\3&\3&\3&\3&\5&\u034e\n&\3&\3&\3&\3&\7&\u0354\n"+
		"&\f&\16&\u0357\13&\3&\3&\3\'\3\'\3\'\7\'\u035e\n\'\f\'\16\'\u0361\13\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0369\n\'\f\'\16\'\u036c\13\'\3\'\3\'\3\'"+
		"\7\'\u0371\n\'\f\'\16\'\u0374\13\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\7\'\u037f\n\'\f\'\16\'\u0382\13\'\3\'\5\'\u0385\n\'\3(\3(\3(\3(\5(\u038b"+
		"\n(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\7,\u03a8\n,\f,\16,\u03ab\13,\3,\3,\5,\u03af\n,\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u03bd\n-\f-\16-\u03c0\13-\3-\3-\5-\u03c4"+
		"\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u03d0\n.\f.\16.\u03d3\13.\3.\3.\3"+
		".\3.\3.\3.\5.\u03db\n.\3/\3/\3\60\3\60\3\61\3\61\3\61\7\61\u03e4\n\61"+
		"\f\61\16\61\u03e7\13\61\3\62\3\62\3\62\7\62\u03ec\n\62\f\62\16\62\u03ef"+
		"\13\62\3\63\3\63\3\63\3\63\7\63\u03f5\n\63\f\63\16\63\u03f8\13\63\3\64"+
		"\3\64\3\64\3\64\5\64\u03fe\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\7\65\u040d\n\65\f\65\16\65\u0410\13\65\3\66"+
		"\3\66\3\66\7\66\u0415\n\66\f\66\16\66\u0418\13\66\3\67\3\67\3\67\3\67"+
		"\7\67\u041e\n\67\f\67\16\67\u0421\13\67\38\38\38\38\78\u0427\n8\f8\16"+
		"8\u042a\138\39\39\39\39\79\u0430\n9\f9\169\u0433\139\3:\3:\3:\3:\7:\u0439"+
		"\n:\f:\16:\u043c\13:\3;\7;\u043f\n;\f;\16;\u0442\13;\3;\3;\3<\3<\3<\6"+
		"<\u0449\n<\r<\16<\u044a\5<\u044d\n<\3=\3=\3=\3=\3=\5=\u0454\n=\3>\3>\3"+
		">\3>\3>\3>\7>\u045c\n>\f>\16>\u045f\13>\5>\u0461\n>\3?\3?\3?\3?\7?\u0467"+
		"\n?\f?\16?\u046a\13?\3?\3?\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u047b"+
		"\nA\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u048b\nC\3D\3D\3D\3D"+
		"\3D\3D\7D\u0493\nD\fD\16D\u0496\13D\3D\3D\5D\u049a\nD\3E\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\7E\u04a7\nE\fE\16E\u04aa\13E\3E\3E\5E\u04ae\nE\3F\3F"+
		"\3F\3F\7F\u04b4\nF\fF\16F\u04b7\13F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\6G\u04c6\nG\rG\16G\u04c7\3G\5G\u04cb\nG\3G\3G\5G\u04cf\nG\3H\3H\7"+
		"H\u04d3\nH\fH\16H\u04d6\13H\3H\3H\3H\3H\3H\7H\u04dd\nH\fH\16H\u04e0\13"+
		"H\3H\3H\7H\u04e4\nH\fH\16H\u04e7\13H\3H\3H\5H\u04eb\nH\3I\3I\3I\5I\u04f0"+
		"\nI\3J\3J\3J\5J\u04f5\nJ\3J\3J\3J\3J\7J\u04fb\nJ\fJ\16J\u04fe\13J\5J\u0500"+
		"\nJ\3J\3J\7J\u0504\nJ\fJ\16J\u0507\13J\3J\3J\3K\3K\5K\u050d\nK\3L\3L\3"+
		"M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3"+
		"X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\7X\u0534\nX\fX\16X\u0537\13X\3X\3X"+
		"\3X\3X\5X\u053d\nX\3Y\3Y\3Y\3Y\3Y\7Y\u0544\nY\fY\16Y\u0547\13Y\3Y\3Y\3"+
		"Y\5Y\u054c\nY\3Z\3Z\3Z\3Z\3Z\5Z\u0553\nZ\3Z\3Z\3Z\3Z\7Z\u0559\nZ\fZ\16"+
		"Z\u055c\13Z\3Z\3Z\3[\3[\3[\7[\u0563\n[\f[\16[\u0566\13[\3[\3[\3[\3[\3"+
		"[\3[\7[\u056e\n[\f[\16[\u0571\13[\3[\3[\3[\7[\u0576\n[\f[\16[\u0579\13"+
		"[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\7[\u0585\n[\f[\16[\u0588\13[\3[\3[\3["+
		"\5[\u058d\n[\3\\\3\\\3\\\3\\\7\\\u0593\n\\\f\\\16\\\u0596\13\\\3\\\3\\"+
		"\3]\3]\3]\5]\u059d\n]\3^\3^\3^\3^\7^\u05a3\n^\f^\16^\u05a6\13^\3^\3^\3"+
		"_\3_\3`\3`\3`\7`\u05af\n`\f`\16`\u05b2\13`\3a\3a\3a\7a\u05b7\na\fa\16"+
		"a\u05ba\13a\3b\3b\3b\5b\u05bf\nb\3b\5b\u05c2\nb\3b\3b\3b\3b\3b\5b\u05c9"+
		"\nb\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\7d\u05d5\nd\fd\16d\u05d8\13d\3d\3d\5"+
		"d\u05dc\nd\3d\2\2e\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\2\21\3\2\61\62\4\2\b"+
		"\b\",\3\2\61\63\3\2\64\65\3\2\66\67\4\2\669?@\3\2;>\3\2?@\3\2AF\3\2GH"+
		"\3\2IL\3\2NO\3\2PQ\3\2RS\3\2TU\2\u065a\2\u00cb\3\2\2\2\4\u00ce\3\2\2\2"+
		"\6\u00df\3\2\2\2\b\u0116\3\2\2\2\n\u0118\3\2\2\2\f\u0120\3\2\2\2\16\u0125"+
		"\3\2\2\2\20\u014d\3\2\2\2\22\u014f\3\2\2\2\24\u018e\3\2\2\2\26\u0190\3"+
		"\2\2\2\30\u01c1\3\2\2\2\32\u01e7\3\2\2\2\34\u0203\3\2\2\2\36\u0205\3\2"+
		"\2\2 \u021e\3\2\2\2\"\u0222\3\2\2\2$\u0235\3\2\2\2&\u024e\3\2\2\2(\u0250"+
		"\3\2\2\2*\u0262\3\2\2\2,\u0264\3\2\2\2.\u026a\3\2\2\2\60\u0275\3\2\2\2"+
		"\62\u0281\3\2\2\2\64\u02a9\3\2\2\2\66\u02ab\3\2\2\28\u02b2\3\2\2\2:\u02bc"+
		"\3\2\2\2<\u02d3\3\2\2\2>\u02d6\3\2\2\2@\u02ff\3\2\2\2B\u0312\3\2\2\2D"+
		"\u0320\3\2\2\2F\u0339\3\2\2\2H\u0346\3\2\2\2J\u0348\3\2\2\2L\u0384\3\2"+
		"\2\2N\u038a\3\2\2\2P\u038c\3\2\2\2R\u038f\3\2\2\2T\u0392\3\2\2\2V\u03ae"+
		"\3\2\2\2X\u03c3\3\2\2\2Z\u03da\3\2\2\2\\\u03dc\3\2\2\2^\u03de\3\2\2\2"+
		"`\u03e0\3\2\2\2b\u03e8\3\2\2\2d\u03f0\3\2\2\2f\u03f9\3\2\2\2h\u03ff\3"+
		"\2\2\2j\u0411\3\2\2\2l\u0419\3\2\2\2n\u0422\3\2\2\2p\u042b\3\2\2\2r\u0434"+
		"\3\2\2\2t\u0440\3\2\2\2v\u044c\3\2\2\2x\u0453\3\2\2\2z\u0460\3\2\2\2|"+
		"\u0462\3\2\2\2~\u046d\3\2\2\2\u0080\u047a\3\2\2\2\u0082\u047c\3\2\2\2"+
		"\u0084\u048a\3\2\2\2\u0086\u0499\3\2\2\2\u0088\u04ad\3\2\2\2\u008a\u04af"+
		"\3\2\2\2\u008c\u04ce\3\2\2\2\u008e\u04ea\3\2\2\2\u0090\u04ec\3\2\2\2\u0092"+
		"\u04f1\3\2\2\2\u0094\u050a\3\2\2\2\u0096\u050e\3\2\2\2\u0098\u0510\3\2"+
		"\2\2\u009a\u0512\3\2\2\2\u009c\u0514\3\2\2\2\u009e\u0516\3\2\2\2\u00a0"+
		"\u0518\3\2\2\2\u00a2\u051a\3\2\2\2\u00a4\u051c\3\2\2\2\u00a6\u051e\3\2"+
		"\2\2\u00a8\u0520\3\2\2\2\u00aa\u0522\3\2\2\2\u00ac\u0524\3\2\2\2\u00ae"+
		"\u053c\3\2\2\2\u00b0\u054b\3\2\2\2\u00b2\u054d\3\2\2\2\u00b4\u058c\3\2"+
		"\2\2\u00b6\u058e\3\2\2\2\u00b8\u0599\3\2\2\2\u00ba\u059e\3\2\2\2\u00bc"+
		"\u05a9\3\2\2\2\u00be\u05ab\3\2\2\2\u00c0\u05b3\3\2\2\2\u00c2\u05c8\3\2"+
		"\2\2\u00c4\u05ca\3\2\2\2\u00c6\u05db\3\2\2\2\u00c8\u00ca\5\4\3\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\3\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7\3\2\2\u00cf\u00d0"+
		"\7`\2\2\u00d0\u00d4\7\4\2\2\u00d1\u00d3\5\6\4\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00da\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\5\b\5\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7\5\2\2\u00de\5\3\2\2\2\u00df\u00e0"+
		"\7\6\2\2\u00e0\u00e1\7`\2\2\u00e1\7\3\2\2\2\u00e2\u0117\58\35\2\u00e3"+
		"\u0117\5\f\7\2\u00e4\u0117\5\n\6\2\u00e5\u00e7\5\34\17\2\u00e6\u00e5\3"+
		"\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u0117\5\16\b\2\u00ec\u00ee\5"+
		"\34\17\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u0117\5\22"+
		"\n\2\u00f3\u00f5\5\34\17\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f9\u0117\5\26\f\2\u00fa\u00fc\5\34\17\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u0100\u0117\5\32\16\2\u0101\u0103\5\34\17\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0117\5\62\32\2\u0108"+
		"\u010a\5\34\17\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3"+
		"\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u0117\5&\24\2\u010f\u0111\5\34\17\2\u0110\u010f\3\2\2\2\u0111\u0114\3"+
		"\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0117\5*\26\2\u0116\u00e2\3\2\2\2\u0116\u00e3\3\2"+
		"\2\2\u0116\u00e4\3\2\2\2\u0116\u00e8\3\2\2\2\u0116\u00ef\3\2\2\2\u0116"+
		"\u00f6\3\2\2\2\u0116\u00fd\3\2\2\2\u0116\u0104\3\2\2\2\u0116\u010b\3\2"+
		"\2\2\u0116\u0112\3\2\2\2\u0117\t\3\2\2\2\u0118\u0119\7\7\2\2\u0119\u011a"+
		"\7`\2\2\u011a\u011b\7\b\2\2\u011b\u011e\7`\2\2\u011c\u011d\7\65\2\2\u011d"+
		"\u011f\7`\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\13\3\2\2\2"+
		"\u0120\u0121\7\t\2\2\u0121\u0122\7`\2\2\u0122\u0123\7\b\2\2\u0123\u0124"+
		"\5\u00bc_\2\u0124\r\3\2\2\2\u0125\u0126\7\n\2\2\u0126\u0128\7`\2\2\u0127"+
		"\u0129\5\u00b6\\\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c"+
		"\3\2\2\2\u012a\u012b\7\13\2\2\u012b\u012d\5\u00bc_\2\u012c\u012a\3\2\2"+
		"\2\u012c\u012d\3\2\2\2\u012d\u0136\3\2\2\2\u012e\u0132\7\4\2\2\u012f\u0131"+
		"\5\20\t\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2"+
		"\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0137"+
		"\7\5\2\2\u0136\u012e\3\2\2\2\u0136\u0137\3\2\2\2\u0137\17\3\2\2\2\u0138"+
		"\u013a\5\34\17\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3"+
		"\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u014e\5(\25\2\u013f\u0141\5\34\17\2\u0140\u013f\3\2\2\2\u0141\u0144\3"+
		"\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u014e\5,\27\2\u0146\u0148\5\34\17\2\u0147\u0146\3"+
		"\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014e\5\64\33\2\u014d\u013b\3"+
		"\2\2\2\u014d\u0142\3\2\2\2\u014d\u0149\3\2\2\2\u014e\21\3\2\2\2\u014f"+
		"\u0150\7\f\2\2\u0150\u0152\7`\2\2\u0151\u0153\5\u00b6\\\2\u0152\u0151"+
		"\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0156\5<\37\2\u0155"+
		"\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0158\7\13"+
		"\2\2\u0158\u015a\5\u00bc_\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u0164\3\2\2\2\u015b\u015c\7\r\2\2\u015c\u0161\5^\60\2\u015d\u015e\7\16"+
		"\2\2\u015e\u0160\5^\60\2\u015f\u015d\3\2\2\2\u0160\u0163\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2"+
		"\2\2\u0164\u015b\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u016e\3\2\2\2\u0166"+
		"\u016a\7\4\2\2\u0167\u0169\5\24\13\2\u0168\u0167\3\2\2\2\u0169\u016c\3"+
		"\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016d\u016f\7\5\2\2\u016e\u0166\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\23\3\2\2\2\u0170\u0172\5\34\17\2\u0171\u0170\3\2\2\2\u0172"+
		"\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0176\u018f\5&\24\2\u0177\u0179\5\34\17\2\u0178"+
		"\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u018f\5*\26\2\u017e"+
		"\u0180\5\34\17\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3"+
		"\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184"+
		"\u018f\5\62\32\2\u0185\u0187\5\34\17\2\u0186\u0185\3\2\2\2\u0187\u018a"+
		"\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018b\u018f\5@!\2\u018c\u018f\58\35\2\u018d\u018f\5:\36"+
		"\2\u018e\u0173\3\2\2\2\u018e\u017a\3\2\2\2\u018e\u0181\3\2\2\2\u018e\u0188"+
		"\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f\25\3\2\2\2\u0190"+
		"\u0191\7\17\2\2\u0191\u0194\7`\2\2\u0192\u0193\7\13\2\2\u0193\u0195\5"+
		"\u00bc_\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u019f\3\2\2\2"+
		"\u0196\u0197\7\r\2\2\u0197\u019c\5^\60\2\u0198\u0199\7\16\2\2\u0199\u019b"+
		"\5^\60\2\u019a\u0198\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u0196\3\2"+
		"\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a5\7\4\2\2\u01a2"+
		"\u01a4\5\30\r\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3"+
		"\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8"+
		"\u01a9\7\5\2\2\u01a9\27\3\2\2\2\u01aa\u01ac\5\34\17\2\u01ab\u01aa\3\2"+
		"\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01c2\5&\24\2\u01b1\u01b3\5\34"+
		"\17\2\u01b2\u01b1\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01c2\5*"+
		"\26\2\u01b8\u01ba\5\34\17\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bb\3\2"+
		"\2\2\u01be\u01c2\5\62\32\2\u01bf\u01c2\58\35\2\u01c0\u01c2\5:\36\2\u01c1"+
		"\u01ad\3\2\2\2\u01c1\u01b4\3\2\2\2\u01c1\u01bb\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c1\u01c0\3\2\2\2\u01c2\31\3\2\2\2\u01c3\u01c4\7\20\2\2\u01c4\u01c6"+
		"\7`\2\2\u01c5\u01c7\5<\37\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01ca\3\2\2\2\u01c8\u01c9\7\13\2\2\u01c9\u01cb\5\u00bc_\2\u01ca\u01c8"+
		"\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\7\4\2\2\u01cd"+
		"\u01cf\5\36\20\2\u01ce\u01d0\7\16\2\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\7\5\2\2\u01d2\u01e8\3\2\2\2\u01d3"+
		"\u01d4\7\20\2\2\u01d4\u01d6\7`\2\2\u01d5\u01d7\5<\37\2\u01d6\u01d5\3\2"+
		"\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d9\7\13\2\2\u01d9"+
		"\u01db\5\u00bc_\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc"+
		"\3\2\2\2\u01dc\u01dd\7\4\2\2\u01dd\u01de\5\36\20\2\u01de\u01e2\7\21\2"+
		"\2\u01df\u01e1\5$\23\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5"+
		"\u01e6\7\5\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01c3\3\2\2\2\u01e7\u01d3\3\2"+
		"\2\2\u01e8\33\3\2\2\2\u01e9\u01ea\7\22\2\2\u01ea\u01ed\7`\2\2\u01eb\u01ec"+
		"\7\65\2\2\u01ec\u01ee\7`\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01f1\3\2\2\2\u01ef\u01f0\7\23\2\2\u01f0\u01f2\7\24\2\2\u01f1\u01ef\3"+
		"\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u0204\3\2\2\2\u01f3\u01f4\7\22\2\2\u01f4"+
		"\u01f5\7`\2\2\u01f5\u01f6\7\65\2\2\u01f6\u01f7\7`\2\2\u01f7\u01f8\3\2"+
		"\2\2\u01f8\u01f9\7\23\2\2\u01f9\u01fe\5\"\22\2\u01fa\u01fb\7\16\2\2\u01fb"+
		"\u01fd\5\"\22\2\u01fc\u01fa\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3"+
		"\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\3\2\2\2\u0200\u01fe\3\2\2\2\u0201"+
		"\u0202\7\24\2\2\u0202\u0204\3\2\2\2\u0203\u01e9\3\2\2\2\u0203\u01f3\3"+
		"\2\2\2\u0204\35\3\2\2\2\u0205\u020a\5 \21\2\u0206\u0207\7\16\2\2\u0207"+
		"\u0209\5 \21\2\u0208\u0206\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2"+
		"\2\2\u020a\u020b\3\2\2\2\u020b\37\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u0210"+
		"\7`\2\2\u020e\u020f\7\23\2\2\u020f\u0211\7\24\2\2\u0210\u020e\3\2\2\2"+
		"\u0210\u0211\3\2\2\2\u0211\u021f\3\2\2\2\u0212\u0213\7`\2\2\u0213\u0214"+
		"\7\23\2\2\u0214\u0219\5\"\22\2\u0215\u0216\7\16\2\2\u0216\u0218\5\"\22"+
		"\2\u0217\u0215\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a"+
		"\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021d\7\24\2\2"+
		"\u021d\u021f\3\2\2\2\u021e\u020d\3\2\2\2\u021e\u0212\3\2\2\2\u021f!\3"+
		"\2\2\2\u0220\u0221\7`\2\2\u0221\u0223\7\b\2\2\u0222\u0220\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\5^\60\2\u0225#\3\2\2\2"+
		"\u0226\u0228\5\34\17\2\u0227\u0226\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227"+
		"\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b\u0229\3\2\2\2\u022c"+
		"\u0236\5*\26\2\u022d\u022f\5\34\17\2\u022e\u022d\3\2\2\2\u022f\u0232\3"+
		"\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232"+
		"\u0230\3\2\2\2\u0233\u0236\5\62\32\2\u0234\u0236\58\35\2\u0235\u0229\3"+
		"\2\2\2\u0235\u0230\3\2\2\2\u0235\u0234\3\2\2\2\u0236%\3\2\2\2\u0237\u023a"+
		"\5(\25\2\u0238\u0239\7\b\2\2\u0239\u023b\5^\60\2\u023a\u0238\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\5\60\31\2\u023d\u023e\5"+
		".\30\2\u023e\u024f\3\2\2\2\u023f\u0242\5(\25\2\u0240\u0241\7\b\2\2\u0241"+
		"\u0243\5^\60\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2"+
		"\2\2\u0244\u0246\5.\30\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\u0248\3\2\2\2\u0247\u0249\5\60\31\2\u0248\u0247\3\2\2\2\u0248\u0249\3"+
		"\2\2\2\u0249\u024f\3\2\2\2\u024a\u024b\5(\25\2\u024b\u024c\7M\2\2\u024c"+
		"\u024d\5^\60\2\u024d\u024f\3\2\2\2\u024e\u0237\3\2\2\2\u024e\u023f\3\2"+
		"\2\2\u024e\u024a\3\2\2\2\u024f\'\3\2\2\2\u0250\u0251\7\61\2\2\u0251\u0254"+
		"\7`\2\2\u0252\u0253\7\13\2\2\u0253\u0255\5\u00bc_\2\u0254\u0252\3\2\2"+
		"\2\u0254\u0255\3\2\2\2\u0255)\3\2\2\2\u0256\u0259\5,\27\2\u0257\u0258"+
		"\7\b\2\2\u0258\u025a\5^\60\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025c\3\2\2\2\u025b\u025d\5.\30\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2"+
		"\2\2\u025d\u0263\3\2\2\2\u025e\u025f\5,\27\2\u025f\u0260\7M\2\2\u0260"+
		"\u0261\5^\60\2\u0261\u0263\3\2\2\2\u0262\u0256\3\2\2\2\u0262\u025e\3\2"+
		"\2\2\u0263+\3\2\2\2\u0264\u0265\7\62\2\2\u0265\u0268\7`\2\2\u0266\u0267"+
		"\7\13\2\2\u0267\u0269\5\u00bc_\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2"+
		"\2\u0269-\3\2\2\2\u026a\u026b\7\25\2\2\u026b\u026c\7\23\2\2\u026c\u026d"+
		"\7\24\2\2\u026d\u026f\7\4\2\2\u026e\u0270\5D#\2\u026f\u026e\3\2\2\2\u0270"+
		"\u0271\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2"+
		"\2\2\u0273\u0274\7\5\2\2\u0274/\3\2\2\2\u0275\u0276\7\26\2\2\u0276\u0277"+
		"\7\23\2\2\u0277\u0278\7`\2\2\u0278\u0279\7\24\2\2\u0279\u027b\7\4\2\2"+
		"\u027a\u027c\5D#\2\u027b\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027b"+
		"\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\7\5\2\2\u0280"+
		"\61\3\2\2\2\u0281\u0282\5\64\33\2\u0282\u0286\7\4\2\2\u0283\u0285\5D#"+
		"\2\u0284\u0283\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287"+
		"\3\2\2\2\u0287\u0289\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u028a\7\5\2\2\u028a"+
		"\63\3\2\2\2\u028b\u028c\7\63\2\2\u028c\u028e\7`\2\2\u028d\u028f\5\u00b6"+
		"\\\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"\u0291\7\23\2\2\u0291\u0294\7\24\2\2\u0292\u0293\7\13\2\2\u0293\u0295"+
		"\5\u00bc_\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u02aa\3\2\2"+
		"\2\u0296\u0297\7\63\2\2\u0297\u0299\7`\2\2\u0298\u029a\5\u00b6\\\2\u0299"+
		"\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\7\23"+
		"\2\2\u029c\u02a1\5\66\34\2\u029d\u029e\7\16\2\2\u029e\u02a0\5\66\34\2"+
		"\u029f\u029d\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2"+
		"\3\2\2\2\u02a2\u02a4\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02a7\7\24\2\2"+
		"\u02a5\u02a6\7\13\2\2\u02a6\u02a8\5\u00bc_\2\u02a7\u02a5\3\2\2\2\u02a7"+
		"\u02a8\3\2\2\2\u02a8\u02aa\3\2\2\2\u02a9\u028b\3\2\2\2\u02a9\u0296\3\2"+
		"\2\2\u02aa\65\3\2\2\2\u02ab\u02ac\7`\2\2\u02ac\u02ad\7\13\2\2\u02ad\u02b0"+
		"\5\u00bc_\2\u02ae\u02af\7\b\2\2\u02af\u02b1\5^\60\2\u02b0\u02ae\3\2\2"+
		"\2\u02b0\u02b1\3\2\2\2\u02b1\67\3\2\2\2\u02b2\u02b3\7\27\2\2\u02b3\u02b7"+
		"\7\4\2\2\u02b4\u02b6\5D#\2\u02b5\u02b4\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7"+
		"\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02b7\3\2"+
		"\2\2\u02ba\u02bb\7\5\2\2\u02bb9\3\2\2\2\u02bc\u02bd\7\30\2\2\u02bd\u02c1"+
		"\7\4\2\2\u02be\u02c0\5D#\2\u02bf\u02be\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1"+
		"\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4\3\2\2\2\u02c3\u02c1\3\2"+
		"\2\2\u02c4\u02c5\7\5\2\2\u02c5;\3\2\2\2\u02c6\u02c7\7\23\2\2\u02c7\u02d4"+
		"\7\24\2\2\u02c8\u02c9\7\23\2\2\u02c9\u02ce\5> \2\u02ca\u02cb\7\16\2\2"+
		"\u02cb\u02cd\5> \2\u02cc\u02ca\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc"+
		"\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1"+
		"\u02d2\7\24\2\2\u02d2\u02d4\3\2\2\2\u02d3\u02c6\3\2\2\2\u02d3\u02c8\3"+
		"\2\2\2\u02d4=\3\2\2\2\u02d5\u02d7\t\2\2\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7"+
		"\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\5\66\34\2\u02d9?\3\2\2\2\u02da"+
		"\u02db\7\31\2\2\u02db\u02dc\7\23\2\2\u02dc\u02de\7\24\2\2\u02dd\u02df"+
		"\5B\"\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0"+
		"\u02e4\7\4\2\2\u02e1\u02e3\5D#\2\u02e2\u02e1\3\2\2\2\u02e3\u02e6\3\2\2"+
		"\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e7\3\2\2\2\u02e6\u02e4"+
		"\3\2\2\2\u02e7\u0300\7\5\2\2\u02e8\u02e9\7\31\2\2\u02e9\u02ea\7\23\2\2"+
		"\u02ea\u02ef\5\66\34\2\u02eb\u02ec\7\16\2\2\u02ec\u02ee\5\66\34\2\u02ed"+
		"\u02eb\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2"+
		"\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f4\7\24\2\2\u02f3"+
		"\u02f5\5B\"\2\u02f4\u02f3\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\3\2"+
		"\2\2\u02f6\u02fa\7\4\2\2\u02f7\u02f9\5D#\2\u02f8\u02f7\3\2\2\2\u02f9\u02fc"+
		"\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fd\3\2\2\2\u02fc"+
		"\u02fa\3\2\2\2\u02fd\u02fe\7\5\2\2\u02fe\u0300\3\2\2\2\u02ff\u02da\3\2"+
		"\2\2\u02ff\u02e8\3\2\2\2\u0300A\3\2\2\2\u0301\u0302\7\13\2\2\u0302\u0303"+
		"\7\32\2\2\u0303\u0304\7\23\2\2\u0304\u0313\7\24\2\2\u0305\u0306\7\13\2"+
		"\2\u0306\u0307\7\32\2\2\u0307\u0308\7\23\2\2\u0308\u030d\5\"\22\2\u0309"+
		"\u030a\7\16\2\2\u030a\u030c\5\"\22\2\u030b\u0309\3\2\2\2\u030c\u030f\3"+
		"\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0310\3\2\2\2\u030f"+
		"\u030d\3\2\2\2\u0310\u0311\7\24\2\2\u0311\u0313\3\2\2\2\u0312\u0301\3"+
		"\2\2\2\u0312\u0305\3\2\2\2\u0313C\3\2\2\2\u0314\u0321\5&\24\2\u0315\u0321"+
		"\5*\26\2\u0316\u0321\5F$\2\u0317\u0321\5J&\2\u0318\u0321\5V,\2\u0319\u0321"+
		"\5X-\2\u031a\u0321\5Z.\2\u031b\u031c\5^\60\2\u031c\u031d\5\\/\2\u031d"+
		"\u031e\5^\60\2\u031e\u0321\3\2\2\2\u031f\u0321\5^\60\2\u0320\u0314\3\2"+
		"\2\2\u0320\u0315\3\2\2\2\u0320\u0316\3\2\2\2\u0320\u0317\3\2\2\2\u0320"+
		"\u0318\3\2\2\2\u0320\u0319\3\2\2\2\u0320\u031a\3\2\2\2\u0320\u031b\3\2"+
		"\2\2\u0320\u031f\3\2\2\2\u0321E\3\2\2\2\u0322\u0323\7\33\2\2\u0323\u0324"+
		"\7\23\2\2\u0324\u0325\5^\60\2\u0325\u0326\7\24\2\2\u0326\u0328\5D#\2\u0327"+
		"\u0329\5H%\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u033a\3\2\2"+
		"\2\u032a\u032b\7\33\2\2\u032b\u032c\7\23\2\2\u032c\u032d\5^\60\2\u032d"+
		"\u032e\7\24\2\2\u032e\u0332\7\4\2\2\u032f\u0331\5D#\2\u0330\u032f\3\2"+
		"\2\2\u0331\u0334\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333"+
		"\u0335\3\2\2\2\u0334\u0332\3\2\2\2\u0335\u0337\7\5\2\2\u0336\u0338\5H"+
		"%\2\u0337\u0336\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033a\3\2\2\2\u0339"+
		"\u0322\3\2\2\2\u0339\u032a\3\2\2\2\u033aG\3\2\2\2\u033b\u033c\7\34\2\2"+
		"\u033c\u0347\5D#\2\u033d\u033e\7\34\2\2\u033e\u0342\7\4\2\2\u033f\u0341"+
		"\5D#\2\u0340\u033f\3\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340\3\2\2\2\u0342"+
		"\u0343\3\2\2\2\u0343\u0345\3\2\2\2\u0344\u0342\3\2\2\2\u0345\u0347\7\5"+
		"\2\2\u0346\u033b\3\2\2\2\u0346\u033d\3\2\2\2\u0347I\3\2\2\2\u0348\u0349"+
		"\7\35\2\2\u0349\u034d\7\23\2\2\u034a\u034b\5,\27\2\u034b\u034c\7\b\2\2"+
		"\u034c\u034e\3\2\2\2\u034d\u034a\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034f"+
		"\3\2\2\2\u034f\u0350\5^\60\2\u0350\u0351\7\24\2\2\u0351\u0355\7\4\2\2"+
		"\u0352\u0354\5L\'\2\u0353\u0352\3\2\2\2\u0354\u0357\3\2\2\2\u0355\u0353"+
		"\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0358\3\2\2\2\u0357\u0355\3\2\2\2\u0358"+
		"\u0359\7\5\2\2\u0359K\3\2\2\2\u035a\u035f\5N(\2\u035b\u035c\7\16\2\2\u035c"+
		"\u035e\5N(\2\u035d\u035b\3\2\2\2\u035e\u0361\3\2\2\2\u035f\u035d\3\2\2"+
		"\2\u035f\u0360\3\2\2\2\u0360\u0362\3\2\2\2\u0361\u035f\3\2\2\2\u0362\u0363"+
		"\7\36\2\2\u0363\u0364\5D#\2\u0364\u0385\3\2\2\2\u0365\u036a\5N(\2\u0366"+
		"\u0367\7\16\2\2\u0367\u0369\5N(\2\u0368\u0366\3\2\2\2\u0369\u036c\3\2"+
		"\2\2\u036a\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036d\3\2\2\2\u036c"+
		"\u036a\3\2\2\2\u036d\u036e\7\36\2\2\u036e\u0372\7\4\2\2\u036f\u0371\5"+
		"D#\2\u0370\u036f\3\2\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0372"+
		"\u0373\3\2\2\2\u0373\u0375\3\2\2\2\u0374\u0372\3\2\2\2\u0375\u0376\7\5"+
		"\2\2\u0376\u0385\3\2\2\2\u0377\u0378\7\34\2\2\u0378\u0379\7\36\2\2\u0379"+
		"\u0385\5D#\2\u037a\u037b\7\34\2\2\u037b\u037c\7\36\2\2\u037c\u0380\7\4"+
		"\2\2\u037d\u037f\5D#\2\u037e\u037d\3\2\2\2\u037f\u0382\3\2\2\2\u0380\u037e"+
		"\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0383\3\2\2\2\u0382\u0380\3\2\2\2\u0383"+
		"\u0385\7\5\2\2\u0384\u035a\3\2\2\2\u0384\u0365\3\2\2\2\u0384\u0377\3\2"+
		"\2\2\u0384\u037a\3\2\2\2\u0385M\3\2\2\2\u0386\u038b\5^\60\2\u0387\u038b"+
		"\5P)\2\u0388\u038b\5R*\2\u0389\u038b\5T+\2\u038a\u0386\3\2\2\2\u038a\u0387"+
		"\3\2\2\2\u038a\u0388\3\2\2\2\u038a\u0389\3\2\2\2\u038bO\3\2\2\2\u038c"+
		"\u038d\5\u00a8U\2\u038d\u038e\5^\60\2\u038eQ\3\2\2\2\u038f\u0390\5\u00a6"+
		"T\2\u0390\u0391\5\u00bc_\2\u0391S\3\2\2\2\u0392\u0393\5\u00aaV\2\u0393"+
		"\u0394\7`\2\2\u0394\u0395\7\13\2\2\u0395\u0396\5\u00bc_\2\u0396U\3\2\2"+
		"\2\u0397\u0398\7\37\2\2\u0398\u0399\7\23\2\2\u0399\u039a\7`\2\2\u039a"+
		"\u039b\7P\2\2\u039b\u039c\5^\60\2\u039c\u039d\7\24\2\2\u039d\u039e\5D"+
		"#\2\u039e\u03af\3\2\2\2\u039f\u03a0\7\37\2\2\u03a0\u03a1\7\23\2\2\u03a1"+
		"\u03a2\7`\2\2\u03a2\u03a3\7P\2\2\u03a3\u03a4\5^\60\2\u03a4\u03a5\7\24"+
		"\2\2\u03a5\u03a9\7\4\2\2\u03a6\u03a8\5D#\2\u03a7\u03a6\3\2\2\2\u03a8\u03ab"+
		"\3\2\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ac\3\2\2\2\u03ab"+
		"\u03a9\3\2\2\2\u03ac\u03ad\7\5\2\2\u03ad\u03af\3\2\2\2\u03ae\u0397\3\2"+
		"\2\2\u03ae\u039f\3\2\2\2\u03afW\3\2\2\2\u03b0\u03b1\7 \2\2\u03b1\u03b2"+
		"\7\23\2\2\u03b2\u03b3\5^\60\2\u03b3\u03b4\7\24\2\2\u03b4\u03b5\5D#\2\u03b5"+
		"\u03c4\3\2\2\2\u03b6\u03b7\7 \2\2\u03b7\u03b8\7\23\2\2\u03b8\u03b9\5^"+
		"\60\2\u03b9\u03ba\7\24\2\2\u03ba\u03be\7\4\2\2\u03bb\u03bd\5D#\2\u03bc"+
		"\u03bb\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be\u03bc\3\2\2\2\u03be\u03bf\3\2"+
		"\2\2\u03bf\u03c1\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1\u03c2\7\5\2\2\u03c2"+
		"\u03c4\3\2\2\2\u03c3\u03b0\3\2\2\2\u03c3\u03b6\3\2\2\2\u03c4Y\3\2\2\2"+
		"\u03c5\u03c6\7!\2\2\u03c6\u03c7\5D#\2\u03c7\u03c8\7 \2\2\u03c8\u03c9\7"+
		"\23\2\2\u03c9\u03ca\5^\60\2\u03ca\u03cb\7\24\2\2\u03cb\u03db\3\2\2\2\u03cc"+
		"\u03cd\7!\2\2\u03cd\u03d1\7\4\2\2\u03ce\u03d0\5D#\2\u03cf\u03ce\3\2\2"+
		"\2\u03d0\u03d3\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d4"+
		"\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d4\u03d5\7\5\2\2\u03d5\u03d6\7 \2\2\u03d6"+
		"\u03d7\7\23\2\2\u03d7\u03d8\5^\60\2\u03d8\u03d9\7\24\2\2\u03d9\u03db\3"+
		"\2\2\2\u03da\u03c5\3\2\2\2\u03da\u03cc\3\2\2\2\u03db[\3\2\2\2\u03dc\u03dd"+
		"\t\3\2\2\u03dd]\3\2\2\2\u03de\u03df\5`\61\2\u03df_\3\2\2\2\u03e0\u03e5"+
		"\5b\62\2\u03e1\u03e2\7W\2\2\u03e2\u03e4\5b\62\2\u03e3\u03e1\3\2\2\2\u03e4"+
		"\u03e7\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6a\3\2\2\2"+
		"\u03e7\u03e5\3\2\2\2\u03e8\u03ed\5d\63\2\u03e9\u03ea\7V\2\2\u03ea\u03ec"+
		"\5d\63\2\u03eb\u03e9\3\2\2\2\u03ec\u03ef\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ed"+
		"\u03ee\3\2\2\2\u03eec\3\2\2\2\u03ef\u03ed\3\2\2\2\u03f0\u03f6\5f\64\2"+
		"\u03f1\u03f2\5\u00acW\2\u03f2\u03f3\5f\64\2\u03f3\u03f5\3\2\2\2\u03f4"+
		"\u03f1\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f6\u03f7\3\2"+
		"\2\2\u03f7e\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f9\u03fd\5h\65\2\u03fa\u03fb"+
		"\5\u00a4S\2\u03fb\u03fc\5h\65\2\u03fc\u03fe\3\2\2\2\u03fd\u03fa\3\2\2"+
		"\2\u03fd\u03fe\3\2\2\2\u03feg\3\2\2\2\u03ff\u040e\5j\66\2\u0400\u0401"+
		"\5\u00a8U\2\u0401\u0402\5j\66\2\u0402\u040d\3\2\2\2\u0403\u0404\5\u00a6"+
		"T\2\u0404\u0405\5\u00bc_\2\u0405\u040d\3\2\2\2\u0406\u0407\5\u00aaV\2"+
		"\u0407\u0408\t\4\2\2\u0408\u0409\7`\2\2\u0409\u040a\7\13\2\2\u040a\u040b"+
		"\5\u00bc_\2\u040b\u040d\3\2\2\2\u040c\u0400\3\2\2\2\u040c\u0403\3\2\2"+
		"\2\u040c\u0406\3\2\2\2\u040d\u0410\3\2\2\2\u040e\u040c\3\2\2\2\u040e\u040f"+
		"\3\2\2\2\u040fi\3\2\2\2\u0410\u040e\3\2\2\2\u0411\u0416\5l\67\2\u0412"+
		"\u0413\7:\2\2\u0413\u0415\5l\67\2\u0414\u0412\3\2\2\2\u0415\u0418\3\2"+
		"\2\2\u0416\u0414\3\2\2\2\u0416\u0417\3\2\2\2\u0417k\3\2\2\2\u0418\u0416"+
		"\3\2\2\2\u0419\u041f\5n8\2\u041a\u041b\5\u00a2R\2\u041b\u041c\5n8\2\u041c"+
		"\u041e\3\2\2\2\u041d\u041a\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2"+
		"\2\2\u041f\u0420\3\2\2\2\u0420m\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u0428"+
		"\5p9\2\u0423\u0424\5\u00a0Q\2\u0424\u0425\5p9\2\u0425\u0427\3\2\2\2\u0426"+
		"\u0423\3\2\2\2\u0427\u042a\3\2\2\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2"+
		"\2\2\u0429o\3\2\2\2\u042a\u0428\3\2\2\2\u042b\u0431\5r:\2\u042c\u042d"+
		"\5\u009eP\2\u042d\u042e\5r:\2\u042e\u0430\3\2\2\2\u042f\u042c\3\2\2\2"+
		"\u0430\u0433\3\2\2\2\u0431\u042f\3\2\2\2\u0431\u0432\3\2\2\2\u0432q\3"+
		"\2\2\2\u0433\u0431\3\2\2\2\u0434\u043a\5t;\2\u0435\u0436\5\u009cO\2\u0436"+
		"\u0437\5t;\2\u0437\u0439\3\2\2\2\u0438\u0435\3\2\2\2\u0439\u043c\3\2\2"+
		"\2\u043a\u0438\3\2\2\2\u043a\u043b\3\2\2\2\u043bs\3\2\2\2\u043c\u043a"+
		"\3\2\2\2\u043d\u043f\5\u009aN\2\u043e\u043d\3\2\2\2\u043f\u0442\3\2\2"+
		"\2\u0440\u043e\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0443\3\2\2\2\u0442\u0440"+
		"\3\2\2\2\u0443\u0444\5v<\2\u0444u\3\2\2\2\u0445\u044d\5\u0080A\2\u0446"+
		"\u0448\5\u0080A\2\u0447\u0449\5x=\2\u0448\u0447\3\2\2\2\u0449\u044a\3"+
		"\2\2\2\u044a\u0448\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044d\3\2\2\2\u044c"+
		"\u0445\3\2\2\2\u044c\u0446\3\2\2\2\u044dw\3\2\2\2\u044e\u0454\5\u0098"+
		"M\2\u044f\u0454\5\u00ba^\2\u0450\u0454\5z>\2\u0451\u0454\5|?\2\u0452\u0454"+
		"\5~@\2\u0453\u044e\3\2\2\2\u0453\u044f\3\2\2\2\u0453\u0450\3\2\2\2\u0453"+
		"\u0451\3\2\2\2\u0453\u0452\3\2\2\2\u0454y\3\2\2\2\u0455\u0456\7\23\2\2"+
		"\u0456\u0461\7\24\2\2\u0457\u0458\7\23\2\2\u0458\u045d\5\"\22\2\u0459"+
		"\u045a\7\16\2\2\u045a\u045c\5\"\22\2\u045b\u0459\3\2\2\2\u045c\u045f\3"+
		"\2\2\2\u045d\u045b\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u0461\3\2\2\2\u045f"+
		"\u045d\3\2\2\2\u0460\u0455\3\2\2\2\u0460\u0457\3\2\2\2\u0461{\3\2\2\2"+
		"\u0462\u0463\7-\2\2\u0463\u0468\5^\60\2\u0464\u0465\7\16\2\2\u0465\u0467"+
		"\5^\60\2\u0466\u0464\3\2\2\2\u0467\u046a\3\2\2\2\u0468\u0466\3\2\2\2\u0468"+
		"\u0469\3\2\2\2\u0469\u046b\3\2\2\2\u046a\u0468\3\2\2\2\u046b\u046c\7."+
		"\2\2\u046c}\3\2\2\2\u046d\u046e\5\u0096L\2\u046e\u046f\7`\2\2\u046f\177"+
		"\3\2\2\2\u0470\u0471\7\23\2\2\u0471\u0472\5^\60\2\u0472\u0473\7\24\2\2"+
		"\u0473\u047b\3\2\2\2\u0474\u047b\7`\2\2\u0475\u047b\5\u0084C\2\u0476\u047b"+
		"\5\u0082B\2\u0477\u047b\5\u00aeX\2\u0478\u047b\5\u00b2Z\2\u0479\u047b"+
		"\5\u0094K\2\u047a\u0470\3\2\2\2\u047a\u0474\3\2\2\2\u047a\u0475\3\2\2"+
		"\2\u047a\u0476\3\2\2\2\u047a\u0477\3\2\2\2\u047a\u0478\3\2\2\2\u047a\u0479"+
		"\3\2\2\2\u047b\u0081\3\2\2\2\u047c\u047d\7\32\2\2\u047d\u0083\3\2\2\2"+
		"\u047e\u048b\5\u0086D\2\u047f\u048b\5\u0088E\2\u0480\u048b\5\u008aF\2"+
		"\u0481\u048b\5\u008cG\2\u0482\u048b\5\u008eH\2\u0483\u048b\5\u0092J\2"+
		"\u0484\u048b\7Y\2\2\u0485\u048b\7Z\2\2\u0486\u048b\7^\2\2\u0487\u048b"+
		"\7\\\2\2\u0488\u048b\7[\2\2\u0489\u048b\7_\2\2\u048a\u047e\3\2\2\2\u048a"+
		"\u047f\3\2\2\2\u048a\u0480\3\2\2\2\u048a\u0481\3\2\2\2\u048a\u0482\3\2"+
		"\2\2\u048a\u0483\3\2\2\2\u048a\u0484\3\2\2\2\u048a\u0485\3\2\2\2\u048a"+
		"\u0486\3\2\2\2\u048a\u0487\3\2\2\2\u048a\u0488\3\2\2\2\u048a\u0489\3\2"+
		"\2\2\u048b\u0085\3\2\2\2\u048c\u048d\7-\2\2\u048d\u049a\7.\2\2\u048e\u048f"+
		"\7-\2\2\u048f\u0494\5^\60\2\u0490\u0491\7\16\2\2\u0491\u0493\5^\60\2\u0492"+
		"\u0490\3\2\2\2\u0493\u0496\3\2\2\2\u0494\u0492\3\2\2\2\u0494\u0495\3\2"+
		"\2\2\u0495\u0497\3\2\2\2\u0496\u0494\3\2\2\2\u0497\u0498\7.\2\2\u0498"+
		"\u049a\3\2\2\2\u0499\u048c\3\2\2\2\u0499\u048e\3\2\2\2\u049a\u0087\3\2"+
		"\2\2\u049b\u049c\7\4\2\2\u049c\u04ae\7\5\2\2\u049d\u049e\7\4\2\2\u049e"+
		"\u049f\5^\60\2\u049f\u04a0\7/\2\2\u04a0\u04a8\5^\60\2\u04a1\u04a2\7\16"+
		"\2\2\u04a2\u04a3\5^\60\2\u04a3\u04a4\7/\2\2\u04a4\u04a5\5^\60\2\u04a5"+
		"\u04a7\3\2\2\2\u04a6\u04a1\3\2\2\2\u04a7\u04aa\3\2\2\2\u04a8\u04a6\3\2"+
		"\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04ab\3\2\2\2\u04aa\u04a8\3\2\2\2\u04ab"+
		"\u04ac\7\5\2\2\u04ac\u04ae\3\2\2\2\u04ad\u049b\3\2\2\2\u04ad\u049d\3\2"+
		"\2\2\u04ae\u0089\3\2\2\2\u04af\u04b0\7\4\2\2\u04b0\u04b5\5^\60\2\u04b1"+
		"\u04b2\7\16\2\2\u04b2\u04b4\5^\60\2\u04b3\u04b1\3\2\2\2\u04b4\u04b7\3"+
		"\2\2\2\u04b5\u04b3\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b8\3\2\2\2\u04b7"+
		"\u04b5\3\2\2\2\u04b8\u04b9\7\5\2\2\u04b9\u008b\3\2\2\2\u04ba\u04bb\7\23"+
		"\2\2\u04bb\u04cf\7\24\2\2\u04bc\u04bd\7\23\2\2\u04bd\u04be\5^\60\2\u04be"+
		"\u04bf\7\16\2\2\u04bf\u04c0\7\24\2\2\u04c0\u04cf\3\2\2\2\u04c1\u04c2\7"+
		"\23\2\2\u04c2\u04c5\5^\60\2\u04c3\u04c4\7\16\2\2\u04c4\u04c6\5^\60\2\u04c5"+
		"\u04c3\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c7\u04c8\3\2"+
		"\2\2\u04c8\u04ca\3\2\2\2\u04c9\u04cb\7\16\2\2\u04ca\u04c9\3\2\2\2\u04ca"+
		"\u04cb\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd\7\24\2\2\u04cd\u04cf\3"+
		"\2\2\2\u04ce\u04ba\3\2\2\2\u04ce\u04bc\3\2\2\2\u04ce\u04c1\3\2\2\2\u04cf"+
		"\u008d\3\2\2\2\u04d0\u04d4\7\4\2\2\u04d1\u04d3\5D#\2\u04d2\u04d1\3\2\2"+
		"\2\u04d3\u04d6\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d7"+
		"\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d7\u04eb\7\5\2\2\u04d8\u04d9\7\4\2\2\u04d9"+
		"\u04de\5\u0090I\2\u04da\u04db\7\16\2\2\u04db\u04dd\5\u0090I\2\u04dc\u04da"+
		"\3\2\2\2\u04dd\u04e0\3\2\2\2\u04de\u04dc\3\2\2\2\u04de\u04df\3\2\2\2\u04df"+
		"\u04e1\3\2\2\2\u04e0\u04de\3\2\2\2\u04e1\u04e5\7\36\2\2\u04e2\u04e4\5"+
		"D#\2\u04e3\u04e2\3\2\2\2\u04e4\u04e7\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e5"+
		"\u04e6\3\2\2\2\u04e6\u04e8\3\2\2\2\u04e7\u04e5\3\2\2\2\u04e8\u04e9\7\5"+
		"\2\2\u04e9\u04eb\3\2\2\2\u04ea\u04d0\3\2\2\2\u04ea\u04d8\3\2\2\2\u04eb"+
		"\u008f\3\2\2\2\u04ec\u04ef\7`\2\2\u04ed\u04ee\7\13\2\2\u04ee\u04f0\5\u00bc"+
		"_\2\u04ef\u04ed\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u0091\3\2\2\2\u04f1"+
		"\u04f4\7\17\2\2\u04f2\u04f3\7\13\2\2\u04f3\u04f5\5\u00bc_\2\u04f4\u04f2"+
		"\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04ff\3\2\2\2\u04f6\u04f7\7\r\2\2\u04f7"+
		"\u04fc\5^\60\2\u04f8\u04f9\7\16\2\2\u04f9\u04fb\5^\60\2\u04fa\u04f8\3"+
		"\2\2\2\u04fb\u04fe\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd"+
		"\u0500\3\2\2\2\u04fe\u04fc\3\2\2\2\u04ff\u04f6\3\2\2\2\u04ff\u0500\3\2"+
		"\2\2\u0500\u0501\3\2\2\2\u0501\u0505\7\4\2\2\u0502\u0504\5\30\r\2\u0503"+
		"\u0502\3\2\2\2\u0504\u0507\3\2\2\2\u0505\u0503\3\2\2\2\u0505\u0506\3\2"+
		"\2\2\u0506\u0508\3\2\2\2\u0507\u0505\3\2\2\2\u0508\u0509\7\5\2\2\u0509"+
		"\u0093\3\2\2\2\u050a\u050c\7\60\2\2\u050b\u050d\5^\60\2\u050c\u050b\3"+
		"\2\2\2\u050c\u050d\3\2\2\2\u050d\u0095\3\2\2\2\u050e\u050f\t\5\2\2\u050f"+
		"\u0097\3\2\2\2\u0510\u0511\t\6\2\2\u0511\u0099\3\2\2\2\u0512\u0513\t\7"+
		"\2\2\u0513\u009b\3\2\2\2\u0514\u0515\t\b\2\2\u0515\u009d\3\2\2\2\u0516"+
		"\u0517\t\t\2\2\u0517\u009f\3\2\2\2\u0518\u0519\t\n\2\2\u0519\u00a1\3\2"+
		"\2\2\u051a\u051b\t\13\2\2\u051b\u00a3\3\2\2\2\u051c\u051d\t\f\2\2\u051d"+
		"\u00a5\3\2\2\2\u051e\u051f\t\r\2\2\u051f\u00a7\3\2\2\2\u0520\u0521\t\16"+
		"\2\2\u0521\u00a9\3\2\2\2\u0522\u0523\t\17\2\2\u0523\u00ab\3\2\2\2\u0524"+
		"\u0525\t\20\2\2\u0525\u00ad\3\2\2\2\u0526\u0527\7\33\2\2\u0527\u0528\7"+
		"\23\2\2\u0528\u0529\5^\60\2\u0529\u052a\7\24\2\2\u052a\u052b\5^\60\2\u052b"+
		"\u052c\5\u00b0Y\2\u052c\u053d\3\2\2\2\u052d\u052e\7\33\2\2\u052e\u052f"+
		"\7\23\2\2\u052f\u0530\5^\60\2\u0530\u0531\7\24\2\2\u0531\u0535\7\4\2\2"+
		"\u0532\u0534\5D#\2\u0533\u0532\3\2\2\2\u0534\u0537\3\2\2\2\u0535\u0533"+
		"\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0538\3\2\2\2\u0537\u0535\3\2\2\2\u0538"+
		"\u0539\5^\60\2\u0539\u053a\7\5\2\2\u053a\u053b\5\u00b0Y\2\u053b\u053d"+
		"\3\2\2\2\u053c\u0526\3\2\2\2\u053c\u052d\3\2\2\2\u053d\u00af\3\2\2\2\u053e"+
		"\u053f\7\34\2\2\u053f\u054c\5^\60\2\u0540\u0541\7\34\2\2\u0541\u0545\7"+
		"\4\2\2\u0542\u0544\5D#\2\u0543\u0542\3\2\2\2\u0544\u0547\3\2\2\2\u0545"+
		"\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0548\3\2\2\2\u0547\u0545\3\2"+
		"\2\2\u0548\u0549\5^\60\2\u0549\u054a\7\5\2\2\u054a\u054c\3\2\2\2\u054b"+
		"\u053e\3\2\2\2\u054b\u0540\3\2\2\2\u054c\u00b1\3\2\2\2\u054d\u054e\7\35"+
		"\2\2\u054e\u0552\7\23\2\2\u054f\u0550\5,\27\2\u0550\u0551\7\b\2\2\u0551"+
		"\u0553\3\2\2\2\u0552\u054f\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0554\3\2"+
		"\2\2\u0554\u0555\5^\60\2\u0555\u0556\7\24\2\2\u0556\u055a\7\4\2\2\u0557"+
		"\u0559\5\u00b4[\2\u0558\u0557\3\2\2\2\u0559\u055c\3\2\2\2\u055a\u0558"+
		"\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055d\3\2\2\2\u055c\u055a\3\2\2\2\u055d"+
		"\u055e\7\5\2\2\u055e\u00b3\3\2\2\2\u055f\u0564\5N(\2\u0560\u0561\7\16"+
		"\2\2\u0561\u0563\5N(\2\u0562\u0560\3\2\2\2\u0563\u0566\3\2\2\2\u0564\u0562"+
		"\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0567\3\2\2\2\u0566\u0564\3\2\2\2\u0567"+
		"\u0568\7\36\2\2\u0568\u0569\5^\60\2\u0569\u058d\3\2\2\2\u056a\u056f\5"+
		"N(\2\u056b\u056c\7\16\2\2\u056c\u056e\5N(\2\u056d\u056b\3\2\2\2\u056e"+
		"\u0571\3\2\2\2\u056f\u056d\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0572\3\2"+
		"\2\2\u0571\u056f\3\2\2\2\u0572\u0573\7\36\2\2\u0573\u0577\7\4\2\2\u0574"+
		"\u0576\5D#\2\u0575\u0574\3\2\2\2\u0576\u0579\3\2\2\2\u0577\u0575\3\2\2"+
		"\2\u0577\u0578\3\2\2\2\u0578\u057a\3\2\2\2\u0579\u0577\3\2\2\2\u057a\u057b"+
		"\5^\60\2\u057b\u057c\7\5\2\2\u057c\u058d\3\2\2\2\u057d\u057e\7\34\2\2"+
		"\u057e\u057f\7\36\2\2\u057f\u058d\5^\60\2\u0580\u0581\7\34\2\2\u0581\u0582"+
		"\7\36\2\2\u0582\u0586\7\4\2\2\u0583\u0585\5D#\2\u0584\u0583\3\2\2\2\u0585"+
		"\u0588\3\2\2\2\u0586\u0584\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0589\3\2"+
		"\2\2\u0588\u0586\3\2\2\2\u0589\u058a\5^\60\2\u058a\u058b\7\5\2\2\u058b"+
		"\u058d\3\2\2\2\u058c\u055f\3\2\2\2\u058c\u056a\3\2\2\2\u058c\u057d\3\2"+
		"\2\2\u058c\u0580\3\2\2\2\u058d\u00b5\3\2\2\2\u058e\u058f\7I\2\2\u058f"+
		"\u0594\5\u00b8]\2\u0590\u0591\7\16\2\2\u0591\u0593\5\u00b8]\2\u0592\u0590"+
		"\3\2\2\2\u0593\u0596\3\2\2\2\u0594\u0592\3\2\2\2\u0594\u0595\3\2\2\2\u0595"+
		"\u0597\3\2\2\2\u0596\u0594\3\2\2\2\u0597\u0598\7K\2\2\u0598\u00b7\3\2"+
		"\2\2\u0599\u059c\7`\2\2\u059a\u059b\7\13\2\2\u059b\u059d\5\u00bc_\2\u059c"+
		"\u059a\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u00b9\3\2\2\2\u059e\u059f\7I"+
		"\2\2\u059f\u05a4\5\u00bc_\2\u05a0\u05a1\7\16\2\2\u05a1\u05a3\5\u00bc_"+
		"\2\u05a2\u05a0\3\2\2\2\u05a3\u05a6\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a4\u05a5"+
		"\3\2\2\2\u05a5\u05a7\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a7\u05a8\7K\2\2\u05a8"+
		"\u00bb\3\2\2\2\u05a9\u05aa\5\u00be`\2\u05aa\u00bd\3\2\2\2\u05ab\u05b0"+
		"\5\u00c0a\2\u05ac\u05ad\7F\2\2\u05ad\u05af\5\u00c0a\2\u05ae\u05ac\3\2"+
		"\2\2\u05af\u05b2\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1"+
		"\u00bf\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b3\u05b8\5\u00c2b\2\u05b4\u05b5"+
		"\7?\2\2\u05b5\u05b7\5\u00c2b\2\u05b6\u05b4\3\2\2\2\u05b7\u05ba\3\2\2\2"+
		"\u05b8\u05b6\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u00c1\3\2\2\2\u05ba\u05b8"+
		"\3\2\2\2\u05bb\u05be\7`\2\2\u05bc\u05bd\7\65\2\2\u05bd\u05bf\7`\2\2\u05be"+
		"\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c1\3\2\2\2\u05c0\u05c2\5\u00ba"+
		"^\2\u05c1\u05c0\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c9\3\2\2\2\u05c3"+
		"\u05c9\5\u00c4c\2\u05c4\u05c5\7\23\2\2\u05c5\u05c6\5\u00bc_\2\u05c6\u05c7"+
		"\7\24\2\2\u05c7\u05c9\3\2\2\2\u05c8\u05bb\3\2\2\2\u05c8\u05c3\3\2\2\2"+
		"\u05c8\u05c4\3\2\2\2\u05c9\u00c3\3\2\2\2\u05ca\u05cb\5\u00c6d\2\u05cb"+
		"\u05cc\7\36\2\2\u05cc\u05cd\5\u00bc_\2\u05cd\u00c5\3\2\2\2\u05ce\u05cf"+
		"\7\23\2\2\u05cf\u05dc\7\24\2\2\u05d0\u05d1\7\23\2\2\u05d1\u05d6\5\u00bc"+
		"_\2\u05d2\u05d3\7\16\2\2\u05d3\u05d5\5\u00bc_\2\u05d4\u05d2\3\2\2\2\u05d5"+
		"\u05d8\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d9\3\2"+
		"\2\2\u05d8\u05d6\3\2\2\2\u05d9\u05da\7\24\2\2\u05da\u05dc\3\2\2\2\u05db"+
		"\u05ce\3\2\2\2\u05db\u05d0\3\2\2\2\u05dc\u00c7\3\2\2\2\u00ae\u00cb\u00d4"+
		"\u00da\u00e8\u00ef\u00f6\u00fd\u0104\u010b\u0112\u0116\u011e\u0128\u012c"+
		"\u0132\u0136\u013b\u0142\u0149\u014d\u0152\u0155\u0159\u0161\u0164\u016a"+
		"\u016e\u0173\u017a\u0181\u0188\u018e\u0194\u019c\u019f\u01a5\u01ad\u01b4"+
		"\u01bb\u01c1\u01c6\u01ca\u01cf\u01d6\u01da\u01e2\u01e7\u01ed\u01f1\u01fe"+
		"\u0203\u020a\u0210\u0219\u021e\u0222\u0229\u0230\u0235\u023a\u0242\u0245"+
		"\u0248\u024e\u0254\u0259\u025c\u0262\u0268\u0271\u027d\u0286\u028e\u0294"+
		"\u0299\u02a1\u02a7\u02a9\u02b0\u02b7\u02c1\u02ce\u02d3\u02d6\u02de\u02e4"+
		"\u02ef\u02f4\u02fa\u02ff\u030d\u0312\u0320\u0328\u0332\u0337\u0339\u0342"+
		"\u0346\u034d\u0355\u035f\u036a\u0372\u0380\u0384\u038a\u03a9\u03ae\u03be"+
		"\u03c3\u03d1\u03da\u03e5\u03ed\u03f6\u03fd\u040c\u040e\u0416\u041f\u0428"+
		"\u0431\u043a\u0440\u044a\u044c\u0453\u045d\u0460\u0468\u047a\u048a\u0494"+
		"\u0499\u04a8\u04ad\u04b5\u04c7\u04ca\u04ce\u04d4\u04de\u04e5\u04ea\u04ef"+
		"\u04f4\u04fc\u04ff\u0505\u050c\u0535\u053c\u0545\u054b\u0552\u055a\u0564"+
		"\u056f\u0577\u0586\u058c\u0594\u059c\u05a4\u05b0\u05b8\u05be\u05c1\u05c8"+
		"\u05d6\u05db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}