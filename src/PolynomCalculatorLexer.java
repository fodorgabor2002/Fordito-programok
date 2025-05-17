// Generated from java-escape by ANTLR 4.11.1

import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PolynomCalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, POLINOM_KULCSSZO=12, VALTOZO=13, SZAM_KULCSSZO=14, 
		SHOW_KULCSSZO=15, WS=16, NL=17, NUMBER=18, OPADD=19, OPMUL=20, OPPWR=21, 
		OPMINMAX=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "POLINOM_KULCSSZO", "VALTOZO", "SZAM_KULCSSZO", "SHOW_KULCSSZO", 
			"WS", "NL", "NUMBER", "OPADD", "OPMUL", "OPPWR", "OPMINMAX"
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


	    Map<String, Polinom> polinomok = new HashMap<>();
	    public void setPolinomok(Map<String, Polinom> polinomok) {
	        this.polinomok = polinomok;
	    }

	    Map<String, Double> szamValtozok = new HashMap<>();
	    public void setSzamValtozok(Map<String, Double> szamValtozok) {
	        this.szamValtozok = szamValtozok;
	    }


	public PolynomCalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PolynomCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u008b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0004\fQ\b\f\u000b\f\f\fR\u0003"+
		"\fU\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0004"+
		"\u000fd\b\u000f\u000b\u000f\f\u000fe\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0004\u0010k\b\u0010\u000b\u0010\f\u0010l\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0004\u0011r\b\u0011\u000b\u0011\f\u0011s\u0001\u0011\u0001\u0011"+
		"\u0004\u0011x\b\u0011\u000b\u0011\f\u0011y\u0003\u0011|\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u008a\b\u0015\u0000\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0006\u0004\u0000AWYZawyz\u0001"+
		"\u000009\u0003\u0000\t\t\r\r  \u0001\u0000\n\n\u0002\u0000++--\u0003\u0000"+
		"%%**//\u0092\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000"+
		"\u0000\u0003/\u0001\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000\u0007"+
		"3\u0001\u0000\u0000\u0000\t5\u0001\u0000\u0000\u0000\u000b7\u0001\u0000"+
		"\u0000\u0000\r9\u0001\u0000\u0000\u0000\u000f;\u0001\u0000\u0000\u0000"+
		"\u0011=\u0001\u0000\u0000\u0000\u0013?\u0001\u0000\u0000\u0000\u0015A"+
		"\u0001\u0000\u0000\u0000\u0017E\u0001\u0000\u0000\u0000\u0019M\u0001\u0000"+
		"\u0000\u0000\u001bV\u0001\u0000\u0000\u0000\u001d]\u0001\u0000\u0000\u0000"+
		"\u001fc\u0001\u0000\u0000\u0000!j\u0001\u0000\u0000\u0000#q\u0001\u0000"+
		"\u0000\u0000%}\u0001\u0000\u0000\u0000\'\u007f\u0001\u0000\u0000\u0000"+
		")\u0081\u0001\u0000\u0000\u0000+\u0089\u0001\u0000\u0000\u0000-.\u0005"+
		";\u0000\u0000.\u0002\u0001\u0000\u0000\u0000/0\u0005(\u0000\u00000\u0004"+
		"\u0001\u0000\u0000\u000012\u0005)\u0000\u00002\u0006\u0001\u0000\u0000"+
		"\u000034\u0005[\u0000\u00004\b\u0001\u0000\u0000\u000056\u0005]\u0000"+
		"\u00006\n\u0001\u0000\u0000\u000078\u0005=\u0000\u00008\f\u0001\u0000"+
		"\u0000\u00009:\u0005,\u0000\u0000:\u000e\u0001\u0000\u0000\u0000;<\u0005"+
		"<\u0000\u0000<\u0010\u0001\u0000\u0000\u0000=>\u0005>\u0000\u0000>\u0012"+
		"\u0001\u0000\u0000\u0000?@\u0005x\u0000\u0000@\u0014\u0001\u0000\u0000"+
		"\u0000AB\u0005a\u0000\u0000BC\u0005b\u0000\u0000CD\u0005s\u0000\u0000"+
		"D\u0016\u0001\u0000\u0000\u0000EF\u0005p\u0000\u0000FG\u0005o\u0000\u0000"+
		"GH\u0005l\u0000\u0000HI\u0005y\u0000\u0000IJ\u0005n\u0000\u0000JK\u0005"+
		"o\u0000\u0000KL\u0005m\u0000\u0000L\u0018\u0001\u0000\u0000\u0000MT\u0007"+
		"\u0000\u0000\u0000NP\u0005_\u0000\u0000OQ\u0007\u0001\u0000\u0000PO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TN\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000U\u001a\u0001\u0000\u0000\u0000VW\u0005"+
		"n\u0000\u0000WX\u0005u\u0000\u0000XY\u0005m\u0000\u0000YZ\u0005b\u0000"+
		"\u0000Z[\u0005e\u0000\u0000[\\\u0005r\u0000\u0000\\\u001c\u0001\u0000"+
		"\u0000\u0000]^\u0005s\u0000\u0000^_\u0005h\u0000\u0000_`\u0005o\u0000"+
		"\u0000`a\u0005w\u0000\u0000a\u001e\u0001\u0000\u0000\u0000bd\u0007\u0002"+
		"\u0000\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"gh\u0006\u000f\u0000\u0000h \u0001\u0000\u0000\u0000ik\u0007\u0003\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0006"+
		"\u0010\u0000\u0000o\"\u0001\u0000\u0000\u0000pr\u0007\u0001\u0000\u0000"+
		"qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000t{\u0001\u0000\u0000\u0000uw\u0005.\u0000"+
		"\u0000vx\u0007\u0001\u0000\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001"+
		"\u0000\u0000\u0000{u\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|$\u0001\u0000\u0000\u0000}~\u0007\u0004\u0000\u0000~&\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0007\u0005\u0000\u0000\u0080(\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005^\u0000\u0000\u0082*\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005m\u0000\u0000\u0084\u0085\u0005i\u0000\u0000\u0085\u008a\u0005n"+
		"\u0000\u0000\u0086\u0087\u0005m\u0000\u0000\u0087\u0088\u0005a\u0000\u0000"+
		"\u0088\u008a\u0005x\u0000\u0000\u0089\u0083\u0001\u0000\u0000\u0000\u0089"+
		"\u0086\u0001\u0000\u0000\u0000\u008a,\u0001\u0000\u0000\u0000\t\u0000"+
		"RTelsy{\u0089\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}