// Generated from java-escape by ANTLR 4.11.1

import java.util.*;

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
		RULE_kiertekelendoSzam = 4, RULE_polinomExpr = 5, RULE_polinomAddop = 6, 
		RULE_polinomMulop = 7, RULE_polinomFct = 8, RULE_polinomVagypolinomValtozo = 9, 
		RULE_valtozoErtekadas = 10, RULE_polinomDeklaracio = 11, RULE_szamValtozoDeklaracio = 12, 
		RULE_polinom = 13, RULE_xtag = 14, RULE_szamExpr = 15, RULE_szamAddop = 16, 
		RULE_szamMulop = 17, RULE_szamFct = 18, RULE_szamVagySzamValtozo = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "line", "showUtasitas", "kiertekeles", "kiertekelendoSzam", 
			"polinomExpr", "polinomAddop", "polinomMulop", "polinomFct", "polinomVagypolinomValtozo", 
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


	    Map<String, Polinom> polinomok = new HashMap<>();
	    public void setPolinomok(Map<String, Polinom> polinomok) {
	        this.polinomok = polinomok;
	    }

	    Map<String, Double> szamValtozok = new HashMap<>();
	    public void setSzamValtozok(Map<String, Double> szamValtozok) {
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
			setState(40);
			line();
			setState(41);
			match(T__0);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 585988L) != 0) {
				{
				{
				setState(42);
				line();
				setState(43);
				match(T__0);
				}
				}
				setState(49);
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
		public ShowUtasitasContext showUtasitas() {
			return getRuleContext(ShowUtasitasContext.class,0);
		}
		public KiertekelesContext kiertekeles() {
			return getRuleContext(KiertekelesContext.class,0);
		}
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
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				showUtasitas();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				kiertekeles();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				polinomDeklaracio();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				szamValtozoDeklaracio();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				valtozoErtekadas();
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
	public static class ShowUtasitasContext extends ParserRuleContext {
		public PolinomExprContext showPolinom;
		public Token VALTOZO;
		public SzamExprContext showSzamExpr;
		public KiertekelesContext kiertekeles;
		public TerminalNode SHOW_KULCSSZO() { return getToken(PolynomCalculatorParser.SHOW_KULCSSZO, 0); }
		public PolinomExprContext polinomExpr() {
			return getRuleContext(PolinomExprContext.class,0);
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(SHOW_KULCSSZO);
				setState(58);
				match(T__1);
				setState(59);
				((ShowUtasitasContext)_localctx).showPolinom = polinomExpr();
				setState(60);
				match(T__2);
				System.out.println(((ShowUtasitasContext)_localctx).showPolinom.polinomPeldany.toString());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(SHOW_KULCSSZO);
				setState(64);
				match(T__1);
				setState(65);
				((ShowUtasitasContext)_localctx).VALTOZO = match(VALTOZO);
				setState(66);
				match(T__2);

				        if (polinomok.containsKey((((ShowUtasitasContext)_localctx).VALTOZO!=null?((ShowUtasitasContext)_localctx).VALTOZO.getText():null))) System.out.println(polinomok.get((((ShowUtasitasContext)_localctx).VALTOZO!=null?((ShowUtasitasContext)_localctx).VALTOZO.getText():null)).toString());
				        else System.out.println(szamValtozok.get((((ShowUtasitasContext)_localctx).VALTOZO!=null?((ShowUtasitasContext)_localctx).VALTOZO.getText():null)));
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(SHOW_KULCSSZO);
				setState(69);
				match(T__1);
				setState(70);
				((ShowUtasitasContext)_localctx).showSzamExpr = szamExpr();
				setState(71);
				match(T__2);
				System.out.println(((ShowUtasitasContext)_localctx).showSzamExpr.value);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(SHOW_KULCSSZO);
				setState(75);
				match(T__1);
				setState(76);
				((ShowUtasitasContext)_localctx).kiertekeles = kiertekeles();
				setState(77);
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
		public PolinomExprContext kiertekelendoPolinomErtek;
		public KiertekelendoSzamContext fuggvenyertek;
		public PolinomExprContext polinomExpr() {
			return getRuleContext(PolinomExprContext.class,0);
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
			setState(82);
			((KiertekelesContext)_localctx).kiertekelendoPolinomErtek = polinomExpr();
			setState(83);
			((KiertekelesContext)_localctx).fuggvenyertek = kiertekelendoSzam();

			        Polinom polinom = ((KiertekelesContext)_localctx).kiertekelendoPolinomErtek.polinomPeldany;
			        ((KiertekelesContext)_localctx).kiertekeltErtek =  polinom.evaluatePolinom(((KiertekelesContext)_localctx).fuggvenyertek.value);
			    
			}
		}
		catch (RecognitionException re) {
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
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(T__3);
				setState(87);
				((KiertekelendoSzamContext)_localctx).ertekelendoSzam = szamExpr();
				setState(88);
				match(T__4);
				((KiertekelendoSzamContext)_localctx).value =  ((KiertekelendoSzamContext)_localctx).ertekelendoSzam.value;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(T__3);
				setState(92);
				((KiertekelendoSzamContext)_localctx).belsoKiertekeles = kiertekeles();
				setState(93);
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
	public static class PolinomExprContext extends ParserRuleContext {
		public Polinom polinomPeldany;
		public PolinomAddopContext fstop;
		public Token OPADD;
		public PolinomAddopContext nxtop;
		public List<PolinomAddopContext> polinomAddop() {
			return getRuleContexts(PolinomAddopContext.class);
		}
		public PolinomAddopContext polinomAddop(int i) {
			return getRuleContext(PolinomAddopContext.class,i);
		}
		public List<TerminalNode> OPADD() { return getTokens(PolynomCalculatorParser.OPADD); }
		public TerminalNode OPADD(int i) {
			return getToken(PolynomCalculatorParser.OPADD, i);
		}
		public PolinomExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polinomExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterPolinomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitPolinomExpr(this);
		}
	}

	public final PolinomExprContext polinomExpr() throws RecognitionException {
		PolinomExprContext _localctx = new PolinomExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_polinomExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((PolinomExprContext)_localctx).fstop = polinomAddop();
			 ((PolinomExprContext)_localctx).polinomPeldany =  ((PolinomExprContext)_localctx).fstop.polinomPeldany; 
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPADD) {
				{
				{
				setState(100);
				((PolinomExprContext)_localctx).OPADD = match(OPADD);
				setState(101);
				((PolinomExprContext)_localctx).nxtop = polinomAddop();
				 if ("+".equals((((PolinomExprContext)_localctx).OPADD!=null?((PolinomExprContext)_localctx).OPADD.getText():null))) ((PolinomExprContext)_localctx).polinomPeldany =  _localctx.polinomPeldany.add(((PolinomExprContext)_localctx).nxtop.polinomPeldany); else ((PolinomExprContext)_localctx).polinomPeldany =  _localctx.polinomPeldany.subtract(((PolinomExprContext)_localctx).nxtop.polinomPeldany); 
				}
				}
				setState(108);
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
	public static class PolinomAddopContext extends ParserRuleContext {
		public Polinom polinomPeldany;
		public PolinomMulopContext fstop;
		public Token OPMUL;
		public PolinomMulopContext nxtop;
		public List<PolinomMulopContext> polinomMulop() {
			return getRuleContexts(PolinomMulopContext.class);
		}
		public PolinomMulopContext polinomMulop(int i) {
			return getRuleContext(PolinomMulopContext.class,i);
		}
		public List<TerminalNode> OPMUL() { return getTokens(PolynomCalculatorParser.OPMUL); }
		public TerminalNode OPMUL(int i) {
			return getToken(PolynomCalculatorParser.OPMUL, i);
		}
		public PolinomAddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polinomAddop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterPolinomAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitPolinomAddop(this);
		}
	}

	public final PolinomAddopContext polinomAddop() throws RecognitionException {
		PolinomAddopContext _localctx = new PolinomAddopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_polinomAddop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((PolinomAddopContext)_localctx).fstop = polinomMulop();
			 ((PolinomAddopContext)_localctx).polinomPeldany =  ((PolinomAddopContext)_localctx).fstop.polinomPeldany; 
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPMUL) {
				{
				{
				setState(111);
				((PolinomAddopContext)_localctx).OPMUL = match(OPMUL);
				setState(112);
				((PolinomAddopContext)_localctx).nxtop = polinomMulop();
				 if ("*".equals((((PolinomAddopContext)_localctx).OPMUL!=null?((PolinomAddopContext)_localctx).OPMUL.getText():null))) ((PolinomAddopContext)_localctx).polinomPeldany =  _localctx.polinomPeldany.multiply(((PolinomAddopContext)_localctx).nxtop.polinomPeldany); else if ("/".equals((((PolinomAddopContext)_localctx).OPMUL!=null?((PolinomAddopContext)_localctx).OPMUL.getText():null))) ((PolinomAddopContext)_localctx).polinomPeldany =  _localctx.polinomPeldany.divide(((PolinomAddopContext)_localctx).nxtop.polinomPeldany)[0]; else ((PolinomAddopContext)_localctx).polinomPeldany =  _localctx.polinomPeldany.divide(((PolinomAddopContext)_localctx).nxtop.polinomPeldany)[1]; 
				}
				}
				setState(119);
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
	public static class PolinomMulopContext extends ParserRuleContext {
		public Polinom polinomPeldany;
		public PolinomFctContext fstop;
		public PolinomFctContext polinomFct() {
			return getRuleContext(PolinomFctContext.class,0);
		}
		public PolinomMulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polinomMulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterPolinomMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitPolinomMulop(this);
		}
	}

	public final PolinomMulopContext polinomMulop() throws RecognitionException {
		PolinomMulopContext _localctx = new PolinomMulopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_polinomMulop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			((PolinomMulopContext)_localctx).fstop = polinomFct();
			 ((PolinomMulopContext)_localctx).polinomPeldany =  ((PolinomMulopContext)_localctx).fstop.polinomPeldany; 
			}
		}
		catch (RecognitionException re) {
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
	public static class PolinomFctContext extends ParserRuleContext {
		public Polinom polinomPeldany;
		public PolinomVagypolinomValtozoContext csakpolinom;
		public PolinomExprContext polinomExpr;
		public Token OPADD;
		public PolinomFctContext polinomFct;
		public PolinomVagypolinomValtozoContext polinomVagypolinomValtozo() {
			return getRuleContext(PolinomVagypolinomValtozoContext.class,0);
		}
		public PolinomExprContext polinomExpr() {
			return getRuleContext(PolinomExprContext.class,0);
		}
		public TerminalNode OPADD() { return getToken(PolynomCalculatorParser.OPADD, 0); }
		public PolinomFctContext polinomFct() {
			return getRuleContext(PolinomFctContext.class,0);
		}
		public PolinomFctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polinomFct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterPolinomFct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitPolinomFct(this);
		}
	}

	public final PolinomFctContext polinomFct() throws RecognitionException {
		PolinomFctContext _localctx = new PolinomFctContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_polinomFct);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case VALTOZO:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				((PolinomFctContext)_localctx).csakpolinom = polinomVagypolinomValtozo();
				 ((PolinomFctContext)_localctx).polinomPeldany =  ((PolinomFctContext)_localctx).csakpolinom.polinomPeldany; 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__1);
				setState(127);
				((PolinomFctContext)_localctx).polinomExpr = polinomExpr();
				setState(128);
				match(T__2);
				 ((PolinomFctContext)_localctx).polinomPeldany =  ((PolinomFctContext)_localctx).polinomExpr.polinomPeldany; 
				}
				break;
			case OPADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				((PolinomFctContext)_localctx).OPADD = match(OPADD);
				setState(132);
				((PolinomFctContext)_localctx).polinomFct = polinomFct();
				 ((PolinomFctContext)_localctx).polinomPeldany =  "-".equals((((PolinomFctContext)_localctx).OPADD!=null?((PolinomFctContext)_localctx).OPADD.getText():null)) ? ((PolinomFctContext)_localctx).polinomFct.polinomPeldany.subtract(((PolinomFctContext)_localctx).polinomFct.polinomPeldany.add(((PolinomFctContext)_localctx).polinomFct.polinomPeldany)) : ((PolinomFctContext)_localctx).polinomFct.polinomPeldany; 
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
	public static class PolinomVagypolinomValtozoContext extends ParserRuleContext {
		public Polinom polinomPeldany;
		public PolinomContext legmelyebbPolinom;
		public Token VALTOZO;
		public PolinomContext polinom() {
			return getRuleContext(PolinomContext.class,0);
		}
		public TerminalNode VALTOZO() { return getToken(PolynomCalculatorParser.VALTOZO, 0); }
		public PolinomVagypolinomValtozoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polinomVagypolinomValtozo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).enterPolinomVagypolinomValtozo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolynomCalculatorListener ) ((PolynomCalculatorListener)listener).exitPolinomVagypolinomValtozo(this);
		}
	}

	public final PolinomVagypolinomValtozoContext polinomVagypolinomValtozo() throws RecognitionException {
		PolinomVagypolinomValtozoContext _localctx = new PolinomVagypolinomValtozoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_polinomVagypolinomValtozo);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				((PolinomVagypolinomValtozoContext)_localctx).legmelyebbPolinom = polinom();
				 ((PolinomVagypolinomValtozoContext)_localctx).polinomPeldany =  ((PolinomVagypolinomValtozoContext)_localctx).legmelyebbPolinom.polinomPeldany; 
				}
				break;
			case VALTOZO:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				((PolinomVagypolinomValtozoContext)_localctx).VALTOZO = match(VALTOZO);
				 ((PolinomVagypolinomValtozoContext)_localctx).polinomPeldany =  polinomok.get((((PolinomVagypolinomValtozoContext)_localctx).VALTOZO!=null?((PolinomVagypolinomValtozoContext)_localctx).VALTOZO.getText():null)); 
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
		public PolinomExprContext polinomExpr;
		public SzamExprContext szamExpr;
		public TerminalNode VALTOZO() { return getToken(PolynomCalculatorParser.VALTOZO, 0); }
		public PolinomExprContext polinomExpr() {
			return getRuleContext(PolinomExprContext.class,0);
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
		enterRule(_localctx, 20, RULE_valtozoErtekadas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			((ValtozoErtekadasContext)_localctx).VALTOZO = match(VALTOZO);
			setState(145);
			match(T__5);
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(146);
				((ValtozoErtekadasContext)_localctx).polinomExpr = polinomExpr();
				polinomok.put((((ValtozoErtekadasContext)_localctx).VALTOZO!=null?((ValtozoErtekadasContext)_localctx).VALTOZO.getText():null), ((ValtozoErtekadasContext)_localctx).polinomExpr.polinomPeldany);
				}
				break;
			case 2:
				{
				setState(149);
				((ValtozoErtekadasContext)_localctx).szamExpr = szamExpr();
				szamValtozok.put((((ValtozoErtekadasContext)_localctx).VALTOZO!=null?((ValtozoErtekadasContext)_localctx).VALTOZO.getText():null), ((ValtozoErtekadasContext)_localctx).szamExpr.value);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PolinomDeklaracioContext extends ParserRuleContext {
		public Token alapValtozo;
		public PolinomExprContext alapPolinom;
		public Token ismetlodoValtozo;
		public PolinomExprContext ismetlodoPolinom;
		public TerminalNode POLINOM_KULCSSZO() { return getToken(PolynomCalculatorParser.POLINOM_KULCSSZO, 0); }
		public List<TerminalNode> VALTOZO() { return getTokens(PolynomCalculatorParser.VALTOZO); }
		public TerminalNode VALTOZO(int i) {
			return getToken(PolynomCalculatorParser.VALTOZO, i);
		}
		public List<PolinomExprContext> polinomExpr() {
			return getRuleContexts(PolinomExprContext.class);
		}
		public PolinomExprContext polinomExpr(int i) {
			return getRuleContext(PolinomExprContext.class,i);
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
		enterRule(_localctx, 22, RULE_polinomDeklaracio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(POLINOM_KULCSSZO);
			setState(155);
			((PolinomDeklaracioContext)_localctx).alapValtozo = match(VALTOZO);
			polinomok.put((((PolinomDeklaracioContext)_localctx).alapValtozo!=null?((PolinomDeklaracioContext)_localctx).alapValtozo.getText():null), new Polinom());
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(157);
				match(T__5);
				setState(158);
				((PolinomDeklaracioContext)_localctx).alapPolinom = polinomExpr();
				polinomok.put((((PolinomDeklaracioContext)_localctx).alapValtozo!=null?((PolinomDeklaracioContext)_localctx).alapValtozo.getText():null), ((PolinomDeklaracioContext)_localctx).alapPolinom.polinomPeldany);
				}
			}

			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(163);
				match(T__6);
				setState(164);
				((PolinomDeklaracioContext)_localctx).ismetlodoValtozo = match(VALTOZO);
				polinomok.put((((PolinomDeklaracioContext)_localctx).ismetlodoValtozo!=null?((PolinomDeklaracioContext)_localctx).ismetlodoValtozo.getText():null), new Polinom());
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(166);
					match(T__5);
					setState(167);
					((PolinomDeklaracioContext)_localctx).ismetlodoPolinom = polinomExpr();
					polinomok.put((((PolinomDeklaracioContext)_localctx).ismetlodoValtozo!=null?((PolinomDeklaracioContext)_localctx).ismetlodoValtozo.getText():null), ((PolinomDeklaracioContext)_localctx).ismetlodoPolinom.polinomPeldany);
					}
				}

				}
				}
				setState(176);
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
		enterRule(_localctx, 24, RULE_szamValtozoDeklaracio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(SZAM_KULCSSZO);
			setState(178);
			((SzamValtozoDeklaracioContext)_localctx).alapValtozo = match(VALTOZO);
			szamValtozok.put((((SzamValtozoDeklaracioContext)_localctx).alapValtozo!=null?((SzamValtozoDeklaracioContext)_localctx).alapValtozo.getText():null), 0d);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(180);
				match(T__5);
				setState(181);
				((SzamValtozoDeklaracioContext)_localctx).alapErtek = szamExpr();
				szamValtozok.put((((SzamValtozoDeklaracioContext)_localctx).alapValtozo!=null?((SzamValtozoDeklaracioContext)_localctx).alapValtozo.getText():null), ((SzamValtozoDeklaracioContext)_localctx).alapErtek.value);
				}
			}

			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(186);
				match(T__6);
				setState(187);
				((SzamValtozoDeklaracioContext)_localctx).ismetlodoValtozo = match(VALTOZO);
				szamValtozok.put((((SzamValtozoDeklaracioContext)_localctx).ismetlodoValtozo!=null?((SzamValtozoDeklaracioContext)_localctx).ismetlodoValtozo.getText():null), 0d);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(189);
					match(T__5);
					setState(190);
					((SzamValtozoDeklaracioContext)_localctx).ismetlodoErtek = szamExpr();
					szamValtozok.put((((SzamValtozoDeklaracioContext)_localctx).ismetlodoValtozo!=null?((SzamValtozoDeklaracioContext)_localctx).ismetlodoValtozo.getText():null), ((SzamValtozoDeklaracioContext)_localctx).ismetlodoErtek.value);
					}
				}

				}
				}
				setState(199);
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
		enterRule(_localctx, 26, RULE_polinom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__7);
			setState(201);
			((PolinomContext)_localctx).alapTag = xtag();

			        ((PolinomContext)_localctx).polinomPeldany =  new Polinom();
			        _localctx.polinomPeldany.addTerm(((PolinomContext)_localctx).alapTag.xtagPeldany);
			    
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4992004L) != 0) {
				{
				{
				setState(203);
				((PolinomContext)_localctx).ismetlodoTag = xtag();

				        _localctx.polinomPeldany.addTerm(((PolinomContext)_localctx).ismetlodoTag.xtagPeldany);
				    
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
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
		enterRule(_localctx, 28, RULE_xtag);
		int _la;
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				((XtagContext)_localctx).xtagPeldany =  new XTag();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4990980L) != 0) {
					{
					setState(214);
					((XtagContext)_localctx).prefix = szamExpr();
					_localctx.xtagPeldany.egyutthato = ((XtagContext)_localctx).prefix.value;
					}
				}

				setState(219);
				match(T__9);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPPWR) {
					{
					setState(220);
					match(OPPWR);
					setState(221);
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
				setState(226);
				((XtagContext)_localctx).szamTag = szamExpr();

				        _localctx.xtagPeldany.xSzoveg = "";
				        _localctx.xtagPeldany.egyutthato = ((XtagContext)_localctx).szamTag.value;
				        _localctx.xtagPeldany.hatvany = 0;
				    
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
		enterRule(_localctx, 30, RULE_szamExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			((SzamExprContext)_localctx).fstop = szamAddop();
			 ((SzamExprContext)_localctx).value =  ((SzamExprContext)_localctx).fstop.value; 
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					((SzamExprContext)_localctx).OPADD = match(OPADD);
					setState(234);
					((SzamExprContext)_localctx).nxtop = szamAddop();
					 if ("+".equals((((SzamExprContext)_localctx).OPADD!=null?((SzamExprContext)_localctx).OPADD.getText():null))) _localctx.value += ((SzamExprContext)_localctx).nxtop.value; else _localctx.value -= ((SzamExprContext)_localctx).nxtop.value; 
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 32, RULE_szamAddop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			((SzamAddopContext)_localctx).fstop = szamMulop();
			 ((SzamAddopContext)_localctx).value =  ((SzamAddopContext)_localctx).fstop.value; 
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPMUL) {
				{
				{
				setState(244);
				((SzamAddopContext)_localctx).OPMUL = match(OPMUL);
				setState(245);
				((SzamAddopContext)_localctx).nxtop = szamMulop();
				 if ("*".equals((((SzamAddopContext)_localctx).OPMUL!=null?((SzamAddopContext)_localctx).OPMUL.getText():null))) _localctx.value *= ((SzamAddopContext)_localctx).nxtop.value; else _localctx.value /= ((SzamAddopContext)_localctx).nxtop.value; 
				}
				}
				setState(252);
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
		enterRule(_localctx, 34, RULE_szamMulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			((SzamMulopContext)_localctx).fstop = szamFct();
			 ((SzamMulopContext)_localctx).value =  ((SzamMulopContext)_localctx).fstop.value; 
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPPWR) {
				{
				setState(255);
				match(OPPWR);
				setState(256);
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
		enterRule(_localctx, 36, RULE_szamFct);
		int _la;
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALTOZO:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				((SzamFctContext)_localctx).csakSzam = szamVagySzamValtozo();
				 ((SzamFctContext)_localctx).value =  ((SzamFctContext)_localctx).csakSzam.value; 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(T__1);
				setState(265);
				((SzamFctContext)_localctx).szamExpr = szamExpr();
				setState(266);
				match(T__2);
				 ((SzamFctContext)_localctx).value =  ((SzamFctContext)_localctx).szamExpr.value; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(T__10);
				setState(270);
				match(T__1);
				setState(271);
				((SzamFctContext)_localctx).szamExpr = szamExpr();
				setState(272);
				match(T__2);
				 ((SzamFctContext)_localctx).value =  Math.abs(((SzamFctContext)_localctx).szamExpr.value); 
				}
				break;
			case OPMINMAX:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				match(OPMINMAX);
				setState(276);
				match(T__1);
				setState(277);
				((SzamFctContext)_localctx).fstop = szamExpr();
				 ((SzamFctContext)_localctx).value =  ((SzamFctContext)_localctx).fstop.value; 
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(279);
					match(T__6);
					setState(280);
					((SzamFctContext)_localctx).nxtop = szamExpr();

					        if ("min".equals(OPMINMAX) && ((SzamFctContext)_localctx).nxtop.value < _localctx.value) ((SzamFctContext)_localctx).value =  ((SzamFctContext)_localctx).nxtop.value;
					        else if ("max".equals(OPMINMAX) && ((SzamFctContext)_localctx).nxtop.value > _localctx.value) ((SzamFctContext)_localctx).value =  ((SzamFctContext)_localctx).nxtop.value;
					    
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(288);
				match(T__2);
				}
				break;
			case OPADD:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				((SzamFctContext)_localctx).OPADD = match(OPADD);
				setState(291);
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
		enterRule(_localctx, 38, RULE_szamVagySzamValtozo);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				((SzamVagySzamValtozoContext)_localctx).NUMBER = match(NUMBER);
				 ((SzamVagySzamValtozoContext)_localctx).value =  Double.parseDouble((((SzamVagySzamValtozoContext)_localctx).NUMBER!=null?((SzamVagySzamValtozoContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case VALTOZO:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
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
		"\u0004\u0001\u0016\u012f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000.\b\u0000\n\u0000\f\u00001\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00018\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002Q\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004a\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005i\b\u0005\n\u0005\f\u0005l\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006t\b\u0006\n\u0006"+
		"\f\u0006w\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0088\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u008f\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0099\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a2\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00ab\b\u000b\u0005\u000b\u00ad\b\u000b\n\u000b\f\u000b\u00b0\t"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u00b9\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00c2\b\f\u0005\f\u00c4\b\f\n\f\f\f\u00c7\t\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u00cf\b\r\n\r\f\r\u00d2\t\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00da"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00df\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00e6\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00ee\b\u000f\n\u000f\f\u000f\u00f1\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u00f9\b\u0010\n\u0010\f\u0010\u00fc\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0104\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u011c\b\u0012"+
		"\n\u0012\f\u0012\u011f\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0127\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u012d\b\u0013\u0001\u0013\u0000"+
		"\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&\u0000\u0000\u013c\u0000(\u0001\u0000\u0000"+
		"\u0000\u00027\u0001\u0000\u0000\u0000\u0004P\u0001\u0000\u0000\u0000\u0006"+
		"R\u0001\u0000\u0000\u0000\b`\u0001\u0000\u0000\u0000\nb\u0001\u0000\u0000"+
		"\u0000\fm\u0001\u0000\u0000\u0000\u000ex\u0001\u0000\u0000\u0000\u0010"+
		"\u0087\u0001\u0000\u0000\u0000\u0012\u008e\u0001\u0000\u0000\u0000\u0014"+
		"\u0090\u0001\u0000\u0000\u0000\u0016\u009a\u0001\u0000\u0000\u0000\u0018"+
		"\u00b1\u0001\u0000\u0000\u0000\u001a\u00c8\u0001\u0000\u0000\u0000\u001c"+
		"\u00e5\u0001\u0000\u0000\u0000\u001e\u00e7\u0001\u0000\u0000\u0000 \u00f2"+
		"\u0001\u0000\u0000\u0000\"\u00fd\u0001\u0000\u0000\u0000$\u0126\u0001"+
		"\u0000\u0000\u0000&\u012c\u0001\u0000\u0000\u0000()\u0003\u0002\u0001"+
		"\u0000)/\u0005\u0001\u0000\u0000*+\u0003\u0002\u0001\u0000+,\u0005\u0001"+
		"\u0000\u0000,.\u0001\u0000\u0000\u0000-*\u0001\u0000\u0000\u0000.1\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"0\u0001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000028\u0003\u0004"+
		"\u0002\u000038\u0003\u0006\u0003\u000048\u0003\u0016\u000b\u000058\u0003"+
		"\u0018\f\u000068\u0003\u0014\n\u000072\u0001\u0000\u0000\u000073\u0001"+
		"\u0000\u0000\u000074\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"76\u0001\u0000\u0000\u00008\u0003\u0001\u0000\u0000\u00009:\u0005\u000f"+
		"\u0000\u0000:;\u0005\u0002\u0000\u0000;<\u0003\n\u0005\u0000<=\u0005\u0003"+
		"\u0000\u0000=>\u0006\u0002\uffff\uffff\u0000>Q\u0001\u0000\u0000\u0000"+
		"?@\u0005\u000f\u0000\u0000@A\u0005\u0002\u0000\u0000AB\u0005\r\u0000\u0000"+
		"BC\u0005\u0003\u0000\u0000CQ\u0006\u0002\uffff\uffff\u0000DE\u0005\u000f"+
		"\u0000\u0000EF\u0005\u0002\u0000\u0000FG\u0003\u001e\u000f\u0000GH\u0005"+
		"\u0003\u0000\u0000HI\u0006\u0002\uffff\uffff\u0000IQ\u0001\u0000\u0000"+
		"\u0000JK\u0005\u000f\u0000\u0000KL\u0005\u0002\u0000\u0000LM\u0003\u0006"+
		"\u0003\u0000MN\u0005\u0003\u0000\u0000NO\u0006\u0002\uffff\uffff\u0000"+
		"OQ\u0001\u0000\u0000\u0000P9\u0001\u0000\u0000\u0000P?\u0001\u0000\u0000"+
		"\u0000PD\u0001\u0000\u0000\u0000PJ\u0001\u0000\u0000\u0000Q\u0005\u0001"+
		"\u0000\u0000\u0000RS\u0003\n\u0005\u0000ST\u0003\b\u0004\u0000TU\u0006"+
		"\u0003\uffff\uffff\u0000U\u0007\u0001\u0000\u0000\u0000VW\u0005\u0004"+
		"\u0000\u0000WX\u0003\u001e\u000f\u0000XY\u0005\u0005\u0000\u0000YZ\u0006"+
		"\u0004\uffff\uffff\u0000Za\u0001\u0000\u0000\u0000[\\\u0005\u0004\u0000"+
		"\u0000\\]\u0003\u0006\u0003\u0000]^\u0005\u0005\u0000\u0000^_\u0006\u0004"+
		"\uffff\uffff\u0000_a\u0001\u0000\u0000\u0000`V\u0001\u0000\u0000\u0000"+
		"`[\u0001\u0000\u0000\u0000a\t\u0001\u0000\u0000\u0000bc\u0003\f\u0006"+
		"\u0000cj\u0006\u0005\uffff\uffff\u0000de\u0005\u0013\u0000\u0000ef\u0003"+
		"\f\u0006\u0000fg\u0006\u0005\uffff\uffff\u0000gi\u0001\u0000\u0000\u0000"+
		"hd\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000k\u000b\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000mn\u0003\u000e\u0007\u0000nu\u0006\u0006\uffff\uffff"+
		"\u0000op\u0005\u0014\u0000\u0000pq\u0003\u000e\u0007\u0000qr\u0006\u0006"+
		"\uffff\uffff\u0000rt\u0001\u0000\u0000\u0000so\u0001\u0000\u0000\u0000"+
		"tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000v\r\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0003\u0010"+
		"\b\u0000yz\u0006\u0007\uffff\uffff\u0000z\u000f\u0001\u0000\u0000\u0000"+
		"{|\u0003\u0012\t\u0000|}\u0006\b\uffff\uffff\u0000}\u0088\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005\u0002\u0000\u0000\u007f\u0080\u0003\n\u0005"+
		"\u0000\u0080\u0081\u0005\u0003\u0000\u0000\u0081\u0082\u0006\b\uffff\uffff"+
		"\u0000\u0082\u0088\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0013\u0000"+
		"\u0000\u0084\u0085\u0003\u0010\b\u0000\u0085\u0086\u0006\b\uffff\uffff"+
		"\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087{\u0001\u0000\u0000\u0000"+
		"\u0087~\u0001\u0000\u0000\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0088"+
		"\u0011\u0001\u0000\u0000\u0000\u0089\u008a\u0003\u001a\r\u0000\u008a\u008b"+
		"\u0006\t\uffff\uffff\u0000\u008b\u008f\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005\r\u0000\u0000\u008d\u008f\u0006\t\uffff\uffff\u0000\u008e\u0089"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0013"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005\r\u0000\u0000\u0091\u0098\u0005"+
		"\u0006\u0000\u0000\u0092\u0093\u0003\n\u0005\u0000\u0093\u0094\u0006\n"+
		"\uffff\uffff\u0000\u0094\u0099\u0001\u0000\u0000\u0000\u0095\u0096\u0003"+
		"\u001e\u000f\u0000\u0096\u0097\u0006\n\uffff\uffff\u0000\u0097\u0099\u0001"+
		"\u0000\u0000\u0000\u0098\u0092\u0001\u0000\u0000\u0000\u0098\u0095\u0001"+
		"\u0000\u0000\u0000\u0099\u0015\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"\f\u0000\u0000\u009b\u009c\u0005\r\u0000\u0000\u009c\u00a1\u0006\u000b"+
		"\uffff\uffff\u0000\u009d\u009e\u0005\u0006\u0000\u0000\u009e\u009f\u0003"+
		"\n\u0005\u0000\u009f\u00a0\u0006\u000b\uffff\uffff\u0000\u00a0\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u00ae\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"\u0007\u0000\u0000\u00a4\u00a5\u0005\r\u0000\u0000\u00a5\u00aa\u0006\u000b"+
		"\uffff\uffff\u0000\u00a6\u00a7\u0005\u0006\u0000\u0000\u00a7\u00a8\u0003"+
		"\n\u0005\u0000\u00a8\u00a9\u0006\u000b\uffff\uffff\u0000\u00a9\u00ab\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a6\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00a3\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u0017\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"\u000e\u0000\u0000\u00b2\u00b3\u0005\r\u0000\u0000\u00b3\u00b8\u0006\f"+
		"\uffff\uffff\u0000\u00b4\u00b5\u0005\u0006\u0000\u0000\u00b5\u00b6\u0003"+
		"\u001e\u000f\u0000\u00b6\u00b7\u0006\f\uffff\uffff\u0000\u00b7\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b4\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00c5\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005"+
		"\u0007\u0000\u0000\u00bb\u00bc\u0005\r\u0000\u0000\u00bc\u00c1\u0006\f"+
		"\uffff\uffff\u0000\u00bd\u00be\u0005\u0006\u0000\u0000\u00be\u00bf\u0003"+
		"\u001e\u000f\u0000\u00bf\u00c0\u0006\f\uffff\uffff\u0000\u00c0\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00ba\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u0019\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"\b\u0000\u0000\u00c9\u00ca\u0003\u001c\u000e\u0000\u00ca\u00d0\u0006\r"+
		"\uffff\uffff\u0000\u00cb\u00cc\u0003\u001c\u000e\u0000\u00cc\u00cd\u0006"+
		"\r\uffff\uffff\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005"+
		"\t\u0000\u0000\u00d4\u001b\u0001\u0000\u0000\u0000\u00d5\u00d9\u0006\u000e"+
		"\uffff\uffff\u0000\u00d6\u00d7\u0003\u001e\u000f\u0000\u00d7\u00d8\u0006"+
		"\u000e\uffff\uffff\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0001\u0000\u0000\u0000\u00db\u00de\u0005\n\u0000\u0000\u00dc\u00dd\u0005"+
		"\u0015\u0000\u0000\u00dd\u00df\u0005\u0012\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e6\u0006\u000e\uffff\uffff\u0000\u00e1\u00e2"+
		"\u0006\u000e\uffff\uffff\u0000\u00e2\u00e3\u0003\u001e\u000f\u0000\u00e3"+
		"\u00e4\u0006\u000e\uffff\uffff\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e5\u00d5\u0001\u0000\u0000\u0000\u00e5\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e6\u001d\u0001\u0000\u0000\u0000\u00e7\u00e8\u0003 \u0010\u0000\u00e8"+
		"\u00ef\u0006\u000f\uffff\uffff\u0000\u00e9\u00ea\u0005\u0013\u0000\u0000"+
		"\u00ea\u00eb\u0003 \u0010\u0000\u00eb\u00ec\u0006\u000f\uffff\uffff\u0000"+
		"\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00e9\u0001\u0000\u0000\u0000"+
		"\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u001f\u0001\u0000\u0000\u0000"+
		"\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f3\u0003\"\u0011\u0000\u00f3"+
		"\u00fa\u0006\u0010\uffff\uffff\u0000\u00f4\u00f5\u0005\u0014\u0000\u0000"+
		"\u00f5\u00f6\u0003\"\u0011\u0000\u00f6\u00f7\u0006\u0010\uffff\uffff\u0000"+
		"\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb!\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003$\u0012\u0000\u00fe\u0103"+
		"\u0006\u0011\uffff\uffff\u0000\u00ff\u0100\u0005\u0015\u0000\u0000\u0100"+
		"\u0101\u0003\"\u0011\u0000\u0101\u0102\u0006\u0011\uffff\uffff\u0000\u0102"+
		"\u0104\u0001\u0000\u0000\u0000\u0103\u00ff\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0001\u0000\u0000\u0000\u0104#\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\u0003&\u0013\u0000\u0106\u0107\u0006\u0012\uffff\uffff\u0000\u0107\u0127"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u0002\u0000\u0000\u0109\u010a"+
		"\u0003\u001e\u000f\u0000\u010a\u010b\u0005\u0003\u0000\u0000\u010b\u010c"+
		"\u0006\u0012\uffff\uffff\u0000\u010c\u0127\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0005\u000b\u0000\u0000\u010e\u010f\u0005\u0002\u0000\u0000\u010f"+
		"\u0110\u0003\u001e\u000f\u0000\u0110\u0111\u0005\u0003\u0000\u0000\u0111"+
		"\u0112\u0006\u0012\uffff\uffff\u0000\u0112\u0127\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0005\u0016\u0000\u0000\u0114\u0115\u0005\u0002\u0000\u0000"+
		"\u0115\u0116\u0003\u001e\u000f\u0000\u0116\u011d\u0006\u0012\uffff\uffff"+
		"\u0000\u0117\u0118\u0005\u0007\u0000\u0000\u0118\u0119\u0003\u001e\u000f"+
		"\u0000\u0119\u011a\u0006\u0012\uffff\uffff\u0000\u011a\u011c\u0001\u0000"+
		"\u0000\u0000\u011b\u0117\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000"+
		"\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000"+
		"\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0005\u0003\u0000\u0000\u0121\u0127\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0005\u0013\u0000\u0000\u0123\u0124\u0003$\u0012"+
		"\u0000\u0124\u0125\u0006\u0012\uffff\uffff\u0000\u0125\u0127\u0001\u0000"+
		"\u0000\u0000\u0126\u0105\u0001\u0000\u0000\u0000\u0126\u0108\u0001\u0000"+
		"\u0000\u0000\u0126\u010d\u0001\u0000\u0000\u0000\u0126\u0113\u0001\u0000"+
		"\u0000\u0000\u0126\u0122\u0001\u0000\u0000\u0000\u0127%\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0005\u0012\u0000\u0000\u0129\u012d\u0006\u0013\uffff"+
		"\uffff\u0000\u012a\u012b\u0005\r\u0000\u0000\u012b\u012d\u0006\u0013\uffff"+
		"\uffff\u0000\u012c\u0128\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000"+
		"\u0000\u0000\u012d\'\u0001\u0000\u0000\u0000\u0019/7P`ju\u0087\u008e\u0098"+
		"\u00a1\u00aa\u00ae\u00b8\u00c1\u00c5\u00d0\u00d9\u00de\u00e5\u00ef\u00fa"+
		"\u0103\u011d\u0126\u012c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}