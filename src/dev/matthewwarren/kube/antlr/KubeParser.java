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
		RULE_primaryType = 97, RULE_functionType = 98, RULE_functionParameterTypes = 99;
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
			"generic", "type", "unionType", "sumType", "primaryType", "functionType", 
			"functionParameterTypes"
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
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(200);
				module();
				}
				}
				setState(205);
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
			setState(206);
			match(T__0);
			setState(207);
			match(Identifier);
			setState(208);
			match(T__1);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(209);
				importExpr();
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << Var) | (1L << Val))) != 0)) {
				{
				{
				setState(215);
				moduleContent();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
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
			setState(223);
			match(T__3);
			setState(224);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitModuleContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContentContext moduleContent() throws RecognitionException {
		ModuleContentContext _localctx = new ModuleContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_moduleContent);
		int _la;
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				initializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				typeAlias();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				alias();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(229);
					annotation1();
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				interface0();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(236);
					annotation1();
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				class0();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(243);
					annotation1();
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				object0();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(250);
					annotation1();
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
				enum0();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(257);
					annotation1();
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(263);
				annotation0();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(264);
					annotation1();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				function();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(271);
					annotation1();
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(277);
				variable();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(278);
					annotation1();
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(284);
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
			setState(287);
			match(T__4);
			setState(288);
			match(Identifier);
			setState(289);
			match(T__5);
			setState(290);
			match(Identifier);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NonNoneAccess) {
				{
				setState(291);
				match(NonNoneAccess);
				setState(292);
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
			setState(295);
			match(T__6);
			setState(296);
			match(Identifier);
			setState(297);
			match(T__5);
			setState(298);
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
			setState(300);
			match(T__7);
			setState(301);
			match(Identifier);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(302);
				genericDeclaration();
				}
			}

			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(305);
				match(T__8);
				setState(306);
				type();
				}
			}

			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(309);
				match(T__1);
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << Var) | (1L << Val))) != 0)) {
					{
					{
					setState(310);
					interfaceElement();
					}
					}
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(316);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitInterfaceElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceElementContext interfaceElement() throws RecognitionException {
		InterfaceElementContext _localctx = new InterfaceElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_interfaceElement);
		int _la;
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(319);
					annotation1();
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(325);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(326);
					annotation1();
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(332);
				valueDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(333);
					annotation1();
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(339);
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
			setState(342);
			match(T__9);
			setState(343);
			match(Identifier);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LessThan) {
				{
				setState(344);
				genericDeclaration();
				}
			}

			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(347);
				primaryConstructor();
				}
			}

			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(350);
				match(T__8);
				setState(351);
				type();
				}
			}

			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==By) {
				{
				setState(354);
				match(By);
				setState(355);
				expression();
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(356);
					match(T__10);
					setState(357);
					expression();
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(365);
				match(T__1);
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << Var) | (1L << Val))) != 0)) {
					{
					{
					setState(366);
					classElement();
					}
					}
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(372);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitClassElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassElementContext classElement() throws RecognitionException {
		ClassElementContext _localctx = new ClassElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classElement);
		int _la;
		try {
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(375);
					annotation1();
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(381);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(382);
					annotation1();
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(388);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(389);
					annotation1();
					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(395);
				function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(396);
					annotation1();
					}
					}
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(402);
				constructor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(403);
				initializer();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(404);
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
			setState(407);
			match(T__11);
			setState(408);
			match(Identifier);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(409);
				match(T__8);
				setState(410);
				type();
				}
			}

			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==By) {
				{
				setState(413);
				match(By);
				setState(414);
				expression();
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(415);
					match(T__10);
					setState(416);
					expression();
					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(424);
			match(T__1);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << Var) | (1L << Val))) != 0)) {
				{
				{
				setState(425);
				objectElement();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitObjectElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectElementContext objectElement() throws RecognitionException {
		ObjectElementContext _localctx = new ObjectElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_objectElement);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(433);
					annotation1();
					}
					}
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(439);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(440);
					annotation1();
					}
					}
					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(446);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(447);
					annotation1();
					}
					}
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(453);
				function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
				initializer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(455);
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
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(T__12);
				setState(459);
				match(Identifier);
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(460);
					primaryConstructor();
					}
				}

				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(463);
					match(T__8);
					setState(464);
					type();
					}
				}

				setState(467);
				match(T__1);
				setState(468);
				enumList();
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(469);
					match(T__10);
					}
				}

				setState(472);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(T__12);
				setState(475);
				match(Identifier);
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(476);
					primaryConstructor();
					}
				}

				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(479);
					match(T__8);
					setState(480);
					type();
					}
				}

				setState(483);
				match(T__1);
				setState(484);
				enumList();
				setState(485);
				match(T__13);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << Val))) != 0)) {
					{
					{
					setState(486);
					enumElement();
					}
					}
					setState(491);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(492);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitAnnotation0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Annotation0Context annotation0() throws RecognitionException {
		Annotation0Context _localctx = new Annotation0Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_annotation0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(T__14);
			setState(497);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitAnnotation1(this);
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
			setState(499);
			match(T__15);
			setState(500);
			match(Identifier);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NonNoneAccess) {
				{
				setState(501);
				match(NonNoneAccess);
				setState(502);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitEnumList(this);
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
			setState(505);
			enumValue();
			setState(510);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(506);
					match(T__10);
					setState(507);
					enumValue();
					}
					} 
				}
				setState(512);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enumValue);
		int _la;
		try {
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				match(Identifier);
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(514);
					match(T__16);
					setState(515);
					match(T__17);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				match(Identifier);
				setState(519);
				match(T__16);
				setState(520);
				parameterExpression();
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(521);
					match(T__10);
					setState(522);
					parameterExpression();
					}
					}
					setState(527);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(528);
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
		enterRule(_localctx, 34, RULE_parameterExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(532);
				match(Identifier);
				setState(533);
				match(T__5);
				}
				break;
			}
			setState(536);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitEnumElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumElementContext enumElement() throws RecognitionException {
		EnumElementContext _localctx = new EnumElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enumElement);
		int _la;
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(538);
					annotation1();
					}
					}
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(544);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(545);
					annotation1();
					}
					}
					setState(550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(551);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(552);
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
		enterRule(_localctx, 38, RULE_variable);
		int _la;
		try {
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				variableDeclaration();
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(556);
					match(T__5);
					setState(557);
					expression();
					}
				}

				setState(560);
				setter();
				setState(561);
				getter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				variableDeclaration();
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(564);
					match(T__5);
					setState(565);
					expression();
					}
				}

				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(568);
					getter();
					}
				}

				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(571);
					setter();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				variableDeclaration();
				setState(575);
				match(By);
				setState(576);
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
		enterRule(_localctx, 40, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(Var);
			setState(581);
			match(Identifier);
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(582);
				match(T__8);
				setState(583);
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
		enterRule(_localctx, 42, RULE_value);
		int _la;
		try {
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				valueDeclaration();
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(587);
					match(T__5);
					setState(588);
					expression();
					}
				}

				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(591);
					getter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				valueDeclaration();
				setState(595);
				match(By);
				setState(596);
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
		enterRule(_localctx, 44, RULE_valueDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(Val);
			setState(601);
			match(Identifier);
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(602);
				match(T__8);
				setState(603);
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
		enterRule(_localctx, 46, RULE_getter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(T__18);
			setState(607);
			match(T__16);
			setState(608);
			match(T__17);
			setState(609);
			match(T__1);
			setState(611); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(610);
				statement();
				}
				}
				setState(613); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0) );
			setState(615);
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
		enterRule(_localctx, 48, RULE_setter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(T__19);
			setState(618);
			match(T__16);
			setState(619);
			match(Identifier);
			setState(620);
			match(T__17);
			setState(621);
			match(T__1);
			setState(623); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(622);
				statement();
				}
				}
				setState(625); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0) );
			setState(627);
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
		enterRule(_localctx, 50, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			functionDeclaration();
			setState(630);
			match(T__1);
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
				{
				{
				setState(631);
				statement();
				}
				}
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionDeclaration);
		int _la;
		try {
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				match(T__20);
				setState(640);
				match(Identifier);
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LessThan) {
					{
					setState(641);
					genericDeclaration();
					}
				}

				setState(644);
				match(T__16);
				setState(645);
				match(T__17);
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(646);
					match(T__8);
					setState(647);
					type();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				match(T__20);
				setState(651);
				match(Identifier);
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LessThan) {
					{
					setState(652);
					genericDeclaration();
					}
				}

				setState(655);
				match(T__16);
				setState(656);
				parameter();
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(657);
					match(T__10);
					setState(658);
					parameter();
					}
					}
					setState(663);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(664);
				match(T__17);
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(665);
					match(T__8);
					setState(666);
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
		enterRule(_localctx, 54, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(Identifier);
			setState(672);
			match(T__8);
			setState(673);
			type();
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(674);
				match(T__5);
				setState(675);
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
		enterRule(_localctx, 56, RULE_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(T__21);
			setState(679);
			match(T__1);
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
				{
				{
				setState(680);
				statement();
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(686);
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
		enterRule(_localctx, 58, RULE_finalizer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(T__22);
			setState(689);
			match(T__1);
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
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
		enterRule(_localctx, 60, RULE_primaryConstructor);
		int _la;
		try {
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				match(T__16);
				setState(699);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				match(T__16);
				setState(701);
				constructorParameter();
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(702);
					match(T__10);
					setState(703);
					constructorParameter();
					}
					}
					setState(708);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(709);
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
		enterRule(_localctx, 62, RULE_constructorParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Var || _la==Val) {
				{
				setState(713);
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

			setState(716);
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
		enterRule(_localctx, 64, RULE_constructor);
		int _la;
		try {
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				match(T__23);
				setState(719);
				match(T__16);
				setState(720);
				match(T__17);
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(721);
					constructorCall();
					}
				}

				setState(724);
				match(T__1);
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(725);
					statement();
					}
					}
					setState(730);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(731);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				match(T__23);
				setState(733);
				match(T__16);
				setState(734);
				parameter();
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(735);
					match(T__10);
					setState(736);
					parameter();
					}
					}
					setState(741);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(742);
				match(T__17);
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(743);
					constructorCall();
					}
				}

				setState(746);
				match(T__1);
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(747);
					statement();
					}
					}
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(753);
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
		enterRule(_localctx, 66, RULE_constructorCall);
		int _la;
		try {
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				match(T__8);
				setState(758);
				match(T__24);
				setState(759);
				match(T__16);
				setState(760);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(761);
				match(T__8);
				setState(762);
				match(T__24);
				setState(763);
				match(T__16);
				setState(764);
				parameterExpression();
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(765);
					match(T__10);
					setState(766);
					parameterExpression();
					}
					}
					setState(771);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(772);
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
		enterRule(_localctx, 68, RULE_statement);
		try {
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(778);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(779);
				whenStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(780);
				forLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(781);
				whileLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(782);
				doWhileLoop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(783);
				expression();
				setState(784);
				assignmentOperator();
				setState(785);
				expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(787);
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
		enterRule(_localctx, 70, RULE_ifStatement);
		int _la;
		try {
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				match(T__25);
				setState(791);
				match(T__16);
				setState(792);
				expression();
				setState(793);
				match(T__17);
				setState(794);
				statement();
				setState(796);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(795);
					elseBlock();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				match(T__25);
				setState(799);
				match(T__16);
				setState(800);
				expression();
				setState(801);
				match(T__17);
				setState(802);
				match(T__1);
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(803);
					statement();
					}
					}
					setState(808);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(809);
				match(T__2);
				setState(811);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(810);
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
		enterRule(_localctx, 72, RULE_elseBlock);
		int _la;
		try {
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(815);
				match(T__26);
				setState(816);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				match(T__26);
				setState(818);
				match(T__1);
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(819);
					statement();
					}
					}
					setState(824);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(825);
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
		enterRule(_localctx, 74, RULE_whenStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(T__27);
			setState(829);
			match(T__16);
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Val) {
				{
				setState(830);
				valueDeclaration();
				setState(831);
				match(T__5);
				}
			}

			setState(835);
			expression();
			setState(836);
			match(T__17);
			setState(837);
			match(T__1);
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__43) | (1L << T__46) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Is - 76)) | (1L << (NotIs - 76)) | (1L << (In - 76)) | (1L << (NotIn - 76)) | (1L << (Has - 76)) | (1L << (NotHas - 76)) | (1L << (IntegerLiteral - 76)) | (1L << (FloatingPointLiteral - 76)) | (1L << (BooleanLiteral - 76)) | (1L << (CharacterLiteral - 76)) | (1L << (StringLiteral - 76)) | (1L << (NoneLiteral - 76)) | (1L << (Identifier - 76)))) != 0)) {
				{
				{
				setState(838);
				whenStatementEntry();
				}
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(844);
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
		enterRule(_localctx, 76, RULE_whenStatementEntry);
		int _la;
		try {
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				whenCondition();
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(847);
					match(T__10);
					setState(848);
					whenCondition();
					}
					}
					setState(853);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(854);
				match(T__28);
				setState(855);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(857);
				whenCondition();
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(858);
					match(T__10);
					setState(859);
					whenCondition();
					}
					}
					setState(864);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(865);
				match(T__28);
				setState(866);
				match(T__1);
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(867);
					statement();
					}
					}
					setState(872);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(873);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(875);
				match(T__26);
				setState(876);
				match(T__28);
				setState(877);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(878);
				match(T__26);
				setState(879);
				match(T__28);
				setState(880);
				match(T__1);
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(881);
					statement();
					}
					}
					setState(886);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(887);
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
		enterRule(_localctx, 78, RULE_whenCondition);
		try {
			setState(894);
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
				setState(890);
				expression();
				}
				break;
			case In:
			case NotIn:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
				rangeTest();
				}
				break;
			case Is:
			case NotIs:
				enterOuterAlt(_localctx, 3);
				{
				setState(892);
				typeTest();
				}
				break;
			case Has:
			case NotHas:
				enterOuterAlt(_localctx, 4);
				{
				setState(893);
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
		enterRule(_localctx, 80, RULE_rangeTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			inOperator();
			setState(897);
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
		enterRule(_localctx, 82, RULE_typeTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			isOperator();
			setState(900);
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
		enterRule(_localctx, 84, RULE_memberTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			hasOperator();
			setState(903);
			match(Identifier);
			setState(904);
			match(T__8);
			setState(905);
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
		enterRule(_localctx, 86, RULE_forLoop);
		int _la;
		try {
			setState(930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				match(T__29);
				setState(908);
				match(T__16);
				setState(909);
				match(Identifier);
				setState(910);
				match(In);
				setState(911);
				expression();
				setState(912);
				match(T__17);
				setState(913);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				match(T__29);
				setState(916);
				match(T__16);
				setState(917);
				match(Identifier);
				setState(918);
				match(In);
				setState(919);
				expression();
				setState(920);
				match(T__17);
				setState(921);
				match(T__1);
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(922);
					statement();
					}
					}
					setState(927);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(928);
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
		enterRule(_localctx, 88, RULE_whileLoop);
		int _la;
		try {
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				match(T__30);
				setState(933);
				match(T__16);
				setState(934);
				expression();
				setState(935);
				match(T__17);
				setState(936);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(938);
				match(T__30);
				setState(939);
				match(T__16);
				setState(940);
				expression();
				setState(941);
				match(T__17);
				setState(942);
				match(T__1);
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(943);
					statement();
					}
					}
					setState(948);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(949);
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
		enterRule(_localctx, 90, RULE_doWhileLoop);
		int _la;
		try {
			setState(974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(953);
				match(T__31);
				setState(954);
				statement();
				setState(955);
				match(T__30);
				setState(956);
				match(T__16);
				setState(957);
				expression();
				setState(958);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(960);
				match(T__31);
				setState(961);
				match(T__1);
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(962);
					statement();
					}
					}
					setState(967);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(968);
				match(T__2);
				setState(969);
				match(T__30);
				setState(970);
				match(T__16);
				setState(971);
				expression();
				setState(972);
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
		enterRule(_localctx, 92, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
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
		enterRule(_localctx, 96, RULE_logicalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			logicalAndExpression();
			setState(985);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(981);
					match(LogicalOr);
					setState(982);
					logicalAndExpression();
					}
					} 
				}
				setState(987);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
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
			setState(988);
			equalityExpression();
			setState(993);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(989);
					match(LogicalAnd);
					setState(990);
					equalityExpression();
					}
					} 
				}
				setState(995);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitEqualityExpression(this);
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
			setState(996);
			comparisonExpression();
			setState(1002);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(997);
					equalityOperator();
					setState(998);
					comparisonExpression();
					}
					} 
				}
				setState(1004);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_comparisonExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			infixOperation();
			setState(1009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1006);
				relationalOperator();
				setState(1007);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitInfixOperation(this);
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
			setState(1011);
			elvisExpression();
			setState(1025);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1023);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case In:
					case NotIn:
						{
						setState(1012);
						inOperator();
						setState(1013);
						elvisExpression();
						}
						break;
					case Is:
					case NotIs:
						{
						setState(1015);
						isOperator();
						setState(1016);
						type();
						}
						break;
					case Has:
					case NotHas:
						{
						setState(1018);
						hasOperator();
						setState(1019);
						match(Identifier);
						setState(1020);
						match(T__8);
						setState(1021);
						type();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1027);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitElvisExpression(this);
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
			setState(1028);
			rangeExpression();
			setState(1033);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1029);
					match(Elvis);
					setState(1030);
					rangeExpression();
					}
					} 
				}
				setState(1035);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitRangeExpression(this);
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
			setState(1036);
			bitwiseExpression();
			setState(1042);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1037);
					rangeOperator();
					setState(1038);
					bitwiseExpression();
					}
					} 
				}
				setState(1044);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitBitwiseExpression(this);
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
			setState(1045);
			additiveExpression();
			setState(1051);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1046);
					bitwiseOperator();
					setState(1047);
					additiveExpression();
					}
					} 
				}
				setState(1053);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitAdditiveExpression(this);
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
			setState(1054);
			multiplicativeExpression();
			setState(1060);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1055);
					additiveOperator();
					setState(1056);
					multiplicativeExpression();
					}
					} 
				}
				setState(1062);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
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
			setState(1063);
			prefixUnaryExpression();
			setState(1069);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1064);
					multiplicativeOperator();
					setState(1065);
					prefixUnaryExpression();
					}
					} 
				}
				setState(1071);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitPrefixUnaryExpression(this);
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
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0)) {
				{
				{
				setState(1072);
				preUnaryOperator();
				}
				}
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1078);
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
		enterRule(_localctx, 118, RULE_postfixUnaryExpression);
		try {
			int _alt;
			setState(1087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1080);
				primaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1081);
				primaryExpression();
				setState(1083); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1082);
						postfixUnarySuffix();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1085); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
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
		enterRule(_localctx, 120, RULE_postfixUnarySuffix);
		try {
			setState(1094);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Increment:
			case Decrement:
				enterOuterAlt(_localctx, 1);
				{
				setState(1089);
				postUnaryOperator();
				}
				break;
			case LessThan:
				enterOuterAlt(_localctx, 2);
				{
				setState(1090);
				generic();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(1091);
				callSuffix();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 4);
				{
				setState(1092);
				indexingSuffix();
				}
				break;
			case NoneSafeAccess:
			case NonNoneAccess:
				enterOuterAlt(_localctx, 5);
				{
				setState(1093);
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
		enterRule(_localctx, 122, RULE_callSuffix);
		try {
			int _alt;
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1096);
				match(T__16);
				setState(1097);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1098);
				match(T__16);
				setState(1099);
				parameterExpression();
				setState(1104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1100);
						match(T__10);
						setState(1101);
						parameterExpression();
						}
						} 
					}
					setState(1106);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitIndexingSuffix(this);
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
			setState(1109);
			match(T__43);
			setState(1110);
			expression();
			setState(1115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(1111);
				match(T__10);
				setState(1112);
				expression();
				}
				}
				setState(1117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1118);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitNavigationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigationSuffixContext navigationSuffix() throws RecognitionException {
		NavigationSuffixContext _localctx = new NavigationSuffixContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_navigationSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			memberAccess();
			setState(1121);
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
		enterRule(_localctx, 128, RULE_primaryExpression);
		try {
			setState(1133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1123);
				match(T__16);
				setState(1124);
				expression();
				setState(1125);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1127);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1128);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1129);
				thisExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1130);
				ifExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1131);
				whenExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1132);
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
		enterRule(_localctx, 130, RULE_thisExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_literal);
		try {
			setState(1149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1137);
				array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
				map();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1139);
				set();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1140);
				tuple();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1141);
				lambdaLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1142);
				objectLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1143);
				match(IntegerLiteral);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1144);
				match(FloatingPointLiteral);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1145);
				match(StringLiteral);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1146);
				match(CharacterLiteral);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1147);
				match(BooleanLiteral);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1148);
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
		enterRule(_localctx, 134, RULE_array);
		int _la;
		try {
			setState(1164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1151);
				match(T__43);
				setState(1152);
				match(T__44);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1153);
				match(T__43);
				setState(1154);
				expression();
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(1155);
					match(T__10);
					setState(1156);
					expression();
					}
					}
					setState(1161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1162);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_map);
		int _la;
		try {
			setState(1184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1166);
				match(T__1);
				setState(1167);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1168);
				match(T__1);
				setState(1169);
				expression();
				setState(1170);
				match(T__45);
				setState(1171);
				expression();
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(1172);
					match(T__10);
					setState(1173);
					expression();
					setState(1174);
					match(T__45);
					setState(1175);
					expression();
					}
					}
					setState(1181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1182);
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
		enterRule(_localctx, 138, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			match(T__1);
			setState(1187);
			expression();
			setState(1192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(1188);
				match(T__10);
				setState(1189);
				expression();
				}
				}
				setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1195);
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
		enterRule(_localctx, 140, RULE_tuple);
		int _la;
		try {
			int _alt;
			setState(1217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1197);
				match(T__16);
				setState(1198);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199);
				match(T__16);
				setState(1200);
				expression();
				setState(1201);
				match(T__10);
				setState(1202);
				match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1204);
				match(T__16);
				setState(1205);
				expression();
				setState(1208); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1206);
						match(T__10);
						setState(1207);
						expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1210); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(1212);
					match(T__10);
					}
				}

				setState(1215);
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
		enterRule(_localctx, 142, RULE_lambdaLiteral);
		int _la;
		try {
			setState(1245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1219);
				match(T__1);
				setState(1223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(1220);
					statement();
					}
					}
					setState(1225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1226);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1227);
				match(T__1);
				setState(1228);
				lambdaParameter();
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(1229);
					match(T__10);
					setState(1230);
					lambdaParameter();
					}
					}
					setState(1235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1236);
				match(T__28);
				setState(1240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__43) | (1L << T__46) | (1L << Var) | (1L << Val) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IntegerLiteral - 87)) | (1L << (FloatingPointLiteral - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (CharacterLiteral - 87)) | (1L << (StringLiteral - 87)) | (1L << (NoneLiteral - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					{
					setState(1237);
					statement();
					}
					}
					setState(1242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1243);
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
		enterRule(_localctx, 144, RULE_lambdaParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			match(Identifier);
			setState(1250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(1248);
				match(T__8);
				setState(1249);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitObjectLiteral(this);
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
			setState(1252);
			match(T__11);
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(1253);
				match(T__8);
				setState(1254);
				type();
				}
			}

			setState(1266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==By) {
				{
				setState(1257);
				match(By);
				setState(1258);
				expression();
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(1259);
					match(T__10);
					setState(1260);
					expression();
					}
					}
					setState(1265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(1268);
			match(T__1);
			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << Var) | (1L << Val))) != 0)) {
				{
				{
				setState(1269);
				objectElement();
				}
				}
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1275);
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
		enterRule(_localctx, 148, RULE_returnExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			match(T__46);
			setState(1279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1278);
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
		enterRule(_localctx, 150, RULE_memberAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
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
		enterRule(_localctx, 152, RULE_postUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
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
		enterRule(_localctx, 154, RULE_preUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
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
		enterRule(_localctx, 156, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
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
		enterRule(_localctx, 158, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
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
		enterRule(_localctx, 160, RULE_bitwiseOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
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
		enterRule(_localctx, 162, RULE_rangeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
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
		enterRule(_localctx, 164, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
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
		enterRule(_localctx, 166, RULE_isOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
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
		enterRule(_localctx, 168, RULE_inOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
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
		enterRule(_localctx, 170, RULE_hasOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
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
		enterRule(_localctx, 172, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
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
		enterRule(_localctx, 174, RULE_ifExpression);
		try {
			int _alt;
			setState(1327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1305);
				match(T__25);
				setState(1306);
				match(T__16);
				setState(1307);
				expression();
				setState(1308);
				match(T__17);
				setState(1309);
				expression();
				setState(1310);
				elseExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1312);
				match(T__25);
				setState(1313);
				match(T__16);
				setState(1314);
				expression();
				setState(1315);
				match(T__17);
				setState(1316);
				match(T__1);
				setState(1320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1317);
						statement();
						}
						} 
					}
					setState(1322);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				}
				setState(1323);
				expression();
				setState(1324);
				match(T__2);
				setState(1325);
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
		enterRule(_localctx, 176, RULE_elseExpression);
		try {
			int _alt;
			setState(1342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1329);
				match(T__26);
				setState(1330);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1331);
				match(T__26);
				setState(1332);
				match(T__1);
				setState(1336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1333);
						statement();
						}
						} 
					}
					setState(1338);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				}
				setState(1339);
				expression();
				setState(1340);
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
		enterRule(_localctx, 178, RULE_whenExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			match(T__27);
			setState(1345);
			match(T__16);
			setState(1349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Val) {
				{
				setState(1346);
				valueDeclaration();
				setState(1347);
				match(T__5);
				}
			}

			setState(1351);
			expression();
			setState(1352);
			match(T__17);
			setState(1353);
			match(T__1);
			setState(1357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__43) | (1L << T__46) | (1L << Increment) | (1L << Decrement) | (1L << LogicalNot) | (1L << BitwiseNot) | (1L << Plus) | (1L << Minus))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Is - 76)) | (1L << (NotIs - 76)) | (1L << (In - 76)) | (1L << (NotIn - 76)) | (1L << (Has - 76)) | (1L << (NotHas - 76)) | (1L << (IntegerLiteral - 76)) | (1L << (FloatingPointLiteral - 76)) | (1L << (BooleanLiteral - 76)) | (1L << (CharacterLiteral - 76)) | (1L << (StringLiteral - 76)) | (1L << (NoneLiteral - 76)) | (1L << (Identifier - 76)))) != 0)) {
				{
				{
				setState(1354);
				whenExpressionEntry();
				}
				}
				setState(1359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1360);
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
		enterRule(_localctx, 180, RULE_whenExpressionEntry);
		int _la;
		try {
			int _alt;
			setState(1407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1362);
				whenCondition();
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(1363);
					match(T__10);
					setState(1364);
					whenCondition();
					}
					}
					setState(1369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1370);
				match(T__28);
				setState(1371);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1373);
				whenCondition();
				setState(1378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(1374);
					match(T__10);
					setState(1375);
					whenCondition();
					}
					}
					setState(1380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1381);
				match(T__28);
				setState(1382);
				match(T__1);
				setState(1386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1383);
						statement();
						}
						} 
					}
					setState(1388);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				}
				setState(1389);
				expression();
				setState(1390);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1392);
				match(T__26);
				setState(1393);
				match(T__28);
				setState(1394);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1395);
				match(T__26);
				setState(1396);
				match(T__28);
				setState(1397);
				match(T__1);
				setState(1401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1398);
						statement();
						}
						} 
					}
					setState(1403);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
				}
				setState(1404);
				expression();
				setState(1405);
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
		enterRule(_localctx, 182, RULE_genericDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			match(LessThan);
			setState(1410);
			genericTypeDeclaration();
			setState(1415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(1411);
				match(T__10);
				setState(1412);
				genericTypeDeclaration();
				}
				}
				setState(1417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1418);
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
		enterRule(_localctx, 184, RULE_genericTypeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			match(Identifier);
			setState(1423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(1421);
				match(T__8);
				setState(1422);
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
		enterRule(_localctx, 186, RULE_generic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			match(LessThan);
			setState(1426);
			type();
			setState(1431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(1427);
				match(T__10);
				setState(1428);
				type();
				}
				}
				setState(1433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1434);
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
		enterRule(_localctx, 188, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
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
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitUnionType(this);
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
			setState(1438);
			sumType();
			setState(1443);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1439);
					match(BitwiseOr);
					setState(1440);
					sumType();
					}
					} 
				}
				setState(1445);
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
		public SumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KubeVisitor ) return ((KubeVisitor<? extends T>)visitor).visitSumType(this);
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
			setState(1446);
			primaryType();
			setState(1451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1447);
					match(Plus);
					setState(1448);
					primaryType();
					}
					} 
				}
				setState(1453);
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
		enterRule(_localctx, 194, RULE_primaryType);
		try {
			setState(1467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1454);
				match(Identifier);
				setState(1457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1455);
					match(NonNoneAccess);
					setState(1456);
					match(Identifier);
					}
					break;
				}
				setState(1460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1459);
					generic();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1462);
				functionType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1463);
				match(T__16);
				setState(1464);
				type();
				setState(1465);
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
		enterRule(_localctx, 196, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			functionParameterTypes();
			setState(1470);
			match(T__28);
			setState(1471);
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
		enterRule(_localctx, 198, RULE_functionParameterTypes);
		int _la;
		try {
			setState(1486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1473);
				match(T__16);
				setState(1474);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1475);
				match(T__16);
				setState(1476);
				type();
				setState(1481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(1477);
					match(T__10);
					setState(1478);
					type();
					}
					}
					setState(1483);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1484);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3b\u05d3\4\2\t\2\4"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\3\2\7\2\u00cc\n\2\f\2\16\2\u00cf\13"+
		"\2\3\3\3\3\3\3\3\3\7\3\u00d5\n\3\f\3\16\3\u00d8\13\3\3\3\7\3\u00db\n\3"+
		"\f\3\16\3\u00de\13\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u00e9\n\5"+
		"\f\5\16\5\u00ec\13\5\3\5\3\5\7\5\u00f0\n\5\f\5\16\5\u00f3\13\5\3\5\3\5"+
		"\7\5\u00f7\n\5\f\5\16\5\u00fa\13\5\3\5\3\5\7\5\u00fe\n\5\f\5\16\5\u0101"+
		"\13\5\3\5\3\5\7\5\u0105\n\5\f\5\16\5\u0108\13\5\3\5\3\5\7\5\u010c\n\5"+
		"\f\5\16\5\u010f\13\5\3\5\3\5\7\5\u0113\n\5\f\5\16\5\u0116\13\5\3\5\3\5"+
		"\7\5\u011a\n\5\f\5\16\5\u011d\13\5\3\5\5\5\u0120\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u0128\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u0132\n\b\3\b"+
		"\3\b\5\b\u0136\n\b\3\b\3\b\7\b\u013a\n\b\f\b\16\b\u013d\13\b\3\b\5\b\u0140"+
		"\n\b\3\t\7\t\u0143\n\t\f\t\16\t\u0146\13\t\3\t\3\t\7\t\u014a\n\t\f\t\16"+
		"\t\u014d\13\t\3\t\3\t\7\t\u0151\n\t\f\t\16\t\u0154\13\t\3\t\5\t\u0157"+
		"\n\t\3\n\3\n\3\n\5\n\u015c\n\n\3\n\5\n\u015f\n\n\3\n\3\n\5\n\u0163\n\n"+
		"\3\n\3\n\3\n\3\n\7\n\u0169\n\n\f\n\16\n\u016c\13\n\5\n\u016e\n\n\3\n\3"+
		"\n\7\n\u0172\n\n\f\n\16\n\u0175\13\n\3\n\5\n\u0178\n\n\3\13\7\13\u017b"+
		"\n\13\f\13\16\13\u017e\13\13\3\13\3\13\7\13\u0182\n\13\f\13\16\13\u0185"+
		"\13\13\3\13\3\13\7\13\u0189\n\13\f\13\16\13\u018c\13\13\3\13\3\13\7\13"+
		"\u0190\n\13\f\13\16\13\u0193\13\13\3\13\3\13\3\13\5\13\u0198\n\13\3\f"+
		"\3\f\3\f\3\f\5\f\u019e\n\f\3\f\3\f\3\f\3\f\7\f\u01a4\n\f\f\f\16\f\u01a7"+
		"\13\f\5\f\u01a9\n\f\3\f\3\f\7\f\u01ad\n\f\f\f\16\f\u01b0\13\f\3\f\3\f"+
		"\3\r\7\r\u01b5\n\r\f\r\16\r\u01b8\13\r\3\r\3\r\7\r\u01bc\n\r\f\r\16\r"+
		"\u01bf\13\r\3\r\3\r\7\r\u01c3\n\r\f\r\16\r\u01c6\13\r\3\r\3\r\3\r\5\r"+
		"\u01cb\n\r\3\16\3\16\3\16\5\16\u01d0\n\16\3\16\3\16\5\16\u01d4\n\16\3"+
		"\16\3\16\3\16\5\16\u01d9\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u01e0\n\16"+
		"\3\16\3\16\5\16\u01e4\n\16\3\16\3\16\3\16\3\16\7\16\u01ea\n\16\f\16\16"+
		"\16\u01ed\13\16\3\16\3\16\5\16\u01f1\n\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\5\20\u01fa\n\20\3\21\3\21\3\21\7\21\u01ff\n\21\f\21\16\21\u0202"+
		"\13\21\3\22\3\22\3\22\5\22\u0207\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u020e"+
		"\n\22\f\22\16\22\u0211\13\22\3\22\3\22\5\22\u0215\n\22\3\23\3\23\5\23"+
		"\u0219\n\23\3\23\3\23\3\24\7\24\u021e\n\24\f\24\16\24\u0221\13\24\3\24"+
		"\3\24\7\24\u0225\n\24\f\24\16\24\u0228\13\24\3\24\3\24\5\24\u022c\n\24"+
		"\3\25\3\25\3\25\5\25\u0231\n\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0239"+
		"\n\25\3\25\5\25\u023c\n\25\3\25\5\25\u023f\n\25\3\25\3\25\3\25\3\25\5"+
		"\25\u0245\n\25\3\26\3\26\3\26\3\26\5\26\u024b\n\26\3\27\3\27\3\27\5\27"+
		"\u0250\n\27\3\27\5\27\u0253\n\27\3\27\3\27\3\27\3\27\5\27\u0259\n\27\3"+
		"\30\3\30\3\30\3\30\5\30\u025f\n\30\3\31\3\31\3\31\3\31\3\31\6\31\u0266"+
		"\n\31\r\31\16\31\u0267\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\6\32\u0272"+
		"\n\32\r\32\16\32\u0273\3\32\3\32\3\33\3\33\3\33\7\33\u027b\n\33\f\33\16"+
		"\33\u027e\13\33\3\33\3\33\3\34\3\34\3\34\5\34\u0285\n\34\3\34\3\34\3\34"+
		"\3\34\5\34\u028b\n\34\3\34\3\34\3\34\5\34\u0290\n\34\3\34\3\34\3\34\3"+
		"\34\7\34\u0296\n\34\f\34\16\34\u0299\13\34\3\34\3\34\3\34\5\34\u029e\n"+
		"\34\5\34\u02a0\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u02a7\n\35\3\36\3\36"+
		"\3\36\7\36\u02ac\n\36\f\36\16\36\u02af\13\36\3\36\3\36\3\37\3\37\3\37"+
		"\7\37\u02b6\n\37\f\37\16\37\u02b9\13\37\3\37\3\37\3 \3 \3 \3 \3 \3 \7"+
		" \u02c3\n \f \16 \u02c6\13 \3 \3 \5 \u02ca\n \3!\5!\u02cd\n!\3!\3!\3\""+
		"\3\"\3\"\3\"\5\"\u02d5\n\"\3\"\3\"\7\"\u02d9\n\"\f\"\16\"\u02dc\13\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\7\"\u02e4\n\"\f\"\16\"\u02e7\13\"\3\"\3\"\5\"\u02eb"+
		"\n\"\3\"\3\"\7\"\u02ef\n\"\f\"\16\"\u02f2\13\"\3\"\3\"\5\"\u02f6\n\"\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u0302\n#\f#\16#\u0305\13#\3#\3#\5#\u0309"+
		"\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0317\n$\3%\3%\3%\3%\3%\3%"+
		"\5%\u031f\n%\3%\3%\3%\3%\3%\3%\7%\u0327\n%\f%\16%\u032a\13%\3%\3%\5%\u032e"+
		"\n%\5%\u0330\n%\3&\3&\3&\3&\3&\7&\u0337\n&\f&\16&\u033a\13&\3&\5&\u033d"+
		"\n&\3\'\3\'\3\'\3\'\3\'\5\'\u0344\n\'\3\'\3\'\3\'\3\'\7\'\u034a\n\'\f"+
		"\'\16\'\u034d\13\'\3\'\3\'\3(\3(\3(\7(\u0354\n(\f(\16(\u0357\13(\3(\3"+
		"(\3(\3(\3(\3(\7(\u035f\n(\f(\16(\u0362\13(\3(\3(\3(\7(\u0367\n(\f(\16"+
		"(\u036a\13(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u0375\n(\f(\16(\u0378\13(\3"+
		"(\5(\u037b\n(\3)\3)\3)\3)\5)\u0381\n)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3"+
		",\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u039e\n-\f-\16-\u03a1"+
		"\13-\3-\3-\5-\u03a5\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u03b3\n"+
		".\f.\16.\u03b6\13.\3.\3.\5.\u03ba\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/"+
		"\u03c6\n/\f/\16/\u03c9\13/\3/\3/\3/\3/\3/\3/\5/\u03d1\n/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\62\7\62\u03da\n\62\f\62\16\62\u03dd\13\62\3\63\3\63"+
		"\3\63\7\63\u03e2\n\63\f\63\16\63\u03e5\13\63\3\64\3\64\3\64\3\64\7\64"+
		"\u03eb\n\64\f\64\16\64\u03ee\13\64\3\65\3\65\3\65\3\65\5\65\u03f4\n\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0402"+
		"\n\66\f\66\16\66\u0405\13\66\3\67\3\67\3\67\7\67\u040a\n\67\f\67\16\67"+
		"\u040d\13\67\38\38\38\38\78\u0413\n8\f8\168\u0416\138\39\39\39\39\79\u041c"+
		"\n9\f9\169\u041f\139\3:\3:\3:\3:\7:\u0425\n:\f:\16:\u0428\13:\3;\3;\3"+
		";\3;\7;\u042e\n;\f;\16;\u0431\13;\3<\7<\u0434\n<\f<\16<\u0437\13<\3<\3"+
		"<\3=\3=\3=\6=\u043e\n=\r=\16=\u043f\5=\u0442\n=\3>\3>\3>\3>\3>\5>\u0449"+
		"\n>\3?\3?\3?\3?\3?\3?\7?\u0451\n?\f?\16?\u0454\13?\5?\u0456\n?\3@\3@\3"+
		"@\3@\7@\u045c\n@\f@\16@\u045f\13@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\5B\u0470\nB\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0480"+
		"\nD\3E\3E\3E\3E\3E\3E\7E\u0488\nE\fE\16E\u048b\13E\3E\3E\5E\u048f\nE\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\7F\u049c\nF\fF\16F\u049f\13F\3F\3F\5F"+
		"\u04a3\nF\3G\3G\3G\3G\7G\u04a9\nG\fG\16G\u04ac\13G\3G\3G\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\6H\u04bb\nH\rH\16H\u04bc\3H\5H\u04c0\nH\3H\3H\5H\u04c4"+
		"\nH\3I\3I\7I\u04c8\nI\fI\16I\u04cb\13I\3I\3I\3I\3I\3I\7I\u04d2\nI\fI\16"+
		"I\u04d5\13I\3I\3I\7I\u04d9\nI\fI\16I\u04dc\13I\3I\3I\5I\u04e0\nI\3J\3"+
		"J\3J\5J\u04e5\nJ\3K\3K\3K\5K\u04ea\nK\3K\3K\3K\3K\7K\u04f0\nK\fK\16K\u04f3"+
		"\13K\5K\u04f5\nK\3K\3K\7K\u04f9\nK\fK\16K\u04fc\13K\3K\3K\3L\3L\5L\u0502"+
		"\nL\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W"+
		"\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u0529\nY\fY\16Y\u052c"+
		"\13Y\3Y\3Y\3Y\3Y\5Y\u0532\nY\3Z\3Z\3Z\3Z\3Z\7Z\u0539\nZ\fZ\16Z\u053c\13"+
		"Z\3Z\3Z\3Z\5Z\u0541\nZ\3[\3[\3[\3[\3[\5[\u0548\n[\3[\3[\3[\3[\7[\u054e"+
		"\n[\f[\16[\u0551\13[\3[\3[\3\\\3\\\3\\\7\\\u0558\n\\\f\\\16\\\u055b\13"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u0563\n\\\f\\\16\\\u0566\13\\\3\\\3\\\3"+
		"\\\7\\\u056b\n\\\f\\\16\\\u056e\13\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\7\\\u057a\n\\\f\\\16\\\u057d\13\\\3\\\3\\\3\\\5\\\u0582\n\\\3]"+
		"\3]\3]\3]\7]\u0588\n]\f]\16]\u058b\13]\3]\3]\3^\3^\3^\5^\u0592\n^\3_\3"+
		"_\3_\3_\7_\u0598\n_\f_\16_\u059b\13_\3_\3_\3`\3`\3a\3a\3a\7a\u05a4\na"+
		"\fa\16a\u05a7\13a\3b\3b\3b\7b\u05ac\nb\fb\16b\u05af\13b\3c\3c\3c\5c\u05b4"+
		"\nc\3c\5c\u05b7\nc\3c\3c\3c\3c\3c\5c\u05be\nc\3d\3d\3d\3d\3e\3e\3e\3e"+
		"\3e\3e\7e\u05ca\ne\fe\16e\u05cd\13e\3e\3e\5e\u05d1\ne\3e\2\2f\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\2\20\3\2\62\63\4\2\b\b#-\3\2\64\65\3\2\66\67"+
		"\4\2\669?@\3\2;>\3\2?@\3\2AF\3\2GH\3\2IL\3\2NO\3\2PQ\3\2RS\3\2TU\2\u064d"+
		"\2\u00cd\3\2\2\2\4\u00d0\3\2\2\2\6\u00e1\3\2\2\2\b\u011f\3\2\2\2\n\u0121"+
		"\3\2\2\2\f\u0129\3\2\2\2\16\u012e\3\2\2\2\20\u0156\3\2\2\2\22\u0158\3"+
		"\2\2\2\24\u0197\3\2\2\2\26\u0199\3\2\2\2\30\u01ca\3\2\2\2\32\u01f0\3\2"+
		"\2\2\34\u01f2\3\2\2\2\36\u01f5\3\2\2\2 \u01fb\3\2\2\2\"\u0214\3\2\2\2"+
		"$\u0218\3\2\2\2&\u022b\3\2\2\2(\u0244\3\2\2\2*\u0246\3\2\2\2,\u0258\3"+
		"\2\2\2.\u025a\3\2\2\2\60\u0260\3\2\2\2\62\u026b\3\2\2\2\64\u0277\3\2\2"+
		"\2\66\u029f\3\2\2\28\u02a1\3\2\2\2:\u02a8\3\2\2\2<\u02b2\3\2\2\2>\u02c9"+
		"\3\2\2\2@\u02cc\3\2\2\2B\u02f5\3\2\2\2D\u0308\3\2\2\2F\u0316\3\2\2\2H"+
		"\u032f\3\2\2\2J\u033c\3\2\2\2L\u033e\3\2\2\2N\u037a\3\2\2\2P\u0380\3\2"+
		"\2\2R\u0382\3\2\2\2T\u0385\3\2\2\2V\u0388\3\2\2\2X\u03a4\3\2\2\2Z\u03b9"+
		"\3\2\2\2\\\u03d0\3\2\2\2^\u03d2\3\2\2\2`\u03d4\3\2\2\2b\u03d6\3\2\2\2"+
		"d\u03de\3\2\2\2f\u03e6\3\2\2\2h\u03ef\3\2\2\2j\u03f5\3\2\2\2l\u0406\3"+
		"\2\2\2n\u040e\3\2\2\2p\u0417\3\2\2\2r\u0420\3\2\2\2t\u0429\3\2\2\2v\u0435"+
		"\3\2\2\2x\u0441\3\2\2\2z\u0448\3\2\2\2|\u0455\3\2\2\2~\u0457\3\2\2\2\u0080"+
		"\u0462\3\2\2\2\u0082\u046f\3\2\2\2\u0084\u0471\3\2\2\2\u0086\u047f\3\2"+
		"\2\2\u0088\u048e\3\2\2\2\u008a\u04a2\3\2\2\2\u008c\u04a4\3\2\2\2\u008e"+
		"\u04c3\3\2\2\2\u0090\u04df\3\2\2\2\u0092\u04e1\3\2\2\2\u0094\u04e6\3\2"+
		"\2\2\u0096\u04ff\3\2\2\2\u0098\u0503\3\2\2\2\u009a\u0505\3\2\2\2\u009c"+
		"\u0507\3\2\2\2\u009e\u0509\3\2\2\2\u00a0\u050b\3\2\2\2\u00a2\u050d\3\2"+
		"\2\2\u00a4\u050f\3\2\2\2\u00a6\u0511\3\2\2\2\u00a8\u0513\3\2\2\2\u00aa"+
		"\u0515\3\2\2\2\u00ac\u0517\3\2\2\2\u00ae\u0519\3\2\2\2\u00b0\u0531\3\2"+
		"\2\2\u00b2\u0540\3\2\2\2\u00b4\u0542\3\2\2\2\u00b6\u0581\3\2\2\2\u00b8"+
		"\u0583\3\2\2\2\u00ba\u058e\3\2\2\2\u00bc\u0593\3\2\2\2\u00be\u059e\3\2"+
		"\2\2\u00c0\u05a0\3\2\2\2\u00c2\u05a8\3\2\2\2\u00c4\u05bd\3\2\2\2\u00c6"+
		"\u05bf\3\2\2\2\u00c8\u05d0\3\2\2\2\u00ca\u00cc\5\4\3\2\u00cb\u00ca\3\2"+
		"\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\3\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\3\2\2\u00d1\u00d2\7`\2\2"+
		"\u00d2\u00d6\7\4\2\2\u00d3\u00d5\5\6\4\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00dc\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00db\5\b\5\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e0\7\5\2\2\u00e0\5\3\2\2\2\u00e1\u00e2\7\6\2\2"+
		"\u00e2\u00e3\7`\2\2\u00e3\7\3\2\2\2\u00e4\u0120\5:\36\2\u00e5\u0120\5"+
		"\f\7\2\u00e6\u0120\5\n\6\2\u00e7\u00e9\5\36\20\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ed\u0120\5\16\b\2\u00ee\u00f0\5\36\20\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u0120\5\22\n\2\u00f5"+
		"\u00f7\5\36\20\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u0120\5\26\f\2\u00fc\u00fe\5\36\20\2\u00fd\u00fc\3\2\2\2\u00fe\u0101"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u0120\5\32\16\2\u0103\u0105\5\36\20\2\u0104\u0103"+
		"\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0120\5\34\17\2\u010a\u010c\5"+
		"\36\20\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0120\5\64"+
		"\33\2\u0111\u0113\5\36\20\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0117\u0120\5(\25\2\u0118\u011a\5\36\20\2\u0119\u0118\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011e\u0120\5,\27\2\u011f\u00e4\3\2\2\2\u011f"+
		"\u00e5\3\2\2\2\u011f\u00e6\3\2\2\2\u011f\u00ea\3\2\2\2\u011f\u00f1\3\2"+
		"\2\2\u011f\u00f8\3\2\2\2\u011f\u00ff\3\2\2\2\u011f\u0106\3\2\2\2\u011f"+
		"\u010d\3\2\2\2\u011f\u0114\3\2\2\2\u011f\u011b\3\2\2\2\u0120\t\3\2\2\2"+
		"\u0121\u0122\7\7\2\2\u0122\u0123\7`\2\2\u0123\u0124\7\b\2\2\u0124\u0127"+
		"\7`\2\2\u0125\u0126\7\65\2\2\u0126\u0128\7`\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\13\3\2\2\2\u0129\u012a\7\t\2\2\u012a\u012b\7`\2\2"+
		"\u012b\u012c\7\b\2\2\u012c\u012d\5\u00be`\2\u012d\r\3\2\2\2\u012e\u012f"+
		"\7\n\2\2\u012f\u0131\7`\2\2\u0130\u0132\5\u00b8]\2\u0131\u0130\3\2\2\2"+
		"\u0131\u0132\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0134\7\13\2\2\u0134\u0136"+
		"\5\u00be`\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u013f\3\2\2"+
		"\2\u0137\u013b\7\4\2\2\u0138\u013a\5\20\t\2\u0139\u0138\3\2\2\2\u013a"+
		"\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013e\u0140\7\5\2\2\u013f\u0137\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\17\3\2\2\2\u0141\u0143\5\36\20\2\u0142\u0141\3\2"+
		"\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0157\5*\26\2\u0148\u014a\5\36"+
		"\20\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0157\5."+
		"\30\2\u014f\u0151\5\36\20\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0155\u0157\5\66\34\2\u0156\u0144\3\2\2\2\u0156\u014b\3\2\2\2\u0156"+
		"\u0152\3\2\2\2\u0157\21\3\2\2\2\u0158\u0159\7\f\2\2\u0159\u015b\7`\2\2"+
		"\u015a\u015c\5\u00b8]\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015e\3\2\2\2\u015d\u015f\5> \2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2"+
		"\2\u015f\u0162\3\2\2\2\u0160\u0161\7\13\2\2\u0161\u0163\5\u00be`\2\u0162"+
		"\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u016d\3\2\2\2\u0164\u0165\7M"+
		"\2\2\u0165\u016a\5`\61\2\u0166\u0167\7\r\2\2\u0167\u0169\5`\61\2\u0168"+
		"\u0166\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0164\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u0177\3\2\2\2\u016f\u0173\7\4\2\2\u0170\u0172\5\24"+
		"\13\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0178\7\5"+
		"\2\2\u0177\u016f\3\2\2\2\u0177\u0178\3\2\2\2\u0178\23\3\2\2\2\u0179\u017b"+
		"\5\36\20\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2"+
		"\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0198"+
		"\5(\25\2\u0180\u0182\5\36\20\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2"+
		"\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183"+
		"\3\2\2\2\u0186\u0198\5,\27\2\u0187\u0189\5\36\20\2\u0188\u0187\3\2\2\2"+
		"\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d"+
		"\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u0198\5\64\33\2\u018e\u0190\5\36\20"+
		"\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192"+
		"\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0198\5B\"\2\u0195"+
		"\u0198\5:\36\2\u0196\u0198\5<\37\2\u0197\u017c\3\2\2\2\u0197\u0183\3\2"+
		"\2\2\u0197\u018a\3\2\2\2\u0197\u0191\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0196\3\2\2\2\u0198\25\3\2\2\2\u0199\u019a\7\16\2\2\u019a\u019d\7`\2"+
		"\2\u019b\u019c\7\13\2\2\u019c\u019e\5\u00be`\2\u019d\u019b\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u01a8\3\2\2\2\u019f\u01a0\7M\2\2\u01a0\u01a5\5`\61"+
		"\2\u01a1\u01a2\7\r\2\2\u01a2\u01a4\5`\61\2\u01a3\u01a1\3\2\2\2\u01a4\u01a7"+
		"\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a8\u019f\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2"+
		"\2\2\u01aa\u01ae\7\4\2\2\u01ab\u01ad\5\30\r\2\u01ac\u01ab\3\2\2\2\u01ad"+
		"\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2"+
		"\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\7\5\2\2\u01b2\27\3\2\2\2\u01b3\u01b5"+
		"\5\36\20\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2"+
		"\u01b6\u01b7\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01cb"+
		"\5(\25\2\u01ba\u01bc\5\36\20\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2"+
		"\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bd"+
		"\3\2\2\2\u01c0\u01cb\5,\27\2\u01c1\u01c3\5\36\20\2\u01c2\u01c1\3\2\2\2"+
		"\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7"+
		"\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01cb\5\64\33\2\u01c8\u01cb\5:\36\2"+
		"\u01c9\u01cb\5<\37\2\u01ca\u01b6\3\2\2\2\u01ca\u01bd\3\2\2\2\u01ca\u01c4"+
		"\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb\31\3\2\2\2\u01cc"+
		"\u01cd\7\17\2\2\u01cd\u01cf\7`\2\2\u01ce\u01d0\5> \2\u01cf\u01ce\3\2\2"+
		"\2\u01cf\u01d0\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01d2\7\13\2\2\u01d2"+
		"\u01d4\5\u00be`\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5"+
		"\3\2\2\2\u01d5\u01d6\7\4\2\2\u01d6\u01d8\5 \21\2\u01d7\u01d9\7\r\2\2\u01d8"+
		"\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\7\5"+
		"\2\2\u01db\u01f1\3\2\2\2\u01dc\u01dd\7\17\2\2\u01dd\u01df\7`\2\2\u01de"+
		"\u01e0\5> \2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e3\3\2\2"+
		"\2\u01e1\u01e2\7\13\2\2\u01e2\u01e4\5\u00be`\2\u01e3\u01e1\3\2\2\2\u01e3"+
		"\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\7\4\2\2\u01e6\u01e7\5 "+
		"\21\2\u01e7\u01eb\7\20\2\2\u01e8\u01ea\5&\24\2\u01e9\u01e8\3\2\2\2\u01ea"+
		"\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2"+
		"\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\7\5\2\2\u01ef\u01f1\3\2\2\2\u01f0"+
		"\u01cc\3\2\2\2\u01f0\u01dc\3\2\2\2\u01f1\33\3\2\2\2\u01f2\u01f3\7\21\2"+
		"\2\u01f3\u01f4\7`\2\2\u01f4\35\3\2\2\2\u01f5\u01f6\7\22\2\2\u01f6\u01f9"+
		"\7`\2\2\u01f7\u01f8\7\65\2\2\u01f8\u01fa\7`\2\2\u01f9\u01f7\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\37\3\2\2\2\u01fb\u0200\5\"\22\2\u01fc\u01fd\7\r\2"+
		"\2\u01fd\u01ff\5\"\22\2\u01fe\u01fc\3\2\2\2\u01ff\u0202\3\2\2\2\u0200"+
		"\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201!\3\2\2\2\u0202\u0200\3\2\2\2"+
		"\u0203\u0206\7`\2\2\u0204\u0205\7\23\2\2\u0205\u0207\7\24\2\2\u0206\u0204"+
		"\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0215\3\2\2\2\u0208\u0209\7`\2\2\u0209"+
		"\u020a\7\23\2\2\u020a\u020f\5$\23\2\u020b\u020c\7\r\2\2\u020c\u020e\5"+
		"$\23\2\u020d\u020b\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0213\7\24"+
		"\2\2\u0213\u0215\3\2\2\2\u0214\u0203\3\2\2\2\u0214\u0208\3\2\2\2\u0215"+
		"#\3\2\2\2\u0216\u0217\7`\2\2\u0217\u0219\7\b\2\2\u0218\u0216\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\5`\61\2\u021b%\3\2\2\2"+
		"\u021c\u021e\5\36\20\2\u021d\u021c\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d"+
		"\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\3\2\2\2\u0221\u021f\3\2\2\2\u0222"+
		"\u022c\5,\27\2\u0223\u0225\5\36\20\2\u0224\u0223\3\2\2\2\u0225\u0228\3"+
		"\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228"+
		"\u0226\3\2\2\2\u0229\u022c\5\64\33\2\u022a\u022c\5:\36\2\u022b\u021f\3"+
		"\2\2\2\u022b\u0226\3\2\2\2\u022b\u022a\3\2\2\2\u022c\'\3\2\2\2\u022d\u0230"+
		"\5*\26\2\u022e\u022f\7\b\2\2\u022f\u0231\5`\61\2\u0230\u022e\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\5\62\32\2\u0233\u0234\5"+
		"\60\31\2\u0234\u0245\3\2\2\2\u0235\u0238\5*\26\2\u0236\u0237\7\b\2\2\u0237"+
		"\u0239\5`\61\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\3\2"+
		"\2\2\u023a\u023c\5\60\31\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\u023e\3\2\2\2\u023d\u023f\5\62\32\2\u023e\u023d\3\2\2\2\u023e\u023f\3"+
		"\2\2\2\u023f\u0245\3\2\2\2\u0240\u0241\5*\26\2\u0241\u0242\7M\2\2\u0242"+
		"\u0243\5`\61\2\u0243\u0245\3\2\2\2\u0244\u022d\3\2\2\2\u0244\u0235\3\2"+
		"\2\2\u0244\u0240\3\2\2\2\u0245)\3\2\2\2\u0246\u0247\7\62\2\2\u0247\u024a"+
		"\7`\2\2\u0248\u0249\7\13\2\2\u0249\u024b\5\u00be`\2\u024a\u0248\3\2\2"+
		"\2\u024a\u024b\3\2\2\2\u024b+\3\2\2\2\u024c\u024f\5.\30\2\u024d\u024e"+
		"\7\b\2\2\u024e\u0250\5`\61\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u0252\3\2\2\2\u0251\u0253\5\60\31\2\u0252\u0251\3\2\2\2\u0252\u0253\3"+
		"\2\2\2\u0253\u0259\3\2\2\2\u0254\u0255\5.\30\2\u0255\u0256\7M\2\2\u0256"+
		"\u0257\5`\61\2\u0257\u0259\3\2\2\2\u0258\u024c\3\2\2\2\u0258\u0254\3\2"+
		"\2\2\u0259-\3\2\2\2\u025a\u025b\7\63\2\2\u025b\u025e\7`\2\2\u025c\u025d"+
		"\7\13\2\2\u025d\u025f\5\u00be`\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2"+
		"\2\u025f/\3\2\2\2\u0260\u0261\7\25\2\2\u0261\u0262\7\23\2\2\u0262\u0263"+
		"\7\24\2\2\u0263\u0265\7\4\2\2\u0264\u0266\5F$\2\u0265\u0264\3\2\2\2\u0266"+
		"\u0267\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2"+
		"\2\2\u0269\u026a\7\5\2\2\u026a\61\3\2\2\2\u026b\u026c\7\26\2\2\u026c\u026d"+
		"\7\23\2\2\u026d\u026e\7`\2\2\u026e\u026f\7\24\2\2\u026f\u0271\7\4\2\2"+
		"\u0270\u0272\5F$\2\u0271\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0271"+
		"\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\7\5\2\2\u0276"+
		"\63\3\2\2\2\u0277\u0278\5\66\34\2\u0278\u027c\7\4\2\2\u0279\u027b\5F$"+
		"\2\u027a\u0279\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d"+
		"\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0280\7\5\2\2\u0280"+
		"\65\3\2\2\2\u0281\u0282\7\27\2\2\u0282\u0284\7`\2\2\u0283\u0285\5\u00b8"+
		"]\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286"+
		"\u0287\7\23\2\2\u0287\u028a\7\24\2\2\u0288\u0289\7\13\2\2\u0289\u028b"+
		"\5\u00be`\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u02a0\3\2\2"+
		"\2\u028c\u028d\7\27\2\2\u028d\u028f\7`\2\2\u028e\u0290\5\u00b8]\2\u028f"+
		"\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\7\23"+
		"\2\2\u0292\u0297\58\35\2\u0293\u0294\7\r\2\2\u0294\u0296\58\35\2\u0295"+
		"\u0293\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2"+
		"\2\2\u0298\u029a\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029d\7\24\2\2\u029b"+
		"\u029c\7\13\2\2\u029c\u029e\5\u00be`\2\u029d\u029b\3\2\2\2\u029d\u029e"+
		"\3\2\2\2\u029e\u02a0\3\2\2\2\u029f\u0281\3\2\2\2\u029f\u028c\3\2\2\2\u02a0"+
		"\67\3\2\2\2\u02a1\u02a2\7`\2\2\u02a2\u02a3\7\13\2\2\u02a3\u02a6\5\u00be"+
		"`\2\u02a4\u02a5\7\b\2\2\u02a5\u02a7\5`\61\2\u02a6\u02a4\3\2\2\2\u02a6"+
		"\u02a7\3\2\2\2\u02a79\3\2\2\2\u02a8\u02a9\7\30\2\2\u02a9\u02ad\7\4\2\2"+
		"\u02aa\u02ac\5F$\2\u02ab\u02aa\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab"+
		"\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0"+
		"\u02b1\7\5\2\2\u02b1;\3\2\2\2\u02b2\u02b3\7\31\2\2\u02b3\u02b7\7\4\2\2"+
		"\u02b4\u02b6\5F$\2\u02b5\u02b4\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5"+
		"\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba"+
		"\u02bb\7\5\2\2\u02bb=\3\2\2\2\u02bc\u02bd\7\23\2\2\u02bd\u02ca\7\24\2"+
		"\2\u02be\u02bf\7\23\2\2\u02bf\u02c4\5@!\2\u02c0\u02c1\7\r\2\2\u02c1\u02c3"+
		"\5@!\2\u02c2\u02c0\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4"+
		"\u02c5\3\2\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02c8\7\24"+
		"\2\2\u02c8\u02ca\3\2\2\2\u02c9\u02bc\3\2\2\2\u02c9\u02be\3\2\2\2\u02ca"+
		"?\3\2\2\2\u02cb\u02cd\t\2\2\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2"+
		"\u02cd\u02ce\3\2\2\2\u02ce\u02cf\58\35\2\u02cfA\3\2\2\2\u02d0\u02d1\7"+
		"\32\2\2\u02d1\u02d2\7\23\2\2\u02d2\u02d4\7\24\2\2\u02d3\u02d5\5D#\2\u02d4"+
		"\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02da\7\4"+
		"\2\2\u02d7\u02d9\5F$\2\u02d8\u02d7\3\2\2\2\u02d9\u02dc\3\2\2\2\u02da\u02d8"+
		"\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dd\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd"+
		"\u02f6\7\5\2\2\u02de\u02df\7\32\2\2\u02df\u02e0\7\23\2\2\u02e0\u02e5\5"+
		"8\35\2\u02e1\u02e2\7\r\2\2\u02e2\u02e4\58\35\2\u02e3\u02e1\3\2\2\2\u02e4"+
		"\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e8\3\2"+
		"\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02ea\7\24\2\2\u02e9\u02eb\5D#\2\u02ea"+
		"\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02f0\7\4"+
		"\2\2\u02ed\u02ef\5F$\2\u02ee\u02ed\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee"+
		"\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3"+
		"\u02f4\7\5\2\2\u02f4\u02f6\3\2\2\2\u02f5\u02d0\3\2\2\2\u02f5\u02de\3\2"+
		"\2\2\u02f6C\3\2\2\2\u02f7\u02f8\7\13\2\2\u02f8\u02f9\7\33\2\2\u02f9\u02fa"+
		"\7\23\2\2\u02fa\u0309\7\24\2\2\u02fb\u02fc\7\13\2\2\u02fc\u02fd\7\33\2"+
		"\2\u02fd\u02fe\7\23\2\2\u02fe\u0303\5$\23\2\u02ff\u0300\7\r\2\2\u0300"+
		"\u0302\5$\23\2\u0301\u02ff\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2"+
		"\2\2\u0303\u0304\3\2\2\2\u0304\u0306\3\2\2\2\u0305\u0303\3\2\2\2\u0306"+
		"\u0307\7\24\2\2\u0307\u0309\3\2\2\2\u0308\u02f7\3\2\2\2\u0308\u02fb\3"+
		"\2\2\2\u0309E\3\2\2\2\u030a\u0317\5(\25\2\u030b\u0317\5,\27\2\u030c\u0317"+
		"\5H%\2\u030d\u0317\5L\'\2\u030e\u0317\5X-\2\u030f\u0317\5Z.\2\u0310\u0317"+
		"\5\\/\2\u0311\u0312\5`\61\2\u0312\u0313\5^\60\2\u0313\u0314\5`\61\2\u0314"+
		"\u0317\3\2\2\2\u0315\u0317\5`\61\2\u0316\u030a\3\2\2\2\u0316\u030b\3\2"+
		"\2\2\u0316\u030c\3\2\2\2\u0316\u030d\3\2\2\2\u0316\u030e\3\2\2\2\u0316"+
		"\u030f\3\2\2\2\u0316\u0310\3\2\2\2\u0316\u0311\3\2\2\2\u0316\u0315\3\2"+
		"\2\2\u0317G\3\2\2\2\u0318\u0319\7\34\2\2\u0319\u031a\7\23\2\2\u031a\u031b"+
		"\5`\61\2\u031b\u031c\7\24\2\2\u031c\u031e\5F$\2\u031d\u031f\5J&\2\u031e"+
		"\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0330\3\2\2\2\u0320\u0321\7\34"+
		"\2\2\u0321\u0322\7\23\2\2\u0322\u0323\5`\61\2\u0323\u0324\7\24\2\2\u0324"+
		"\u0328\7\4\2\2\u0325\u0327\5F$\2\u0326\u0325\3\2\2\2\u0327\u032a\3\2\2"+
		"\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032b\3\2\2\2\u032a\u0328"+
		"\3\2\2\2\u032b\u032d\7\5\2\2\u032c\u032e\5J&\2\u032d\u032c\3\2\2\2\u032d"+
		"\u032e\3\2\2\2\u032e\u0330\3\2\2\2\u032f\u0318\3\2\2\2\u032f\u0320\3\2"+
		"\2\2\u0330I\3\2\2\2\u0331\u0332\7\35\2\2\u0332\u033d\5F$\2\u0333\u0334"+
		"\7\35\2\2\u0334\u0338\7\4\2\2\u0335\u0337\5F$\2\u0336\u0335\3\2\2\2\u0337"+
		"\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033b\3\2"+
		"\2\2\u033a\u0338\3\2\2\2\u033b\u033d\7\5\2\2\u033c\u0331\3\2\2\2\u033c"+
		"\u0333\3\2\2\2\u033dK\3\2\2\2\u033e\u033f\7\36\2\2\u033f\u0343\7\23\2"+
		"\2\u0340\u0341\5.\30\2\u0341\u0342\7\b\2\2\u0342\u0344\3\2\2\2\u0343\u0340"+
		"\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\5`\61\2\u0346"+
		"\u0347\7\24\2\2\u0347\u034b\7\4\2\2\u0348\u034a\5N(\2\u0349\u0348\3\2"+
		"\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c"+
		"\u034e\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u034f\7\5\2\2\u034fM\3\2\2\2"+
		"\u0350\u0355\5P)\2\u0351\u0352\7\r\2\2\u0352\u0354\5P)\2\u0353\u0351\3"+
		"\2\2\2\u0354\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356"+
		"\u0358\3\2\2\2\u0357\u0355\3\2\2\2\u0358\u0359\7\37\2\2\u0359\u035a\5"+
		"F$\2\u035a\u037b\3\2\2\2\u035b\u0360\5P)\2\u035c\u035d\7\r\2\2\u035d\u035f"+
		"\5P)\2\u035e\u035c\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360"+
		"\u0361\3\2\2\2\u0361\u0363\3\2\2\2\u0362\u0360\3\2\2\2\u0363\u0364\7\37"+
		"\2\2\u0364\u0368\7\4\2\2\u0365\u0367\5F$\2\u0366\u0365\3\2\2\2\u0367\u036a"+
		"\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036b\3\2\2\2\u036a"+
		"\u0368\3\2\2\2\u036b\u036c\7\5\2\2\u036c\u037b\3\2\2\2\u036d\u036e\7\35"+
		"\2\2\u036e\u036f\7\37\2\2\u036f\u037b\5F$\2\u0370\u0371\7\35\2\2\u0371"+
		"\u0372\7\37\2\2\u0372\u0376\7\4\2\2\u0373\u0375\5F$\2\u0374\u0373\3\2"+
		"\2\2\u0375\u0378\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377"+
		"\u0379\3\2\2\2\u0378\u0376\3\2\2\2\u0379\u037b\7\5\2\2\u037a\u0350\3\2"+
		"\2\2\u037a\u035b\3\2\2\2\u037a\u036d\3\2\2\2\u037a\u0370\3\2\2\2\u037b"+
		"O\3\2\2\2\u037c\u0381\5`\61\2\u037d\u0381\5R*\2\u037e\u0381\5T+\2\u037f"+
		"\u0381\5V,\2\u0380\u037c\3\2\2\2\u0380\u037d\3\2\2\2\u0380\u037e\3\2\2"+
		"\2\u0380\u037f\3\2\2\2\u0381Q\3\2\2\2\u0382\u0383\5\u00aaV\2\u0383\u0384"+
		"\5`\61\2\u0384S\3\2\2\2\u0385\u0386\5\u00a8U\2\u0386\u0387\5\u00be`\2"+
		"\u0387U\3\2\2\2\u0388\u0389\5\u00acW\2\u0389\u038a\7`\2\2\u038a\u038b"+
		"\7\13\2\2\u038b\u038c\5\u00be`\2\u038cW\3\2\2\2\u038d\u038e\7 \2\2\u038e"+
		"\u038f\7\23\2\2\u038f\u0390\7`\2\2\u0390\u0391\7P\2\2\u0391\u0392\5`\61"+
		"\2\u0392\u0393\7\24\2\2\u0393\u0394\5F$\2\u0394\u03a5\3\2\2\2\u0395\u0396"+
		"\7 \2\2\u0396\u0397\7\23\2\2\u0397\u0398\7`\2\2\u0398\u0399\7P\2\2\u0399"+
		"\u039a\5`\61\2\u039a\u039b\7\24\2\2\u039b\u039f\7\4\2\2\u039c\u039e\5"+
		"F$\2\u039d\u039c\3\2\2\2\u039e\u03a1\3\2\2\2\u039f\u039d\3\2\2\2\u039f"+
		"\u03a0\3\2\2\2\u03a0\u03a2\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2\u03a3\7\5"+
		"\2\2\u03a3\u03a5\3\2\2\2\u03a4\u038d\3\2\2\2\u03a4\u0395\3\2\2\2\u03a5"+
		"Y\3\2\2\2\u03a6\u03a7\7!\2\2\u03a7\u03a8\7\23\2\2\u03a8\u03a9\5`\61\2"+
		"\u03a9\u03aa\7\24\2\2\u03aa\u03ab\5F$\2\u03ab\u03ba\3\2\2\2\u03ac\u03ad"+
		"\7!\2\2\u03ad\u03ae\7\23\2\2\u03ae\u03af\5`\61\2\u03af\u03b0\7\24\2\2"+
		"\u03b0\u03b4\7\4\2\2\u03b1\u03b3\5F$\2\u03b2\u03b1\3\2\2\2\u03b3\u03b6"+
		"\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b7\3\2\2\2\u03b6"+
		"\u03b4\3\2\2\2\u03b7\u03b8\7\5\2\2\u03b8\u03ba\3\2\2\2\u03b9\u03a6\3\2"+
		"\2\2\u03b9\u03ac\3\2\2\2\u03ba[\3\2\2\2\u03bb\u03bc\7\"\2\2\u03bc\u03bd"+
		"\5F$\2\u03bd\u03be\7!\2\2\u03be\u03bf\7\23\2\2\u03bf\u03c0\5`\61\2\u03c0"+
		"\u03c1\7\24\2\2\u03c1\u03d1\3\2\2\2\u03c2\u03c3\7\"\2\2\u03c3\u03c7\7"+
		"\4\2\2\u03c4\u03c6\5F$\2\u03c5\u03c4\3\2\2\2\u03c6\u03c9\3\2\2\2\u03c7"+
		"\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03c7\3\2"+
		"\2\2\u03ca\u03cb\7\5\2\2\u03cb\u03cc\7!\2\2\u03cc\u03cd\7\23\2\2\u03cd"+
		"\u03ce\5`\61\2\u03ce\u03cf\7\24\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03bb\3"+
		"\2\2\2\u03d0\u03c2\3\2\2\2\u03d1]\3\2\2\2\u03d2\u03d3\t\3\2\2\u03d3_\3"+
		"\2\2\2\u03d4\u03d5\5b\62\2\u03d5a\3\2\2\2\u03d6\u03db\5d\63\2\u03d7\u03d8"+
		"\7W\2\2\u03d8\u03da\5d\63\2\u03d9\u03d7\3\2\2\2\u03da\u03dd\3\2\2\2\u03db"+
		"\u03d9\3\2\2\2\u03db\u03dc\3\2\2\2\u03dcc\3\2\2\2\u03dd\u03db\3\2\2\2"+
		"\u03de\u03e3\5f\64\2\u03df\u03e0\7V\2\2\u03e0\u03e2\5f\64\2\u03e1\u03df"+
		"\3\2\2\2\u03e2\u03e5\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4"+
		"e\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03ec\5h\65\2\u03e7\u03e8\5\u00ae"+
		"X\2\u03e8\u03e9\5h\65\2\u03e9\u03eb\3\2\2\2\u03ea\u03e7\3\2\2\2\u03eb"+
		"\u03ee\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03edg\3\2\2\2"+
		"\u03ee\u03ec\3\2\2\2\u03ef\u03f3\5j\66\2\u03f0\u03f1\5\u00a6T\2\u03f1"+
		"\u03f2\5j\66\2\u03f2\u03f4\3\2\2\2\u03f3\u03f0\3\2\2\2\u03f3\u03f4\3\2"+
		"\2\2\u03f4i\3\2\2\2\u03f5\u0403\5l\67\2\u03f6\u03f7\5\u00aaV\2\u03f7\u03f8"+
		"\5l\67\2\u03f8\u0402\3\2\2\2\u03f9\u03fa\5\u00a8U\2\u03fa\u03fb\5\u00be"+
		"`\2\u03fb\u0402\3\2\2\2\u03fc\u03fd\5\u00acW\2\u03fd\u03fe\7`\2\2\u03fe"+
		"\u03ff\7\13\2\2\u03ff\u0400\5\u00be`\2\u0400\u0402\3\2\2\2\u0401\u03f6"+
		"\3\2\2\2\u0401\u03f9\3\2\2\2\u0401\u03fc\3\2\2\2\u0402\u0405\3\2\2\2\u0403"+
		"\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404k\3\2\2\2\u0405\u0403\3\2\2\2"+
		"\u0406\u040b\5n8\2\u0407\u0408\7:\2\2\u0408\u040a\5n8\2\u0409\u0407\3"+
		"\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c\3\2\2\2\u040c"+
		"m\3\2\2\2\u040d\u040b\3\2\2\2\u040e\u0414\5p9\2\u040f\u0410\5\u00a4S\2"+
		"\u0410\u0411\5p9\2\u0411\u0413\3\2\2\2\u0412\u040f\3\2\2\2\u0413\u0416"+
		"\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415o\3\2\2\2\u0416"+
		"\u0414\3\2\2\2\u0417\u041d\5r:\2\u0418\u0419\5\u00a2R\2\u0419\u041a\5"+
		"r:\2\u041a\u041c\3\2\2\2\u041b\u0418\3\2\2\2\u041c\u041f\3\2\2\2\u041d"+
		"\u041b\3\2\2\2\u041d\u041e\3\2\2\2\u041eq\3\2\2\2\u041f\u041d\3\2\2\2"+
		"\u0420\u0426\5t;\2\u0421\u0422\5\u00a0Q\2\u0422\u0423\5t;\2\u0423\u0425"+
		"\3\2\2\2\u0424\u0421\3\2\2\2\u0425\u0428\3\2\2\2\u0426\u0424\3\2\2\2\u0426"+
		"\u0427\3\2\2\2\u0427s\3\2\2\2\u0428\u0426\3\2\2\2\u0429\u042f\5v<\2\u042a"+
		"\u042b\5\u009eP\2\u042b\u042c\5v<\2\u042c\u042e\3\2\2\2\u042d\u042a\3"+
		"\2\2\2\u042e\u0431\3\2\2\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430"+
		"u\3\2\2\2\u0431\u042f\3\2\2\2\u0432\u0434\5\u009cO\2\u0433\u0432\3\2\2"+
		"\2\u0434\u0437\3\2\2\2\u0435\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0438"+
		"\3\2\2\2\u0437\u0435\3\2\2\2\u0438\u0439\5x=\2\u0439w\3\2\2\2\u043a\u0442"+
		"\5\u0082B\2\u043b\u043d\5\u0082B\2\u043c\u043e\5z>\2\u043d\u043c\3\2\2"+
		"\2\u043e\u043f\3\2\2\2\u043f\u043d\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0442"+
		"\3\2\2\2\u0441\u043a\3\2\2\2\u0441\u043b\3\2\2\2\u0442y\3\2\2\2\u0443"+
		"\u0449\5\u009aN\2\u0444\u0449\5\u00bc_\2\u0445\u0449\5|?\2\u0446\u0449"+
		"\5~@\2\u0447\u0449\5\u0080A\2\u0448\u0443\3\2\2\2\u0448\u0444\3\2\2\2"+
		"\u0448\u0445\3\2\2\2\u0448\u0446\3\2\2\2\u0448\u0447\3\2\2\2\u0449{\3"+
		"\2\2\2\u044a\u044b\7\23\2\2\u044b\u0456\7\24\2\2\u044c\u044d\7\23\2\2"+
		"\u044d\u0452\5$\23\2\u044e\u044f\7\r\2\2\u044f\u0451\5$\23\2\u0450\u044e"+
		"\3\2\2\2\u0451\u0454\3\2\2\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453"+
		"\u0456\3\2\2\2\u0454\u0452\3\2\2\2\u0455\u044a\3\2\2\2\u0455\u044c\3\2"+
		"\2\2\u0456}\3\2\2\2\u0457\u0458\7.\2\2\u0458\u045d\5`\61\2\u0459\u045a"+
		"\7\r\2\2\u045a\u045c\5`\61\2\u045b\u0459\3\2\2\2\u045c\u045f\3\2\2\2\u045d"+
		"\u045b\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u0460\3\2\2\2\u045f\u045d\3\2"+
		"\2\2\u0460\u0461\7/\2\2\u0461\177\3\2\2\2\u0462\u0463\5\u0098M\2\u0463"+
		"\u0464\7`\2\2\u0464\u0081\3\2\2\2\u0465\u0466\7\23\2\2\u0466\u0467\5`"+
		"\61\2\u0467\u0468\7\24\2\2\u0468\u0470\3\2\2\2\u0469\u0470\7`\2\2\u046a"+
		"\u0470\5\u0086D\2\u046b\u0470\5\u0084C\2\u046c\u0470\5\u00b0Y\2\u046d"+
		"\u0470\5\u00b4[\2\u046e\u0470\5\u0096L\2\u046f\u0465\3\2\2\2\u046f\u0469"+
		"\3\2\2\2\u046f\u046a\3\2\2\2\u046f\u046b\3\2\2\2\u046f\u046c\3\2\2\2\u046f"+
		"\u046d\3\2\2\2\u046f\u046e\3\2\2\2\u0470\u0083\3\2\2\2\u0471\u0472\7\33"+
		"\2\2\u0472\u0085\3\2\2\2\u0473\u0480\5\u0088E\2\u0474\u0480\5\u008aF\2"+
		"\u0475\u0480\5\u008cG\2\u0476\u0480\5\u008eH\2\u0477\u0480\5\u0090I\2"+
		"\u0478\u0480\5\u0094K\2\u0479\u0480\7Y\2\2\u047a\u0480\7Z\2\2\u047b\u0480"+
		"\7^\2\2\u047c\u0480\7\\\2\2\u047d\u0480\7[\2\2\u047e\u0480\7_\2\2\u047f"+
		"\u0473\3\2\2\2\u047f\u0474\3\2\2\2\u047f\u0475\3\2\2\2\u047f\u0476\3\2"+
		"\2\2\u047f\u0477\3\2\2\2\u047f\u0478\3\2\2\2\u047f\u0479\3\2\2\2\u047f"+
		"\u047a\3\2\2\2\u047f\u047b\3\2\2\2\u047f\u047c\3\2\2\2\u047f\u047d\3\2"+
		"\2\2\u047f\u047e\3\2\2\2\u0480\u0087\3\2\2\2\u0481\u0482\7.\2\2\u0482"+
		"\u048f\7/\2\2\u0483\u0484\7.\2\2\u0484\u0489\5`\61\2\u0485\u0486\7\r\2"+
		"\2\u0486\u0488\5`\61\2\u0487\u0485\3\2\2\2\u0488\u048b\3\2\2\2\u0489\u0487"+
		"\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048c\3\2\2\2\u048b\u0489\3\2\2\2\u048c"+
		"\u048d\7/\2\2\u048d\u048f\3\2\2\2\u048e\u0481\3\2\2\2\u048e\u0483\3\2"+
		"\2\2\u048f\u0089\3\2\2\2\u0490\u0491\7\4\2\2\u0491\u04a3\7\5\2\2\u0492"+
		"\u0493\7\4\2\2\u0493\u0494\5`\61\2\u0494\u0495\7\60\2\2\u0495\u049d\5"+
		"`\61\2\u0496\u0497\7\r\2\2\u0497\u0498\5`\61\2\u0498\u0499\7\60\2\2\u0499"+
		"\u049a\5`\61\2\u049a\u049c\3\2\2\2\u049b\u0496\3\2\2\2\u049c\u049f\3\2"+
		"\2\2\u049d\u049b\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04a0\3\2\2\2\u049f"+
		"\u049d\3\2\2\2\u04a0\u04a1\7\5\2\2\u04a1\u04a3\3\2\2\2\u04a2\u0490\3\2"+
		"\2\2\u04a2\u0492\3\2\2\2\u04a3\u008b\3\2\2\2\u04a4\u04a5\7\4\2\2\u04a5"+
		"\u04aa\5`\61\2\u04a6\u04a7\7\r\2\2\u04a7\u04a9\5`\61\2\u04a8\u04a6\3\2"+
		"\2\2\u04a9\u04ac\3\2\2\2\u04aa\u04a8\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab"+
		"\u04ad\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ad\u04ae\7\5\2\2\u04ae\u008d\3\2"+
		"\2\2\u04af\u04b0\7\23\2\2\u04b0\u04c4\7\24\2\2\u04b1\u04b2\7\23\2\2\u04b2"+
		"\u04b3\5`\61\2\u04b3\u04b4\7\r\2\2\u04b4\u04b5\7\24\2\2\u04b5\u04c4\3"+
		"\2\2\2\u04b6\u04b7\7\23\2\2\u04b7\u04ba\5`\61\2\u04b8\u04b9\7\r\2\2\u04b9"+
		"\u04bb\5`\61\2\u04ba\u04b8\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04ba\3\2"+
		"\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04bf\3\2\2\2\u04be\u04c0\7\r\2\2\u04bf"+
		"\u04be\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\7\24"+
		"\2\2\u04c2\u04c4\3\2\2\2\u04c3\u04af\3\2\2\2\u04c3\u04b1\3\2\2\2\u04c3"+
		"\u04b6\3\2\2\2\u04c4\u008f\3\2\2\2\u04c5\u04c9\7\4\2\2\u04c6\u04c8\5F"+
		"$\2\u04c7\u04c6\3\2\2\2\u04c8\u04cb\3\2\2\2\u04c9\u04c7\3\2\2\2\u04c9"+
		"\u04ca\3\2\2\2\u04ca\u04cc\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cc\u04e0\7\5"+
		"\2\2\u04cd\u04ce\7\4\2\2\u04ce\u04d3\5\u0092J\2\u04cf\u04d0\7\r\2\2\u04d0"+
		"\u04d2\5\u0092J\2\u04d1\u04cf\3\2\2\2\u04d2\u04d5\3\2\2\2\u04d3\u04d1"+
		"\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d6\3\2\2\2\u04d5\u04d3\3\2\2\2\u04d6"+
		"\u04da\7\37\2\2\u04d7\u04d9\5F$\2\u04d8\u04d7\3\2\2\2\u04d9\u04dc\3\2"+
		"\2\2\u04da\u04d8\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dd\3\2\2\2\u04dc"+
		"\u04da\3\2\2\2\u04dd\u04de\7\5\2\2\u04de\u04e0\3\2\2\2\u04df\u04c5\3\2"+
		"\2\2\u04df\u04cd\3\2\2\2\u04e0\u0091\3\2\2\2\u04e1\u04e4\7`\2\2\u04e2"+
		"\u04e3\7\13\2\2\u04e3\u04e5\5\u00be`\2\u04e4\u04e2\3\2\2\2\u04e4\u04e5"+
		"\3\2\2\2\u04e5\u0093\3\2\2\2\u04e6\u04e9\7\16\2\2\u04e7\u04e8\7\13\2\2"+
		"\u04e8\u04ea\5\u00be`\2\u04e9\u04e7\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea"+
		"\u04f4\3\2\2\2\u04eb\u04ec\7M\2\2\u04ec\u04f1\5`\61\2\u04ed\u04ee\7\r"+
		"\2\2\u04ee\u04f0\5`\61\2\u04ef\u04ed\3\2\2\2\u04f0\u04f3\3\2\2\2\u04f1"+
		"\u04ef\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f5\3\2\2\2\u04f3\u04f1\3\2"+
		"\2\2\u04f4\u04eb\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6"+
		"\u04fa\7\4\2\2\u04f7\u04f9\5\30\r\2\u04f8\u04f7\3\2\2\2\u04f9\u04fc\3"+
		"\2\2\2\u04fa\u04f8\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fd\3\2\2\2\u04fc"+
		"\u04fa\3\2\2\2\u04fd\u04fe\7\5\2\2\u04fe\u0095\3\2\2\2\u04ff\u0501\7\61"+
		"\2\2\u0500\u0502\5`\61\2\u0501\u0500\3\2\2\2\u0501\u0502\3\2\2\2\u0502"+
		"\u0097\3\2\2\2\u0503\u0504\t\4\2\2\u0504\u0099\3\2\2\2\u0505\u0506\t\5"+
		"\2\2\u0506\u009b\3\2\2\2\u0507\u0508\t\6\2\2\u0508\u009d\3\2\2\2\u0509"+
		"\u050a\t\7\2\2\u050a\u009f\3\2\2\2\u050b\u050c\t\b\2\2\u050c\u00a1\3\2"+
		"\2\2\u050d\u050e\t\t\2\2\u050e\u00a3\3\2\2\2\u050f\u0510\t\n\2\2\u0510"+
		"\u00a5\3\2\2\2\u0511\u0512\t\13\2\2\u0512\u00a7\3\2\2\2\u0513\u0514\t"+
		"\f\2\2\u0514\u00a9\3\2\2\2\u0515\u0516\t\r\2\2\u0516\u00ab\3\2\2\2\u0517"+
		"\u0518\t\16\2\2\u0518\u00ad\3\2\2\2\u0519\u051a\t\17\2\2\u051a\u00af\3"+
		"\2\2\2\u051b\u051c\7\34\2\2\u051c\u051d\7\23\2\2\u051d\u051e\5`\61\2\u051e"+
		"\u051f\7\24\2\2\u051f\u0520\5`\61\2\u0520\u0521\5\u00b2Z\2\u0521\u0532"+
		"\3\2\2\2\u0522\u0523\7\34\2\2\u0523\u0524\7\23\2\2\u0524\u0525\5`\61\2"+
		"\u0525\u0526\7\24\2\2\u0526\u052a\7\4\2\2\u0527\u0529\5F$\2\u0528\u0527"+
		"\3\2\2\2\u0529\u052c\3\2\2\2\u052a\u0528\3\2\2\2\u052a\u052b\3\2\2\2\u052b"+
		"\u052d\3\2\2\2\u052c\u052a\3\2\2\2\u052d\u052e\5`\61\2\u052e\u052f\7\5"+
		"\2\2\u052f\u0530\5\u00b2Z\2\u0530\u0532\3\2\2\2\u0531\u051b\3\2\2\2\u0531"+
		"\u0522\3\2\2\2\u0532\u00b1\3\2\2\2\u0533\u0534\7\35\2\2\u0534\u0541\5"+
		"`\61\2\u0535\u0536\7\35\2\2\u0536\u053a\7\4\2\2\u0537\u0539\5F$\2\u0538"+
		"\u0537\3\2\2\2\u0539\u053c\3\2\2\2\u053a\u0538\3\2\2\2\u053a\u053b\3\2"+
		"\2\2\u053b\u053d\3\2\2\2\u053c\u053a\3\2\2\2\u053d\u053e\5`\61\2\u053e"+
		"\u053f\7\5\2\2\u053f\u0541\3\2\2\2\u0540\u0533\3\2\2\2\u0540\u0535\3\2"+
		"\2\2\u0541\u00b3\3\2\2\2\u0542\u0543\7\36\2\2\u0543\u0547\7\23\2\2\u0544"+
		"\u0545\5.\30\2\u0545\u0546\7\b\2\2\u0546\u0548\3\2\2\2\u0547\u0544\3\2"+
		"\2\2\u0547\u0548\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054a\5`\61\2\u054a"+
		"\u054b\7\24\2\2\u054b\u054f\7\4\2\2\u054c\u054e\5\u00b6\\\2\u054d\u054c"+
		"\3\2\2\2\u054e\u0551\3\2\2\2\u054f\u054d\3\2\2\2\u054f\u0550\3\2\2\2\u0550"+
		"\u0552\3\2\2\2\u0551\u054f\3\2\2\2\u0552\u0553\7\5\2\2\u0553\u00b5\3\2"+
		"\2\2\u0554\u0559\5P)\2\u0555\u0556\7\r\2\2\u0556\u0558\5P)\2\u0557\u0555"+
		"\3\2\2\2\u0558\u055b\3\2\2\2\u0559\u0557\3\2\2\2\u0559\u055a\3\2\2\2\u055a"+
		"\u055c\3\2\2\2\u055b\u0559\3\2\2\2\u055c\u055d\7\37\2\2\u055d\u055e\5"+
		"`\61\2\u055e\u0582\3\2\2\2\u055f\u0564\5P)\2\u0560\u0561\7\r\2\2\u0561"+
		"\u0563\5P)\2\u0562\u0560\3\2\2\2\u0563\u0566\3\2\2\2\u0564\u0562\3\2\2"+
		"\2\u0564\u0565\3\2\2\2\u0565\u0567\3\2\2\2\u0566\u0564\3\2\2\2\u0567\u0568"+
		"\7\37\2\2\u0568\u056c\7\4\2\2\u0569\u056b\5F$\2\u056a\u0569\3\2\2\2\u056b"+
		"\u056e\3\2\2\2\u056c\u056a\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u056f\3\2"+
		"\2\2\u056e\u056c\3\2\2\2\u056f\u0570\5`\61\2\u0570\u0571\7\5\2\2\u0571"+
		"\u0582\3\2\2\2\u0572\u0573\7\35\2\2\u0573\u0574\7\37\2\2\u0574\u0582\5"+
		"`\61\2\u0575\u0576\7\35\2\2\u0576\u0577\7\37\2\2\u0577\u057b\7\4\2\2\u0578"+
		"\u057a\5F$\2\u0579\u0578\3\2\2\2\u057a\u057d\3\2\2\2\u057b\u0579\3\2\2"+
		"\2\u057b\u057c\3\2\2\2\u057c\u057e\3\2\2\2\u057d\u057b\3\2\2\2\u057e\u057f"+
		"\5`\61\2\u057f\u0580\7\5\2\2\u0580\u0582\3\2\2\2\u0581\u0554\3\2\2\2\u0581"+
		"\u055f\3\2\2\2\u0581\u0572\3\2\2\2\u0581\u0575\3\2\2\2\u0582\u00b7\3\2"+
		"\2\2\u0583\u0584\7I\2\2\u0584\u0589\5\u00ba^\2\u0585\u0586\7\r\2\2\u0586"+
		"\u0588\5\u00ba^\2\u0587\u0585\3\2\2\2\u0588\u058b\3\2\2\2\u0589\u0587"+
		"\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058c\3\2\2\2\u058b\u0589\3\2\2\2\u058c"+
		"\u058d\7K\2\2\u058d\u00b9\3\2\2\2\u058e\u0591\7`\2\2\u058f\u0590\7\13"+
		"\2\2\u0590\u0592\5\u00be`\2\u0591\u058f\3\2\2\2\u0591\u0592\3\2\2\2\u0592"+
		"\u00bb\3\2\2\2\u0593\u0594\7I\2\2\u0594\u0599\5\u00be`\2\u0595\u0596\7"+
		"\r\2\2\u0596\u0598\5\u00be`\2\u0597\u0595\3\2\2\2\u0598\u059b\3\2\2\2"+
		"\u0599\u0597\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059c\3\2\2\2\u059b\u0599"+
		"\3\2\2\2\u059c\u059d\7K\2\2\u059d\u00bd\3\2\2\2\u059e\u059f\5\u00c0a\2"+
		"\u059f\u00bf\3\2\2\2\u05a0\u05a5\5\u00c2b\2\u05a1\u05a2\7F\2\2\u05a2\u05a4"+
		"\5\u00c2b\2\u05a3\u05a1\3\2\2\2\u05a4\u05a7\3\2\2\2\u05a5\u05a3\3\2\2"+
		"\2\u05a5\u05a6\3\2\2\2\u05a6\u00c1\3\2\2\2\u05a7\u05a5\3\2\2\2\u05a8\u05ad"+
		"\5\u00c4c\2\u05a9\u05aa\7?\2\2\u05aa\u05ac\5\u00c4c\2\u05ab\u05a9\3\2"+
		"\2\2\u05ac\u05af\3\2\2\2\u05ad\u05ab\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae"+
		"\u00c3\3\2\2\2\u05af\u05ad\3\2\2\2\u05b0\u05b3\7`\2\2\u05b1\u05b2\7\65"+
		"\2\2\u05b2\u05b4\7`\2\2\u05b3\u05b1\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4"+
		"\u05b6\3\2\2\2\u05b5\u05b7\5\u00bc_\2\u05b6\u05b5\3\2\2\2\u05b6\u05b7"+
		"\3\2\2\2\u05b7\u05be\3\2\2\2\u05b8\u05be\5\u00c6d\2\u05b9\u05ba\7\23\2"+
		"\2\u05ba\u05bb\5\u00be`\2\u05bb\u05bc\7\24\2\2\u05bc\u05be\3\2\2\2\u05bd"+
		"\u05b0\3\2\2\2\u05bd\u05b8\3\2\2\2\u05bd\u05b9\3\2\2\2\u05be\u00c5\3\2"+
		"\2\2\u05bf\u05c0\5\u00c8e\2\u05c0\u05c1\7\37\2\2\u05c1\u05c2\5\u00be`"+
		"\2\u05c2\u00c7\3\2\2\2\u05c3\u05c4\7\23\2\2\u05c4\u05d1\7\24\2\2\u05c5"+
		"\u05c6\7\23\2\2\u05c6\u05cb\5\u00be`\2\u05c7\u05c8\7\r\2\2\u05c8\u05ca"+
		"\5\u00be`\2\u05c9\u05c7\3\2\2\2\u05ca\u05cd\3\2\2\2\u05cb\u05c9\3\2\2"+
		"\2\u05cb\u05cc\3\2\2\2\u05cc\u05ce\3\2\2\2\u05cd\u05cb\3\2\2\2\u05ce\u05cf"+
		"\7\24\2\2\u05cf\u05d1\3\2\2\2\u05d0\u05c3\3\2\2\2\u05d0\u05c5\3\2\2\2"+
		"\u05d1\u00c9\3\2\2\2\u00ac\u00cd\u00d6\u00dc\u00ea\u00f1\u00f8\u00ff\u0106"+
		"\u010d\u0114\u011b\u011f\u0127\u0131\u0135\u013b\u013f\u0144\u014b\u0152"+
		"\u0156\u015b\u015e\u0162\u016a\u016d\u0173\u0177\u017c\u0183\u018a\u0191"+
		"\u0197\u019d\u01a5\u01a8\u01ae\u01b6\u01bd\u01c4\u01ca\u01cf\u01d3\u01d8"+
		"\u01df\u01e3\u01eb\u01f0\u01f9\u0200\u0206\u020f\u0214\u0218\u021f\u0226"+
		"\u022b\u0230\u0238\u023b\u023e\u0244\u024a\u024f\u0252\u0258\u025e\u0267"+
		"\u0273\u027c\u0284\u028a\u028f\u0297\u029d\u029f\u02a6\u02ad\u02b7\u02c4"+
		"\u02c9\u02cc\u02d4\u02da\u02e5\u02ea\u02f0\u02f5\u0303\u0308\u0316\u031e"+
		"\u0328\u032d\u032f\u0338\u033c\u0343\u034b\u0355\u0360\u0368\u0376\u037a"+
		"\u0380\u039f\u03a4\u03b4\u03b9\u03c7\u03d0\u03db\u03e3\u03ec\u03f3\u0401"+
		"\u0403\u040b\u0414\u041d\u0426\u042f\u0435\u043f\u0441\u0448\u0452\u0455"+
		"\u045d\u046f\u047f\u0489\u048e\u049d\u04a2\u04aa\u04bc\u04bf\u04c3\u04c9"+
		"\u04d3\u04da\u04df\u04e4\u04e9\u04f1\u04f4\u04fa\u0501\u052a\u0531\u053a"+
		"\u0540\u0547\u054f\u0559\u0564\u056c\u057b\u0581\u0589\u0591\u0599\u05a5"+
		"\u05ad\u05b3\u05b6\u05bd\u05cb\u05d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}