// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, LF=6, WS=7, SZAM=8, OPADD=9, OPMUL=10, 
		OPPWR=11, OPMINMAX=12, MEMORY=13, COMMENT=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "LF", "WS", "SZAM", "OPADD", 
			"OPMUL", "OPPWR", "OPMINMAX", "MEMORY", "COMMENT"
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


	    private double memorySlot = 0.0;
	    public static void main(String[] args) throws Exception {
	        CalculatorLexer lex = new CalculatorLexer(new ANTLRFileStream(args[0]));
	        CommonTokenStream tokens = new CommonTokenStream (lex);
	        CalculatorParser parser = new CalculatorParser(tokens);
	        parser.start();
	    }


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\u0004\u0000\u000eV\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0004\u0006-\b\u0006\u000b\u0006\f\u0006.\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0004\u00074\b\u0007\u000b\u0007\f\u00075\u0001\u0007\u0001"+
		"\u0007\u0004\u0007:\b\u0007\u000b\u0007\f\u0007;\u0003\u0007>\b\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bL\b\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0005\rR\b\r\n\r\f\rU\t\r\u0000\u0000"+
		"\u000e\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u0001\u0000\u0005\u0003\u0000\t\t\r\r  \u0001\u000009\u0002\u0000++-"+
		"-\u0002\u0000**//\u0001\u0000\n\n[\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003\u001f"+
		"\u0001\u0000\u0000\u0000\u0005!\u0001\u0000\u0000\u0000\u0007#\u0001\u0000"+
		"\u0000\u0000\t\'\u0001\u0000\u0000\u0000\u000b)\u0001\u0000\u0000\u0000"+
		"\r,\u0001\u0000\u0000\u0000\u000f3\u0001\u0000\u0000\u0000\u0011?\u0001"+
		"\u0000\u0000\u0000\u0013A\u0001\u0000\u0000\u0000\u0015C\u0001\u0000\u0000"+
		"\u0000\u0017K\u0001\u0000\u0000\u0000\u0019M\u0001\u0000\u0000\u0000\u001b"+
		"O\u0001\u0000\u0000\u0000\u001d\u001e\u0005=\u0000\u0000\u001e\u0002\u0001"+
		"\u0000\u0000\u0000\u001f \u0005(\u0000\u0000 \u0004\u0001\u0000\u0000"+
		"\u0000!\"\u0005)\u0000\u0000\"\u0006\u0001\u0000\u0000\u0000#$\u0005a"+
		"\u0000\u0000$%\u0005b\u0000\u0000%&\u0005s\u0000\u0000&\b\u0001\u0000"+
		"\u0000\u0000\'(\u0005,\u0000\u0000(\n\u0001\u0000\u0000\u0000)*\u0005"+
		"\n\u0000\u0000*\f\u0001\u0000\u0000\u0000+-\u0007\u0000\u0000\u0000,+"+
		"\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0006\u0006"+
		"\u0000\u00001\u000e\u0001\u0000\u0000\u000024\u0007\u0001\u0000\u0000"+
		"32\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u00006=\u0001\u0000\u0000\u000079\u0005.\u0000"+
		"\u00008:\u0007\u0001\u0000\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001"+
		"\u0000\u0000\u0000=7\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">\u0010\u0001\u0000\u0000\u0000?@\u0007\u0002\u0000\u0000@\u0012\u0001"+
		"\u0000\u0000\u0000AB\u0007\u0003\u0000\u0000B\u0014\u0001\u0000\u0000"+
		"\u0000CD\u0005^\u0000\u0000D\u0016\u0001\u0000\u0000\u0000EF\u0005m\u0000"+
		"\u0000FG\u0005i\u0000\u0000GL\u0005n\u0000\u0000HI\u0005m\u0000\u0000"+
		"IJ\u0005a\u0000\u0000JL\u0005x\u0000\u0000KE\u0001\u0000\u0000\u0000K"+
		"H\u0001\u0000\u0000\u0000L\u0018\u0001\u0000\u0000\u0000MN\u0005M\u0000"+
		"\u0000N\u001a\u0001\u0000\u0000\u0000OS\u0005#\u0000\u0000PR\b\u0004\u0000"+
		"\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000T\u001c\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000\u0007\u0000.5;=KS\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}