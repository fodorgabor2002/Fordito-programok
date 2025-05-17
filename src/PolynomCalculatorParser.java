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
		T__9=10, T__10=11, POLINOM_KULCSSZO=12, VALTOZO=13, SZAM_KULCSSZO=14, 
		SHOW_KULCSSZO=15, WS=16, NL=17, NUMBER=18, OPADD=19, OPMUL=20, OPPWR=21, 
		OPMINMAX=22;
	public static final int
		RULE_start = 0, RULE_line = 1, RULE_showUtasitas = 2, RULE_kiertekeles = 3, 
		RULE_kiertekelendoSzam = 4, RULE_valtozoErtekadas = 5, RULE_polinomDeklaracio = 6, 
		RULE_szamValtozoDeklaracio = 7, RULE_polinom = 8, RULE_xtag = 9, RULE_szamExpr = 10, 
		RULE_szamAddop = 11, RULE_szamMulop = 12, RULE_szamFct = 13, RULE_szamVagySzamValtozo = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "line", "showUtasitas", "kiertekeles", "kiertekelendoSzam", 
			"valtozoErtekadas", "polinomDeklaracio", "szamValtozoDeklaracio", "polinom", 
			"xtag", "szamExpr", "szamAddop", "szamMulop", "szamFct", "szamVagySzamValtozo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'['", "']'", "'='", "','", "'<'", "'>'", 
			"'x'", "'abs'", "'polynom'", null, "'number'", "'show'", null, null, 
			null, null, null, "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"POLINOM_KULCSSZO", "VALTOZO", "SZAM_KULCSSZO", "SHOW_KULCSSZO", "WS", 
			"NL", "NUMBER", "OPADD", "OPMUL", "OPPWR", "OPMINMAX"
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
			setState(30);
			line();
			setState(31);
			match(T__0);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 61696L) != 0) {
				{
				{
				setState(32);
				line();
				setState(33);
				match(T__0);
				}
				}
				setState(39);
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
		public KiertekelesContext kiertekeles() {
			return getRuleContext(KiertekelesContext.class,0);
		}
		public ShowUtasitasContext showUtasitas() {
			return getRuleContext(ShowUtasitasContext.class,0);
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
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POLINOM_KULCSSZO:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				polinomDeklaracio();
				}
				break;
			case SZAM_KULCSSZO:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				szamValtozoDeklaracio();
				}
				break;
			case VALTOZO:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				valtozoErtekadas();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				kiertekeles();
				}
				break;
			case SHOW_KULCSSZO:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				showUtasitas();
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
	public static class ShowUtasitasContext extends ParserRuleContext {
		public PolinomContext showPolinom;
		public Token VALTOZO;
		public SzamExprContext showSzamExpr;
		public KiertekelesContext kiertekeles;
		public TerminalNode SHOW_KULCSSZO() { return getToken(PolynomCalculatorParser.SHOW_KULCSSZO, 0); }
		public PolinomContext polinom() {
			return getRuleContext(PolinomContext.class,0);
		}
		public TerminalNode VALTOZO() { return getToken(PolynomCalculatorParser.VALTOZO, 0); }
		public SzamExprContext szamExpr() {
			return getRuleContext(SzamExprContext.class,0);
		}
		public KiertekelesContext kiertekeles() {
			return getRuleContext(KiertekelesContext.class,0);
		}
		public ShowUtasitasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showUtasitas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterShowUtasitas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitShowUtasitas(this);
		}
	}

	public final ShowUtasitasContext showUtasitas() throws RecognitionException {
		ShowUtasitasContext _localctx = new ShowUtasitasContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_showUtasitas);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(SHOW_KULCSSZO);
				setState(48);
				match(T__1);
				setState(49);
				((ShowUtasitasContext)_localctx).showPolinom = polinom();
				setState(50);
				match(T__2);
				System.out.println(((ShowUtasitasContext)_localctx).showPolinom.polinomPeldany.toString());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(SHOW_KULCSSZO);
				setState(54);
				match(T__1);
				setState(55);
				((ShowUtasitasContext)_localctx).VALTOZO = match(VALTOZO);
				setState(56);
				match(T__2);

				        if (polinomok.containsKey((((ShowUtasitasContext)_localctx).VALTOZO!=null?((ShowUtasitasContext)_localctx).VALTOZO.getText():null))) System.out.println(polinomok.get((((ShowUtasitasContext)_localctx).VALTOZO!=null?((ShowUtasitasContext)_localctx).VALTOZO.getText():null)).toString());
				        else System.out.println(szamValtozok.get((((ShowUtasitasContext)_localctx).VALTOZO!=null?((ShowUtasitasContext)_localctx).VALTOZO.getText():null)));
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				match(SHOW_KULCSSZO);
				setState(59);
				match(T__1);
				setState(60);
				((ShowUtasitasContext)_localctx).showSzamExpr = szamExpr();
				setState(61);
				match(T__2);
				System.out.println(((ShowUtasitasContext)_localctx).showSzamExpr.value);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				match(SHOW_KULCSSZO);
				setState(65);
				match(T__1);
				setState(66);
				((ShowUtasitasContext)_localctx).kiertekeles = kiertekeles();
				setState(67);
				match(T__2);
				System.out.println(((ShowUtasitasContext)_localctx).kiertekeles.kiertekeltErtek);
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
	public static class KiertekelesContext extends ParserRuleContext {
		public double kiertekeltErtek;
		public PolinomContext kiertekelendoPolinom;
		public KiertekelendoSzamContext fuggvenyertek;
		public PolinomContext polinom() {
			return getRuleContext(PolinomContext.class,0);
		}
		public KiertekelendoSzamContext kiertekelendoSzam() {
			return getRuleContext(KiertekelendoSzamContext.class,0);
		}
		public KiertekelesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kiertekeles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterKiertekeles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitKiertekeles(this);
		}
	}

	public final KiertekelesContext kiertekeles() throws RecognitionException {
		KiertekelesContext _localctx = new KiertekelesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_kiertekeles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			((KiertekelesContext)_localctx).kiertekelendoPolinom = polinom();
			setState(73);
			((KiertekelesContext)_localctx).fuggvenyertek = kiertekelendoSzam();

			        Polinom polinom = ((KiertekelesContext)_localctx).kiertekelendoPolinom.polinomPeldany;
			        ((KiertekelesContext)_localctx).kiertekeltErtek =  polinom.evaluatePolinom(((KiertekelesContext)_localctx).fuggvenyertek.value);
			        // System.out.println("polinom: " + polinom.toString() + ", ertek:" + _localctx.kiertekeltErtek);
			    
			}
		}
		catch (RecognitionException re) {
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
	public static class KiertekelendoSzamContext extends ParserRuleContext {
		public double value;
		public SzamExprContext ertekelendoSzam;
		public KiertekelesContext belsoKiertekeles;
		public SzamExprContext szamExpr() {
			return getRuleContext(SzamExprContext.class,0);
		}
		public KiertekelesContext kiertekeles() {
			return getRuleContext(KiertekelesContext.class,0);
		}
		public KiertekelendoSzamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kiertekelendoSzam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterKiertekelendoSzam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitKiertekelendoSzam(this);
		}
	}

	public final KiertekelendoSzamContext kiertekelendoSzam() throws RecognitionException {
		KiertekelendoSzamContext _localctx = new KiertekelendoSzamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_kiertekelendoSzam);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(T__3);
				setState(77);
				((KiertekelendoSzamContext)_localctx).ertekelendoSzam = szamExpr();
				setState(78);
				match(T__4);
				((KiertekelendoSzamContext)_localctx).value =  ((KiertekelendoSzamContext)_localctx).ertekelendoSzam.value;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(T__3);
				setState(82);
				((KiertekelendoSzamContext)_localctx).belsoKiertekeles = kiertekeles();
				setState(83);
				match(T__4);
				((KiertekelendoSzamContext)_localctx).value =  ((KiertekelendoSzamContext)_localctx).belsoKiertekeles.kiertekeltErtek;
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
		enterRule(_localctx, 10, RULE_valtozoErtekadas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((ValtozoErtekadasContext)_localctx).VALTOZO = match(VALTOZO);
			setState(89);
			match(T__5);
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(90);
				((ValtozoErtekadasContext)_localctx).polinom = polinom();
				polinomok.put((((ValtozoErtekadasContext)_localctx).VALTOZO!=null?((ValtozoErtekadasContext)_localctx).VALTOZO.getText():null), ((ValtozoErtekadasContext)_localctx).polinom.polinomPeldany);
				}
				break;
			case T__1:
			case T__10:
			case VALTOZO:
			case NUMBER:
			case OPADD:
			case OPMINMAX:
				{
				setState(93);
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
		enterRule(_localctx, 12, RULE_polinomDeklaracio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(POLINOM_KULCSSZO);
			setState(99);
			((PolinomDeklaracioContext)_localctx).alapValtozo = match(VALTOZO);
			polinomok.put((((PolinomDeklaracioContext)_localctx).alapValtozo!=null?((PolinomDeklaracioContext)_localctx).alapValtozo.getText():null), new Polinom());
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(101);
				match(T__5);
				setState(102);
				((PolinomDeklaracioContext)_localctx).alapPolinom = polinom();
				polinomok.put((((PolinomDeklaracioContext)_localctx).alapValtozo!=null?((PolinomDeklaracioContext)_localctx).alapValtozo.getText():null), ((PolinomDeklaracioContext)_localctx).alapPolinom.polinomPeldany);
				}
			}

			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(107);
				match(T__6);
				setState(108);
				((PolinomDeklaracioContext)_localctx).ismetlodoValtozo = match(VALTOZO);
				polinomok.put((((PolinomDeklaracioContext)_localctx).ismetlodoValtozo!=null?((PolinomDeklaracioContext)_localctx).ismetlodoValtozo.getText():null), new Polinom());
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(110);
					match(T__5);
					setState(111);
					((PolinomDeklaracioContext)_localctx).ismetlodoPolinom = polinom();
					polinomok.put((((PolinomDeklaracioContext)_localctx).ismetlodoValtozo!=null?((PolinomDeklaracioContext)_localctx).ismetlodoValtozo.getText():null), ((PolinomDeklaracioContext)_localctx).ismetlodoPolinom.polinomPeldany);
					}
				}

				}
				}
				setState(120);
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
		enterRule(_localctx, 14, RULE_szamValtozoDeklaracio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(SZAM_KULCSSZO);
			setState(122);
			((SzamValtozoDeklaracioContext)_localctx).alapValtozo = match(VALTOZO);
			szamValtozok.put((((SzamValtozoDeklaracioContext)_localctx).alapValtozo!=null?((SzamValtozoDeklaracioContext)_localctx).alapValtozo.getText():null), 0d);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(124);
				match(T__5);
				setState(125);
				((SzamValtozoDeklaracioContext)_localctx).alapErtek = szamExpr();
				szamValtozok.put((((SzamValtozoDeklaracioContext)_localctx).alapValtozo!=null?((SzamValtozoDeklaracioContext)_localctx).alapValtozo.getText():null), ((SzamValtozoDeklaracioContext)_localctx).alapErtek.value);
				}
			}

			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(130);
				match(T__6);
				setState(131);
				((SzamValtozoDeklaracioContext)_localctx).ismetlodoValtozo = match(VALTOZO);
				szamValtozok.put((((SzamValtozoDeklaracioContext)_localctx).ismetlodoValtozo!=null?((SzamValtozoDeklaracioContext)_localctx).ismetlodoValtozo.getText():null), 0d);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(133);
					match(T__5);
					setState(134);
					((SzamValtozoDeklaracioContext)_localctx).ismetlodoErtek = szamExpr();
					szamValtozok.put((((SzamValtozoDeklaracioContext)_localctx).ismetlodoValtozo!=null?((SzamValtozoDeklaracioContext)_localctx).ismetlodoValtozo.getText():null), ((SzamValtozoDeklaracioContext)_localctx).ismetlodoErtek.value);
					}
				}

				}
				}
				setState(143);
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
		enterRule(_localctx, 16, RULE_polinom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__7);
			setState(145);
			((PolinomContext)_localctx).alapTag = xtag();

			        ((PolinomContext)_localctx).polinomPeldany =  new Polinom();
			        _localctx.polinomPeldany.addTerm(((PolinomContext)_localctx).alapTag.xtagPeldany);
			    
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4992004L) != 0) {
				{
				{
				setState(147);
				((PolinomContext)_localctx).ismetlodoTag = xtag();

				        _localctx.polinomPeldany.addTerm(((PolinomContext)_localctx).ismetlodoTag.xtagPeldany);
				    
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
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
		public SzamExprContext prefix;
		public Token ints;
		public SzamExprContext szamTag;
		public TerminalNode OPPWR() { return getToken(PolynomCalculatorParser.OPPWR, 0); }
		public SzamExprContext szamExpr() {
			return getRuleContext(SzamExprContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(PolynomCalculatorParser.NUMBER, 0); }
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
		enterRule(_localctx, 18, RULE_xtag);
		int _la;
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				((XtagContext)_localctx).xtagPeldany =  new XTag();
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4990980L) != 0) {
					{
					setState(158);
					((XtagContext)_localctx).prefix = szamExpr();
					_localctx.xtagPeldany.egyutthato = ((XtagContext)_localctx).prefix.value;
					}
				}

				setState(163);
				match(T__9);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPPWR) {
					{
					setState(164);
					match(OPPWR);
					setState(165);
					((XtagContext)_localctx).ints = match(NUMBER);
					}
				}


				        _localctx.xtagPeldany.xSzoveg = "x";

				        if (((XtagContext)_localctx).ints != null) {
				            _localctx.xtagPeldany.vanHatvany = true;
				            _localctx.xtagPeldany.hatvanyJel = "^";
				            _localctx.xtagPeldany.hatvany = Integer.parseInt((((XtagContext)_localctx).ints!=null?((XtagContext)_localctx).ints.getText():null));
				        }
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((XtagContext)_localctx).xtagPeldany =  new XTag();
				setState(170);
				((XtagContext)_localctx).szamTag = szamExpr();

				        _localctx.xtagPeldany.xSzoveg = "";
				        _localctx.xtagPeldany.egyutthato = ((XtagContext)_localctx).szamTag.value;
				    
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
		enterRule(_localctx, 20, RULE_szamExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((SzamExprContext)_localctx).fstop = szamAddop();
			 ((SzamExprContext)_localctx).value =  ((SzamExprContext)_localctx).fstop.value; 
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					((SzamExprContext)_localctx).OPADD = match(OPADD);
					setState(178);
					((SzamExprContext)_localctx).nxtop = szamAddop();
					 if ("+".equals((((SzamExprContext)_localctx).OPADD!=null?((SzamExprContext)_localctx).OPADD.getText():null))) _localctx.value += ((SzamExprContext)_localctx).nxtop.value; else _localctx.value -= ((SzamExprContext)_localctx).nxtop.value; 
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 22, RULE_szamAddop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((SzamAddopContext)_localctx).fstop = szamMulop();
			 ((SzamAddopContext)_localctx).value =  ((SzamAddopContext)_localctx).fstop.value; 
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPMUL) {
				{
				{
				setState(188);
				((SzamAddopContext)_localctx).OPMUL = match(OPMUL);
				setState(189);
				((SzamAddopContext)_localctx).nxtop = szamMulop();
				 if ("*".equals((((SzamAddopContext)_localctx).OPMUL!=null?((SzamAddopContext)_localctx).OPMUL.getText():null))) _localctx.value *= ((SzamAddopContext)_localctx).nxtop.value; else _localctx.value /= ((SzamAddopContext)_localctx).nxtop.value; 
				}
				}
				setState(196);
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
		enterRule(_localctx, 24, RULE_szamMulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			((SzamMulopContext)_localctx).fstop = szamFct();
			 ((SzamMulopContext)_localctx).value =  ((SzamMulopContext)_localctx).fstop.value; 
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPPWR) {
				{
				setState(199);
				match(OPPWR);
				setState(200);
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
		public SzamVagySzamValtozoContext csakSzam;
		public SzamExprContext szamExpr;
		public SzamExprContext fstop;
		public SzamExprContext nxtop;
		public Token OPADD;
		public SzamFctContext szamFct;
		public SzamVagySzamValtozoContext szamVagySzamValtozo() {
			return getRuleContext(SzamVagySzamValtozoContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_szamFct);
		int _la;
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALTOZO:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				((SzamFctContext)_localctx).csakSzam = szamVagySzamValtozo();
				 ((SzamFctContext)_localctx).value =  ((SzamFctContext)_localctx).csakSzam.value; 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__1);
				setState(209);
				((SzamFctContext)_localctx).szamExpr = szamExpr();
				setState(210);
				match(T__2);
				 ((SzamFctContext)_localctx).value =  ((SzamFctContext)_localctx).szamExpr.value; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(T__10);
				setState(214);
				match(T__1);
				setState(215);
				((SzamFctContext)_localctx).szamExpr = szamExpr();
				setState(216);
				match(T__2);
				 ((SzamFctContext)_localctx).value =  Math.abs(((SzamFctContext)_localctx).szamExpr.value); 
				}
				break;
			case OPMINMAX:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				match(OPMINMAX);
				setState(220);
				match(T__1);
				setState(221);
				((SzamFctContext)_localctx).fstop = szamExpr();
				 ((SzamFctContext)_localctx).value =  ((SzamFctContext)_localctx).fstop.value; 
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(223);
					match(T__6);
					setState(224);
					((SzamFctContext)_localctx).nxtop = szamExpr();

					        if ("min".equals(OPMINMAX) && ((SzamFctContext)_localctx).nxtop.value < _localctx.value) ((SzamFctContext)_localctx).value =  ((SzamFctContext)_localctx).nxtop.value;
					        else if ("max".equals(OPMINMAX) && ((SzamFctContext)_localctx).nxtop.value > _localctx.value) ((SzamFctContext)_localctx).value =  ((SzamFctContext)_localctx).nxtop.value;
					    
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				match(T__2);
				}
				break;
			case OPADD:
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				((SzamFctContext)_localctx).OPADD = match(OPADD);
				setState(235);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SzamVagySzamValtozoContext extends ParserRuleContext {
		public double value;
		public Token NUMBER;
		public Token VALTOZO;
		public TerminalNode NUMBER() { return getToken(PolynomCalculatorParser.NUMBER, 0); }
		public TerminalNode VALTOZO() { return getToken(PolynomCalculatorParser.VALTOZO, 0); }
		public SzamVagySzamValtozoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_szamVagySzamValtozo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterSzamVagySzamValtozo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitSzamVagySzamValtozo(this);
		}
	}

	public final SzamVagySzamValtozoContext szamVagySzamValtozo() throws RecognitionException {
		SzamVagySzamValtozoContext _localctx = new SzamVagySzamValtozoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_szamVagySzamValtozo);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				((SzamVagySzamValtozoContext)_localctx).NUMBER = match(NUMBER);
				 ((SzamVagySzamValtozoContext)_localctx).value =  Double.parseDouble((((SzamVagySzamValtozoContext)_localctx).NUMBER!=null?((SzamVagySzamValtozoContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case VALTOZO:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				((SzamVagySzamValtozoContext)_localctx).VALTOZO = match(VALTOZO);
				 ((SzamVagySzamValtozoContext)_localctx).value =  szamValtozok.get((((SzamVagySzamValtozoContext)_localctx).VALTOZO!=null?((SzamVagySzamValtozoContext)_localctx).VALTOZO.getText():null)); 
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
		"\u0004\u0001\u0016\u00f7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000$\b\u0000\n\u0000"+
		"\f\u0000\'\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001.\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002G\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004W\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005a\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006j\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006s\b\u0006\u0005"+
		"\u0006u\b\u0006\n\u0006\f\u0006x\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0081"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u008a\b\u0007\u0005\u0007\u008c\b\u0007"+
		"\n\u0007\f\u0007\u008f\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0005\b\u0097\b\b\n\b\f\b\u009a\t\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00a2\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a7"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ae\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00b6\b\n\n\n\f\n\u00b9"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00c1\b\u000b\n\u000b\f\u000b\u00c4\t\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00cc\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u00e4\b\r\n\r\f\r\u00e7\t\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ef\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00f5\b\u000e\u0001\u000e\u0000\u0000"+
		"\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u0000\u0000\u0104\u0000\u001e\u0001\u0000\u0000\u0000\u0002"+
		"-\u0001\u0000\u0000\u0000\u0004F\u0001\u0000\u0000\u0000\u0006H\u0001"+
		"\u0000\u0000\u0000\bV\u0001\u0000\u0000\u0000\nX\u0001\u0000\u0000\u0000"+
		"\fb\u0001\u0000\u0000\u0000\u000ey\u0001\u0000\u0000\u0000\u0010\u0090"+
		"\u0001\u0000\u0000\u0000\u0012\u00ad\u0001\u0000\u0000\u0000\u0014\u00af"+
		"\u0001\u0000\u0000\u0000\u0016\u00ba\u0001\u0000\u0000\u0000\u0018\u00c5"+
		"\u0001\u0000\u0000\u0000\u001a\u00ee\u0001\u0000\u0000\u0000\u001c\u00f4"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f%\u0005"+
		"\u0001\u0000\u0000 !\u0003\u0002\u0001\u0000!\"\u0005\u0001\u0000\u0000"+
		"\"$\u0001\u0000\u0000\u0000# \u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000"+
		"\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0001\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000(.\u0003\f\u0006\u0000)."+
		"\u0003\u000e\u0007\u0000*.\u0003\n\u0005\u0000+.\u0003\u0006\u0003\u0000"+
		",.\u0003\u0004\u0002\u0000-(\u0001\u0000\u0000\u0000-)\u0001\u0000\u0000"+
		"\u0000-*\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-,\u0001\u0000"+
		"\u0000\u0000.\u0003\u0001\u0000\u0000\u0000/0\u0005\u000f\u0000\u0000"+
		"01\u0005\u0002\u0000\u000012\u0003\u0010\b\u000023\u0005\u0003\u0000\u0000"+
		"34\u0006\u0002\uffff\uffff\u00004G\u0001\u0000\u0000\u000056\u0005\u000f"+
		"\u0000\u000067\u0005\u0002\u0000\u000078\u0005\r\u0000\u000089\u0005\u0003"+
		"\u0000\u00009G\u0006\u0002\uffff\uffff\u0000:;\u0005\u000f\u0000\u0000"+
		";<\u0005\u0002\u0000\u0000<=\u0003\u0014\n\u0000=>\u0005\u0003\u0000\u0000"+
		">?\u0006\u0002\uffff\uffff\u0000?G\u0001\u0000\u0000\u0000@A\u0005\u000f"+
		"\u0000\u0000AB\u0005\u0002\u0000\u0000BC\u0003\u0006\u0003\u0000CD\u0005"+
		"\u0003\u0000\u0000DE\u0006\u0002\uffff\uffff\u0000EG\u0001\u0000\u0000"+
		"\u0000F/\u0001\u0000\u0000\u0000F5\u0001\u0000\u0000\u0000F:\u0001\u0000"+
		"\u0000\u0000F@\u0001\u0000\u0000\u0000G\u0005\u0001\u0000\u0000\u0000"+
		"HI\u0003\u0010\b\u0000IJ\u0003\b\u0004\u0000JK\u0006\u0003\uffff\uffff"+
		"\u0000K\u0007\u0001\u0000\u0000\u0000LM\u0005\u0004\u0000\u0000MN\u0003"+
		"\u0014\n\u0000NO\u0005\u0005\u0000\u0000OP\u0006\u0004\uffff\uffff\u0000"+
		"PW\u0001\u0000\u0000\u0000QR\u0005\u0004\u0000\u0000RS\u0003\u0006\u0003"+
		"\u0000ST\u0005\u0005\u0000\u0000TU\u0006\u0004\uffff\uffff\u0000UW\u0001"+
		"\u0000\u0000\u0000VL\u0001\u0000\u0000\u0000VQ\u0001\u0000\u0000\u0000"+
		"W\t\u0001\u0000\u0000\u0000XY\u0005\r\u0000\u0000Y`\u0005\u0006\u0000"+
		"\u0000Z[\u0003\u0010\b\u0000[\\\u0006\u0005\uffff\uffff\u0000\\a\u0001"+
		"\u0000\u0000\u0000]^\u0003\u0014\n\u0000^_\u0006\u0005\uffff\uffff\u0000"+
		"_a\u0001\u0000\u0000\u0000`Z\u0001\u0000\u0000\u0000`]\u0001\u0000\u0000"+
		"\u0000a\u000b\u0001\u0000\u0000\u0000bc\u0005\f\u0000\u0000cd\u0005\r"+
		"\u0000\u0000di\u0006\u0006\uffff\uffff\u0000ef\u0005\u0006\u0000\u0000"+
		"fg\u0003\u0010\b\u0000gh\u0006\u0006\uffff\uffff\u0000hj\u0001\u0000\u0000"+
		"\u0000ie\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jv\u0001\u0000"+
		"\u0000\u0000kl\u0005\u0007\u0000\u0000lm\u0005\r\u0000\u0000mr\u0006\u0006"+
		"\uffff\uffff\u0000no\u0005\u0006\u0000\u0000op\u0003\u0010\b\u0000pq\u0006"+
		"\u0006\uffff\uffff\u0000qs\u0001\u0000\u0000\u0000rn\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tk\u0001\u0000"+
		"\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000w\r\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"yz\u0005\u000e\u0000\u0000z{\u0005\r\u0000\u0000{\u0080\u0006\u0007\uffff"+
		"\uffff\u0000|}\u0005\u0006\u0000\u0000}~\u0003\u0014\n\u0000~\u007f\u0006"+
		"\u0007\uffff\uffff\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080|\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u008d\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005\u0007\u0000\u0000\u0083\u0084\u0005"+
		"\r\u0000\u0000\u0084\u0089\u0006\u0007\uffff\uffff\u0000\u0085\u0086\u0005"+
		"\u0006\u0000\u0000\u0086\u0087\u0003\u0014\n\u0000\u0087\u0088\u0006\u0007"+
		"\uffff\uffff\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0085\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001"+
		"\u0000\u0000\u0000\u008b\u0082\u0001\u0000\u0000\u0000\u008c\u008f\u0001"+
		"\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u000f\u0001\u0000\u0000\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005\b\u0000\u0000\u0091\u0092\u0003\u0012"+
		"\t\u0000\u0092\u0098\u0006\b\uffff\uffff\u0000\u0093\u0094\u0003\u0012"+
		"\t\u0000\u0094\u0095\u0006\b\uffff\uffff\u0000\u0095\u0097\u0001\u0000"+
		"\u0000\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0005\t\u0000\u0000\u009c\u0011\u0001\u0000\u0000"+
		"\u0000\u009d\u00a1\u0006\t\uffff\uffff\u0000\u009e\u009f\u0003\u0014\n"+
		"\u0000\u009f\u00a0\u0006\t\uffff\uffff\u0000\u00a0\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a1\u009e\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a6\u0005\n\u0000\u0000"+
		"\u00a4\u00a5\u0005\u0015\u0000\u0000\u00a5\u00a7\u0005\u0012\u0000\u0000"+
		"\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00ae\u0006\t\uffff\uffff\u0000"+
		"\u00a9\u00aa\u0006\t\uffff\uffff\u0000\u00aa\u00ab\u0003\u0014\n\u0000"+
		"\u00ab\u00ac\u0006\t\uffff\uffff\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ad\u009d\u0001\u0000\u0000\u0000\u00ad\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ae\u0013\u0001\u0000\u0000\u0000\u00af\u00b0\u0003\u0016\u000b\u0000"+
		"\u00b0\u00b7\u0006\n\uffff\uffff\u0000\u00b1\u00b2\u0005\u0013\u0000\u0000"+
		"\u00b2\u00b3\u0003\u0016\u000b\u0000\u00b3\u00b4\u0006\n\uffff\uffff\u0000"+
		"\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u0015\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb\u0003\u0018\f\u0000\u00bb"+
		"\u00c2\u0006\u000b\uffff\uffff\u0000\u00bc\u00bd\u0005\u0014\u0000\u0000"+
		"\u00bd\u00be\u0003\u0018\f\u0000\u00be\u00bf\u0006\u000b\uffff\uffff\u0000"+
		"\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00bc\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u0017\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6\u0003\u001a\r\u0000\u00c6"+
		"\u00cb\u0006\f\uffff\uffff\u0000\u00c7\u00c8\u0005\u0015\u0000\u0000\u00c8"+
		"\u00c9\u0003\u0018\f\u0000\u00c9\u00ca\u0006\f\uffff\uffff\u0000\u00ca"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cc\u0019\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0003\u001c\u000e\u0000\u00ce\u00cf\u0006\r\uffff\uffff\u0000\u00cf"+
		"\u00ef\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u0002\u0000\u0000\u00d1"+
		"\u00d2\u0003\u0014\n\u0000\u00d2\u00d3\u0005\u0003\u0000\u0000\u00d3\u00d4"+
		"\u0006\r\uffff\uffff\u0000\u00d4\u00ef\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0005\u000b\u0000\u0000\u00d6\u00d7\u0005\u0002\u0000\u0000\u00d7\u00d8"+
		"\u0003\u0014\n\u0000\u00d8\u00d9\u0005\u0003\u0000\u0000\u00d9\u00da\u0006"+
		"\r\uffff\uffff\u0000\u00da\u00ef\u0001\u0000\u0000\u0000\u00db\u00dc\u0005"+
		"\u0016\u0000\u0000\u00dc\u00dd\u0005\u0002\u0000\u0000\u00dd\u00de\u0003"+
		"\u0014\n\u0000\u00de\u00e5\u0006\r\uffff\uffff\u0000\u00df\u00e0\u0005"+
		"\u0007\u0000\u0000\u00e0\u00e1\u0003\u0014\n\u0000\u00e1\u00e2\u0006\r"+
		"\uffff\uffff\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00df\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005"+
		"\u0003\u0000\u0000\u00e9\u00ef\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005"+
		"\u0013\u0000\u0000\u00eb\u00ec\u0003\u001a\r\u0000\u00ec\u00ed\u0006\r"+
		"\uffff\uffff\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00cd\u0001"+
		"\u0000\u0000\u0000\u00ee\u00d0\u0001\u0000\u0000\u0000\u00ee\u00d5\u0001"+
		"\u0000\u0000\u0000\u00ee\u00db\u0001\u0000\u0000\u0000\u00ee\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ef\u001b\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005"+
		"\u0012\u0000\u0000\u00f1\u00f5\u0006\u000e\uffff\uffff\u0000\u00f2\u00f3"+
		"\u0005\r\u0000\u0000\u00f3\u00f5\u0006\u000e\uffff\uffff\u0000\u00f4\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u001d"+
		"\u0001\u0000\u0000\u0000\u0015%-FV`irv\u0080\u0089\u008d\u0098\u00a1\u00a6"+
		"\u00ad\u00b7\u00c2\u00cb\u00e5\u00ee\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}