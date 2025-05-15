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
public class PolynomCalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		POLINOM_KULCSSZO=10, VALTOZO=11, SZAM_KULCSSZO=12, WS=13, NL=14, NUMBER=15, 
		OPADD=16, OPMUL=17, OPPWR=18, OPMINMAX=19;
	public static final int
		RULE_start = 0, RULE_line = 1, RULE_valtozoErtekadas = 2, RULE_polinomDeklaracio = 3, 
		RULE_szamValtozoDeklaracio = 4, RULE_polinom = 5, RULE_xtag = 6, RULE_szamExpr = 7, 
		RULE_szamAddop = 8, RULE_szamMulop = 9, RULE_szamFct = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "line", "valtozoErtekadas", "polinomDeklaracio", "szamValtozoDeklaracio", 
			"polinom", "xtag", "szamExpr", "szamAddop", "szamMulop", "szamFct"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "','", "'<'", "'>'", "'x'", "'('", "')'", "'abs'", 
			"'polynom'", null, "'number'", null, null, null, null, null, "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "POLINOM_KULCSSZO", 
			"VALTOZO", "SZAM_KULCSSZO", "WS", "NL", "NUMBER", "OPADD", "OPMUL", "OPPWR", 
			"OPMINMAX"
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


	    java.util.Map<String, Polinom> polinomok = new java.util.HashMap<>();
	    public void setPolinomok(java.util.Map<String, Polinom> polinomok) {
	        this.polinomok = polinomok;
	    }

	    java.util.Map<String, Double> szamValtozok = new java.util.HashMap<>();
	    public void setSzamValtozok(java.util.Map<String, Double> szamValtozok) {
	        this.szamValtozok = szamValtozok;
	    }

	public PolynomCalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			line();
			setState(23);
			match(T__0);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0) {
				{
				{
				setState(24);
				line();
				setState(25);
				match(T__0);
				}
				}
				setState(31);
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
	public static class LineContext extends ParserRuleContext {
		public PolinomDeklaracioContext polinomDeklaracio() {
			return getRuleContext(PolinomDeklaracioContext.class,0);
		}
		public SzamValtozoDeklaracioContext szamValtozoDeklaracio() {
			return getRuleContext(SzamValtozoDeklaracioContext.class,0);
		}
		public ValtozoErtekadasContext valtozoErtekadas() {
			return getRuleContext(ValtozoErtekadasContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POLINOM_KULCSSZO:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				polinomDeklaracio();
				}
				break;
			case SZAM_KULCSSZO:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				szamValtozoDeklaracio();
				}
				break;
			case VALTOZO:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				valtozoErtekadas();
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
	public static class ValtozoErtekadasContext extends ParserRuleContext {
		public Token VALTOZO;
		public PolinomContext polinom;
		public SzamExprContext szamExpr;
		public TerminalNode VALTOZO() { return getToken(PolynomCalculatorParser.VALTOZO, 0); }
		public PolinomContext polinom() {
			return getRuleContext(PolinomContext.class,0);
		}
		public SzamExprContext szamExpr() {
			return getRuleContext(SzamExprContext.class,0);
		}
		public ValtozoErtekadasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valtozoErtekadas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterValtozoErtekadas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitValtozoErtekadas(this);
		}
	}

	public final ValtozoErtekadasContext valtozoErtekadas() throws RecognitionException {
		ValtozoErtekadasContext _localctx = new ValtozoErtekadasContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_valtozoErtekadas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			((ValtozoErtekadasContext)_localctx).VALTOZO = match(VALTOZO);
			setState(38);
			match(T__1);
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(39);
				((ValtozoErtekadasContext)_localctx).polinom = polinom();
				polinomok.put((((ValtozoErtekadasContext)_localctx).VALTOZO!=null?((ValtozoErtekadasContext)_localctx).VALTOZO.getText():null), ((ValtozoErtekadasContext)_localctx).polinom.polinomPeldany);
				}
				break;
			case T__6:
			case T__8:
			case NUMBER:
			case OPADD:
			case OPMINMAX:
				{
				setState(42);
				((ValtozoErtekadasContext)_localctx).szamExpr = szamExpr();
				szamValtozok.put((((ValtozoErtekadasContext)_localctx).VALTOZO!=null?((ValtozoErtekadasContext)_localctx).VALTOZO.getText():null), ((ValtozoErtekadasContext)_localctx).szamExpr.value);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class PolinomDeklaracioContext extends ParserRuleContext {
		public Token alapValtozo;
		public PolinomContext alapPolinom;
		public Token ismetlodoValtozo;
		public PolinomContext ismetlodoPolinom;
		public TerminalNode POLINOM_KULCSSZO() { return getToken(PolynomCalculatorParser.POLINOM_KULCSSZO, 0); }
		public List<TerminalNode> VALTOZO() { return getTokens(PolynomCalculatorParser.VALTOZO); }
		public TerminalNode VALTOZO(int i) {
			return getToken(PolynomCalculatorParser.VALTOZO, i);
		}
		public List<PolinomContext> polinom() {
			return getRuleContexts(PolinomContext.class);
		}
		public PolinomContext polinom(int i) {
			return getRuleContext(PolinomContext.class,i);
		}
		public PolinomDeklaracioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polinomDeklaracio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterPolinomDeklaracio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitPolinomDeklaracio(this);
		}
	}

	public final PolinomDeklaracioContext polinomDeklaracio() throws RecognitionException {
		PolinomDeklaracioContext _localctx = new PolinomDeklaracioContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_polinomDeklaracio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(POLINOM_KULCSSZO);
			setState(48);
			((PolinomDeklaracioContext)_localctx).alapValtozo = match(VALTOZO);
			polinomok.put((((PolinomDeklaracioContext)_localctx).alapValtozo!=null?((PolinomDeklaracioContext)_localctx).alapValtozo.getText():null), new Polinom());
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(50);
				match(T__1);
				setState(51);
				((PolinomDeklaracioContext)_localctx).alapPolinom = polinom();
				polinomok.put((((PolinomDeklaracioContext)_localctx).alapValtozo!=null?((PolinomDeklaracioContext)_localctx).alapValtozo.getText():null), ((PolinomDeklaracioContext)_localctx).alapPolinom.polinomPeldany);
				}
			}

			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(56);
				match(T__2);
				setState(57);
				((PolinomDeklaracioContext)_localctx).ismetlodoValtozo = match(VALTOZO);
				polinomok.put((((PolinomDeklaracioContext)_localctx).ismetlodoValtozo!=null?((PolinomDeklaracioContext)_localctx).ismetlodoValtozo.getText():null), new Polinom());
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(59);
					match(T__1);
					setState(60);
					((PolinomDeklaracioContext)_localctx).ismetlodoPolinom = polinom();
					polinomok.put((((PolinomDeklaracioContext)_localctx).ismetlodoValtozo!=null?((PolinomDeklaracioContext)_localctx).ismetlodoValtozo.getText():null), ((PolinomDeklaracioContext)_localctx).ismetlodoPolinom.polinomPeldany);
					}
				}

				}
				}
				setState(69);
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
	public static class SzamValtozoDeklaracioContext extends ParserRuleContext {
		public Token alapValtozo;
		public SzamExprContext alapErtek;
		public Token ismetlodoValtozo;
		public SzamExprContext ismetlodoErtek;
		public TerminalNode SZAM_KULCSSZO() { return getToken(PolynomCalculatorParser.SZAM_KULCSSZO, 0); }
		public List<TerminalNode> VALTOZO() { return getTokens(PolynomCalculatorParser.VALTOZO); }
		public TerminalNode VALTOZO(int i) {
			return getToken(PolynomCalculatorParser.VALTOZO, i);
		}
		public List<SzamExprContext> szamExpr() {
			return getRuleContexts(SzamExprContext.class);
		}
		public SzamExprContext szamExpr(int i) {
			return getRuleContext(SzamExprContext.class,i);
		}
		public SzamValtozoDeklaracioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_szamValtozoDeklaracio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterSzamValtozoDeklaracio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitSzamValtozoDeklaracio(this);
		}
	}

	public final SzamValtozoDeklaracioContext szamValtozoDeklaracio() throws RecognitionException {
		SzamValtozoDeklaracioContext _localctx = new SzamValtozoDeklaracioContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_szamValtozoDeklaracio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(SZAM_KULCSSZO);
			setState(71);
			((SzamValtozoDeklaracioContext)_localctx).alapValtozo = match(VALTOZO);
			szamValtozok.put((((SzamValtozoDeklaracioContext)_localctx).alapValtozo!=null?((SzamValtozoDeklaracioContext)_localctx).alapValtozo.getText():null), 0d);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(73);
				match(T__1);
				setState(74);
				((SzamValtozoDeklaracioContext)_localctx).alapErtek = szamExpr();
				szamValtozok.put((((SzamValtozoDeklaracioContext)_localctx).alapValtozo!=null?((SzamValtozoDeklaracioContext)_localctx).alapValtozo.getText():null), ((SzamValtozoDeklaracioContext)_localctx).alapErtek.value);
				}
			}

			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(79);
				match(T__2);
				setState(80);
				((SzamValtozoDeklaracioContext)_localctx).ismetlodoValtozo = match(VALTOZO);
				szamValtozok.put((((SzamValtozoDeklaracioContext)_localctx).ismetlodoValtozo!=null?((SzamValtozoDeklaracioContext)_localctx).ismetlodoValtozo.getText():null), 0d);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(82);
					match(T__1);
					setState(83);
					((SzamValtozoDeklaracioContext)_localctx).ismetlodoErtek = szamExpr();
					szamValtozok.put((((SzamValtozoDeklaracioContext)_localctx).ismetlodoValtozo!=null?((SzamValtozoDeklaracioContext)_localctx).ismetlodoValtozo.getText():null), ((SzamValtozoDeklaracioContext)_localctx).ismetlodoErtek.value);
					}
				}

				}
				}
				setState(92);
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
	public static class PolinomContext extends ParserRuleContext {
		public Polinom polinomPeldany;
		public XtagContext alapTag;
		public XtagContext ismetlodoTag;
		public List<XtagContext> xtag() {
			return getRuleContexts(XtagContext.class);
		}
		public XtagContext xtag(int i) {
			return getRuleContext(XtagContext.class,i);
		}
		public PolinomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polinom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterPolinom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitPolinom(this);
		}
	}

	public final PolinomContext polinom() throws RecognitionException {
		PolinomContext _localctx = new PolinomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_polinom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__3);
			setState(94);
			((PolinomContext)_localctx).alapTag = xtag();

			        ((PolinomContext)_localctx).polinomPeldany =  new Polinom();
			        _localctx.polinomPeldany.addTerm(((PolinomContext)_localctx).alapTag.xtagPeldany);
			    
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 625344L) != 0) {
				{
				{
				setState(96);
				((PolinomContext)_localctx).ismetlodoTag = xtag();

				        _localctx.polinomPeldany.addTerm(((PolinomContext)_localctx).ismetlodoTag.xtagPeldany);
				    
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
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
	public static class XtagContext extends ParserRuleContext {
		public XTag xtagPeldany;
		public Token OPADD;
		public Token VALTOZO;
		public Token NUMBER;
		public Token prefix;
		public Token ints;
		public SzamExprContext szamTag;
		public TerminalNode OPADD() { return getToken(PolynomCalculatorParser.OPADD, 0); }
		public TerminalNode VALTOZO() { return getToken(PolynomCalculatorParser.VALTOZO, 0); }
		public TerminalNode OPPWR() { return getToken(PolynomCalculatorParser.OPPWR, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(PolynomCalculatorParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PolynomCalculatorParser.NUMBER, i);
		}
		public SzamExprContext szamExpr() {
			return getRuleContext(SzamExprContext.class,0);
		}
		public XtagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xtag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterXtag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitXtag(this);
		}
	}

	public final XtagContext xtag() throws RecognitionException {
		XtagContext _localctx = new XtagContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_xtag);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPADD) {
					{
					setState(106);
					((XtagContext)_localctx).OPADD = match(OPADD);
					}
				}

				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALTOZO) {
					{
					setState(109);
					((XtagContext)_localctx).VALTOZO = match(VALTOZO);
					}
				}

				setState(112);
				match(T__5);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPPWR) {
					{
					setState(113);
					match(OPPWR);
					setState(114);
					((XtagContext)_localctx).NUMBER = match(NUMBER);
					}
				}


				        ((XtagContext)_localctx).xtagPeldany =  new XTag();
				        _localctx.xtagPeldany.xSzoveg = "x";

				        if (((XtagContext)_localctx).OPADD != null) _localctx.xtagPeldany.muvelet = (((XtagContext)_localctx).OPADD!=null?((XtagContext)_localctx).OPADD.getText():null);
				        if (((XtagContext)_localctx).VALTOZO != null) _localctx.xtagPeldany.egyutthato = (((XtagContext)_localctx).VALTOZO!=null?((XtagContext)_localctx).VALTOZO.getText():null);
				        if (((XtagContext)_localctx).NUMBER != null) {
				            _localctx.xtagPeldany.vanHatvany = true;
				            _localctx.xtagPeldany.hatvanyJel = "^";
				            _localctx.xtagPeldany.hatvany = Integer.parseInt((((XtagContext)_localctx).NUMBER!=null?((XtagContext)_localctx).NUMBER.getText():null));
				        }
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPADD) {
					{
					setState(118);
					((XtagContext)_localctx).OPADD = match(OPADD);
					}
				}

				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(121);
					((XtagContext)_localctx).prefix = match(NUMBER);
					}
				}

				setState(124);
				match(T__5);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPPWR) {
					{
					setState(125);
					match(OPPWR);
					setState(126);
					((XtagContext)_localctx).ints = match(NUMBER);
					}
				}


				        ((XtagContext)_localctx).xtagPeldany =  new XTag();
				        _localctx.xtagPeldany.xSzoveg = "x";

				        if (((XtagContext)_localctx).OPADD != null) _localctx.xtagPeldany.muvelet = (((XtagContext)_localctx).OPADD!=null?((XtagContext)_localctx).OPADD.getText():null);
				        if (((XtagContext)_localctx).prefix != null) _localctx.xtagPeldany.egyutthato = (((XtagContext)_localctx).prefix!=null?((XtagContext)_localctx).prefix.getText():null);
				        if (((XtagContext)_localctx).ints != null) {
				            _localctx.xtagPeldany.vanHatvany = true;
				            _localctx.xtagPeldany.hatvanyJel = "^";
				            _localctx.xtagPeldany.hatvany = Integer.parseInt((((XtagContext)_localctx).ints!=null?((XtagContext)_localctx).ints.getText():null));
				        }
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				((XtagContext)_localctx).szamTag = szamExpr();

				        ((XtagContext)_localctx).xtagPeldany =  new XTag();
				        _localctx.xtagPeldany.xSzoveg = "";

				        if (((XtagContext)_localctx).szamTag.value >= 0d) _localctx.xtagPeldany.muvelet = "+";
				        else _localctx.xtagPeldany.muvelet = "-";
				        _localctx.xtagPeldany.egyutthato = String.valueOf(((XtagContext)_localctx).szamTag.value);
				    
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
	public static class SzamExprContext extends ParserRuleContext {
		public double value;
		public SzamAddopContext fstop;
		public Token OPADD;
		public SzamAddopContext nxtop;
		public List<SzamAddopContext> szamAddop() {
			return getRuleContexts(SzamAddopContext.class);
		}
		public SzamAddopContext szamAddop(int i) {
			return getRuleContext(SzamAddopContext.class,i);
		}
		public List<TerminalNode> OPADD() { return getTokens(PolynomCalculatorParser.OPADD); }
		public TerminalNode OPADD(int i) {
			return getToken(PolynomCalculatorParser.OPADD, i);
		}
		public SzamExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_szamExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterSzamExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitSzamExpr(this);
		}
	}

	public final SzamExprContext szamExpr() throws RecognitionException {
		SzamExprContext _localctx = new SzamExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_szamExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((SzamExprContext)_localctx).fstop = szamAddop();
			 ((SzamExprContext)_localctx).value =  ((SzamExprContext)_localctx).fstop.value; 
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137);
					((SzamExprContext)_localctx).OPADD = match(OPADD);
					setState(138);
					((SzamExprContext)_localctx).nxtop = szamAddop();
					 if ("+".equals((((SzamExprContext)_localctx).OPADD!=null?((SzamExprContext)_localctx).OPADD.getText():null))) _localctx.value += ((SzamExprContext)_localctx).nxtop.value; else _localctx.value -= ((SzamExprContext)_localctx).nxtop.value; 
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	public static class SzamAddopContext extends ParserRuleContext {
		public double value;
		public SzamMulopContext fstop;
		public Token OPMUL;
		public SzamMulopContext nxtop;
		public List<SzamMulopContext> szamMulop() {
			return getRuleContexts(SzamMulopContext.class);
		}
		public SzamMulopContext szamMulop(int i) {
			return getRuleContext(SzamMulopContext.class,i);
		}
		public List<TerminalNode> OPMUL() { return getTokens(PolynomCalculatorParser.OPMUL); }
		public TerminalNode OPMUL(int i) {
			return getToken(PolynomCalculatorParser.OPMUL, i);
		}
		public SzamAddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_szamAddop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterSzamAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitSzamAddop(this);
		}
	}

	public final SzamAddopContext szamAddop() throws RecognitionException {
		SzamAddopContext _localctx = new SzamAddopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_szamAddop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			((SzamAddopContext)_localctx).fstop = szamMulop();
			 ((SzamAddopContext)_localctx).value =  ((SzamAddopContext)_localctx).fstop.value; 
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPMUL) {
				{
				{
				setState(148);
				((SzamAddopContext)_localctx).OPMUL = match(OPMUL);
				setState(149);
				((SzamAddopContext)_localctx).nxtop = szamMulop();
				 if ("*".equals((((SzamAddopContext)_localctx).OPMUL!=null?((SzamAddopContext)_localctx).OPMUL.getText():null))) _localctx.value *= ((SzamAddopContext)_localctx).nxtop.value; else _localctx.value /= ((SzamAddopContext)_localctx).nxtop.value; 
				}
				}
				setState(156);
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
	public static class SzamMulopContext extends ParserRuleContext {
		public double value;
		public SzamFctContext fstop;
		public SzamMulopContext nxtop;
		public SzamFctContext szamFct() {
			return getRuleContext(SzamFctContext.class,0);
		}
		public TerminalNode OPPWR() { return getToken(PolynomCalculatorParser.OPPWR, 0); }
		public SzamMulopContext szamMulop() {
			return getRuleContext(SzamMulopContext.class,0);
		}
		public SzamMulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_szamMulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterSzamMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitSzamMulop(this);
		}
	}

	public final SzamMulopContext szamMulop() throws RecognitionException {
		SzamMulopContext _localctx = new SzamMulopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_szamMulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((SzamMulopContext)_localctx).fstop = szamFct();
			 ((SzamMulopContext)_localctx).value =  ((SzamMulopContext)_localctx).fstop.value; 
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPPWR) {
				{
				setState(159);
				match(OPPWR);
				setState(160);
				((SzamMulopContext)_localctx).nxtop = szamMulop();
				 ((SzamMulopContext)_localctx).value =  Math.pow(_localctx.value, ((SzamMulopContext)_localctx).nxtop.value); 
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
	public static class SzamFctContext extends ParserRuleContext {
		public double value;
		public Token NUMBER;
		public SzamExprContext szamExpr;
		public SzamExprContext fstop;
		public SzamExprContext nxtop;
		public Token OPADD;
		public SzamFctContext szamFct;
		public TerminalNode NUMBER() { return getToken(PolynomCalculatorParser.NUMBER, 0); }
		public List<SzamExprContext> szamExpr() {
			return getRuleContexts(SzamExprContext.class);
		}
		public SzamExprContext szamExpr(int i) {
			return getRuleContext(SzamExprContext.class,i);
		}
		public TerminalNode OPMINMAX() { return getToken(PolynomCalculatorParser.OPMINMAX, 0); }
		public TerminalNode OPADD() { return getToken(PolynomCalculatorParser.OPADD, 0); }
		public SzamFctContext szamFct() {
			return getRuleContext(SzamFctContext.class,0);
		}
		public SzamFctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_szamFct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterSzamFct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitSzamFct(this);
		}
	}

	public final SzamFctContext szamFct() throws RecognitionException {
		SzamFctContext _localctx = new SzamFctContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_szamFct);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				((SzamFctContext)_localctx).NUMBER = match(NUMBER);
				 ((SzamFctContext)_localctx).value =  Double.parseDouble((((SzamFctContext)_localctx).NUMBER!=null?((SzamFctContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__6);
				setState(168);
				((SzamFctContext)_localctx).szamExpr = szamExpr();
				setState(169);
				match(T__7);
				 ((SzamFctContext)_localctx).value =  ((SzamFctContext)_localctx).szamExpr.value; 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(T__8);
				setState(173);
				match(T__6);
				setState(174);
				((SzamFctContext)_localctx).szamExpr = szamExpr();
				setState(175);
				match(T__7);
				 ((SzamFctContext)_localctx).value =  Math.abs(((SzamFctContext)_localctx).szamExpr.value); 
				}
				break;
			case OPMINMAX:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(OPMINMAX);
				setState(179);
				match(T__6);
				setState(180);
				((SzamFctContext)_localctx).fstop = szamExpr();
				 ((SzamFctContext)_localctx).value =  ((SzamFctContext)_localctx).fstop.value; 
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(182);
					match(T__2);
					setState(183);
					((SzamFctContext)_localctx).nxtop = szamExpr();

					        if ("min".equals(OPMINMAX) && ((SzamFctContext)_localctx).nxtop.value < _localctx.value) ((SzamFctContext)_localctx).value =  ((SzamFctContext)_localctx).nxtop.value;
					        else if ("max".equals(OPMINMAX) && ((SzamFctContext)_localctx).nxtop.value > _localctx.value) ((SzamFctContext)_localctx).value =  ((SzamFctContext)_localctx).nxtop.value;
					    
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(191);
				match(T__7);
				}
				break;
			case OPADD:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				((SzamFctContext)_localctx).OPADD = match(OPADD);
				setState(194);
				((SzamFctContext)_localctx).szamFct = szamFct();
				 ((SzamFctContext)_localctx).value =  "-".equals((((SzamFctContext)_localctx).OPADD!=null?((SzamFctContext)_localctx).OPADD.getText():null)) ? -((SzamFctContext)_localctx).szamFct.value : ((SzamFctContext)_localctx).szamFct.value; 
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
		"\u0004\u0001\u0013\u00c8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000"+
		"\f\u0000\u001f\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"$\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002.\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u00037\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003@\b\u0003\u0005\u0003"+
		"B\b\u0003\n\u0003\f\u0003E\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004N\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004W\b\u0004\u0005\u0004Y\b\u0004\n\u0004\f\u0004"+
		"\\\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005d\b\u0005\n\u0005\f\u0005g\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0003\u0006l\b\u0006\u0001\u0006\u0003\u0006"+
		"o\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006t\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006x\b\u0006\u0001\u0006\u0003\u0006{\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0080\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0086\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u008e\b\u0007\n\u0007\f\u0007\u0091\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u0099\b\b\n\b\f\b\u009c\t\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a4\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00bb\b\n\n\n\f\n\u00be\t\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u00c6\b\n\u0001\n\u0000\u0000\u000b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000\u00d7\u0000\u0016"+
		"\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0004%\u0001\u0000"+
		"\u0000\u0000\u0006/\u0001\u0000\u0000\u0000\bF\u0001\u0000\u0000\u0000"+
		"\n]\u0001\u0000\u0000\u0000\f\u0085\u0001\u0000\u0000\u0000\u000e\u0087"+
		"\u0001\u0000\u0000\u0000\u0010\u0092\u0001\u0000\u0000\u0000\u0012\u009d"+
		"\u0001\u0000\u0000\u0000\u0014\u00c5\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0003\u0002\u0001\u0000\u0017\u001d\u0005\u0001\u0000\u0000\u0018\u0019"+
		"\u0003\u0002\u0001\u0000\u0019\u001a\u0005\u0001\u0000\u0000\u001a\u001c"+
		"\u0001\u0000\u0000\u0000\u001b\u0018\u0001\u0000\u0000\u0000\u001c\u001f"+
		"\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0001\u0000\u0000\u0000\u001e\u0001\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000 $\u0003\u0006\u0003\u0000!$\u0003\b\u0004\u0000"+
		"\"$\u0003\u0004\u0002\u0000# \u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000#\"\u0001\u0000\u0000\u0000$\u0003\u0001\u0000\u0000\u0000%&\u0005"+
		"\u000b\u0000\u0000&-\u0005\u0002\u0000\u0000\'(\u0003\n\u0005\u0000()"+
		"\u0006\u0002\uffff\uffff\u0000).\u0001\u0000\u0000\u0000*+\u0003\u000e"+
		"\u0007\u0000+,\u0006\u0002\uffff\uffff\u0000,.\u0001\u0000\u0000\u0000"+
		"-\'\u0001\u0000\u0000\u0000-*\u0001\u0000\u0000\u0000.\u0005\u0001\u0000"+
		"\u0000\u0000/0\u0005\n\u0000\u000001\u0005\u000b\u0000\u000016\u0006\u0003"+
		"\uffff\uffff\u000023\u0005\u0002\u0000\u000034\u0003\n\u0005\u000045\u0006"+
		"\u0003\uffff\uffff\u000057\u0001\u0000\u0000\u000062\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u00007C\u0001\u0000\u0000\u000089\u0005\u0003"+
		"\u0000\u00009:\u0005\u000b\u0000\u0000:?\u0006\u0003\uffff\uffff\u0000"+
		";<\u0005\u0002\u0000\u0000<=\u0003\n\u0005\u0000=>\u0006\u0003\uffff\uffff"+
		"\u0000>@\u0001\u0000\u0000\u0000?;\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@B\u0001\u0000\u0000\u0000A8\u0001\u0000\u0000\u0000BE\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"D\u0007\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0005\f\u0000"+
		"\u0000GH\u0005\u000b\u0000\u0000HM\u0006\u0004\uffff\uffff\u0000IJ\u0005"+
		"\u0002\u0000\u0000JK\u0003\u000e\u0007\u0000KL\u0006\u0004\uffff\uffff"+
		"\u0000LN\u0001\u0000\u0000\u0000MI\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000NZ\u0001\u0000\u0000\u0000OP\u0005\u0003\u0000\u0000PQ\u0005"+
		"\u000b\u0000\u0000QV\u0006\u0004\uffff\uffff\u0000RS\u0005\u0002\u0000"+
		"\u0000ST\u0003\u000e\u0007\u0000TU\u0006\u0004\uffff\uffff\u0000UW\u0001"+
		"\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WY\u0001\u0000\u0000\u0000XO\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\t\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005\u0004\u0000\u0000^_\u0003"+
		"\f\u0006\u0000_e\u0006\u0005\uffff\uffff\u0000`a\u0003\f\u0006\u0000a"+
		"b\u0006\u0005\uffff\uffff\u0000bd\u0001\u0000\u0000\u0000c`\u0001\u0000"+
		"\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"hi\u0005\u0005\u0000\u0000i\u000b\u0001\u0000\u0000\u0000jl\u0005\u0010"+
		"\u0000\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001"+
		"\u0000\u0000\u0000mo\u0005\u000b\u0000\u0000nm\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000ps\u0005\u0006\u0000"+
		"\u0000qr\u0005\u0012\u0000\u0000rt\u0005\u000f\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0086"+
		"\u0006\u0006\uffff\uffff\u0000vx\u0005\u0010\u0000\u0000wv\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000y{\u0005"+
		"\u000f\u0000\u0000zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|\u007f\u0005\u0006\u0000\u0000}~\u0005\u0012"+
		"\u0000\u0000~\u0080\u0005\u000f\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u0086\u0006\u0006\uffff\uffff\u0000\u0082\u0083\u0003\u000e\u0007"+
		"\u0000\u0083\u0084\u0006\u0006\uffff\uffff\u0000\u0084\u0086\u0001\u0000"+
		"\u0000\u0000\u0085k\u0001\u0000\u0000\u0000\u0085w\u0001\u0000\u0000\u0000"+
		"\u0085\u0082\u0001\u0000\u0000\u0000\u0086\r\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0003\u0010\b\u0000\u0088\u008f\u0006\u0007\uffff\uffff\u0000\u0089"+
		"\u008a\u0005\u0010\u0000\u0000\u008a\u008b\u0003\u0010\b\u0000\u008b\u008c"+
		"\u0006\u0007\uffff\uffff\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d"+
		"\u0089\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u000f\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0003\u0012\t\u0000\u0093\u009a\u0006\b\uffff\uffff\u0000\u0094"+
		"\u0095\u0005\u0011\u0000\u0000\u0095\u0096\u0003\u0012\t\u0000\u0096\u0097"+
		"\u0006\b\uffff\uffff\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0094"+
		"\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0011"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0003\u0014\n\u0000\u009e\u00a3\u0006\t\uffff\uffff\u0000\u009f\u00a0"+
		"\u0005\u0012\u0000\u0000\u00a0\u00a1\u0003\u0012\t\u0000\u00a1\u00a2\u0006"+
		"\t\uffff\uffff\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u009f\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u0013\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005\u000f\u0000\u0000\u00a6\u00c6\u0006"+
		"\n\uffff\uffff\u0000\u00a7\u00a8\u0005\u0007\u0000\u0000\u00a8\u00a9\u0003"+
		"\u000e\u0007\u0000\u00a9\u00aa\u0005\b\u0000\u0000\u00aa\u00ab\u0006\n"+
		"\uffff\uffff\u0000\u00ab\u00c6\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005"+
		"\t\u0000\u0000\u00ad\u00ae\u0005\u0007\u0000\u0000\u00ae\u00af\u0003\u000e"+
		"\u0007\u0000\u00af\u00b0\u0005\b\u0000\u0000\u00b0\u00b1\u0006\n\uffff"+
		"\uffff\u0000\u00b1\u00c6\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0013"+
		"\u0000\u0000\u00b3\u00b4\u0005\u0007\u0000\u0000\u00b4\u00b5\u0003\u000e"+
		"\u0007\u0000\u00b5\u00bc\u0006\n\uffff\uffff\u0000\u00b6\u00b7\u0005\u0003"+
		"\u0000\u0000\u00b7\u00b8\u0003\u000e\u0007\u0000\u00b8\u00b9\u0006\n\uffff"+
		"\uffff\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b6\u0001\u0000"+
		"\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000"+
		"\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\b\u0000"+
		"\u0000\u00c0\u00c6\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u0010\u0000"+
		"\u0000\u00c2\u00c3\u0003\u0014\n\u0000\u00c3\u00c4\u0006\n\uffff\uffff"+
		"\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00a5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00a7\u0001\u0000\u0000\u0000\u00c5\u00ac\u0001\u0000\u0000"+
		"\u0000\u00c5\u00b2\u0001\u0000\u0000\u0000\u00c5\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c6\u0015\u0001\u0000\u0000\u0000\u0016\u001d#-6?CMVZeknswz\u007f"+
		"\u0085\u008f\u009a\u00a3\u00bc\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}