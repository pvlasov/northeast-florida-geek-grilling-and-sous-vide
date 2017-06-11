// Generated from Cooking.g4 by ANTLR 4.4

    package us.vlasov.cooking;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CookingLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__24=1, T__23=2, T__22=3, T__21=4, T__20=5, T__19=6, T__18=7, T__17=8, 
		T__16=9, T__15=10, T__14=11, T__13=12, T__12=13, T__11=14, T__10=15, T__9=16, 
		T__8=17, T__7=18, T__6=19, T__5=20, T__4=21, T__3=22, T__2=23, T__1=24, 
		T__0=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'"
	};
	public static final String[] ruleNames = {
		"T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", 
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0"
	};


	public CookingLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cooking.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u00eb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\2\u00ea"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5;\3\2\2\2\7B\3\2\2\2\tI\3\2"+
		"\2\2\13N\3\2\2\2\rU\3\2\2\2\17d\3\2\2\2\21n\3\2\2\2\23t\3\2\2\2\25}\3"+
		"\2\2\2\27\u0088\3\2\2\2\31\u0090\3\2\2\2\33\u0095\3\2\2\2\35\u00a2\3\2"+
		"\2\2\37\u00a9\3\2\2\2!\u00af\3\2\2\2#\u00b7\3\2\2\2%\u00c0\3\2\2\2\'\u00c6"+
		"\3\2\2\2)\u00cb\3\2\2\2+\u00cf\3\2\2\2-\u00d6\3\2\2\2/\u00da\3\2\2\2\61"+
		"\u00de\3\2\2\2\63\u00e6\3\2\2\2\65\66\7i\2\2\66\67\7t\2\2\678\7k\2\28"+
		"9\7n\2\29:\7n\2\2:\4\3\2\2\2;<\7u\2\2<=\7g\2\2=>\7c\2\2>?\7u\2\2?@\7q"+
		"\2\2@A\7p\2\2A\6\3\2\2\2BC\7u\2\2CD\7j\2\2DE\7t\2\2EF\7k\2\2FG\7o\2\2"+
		"GH\7r\2\2H\b\3\2\2\2IJ\7n\2\2JK\7c\2\2KL\7o\2\2LM\7d\2\2M\n\3\2\2\2NO"+
		"\7h\2\2OP\7t\2\2PQ\7g\2\2QR\7g\2\2RS\7|\2\2ST\7g\2\2T\f\3\2\2\2UV\7H\2"+
		"\2VW\7k\2\2WX\7u\2\2XY\7j\2\2YZ\7g\2\2Z[\7t\2\2[\\\7o\2\2\\]\7c\2\2]^"+
		"\7p\2\2^_\7\"\2\2_`\7F\2\2`a\7q\2\2ab\7e\2\2bc\7m\2\2c\16\3\2\2\2de\7"+
		"u\2\2ef\7q\2\2fg\7w\2\2gh\7u\2\2hi\7a\2\2ij\7x\2\2jk\7k\2\2kl\7f\2\2l"+
		"m\7g\2\2m\20\3\2\2\2no\7e\2\2op\7j\2\2pq\7q\2\2qr\7r\2\2rs\7u\2\2s\22"+
		"\3\2\2\2tu\7g\2\2uv\7n\2\2vw\7g\2\2wx\7e\2\2xy\7v\2\2yz\7t\2\2z{\7k\2"+
		"\2{|\7e\2\2|\24\3\2\2\2}~\7v\2\2~\177\7g\2\2\177\u0080\7p\2\2\u0080\u0081"+
		"\7f\2\2\u0081\u0082\7g\2\2\u0082\u0083\7t\2\2\u0083\u0084\7n\2\2\u0084"+
		"\u0085\7q\2\2\u0085\u0086\7k\2\2\u0086\u0087\7p\2\2\u0087\26\3\2\2\2\u0088"+
		"\u0089\7e\2\2\u0089\u008a\7q\2\2\u008a\u008b\7t\2\2\u008b\u008c\7x\2\2"+
		"\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e\u008f\7c\2\2\u008f\30\3\2"+
		"\2\2\u0090\u0091\7t\2\2\u0091\u0092\7c\2\2\u0092\u0093\7e\2\2\u0093\u0094"+
		"\7m\2\2\u0094\32\3\2\2\2\u0095\u0096\7v\2\2\u0096\u0097\7q\2\2\u0097\u0098"+
		"\7c\2\2\u0098\u0099\7u\2\2\u0099\u009a\7v\2\2\u009a\u009b\7g\2\2\u009b"+
		"\u009c\7t\2\2\u009c\u009d\7\"\2\2\u009d\u009e\7q\2\2\u009e\u009f\7x\2"+
		"\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7p\2\2\u00a1\34\3\2\2\2\u00a2\u00a3"+
		"\7E\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7v\2\2\u00a6"+
		"\u00a7\7e\2\2\u00a7\u00a8\7q\2\2\u00a8\36\3\2\2\2\u00a9\u00aa\7u\2\2\u00aa"+
		"\u00ab\7v\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7m\2\2"+
		"\u00ae \3\2\2\2\u00af\u00b0\7e\2\2\u00b0\u00b1\7j\2\2\u00b1\u00b2\7k\2"+
		"\2\u00b2\u00b3\7e\2\2\u00b3\u00b4\7m\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6"+
		"\7p\2\2\u00b6\"\3\2\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7j\2\2\u00b9\u00ba"+
		"\7c\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7q\2\2\u00bd"+
		"\u00be\7c\2\2\u00be\u00bf\7n\2\2\u00bf$\3\2\2\2\u00c0\u00c1\7u\2\2\u00c1"+
		"\u00c2\7v\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7r\2\2"+
		"\u00c5&\3\2\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7d\2"+
		"\2\u00c9\u00ca\7u\2\2\u00ca(\3\2\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7"+
		"g\2\2\u00cd\u00ce\7i\2\2\u00ce*\3\2\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1"+
		"\7c\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7o\2\2\u00d3\u00d4\7q\2\2\u00d4"+
		"\u00d5\7p\2\2\u00d5,\3\2\2\2\u00d6\u00d7\7d\2\2\u00d7\u00d8\7c\2\2\u00d8"+
		"\u00d9\7i\2\2\u00d9.\3\2\2\2\u00da\u00db\7r\2\2\u00db\u00dc\7c\2\2\u00dc"+
		"\u00dd\7p\2\2\u00dd\60\3\2\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7q\2\2\u00e0"+
		"\u00e1\7p\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7o\2\2"+
		"\u00e4\u00e5\7g\2\2\u00e5\62\3\2\2\2\u00e6\u00e7\7r\2\2\u00e7\u00e8\7"+
		"q\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7m\2\2\u00ea\64\3\2\2\2\3\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}