// Generated from C:/Users/User/Downloads/comicStore-master/Kursach/src/main/java/antlr\SCP.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SCPLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, NUMBER=2, NODE=3, NUM=4, NAME=5, UNARY_RELATION_RIGHT=6, 
		UNARY_RELATION_LEFT=7, BINARY_RELATION_RIGHT=8, BINARY_RELATION_LEFT=9, 
		END_POINT=10, BLOCK_START=11, BLOCK_END=12, EMPTY_CIRCLE=13, EMPTY_CIRCLE_WITH_NAME=14, 
		DVOETOCHIE=15, ROLE=16, NREL=17, NREL_ITERATION_VAR=18, NREL_VALUE=19, 
		NREL_CONDITION=20, NREL_RETURN_VALUE=21, NREL_FUNCTION_PROTOTYPE=22, NREL_ARGUMENT=23, 
		NREL_ITERATION_CHANGE=24, NREL_ITERATION_BODY=25, NREL_INTERRUPT=26, CONCEPT=27, 
		CONCEPT_VARIABLE=28, CODE_BLOCK=29, FOR=30, BREAK=31, CALLED_METHOD=32, 
		CONCEPT_ARGUMENT=33, CONCEPT_ITERATION_STATEMENT=34, OPERATOR=35, OPERATOR_LESS=36, 
		OPERATOR_DECREMENT=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHITESPACE", "NUMBER", "NODE", "NUM", "NAME", "UNARY_RELATION_RIGHT", 
			"UNARY_RELATION_LEFT", "BINARY_RELATION_RIGHT", "BINARY_RELATION_LEFT", 
			"END_POINT", "BLOCK_START", "BLOCK_END", "EMPTY_CIRCLE", "EMPTY_CIRCLE_WITH_NAME", 
			"DVOETOCHIE", "ROLE", "NREL", "NREL_ITERATION_VAR", "NREL_VALUE", "NREL_CONDITION", 
			"NREL_RETURN_VALUE", "NREL_FUNCTION_PROTOTYPE", "NREL_ARGUMENT", "NREL_ITERATION_CHANGE", 
			"NREL_ITERATION_BODY", "NREL_INTERRUPT", "CONCEPT", "CONCEPT_VARIABLE", 
			"CODE_BLOCK", "FOR", "BREAK", "CALLED_METHOD", "CONCEPT_ARGUMENT", "CONCEPT_ITERATION_STATEMENT", 
			"OPERATOR", "OPERATOR_LESS", "OPERATOR_DECREMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'number'", null, null, null, "'->'", "'<-'", "'=>'", "'<='", 
			"';;'", "'(*'", "'*)'", "'...'", null, "':'", null, "'nrel_'", null, 
			null, null, null, null, null, null, null, null, "'concept_'", null, null, 
			null, "'break'", "'called_method'", null, null, "'operator_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "NUMBER", "NODE", "NUM", "NAME", "UNARY_RELATION_RIGHT", 
			"UNARY_RELATION_LEFT", "BINARY_RELATION_RIGHT", "BINARY_RELATION_LEFT", 
			"END_POINT", "BLOCK_START", "BLOCK_END", "EMPTY_CIRCLE", "EMPTY_CIRCLE_WITH_NAME", 
			"DVOETOCHIE", "ROLE", "NREL", "NREL_ITERATION_VAR", "NREL_VALUE", "NREL_CONDITION", 
			"NREL_RETURN_VALUE", "NREL_FUNCTION_PROTOTYPE", "NREL_ARGUMENT", "NREL_ITERATION_CHANGE", 
			"NREL_ITERATION_BODY", "NREL_INTERRUPT", "CONCEPT", "CONCEPT_VARIABLE", 
			"CODE_BLOCK", "FOR", "BREAK", "CALLED_METHOD", "CONCEPT_ARGUMENT", "CONCEPT_ITERATION_STATEMENT", 
			"OPERATOR", "OPERATOR_LESS", "OPERATOR_DECREMENT"
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


	public SCPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SCP.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0193\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\6\2O\n\2\r\2\16\2P\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4`\n\4\3\5\6\5c\n\5\r\5\16"+
		"\5d\3\6\6\6h\n\6\r\6\16\6i\3\6\6\6m\n\6\r\6\16\6n\5\6q\n\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u009b\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\6\5\2\13\f\17\17\"\"\3\2\62"+
		";\3\2c|\3\2C\\\2\u019b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3N\3\2\2\2\5T\3\2\2\2\7"+
		"_\3\2\2\2\tb\3\2\2\2\13p\3\2\2\2\rr\3\2\2\2\17u\3\2\2\2\21x\3\2\2\2\23"+
		"{\3\2\2\2\25~\3\2\2\2\27\u0081\3\2\2\2\31\u0084\3\2\2\2\33\u0087\3\2\2"+
		"\2\35\u008b\3\2\2\2\37\u0090\3\2\2\2!\u0092\3\2\2\2#\u009c\3\2\2\2%\u00a2"+
		"\3\2\2\2\'\u00b6\3\2\2\2)\u00bd\3\2\2\2+\u00c8\3\2\2\2-\u00d6\3\2\2\2"+
		"/\u00ea\3\2\2\2\61\u00f4\3\2\2\2\63\u0106\3\2\2\2\65\u0116\3\2\2\2\67"+
		"\u0121\3\2\2\29\u012a\3\2\2\2;\u0134\3\2\2\2=\u0140\3\2\2\2?\u0145\3\2"+
		"\2\2A\u014b\3\2\2\2C\u0159\3\2\2\2E\u0163\3\2\2\2G\u0178\3\2\2\2I\u0182"+
		"\3\2\2\2K\u0188\3\2\2\2MO\t\2\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2"+
		"\2\2QR\3\2\2\2RS\b\2\2\2S\4\3\2\2\2TU\7p\2\2UV\7w\2\2VW\7o\2\2WX\7d\2"+
		"\2XY\7g\2\2YZ\7t\2\2Z\6\3\2\2\2[`\5\13\6\2\\`\5\33\16\2]`\5\35\17\2^`"+
		"\5\t\5\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\b\3\2\2\2ac\t\3\2\2"+
		"ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\n\3\2\2\2fh\t\4\2\2gf\3\2\2"+
		"\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jq\3\2\2\2km\t\5\2\2lk\3\2\2\2mn\3\2\2"+
		"\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pg\3\2\2\2pl\3\2\2\2q\f\3\2\2\2rs\7/\2"+
		"\2st\7@\2\2t\16\3\2\2\2uv\7>\2\2vw\7/\2\2w\20\3\2\2\2xy\7?\2\2yz\7@\2"+
		"\2z\22\3\2\2\2{|\7>\2\2|}\7?\2\2}\24\3\2\2\2~\177\7=\2\2\177\u0080\7="+
		"\2\2\u0080\26\3\2\2\2\u0081\u0082\7*\2\2\u0082\u0083\7,\2\2\u0083\30\3"+
		"\2\2\2\u0084\u0085\7,\2\2\u0085\u0086\7+\2\2\u0086\32\3\2\2\2\u0087\u0088"+
		"\7\60\2\2\u0088\u0089\7\60\2\2\u0089\u008a\7\60\2\2\u008a\34\3\2\2\2\u008b"+
		"\u008c\7\60\2\2\u008c\u008d\7\60\2\2\u008d\u008e\3\2\2\2\u008e\u008f\5"+
		"\13\6\2\u008f\36\3\2\2\2\u0090\u0091\7<\2\2\u0091 \3\2\2\2\u0092\u0093"+
		"\7t\2\2\u0093\u0094\7t\2\2\u0094\u0095\7g\2\2\u0095\u0096\7n\2\2\u0096"+
		"\u0097\7a\2\2\u0097\u009a\3\2\2\2\u0098\u009b\5\13\6\2\u0099\u009b\5\t"+
		"\5\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\"\3\2\2\2\u009c\u009d"+
		"\7p\2\2\u009d\u009e\7t\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7n\2\2\u00a0"+
		"\u00a1\7a\2\2\u00a1$\3\2\2\2\u00a2\u00a3\5#\22\2\u00a3\u00a4\7k\2\2\u00a4"+
		"\u00a5\7v\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7c\2\2"+
		"\u00a8\u00a9\7v\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac"+
		"\7p\2\2\u00ac\u00ad\7a\2\2\u00ad\u00ae\7x\2\2\u00ae\u00af\7c\2\2\u00af"+
		"\u00b0\7t\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7d\2\2"+
		"\u00b3\u00b4\7n\2\2\u00b4\u00b5\7g\2\2\u00b5&\3\2\2\2\u00b6\u00b7\5#\22"+
		"\2\u00b7\u00b8\7x\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb"+
		"\7w\2\2\u00bb\u00bc\7g\2\2\u00bc(\3\2\2\2\u00bd\u00be\5#\22\2\u00be\u00bf"+
		"\7e\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7f\2\2\u00c2"+
		"\u00c3\7k\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7q\2\2"+
		"\u00c6\u00c7\7p\2\2\u00c7*\3\2\2\2\u00c8\u00c9\5#\22\2\u00c9\u00ca\7t"+
		"\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce"+
		"\7t\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7a\2\2\u00d0\u00d1\7x\2\2\u00d1"+
		"\u00d2\7c\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5\7g\2\2"+
		"\u00d5,\3\2\2\2\u00d6\u00d7\5#\22\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7w"+
		"\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7e\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd"+
		"\7k\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7a\2\2\u00e0"+
		"\u00e1\7r\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7v\2\2"+
		"\u00e4\u00e5\7q\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7{\2\2\u00e7\u00e8"+
		"\7r\2\2\u00e8\u00e9\7g\2\2\u00e9.\3\2\2\2\u00ea\u00eb\5#\22\2\u00eb\u00ec"+
		"\7c\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7i\2\2\u00ee\u00ef\7w\2\2\u00ef"+
		"\u00f0\7o\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7v\2\2"+
		"\u00f3\60\3\2\2\2\u00f4\u00f5\5#\22\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7"+
		"v\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb"+
		"\7v\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7p\2\2\u00fe"+
		"\u00ff\7a\2\2\u00ff\u0100\7e\2\2\u0100\u0101\7j\2\2\u0101\u0102\7c\2\2"+
		"\u0102\u0103\7p\2\2\u0103\u0104\7i\2\2\u0104\u0105\7g\2\2\u0105\62\3\2"+
		"\2\2\u0106\u0107\5#\22\2\u0107\u0108\7k\2\2\u0108\u0109\7v\2\2\u0109\u010a"+
		"\7g\2\2\u010a\u010b\7t\2\2\u010b\u010c\7c\2\2\u010c\u010d\7v\2\2\u010d"+
		"\u010e\7k\2\2\u010e\u010f\7q\2\2\u010f\u0110\7p\2\2\u0110\u0111\7a\2\2"+
		"\u0111\u0112\7d\2\2\u0112\u0113\7q\2\2\u0113\u0114\7f\2\2\u0114\u0115"+
		"\7{\2\2\u0115\64\3\2\2\2\u0116\u0117\5#\22\2\u0117\u0118\7K\2\2\u0118"+
		"\u0119\7P\2\2\u0119\u011a\7V\2\2\u011a\u011b\7G\2\2\u011b\u011c\7T\2\2"+
		"\u011c\u011d\7T\2\2\u011d\u011e\7W\2\2\u011e\u011f\7R\2\2\u011f\u0120"+
		"\7V\2\2\u0120\66\3\2\2\2\u0121\u0122\7e\2\2\u0122\u0123\7q\2\2\u0123\u0124"+
		"\7p\2\2\u0124\u0125\7e\2\2\u0125\u0126\7g\2\2\u0126\u0127\7r\2\2\u0127"+
		"\u0128\7v\2\2\u0128\u0129\7a\2\2\u01298\3\2\2\2\u012a\u012b\5\67\34\2"+
		"\u012b\u012c\7x\2\2\u012c\u012d\7c\2\2\u012d\u012e\7t\2\2\u012e\u012f"+
		"\7k\2\2\u012f\u0130\7c\2\2\u0130\u0131\7d\2\2\u0131\u0132\7n\2\2\u0132"+
		"\u0133\7g\2\2\u0133:\3\2\2\2\u0134\u0135\5\67\34\2\u0135\u0136\7e\2\2"+
		"\u0136\u0137\7q\2\2\u0137\u0138\7f\2\2\u0138\u0139\7g\2\2\u0139\u013a"+
		"\7a\2\2\u013a\u013b\7d\2\2\u013b\u013c\7n\2\2\u013c\u013d\7q\2\2\u013d"+
		"\u013e\7e\2\2\u013e\u013f\7m\2\2\u013f<\3\2\2\2\u0140\u0141\5\67\34\2"+
		"\u0141\u0142\7h\2\2\u0142\u0143\7q\2\2\u0143\u0144\7t\2\2\u0144>\3\2\2"+
		"\2\u0145\u0146\7d\2\2\u0146\u0147\7t\2\2\u0147\u0148\7g\2\2\u0148\u0149"+
		"\7c\2\2\u0149\u014a\7m\2\2\u014a@\3\2\2\2\u014b\u014c\7e\2\2\u014c\u014d"+
		"\7c\2\2\u014d\u014e\7n\2\2\u014e\u014f\7n\2\2\u014f\u0150\7g\2\2\u0150"+
		"\u0151\7f\2\2\u0151\u0152\7a\2\2\u0152\u0153\7o\2\2\u0153\u0154\7g\2\2"+
		"\u0154\u0155\7v\2\2\u0155\u0156\7j\2\2\u0156\u0157\7q\2\2\u0157\u0158"+
		"\7f\2\2\u0158B\3\2\2\2\u0159\u015a\5\67\34\2\u015a\u015b\7c\2\2\u015b"+
		"\u015c\7t\2\2\u015c\u015d\7i\2\2\u015d\u015e\7w\2\2\u015e\u015f\7o\2\2"+
		"\u015f\u0160\7g\2\2\u0160\u0161\7p\2\2\u0161\u0162\7v\2\2\u0162D\3\2\2"+
		"\2\u0163\u0164\5\67\34\2\u0164\u0165\7k\2\2\u0165\u0166\7v\2\2\u0166\u0167"+
		"\7g\2\2\u0167\u0168\7t\2\2\u0168\u0169\7c\2\2\u0169\u016a\7v\2\2\u016a"+
		"\u016b\7k\2\2\u016b\u016c\7q\2\2\u016c\u016d\7p\2\2\u016d\u016e\7a\2\2"+
		"\u016e\u016f\7u\2\2\u016f\u0170\7v\2\2\u0170\u0171\7c\2\2\u0171\u0172"+
		"\7v\2\2\u0172\u0173\7g\2\2\u0173\u0174\7o\2\2\u0174\u0175\7g\2\2\u0175"+
		"\u0176\7p\2\2\u0176\u0177\7v\2\2\u0177F\3\2\2\2\u0178\u0179\7q\2\2\u0179"+
		"\u017a\7r\2\2\u017a\u017b\7g\2\2\u017b\u017c\7t\2\2\u017c\u017d\7c\2\2"+
		"\u017d\u017e\7v\2\2\u017e\u017f\7q\2\2\u017f\u0180\7t\2\2\u0180\u0181"+
		"\7a\2\2\u0181H\3\2\2\2\u0182\u0183\5G$\2\u0183\u0184\7n\2\2\u0184\u0185"+
		"\7g\2\2\u0185\u0186\7u\2\2\u0186\u0187\7u\2\2\u0187J\3\2\2\2\u0188\u0189"+
		"\5G$\2\u0189\u018a\7f\2\2\u018a\u018b\7g\2\2\u018b\u018c\7e\2\2\u018c"+
		"\u018d\7t\2\2\u018d\u018e\7g\2\2\u018e\u018f\7o\2\2\u018f\u0190\7g\2\2"+
		"\u0190\u0191\7p\2\2\u0191\u0192\7v\2\2\u0192L\3\2\2\2\n\2P_dinp\u009a"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}