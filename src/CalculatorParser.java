// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, LF=6, WS=7, SZAM=8, OPADD=9, OPMUL=10, 
		OPPWR=11, OPMINMAX=12, MEMORY=13, COMMENT=14;
	public static final int
		RULE_start = 0, RULE_line = 1, RULE_expr = 2, RULE_addop = 3, RULE_mulop = 4, 
		RULE_fct = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "line", "expr", "addop", "mulop", "fct"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'abs'", "','", "'\\n'", null, null, null, 
			null, "'^'", null, "'M'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "LF", "WS", "SZAM", "OPADD", "OPMUL", 
			"OPPWR", "OPMINMAX", "MEMORY", "COMMENT"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private double memorySlot = 0.0;
	    public static void main(String[] args) throws Exception {
	        CalculatorLexer lex = new CalculatorLexer(new ANTLRFileStream(args[0]));
	        CommonTokenStream tokens = new CommonTokenStream (lex);
	        CalculatorParser parser = new CalculatorParser(tokens);
	        parser.start();
	    }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CalculatorParser.EOF, 0); }
		public List<TerminalNode> LF() { return getTokens(CalculatorParser.LF); }
		public TerminalNode LF(int i) {
			return getToken(CalculatorParser.LF, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(CalculatorParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(CalculatorParser.COMMENT, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 29524L) != 0) {
				{
				{
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 13076L) != 0) {
					{
					setState(12);
					line();
					}
				}

				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(15);
					match(COMMENT);
					}
				}

				setState(18);
				match(LF);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
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
	public static class LineContext extends ParserRuleContext {
		public Token MEMORY;
		public ExprContext expr;
		public TerminalNode MEMORY() { return getToken(CalculatorParser.MEMORY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				((LineContext)_localctx).MEMORY = match(MEMORY);
				setState(27);
				match(T__0);
				setState(28);
				((LineContext)_localctx).expr = expr();
				 memorySlot = ((LineContext)_localctx).expr.value; System.out.println((((LineContext)_localctx).MEMORY!=null?((LineContext)_localctx).MEMORY.getText():null) + " = " + ((LineContext)_localctx).expr.value); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				((LineContext)_localctx).expr = expr();
				 System.out.println(((LineContext)_localctx).expr.value); 
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
	public static class ExprContext extends ParserRuleContext {
		public double value;
		public AddopContext fstop;
		public Token OPADD;
		public AddopContext nxtop;
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public List<TerminalNode> OPADD() { return getTokens(CalculatorParser.OPADD); }
		public TerminalNode OPADD(int i) {
			return getToken(CalculatorParser.OPADD, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			((ExprContext)_localctx).fstop = addop();
			 ((ExprContext)_localctx).value =  ((ExprContext)_localctx).fstop.value; 
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPADD) {
				{
				{
				setState(38);
				((ExprContext)_localctx).OPADD = match(OPADD);
				setState(39);
				((ExprContext)_localctx).nxtop = addop();
				 if ("+".equals((((ExprContext)_localctx).OPADD!=null?((ExprContext)_localctx).OPADD.getText():null))) _localctx.value += ((ExprContext)_localctx).nxtop.value; else _localctx.value -= ((ExprContext)_localctx).nxtop.value; 
				}
				}
				setState(46);
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
	public static class AddopContext extends ParserRuleContext {
		public double value;
		public MulopContext fstop;
		public Token OPMUL;
		public MulopContext nxtop;
		public List<MulopContext> mulop() {
			return getRuleContexts(MulopContext.class);
		}
		public MulopContext mulop(int i) {
			return getRuleContext(MulopContext.class,i);
		}
		public List<TerminalNode> OPMUL() { return getTokens(CalculatorParser.OPMUL); }
		public TerminalNode OPMUL(int i) {
			return getToken(CalculatorParser.OPMUL, i);
		}
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitAddop(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			((AddopContext)_localctx).fstop = mulop();
			 ((AddopContext)_localctx).value =  ((AddopContext)_localctx).fstop.value; 
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPMUL) {
				{
				{
				setState(49);
				((AddopContext)_localctx).OPMUL = match(OPMUL);
				setState(50);
				((AddopContext)_localctx).nxtop = mulop();
				 if ("*".equals((((AddopContext)_localctx).OPMUL!=null?((AddopContext)_localctx).OPMUL.getText():null))) _localctx.value *= ((AddopContext)_localctx).nxtop.value; else _localctx.value /= ((AddopContext)_localctx).nxtop.value; 
				}
				}
				setState(57);
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
	public static class MulopContext extends ParserRuleContext {
		public double value;
		public FctContext fstop;
		public MulopContext nxtop;
		public FctContext fct() {
			return getRuleContext(FctContext.class,0);
		}
		public TerminalNode OPPWR() { return getToken(CalculatorParser.OPPWR, 0); }
		public MulopContext mulop() {
			return getRuleContext(MulopContext.class,0);
		}
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitMulop(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			((MulopContext)_localctx).fstop = fct();
			 ((MulopContext)_localctx).value =  ((MulopContext)_localctx).fstop.value; 
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPPWR) {
				{
				setState(60);
				match(OPPWR);
				setState(61);
				((MulopContext)_localctx).nxtop = mulop();
				 ((MulopContext)_localctx).value =  Math.pow(_localctx.value, ((MulopContext)_localctx).nxtop.value); 
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
	public static class FctContext extends ParserRuleContext {
		public double value;
		public Token SZAM;
		public ExprContext expr;
		public ExprContext fstop;
		public ExprContext nxtop;
		public Token OPADD;
		public FctContext fct;
		public TerminalNode SZAM() { return getToken(CalculatorParser.SZAM, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPMINMAX() { return getToken(CalculatorParser.OPMINMAX, 0); }
		public TerminalNode OPADD() { return getToken(CalculatorParser.OPADD, 0); }
		public FctContext fct() {
			return getRuleContext(FctContext.class,0);
		}
		public TerminalNode MEMORY() { return getToken(CalculatorParser.MEMORY, 0); }
		public FctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFct(this);
		}
	}

	public final FctContext fct() throws RecognitionException {
		FctContext _localctx = new FctContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fct);
		int _la;
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SZAM:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				((FctContext)_localctx).SZAM = match(SZAM);
				 ((FctContext)_localctx).value =  Double.parseDouble((((FctContext)_localctx).SZAM!=null?((FctContext)_localctx).SZAM.getText():null)); 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(T__1);
				setState(69);
				((FctContext)_localctx).expr = expr();
				setState(70);
				match(T__2);
				 ((FctContext)_localctx).value =  ((FctContext)_localctx).expr.value; 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				match(T__3);
				setState(74);
				match(T__1);
				setState(75);
				((FctContext)_localctx).expr = expr();
				setState(76);
				match(T__2);
				 ((FctContext)_localctx).value =  Math.abs(((FctContext)_localctx).expr.value); 
				}
				break;
			case OPMINMAX:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(OPMINMAX);
				setState(80);
				match(T__1);
				setState(81);
				((FctContext)_localctx).fstop = expr();
				 ((FctContext)_localctx).value =  ((FctContext)_localctx).fstop.value; 
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(83);
					match(T__4);
					setState(84);
					((FctContext)_localctx).nxtop = expr();

					        if ("min".equals(OPMINMAX) && ((FctContext)_localctx).nxtop.value < _localctx.value) ((FctContext)_localctx).value =  ((FctContext)_localctx).nxtop.value;
					        else if ("max".equals(OPMINMAX) && ((FctContext)_localctx).nxtop.value > _localctx.value) ((FctContext)_localctx).value =  ((FctContext)_localctx).nxtop.value;
					    
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				match(T__2);
				}
				break;
			case OPADD:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				((FctContext)_localctx).OPADD = match(OPADD);
				setState(95);
				((FctContext)_localctx).fct = fct();
				 ((FctContext)_localctx).value =  "-".equals((((FctContext)_localctx).OPADD!=null?((FctContext)_localctx).OPADD.getText():null)) ? -((FctContext)_localctx).fct.value : ((FctContext)_localctx).fct.value; 
				}
				break;
			case MEMORY:
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				match(MEMORY);
				 ((FctContext)_localctx).value =  memorySlot; 
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

	public static final String _serializedATN =
		"\u0004\u0001\u000eg\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0003\u0000\u000e\b\u0000\u0001\u0000\u0003"+
		"\u0000\u0011\b\u0000\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000"+
		"\u0017\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"#\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002+\b\u0002\n\u0002\f\u0002.\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"6\b\u0003\n\u0003\f\u00039\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004A\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005X\b\u0005\n\u0005\f\u0005[\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005e\b\u0005\u0001\u0005\u0000\u0000"+
		"\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0000m\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u0004$\u0001\u0000\u0000"+
		"\u0000\u0006/\u0001\u0000\u0000\u0000\b:\u0001\u0000\u0000\u0000\nd\u0001"+
		"\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000"+
		"\u000f\u0011\u0005\u000e\u0000\u0000\u0010\u000f\u0001\u0000\u0000\u0000"+
		"\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000"+
		"\u0012\u0014\u0005\u0006\u0000\u0000\u0013\r\u0001\u0000\u0000\u0000\u0014"+
		"\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015"+
		"\u0016\u0001\u0000\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017"+
		"\u0015\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0000\u0000\u0001\u0019"+
		"\u0001\u0001\u0000\u0000\u0000\u001a\u001b\u0005\r\u0000\u0000\u001b\u001c"+
		"\u0005\u0001\u0000\u0000\u001c\u001d\u0003\u0004\u0002\u0000\u001d\u001e"+
		"\u0006\u0001\uffff\uffff\u0000\u001e#\u0001\u0000\u0000\u0000\u001f \u0003"+
		"\u0004\u0002\u0000 !\u0006\u0001\uffff\uffff\u0000!#\u0001\u0000\u0000"+
		"\u0000\"\u001a\u0001\u0000\u0000\u0000\"\u001f\u0001\u0000\u0000\u0000"+
		"#\u0003\u0001\u0000\u0000\u0000$%\u0003\u0006\u0003\u0000%,\u0006\u0002"+
		"\uffff\uffff\u0000&\'\u0005\t\u0000\u0000\'(\u0003\u0006\u0003\u0000("+
		")\u0006\u0002\uffff\uffff\u0000)+\u0001\u0000\u0000\u0000*&\u0001\u0000"+
		"\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-\u0005\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000/0\u0003\b\u0004\u000007\u0006\u0003\uffff\uffff\u000012\u0005\n"+
		"\u0000\u000023\u0003\b\u0004\u000034\u0006\u0003\uffff\uffff\u000046\u0001"+
		"\u0000\u0000\u000051\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u0007\u0001\u0000"+
		"\u0000\u000097\u0001\u0000\u0000\u0000:;\u0003\n\u0005\u0000;@\u0006\u0004"+
		"\uffff\uffff\u0000<=\u0005\u000b\u0000\u0000=>\u0003\b\u0004\u0000>?\u0006"+
		"\u0004\uffff\uffff\u0000?A\u0001\u0000\u0000\u0000@<\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000A\t\u0001\u0000\u0000\u0000BC\u0005\b"+
		"\u0000\u0000Ce\u0006\u0005\uffff\uffff\u0000DE\u0005\u0002\u0000\u0000"+
		"EF\u0003\u0004\u0002\u0000FG\u0005\u0003\u0000\u0000GH\u0006\u0005\uffff"+
		"\uffff\u0000He\u0001\u0000\u0000\u0000IJ\u0005\u0004\u0000\u0000JK\u0005"+
		"\u0002\u0000\u0000KL\u0003\u0004\u0002\u0000LM\u0005\u0003\u0000\u0000"+
		"MN\u0006\u0005\uffff\uffff\u0000Ne\u0001\u0000\u0000\u0000OP\u0005\f\u0000"+
		"\u0000PQ\u0005\u0002\u0000\u0000QR\u0003\u0004\u0002\u0000RY\u0006\u0005"+
		"\uffff\uffff\u0000ST\u0005\u0005\u0000\u0000TU\u0003\u0004\u0002\u0000"+
		"UV\u0006\u0005\uffff\uffff\u0000VX\u0001\u0000\u0000\u0000WS\u0001\u0000"+
		"\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"\\]\u0005\u0003\u0000\u0000]e\u0001\u0000\u0000\u0000^_\u0005\t\u0000"+
		"\u0000_`\u0003\n\u0005\u0000`a\u0006\u0005\uffff\uffff\u0000ae\u0001\u0000"+
		"\u0000\u0000bc\u0005\r\u0000\u0000ce\u0006\u0005\uffff\uffff\u0000dB\u0001"+
		"\u0000\u0000\u0000dD\u0001\u0000\u0000\u0000dI\u0001\u0000\u0000\u0000"+
		"dO\u0001\u0000\u0000\u0000d^\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000e\u000b\u0001\u0000\u0000\u0000\t\r\u0010\u0015\",7@Yd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}