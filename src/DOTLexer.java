// Generated from C:/Users/gmllo/Desktop/PLS3520/finalproj/src\DOT.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DOTLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, STRICT=5, GRAPH=6, DIGRAPH=7, NODE=8, 
		EDGE=9, SUBGRAPH=10, NUMBER=11, STRING=12, EDGEOPERAND=13, LBRACK=14, 
		RBRACK=15, SEMI=16, LCURLY=17, RCURLY=18, EQUALS=19, ID=20, HTML_STRING=21, 
		COMMENT=22, LINE_COMMENT=23, PREPROC=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "STRICT", "GRAPH", "DIGRAPH", "NODE", 
			"EDGE", "SUBGRAPH", "NUMBER", "DIGIT", "STRING", "EDGEOPERAND", "LBRACK", 
			"RBRACK", "SEMI", "LCURLY", "RCURLY", "EQUALS", "ID", "LETTER", "HTML_STRING", 
			"TAG", "COMMENT", "LINE_COMMENT", "PREPROC", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'->'", "'--'", "':'", null, null, null, null, null, null, 
			null, null, null, "'['", "']'", "';'", "'{'", "'}'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "STRICT", "GRAPH", "DIGRAPH", "NODE", "EDGE", 
			"SUBGRAPH", "NUMBER", "STRING", "EDGEOPERAND", "LBRACK", "RBRACK", "SEMI", 
			"LCURLY", "RCURLY", "EQUALS", "ID", "HTML_STRING", "COMMENT", "LINE_COMMENT", 
			"PREPROC", "WS"
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


	public DOTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DOT.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00f2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\5\fo\n\f\3\f\3\f\6\f"+
		"s\n\f\r\f\16\ft\3\f\6\fx\n\f\r\f\16\fy\3\f\3\f\7\f~\n\f\f\f\16\f\u0081"+
		"\13\f\5\f\u0083\n\f\5\f\u0085\n\f\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u008d"+
		"\n\16\f\16\16\16\u0090\13\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u0098"+
		"\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\7\26\u00a9\n\26\f\26\16\26\u00ac\13\26\3\27\3\27\3\30\3\30"+
		"\3\30\7\30\u00b3\n\30\f\30\16\30\u00b6\13\30\3\30\3\30\3\31\3\31\7\31"+
		"\u00bc\n\31\f\31\16\31\u00bf\13\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32"+
		"\u00c7\n\32\f\32\16\32\u00ca\13\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\7\33\u00d5\n\33\f\33\16\33\u00d8\13\33\3\33\5\33\u00db\n\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\7\34\u00e3\n\34\f\34\16\34\u00e6\13\34"+
		"\3\34\3\34\3\34\3\34\3\35\6\35\u00ed\n\35\r\35\16\35\u00ee\3\35\3\35\7"+
		"\u008e\u00bd\u00c8\u00d6\u00e4\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\2\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\2/\27"+
		"\61\2\63\30\65\31\67\329\33\3\2\25\4\2UUuu\4\2VVvv\4\2TTtt\4\2KKkk\4\2"+
		"EEee\4\2IIii\4\2CCcc\4\2RRrr\4\2JJjj\4\2FFff\4\2PPpp\4\2QQqq\4\2GGgg\4"+
		"\2WWww\4\2DDdd\3\2\62;\6\2C\\aac|\u0082\u0101\4\2>>@@\5\2\13\f\17\17\""+
		"\"\2\u0101\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2/\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7@\3\2\2\2"+
		"\tC\3\2\2\2\13E\3\2\2\2\rL\3\2\2\2\17R\3\2\2\2\21Z\3\2\2\2\23_\3\2\2\2"+
		"\25d\3\2\2\2\27n\3\2\2\2\31\u0086\3\2\2\2\33\u0088\3\2\2\2\35\u0097\3"+
		"\2\2\2\37\u0099\3\2\2\2!\u009b\3\2\2\2#\u009d\3\2\2\2%\u009f\3\2\2\2\'"+
		"\u00a1\3\2\2\2)\u00a3\3\2\2\2+\u00a5\3\2\2\2-\u00ad\3\2\2\2/\u00af\3\2"+
		"\2\2\61\u00b9\3\2\2\2\63\u00c2\3\2\2\2\65\u00d0\3\2\2\2\67\u00e0\3\2\2"+
		"\29\u00ec\3\2\2\2;<\7.\2\2<\4\3\2\2\2=>\7/\2\2>?\7@\2\2?\6\3\2\2\2@A\7"+
		"/\2\2AB\7/\2\2B\b\3\2\2\2CD\7<\2\2D\n\3\2\2\2EF\t\2\2\2FG\t\3\2\2GH\t"+
		"\4\2\2HI\t\5\2\2IJ\t\6\2\2JK\t\3\2\2K\f\3\2\2\2LM\t\7\2\2MN\t\4\2\2NO"+
		"\t\b\2\2OP\t\t\2\2PQ\t\n\2\2Q\16\3\2\2\2RS\t\13\2\2ST\t\5\2\2TU\t\7\2"+
		"\2UV\t\4\2\2VW\t\b\2\2WX\t\t\2\2XY\t\n\2\2Y\20\3\2\2\2Z[\t\f\2\2[\\\t"+
		"\r\2\2\\]\t\13\2\2]^\t\16\2\2^\22\3\2\2\2_`\t\16\2\2`a\t\13\2\2ab\t\7"+
		"\2\2bc\t\16\2\2c\24\3\2\2\2de\t\2\2\2ef\t\17\2\2fg\t\20\2\2gh\t\7\2\2"+
		"hi\t\4\2\2ij\t\b\2\2jk\t\t\2\2kl\t\n\2\2l\26\3\2\2\2mo\7/\2\2nm\3\2\2"+
		"\2no\3\2\2\2o\u0084\3\2\2\2pr\7\60\2\2qs\5\31\r\2rq\3\2\2\2st\3\2\2\2"+
		"tr\3\2\2\2tu\3\2\2\2u\u0085\3\2\2\2vx\5\31\r\2wv\3\2\2\2xy\3\2\2\2yw\3"+
		"\2\2\2yz\3\2\2\2z\u0082\3\2\2\2{\177\7\60\2\2|~\5\31\r\2}|\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0082{\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"p\3\2\2\2\u0084w\3\2\2\2\u0085\30\3\2\2\2\u0086\u0087\t\21\2\2\u0087\32"+
		"\3\2\2\2\u0088\u008e\7$\2\2\u0089\u008a\7^\2\2\u008a\u008d\7$\2\2\u008b"+
		"\u008d\13\2\2\2\u008c\u0089\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0092\7$\2\2\u0092\34\3\2\2\2\u0093\u0094\7/\2\2"+
		"\u0094\u0098\7@\2\2\u0095\u0096\7/\2\2\u0096\u0098\7/\2\2\u0097\u0093"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0098\36\3\2\2\2\u0099\u009a\7]\2\2\u009a"+
		" \3\2\2\2\u009b\u009c\7_\2\2\u009c\"\3\2\2\2\u009d\u009e\7=\2\2\u009e"+
		"$\3\2\2\2\u009f\u00a0\7}\2\2\u00a0&\3\2\2\2\u00a1\u00a2\7\177\2\2\u00a2"+
		"(\3\2\2\2\u00a3\u00a4\7?\2\2\u00a4*\3\2\2\2\u00a5\u00aa\5-\27\2\u00a6"+
		"\u00a9\5-\27\2\u00a7\u00a9\5\31\r\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3"+
		"\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		",\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\t\22\2\2\u00ae.\3\2\2\2\u00af"+
		"\u00b4\7>\2\2\u00b0\u00b3\5\61\31\2\u00b1\u00b3\n\23\2\2\u00b2\u00b0\3"+
		"\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7@"+
		"\2\2\u00b8\60\3\2\2\2\u00b9\u00bd\7>\2\2\u00ba\u00bc\13\2\2\2\u00bb\u00ba"+
		"\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7@\2\2\u00c1\62\3\2\2\2"+
		"\u00c2\u00c3\7\61\2\2\u00c3\u00c4\7,\2\2\u00c4\u00c8\3\2\2\2\u00c5\u00c7"+
		"\13\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c9\3\2\2\2"+
		"\u00c8\u00c6\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc"+
		"\7,\2\2\u00cc\u00cd\7\61\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b\32\2\2"+
		"\u00cf\64\3\2\2\2\u00d0\u00d1\7\61\2\2\u00d1\u00d2\7\61\2\2\u00d2\u00d6"+
		"\3\2\2\2\u00d3\u00d5\13\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2"+
		"\u00d6\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d9\u00db\7\17\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2"+
		"\u00db\u00dc\3\2\2\2\u00dc\u00dd\7\f\2\2\u00dd\u00de\3\2\2\2\u00de\u00df"+
		"\b\33\2\2\u00df\66\3\2\2\2\u00e0\u00e4\7%\2\2\u00e1\u00e3\13\2\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\f\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ea\b\34\2\2\u00ea8\3\2\2\2\u00eb\u00ed\t\24\2"+
		"\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\b\35\2\2\u00f1:\3\2\2\2\26\2"+
		"nty\177\u0082\u0084\u008c\u008e\u0097\u00a8\u00aa\u00b2\u00b4\u00bd\u00c8"+
		"\u00d6\u00da\u00e4\u00ee\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}