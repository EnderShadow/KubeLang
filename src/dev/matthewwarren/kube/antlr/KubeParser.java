package dev.matthewwarren.kube.antlr;// Generated from /home/matthew/Desktop/Programming/Kotlin/Projects/KubeCompiler/grammar/Kube.g4 by ANTLR 4.8
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
		T__45=46, T__46=47, Var=48, Val=49, NoneSafeAccess=50, NonNoneAccess=51, 
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
		RULE_enum0 = 12, RULE_annotation0 = 13, RULE_annotation1 = 14, RULE_enumList = 15, 
		RULE_enumValue = 16, RULE_parameterExpression = 17, RULE_enumElement = 18, 
		RULE_variable = 19, RULE_variableDeclaration = 20, RULE_value = 21, RULE_valueDeclaration = 22, 
		RULE_getter = 23, RULE_setter = 24, RULE_function = 25, RULE_functionDeclaration = 26, 
		RULE_parameter = 27, RULE_initializer = 28, RULE_finalizer = 29, RULE_primaryConstructor = 30, 
		RULE_constructorParameter = 31, RULE_constructor = 32, RULE_constructorCall = 33, 
		RULE_statement = 34, RULE_ifStatement = 35, RULE_elseBlock = 36, RULE_whenStatement = 37, 
		RULE_whenStatementEntry = 38, RULE_whenCondition = 39, RULE_rangeTest = 40, 
		RULE_typeTest = 41, RULE_memberTest = 42, RULE_forLoop = 43, RULE_whileLoop = 44, 
		RULE_doWhileLoop = 45, RULE_assignmentOperator = 46, RULE_expression = 47, 
		RULE_logicalOrExpression = 48, RULE_logicalAndExpression = 49, RULE_equalityExpression = 50, 
		RULE_comparisonExpression = 51, RULE_infixOperation = 52, RULE_elvisExpression = 53, 
		RULE_rangeExpression = 54, RULE_bitwiseExpression = 55, RULE_additiveExpression = 56, 
		RULE_multiplicativeExpression = 57, RULE_prefixUnaryExpression = 58, RULE_postfixUnaryExpression = 59, 
		RULE_postfixUnarySuffix = 60, RULE_callSuffix = 61, RULE_indexingSuffix = 62, 
		RULE_navigationSuffix = 63, RULE_primaryExpression = 64, RULE_thisExpression = 65, 
		RULE_literal = 66, RULE_array = 67, RULE_map = 68, RULE_set = 69, RULE_tuple = 70, 
		RULE_lambdaLiteral = 71, RULE_lambdaParameter = 72, RULE_objectLiteral = 73, 
		RULE_returnExpression = 74, RULE_memberAccess = 75, RULE_postUnaryOperator = 76, 
		RULE_preUnaryOperator = 77, RULE_multiplicativeOperator = 78, RULE_additiveOperator = 79, 
		RULE_bitwiseOperator = 80, RULE_rangeOperator = 81, RULE_relationalOperator = 82, 
		RULE_isOperator = 83, RULE_inOperator = 84, RULE_hasOperator = 85, RULE_equalityOperator = 86, 
		RULE_ifExpression = 87, RULE_elseExpression = 88, RULE_whenExpression = 89, 
		RULE_whenExpressionEntry = 90, RULE_genericDeclaration = 91, RULE_genericTypeDeclaration = 92, 
		RULE_generic = 93, RULE_type = 94, RULE_unionType = 95, RULE_sumType = 96, 
		RULE_simpleType = 97;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "module", "importExpr", "moduleContent", "alias", "typeAlias", 
			"interface0", "interfaceElement", "class0", "classElement", "object0", 
			"objectElement", "enum0", "annotation0", "annotation1", "enumList", "enumValue", 
			"parameterExpression", "enumElement", "variable", "variableDeclaration", 
			"value", "valueDeclaration", "getter", "setter", "function", "functionDeclaration", 
			"parameter", "initializer", "finalizer", "primaryConstructor", "constructorParameter", 
			"constructor", "constructorCall", "statement", "ifStatement", "elseBlock", 
			"whenStatement", "whenStatementEntry", "whenCondition", "rangeTest", 
			"typeTest", "memberTest", "forLoop", "whileLoop", "doWhileLoop", "assignmentOperator", 
			"expression", "logicalOrExpression", "logicalAndExpression", "equalityExpression", 
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
			"generic", "type", "unionType", "sumType", "simpleType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'module'", "'{'", "'}'", "'import'", "'alias'", "'='", "'typeAlias'", 
			"'interface'", "':'", "'class'", "','", "'object'", "'enum'", "';'", 
			"'annotation'", "'@'", "'('", "')'", "'get'", "'set'", "'fun'", "'init'", 
			"'finalize'", "'constructor'", "'this'", "'if'", "'else'", "'when'", 
			"'->'", "'for'", "'while'", "'do'", "'*='", "'/='", "'%='", "'+='", "'-='", 
			"'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", "'['", "']'", "'to'", 
			"'return'", "'var'", "'val'", "'?.'", "'.'", "'++'", "'--'", "'!'", "'~'", 
			"'?:'", "'*'", "'/'", "'%'", "'/%'", "'+'", "'-'", "'<<'", "'>>'", "'>>>'", 
			"'&'", "'^'", "'|'", "'...'", "'..<'", "'<'", "'<='", "'>'", "'>='", 
			"'by'", "'is'", "'!is'", "'in'", "'!in'", "'has'", "'!has'", "'=='", 
			"'!='", "'&&'", "'||'", "'?'", null, null, null, null, null, null, "'none'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"Var", "Val", "NoneSafeAccess", "NonNoneAccess", "Increment", "Decrement", 
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitFile(this);
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
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(196);
				module();
				}
				}
				setState(201);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitModule(this);
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
			setState(202);
			match(T__0);
			setState(203);
			match(Identifier);
			setState(204);
			match(T__1);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(205);
				importExpr();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << Var) | (1L << Val))) != 0)) {
				{
				{
				setState(211);
				moduleContent();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitImportExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportExprContext importExpr() throws RecognitionException {
		ImportExprContext _localctx = new ImportExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__3);
			setState(220);
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
		public List<Annotation1Context> annotation1() {
			return getRuleContexts(Annotation1Context.class);
		}
		public Annotation1Context annotation1(int i) {
			return getRuleContext(Annotation1Context.class,i);
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
		public Annotation0Context annotation0() {
			return getRuleContext(Annotation0Context.class,0);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitModuleContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContentContext moduleContent() throws RecognitionException {
		ModuleContentContext _localctx = new ModuleContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_moduleContent);
		int _la;
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				initializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				typeAlias();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				alias();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(225);
					annotation1();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(231);
				interface0();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(232);
					annotation1();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
				class0();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(239);
					annotation1();
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(245);
				object0();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(246);
					annotation1();
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252);
				enum0();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(253);
					annotation1();
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(259);
				annotation0();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(260);
					annotation1();
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(266);
				function();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(267);
					annotation1();
					}
					}
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(273);
				variable();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(274);
					annotation1();
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(280);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitAlias(this);
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
			setState(283);
			match(T__4);
			setState(284);
			match(Identifier);
			setState(285);
			match(T__5);
			setState(286);
			match(Identifier);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NonNoneAccess) {
				{
				setState(287);
				match(NonNoneAccess);
				setState(288);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitTypeAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAliasContext typeAlias() throws RecognitionException {
		TypeAliasContext _localctx = new TypeAliasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__6);
			setState(292);
			match(Identifier);
			setState(293);
			match(T__5);
			setState(294);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitInterface0(this);
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
			setState(296);
			match(T__7);
			setState(297);
			match(Identifier);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(298);
				genericDeclaration();
				}
			}

			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(301);
				match(T__8);
				setState(302);
				type();
				}
			}

			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(305);
				match(T__1);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << Var) | (1L << Val))) != 0)) {
					{
					{
					setState(306);
					interfaceElement();
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(312);
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
		public List<Annotation1Context> annotation1() {
			return getRuleContexts(Annotation1Context.class);
		}
		public Annotation1Context annotation1(int i) {
			return getRuleContext(Annotation1Context.class,i);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitInterfaceElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceElementContext interfaceElement() throws RecognitionException {
		InterfaceElementContext _localctx = new InterfaceElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_interfaceElement);
		int _la;
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(315);
					annotation1();
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(322);
					annotation1();
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(328);
				valueDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(329);
					annotation1();
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(335);
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
		public TerminalNode By() { return getToken(KubeParser.By, 0); }
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitClass0(this);
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
			setState(338);
			match(T__9);
			setState(339);
			match(Identifier);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(340);
				genericDeclaration();
				}
			}

			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(343);
				primaryConstructor();
				}
			}

			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(346);
				match(T__8);
				setState(347);
				type();
				}
			}

			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==By) {
				{
				setState(350);
				match(By);
				setState(351);
				expression();
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(352);
					match(T__10);
					setState(353);
					expression();
					}
					}
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(361);
				match(T__1);
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << Var) | (1L << Val))) != 0)) {
					{
					{
					setState(362);
					classElement();
					}
					}
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(368);
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
		public List<Annotation1Context> annotation1() {
			return getRuleContexts(Annotation1Context.class);
		}
		public Annotation1Context annotation1(int i) {
			return getRuleContext(Annotation1Context.class,i);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitClassElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassElementContext classElement() throws RecognitionException {
		ClassElementContext _localctx = new ClassElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classElement);
		int _la;
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(371);
					annotation1();
					}
					}
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(377);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(378);
					annotation1();
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(384);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(385);
					annotation1();
					}
					}
					setState(390);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(391);
				function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(392);
					annotation1();
					}
					}
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(398);
				constructor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(399);
				initializer();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(400);
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
		public TerminalNode By() { return getToken(KubeParser.By, 0); }
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitObject0(this);
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
			setState(403);
			match(T__11);
			setState(404);
			match(Identifier);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(405);
				match(T__8);
				setState(406);
				type();
				}
			}

			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==By) {
				{
				setState(409);
				match(By);
				setState(410);
				expression();
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(411);
					match(T__10);
					setState(412);
					expression();
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(420);
			match(T__1);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << Var) | (1L << Val))) != 0)) {
				{
				{
				setState(421);
				objectElement();
				}
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(427);
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
		public List<Annotation1Context> annotation1() {
			return getRuleContexts(Annotation1Context.class);
		}
		public Annotation1Context annotation1(int i) {
			return getRuleContext(Annotation1Context.class,i);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitObjectElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectElementContext objectElement() throws RecognitionException {
		ObjectElementContext _localctx = new ObjectElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_objectElement);
		int _la;
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(429);
					annotation1();
					}
					}
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(435);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(436);
					annotation1();
					}
					}
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(442);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(443);
					annotation1();
					}
					}
					setState(448);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(449);
				function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(450);
				initializer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(451);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitEnum0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum0Context enum0() throws RecognitionException {
		Enum0Context _localctx = new Enum0Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_enum0);
		int _la;
		try {
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(T__12);
				setState(455);
				match(Identifier);
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(456);
					primaryConstructor();
					}
				}

				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(459);
					match(T__8);
					setState(460);
					type();
					}
				}

				setState(463);
				match(T__1);
				setState(464);
				enumList();
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(465);
					match(T__10);
					}
				}

				setState(468);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				match(T__12);
				setState(471);
				match(Identifier);
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(472);
					primaryConstructor();
					}
				}

				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(475);
					match(T__8);
					setState(476);
					type();
					}
				}

				setState(479);
				match(T__1);
				setState(480);
				enumList();
				setState(481);
				match(T__13);
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << Val))) != 0)) {
					{
					{
					setState(482);
					enumElement();
					}
					}
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(488);
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

	public static class Annotation0Context extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(KubeParser.Identifier, 0); }
		public Annotation0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation0; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitAnnotation0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Annotation0Context annotation0() throws RecognitionException {
		Annotation0Context _localctx = new Annotation0Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_annotation0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(T__14);
			setState(493);
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

	public static class Annotation1Context extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(KubeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(KubeParser.Identifier, i);
		}
		public TerminalNode NonNoneAccess() { return getToken(KubeParser.NonNoneAccess, 0); }
		public Annotation1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitAnnotation1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Annotation1Context annotation1() throws RecognitionException {
		Annotation1Context _localctx = new Annotation1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_annotation1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(T__15);
			setState(496);
			match(Identifier);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NonNoneAccess) {
				{
				setState(497);
				match(NonNoneAccess);
				setState(498);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitEnumList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumListContext enumList() throws RecognitionException {
		EnumListContext _localctx = new EnumListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enumList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			enumValue();
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(502);
					match(T__10);
					setState(503);
					enumValue();
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enumValue);
		int _la;
		try {
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(Identifier);
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(510);
					match(T__16);
					setState(511);
					match(T__17);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				match(Identifier);
				setState(515);
				match(T__16);
				setState(516);
				parameterExpression();
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(517);
					match(T__10);
					setState(518);
					parameterExpression();
					}
					}
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(524);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitParameterExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterExpressionContext parameterExpression() throws RecognitionException {
		ParameterExpressionContext _localctx = new ParameterExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameterExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(528);
				match(Identifier);
				setState(529);
				match(T__5);
				}
				break;
			}
			setState(532);
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
		public List<Annotation1Context> annotation1() {
			return getRuleContexts(Annotation1Context.class);
		}
		public Annotation1Context annotation1(int i) {
			return getRuleContext(Annotation1Context.class,i);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitEnumElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumElementContext enumElement() throws RecognitionException {
		EnumElementContext _localctx = new EnumElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enumElement);
		int _la;
		try {
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(534);
					annotation1();
					}
					}
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(540);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(541);
					annotation1();
					}
					}
					setState(546);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(547);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(548);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variable);
		int _la;
		try {
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				variableDeclaration();
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(552);
					match(T__5);
					setState(553);
					expression();
					}
				}

				setState(556);
				setter();
				setState(557);
				getter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				variableDeclaration();
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(560);
					match(T__5);
					setState(561);
					expression();
					}
				}

				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(564);
					getter();
					}
				}

				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(567);
					setter();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				variableDeclaration();
				setState(571);
				match(By);
				setState(572);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(Var);
			setState(577);
			match(Identifier);
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(578);
				match(T__8);
				setState(579);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_value);
		int _la;
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				valueDeclaration();
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(583);
					match(T__5);
					setState(584);
					expression();
					}
				}

				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(587);
					getter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				valueDeclaration();
				setState(591);
				match(By);
				setState(592);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitValueDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueDeclarationContext valueDeclaration() throws RecognitionException {
		ValueDeclarationContext _localctx = new ValueDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_valueDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(Val);
			setState(597);
			match(Identifier);
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(598);
				match(T__8);
				setState(599);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitGetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_getter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(T__18);
			setState(603);
			match(T__16);
			setState(604);
			match(T__17);
			setState(605);
			match(T__1);
			setState(607); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(606);
				statement();
				}
				}
				setState(609); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0) );
			setState(611);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitSetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_setter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(T__19);
			setState(614);
			match(T__16);
			setState(615);
			match(Identifier);
			setState(616);
			match(T__17);
			setState(617);
			match(T__1);
			setState(619); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(618);
				statement();
				}
				}
				setState(621); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0) );
			setState(623);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			functionDeclaration();
			setState(626);
			match(T__1);
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
				{
				{
				setState(627);
				statement();
				}
				}
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(633);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionDeclaration);
		int _la;
		try {
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				match(T__20);
				setState(636);
				match(Identifier);
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LessThan) {
					{
					setState(637);
					genericDeclaration();
					}
				}

				setState(640);
				match(T__16);
				setState(641);
				match(T__17);
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(642);
					match(T__8);
					setState(643);
					type();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				match(T__20);
				setState(647);
				match(Identifier);
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LessThan) {
					{
					setState(648);
					genericDeclaration();
					}
				}

				setState(651);
				match(T__16);
				setState(652);
				parameter();
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(653);
					match(T__10);
					setState(654);
					parameter();
					}
					}
					setState(659);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(660);
				match(T__17);
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(661);
					match(T__8);
					setState(662);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(Identifier);
			setState(668);
			match(T__8);
			setState(669);
			type();
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(670);
				match(T__5);
				setState(671);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(T__21);
			setState(675);
			match(T__1);
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
				{
				{
				setState(676);
				statement();
				}
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(682);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitFinalizer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalizerContext finalizer() throws RecognitionException {
		FinalizerContext _localctx = new FinalizerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_finalizer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(T__22);
			setState(685);
			match(T__1);
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
				{
				{
				setState(686);
				statement();
				}
				}
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(692);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitPrimaryConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryConstructorContext primaryConstructor() throws RecognitionException {
		PrimaryConstructorContext _localctx = new PrimaryConstructorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_primaryConstructor);
		int _la;
		try {
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				match(T__16);
				setState(695);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				match(T__16);
				setState(697);
				constructorParameter();
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(698);
					match(T__10);
					setState(699);
					constructorParameter();
					}
					}
					setState(704);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(705);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitConstructorParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorParameterContext constructorParameter() throws RecognitionException {
		ConstructorParameterContext _localctx = new ConstructorParameterContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constructorParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Var || _la==Val) {
				{
				setState(709);
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

			setState(712);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constructor);
		int _la;
		try {
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				match(T__23);
				setState(715);
				match(T__16);
				setState(716);
				match(T__17);
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(717);
					constructorCall();
					}
				}

				setState(720);
				match(T__1);
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(721);
					statement();
					}
					}
					setState(726);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(727);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				match(T__23);
				setState(729);
				match(T__16);
				setState(730);
				parameter();
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(731);
					match(T__10);
					setState(732);
					parameter();
					}
					}
					setState(737);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(738);
				match(T__17);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(739);
					constructorCall();
					}
				}

				setState(742);
				match(T__1);
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(743);
					statement();
					}
					}
					setState(748);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(749);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitConstructorCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorCallContext constructorCall() throws RecognitionException {
		ConstructorCallContext _localctx = new ConstructorCallContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constructorCall);
		int _la;
		try {
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
				match(T__8);
				setState(754);
				match(T__24);
				setState(755);
				match(T__16);
				setState(756);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				match(T__8);
				setState(758);
				match(T__24);
				setState(759);
				match(T__16);
				setState(760);
				parameterExpression();
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(761);
					match(T__10);
					setState(762);
					parameterExpression();
					}
					}
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(768);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_statement);
		try {
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(774);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(775);
				whenStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(776);
				forLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(777);
				whileLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(778);
				doWhileLoop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(779);
				expression();
				setState(780);
				assignmentOperator();
				setState(781);
				expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(783);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ifStatement);
		int _la;
		try {
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				match(T__25);
				setState(787);
				match(T__16);
				setState(788);
				expression();
				setState(789);
				match(T__17);
				setState(790);
				statement();
				setState(792);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(791);
					elseBlock();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
				match(T__25);
				setState(795);
				match(T__16);
				setState(796);
				expression();
				setState(797);
				match(T__17);
				setState(798);
				match(T__1);
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(799);
					statement();
					}
					}
					setState(804);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(805);
				match(T__2);
				setState(807);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(806);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elseBlock);
		int _la;
		try {
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(811);
				match(T__26);
				setState(812);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(813);
				match(T__26);
				setState(814);
				match(T__1);
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(815);
					statement();
					}
					}
					setState(820);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(821);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitWhenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenStatementContext whenStatement() throws RecognitionException {
		WhenStatementContext _localctx = new WhenStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_whenStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(T__27);
			setState(825);
			match(T__16);
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Val) {
				{
				setState(826);
				valueDeclaration();
				setState(827);
				match(T__5);
				}
			}

			setState(831);
			expression();
			setState(832);
			match(T__17);
			setState(833);
			match(T__1);
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__43) | (1L << T__46) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Is - 76)) | (1L << (NotIs - 76)) | (1L << (In - 76)) | (1L << (NotIn - 76)) | (1L << (Has - 76)) | (1L << (NotHas - 76)) | (1L << (IntegerLiteral - 76)) | (1L << (FloatingPointLiteral - 76)) | (1L << (BooleanLiteral - 76)) | (1L << (CharacterLiteral - 76)) | (1L << (StringLiteral - 76)) | (1L << (NoneLiteral - 76)) | (1L << (Identifier - 76)))) != 0)) {
				{
				{
				setState(834);
				whenStatementEntry();
				}
				}
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(840);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitWhenStatementEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenStatementEntryContext whenStatementEntry() throws RecognitionException {
		WhenStatementEntryContext _localctx = new WhenStatementEntryContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_whenStatementEntry);
		int _la;
		try {
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				whenCondition();
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(843);
					match(T__10);
					setState(844);
					whenCondition();
					}
					}
					setState(849);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(850);
				match(T__28);
				setState(851);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				whenCondition();
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(854);
					match(T__10);
					setState(855);
					whenCondition();
					}
					}
					setState(860);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(861);
				match(T__28);
				setState(862);
				match(T__1);
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(863);
					statement();
					}
					}
					setState(868);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(869);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(871);
				match(T__26);
				setState(872);
				match(T__28);
				setState(873);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(874);
				match(T__26);
				setState(875);
				match(T__28);
				setState(876);
				match(T__1);
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitWhenCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenConditionContext whenCondition() throws RecognitionException {
		WhenConditionContext _localctx = new WhenConditionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_whenCondition);
		try {
			setState(890);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__11:
			case T__16:
			case T__24:
			case T__25:
			case T__27:
			case T__43:
			case T__46:
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
				setState(886);
				expression();
				}
				break;
			case In:
			case NotIn:
				enterOuterAlt(_localctx, 2);
				{
				setState(887);
				rangeTest();
				}
				break;
			case Is:
			case NotIs:
				enterOuterAlt(_localctx, 3);
				{
				setState(888);
				typeTest();
				}
				break;
			case Has:
			case NotHas:
				enterOuterAlt(_localctx, 4);
				{
				setState(889);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitRangeTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeTestContext rangeTest() throws RecognitionException {
		RangeTestContext _localctx = new RangeTestContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_rangeTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			inOperator();
			setState(893);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitTypeTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTestContext typeTest() throws RecognitionException {
		TypeTestContext _localctx = new TypeTestContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			isOperator();
			setState(896);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitMemberTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberTestContext memberTest() throws RecognitionException {
		MemberTestContext _localctx = new MemberTestContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_memberTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			hasOperator();
			setState(899);
			match(Identifier);
			setState(900);
			match(T__8);
			setState(901);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_forLoop);
		int _la;
		try {
			setState(926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				match(T__29);
				setState(904);
				match(T__16);
				setState(905);
				match(Identifier);
				setState(906);
				match(In);
				setState(907);
				expression();
				setState(908);
				match(T__17);
				setState(909);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(911);
				match(T__29);
				setState(912);
				match(T__16);
				setState(913);
				match(Identifier);
				setState(914);
				match(In);
				setState(915);
				expression();
				setState(916);
				match(T__17);
				setState(917);
				match(T__1);
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(918);
					statement();
					}
					}
					setState(923);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(924);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_whileLoop);
		int _la;
		try {
			setState(947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(928);
				match(T__30);
				setState(929);
				match(T__16);
				setState(930);
				expression();
				setState(931);
				match(T__17);
				setState(932);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(934);
				match(T__30);
				setState(935);
				match(T__16);
				setState(936);
				expression();
				setState(937);
				match(T__17);
				setState(938);
				match(T__1);
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(939);
					statement();
					}
					}
					setState(944);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(945);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitDoWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileLoopContext doWhileLoop() throws RecognitionException {
		DoWhileLoopContext _localctx = new DoWhileLoopContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_doWhileLoop);
		int _la;
		try {
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				match(T__31);
				setState(950);
				statement();
				setState(951);
				match(T__30);
				setState(952);
				match(T__16);
				setState(953);
				expression();
				setState(954);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				match(T__31);
				setState(957);
				match(T__1);
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(958);
					statement();
					}
					}
					setState(963);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(964);
				match(T__2);
				setState(965);
				match(T__30);
				setState(966);
				match(T__16);
				setState(967);
				expression();
				setState(968);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_logicalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			logicalAndExpression();
			setState(981);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(977);
					match(LogicalOr);
					setState(978);
					logicalAndExpression();
					}
					} 
				}
				setState(983);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_logicalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			equalityExpression();
			setState(989);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(985);
					match(LogicalAnd);
					setState(986);
					equalityExpression();
					}
					} 
				}
				setState(991);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_equalityExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			comparisonExpression();
			setState(998);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(993);
					equalityOperator();
					setState(994);
					comparisonExpression();
					}
					} 
				}
				setState(1000);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_comparisonExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			infixOperation();
			setState(1005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1002);
				relationalOperator();
				setState(1003);
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
		public InfixOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixOperation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitInfixOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixOperationContext infixOperation() throws RecognitionException {
		InfixOperationContext _localctx = new InfixOperationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_infixOperation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			elvisExpression();
			setState(1021);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1019);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case In:
					case NotIn:
						{
						setState(1008);
						inOperator();
						setState(1009);
						elvisExpression();
						}
						break;
					case Is:
					case NotIs:
						{
						setState(1011);
						isOperator();
						setState(1012);
						type();
						}
						break;
					case Has:
					case NotHas:
						{
						setState(1014);
						hasOperator();
						setState(1015);
						match(Identifier);
						setState(1016);
						match(T__8);
						setState(1017);
						type();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1023);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitElvisExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElvisExpressionContext elvisExpression() throws RecognitionException {
		ElvisExpressionContext _localctx = new ElvisExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_elvisExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			rangeExpression();
			setState(1029);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1025);
					match(Elvis);
					setState(1026);
					rangeExpression();
					}
					} 
				}
				setState(1031);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeExpressionContext rangeExpression() throws RecognitionException {
		RangeExpressionContext _localctx = new RangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_rangeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			bitwiseExpression();
			setState(1038);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1033);
					rangeOperator();
					setState(1034);
					bitwiseExpression();
					}
					} 
				}
				setState(1040);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitBitwiseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseExpressionContext bitwiseExpression() throws RecognitionException {
		BitwiseExpressionContext _localctx = new BitwiseExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_bitwiseExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			additiveExpression();
			setState(1047);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1042);
					bitwiseOperator();
					setState(1043);
					additiveExpression();
					}
					} 
				}
				setState(1049);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			multiplicativeExpression();
			setState(1056);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1051);
					additiveOperator();
					setState(1052);
					multiplicativeExpression();
					}
					} 
				}
				setState(1058);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			prefixUnaryExpression();
			setState(1065);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1060);
					multiplicativeOperator();
					setState(1061);
					prefixUnaryExpression();
					}
					} 
				}
				setState(1067);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitPrefixUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixUnaryExpressionContext prefixUnaryExpression() throws RecognitionException {
		PrefixUnaryExpressionContext _localctx = new PrefixUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_prefixUnaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0)) {
				{
				{
				setState(1068);
				preUnaryOperator();
				}
				}
				setState(1073);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1074);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitPostfixUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixUnaryExpressionContext postfixUnaryExpression() throws RecognitionException {
		PostfixUnaryExpressionContext _localctx = new PostfixUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_postfixUnaryExpression);
		try {
			int _alt;
			setState(1083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1076);
				primaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1077);
				primaryExpression();
				setState(1079); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1078);
						postfixUnarySuffix();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1081); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitPostfixUnarySuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixUnarySuffixContext postfixUnarySuffix() throws RecognitionException {
		PostfixUnarySuffixContext _localctx = new PostfixUnarySuffixContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_postfixUnarySuffix);
		try {
			setState(1090);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Increment:
			case Decrement:
				enterOuterAlt(_localctx, 1);
				{
				setState(1085);
				postUnaryOperator();
				}
				break;
			case LessThan:
				enterOuterAlt(_localctx, 2);
				{
				setState(1086);
				generic();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(1087);
				callSuffix();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 4);
				{
				setState(1088);
				indexingSuffix();
				}
				break;
			case NoneSafeAccess:
			case NonNoneAccess:
				enterOuterAlt(_localctx, 5);
				{
				setState(1089);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitCallSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallSuffixContext callSuffix() throws RecognitionException {
		CallSuffixContext _localctx = new CallSuffixContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_callSuffix);
		try {
			int _alt;
			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1092);
				match(T__16);
				setState(1093);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1094);
				match(T__16);
				setState(1095);
				parameterExpression();
				setState(1100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1096);
						match(T__10);
						setState(1097);
						parameterExpression();
						}
						} 
					}
					setState(1102);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitIndexingSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexingSuffixContext indexingSuffix() throws RecognitionException {
		IndexingSuffixContext _localctx = new IndexingSuffixContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_indexingSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			match(T__43);
			setState(1106);
			expression();
			setState(1111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(1107);
				match(T__10);
				setState(1108);
				expression();
				}
				}
				setState(1113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1114);
			match(T__44);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitNavigationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigationSuffixContext navigationSuffix() throws RecognitionException {
		NavigationSuffixContext _localctx = new NavigationSuffixContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_navigationSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			memberAccess();
			setState(1117);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_primaryExpression);
		try {
			setState(1129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1119);
				match(T__16);
				setState(1120);
				expression();
				setState(1121);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1124);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1125);
				thisExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1126);
				ifExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1127);
				whenExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1128);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisExpressionContext thisExpression() throws RecognitionException {
		ThisExpressionContext _localctx = new ThisExpressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_thisExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			match(T__24);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_literal);
		try {
			setState(1145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1133);
				array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1134);
				map();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1135);
				set();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1136);
				tuple();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1137);
				lambdaLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1138);
				objectLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1139);
				match(IntegerLiteral);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1140);
				match(FloatingPointLiteral);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1141);
				match(StringLiteral);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1142);
				match(CharacterLiteral);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1143);
				match(BooleanLiteral);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1144);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_array);
		int _la;
		try {
			setState(1160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1147);
				match(T__43);
				setState(1148);
				match(T__44);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1149);
				match(T__43);
				setState(1150);
				expression();
				setState(1155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(1151);
					match(T__10);
					setState(1152);
					expression();
					}
					}
					setState(1157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1158);
				match(T__44);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_map);
		int _la;
		try {
			setState(1180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1162);
				match(T__1);
				setState(1163);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1164);
				match(T__1);
				setState(1165);
				expression();
				setState(1166);
				match(T__45);
				setState(1167);
				expression();
				setState(1175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(1168);
					match(T__10);
					setState(1169);
					expression();
					setState(1170);
					match(T__45);
					setState(1171);
					expression();
					}
					}
					setState(1177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1178);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			match(T__1);
			setState(1183);
			expression();
			setState(1188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(1184);
				match(T__10);
				setState(1185);
				expression();
				}
				}
				setState(1190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1191);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_tuple);
		int _la;
		try {
			int _alt;
			setState(1213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1193);
				match(T__16);
				setState(1194);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1195);
				match(T__16);
				setState(1196);
				expression();
				setState(1197);
				match(T__10);
				setState(1198);
				match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1200);
				match(T__16);
				setState(1201);
				expression();
				setState(1204); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1202);
						match(T__10);
						setState(1203);
						expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1206); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(1209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(1208);
					match(T__10);
					}
				}

				setState(1211);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitLambdaLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaLiteralContext lambdaLiteral() throws RecognitionException {
		LambdaLiteralContext _localctx = new LambdaLiteralContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_lambdaLiteral);
		int _la;
		try {
			setState(1241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1215);
				match(T__1);
				setState(1219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(1216);
					statement();
					}
					}
					setState(1221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1222);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1223);
				match(T__1);
				setState(1224);
				lambdaParameter();
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(1225);
					match(T__10);
					setState(1226);
					lambdaParameter();
					}
					}
					setState(1231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1232);
				match(T__28);
				setState(1236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(1233);
					statement();
					}
					}
					setState(1238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1239);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitLambdaParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParameterContext lambdaParameter() throws RecognitionException {
		LambdaParameterContext _localctx = new LambdaParameterContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_lambdaParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			match(Identifier);
			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(1244);
				match(T__8);
				setState(1245);
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
		public TerminalNode By() { return getToken(KubeParser.By, 0); }
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			match(T__11);
			setState(1251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(1249);
				match(T__8);
				setState(1250);
				type();
				}
			}

			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==By) {
				{
				setState(1253);
				match(By);
				setState(1254);
				expression();
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(1255);
					match(T__10);
					setState(1256);
					expression();
					}
					}
					setState(1261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(1264);
			match(T__1);
			setState(1268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << Var) | (1L << Val))) != 0)) {
				{
				{
				setState(1265);
				objectElement();
				}
				}
				setState(1270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1271);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitReturnExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnExpressionContext returnExpression() throws RecognitionException {
		ReturnExpressionContext _localctx = new ReturnExpressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_returnExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			match(T__46);
			setState(1275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1274);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_memberAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitPostUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostUnaryOperatorContext postUnaryOperator() throws RecognitionException {
		PostUnaryOperatorContext _localctx = new PostUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_postUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitPreUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryOperatorContext preUnaryOperator() throws RecognitionException {
		PreUnaryOperatorContext _localctx = new PreUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_preUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOperatorContext multiplicativeOperator() throws RecognitionException {
		MultiplicativeOperatorContext _localctx = new MultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitBitwiseOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseOperatorContext bitwiseOperator() throws RecognitionException {
		BitwiseOperatorContext _localctx = new BitwiseOperatorContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_bitwiseOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitRangeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeOperatorContext rangeOperator() throws RecognitionException {
		RangeOperatorContext _localctx = new RangeOperatorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_rangeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitRelationalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitIsOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsOperatorContext isOperator() throws RecognitionException {
		IsOperatorContext _localctx = new IsOperatorContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_isOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitInOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InOperatorContext inOperator() throws RecognitionException {
		InOperatorContext _localctx = new InOperatorContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_inOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitHasOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HasOperatorContext hasOperator() throws RecognitionException {
		HasOperatorContext _localctx = new HasOperatorContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_hasOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitEqualityOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityOperatorContext equalityOperator() throws RecognitionException {
		EqualityOperatorContext _localctx = new EqualityOperatorContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_ifExpression);
		try {
			int _alt;
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1301);
				match(T__25);
				setState(1302);
				match(T__16);
				setState(1303);
				expression();
				setState(1304);
				match(T__17);
				setState(1305);
				expression();
				setState(1306);
				elseExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1308);
				match(T__25);
				setState(1309);
				match(T__16);
				setState(1310);
				expression();
				setState(1311);
				match(T__17);
				setState(1312);
				match(T__1);
				setState(1316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1313);
						statement();
						}
						} 
					}
					setState(1318);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				}
				setState(1319);
				expression();
				setState(1320);
				match(T__2);
				setState(1321);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitElseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseExpressionContext elseExpression() throws RecognitionException {
		ElseExpressionContext _localctx = new ElseExpressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_elseExpression);
		try {
			int _alt;
			setState(1338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1325);
				match(T__26);
				setState(1326);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1327);
				match(T__26);
				setState(1328);
				match(T__1);
				setState(1332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1329);
						statement();
						}
						} 
					}
					setState(1334);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				}
				setState(1335);
				expression();
				setState(1336);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitWhenExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenExpressionContext whenExpression() throws RecognitionException {
		WhenExpressionContext _localctx = new WhenExpressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_whenExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			match(T__27);
			setState(1341);
			match(T__16);
			setState(1345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Val) {
				{
				setState(1342);
				valueDeclaration();
				setState(1343);
				match(T__5);
				}
			}

			setState(1347);
			expression();
			setState(1348);
			match(T__17);
			setState(1349);
			match(T__1);
			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__43) | (1L << T__46) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Is - 76)) | (1L << (NotIs - 76)) | (1L << (In - 76)) | (1L << (NotIn - 76)) | (1L << (Has - 76)) | (1L << (NotHas - 76)) | (1L << (IntegerLiteral - 76)) | (1L << (FloatingPointLiteral - 76)) | (1L << (BooleanLiteral - 76)) | (1L << (CharacterLiteral - 76)) | (1L << (StringLiteral - 76)) | (1L << (NoneLiteral - 76)) | (1L << (Identifier - 76)))) != 0)) {
				{
				{
				setState(1350);
				whenExpressionEntry();
				}
				}
				setState(1355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1356);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitWhenExpressionEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenExpressionEntryContext whenExpressionEntry() throws RecognitionException {
		WhenExpressionEntryContext _localctx = new WhenExpressionEntryContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_whenExpressionEntry);
		int _la;
		try {
			int _alt;
			setState(1403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1358);
				whenCondition();
				setState(1363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(1359);
					match(T__10);
					setState(1360);
					whenCondition();
					}
					}
					setState(1365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1366);
				match(T__28);
				setState(1367);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1369);
				whenCondition();
				setState(1374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(1370);
					match(T__10);
					setState(1371);
					whenCondition();
					}
					}
					setState(1376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1377);
				match(T__28);
				setState(1378);
				match(T__1);
				setState(1382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1379);
						statement();
						}
						} 
					}
					setState(1384);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				}
				setState(1385);
				expression();
				setState(1386);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1388);
				match(T__26);
				setState(1389);
				match(T__28);
				setState(1390);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1391);
				match(T__26);
				setState(1392);
				match(T__28);
				setState(1393);
				match(T__1);
				setState(1397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
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
					_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
				}
				setState(1400);
				expression();
				setState(1401);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitGenericDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericDeclarationContext genericDeclaration() throws RecognitionException {
		GenericDeclarationContext _localctx = new GenericDeclarationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_genericDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			match(LessThan);
			setState(1406);
			genericTypeDeclaration();
			setState(1411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(1407);
				match(T__10);
				setState(1408);
				genericTypeDeclaration();
				}
				}
				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1414);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitGenericTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericTypeDeclarationContext genericTypeDeclaration() throws RecognitionException {
		GenericTypeDeclarationContext _localctx = new GenericTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_genericTypeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			match(Identifier);
			setState(1419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(1417);
				match(T__8);
				setState(1418);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitGeneric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericContext generic() throws RecognitionException {
		GenericContext _localctx = new GenericContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_generic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			match(LessThan);
			setState(1422);
			type();
			setState(1427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(1423);
				match(T__10);
				setState(1424);
				type();
				}
				}
				setState(1429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1430);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
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
		public List<SumTypeContext> sumType() {
			return getRuleContexts(SumTypeContext.class);
		}
		public SumTypeContext sumType(int i) {
			return getRuleContext(SumTypeContext.class,i);
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
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitUnionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionTypeContext unionType() throws RecognitionException {
		UnionTypeContext _localctx = new UnionTypeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_unionType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			sumType();
			setState(1439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1435);
					match(BitwiseOr);
					setState(1436);
					sumType();
					}
					} 
				}
				setState(1441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
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

	public static class SumTypeContext extends ParserRuleContext {
		public List<SimpleTypeContext> simpleType() {
			return getRuleContexts(SimpleTypeContext.class);
		}
		public SimpleTypeContext simpleType(int i) {
			return getRuleContext(SimpleTypeContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(KubeParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(KubeParser.Plus, i);
		}
		public SumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitSumType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumTypeContext sumType() throws RecognitionException {
		SumTypeContext _localctx = new SumTypeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_sumType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			simpleType();
			setState(1447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1443);
					match(Plus);
					setState(1444);
					simpleType();
					}
					} 
				}
				setState(1449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
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

	public static class SimpleTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(KubeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(KubeParser.Identifier, i);
		}
		public TerminalNode NonNoneAccess() { return getToken(KubeParser.NonNoneAccess, 0); }
		public GenericContext generic() {
			return getRuleContext(GenericContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor) return ((KubeVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_simpleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			match(Identifier);
			setState(1453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1451);
				match(NonNoneAccess);
				setState(1452);
				match(Identifier);
				}
				break;
			}
			setState(1456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1455);
				generic();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3b\u05b5\4\2\t\2\4"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\7\2\u00c8\n\2\f\2\16\2\u00cb\13\2\3\3\3\3\3"+
		"\3\3\3\7\3\u00d1\n\3\f\3\16\3\u00d4\13\3\3\3\7\3\u00d7\n\3\f\3\16\3\u00da"+
		"\13\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u00e5\n\5\f\5\16\5\u00e8"+
		"\13\5\3\5\3\5\7\5\u00ec\n\5\f\5\16\5\u00ef\13\5\3\5\3\5\7\5\u00f3\n\5"+
		"\f\5\16\5\u00f6\13\5\3\5\3\5\7\5\u00fa\n\5\f\5\16\5\u00fd\13\5\3\5\3\5"+
		"\7\5\u0101\n\5\f\5\16\5\u0104\13\5\3\5\3\5\7\5\u0108\n\5\f\5\16\5\u010b"+
		"\13\5\3\5\3\5\7\5\u010f\n\5\f\5\16\5\u0112\13\5\3\5\3\5\7\5\u0116\n\5"+
		"\f\5\16\5\u0119\13\5\3\5\5\5\u011c\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0124"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u012e\n\b\3\b\3\b\5\b\u0132\n"+
		"\b\3\b\3\b\7\b\u0136\n\b\f\b\16\b\u0139\13\b\3\b\5\b\u013c\n\b\3\t\7\t"+
		"\u013f\n\t\f\t\16\t\u0142\13\t\3\t\3\t\7\t\u0146\n\t\f\t\16\t\u0149\13"+
		"\t\3\t\3\t\7\t\u014d\n\t\f\t\16\t\u0150\13\t\3\t\5\t\u0153\n\t\3\n\3\n"+
		"\3\n\5\n\u0158\n\n\3\n\5\n\u015b\n\n\3\n\3\n\5\n\u015f\n\n\3\n\3\n\3\n"+
		"\3\n\7\n\u0165\n\n\f\n\16\n\u0168\13\n\5\n\u016a\n\n\3\n\3\n\7\n\u016e"+
		"\n\n\f\n\16\n\u0171\13\n\3\n\5\n\u0174\n\n\3\13\7\13\u0177\n\13\f\13\16"+
		"\13\u017a\13\13\3\13\3\13\7\13\u017e\n\13\f\13\16\13\u0181\13\13\3\13"+
		"\3\13\7\13\u0185\n\13\f\13\16\13\u0188\13\13\3\13\3\13\7\13\u018c\n\13"+
		"\f\13\16\13\u018f\13\13\3\13\3\13\3\13\5\13\u0194\n\13\3\f\3\f\3\f\3\f"+
		"\5\f\u019a\n\f\3\f\3\f\3\f\3\f\7\f\u01a0\n\f\f\f\16\f\u01a3\13\f\5\f\u01a5"+
		"\n\f\3\f\3\f\7\f\u01a9\n\f\f\f\16\f\u01ac\13\f\3\f\3\f\3\r\7\r\u01b1\n"+
		"\r\f\r\16\r\u01b4\13\r\3\r\3\r\7\r\u01b8\n\r\f\r\16\r\u01bb\13\r\3\r\3"+
		"\r\7\r\u01bf\n\r\f\r\16\r\u01c2\13\r\3\r\3\r\3\r\5\r\u01c7\n\r\3\16\3"+
		"\16\3\16\5\16\u01cc\n\16\3\16\3\16\5\16\u01d0\n\16\3\16\3\16\3\16\5\16"+
		"\u01d5\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u01dc\n\16\3\16\3\16\5\16\u01e0"+
		"\n\16\3\16\3\16\3\16\3\16\7\16\u01e6\n\16\f\16\16\16\u01e9\13\16\3\16"+
		"\3\16\5\16\u01ed\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u01f6\n"+
		"\20\3\21\3\21\3\21\7\21\u01fb\n\21\f\21\16\21\u01fe\13\21\3\22\3\22\3"+
		"\22\5\22\u0203\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u020a\n\22\f\22\16\22"+
		"\u020d\13\22\3\22\3\22\5\22\u0211\n\22\3\23\3\23\5\23\u0215\n\23\3\23"+
		"\3\23\3\24\7\24\u021a\n\24\f\24\16\24\u021d\13\24\3\24\3\24\7\24\u0221"+
		"\n\24\f\24\16\24\u0224\13\24\3\24\3\24\5\24\u0228\n\24\3\25\3\25\3\25"+
		"\5\25\u022d\n\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0235\n\25\3\25\5"+
		"\25\u0238\n\25\3\25\5\25\u023b\n\25\3\25\3\25\3\25\3\25\5\25\u0241\n\25"+
		"\3\26\3\26\3\26\3\26\5\26\u0247\n\26\3\27\3\27\3\27\5\27\u024c\n\27\3"+
		"\27\5\27\u024f\n\27\3\27\3\27\3\27\3\27\5\27\u0255\n\27\3\30\3\30\3\30"+
		"\3\30\5\30\u025b\n\30\3\31\3\31\3\31\3\31\3\31\6\31\u0262\n\31\r\31\16"+
		"\31\u0263\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\6\32\u026e\n\32\r\32"+
		"\16\32\u026f\3\32\3\32\3\33\3\33\3\33\7\33\u0277\n\33\f\33\16\33\u027a"+
		"\13\33\3\33\3\33\3\34\3\34\3\34\5\34\u0281\n\34\3\34\3\34\3\34\3\34\5"+
		"\34\u0287\n\34\3\34\3\34\3\34\5\34\u028c\n\34\3\34\3\34\3\34\3\34\7\34"+
		"\u0292\n\34\f\34\16\34\u0295\13\34\3\34\3\34\3\34\5\34\u029a\n\34\5\34"+
		"\u029c\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u02a3\n\35\3\36\3\36\3\36\7"+
		"\36\u02a8\n\36\f\36\16\36\u02ab\13\36\3\36\3\36\3\37\3\37\3\37\7\37\u02b2"+
		"\n\37\f\37\16\37\u02b5\13\37\3\37\3\37\3 \3 \3 \3 \3 \3 \7 \u02bf\n \f"+
		" \16 \u02c2\13 \3 \3 \5 \u02c6\n \3!\5!\u02c9\n!\3!\3!\3\"\3\"\3\"\3\""+
		"\5\"\u02d1\n\"\3\"\3\"\7\"\u02d5\n\"\f\"\16\"\u02d8\13\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\7\"\u02e0\n\"\f\"\16\"\u02e3\13\"\3\"\3\"\5\"\u02e7\n\"\3\""+
		"\3\"\7\"\u02eb\n\"\f\"\16\"\u02ee\13\"\3\"\3\"\5\"\u02f2\n\"\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\7#\u02fe\n#\f#\16#\u0301\13#\3#\3#\5#\u0305\n#\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0313\n$\3%\3%\3%\3%\3%\3%\5%\u031b"+
		"\n%\3%\3%\3%\3%\3%\3%\7%\u0323\n%\f%\16%\u0326\13%\3%\3%\5%\u032a\n%\5"+
		"%\u032c\n%\3&\3&\3&\3&\3&\7&\u0333\n&\f&\16&\u0336\13&\3&\5&\u0339\n&"+
		"\3\'\3\'\3\'\3\'\3\'\5\'\u0340\n\'\3\'\3\'\3\'\3\'\7\'\u0346\n\'\f\'\16"+
		"\'\u0349\13\'\3\'\3\'\3(\3(\3(\7(\u0350\n(\f(\16(\u0353\13(\3(\3(\3(\3"+
		"(\3(\3(\7(\u035b\n(\f(\16(\u035e\13(\3(\3(\3(\7(\u0363\n(\f(\16(\u0366"+
		"\13(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u0371\n(\f(\16(\u0374\13(\3(\5(\u0377"+
		"\n(\3)\3)\3)\3)\5)\u037d\n)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u039a\n-\f-\16-\u039d\13-\3"+
		"-\3-\5-\u03a1\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u03af\n.\f.\16"+
		".\u03b2\13.\3.\3.\5.\u03b6\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u03c2\n"+
		"/\f/\16/\u03c5\13/\3/\3/\3/\3/\3/\3/\5/\u03cd\n/\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\3\62\7\62\u03d6\n\62\f\62\16\62\u03d9\13\62\3\63\3\63\3\63\7"+
		"\63\u03de\n\63\f\63\16\63\u03e1\13\63\3\64\3\64\3\64\3\64\7\64\u03e7\n"+
		"\64\f\64\16\64\u03ea\13\64\3\65\3\65\3\65\3\65\5\65\u03f0\n\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u03fe\n\66"+
		"\f\66\16\66\u0401\13\66\3\67\3\67\3\67\7\67\u0406\n\67\f\67\16\67\u0409"+
		"\13\67\38\38\38\38\78\u040f\n8\f8\168\u0412\138\39\39\39\39\79\u0418\n"+
		"9\f9\169\u041b\139\3:\3:\3:\3:\7:\u0421\n:\f:\16:\u0424\13:\3;\3;\3;\3"+
		";\7;\u042a\n;\f;\16;\u042d\13;\3<\7<\u0430\n<\f<\16<\u0433\13<\3<\3<\3"+
		"=\3=\3=\6=\u043a\n=\r=\16=\u043b\5=\u043e\n=\3>\3>\3>\3>\3>\5>\u0445\n"+
		">\3?\3?\3?\3?\3?\3?\7?\u044d\n?\f?\16?\u0450\13?\5?\u0452\n?\3@\3@\3@"+
		"\3@\7@\u0458\n@\f@\16@\u045b\13@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3"+
		"B\3B\3B\5B\u046c\nB\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u047c"+
		"\nD\3E\3E\3E\3E\3E\3E\7E\u0484\nE\fE\16E\u0487\13E\3E\3E\5E\u048b\nE\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\7F\u0498\nF\fF\16F\u049b\13F\3F\3F\5F"+
		"\u049f\nF\3G\3G\3G\3G\7G\u04a5\nG\fG\16G\u04a8\13G\3G\3G\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\6H\u04b7\nH\rH\16H\u04b8\3H\5H\u04bc\nH\3H\3H\5H\u04c0"+
		"\nH\3I\3I\7I\u04c4\nI\fI\16I\u04c7\13I\3I\3I\3I\3I\3I\7I\u04ce\nI\fI\16"+
		"I\u04d1\13I\3I\3I\7I\u04d5\nI\fI\16I\u04d8\13I\3I\3I\5I\u04dc\nI\3J\3"+
		"J\3J\5J\u04e1\nJ\3K\3K\3K\5K\u04e6\nK\3K\3K\3K\3K\7K\u04ec\nK\fK\16K\u04ef"+
		"\13K\5K\u04f1\nK\3K\3K\7K\u04f5\nK\fK\16K\u04f8\13K\3K\3K\3L\3L\5L\u04fe"+
		"\nL\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W"+
		"\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u0525\nY\fY\16Y\u0528"+
		"\13Y\3Y\3Y\3Y\3Y\5Y\u052e\nY\3Z\3Z\3Z\3Z\3Z\7Z\u0535\nZ\fZ\16Z\u0538\13"+
		"Z\3Z\3Z\3Z\5Z\u053d\nZ\3[\3[\3[\3[\3[\5[\u0544\n[\3[\3[\3[\3[\7[\u054a"+
		"\n[\f[\16[\u054d\13[\3[\3[\3\\\3\\\3\\\7\\\u0554\n\\\f\\\16\\\u0557\13"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u055f\n\\\f\\\16\\\u0562\13\\\3\\\3\\\3"+
		"\\\7\\\u0567\n\\\f\\\16\\\u056a\13\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\7\\\u0576\n\\\f\\\16\\\u0579\13\\\3\\\3\\\3\\\5\\\u057e\n\\\3]"+
		"\3]\3]\3]\7]\u0584\n]\f]\16]\u0587\13]\3]\3]\3^\3^\3^\5^\u058e\n^\3_\3"+
		"_\3_\3_\7_\u0594\n_\f_\16_\u0597\13_\3_\3_\3`\3`\3a\3a\3a\7a\u05a0\na"+
		"\fa\16a\u05a3\13a\3b\3b\3b\7b\u05a8\nb\fb\16b\u05ab\13b\3c\3c\3c\5c\u05b0"+
		"\nc\3c\5c\u05b3\nc\3c\2\2d\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\2\20\3\2\62\63\4\2\b"+
		"\b#-\3\2\64\65\3\2\66\67\4\2\669?@\3\2;>\3\2?@\3\2AF\3\2GH\3\2IL\3\2N"+
		"O\3\2PQ\3\2RS\3\2TU\2\u062d\2\u00c9\3\2\2\2\4\u00cc\3\2\2\2\6\u00dd\3"+
		"\2\2\2\b\u011b\3\2\2\2\n\u011d\3\2\2\2\f\u0125\3\2\2\2\16\u012a\3\2\2"+
		"\2\20\u0152\3\2\2\2\22\u0154\3\2\2\2\24\u0193\3\2\2\2\26\u0195\3\2\2\2"+
		"\30\u01c6\3\2\2\2\32\u01ec\3\2\2\2\34\u01ee\3\2\2\2\36\u01f1\3\2\2\2 "+
		"\u01f7\3\2\2\2\"\u0210\3\2\2\2$\u0214\3\2\2\2&\u0227\3\2\2\2(\u0240\3"+
		"\2\2\2*\u0242\3\2\2\2,\u0254\3\2\2\2.\u0256\3\2\2\2\60\u025c\3\2\2\2\62"+
		"\u0267\3\2\2\2\64\u0273\3\2\2\2\66\u029b\3\2\2\28\u029d\3\2\2\2:\u02a4"+
		"\3\2\2\2<\u02ae\3\2\2\2>\u02c5\3\2\2\2@\u02c8\3\2\2\2B\u02f1\3\2\2\2D"+
		"\u0304\3\2\2\2F\u0312\3\2\2\2H\u032b\3\2\2\2J\u0338\3\2\2\2L\u033a\3\2"+
		"\2\2N\u0376\3\2\2\2P\u037c\3\2\2\2R\u037e\3\2\2\2T\u0381\3\2\2\2V\u0384"+
		"\3\2\2\2X\u03a0\3\2\2\2Z\u03b5\3\2\2\2\\\u03cc\3\2\2\2^\u03ce\3\2\2\2"+
		"`\u03d0\3\2\2\2b\u03d2\3\2\2\2d\u03da\3\2\2\2f\u03e2\3\2\2\2h\u03eb\3"+
		"\2\2\2j\u03f1\3\2\2\2l\u0402\3\2\2\2n\u040a\3\2\2\2p\u0413\3\2\2\2r\u041c"+
		"\3\2\2\2t\u0425\3\2\2\2v\u0431\3\2\2\2x\u043d\3\2\2\2z\u0444\3\2\2\2|"+
		"\u0451\3\2\2\2~\u0453\3\2\2\2\u0080\u045e\3\2\2\2\u0082\u046b\3\2\2\2"+
		"\u0084\u046d\3\2\2\2\u0086\u047b\3\2\2\2\u0088\u048a\3\2\2\2\u008a\u049e"+
		"\3\2\2\2\u008c\u04a0\3\2\2\2\u008e\u04bf\3\2\2\2\u0090\u04db\3\2\2\2\u0092"+
		"\u04dd\3\2\2\2\u0094\u04e2\3\2\2\2\u0096\u04fb\3\2\2\2\u0098\u04ff\3\2"+
		"\2\2\u009a\u0501\3\2\2\2\u009c\u0503\3\2\2\2\u009e\u0505\3\2\2\2\u00a0"+
		"\u0507\3\2\2\2\u00a2\u0509\3\2\2\2\u00a4\u050b\3\2\2\2\u00a6\u050d\3\2"+
		"\2\2\u00a8\u050f\3\2\2\2\u00aa\u0511\3\2\2\2\u00ac\u0513\3\2\2\2\u00ae"+
		"\u0515\3\2\2\2\u00b0\u052d\3\2\2\2\u00b2\u053c\3\2\2\2\u00b4\u053e\3\2"+
		"\2\2\u00b6\u057d\3\2\2\2\u00b8\u057f\3\2\2\2\u00ba\u058a\3\2\2\2\u00bc"+
		"\u058f\3\2\2\2\u00be\u059a\3\2\2\2\u00c0\u059c\3\2\2\2\u00c2\u05a4\3\2"+
		"\2\2\u00c4\u05ac\3\2\2\2\u00c6\u00c8\5\4\3\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\3\3\2\2\2"+
		"\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\3\2\2\u00cd\u00ce\7`\2\2\u00ce\u00d2"+
		"\7\4\2\2\u00cf\u00d1\5\6\4\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d8\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d5\u00d7\5\b\5\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00dc\7\5\2\2\u00dc\5\3\2\2\2\u00dd\u00de\7\6\2\2\u00de\u00df"+
		"\7`\2\2\u00df\7\3\2\2\2\u00e0\u011c\5:\36\2\u00e1\u011c\5\f\7\2\u00e2"+
		"\u011c\5\n\6\2\u00e3\u00e5\5\36\20\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3"+
		"\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u011c\5\16\b\2\u00ea\u00ec\5\36\20\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u011c\5\22\n\2\u00f1\u00f3\5"+
		"\36\20\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u011c\5\26"+
		"\f\2\u00f8\u00fa\5\36\20\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fe\u011c\5\32\16\2\u00ff\u0101\5\36\20\2\u0100\u00ff\3\2\2\2\u0101"+
		"\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0105\u011c\5\34\17\2\u0106\u0108\5\36\20\2\u0107"+
		"\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u011c\5\64\33\2\u010d"+
		"\u010f\5\36\20\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3"+
		"\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u011c\5(\25\2\u0114\u0116\5\36\20\2\u0115\u0114\3\2\2\2\u0116\u0119\3"+
		"\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011c\5,\27\2\u011b\u00e0\3\2\2\2\u011b\u00e1\3\2"+
		"\2\2\u011b\u00e2\3\2\2\2\u011b\u00e6\3\2\2\2\u011b\u00ed\3\2\2\2\u011b"+
		"\u00f4\3\2\2\2\u011b\u00fb\3\2\2\2\u011b\u0102\3\2\2\2\u011b\u0109\3\2"+
		"\2\2\u011b\u0110\3\2\2\2\u011b\u0117\3\2\2\2\u011c\t\3\2\2\2\u011d\u011e"+
		"\7\7\2\2\u011e\u011f\7`\2\2\u011f\u0120\7\b\2\2\u0120\u0123\7`\2\2\u0121"+
		"\u0122\7\65\2\2\u0122\u0124\7`\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\13\3\2\2\2\u0125\u0126\7\t\2\2\u0126\u0127\7`\2\2\u0127\u0128"+
		"\7\b\2\2\u0128\u0129\5\u00be`\2\u0129\r\3\2\2\2\u012a\u012b\7\n\2\2\u012b"+
		"\u012d\7`\2\2\u012c\u012e\5\u00b8]\2\u012d\u012c\3\2\2\2\u012d\u012e\3"+
		"\2\2\2\u012e\u0131\3\2\2\2\u012f\u0130\7\13\2\2\u0130\u0132\5\u00be`\2"+
		"\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u013b\3\2\2\2\u0133\u0137"+
		"\7\4\2\2\u0134\u0136\5\20\t\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2"+
		"\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u013a\u013c\7\5\2\2\u013b\u0133\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\17\3\2\2\2\u013d\u013f\5\36\20\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0153\5*\26\2\u0144\u0146\5\36\20\2\u0145\u0144\3"+
		"\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u0153\5.\30\2\u014b\u014d\5\36"+
		"\20\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0153\5\66"+
		"\34\2\u0152\u0140\3\2\2\2\u0152\u0147\3\2\2\2\u0152\u014e\3\2\2\2\u0153"+
		"\21\3\2\2\2\u0154\u0155\7\f\2\2\u0155\u0157\7`\2\2\u0156\u0158\5\u00b8"+
		"]\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159"+
		"\u015b\5> \2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015e\3\2\2"+
		"\2\u015c\u015d\7\13\2\2\u015d\u015f\5\u00be`\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0169\3\2\2\2\u0160\u0161\7M\2\2\u0161\u0166\5`\61"+
		"\2\u0162\u0163\7\r\2\2\u0163\u0165\5`\61\2\u0164\u0162\3\2\2\2\u0165\u0168"+
		"\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u016a\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0169\u0160\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0173\3\2"+
		"\2\2\u016b\u016f\7\4\2\2\u016c\u016e\5\24\13\2\u016d\u016c\3\2\2\2\u016e"+
		"\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0172\u0174\7\5\2\2\u0173\u016b\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\23\3\2\2\2\u0175\u0177\5\36\20\2\u0176\u0175\3\2"+
		"\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u0194\5(\25\2\u017c\u017e\5\36"+
		"\20\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0194\5,"+
		"\27\2\u0183\u0185\5\36\20\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0186\3\2"+
		"\2\2\u0189\u0194\5\64\33\2\u018a\u018c\5\36\20\2\u018b\u018a\3\2\2\2\u018c"+
		"\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2"+
		"\2\2\u018f\u018d\3\2\2\2\u0190\u0194\5B\"\2\u0191\u0194\5:\36\2\u0192"+
		"\u0194\5<\37\2\u0193\u0178\3\2\2\2\u0193\u017f\3\2\2\2\u0193\u0186\3\2"+
		"\2\2\u0193\u018d\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194"+
		"\25\3\2\2\2\u0195\u0196\7\16\2\2\u0196\u0199\7`\2\2\u0197\u0198\7\13\2"+
		"\2\u0198\u019a\5\u00be`\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u01a4\3\2\2\2\u019b\u019c\7M\2\2\u019c\u01a1\5`\61\2\u019d\u019e\7\r"+
		"\2\2\u019e\u01a0\5`\61\2\u019f\u019d\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2"+
		"\2\2\u01a4\u019b\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01aa\7\4\2\2\u01a7\u01a9\5\30\r\2\u01a8\u01a7\3\2\2\2\u01a9\u01ac\3"+
		"\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ad\u01ae\7\5\2\2\u01ae\27\3\2\2\2\u01af\u01b1\5\36\20"+
		"\2\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01c7\5(\25\2\u01b6"+
		"\u01b8\5\36\20\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3"+
		"\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc"+
		"\u01c7\5,\27\2\u01bd\u01bf\5\36\20\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3"+
		"\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2"+
		"\u01c0\3\2\2\2\u01c3\u01c7\5\64\33\2\u01c4\u01c7\5:\36\2\u01c5\u01c7\5"+
		"<\37\2\u01c6\u01b2\3\2\2\2\u01c6\u01b9\3\2\2\2\u01c6\u01c0\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7\31\3\2\2\2\u01c8\u01c9\7\17\2"+
		"\2\u01c9\u01cb\7`\2\2\u01ca\u01cc\5> \2\u01cb\u01ca\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01ce\7\13\2\2\u01ce\u01d0\5\u00be"+
		"`\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d2\7\4\2\2\u01d2\u01d4\5 \21\2\u01d3\u01d5\7\r\2\2\u01d4\u01d3\3\2"+
		"\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\7\5\2\2\u01d7"+
		"\u01ed\3\2\2\2\u01d8\u01d9\7\17\2\2\u01d9\u01db\7`\2\2\u01da\u01dc\5>"+
		" \2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd"+
		"\u01de\7\13\2\2\u01de\u01e0\5\u00be`\2\u01df\u01dd\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\7\4\2\2\u01e2\u01e3\5 \21\2\u01e3"+
		"\u01e7\7\20\2\2\u01e4\u01e6\5&\24\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3"+
		"\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01ea\u01eb\7\5\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01c8\3\2"+
		"\2\2\u01ec\u01d8\3\2\2\2\u01ed\33\3\2\2\2\u01ee\u01ef\7\21\2\2\u01ef\u01f0"+
		"\7`\2\2\u01f0\35\3\2\2\2\u01f1\u01f2\7\22\2\2\u01f2\u01f5\7`\2\2\u01f3"+
		"\u01f4\7\65\2\2\u01f4\u01f6\7`\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2"+
		"\2\2\u01f6\37\3\2\2\2\u01f7\u01fc\5\"\22\2\u01f8\u01f9\7\r\2\2\u01f9\u01fb"+
		"\5\"\22\2\u01fa\u01f8\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2"+
		"\u01fc\u01fd\3\2\2\2\u01fd!\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0202\7"+
		"`\2\2\u0200\u0201\7\23\2\2\u0201\u0203\7\24\2\2\u0202\u0200\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0211\3\2\2\2\u0204\u0205\7`\2\2\u0205\u0206\7\23"+
		"\2\2\u0206\u020b\5$\23\2\u0207\u0208\7\r\2\2\u0208\u020a\5$\23\2\u0209"+
		"\u0207\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\u020e\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u020f\7\24\2\2\u020f"+
		"\u0211\3\2\2\2\u0210\u01ff\3\2\2\2\u0210\u0204\3\2\2\2\u0211#\3\2\2\2"+
		"\u0212\u0213\7`\2\2\u0213\u0215\7\b\2\2\u0214\u0212\3\2\2\2\u0214\u0215"+
		"\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\5`\61\2\u0217%\3\2\2\2\u0218"+
		"\u021a\5\36\20\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3"+
		"\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u021b\3\2\2\2\u021e"+
		"\u0228\5,\27\2\u021f\u0221\5\36\20\2\u0220\u021f\3\2\2\2\u0221\u0224\3"+
		"\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224"+
		"\u0222\3\2\2\2\u0225\u0228\5\64\33\2\u0226\u0228\5:\36\2\u0227\u021b\3"+
		"\2\2\2\u0227\u0222\3\2\2\2\u0227\u0226\3\2\2\2\u0228\'\3\2\2\2\u0229\u022c"+
		"\5*\26\2\u022a\u022b\7\b\2\2\u022b\u022d\5`\61\2\u022c\u022a\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\5\62\32\2\u022f\u0230\5"+
		"\60\31\2\u0230\u0241\3\2\2\2\u0231\u0234\5*\26\2\u0232\u0233\7\b\2\2\u0233"+
		"\u0235\5`\61\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2"+
		"\2\2\u0236\u0238\5\60\31\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u023a\3\2\2\2\u0239\u023b\5\62\32\2\u023a\u0239\3\2\2\2\u023a\u023b\3"+
		"\2\2\2\u023b\u0241\3\2\2\2\u023c\u023d\5*\26\2\u023d\u023e\7M\2\2\u023e"+
		"\u023f\5`\61\2\u023f\u0241\3\2\2\2\u0240\u0229\3\2\2\2\u0240\u0231\3\2"+
		"\2\2\u0240\u023c\3\2\2\2\u0241)\3\2\2\2\u0242\u0243\7\62\2\2\u0243\u0246"+
		"\7`\2\2\u0244\u0245\7\13\2\2\u0245\u0247\5\u00be`\2\u0246\u0244\3\2\2"+
		"\2\u0246\u0247\3\2\2\2\u0247+\3\2\2\2\u0248\u024b\5.\30\2\u0249\u024a"+
		"\7\b\2\2\u024a\u024c\5`\61\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u024e\3\2\2\2\u024d\u024f\5\60\31\2\u024e\u024d\3\2\2\2\u024e\u024f\3"+
		"\2\2\2\u024f\u0255\3\2\2\2\u0250\u0251\5.\30\2\u0251\u0252\7M\2\2\u0252"+
		"\u0253\5`\61\2\u0253\u0255\3\2\2\2\u0254\u0248\3\2\2\2\u0254\u0250\3\2"+
		"\2\2\u0255-\3\2\2\2\u0256\u0257\7\63\2\2\u0257\u025a\7`\2\2\u0258\u0259"+
		"\7\13\2\2\u0259\u025b\5\u00be`\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2"+
		"\2\u025b/\3\2\2\2\u025c\u025d\7\25\2\2\u025d\u025e\7\23\2\2\u025e\u025f"+
		"\7\24\2\2\u025f\u0261\7\4\2\2\u0260\u0262\5F$\2\u0261\u0260\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\3\2"+
		"\2\2\u0265\u0266\7\5\2\2\u0266\61\3\2\2\2\u0267\u0268\7\26\2\2\u0268\u0269"+
		"\7\23\2\2\u0269\u026a\7`\2\2\u026a\u026b\7\24\2\2\u026b\u026d\7\4\2\2"+
		"\u026c\u026e\5F$\2\u026d\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u026d"+
		"\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\7\5\2\2\u0272"+
		"\63\3\2\2\2\u0273\u0274\5\66\34\2\u0274\u0278\7\4\2\2\u0275\u0277\5F$"+
		"\2\u0276\u0275\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279"+
		"\3\2\2\2\u0279\u027b\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u027c\7\5\2\2\u027c"+
		"\65\3\2\2\2\u027d\u027e\7\27\2\2\u027e\u0280\7`\2\2\u027f\u0281\5\u00b8"+
		"]\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282"+
		"\u0283\7\23\2\2\u0283\u0286\7\24\2\2\u0284\u0285\7\13\2\2\u0285\u0287"+
		"\5\u00be`\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u029c\3\2\2"+
		"\2\u0288\u0289\7\27\2\2\u0289\u028b\7`\2\2\u028a\u028c\5\u00b8]\2\u028b"+
		"\u028a\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\7\23"+
		"\2\2\u028e\u0293\58\35\2\u028f\u0290\7\r\2\2\u0290\u0292\58\35\2\u0291"+
		"\u028f\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2"+
		"\2\2\u0294\u0296\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u0299\7\24\2\2\u0297"+
		"\u0298\7\13\2\2\u0298\u029a\5\u00be`\2\u0299\u0297\3\2\2\2\u0299\u029a"+
		"\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u027d\3\2\2\2\u029b\u0288\3\2\2\2\u029c"+
		"\67\3\2\2\2\u029d\u029e\7`\2\2\u029e\u029f\7\13\2\2\u029f\u02a2\5\u00be"+
		"`\2\u02a0\u02a1\7\b\2\2\u02a1\u02a3\5`\61\2\u02a2\u02a0\3\2\2\2\u02a2"+
		"\u02a3\3\2\2\2\u02a39\3\2\2\2\u02a4\u02a5\7\30\2\2\u02a5\u02a9\7\4\2\2"+
		"\u02a6\u02a8\5F$\2\u02a7\u02a6\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7"+
		"\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac"+
		"\u02ad\7\5\2\2\u02ad;\3\2\2\2\u02ae\u02af\7\31\2\2\u02af\u02b3\7\4\2\2"+
		"\u02b0\u02b2\5F$\2\u02b1\u02b0\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1"+
		"\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6"+
		"\u02b7\7\5\2\2\u02b7=\3\2\2\2\u02b8\u02b9\7\23\2\2\u02b9\u02c6\7\24\2"+
		"\2\u02ba\u02bb\7\23\2\2\u02bb\u02c0\5@!\2\u02bc\u02bd\7\r\2\2\u02bd\u02bf"+
		"\5@!\2\u02be\u02bc\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u02c3\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c4\7\24"+
		"\2\2\u02c4\u02c6\3\2\2\2\u02c5\u02b8\3\2\2\2\u02c5\u02ba\3\2\2\2\u02c6"+
		"?\3\2\2\2\u02c7\u02c9\t\2\2\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2"+
		"\u02c9\u02ca\3\2\2\2\u02ca\u02cb\58\35\2\u02cbA\3\2\2\2\u02cc\u02cd\7"+
		"\32\2\2\u02cd\u02ce\7\23\2\2\u02ce\u02d0\7\24\2\2\u02cf\u02d1\5D#\2\u02d0"+
		"\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d6\7\4"+
		"\2\2\u02d3\u02d5\5F$\2\u02d4\u02d3\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6\u02d4"+
		"\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d9\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d9"+
		"\u02f2\7\5\2\2\u02da\u02db\7\32\2\2\u02db\u02dc\7\23\2\2\u02dc\u02e1\5"+
		"8\35\2\u02dd\u02de\7\r\2\2\u02de\u02e0\58\35\2\u02df\u02dd\3\2\2\2\u02e0"+
		"\u02e3\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e4\3\2"+
		"\2\2\u02e3\u02e1\3\2\2\2\u02e4\u02e6\7\24\2\2\u02e5\u02e7\5D#\2\u02e6"+
		"\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ec\7\4"+
		"\2\2\u02e9\u02eb\5F$\2\u02ea\u02e9\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec\u02ea"+
		"\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ef"+
		"\u02f0\7\5\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02cc\3\2\2\2\u02f1\u02da\3\2"+
		"\2\2\u02f2C\3\2\2\2\u02f3\u02f4\7\13\2\2\u02f4\u02f5\7\33\2\2\u02f5\u02f6"+
		"\7\23\2\2\u02f6\u0305\7\24\2\2\u02f7\u02f8\7\13\2\2\u02f8\u02f9\7\33\2"+
		"\2\u02f9\u02fa\7\23\2\2\u02fa\u02ff\5$\23\2\u02fb\u02fc\7\r\2\2\u02fc"+
		"\u02fe\5$\23\2\u02fd\u02fb\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff\u02fd\3\2"+
		"\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\3\2\2\2\u0301\u02ff\3\2\2\2\u0302"+
		"\u0303\7\24\2\2\u0303\u0305\3\2\2\2\u0304\u02f3\3\2\2\2\u0304\u02f7\3"+
		"\2\2\2\u0305E\3\2\2\2\u0306\u0313\5(\25\2\u0307\u0313\5,\27\2\u0308\u0313"+
		"\5H%\2\u0309\u0313\5L\'\2\u030a\u0313\5X-\2\u030b\u0313\5Z.\2\u030c\u0313"+
		"\5\\/\2\u030d\u030e\5`\61\2\u030e\u030f\5^\60\2\u030f\u0310\5`\61\2\u0310"+
		"\u0313\3\2\2\2\u0311\u0313\5`\61\2\u0312\u0306\3\2\2\2\u0312\u0307\3\2"+
		"\2\2\u0312\u0308\3\2\2\2\u0312\u0309\3\2\2\2\u0312\u030a\3\2\2\2\u0312"+
		"\u030b\3\2\2\2\u0312\u030c\3\2\2\2\u0312\u030d\3\2\2\2\u0312\u0311\3\2"+
		"\2\2\u0313G\3\2\2\2\u0314\u0315\7\34\2\2\u0315\u0316\7\23\2\2\u0316\u0317"+
		"\5`\61\2\u0317\u0318\7\24\2\2\u0318\u031a\5F$\2\u0319\u031b\5J&\2\u031a"+
		"\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u032c\3\2\2\2\u031c\u031d\7\34"+
		"\2\2\u031d\u031e\7\23\2\2\u031e\u031f\5`\61\2\u031f\u0320\7\24\2\2\u0320"+
		"\u0324\7\4\2\2\u0321\u0323\5F$\2\u0322\u0321\3\2\2\2\u0323\u0326\3\2\2"+
		"\2\u0324\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0327\3\2\2\2\u0326\u0324"+
		"\3\2\2\2\u0327\u0329\7\5\2\2\u0328\u032a\5J&\2\u0329\u0328\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u032a\u032c\3\2\2\2\u032b\u0314\3\2\2\2\u032b\u031c\3\2"+
		"\2\2\u032cI\3\2\2\2\u032d\u032e\7\35\2\2\u032e\u0339\5F$\2\u032f\u0330"+
		"\7\35\2\2\u0330\u0334\7\4\2\2\u0331\u0333\5F$\2\u0332\u0331\3\2\2\2\u0333"+
		"\u0336\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337\3\2"+
		"\2\2\u0336\u0334\3\2\2\2\u0337\u0339\7\5\2\2\u0338\u032d\3\2\2\2\u0338"+
		"\u032f\3\2\2\2\u0339K\3\2\2\2\u033a\u033b\7\36\2\2\u033b\u033f\7\23\2"+
		"\2\u033c\u033d\5.\30\2\u033d\u033e\7\b\2\2\u033e\u0340\3\2\2\2\u033f\u033c"+
		"\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0342\5`\61\2\u0342"+
		"\u0343\7\24\2\2\u0343\u0347\7\4\2\2\u0344\u0346\5N(\2\u0345\u0344\3\2"+
		"\2\2\u0346\u0349\3\2\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348"+
		"\u034a\3\2\2\2\u0349\u0347\3\2\2\2\u034a\u034b\7\5\2\2\u034bM\3\2\2\2"+
		"\u034c\u0351\5P)\2\u034d\u034e\7\r\2\2\u034e\u0350\5P)\2\u034f\u034d\3"+
		"\2\2\2\u0350\u0353\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352"+
		"\u0354\3\2\2\2\u0353\u0351\3\2\2\2\u0354\u0355\7\37\2\2\u0355\u0356\5"+
		"F$\2\u0356\u0377\3\2\2\2\u0357\u035c\5P)\2\u0358\u0359\7\r\2\2\u0359\u035b"+
		"\5P)\2\u035a\u0358\3\2\2\2\u035b\u035e\3\2\2\2\u035c\u035a\3\2\2\2\u035c"+
		"\u035d\3\2\2\2\u035d\u035f\3\2\2\2\u035e\u035c\3\2\2\2\u035f\u0360\7\37"+
		"\2\2\u0360\u0364\7\4\2\2\u0361\u0363\5F$\2\u0362\u0361\3\2\2\2\u0363\u0366"+
		"\3\2\2\2\u0364\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0367\3\2\2\2\u0366"+
		"\u0364\3\2\2\2\u0367\u0368\7\5\2\2\u0368\u0377\3\2\2\2\u0369\u036a\7\35"+
		"\2\2\u036a\u036b\7\37\2\2\u036b\u0377\5F$\2\u036c\u036d\7\35\2\2\u036d"+
		"\u036e\7\37\2\2\u036e\u0372\7\4\2\2\u036f\u0371\5F$\2\u0370\u036f\3\2"+
		"\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373"+
		"\u0375\3\2\2\2\u0374\u0372\3\2\2\2\u0375\u0377\7\5\2\2\u0376\u034c\3\2"+
		"\2\2\u0376\u0357\3\2\2\2\u0376\u0369\3\2\2\2\u0376\u036c\3\2\2\2\u0377"+
		"O\3\2\2\2\u0378\u037d\5`\61\2\u0379\u037d\5R*\2\u037a\u037d\5T+\2\u037b"+
		"\u037d\5V,\2\u037c\u0378\3\2\2\2\u037c\u0379\3\2\2\2\u037c\u037a\3\2\2"+
		"\2\u037c\u037b\3\2\2\2\u037dQ\3\2\2\2\u037e\u037f\5\u00aaV\2\u037f\u0380"+
		"\5`\61\2\u0380S\3\2\2\2\u0381\u0382\5\u00a8U\2\u0382\u0383\5\u00be`\2"+
		"\u0383U\3\2\2\2\u0384\u0385\5\u00acW\2\u0385\u0386\7`\2\2\u0386\u0387"+
		"\7\13\2\2\u0387\u0388\5\u00be`\2\u0388W\3\2\2\2\u0389\u038a\7 \2\2\u038a"+
		"\u038b\7\23\2\2\u038b\u038c\7`\2\2\u038c\u038d\7P\2\2\u038d\u038e\5`\61"+
		"\2\u038e\u038f\7\24\2\2\u038f\u0390\5F$\2\u0390\u03a1\3\2\2\2\u0391\u0392"+
		"\7 \2\2\u0392\u0393\7\23\2\2\u0393\u0394\7`\2\2\u0394\u0395\7P\2\2\u0395"+
		"\u0396\5`\61\2\u0396\u0397\7\24\2\2\u0397\u039b\7\4\2\2\u0398\u039a\5"+
		"F$\2\u0399\u0398\3\2\2\2\u039a\u039d\3\2\2\2\u039b\u0399\3\2\2\2\u039b"+
		"\u039c\3\2\2\2\u039c\u039e\3\2\2\2\u039d\u039b\3\2\2\2\u039e\u039f\7\5"+
		"\2\2\u039f\u03a1\3\2\2\2\u03a0\u0389\3\2\2\2\u03a0\u0391\3\2\2\2\u03a1"+
		"Y\3\2\2\2\u03a2\u03a3\7!\2\2\u03a3\u03a4\7\23\2\2\u03a4\u03a5\5`\61\2"+
		"\u03a5\u03a6\7\24\2\2\u03a6\u03a7\5F$\2\u03a7\u03b6\3\2\2\2\u03a8\u03a9"+
		"\7!\2\2\u03a9\u03aa\7\23\2\2\u03aa\u03ab\5`\61\2\u03ab\u03ac\7\24\2\2"+
		"\u03ac\u03b0\7\4\2\2\u03ad\u03af\5F$\2\u03ae\u03ad\3\2\2\2\u03af\u03b2"+
		"\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b3\3\2\2\2\u03b2"+
		"\u03b0\3\2\2\2\u03b3\u03b4\7\5\2\2\u03b4\u03b6\3\2\2\2\u03b5\u03a2\3\2"+
		"\2\2\u03b5\u03a8\3\2\2\2\u03b6[\3\2\2\2\u03b7\u03b8\7\"\2\2\u03b8\u03b9"+
		"\5F$\2\u03b9\u03ba\7!\2\2\u03ba\u03bb\7\23\2\2\u03bb\u03bc\5`\61\2\u03bc"+
		"\u03bd\7\24\2\2\u03bd\u03cd\3\2\2\2\u03be\u03bf\7\"\2\2\u03bf\u03c3\7"+
		"\4\2\2\u03c0\u03c2\5F$\2\u03c1\u03c0\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3"+
		"\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c6\3\2\2\2\u03c5\u03c3\3\2"+
		"\2\2\u03c6\u03c7\7\5\2\2\u03c7\u03c8\7!\2\2\u03c8\u03c9\7\23\2\2\u03c9"+
		"\u03ca\5`\61\2\u03ca\u03cb\7\24\2\2\u03cb\u03cd\3\2\2\2\u03cc\u03b7\3"+
		"\2\2\2\u03cc\u03be\3\2\2\2\u03cd]\3\2\2\2\u03ce\u03cf\t\3\2\2\u03cf_\3"+
		"\2\2\2\u03d0\u03d1\5b\62\2\u03d1a\3\2\2\2\u03d2\u03d7\5d\63\2\u03d3\u03d4"+
		"\7W\2\2\u03d4\u03d6\5d\63\2\u03d5\u03d3\3\2\2\2\u03d6\u03d9\3\2\2\2\u03d7"+
		"\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8c\3\2\2\2\u03d9\u03d7\3\2\2\2"+
		"\u03da\u03df\5f\64\2\u03db\u03dc\7V\2\2\u03dc\u03de\5f\64\2\u03dd\u03db"+
		"\3\2\2\2\u03de\u03e1\3\2\2\2\u03df\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0"+
		"e\3\2\2\2\u03e1\u03df\3\2\2\2\u03e2\u03e8\5h\65\2\u03e3\u03e4\5\u00ae"+
		"X\2\u03e4\u03e5\5h\65\2\u03e5\u03e7\3\2\2\2\u03e6\u03e3\3\2\2\2\u03e7"+
		"\u03ea\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9g\3\2\2\2"+
		"\u03ea\u03e8\3\2\2\2\u03eb\u03ef\5j\66\2\u03ec\u03ed\5\u00a6T\2\u03ed"+
		"\u03ee\5j\66\2\u03ee\u03f0\3\2\2\2\u03ef\u03ec\3\2\2\2\u03ef\u03f0\3\2"+
		"\2\2\u03f0i\3\2\2\2\u03f1\u03ff\5l\67\2\u03f2\u03f3\5\u00aaV\2\u03f3\u03f4"+
		"\5l\67\2\u03f4\u03fe\3\2\2\2\u03f5\u03f6\5\u00a8U\2\u03f6\u03f7\5\u00be"+
		"`\2\u03f7\u03fe\3\2\2\2\u03f8\u03f9\5\u00acW\2\u03f9\u03fa\7`\2\2\u03fa"+
		"\u03fb\7\13\2\2\u03fb\u03fc\5\u00be`\2\u03fc\u03fe\3\2\2\2\u03fd\u03f2"+
		"\3\2\2\2\u03fd\u03f5\3\2\2\2\u03fd\u03f8\3\2\2\2\u03fe\u0401\3\2\2\2\u03ff"+
		"\u03fd\3\2\2\2\u03ff\u0400\3\2\2\2\u0400k\3\2\2\2\u0401\u03ff\3\2\2\2"+
		"\u0402\u0407\5n8\2\u0403\u0404\7:\2\2\u0404\u0406\5n8\2\u0405\u0403\3"+
		"\2\2\2\u0406\u0409\3\2\2\2\u0407\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u0408"+
		"m\3\2\2\2\u0409\u0407\3\2\2\2\u040a\u0410\5p9\2\u040b\u040c\5\u00a4S\2"+
		"\u040c\u040d\5p9\2\u040d\u040f\3\2\2\2\u040e\u040b\3\2\2\2\u040f\u0412"+
		"\3\2\2\2\u0410\u040e\3\2\2\2\u0410\u0411\3\2\2\2\u0411o\3\2\2\2\u0412"+
		"\u0410\3\2\2\2\u0413\u0419\5r:\2\u0414\u0415\5\u00a2R\2\u0415\u0416\5"+
		"r:\2\u0416\u0418\3\2\2\2\u0417\u0414\3\2\2\2\u0418\u041b\3\2\2\2\u0419"+
		"\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041aq\3\2\2\2\u041b\u0419\3\2\2\2"+
		"\u041c\u0422\5t;\2\u041d\u041e\5\u00a0Q\2\u041e\u041f\5t;\2\u041f\u0421"+
		"\3\2\2\2\u0420\u041d\3\2\2\2\u0421\u0424\3\2\2\2\u0422\u0420\3\2\2\2\u0422"+
		"\u0423\3\2\2\2\u0423s\3\2\2\2\u0424\u0422\3\2\2\2\u0425\u042b\5v<\2\u0426"+
		"\u0427\5\u009eP\2\u0427\u0428\5v<\2\u0428\u042a\3\2\2\2\u0429\u0426\3"+
		"\2\2\2\u042a\u042d\3\2\2\2\u042b\u0429\3\2\2\2\u042b\u042c\3\2\2\2\u042c"+
		"u\3\2\2\2\u042d\u042b\3\2\2\2\u042e\u0430\5\u009cO\2\u042f\u042e\3\2\2"+
		"\2\u0430\u0433\3\2\2\2\u0431\u042f\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0434"+
		"\3\2\2\2\u0433\u0431\3\2\2\2\u0434\u0435\5x=\2\u0435w\3\2\2\2\u0436\u043e"+
		"\5\u0082B\2\u0437\u0439\5\u0082B\2\u0438\u043a\5z>\2\u0439\u0438\3\2\2"+
		"\2\u043a\u043b\3\2\2\2\u043b\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043e"+
		"\3\2\2\2\u043d\u0436\3\2\2\2\u043d\u0437\3\2\2\2\u043ey\3\2\2\2\u043f"+
		"\u0445\5\u009aN\2\u0440\u0445\5\u00bc_\2\u0441\u0445\5|?\2\u0442\u0445"+
		"\5~@\2\u0443\u0445\5\u0080A\2\u0444\u043f\3\2\2\2\u0444\u0440\3\2\2\2"+
		"\u0444\u0441\3\2\2\2\u0444\u0442\3\2\2\2\u0444\u0443\3\2\2\2\u0445{\3"+
		"\2\2\2\u0446\u0447\7\23\2\2\u0447\u0452\7\24\2\2\u0448\u0449\7\23\2\2"+
		"\u0449\u044e\5$\23\2\u044a\u044b\7\r\2\2\u044b\u044d\5$\23\2\u044c\u044a"+
		"\3\2\2\2\u044d\u0450\3\2\2\2\u044e\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f"+
		"\u0452\3\2\2\2\u0450\u044e\3\2\2\2\u0451\u0446\3\2\2\2\u0451\u0448\3\2"+
		"\2\2\u0452}\3\2\2\2\u0453\u0454\7.\2\2\u0454\u0459\5`\61\2\u0455\u0456"+
		"\7\r\2\2\u0456\u0458\5`\61\2\u0457\u0455\3\2\2\2\u0458\u045b\3\2\2\2\u0459"+
		"\u0457\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045c\3\2\2\2\u045b\u0459\3\2"+
		"\2\2\u045c\u045d\7/\2\2\u045d\177\3\2\2\2\u045e\u045f\5\u0098M\2\u045f"+
		"\u0460\7`\2\2\u0460\u0081\3\2\2\2\u0461\u0462\7\23\2\2\u0462\u0463\5`"+
		"\61\2\u0463\u0464\7\24\2\2\u0464\u046c\3\2\2\2\u0465\u046c\7`\2\2\u0466"+
		"\u046c\5\u0086D\2\u0467\u046c\5\u0084C\2\u0468\u046c\5\u00b0Y\2\u0469"+
		"\u046c\5\u00b4[\2\u046a\u046c\5\u0096L\2\u046b\u0461\3\2\2\2\u046b\u0465"+
		"\3\2\2\2\u046b\u0466\3\2\2\2\u046b\u0467\3\2\2\2\u046b\u0468\3\2\2\2\u046b"+
		"\u0469\3\2\2\2\u046b\u046a\3\2\2\2\u046c\u0083\3\2\2\2\u046d\u046e\7\33"+
		"\2\2\u046e\u0085\3\2\2\2\u046f\u047c\5\u0088E\2\u0470\u047c\5\u008aF\2"+
		"\u0471\u047c\5\u008cG\2\u0472\u047c\5\u008eH\2\u0473\u047c\5\u0090I\2"+
		"\u0474\u047c\5\u0094K\2\u0475\u047c\7Y\2\2\u0476\u047c\7Z\2\2\u0477\u047c"+
		"\7^\2\2\u0478\u047c\7\\\2\2\u0479\u047c\7[\2\2\u047a\u047c\7_\2\2\u047b"+
		"\u046f\3\2\2\2\u047b\u0470\3\2\2\2\u047b\u0471\3\2\2\2\u047b\u0472\3\2"+
		"\2\2\u047b\u0473\3\2\2\2\u047b\u0474\3\2\2\2\u047b\u0475\3\2\2\2\u047b"+
		"\u0476\3\2\2\2\u047b\u0477\3\2\2\2\u047b\u0478\3\2\2\2\u047b\u0479\3\2"+
		"\2\2\u047b\u047a\3\2\2\2\u047c\u0087\3\2\2\2\u047d\u047e\7.\2\2\u047e"+
		"\u048b\7/\2\2\u047f\u0480\7.\2\2\u0480\u0485\5`\61\2\u0481\u0482\7\r\2"+
		"\2\u0482\u0484\5`\61\2\u0483\u0481\3\2\2\2\u0484\u0487\3\2\2\2\u0485\u0483"+
		"\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0488\3\2\2\2\u0487\u0485\3\2\2\2\u0488"+
		"\u0489\7/\2\2\u0489\u048b\3\2\2\2\u048a\u047d\3\2\2\2\u048a\u047f\3\2"+
		"\2\2\u048b\u0089\3\2\2\2\u048c\u048d\7\4\2\2\u048d\u049f\7\5\2\2\u048e"+
		"\u048f\7\4\2\2\u048f\u0490\5`\61\2\u0490\u0491\7\60\2\2\u0491\u0499\5"+
		"`\61\2\u0492\u0493\7\r\2\2\u0493\u0494\5`\61\2\u0494\u0495\7\60\2\2\u0495"+
		"\u0496\5`\61\2\u0496\u0498\3\2\2\2\u0497\u0492\3\2\2\2\u0498\u049b\3\2"+
		"\2\2\u0499\u0497\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049c\3\2\2\2\u049b"+
		"\u0499\3\2\2\2\u049c\u049d\7\5\2\2\u049d\u049f\3\2\2\2\u049e\u048c\3\2"+
		"\2\2\u049e\u048e\3\2\2\2\u049f\u008b\3\2\2\2\u04a0\u04a1\7\4\2\2\u04a1"+
		"\u04a6\5`\61\2\u04a2\u04a3\7\r\2\2\u04a3\u04a5\5`\61\2\u04a4\u04a2\3\2"+
		"\2\2\u04a5\u04a8\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7"+
		"\u04a9\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a9\u04aa\7\5\2\2\u04aa\u008d\3\2"+
		"\2\2\u04ab\u04ac\7\23\2\2\u04ac\u04c0\7\24\2\2\u04ad\u04ae\7\23\2\2\u04ae"+
		"\u04af\5`\61\2\u04af\u04b0\7\r\2\2\u04b0\u04b1\7\24\2\2\u04b1\u04c0\3"+
		"\2\2\2\u04b2\u04b3\7\23\2\2\u04b3\u04b6\5`\61\2\u04b4\u04b5\7\r\2\2\u04b5"+
		"\u04b7\5`\61\2\u04b6\u04b4\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b6\3\2"+
		"\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04bb\3\2\2\2\u04ba\u04bc\7\r\2\2\u04bb"+
		"\u04ba\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\7\24"+
		"\2\2\u04be\u04c0\3\2\2\2\u04bf\u04ab\3\2\2\2\u04bf\u04ad\3\2\2\2\u04bf"+
		"\u04b2\3\2\2\2\u04c0\u008f\3\2\2\2\u04c1\u04c5\7\4\2\2\u04c2\u04c4\5F"+
		"$\2\u04c3\u04c2\3\2\2\2\u04c4\u04c7\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c5"+
		"\u04c6\3\2\2\2\u04c6\u04c8\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c8\u04dc\7\5"+
		"\2\2\u04c9\u04ca\7\4\2\2\u04ca\u04cf\5\u0092J\2\u04cb\u04cc\7\r\2\2\u04cc"+
		"\u04ce\5\u0092J\2\u04cd\u04cb\3\2\2\2\u04ce\u04d1\3\2\2\2\u04cf\u04cd"+
		"\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d2\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d2"+
		"\u04d6\7\37\2\2\u04d3\u04d5\5F$\2\u04d4\u04d3\3\2\2\2\u04d5\u04d8\3\2"+
		"\2\2\u04d6\u04d4\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d9\3\2\2\2\u04d8"+
		"\u04d6\3\2\2\2\u04d9\u04da\7\5\2\2\u04da\u04dc\3\2\2\2\u04db\u04c1\3\2"+
		"\2\2\u04db\u04c9\3\2\2\2\u04dc\u0091\3\2\2\2\u04dd\u04e0\7`\2\2\u04de"+
		"\u04df\7\13\2\2\u04df\u04e1\5\u00be`\2\u04e0\u04de\3\2\2\2\u04e0\u04e1"+
		"\3\2\2\2\u04e1\u0093\3\2\2\2\u04e2\u04e5\7\16\2\2\u04e3\u04e4\7\13\2\2"+
		"\u04e4\u04e6\5\u00be`\2\u04e5\u04e3\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6"+
		"\u04f0\3\2\2\2\u04e7\u04e8\7M\2\2\u04e8\u04ed\5`\61\2\u04e9\u04ea\7\r"+
		"\2\2\u04ea\u04ec\5`\61\2\u04eb\u04e9\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed"+
		"\u04eb\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04f1\3\2\2\2\u04ef\u04ed\3\2"+
		"\2\2\u04f0\u04e7\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2"+
		"\u04f6\7\4\2\2\u04f3\u04f5\5\30\r\2\u04f4\u04f3\3\2\2\2\u04f5\u04f8\3"+
		"\2\2\2\u04f6\u04f4\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f9\3\2\2\2\u04f8"+
		"\u04f6\3\2\2\2\u04f9\u04fa\7\5\2\2\u04fa\u0095\3\2\2\2\u04fb\u04fd\7\61"+
		"\2\2\u04fc\u04fe\5`\61\2\u04fd\u04fc\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe"+
		"\u0097\3\2\2\2\u04ff\u0500\t\4\2\2\u0500\u0099\3\2\2\2\u0501\u0502\t\5"+
		"\2\2\u0502\u009b\3\2\2\2\u0503\u0504\t\6\2\2\u0504\u009d\3\2\2\2\u0505"+
		"\u0506\t\7\2\2\u0506\u009f\3\2\2\2\u0507\u0508\t\b\2\2\u0508\u00a1\3\2"+
		"\2\2\u0509\u050a\t\t\2\2\u050a\u00a3\3\2\2\2\u050b\u050c\t\n\2\2\u050c"+
		"\u00a5\3\2\2\2\u050d\u050e\t\13\2\2\u050e\u00a7\3\2\2\2\u050f\u0510\t"+
		"\f\2\2\u0510\u00a9\3\2\2\2\u0511\u0512\t\r\2\2\u0512\u00ab\3\2\2\2\u0513"+
		"\u0514\t\16\2\2\u0514\u00ad\3\2\2\2\u0515\u0516\t\17\2\2\u0516\u00af\3"+
		"\2\2\2\u0517\u0518\7\34\2\2\u0518\u0519\7\23\2\2\u0519\u051a\5`\61\2\u051a"+
		"\u051b\7\24\2\2\u051b\u051c\5`\61\2\u051c\u051d\5\u00b2Z\2\u051d\u052e"+
		"\3\2\2\2\u051e\u051f\7\34\2\2\u051f\u0520\7\23\2\2\u0520\u0521\5`\61\2"+
		"\u0521\u0522\7\24\2\2\u0522\u0526\7\4\2\2\u0523\u0525\5F$\2\u0524\u0523"+
		"\3\2\2\2\u0525\u0528\3\2\2\2\u0526\u0524\3\2\2\2\u0526\u0527\3\2\2\2\u0527"+
		"\u0529\3\2\2\2\u0528\u0526\3\2\2\2\u0529\u052a\5`\61\2\u052a\u052b\7\5"+
		"\2\2\u052b\u052c\5\u00b2Z\2\u052c\u052e\3\2\2\2\u052d\u0517\3\2\2\2\u052d"+
		"\u051e\3\2\2\2\u052e\u00b1\3\2\2\2\u052f\u0530\7\35\2\2\u0530\u053d\5"+
		"`\61\2\u0531\u0532\7\35\2\2\u0532\u0536\7\4\2\2\u0533\u0535\5F$\2\u0534"+
		"\u0533\3\2\2\2\u0535\u0538\3\2\2\2\u0536\u0534\3\2\2\2\u0536\u0537\3\2"+
		"\2\2\u0537\u0539\3\2\2\2\u0538\u0536\3\2\2\2\u0539\u053a\5`\61\2\u053a"+
		"\u053b\7\5\2\2\u053b\u053d\3\2\2\2\u053c\u052f\3\2\2\2\u053c\u0531\3\2"+
		"\2\2\u053d\u00b3\3\2\2\2\u053e\u053f\7\36\2\2\u053f\u0543\7\23\2\2\u0540"+
		"\u0541\5.\30\2\u0541\u0542\7\b\2\2\u0542\u0544\3\2\2\2\u0543\u0540\3\2"+
		"\2\2\u0543\u0544\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0546\5`\61\2\u0546"+
		"\u0547\7\24\2\2\u0547\u054b\7\4\2\2\u0548\u054a\5\u00b6\\\2\u0549\u0548"+
		"\3\2\2\2\u054a\u054d\3\2\2\2\u054b\u0549\3\2\2\2\u054b\u054c\3\2\2\2\u054c"+
		"\u054e\3\2\2\2\u054d\u054b\3\2\2\2\u054e\u054f\7\5\2\2\u054f\u00b5\3\2"+
		"\2\2\u0550\u0555\5P)\2\u0551\u0552\7\r\2\2\u0552\u0554\5P)\2\u0553\u0551"+
		"\3\2\2\2\u0554\u0557\3\2\2\2\u0555\u0553\3\2\2\2\u0555\u0556\3\2\2\2\u0556"+
		"\u0558\3\2\2\2\u0557\u0555\3\2\2\2\u0558\u0559\7\37\2\2\u0559\u055a\5"+
		"`\61\2\u055a\u057e\3\2\2\2\u055b\u0560\5P)\2\u055c\u055d\7\r\2\2\u055d"+
		"\u055f\5P)\2\u055e\u055c\3\2\2\2\u055f\u0562\3\2\2\2\u0560\u055e\3\2\2"+
		"\2\u0560\u0561\3\2\2\2\u0561\u0563\3\2\2\2\u0562\u0560\3\2\2\2\u0563\u0564"+
		"\7\37\2\2\u0564\u0568\7\4\2\2\u0565\u0567\5F$\2\u0566\u0565\3\2\2\2\u0567"+
		"\u056a\3\2\2\2\u0568\u0566\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056b\3\2"+
		"\2\2\u056a\u0568\3\2\2\2\u056b\u056c\5`\61\2\u056c\u056d\7\5\2\2\u056d"+
		"\u057e\3\2\2\2\u056e\u056f\7\35\2\2\u056f\u0570\7\37\2\2\u0570\u057e\5"+
		"`\61\2\u0571\u0572\7\35\2\2\u0572\u0573\7\37\2\2\u0573\u0577\7\4\2\2\u0574"+
		"\u0576\5F$\2\u0575\u0574\3\2\2\2\u0576\u0579\3\2\2\2\u0577\u0575\3\2\2"+
		"\2\u0577\u0578\3\2\2\2\u0578\u057a\3\2\2\2\u0579\u0577\3\2\2\2\u057a\u057b"+
		"\5`\61\2\u057b\u057c\7\5\2\2\u057c\u057e\3\2\2\2\u057d\u0550\3\2\2\2\u057d"+
		"\u055b\3\2\2\2\u057d\u056e\3\2\2\2\u057d\u0571\3\2\2\2\u057e\u00b7\3\2"+
		"\2\2\u057f\u0580\7I\2\2\u0580\u0585\5\u00ba^\2\u0581\u0582\7\r\2\2\u0582"+
		"\u0584\5\u00ba^\2\u0583\u0581\3\2\2\2\u0584\u0587\3\2\2\2\u0585\u0583"+
		"\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u0588\3\2\2\2\u0587\u0585\3\2\2\2\u0588"+
		"\u0589\7K\2\2\u0589\u00b9\3\2\2\2\u058a\u058d\7`\2\2\u058b\u058c\7\13"+
		"\2\2\u058c\u058e\5\u00be`\2\u058d\u058b\3\2\2\2\u058d\u058e\3\2\2\2\u058e"+
		"\u00bb\3\2\2\2\u058f\u0590\7I\2\2\u0590\u0595\5\u00be`\2\u0591\u0592\7"+
		"\r\2\2\u0592\u0594\5\u00be`\2\u0593\u0591\3\2\2\2\u0594\u0597\3\2\2\2"+
		"\u0595\u0593\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u0598\3\2\2\2\u0597\u0595"+
		"\3\2\2\2\u0598\u0599\7K\2\2\u0599\u00bd\3\2\2\2\u059a\u059b\5\u00c0a\2"+
		"\u059b\u00bf\3\2\2\2\u059c\u05a1\5\u00c2b\2\u059d\u059e\7F\2\2\u059e\u05a0"+
		"\5\u00c2b\2\u059f\u059d\3\2\2\2\u05a0\u05a3\3\2\2\2\u05a1\u059f\3\2\2"+
		"\2\u05a1\u05a2\3\2\2\2\u05a2\u00c1\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a4\u05a9"+
		"\5\u00c4c\2\u05a5\u05a6\7?\2\2\u05a6\u05a8\5\u00c4c\2\u05a7\u05a5\3\2"+
		"\2\2\u05a8\u05ab\3\2\2\2\u05a9\u05a7\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa"+
		"\u00c3\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ac\u05af\7`\2\2\u05ad\u05ae\7\65"+
		"\2\2\u05ae\u05b0\7`\2\2\u05af\u05ad\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0"+
		"\u05b2\3\2\2\2\u05b1\u05b3\5\u00bc_\2\u05b2\u05b1\3\2\2\2\u05b2\u05b3"+
		"\3\2\2\2\u05b3\u00c5\3\2\2\2\u00a9\u00c9\u00d2\u00d8\u00e6\u00ed\u00f4"+
		"\u00fb\u0102\u0109\u0110\u0117\u011b\u0123\u012d\u0131\u0137\u013b\u0140"+
		"\u0147\u014e\u0152\u0157\u015a\u015e\u0166\u0169\u016f\u0173\u0178\u017f"+
		"\u0186\u018d\u0193\u0199\u01a1\u01a4\u01aa\u01b2\u01b9\u01c0\u01c6\u01cb"+
		"\u01cf\u01d4\u01db\u01df\u01e7\u01ec\u01f5\u01fc\u0202\u020b\u0210\u0214"+
		"\u021b\u0222\u0227\u022c\u0234\u0237\u023a\u0240\u0246\u024b\u024e\u0254"+
		"\u025a\u0263\u026f\u0278\u0280\u0286\u028b\u0293\u0299\u029b\u02a2\u02a9"+
		"\u02b3\u02c0\u02c5\u02c8\u02d0\u02d6\u02e1\u02e6\u02ec\u02f1\u02ff\u0304"+
		"\u0312\u031a\u0324\u0329\u032b\u0334\u0338\u033f\u0347\u0351\u035c\u0364"+
		"\u0372\u0376\u037c\u039b\u03a0\u03b0\u03b5\u03c3\u03cc\u03d7\u03df\u03e8"+
		"\u03ef\u03fd\u03ff\u0407\u0410\u0419\u0422\u042b\u0431\u043b\u043d\u0444"+
		"\u044e\u0451\u0459\u046b\u047b\u0485\u048a\u0499\u049e\u04a6\u04b8\u04bb"+
		"\u04bf\u04c5\u04cf\u04d6\u04db\u04e0\u04e5\u04ed\u04f0\u04f6\u04fd\u0526"+
		"\u052d\u0536\u053c\u0543\u054b\u0555\u0560\u0568\u0577\u057d\u0585\u058d"+
		"\u0595\u05a1\u05a9\u05af\u05b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}