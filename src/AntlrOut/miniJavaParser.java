// Generated from C:/DATEN/Git/Compilerbau/src/AntlrSrc\miniJava.g4 by ANTLR 4.12.0
package AntlrOut;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;


@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class miniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, BOOLEAN=42, CHAR=43, STRING=44, INT=45, 
		ID=46, WS=47;
	public static final int
		RULE_program = 0, RULE_classDeclaration = 1, RULE_constructorDecl = 2, 
		RULE_field = 3, RULE_method = 4, RULE_paramList = 5, RULE_param = 6, RULE_block = 7, 
		RULE_statement = 8, RULE_ifStatement = 9, RULE_whileStatement = 10, RULE_forStatement = 11, 
		RULE_initialization = 12, RULE_returnStatement = 13, RULE_condition = 14, 
		RULE_iteration = 15, RULE_localVarDecl = 16, RULE_stmtExpr = 17, RULE_incrementExpr = 18, 
		RULE_decrementExpr = 19, RULE_pointableExpr = 20, RULE_expr = 21, RULE_methodCall = 22, 
		RULE_exprList = 23, RULE_binaryOp = 24, RULE_type = 25, RULE_accessModifier = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDeclaration", "constructorDecl", "field", "method", 
			"paramList", "param", "block", "statement", "ifStatement", "whileStatement", 
			"forStatement", "initialization", "returnStatement", "condition", "iteration", 
			"localVarDecl", "stmtExpr", "incrementExpr", "decrementExpr", "pointableExpr", 
			"expr", "methodCall", "exprList", "binaryOp", "type", "accessModifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'('", "')'", "'='", "';'", "'void'", 
			"','", "'if'", "'else'", "'while'", "'for'", "'return'", "'new'", "'++'", 
			"'--'", "'this'", "'super'", "'.'", "'-'", "'!'", "'null'", "'+'", "'*'", 
			"'/'", "'%'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'&&'", "'||'", 
			"'int'", "'boolean'", "'char'", "'public'", "'private'", "'protected'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "BOOLEAN", "CHAR", "STRING", "INT", 
			"ID", "WS"
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
	public String getGrammarFileName() { return "miniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(miniJavaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697218L) != 0)) {
				{
				{
				setState(54);
				classDeclaration();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miniJavaParser.ID, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<ConstructorDeclContext> constructorDecl() {
			return getRuleContexts(ConstructorDeclContext.class);
		}
		public ConstructorDeclContext constructorDecl(int i) {
			return getRuleContext(ConstructorDeclContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) {
				{
				setState(62);
				accessModifier();
				}
			}

			setState(65);
			match(T__0);
			setState(66);
			match(ID);
			setState(67);
			match(T__1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					field();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					constructorDecl();
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 74698071212288L) != 0)) {
				{
				{
				setState(80);
				method();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miniJavaParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ConstructorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterConstructorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitConstructorDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitConstructorDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclContext constructorDecl() throws RecognitionException {
		ConstructorDeclContext _localctx = new ConstructorDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constructorDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) {
				{
				setState(88);
				accessModifier();
				}
			}

			setState(91);
			match(ID);
			setState(92);
			match(T__3);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70849780514816L) != 0)) {
				{
				setState(93);
				paramList();
				}
			}

			setState(96);
			match(T__4);
			setState(97);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(miniJavaParser.ID, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) {
				{
				setState(99);
				accessModifier();
				}
			}

			setState(102);
			type();
			setState(103);
			match(ID);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(104);
				match(T__5);
				setState(105);
				expr(0);
				}
			}

			setState(108);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miniJavaParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) {
				{
				setState(110);
				accessModifier();
				}
			}

			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
			case ID:
				{
				setState(113);
				type();
				}
				break;
			case T__7:
				{
				setState(114);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(117);
			match(ID);
			setState(118);
			match(T__3);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70849780514816L) != 0)) {
				{
				setState(119);
				paramList();
				}
			}

			setState(122);
			match(T__4);
			setState(123);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			param();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(126);
				match(T__8);
				setState(127);
				param();
				}
				}
				setState(132);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(miniJavaParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			type();
			setState(134);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__1);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70849781560324L) != 0)) {
				{
				{
				setState(137);
				statement();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public LocalVarDeclContext localVarDecl() {
			return getRuleContext(LocalVarDeclContext.class,0);
		}
		public StmtExprContext stmtExpr() {
			return getRuleContext(StmtExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				localVarDecl();
				setState(146);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				stmtExpr();
				setState(149);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				returnStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
				methodCall();
				setState(157);
				match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__9);
			setState(162);
			match(T__3);
			setState(163);
			condition();
			setState(164);
			match(T__4);
			setState(165);
			block();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(166);
				match(T__10);
				setState(167);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__11);
			setState(171);
			match(T__3);
			setState(172);
			condition();
			setState(173);
			match(T__4);
			setState(174);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IterationContext iteration() {
			return getRuleContext(IterationContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__12);
			setState(177);
			match(T__3);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70849780514816L) != 0)) {
				{
				setState(178);
				initialization();
				}
			}

			setState(181);
			match(T__6);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 136339457343504L) != 0)) {
				{
				setState(182);
				condition();
				}
			}

			setState(185);
			match(T__6);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70368745193472L) != 0)) {
				{
				setState(186);
				iteration();
				}
			}

			setState(189);
			match(T__4);
			setState(190);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(miniJavaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_initialization);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				type();
				setState(193);
				match(ID);
				setState(194);
				match(T__5);
				setState(195);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(ID);
				setState(198);
				match(T__5);
				setState(199);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__13);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 136339457343504L) != 0)) {
				{
				setState(203);
				expr(0);
				}
			}

			setState(206);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IterationContext extends ParserRuleContext {
		public StmtExprContext stmtExpr() {
			return getRuleContext(StmtExprContext.class,0);
		}
		public IterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitIteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitIteration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationContext iteration() throws RecognitionException {
		IterationContext _localctx = new IterationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_iteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			stmtExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(miniJavaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LocalVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVarDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterLocalVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitLocalVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitLocalVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVarDeclContext localVarDecl() throws RecognitionException {
		LocalVarDeclContext _localctx = new LocalVarDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_localVarDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			type();
			setState(213);
			match(ID);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(214);
				match(T__5);
				setState(215);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miniJavaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public IncrementExprContext incrementExpr() {
			return getRuleContext(IncrementExprContext.class,0);
		}
		public DecrementExprContext decrementExpr() {
			return getRuleContext(DecrementExprContext.class,0);
		}
		public StmtExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterStmtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitStmtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitStmtExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtExprContext stmtExpr() throws RecognitionException {
		StmtExprContext _localctx = new StmtExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stmtExpr);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(ID);
				setState(219);
				match(T__5);
				setState(220);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(T__14);
				setState(222);
				match(ID);
				setState(223);
				match(T__3);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 136339457343504L) != 0)) {
					{
					setState(224);
					exprList();
					}
				}

				setState(227);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				methodCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				incrementExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				decrementExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncrementExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miniJavaParser.ID, 0); }
		public IncrementExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterIncrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitIncrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitIncrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementExprContext incrementExpr() throws RecognitionException {
		IncrementExprContext _localctx = new IncrementExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_incrementExpr);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(T__15);
				setState(234);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(ID);
				setState(236);
				match(T__15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecrementExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miniJavaParser.ID, 0); }
		public DecrementExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrementExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterDecrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitDecrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitDecrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementExprContext decrementExpr() throws RecognitionException {
		DecrementExprContext _localctx = new DecrementExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_decrementExpr);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(T__16);
				setState(240);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(ID);
				setState(242);
				match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PointableExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miniJavaParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public PointableExprContext pointableExpr() {
			return getRuleContext(PointableExprContext.class,0);
		}
		public PointableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointableExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterPointableExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitPointableExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitPointableExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointableExprContext pointableExpr() throws RecognitionException {
		return pointableExpr(0);
	}

	private PointableExprContext pointableExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PointableExprContext _localctx = new PointableExprContext(_ctx, _parentState);
		PointableExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_pointableExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				{
				setState(246);
				match(T__17);
				}
				break;
			case T__18:
				{
				setState(247);
				match(T__18);
				}
				break;
			case ID:
				{
				setState(248);
				match(ID);
				}
				break;
			case T__14:
				{
				setState(249);
				match(T__14);
				setState(250);
				match(ID);
				setState(251);
				match(T__3);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 136339457343504L) != 0)) {
					{
					setState(252);
					exprList();
					}
				}

				setState(255);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new PointableExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pointableExpr);
						setState(258);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(259);
						match(T__19);
						setState(260);
						match(ID);
						}
						break;
					case 2:
						{
						_localctx = new PointableExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pointableExpr);
						setState(261);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(262);
						match(T__19);
						setState(263);
						match(ID);
						setState(264);
						match(T__3);
						setState(266);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 136339457343504L) != 0)) {
							{
							setState(265);
							exprList();
							}
						}

						setState(268);
						match(T__4);
						}
						break;
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public PointableExprContext pointableExpr() {
			return getRuleContext(PointableExprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(miniJavaParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(miniJavaParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(miniJavaParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(miniJavaParser.STRING, 0); }
		public BinaryOpContext binaryOp() {
			return getRuleContext(BinaryOpContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__17:
			case T__18:
			case ID:
				{
				setState(275);
				pointableExpr(0);
				}
				break;
			case T__20:
				{
				setState(276);
				match(T__20);
				setState(277);
				expr(8);
				}
				break;
			case T__21:
				{
				setState(278);
				match(T__21);
				setState(279);
				expr(7);
				}
				break;
			case T__3:
				{
				setState(280);
				match(T__3);
				setState(281);
				expr(0);
				setState(282);
				match(T__4);
				}
				break;
			case INT:
				{
				setState(284);
				match(INT);
				}
				break;
			case BOOLEAN:
				{
				setState(285);
				match(BOOLEAN);
				}
				break;
			case CHAR:
				{
				setState(286);
				match(CHAR);
				}
				break;
			case STRING:
				{
				setState(287);
				match(STRING);
				}
				break;
			case T__22:
				{
				setState(288);
				match(T__22);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(291);
					if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
					setState(292);
					binaryOp();
					setState(293);
					expr(11);
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miniJavaParser.ID, 0); }
		public List<PointableExprContext> pointableExpr() {
			return getRuleContexts(PointableExprContext.class);
		}
		public PointableExprContext pointableExpr(int i) {
			return getRuleContext(PointableExprContext.class,i);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(300);
					pointableExpr(0);
					setState(301);
					match(T__19);
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(308);
			match(ID);
			setState(309);
			match(T__3);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 136339457343504L) != 0)) {
				{
				setState(310);
				exprList();
				}
			}

			setState(313);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			expr(0);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(316);
				match(T__8);
				setState(317);
				expr(0);
				}
				}
				setState(322);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryOpContext extends ParserRuleContext {
		public BinaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterBinaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitBinaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitBinaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOpContext binaryOp() throws RecognitionException {
		BinaryOpContext _localctx = new BinaryOpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_binaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 68704796672L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(miniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(miniJavaParser.ID, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_type);
		try {
			int _alt;
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(T__35);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(T__36);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				match(T__35);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				match(T__37);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(329);
				match(ID);
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(330);
						match(T__19);
						setState(331);
						match(ID);
						}
						} 
					}
					setState(336);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccessModifierContext extends ParserRuleContext {
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniJavaVisitor ) return ((miniJavaVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return pointableExpr_sempred((PointableExprContext)_localctx, predIndex);
		case 21:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean pointableExpr_sempred(PointableExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u0156\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0005\u0000"+
		"8\b\u0000\n\u0000\f\u0000;\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0003\u0001@\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001F\b\u0001\n\u0001\f\u0001I\t\u0001\u0001\u0001\u0005\u0001"+
		"L\b\u0001\n\u0001\f\u0001O\t\u0001\u0001\u0001\u0005\u0001R\b\u0001\n"+
		"\u0001\f\u0001U\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0003\u0002"+
		"Z\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002_\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u0003e\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003k\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0003\u0004p\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004t\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004y\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u0081\b\u0005\n\u0005\f\u0005\u0084\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u008b\b\u0007\n\u0007\f\u0007\u008e\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a0\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a9\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00b4\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00b8\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00bc\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u00c9\b\f\u0001\r\u0001\r\u0003\r\u00cd\b\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00d9\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00e2"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00e8"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ee"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00f4"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00fe\b\u0014\u0001\u0014\u0003"+
		"\u0014\u0101\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u010b\b\u0014\u0001"+
		"\u0014\u0005\u0014\u010e\b\u0014\n\u0014\f\u0014\u0111\t\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0122\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u0128\b\u0015\n\u0015\f\u0015\u012b"+
		"\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0130\b\u0016"+
		"\n\u0016\f\u0016\u0133\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0138\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u013f\b\u0017\n\u0017\f\u0017\u0142\t\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u014d\b\u0019\n\u0019\f\u0019\u0150"+
		"\t\u0019\u0003\u0019\u0152\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0002\u0131\u014e\u0002(*\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0002\u0002"+
		"\u0000\u0015\u0015\u0018#\u0001\u0000\')\u0175\u00009\u0001\u0000\u0000"+
		"\u0000\u0002?\u0001\u0000\u0000\u0000\u0004Y\u0001\u0000\u0000\u0000\u0006"+
		"d\u0001\u0000\u0000\u0000\bo\u0001\u0000\u0000\u0000\n}\u0001\u0000\u0000"+
		"\u0000\f\u0085\u0001\u0000\u0000\u0000\u000e\u0088\u0001\u0000\u0000\u0000"+
		"\u0010\u009f\u0001\u0000\u0000\u0000\u0012\u00a1\u0001\u0000\u0000\u0000"+
		"\u0014\u00aa\u0001\u0000\u0000\u0000\u0016\u00b0\u0001\u0000\u0000\u0000"+
		"\u0018\u00c8\u0001\u0000\u0000\u0000\u001a\u00ca\u0001\u0000\u0000\u0000"+
		"\u001c\u00d0\u0001\u0000\u0000\u0000\u001e\u00d2\u0001\u0000\u0000\u0000"+
		" \u00d4\u0001\u0000\u0000\u0000\"\u00e7\u0001\u0000\u0000\u0000$\u00ed"+
		"\u0001\u0000\u0000\u0000&\u00f3\u0001\u0000\u0000\u0000(\u0100\u0001\u0000"+
		"\u0000\u0000*\u0121\u0001\u0000\u0000\u0000,\u0131\u0001\u0000\u0000\u0000"+
		".\u013b\u0001\u0000\u0000\u00000\u0143\u0001\u0000\u0000\u00002\u0151"+
		"\u0001\u0000\u0000\u00004\u0153\u0001\u0000\u0000\u000068\u0003\u0002"+
		"\u0001\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000<=\u0005\u0000\u0000\u0001=\u0001\u0001\u0000"+
		"\u0000\u0000>@\u00034\u001a\u0000?>\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0005\u0001\u0000\u0000BC\u0005"+
		".\u0000\u0000CG\u0005\u0002\u0000\u0000DF\u0003\u0006\u0003\u0000ED\u0001"+
		"\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HM\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000JL\u0003\u0004\u0002\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NS\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PR\u0003\b\u0004\u0000QP\u0001"+
		"\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000VW\u0005\u0003\u0000\u0000W\u0003\u0001\u0000\u0000\u0000XZ\u0003"+
		"4\u001a\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[\\\u0005.\u0000\u0000\\^\u0005\u0004\u0000\u0000]_"+
		"\u0003\n\u0005\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`a\u0005\u0005\u0000\u0000ab\u0003\u000e\u0007"+
		"\u0000b\u0005\u0001\u0000\u0000\u0000ce\u00034\u001a\u0000dc\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0003"+
		"2\u0019\u0000gj\u0005.\u0000\u0000hi\u0005\u0006\u0000\u0000ik\u0003*"+
		"\u0015\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lm\u0005\u0007\u0000\u0000m\u0007\u0001\u0000\u0000"+
		"\u0000np\u00034\u001a\u0000on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000ps\u0001\u0000\u0000\u0000qt\u00032\u0019\u0000rt\u0005\b\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000uv\u0005.\u0000\u0000vx\u0005\u0004\u0000\u0000wy\u0003\n"+
		"\u0005\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z{\u0005\u0005\u0000\u0000{|\u0003\u000e\u0007\u0000"+
		"|\t\u0001\u0000\u0000\u0000}\u0082\u0003\f\u0006\u0000~\u007f\u0005\t"+
		"\u0000\u0000\u007f\u0081\u0003\f\u0006\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u000b\u0001\u0000\u0000"+
		"\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0086\u00032\u0019\u0000"+
		"\u0086\u0087\u0005.\u0000\u0000\u0087\r\u0001\u0000\u0000\u0000\u0088"+
		"\u008c\u0005\u0002\u0000\u0000\u0089\u008b\u0003\u0010\b\u0000\u008a\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005\u0003\u0000\u0000\u0090\u000f\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0003 \u0010\u0000\u0092\u0093\u0005\u0007\u0000\u0000\u0093\u00a0\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0003\"\u0011\u0000\u0095\u0096\u0005\u0007"+
		"\u0000\u0000\u0096\u00a0\u0001\u0000\u0000\u0000\u0097\u00a0\u0003\u000e"+
		"\u0007\u0000\u0098\u00a0\u0003\u0012\t\u0000\u0099\u00a0\u0003\u0014\n"+
		"\u0000\u009a\u00a0\u0003\u0016\u000b\u0000\u009b\u00a0\u0003\u001a\r\u0000"+
		"\u009c\u009d\u0003,\u0016\u0000\u009d\u009e\u0005\u0007\u0000\u0000\u009e"+
		"\u00a0\u0001\u0000\u0000\u0000\u009f\u0091\u0001\u0000\u0000\u0000\u009f"+
		"\u0094\u0001\u0000\u0000\u0000\u009f\u0097\u0001\u0000\u0000\u0000\u009f"+
		"\u0098\u0001\u0000\u0000\u0000\u009f\u0099\u0001\u0000\u0000\u0000\u009f"+
		"\u009a\u0001\u0000\u0000\u0000\u009f\u009b\u0001\u0000\u0000\u0000\u009f"+
		"\u009c\u0001\u0000\u0000\u0000\u00a0\u0011\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0005\n\u0000\u0000\u00a2\u00a3\u0005\u0004\u0000\u0000\u00a3\u00a4"+
		"\u0003\u001c\u000e\u0000\u00a4\u00a5\u0005\u0005\u0000\u0000\u00a5\u00a8"+
		"\u0003\u000e\u0007\u0000\u00a6\u00a7\u0005\u000b\u0000\u0000\u00a7\u00a9"+
		"\u0003\u000e\u0007\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u0013\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0005\f\u0000\u0000\u00ab\u00ac\u0005\u0004\u0000\u0000\u00ac\u00ad\u0003"+
		"\u001c\u000e\u0000\u00ad\u00ae\u0005\u0005\u0000\u0000\u00ae\u00af\u0003"+
		"\u000e\u0007\u0000\u00af\u0015\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005"+
		"\r\u0000\u0000\u00b1\u00b3\u0005\u0004\u0000\u0000\u00b2\u00b4\u0003\u0018"+
		"\f\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0005\u0007\u0000"+
		"\u0000\u00b6\u00b8\u0003\u001c\u000e\u0000\u00b7\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\u00bb\u0005\u0007\u0000\u0000\u00ba\u00bc\u0003\u001e\u000f"+
		"\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0005\u0000"+
		"\u0000\u00be\u00bf\u0003\u000e\u0007\u0000\u00bf\u0017\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u00032\u0019\u0000\u00c1\u00c2\u0005.\u0000\u0000\u00c2"+
		"\u00c3\u0005\u0006\u0000\u0000\u00c3\u00c4\u0003*\u0015\u0000\u00c4\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005.\u0000\u0000\u00c6\u00c7\u0005"+
		"\u0006\u0000\u0000\u00c7\u00c9\u0003*\u0015\u0000\u00c8\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c9\u0019\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cc\u0005\u000e\u0000\u0000\u00cb\u00cd\u0003*\u0015"+
		"\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0007\u0000"+
		"\u0000\u00cf\u001b\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003*\u0015\u0000"+
		"\u00d1\u001d\u0001\u0000\u0000\u0000\u00d2\u00d3\u0003\"\u0011\u0000\u00d3"+
		"\u001f\u0001\u0000\u0000\u0000\u00d4\u00d5\u00032\u0019\u0000\u00d5\u00d8"+
		"\u0005.\u0000\u0000\u00d6\u00d7\u0005\u0006\u0000\u0000\u00d7\u00d9\u0003"+
		"*\u0015\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d9!\u0001\u0000\u0000\u0000\u00da\u00db\u0005.\u0000\u0000"+
		"\u00db\u00dc\u0005\u0006\u0000\u0000\u00dc\u00e8\u0003*\u0015\u0000\u00dd"+
		"\u00de\u0005\u000f\u0000\u0000\u00de\u00df\u0005.\u0000\u0000\u00df\u00e1"+
		"\u0005\u0004\u0000\u0000\u00e0\u00e2\u0003.\u0017\u0000\u00e1\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e8\u0005\u0005\u0000\u0000\u00e4\u00e8\u0003"+
		",\u0016\u0000\u00e5\u00e8\u0003$\u0012\u0000\u00e6\u00e8\u0003&\u0013"+
		"\u0000\u00e7\u00da\u0001\u0000\u0000\u0000\u00e7\u00dd\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8#\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0005\u0010\u0000\u0000\u00ea\u00ee\u0005.\u0000\u0000\u00eb"+
		"\u00ec\u0005.\u0000\u0000\u00ec\u00ee\u0005\u0010\u0000\u0000\u00ed\u00e9"+
		"\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee%\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0005\u0011\u0000\u0000\u00f0\u00f4\u0005"+
		".\u0000\u0000\u00f1\u00f2\u0005.\u0000\u0000\u00f2\u00f4\u0005\u0011\u0000"+
		"\u0000\u00f3\u00ef\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f4\'\u0001\u0000\u0000\u0000\u00f5\u00f6\u0006\u0014\uffff\uffff"+
		"\u0000\u00f6\u0101\u0005\u0012\u0000\u0000\u00f7\u0101\u0005\u0013\u0000"+
		"\u0000\u00f8\u0101\u0005.\u0000\u0000\u00f9\u00fa\u0005\u000f\u0000\u0000"+
		"\u00fa\u00fb\u0005.\u0000\u0000\u00fb\u00fd\u0005\u0004\u0000\u0000\u00fc"+
		"\u00fe\u0003.\u0017\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0101"+
		"\u0005\u0005\u0000\u0000\u0100\u00f5\u0001\u0000\u0000\u0000\u0100\u00f7"+
		"\u0001\u0000\u0000\u0000\u0100\u00f8\u0001\u0000\u0000\u0000\u0100\u00f9"+
		"\u0001\u0000\u0000\u0000\u0101\u010f\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\n\u0003\u0000\u0000\u0103\u0104\u0005\u0014\u0000\u0000\u0104\u010e\u0005"+
		".\u0000\u0000\u0105\u0106\n\u0002\u0000\u0000\u0106\u0107\u0005\u0014"+
		"\u0000\u0000\u0107\u0108\u0005.\u0000\u0000\u0108\u010a\u0005\u0004\u0000"+
		"\u0000\u0109\u010b\u0003.\u0017\u0000\u010a\u0109\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000"+
		"\u010c\u010e\u0005\u0005\u0000\u0000\u010d\u0102\u0001\u0000\u0000\u0000"+
		"\u010d\u0105\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000"+
		"\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000"+
		"\u0110)\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0006\u0015\uffff\uffff\u0000\u0113\u0122\u0003(\u0014\u0000\u0114"+
		"\u0115\u0005\u0015\u0000\u0000\u0115\u0122\u0003*\u0015\b\u0116\u0117"+
		"\u0005\u0016\u0000\u0000\u0117\u0122\u0003*\u0015\u0007\u0118\u0119\u0005"+
		"\u0004\u0000\u0000\u0119\u011a\u0003*\u0015\u0000\u011a\u011b\u0005\u0005"+
		"\u0000\u0000\u011b\u0122\u0001\u0000\u0000\u0000\u011c\u0122\u0005-\u0000"+
		"\u0000\u011d\u0122\u0005*\u0000\u0000\u011e\u0122\u0005+\u0000\u0000\u011f"+
		"\u0122\u0005,\u0000\u0000\u0120\u0122\u0005\u0017\u0000\u0000\u0121\u0112"+
		"\u0001\u0000\u0000\u0000\u0121\u0114\u0001\u0000\u0000\u0000\u0121\u0116"+
		"\u0001\u0000\u0000\u0000\u0121\u0118\u0001\u0000\u0000\u0000\u0121\u011c"+
		"\u0001\u0000\u0000\u0000\u0121\u011d\u0001\u0000\u0000\u0000\u0121\u011e"+
		"\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0120"+
		"\u0001\u0000\u0000\u0000\u0122\u0129\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\n\n\u0000\u0000\u0124\u0125\u00030\u0018\u0000\u0125\u0126\u0003*\u0015"+
		"\u000b\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0123\u0001\u0000\u0000"+
		"\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a+\u0001\u0000\u0000\u0000"+
		"\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u012d\u0003(\u0014\u0000\u012d"+
		"\u012e\u0005\u0014\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f"+
		"\u012c\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131"+
		"\u0132\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132"+
		"\u0134\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u0005.\u0000\u0000\u0135\u0137\u0005\u0004\u0000\u0000\u0136\u0138"+
		"\u0003.\u0017\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0137\u0138\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013a\u0005"+
		"\u0005\u0000\u0000\u013a-\u0001\u0000\u0000\u0000\u013b\u0140\u0003*\u0015"+
		"\u0000\u013c\u013d\u0005\t\u0000\u0000\u013d\u013f\u0003*\u0015\u0000"+
		"\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000"+
		"\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000"+
		"\u0141/\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0007\u0000\u0000\u0000\u01441\u0001\u0000\u0000\u0000\u0145\u0152"+
		"\u0005$\u0000\u0000\u0146\u0152\u0005%\u0000\u0000\u0147\u0152\u0005$"+
		"\u0000\u0000\u0148\u0152\u0005&\u0000\u0000\u0149\u014e\u0005.\u0000\u0000"+
		"\u014a\u014b\u0005\u0014\u0000\u0000\u014b\u014d\u0005.\u0000\u0000\u014c"+
		"\u014a\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f"+
		"\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151"+
		"\u0145\u0001\u0000\u0000\u0000\u0151\u0146\u0001\u0000\u0000\u0000\u0151"+
		"\u0147\u0001\u0000\u0000\u0000\u0151\u0148\u0001\u0000\u0000\u0000\u0151"+
		"\u0149\u0001\u0000\u0000\u0000\u01523\u0001\u0000\u0000\u0000\u0153\u0154"+
		"\u0007\u0001\u0000\u0000\u01545\u0001\u0000\u0000\u0000&9?GMSY^djosx\u0082"+
		"\u008c\u009f\u00a8\u00b3\u00b7\u00bb\u00c8\u00cc\u00d8\u00e1\u00e7\u00ed"+
		"\u00f3\u00fd\u0100\u010a\u010d\u010f\u0121\u0129\u0131\u0137\u0140\u014e"+
		"\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}