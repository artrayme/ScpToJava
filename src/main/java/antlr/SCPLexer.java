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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, WHITESPACE=13, NUMBER=14, UNARY_RELATION_RIGHT=15, 
		UNARY_RELATION_LEFT=16, BINARY_RELATION_RIGHT=17, BINARY_RELATION_LEFT=18, 
		END_POINT=19, BLOCK_START=20, BLOCK_END=21, EMPTY_CIRCLE_WITH_NAME=22, 
		NREL=23, NREL_ITERATION_VAR=24, NREL_VALUE=25, NREL_CONDITION=26, NREL_RETURN_VALUE=27, 
		NREL_RETURN_TYPE=28, NREL_FUNCTION_PROTOTYPE=29, NREL_ARGUMENT=30, NREL_ITERATION_CHANGE=31, 
		NREL_ITERATION_BODY=32, NREL_INTERRUPT=33, NREL_CLASS_FIELD=34, NREL_CALLER=35, 
		NREL_CONSTRUCTOR=36, NREL_BODY=37, NREL_ACCESS_MODIFIER=38, NREL_METHOD=39, 
		CONCEPT_VARIABLE=40, CONCEPT_METHOD=41, CONCEPT_ACCESS_MODIFIER=42, CODE_BLOCK=43, 
		FOR=44, BREAK=45, CONCEPT_CALLED_METHOD=46, CALLED_METHOD=47, CONCEPT_ARGUMENT=48, 
		CONCEPT_ITERATION_STATEMENT=49, CONCEPT_CLASS=50, CONCEPT=51, CLASS=52, 
		CONSTRUCTOR=53, OPERATOR=54, OPERATOR_LESS=55, OPERATOR_DECREMENT=56, 
		ROLE=57, OPERATOR_NODE=58, CLASS_NODE=59, CONSTRUCTOR_NODE=60, NODE=61, 
		NUM=62, EMPTY_CIRCLE=63, DVOETOCHIE=64, NAME=65;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "WHITESPACE", "NUMBER", "UNARY_RELATION_RIGHT", 
			"UNARY_RELATION_LEFT", "BINARY_RELATION_RIGHT", "BINARY_RELATION_LEFT", 
			"END_POINT", "BLOCK_START", "BLOCK_END", "EMPTY_CIRCLE_WITH_NAME", "NREL", 
			"NREL_ITERATION_VAR", "NREL_VALUE", "NREL_CONDITION", "NREL_RETURN_VALUE", 
			"NREL_RETURN_TYPE", "NREL_FUNCTION_PROTOTYPE", "NREL_ARGUMENT", "NREL_ITERATION_CHANGE", 
			"NREL_ITERATION_BODY", "NREL_INTERRUPT", "NREL_CLASS_FIELD", "NREL_CALLER", 
			"NREL_CONSTRUCTOR", "NREL_BODY", "NREL_ACCESS_MODIFIER", "NREL_METHOD", 
			"CONCEPT_VARIABLE", "CONCEPT_METHOD", "CONCEPT_ACCESS_MODIFIER", "CODE_BLOCK", 
			"FOR", "BREAK", "CONCEPT_CALLED_METHOD", "CALLED_METHOD", "CONCEPT_ARGUMENT", 
			"CONCEPT_ITERATION_STATEMENT", "CONCEPT_CLASS", "CONCEPT", "CLASS", "CONSTRUCTOR", 
			"OPERATOR", "OPERATOR_LESS", "OPERATOR_DECREMENT", "ROLE", "OPERATOR_NODE", 
			"CLASS_NODE", "CONSTRUCTOR_NODE", "NODE", "NUM", "EMPTY_CIRCLE", "DVOETOCHIE", 
			"NAME"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'integer'", "'string'", "'float'", "'void'", "'decrement'", "'equal'", 
			"'division'", "'addition'", "'plus'", "'minus'", "'equality'", "'more'", 
			null, "'number'", "'->'", "'<-'", "'=>'", "'<='", "';;'", "'(*'", "'*)'", 
			"'..'", "'nrel_'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'called_method'", null, null, null, "'concept_'", "'class_'", 
			"'constructor_'", "'operator_'", null, null, null, null, null, null, 
			null, null, "'...'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WHITESPACE", "NUMBER", "UNARY_RELATION_RIGHT", "UNARY_RELATION_LEFT", 
			"BINARY_RELATION_RIGHT", "BINARY_RELATION_LEFT", "END_POINT", "BLOCK_START", 
			"BLOCK_END", "EMPTY_CIRCLE_WITH_NAME", "NREL", "NREL_ITERATION_VAR", 
			"NREL_VALUE", "NREL_CONDITION", "NREL_RETURN_VALUE", "NREL_RETURN_TYPE", 
			"NREL_FUNCTION_PROTOTYPE", "NREL_ARGUMENT", "NREL_ITERATION_CHANGE", 
			"NREL_ITERATION_BODY", "NREL_INTERRUPT", "NREL_CLASS_FIELD", "NREL_CALLER", 
			"NREL_CONSTRUCTOR", "NREL_BODY", "NREL_ACCESS_MODIFIER", "NREL_METHOD", 
			"CONCEPT_VARIABLE", "CONCEPT_METHOD", "CONCEPT_ACCESS_MODIFIER", "CODE_BLOCK", 
			"FOR", "BREAK", "CONCEPT_CALLED_METHOD", "CALLED_METHOD", "CONCEPT_ARGUMENT", 
			"CONCEPT_ITERATION_STATEMENT", "CONCEPT_CLASS", "CONCEPT", "CLASS", "CONSTRUCTOR", 
			"OPERATOR", "OPERATOR_LESS", "OPERATOR_DECREMENT", "ROLE", "OPERATOR_NODE", 
			"CLASS_NODE", "CONSTRUCTOR_NODE", "NODE", "NUM", "EMPTY_CIRCLE", "DVOETOCHIE", 
			"NAME"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u02d0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\6\16\u00dc\n\16\r\16\16\16\u00dd\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\5+\u020e\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3"+
		"-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\5\61\u0244\n\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\39\39\39\39\3"+
		"9\39\39\3:\3:\3:\3:\3:\3:\3:\3:\5:\u02a2\n:\3;\3;\3<\5<\u02a7\n<\3<\3"+
		"<\3<\3<\5<\u02ad\n<\3=\5=\u02b0\n=\3=\3=\3=\3=\3=\3>\5>\u02b8\n>\3>\3"+
		">\5>\u02bc\n>\3>\5>\u02bf\n>\3?\6?\u02c2\n?\r?\16?\u02c3\3@\3@\3@\3@\3"+
		"A\3A\3B\6B\u02cd\nB\rB\16B\u02ce\2\2C\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\3\2\5\5\2\13\f\17\17\"\"\3\2\62;\4\2C\\c|\2\u02dc\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\3\u0085\3\2\2\2\5\u008d"+
		"\3\2\2\2\7\u0094\3\2\2\2\t\u009a\3\2\2\2\13\u009f\3\2\2\2\r\u00a9\3\2"+
		"\2\2\17\u00af\3\2\2\2\21\u00b8\3\2\2\2\23\u00c1\3\2\2\2\25\u00c6\3\2\2"+
		"\2\27\u00cc\3\2\2\2\31\u00d5\3\2\2\2\33\u00db\3\2\2\2\35\u00e1\3\2\2\2"+
		"\37\u00e8\3\2\2\2!\u00eb\3\2\2\2#\u00ee\3\2\2\2%\u00f1\3\2\2\2\'\u00f4"+
		"\3\2\2\2)\u00f7\3\2\2\2+\u00fa\3\2\2\2-\u00fd\3\2\2\2/\u0100\3\2\2\2\61"+
		"\u0106\3\2\2\2\63\u011a\3\2\2\2\65\u0121\3\2\2\2\67\u012c\3\2\2\29\u013a"+
		"\3\2\2\2;\u0147\3\2\2\2=\u015b\3\2\2\2?\u0165\3\2\2\2A\u0177\3\2\2\2C"+
		"\u0187\3\2\2\2E\u0192\3\2\2\2G\u019f\3\2\2\2I\u01a7\3\2\2\2K\u01b4\3\2"+
		"\2\2M\u01ba\3\2\2\2O\u01cb\3\2\2\2Q\u01d3\3\2\2\2S\u01dd\3\2\2\2U\u01e5"+
		"\3\2\2\2W\u020f\3\2\2\2Y\u021b\3\2\2\2[\u0220\3\2\2\2]\u0227\3\2\2\2_"+
		"\u022a\3\2\2\2a\u0238\3\2\2\2c\u0245\3\2\2\2e\u025a\3\2\2\2g\u0261\3\2"+
		"\2\2i\u026a\3\2\2\2k\u0271\3\2\2\2m\u027e\3\2\2\2o\u0288\3\2\2\2q\u028e"+
		"\3\2\2\2s\u0299\3\2\2\2u\u02a3\3\2\2\2w\u02a6\3\2\2\2y\u02af\3\2\2\2{"+
		"\u02be\3\2\2\2}\u02c1\3\2\2\2\177\u02c5\3\2\2\2\u0081\u02c9\3\2\2\2\u0083"+
		"\u02cc\3\2\2\2\u0085\u0086\7k\2\2\u0086\u0087\7p\2\2\u0087\u0088\7v\2"+
		"\2\u0088\u0089\7g\2\2\u0089\u008a\7i\2\2\u008a\u008b\7g\2\2\u008b\u008c"+
		"\7t\2\2\u008c\4\3\2\2\2\u008d\u008e\7u\2\2\u008e\u008f\7v\2\2\u008f\u0090"+
		"\7t\2\2\u0090\u0091\7k\2\2\u0091\u0092\7p\2\2\u0092\u0093\7i\2\2\u0093"+
		"\6\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7n\2\2\u0096\u0097\7q\2\2\u0097"+
		"\u0098\7c\2\2\u0098\u0099\7v\2\2\u0099\b\3\2\2\2\u009a\u009b\7x\2\2\u009b"+
		"\u009c\7q\2\2\u009c\u009d\7k\2\2\u009d\u009e\7f\2\2\u009e\n\3\2\2\2\u009f"+
		"\u00a0\7f\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7t\2\2"+
		"\u00a3\u00a4\7g\2\2\u00a4\u00a5\7o\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7"+
		"\7p\2\2\u00a7\u00a8\7v\2\2\u00a8\f\3\2\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab"+
		"\7s\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7n\2\2\u00ae"+
		"\16\3\2\2\2\u00af\u00b0\7f\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7x\2\2\u00b2"+
		"\u00b3\7k\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7q\2\2"+
		"\u00b6\u00b7\7p\2\2\u00b7\20\3\2\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7"+
		"f\2\2\u00ba\u00bb\7f\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be"+
		"\7k\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7p\2\2\u00c0\22\3\2\2\2\u00c1\u00c2"+
		"\7r\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7u\2\2\u00c5"+
		"\24\3\2\2\2\u00c6\u00c7\7o\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7p\2\2\u00c9"+
		"\u00ca\7w\2\2\u00ca\u00cb\7u\2\2\u00cb\26\3\2\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"\u00ce\7s\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7n\2\2"+
		"\u00d1\u00d2\7k\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7{\2\2\u00d4\30\3\2"+
		"\2\2\u00d5\u00d6\7o\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9"+
		"\7g\2\2\u00d9\32\3\2\2\2\u00da\u00dc\t\2\2\2\u00db\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e0\b\16\2\2\u00e0\34\3\2\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3"+
		"\7w\2\2\u00e3\u00e4\7o\2\2\u00e4\u00e5\7d\2\2\u00e5\u00e6\7g\2\2\u00e6"+
		"\u00e7\7t\2\2\u00e7\36\3\2\2\2\u00e8\u00e9\7/\2\2\u00e9\u00ea\7@\2\2\u00ea"+
		" \3\2\2\2\u00eb\u00ec\7>\2\2\u00ec\u00ed\7/\2\2\u00ed\"\3\2\2\2\u00ee"+
		"\u00ef\7?\2\2\u00ef\u00f0\7@\2\2\u00f0$\3\2\2\2\u00f1\u00f2\7>\2\2\u00f2"+
		"\u00f3\7?\2\2\u00f3&\3\2\2\2\u00f4\u00f5\7=\2\2\u00f5\u00f6\7=\2\2\u00f6"+
		"(\3\2\2\2\u00f7\u00f8\7*\2\2\u00f8\u00f9\7,\2\2\u00f9*\3\2\2\2\u00fa\u00fb"+
		"\7,\2\2\u00fb\u00fc\7+\2\2\u00fc,\3\2\2\2\u00fd\u00fe\7\60\2\2\u00fe\u00ff"+
		"\7\60\2\2\u00ff.\3\2\2\2\u0100\u0101\7p\2\2\u0101\u0102\7t\2\2\u0102\u0103"+
		"\7g\2\2\u0103\u0104\7n\2\2\u0104\u0105\7a\2\2\u0105\60\3\2\2\2\u0106\u0107"+
		"\5/\30\2\u0107\u0108\7k\2\2\u0108\u0109\7v\2\2\u0109\u010a\7g\2\2\u010a"+
		"\u010b\7t\2\2\u010b\u010c\7c\2\2\u010c\u010d\7v\2\2\u010d\u010e\7k\2\2"+
		"\u010e\u010f\7q\2\2\u010f\u0110\7p\2\2\u0110\u0111\7a\2\2\u0111\u0112"+
		"\7x\2\2\u0112\u0113\7c\2\2\u0113\u0114\7t\2\2\u0114\u0115\7k\2\2\u0115"+
		"\u0116\7c\2\2\u0116\u0117\7d\2\2\u0117\u0118\7n\2\2\u0118\u0119\7g\2\2"+
		"\u0119\62\3\2\2\2\u011a\u011b\5/\30\2\u011b\u011c\7x\2\2\u011c\u011d\7"+
		"c\2\2\u011d\u011e\7n\2\2\u011e\u011f\7w\2\2\u011f\u0120\7g\2\2\u0120\64"+
		"\3\2\2\2\u0121\u0122\5/\30\2\u0122\u0123\7e\2\2\u0123\u0124\7q\2\2\u0124"+
		"\u0125\7p\2\2\u0125\u0126\7f\2\2\u0126\u0127\7k\2\2\u0127\u0128\7v\2\2"+
		"\u0128\u0129\7k\2\2\u0129\u012a\7q\2\2\u012a\u012b\7p\2\2\u012b\66\3\2"+
		"\2\2\u012c\u012d\5/\30\2\u012d\u012e\7t\2\2\u012e\u012f\7g\2\2\u012f\u0130"+
		"\7v\2\2\u0130\u0131\7w\2\2\u0131\u0132\7t\2\2\u0132\u0133\7p\2\2\u0133"+
		"\u0134\7a\2\2\u0134\u0135\7x\2\2\u0135\u0136\7c\2\2\u0136\u0137\7n\2\2"+
		"\u0137\u0138\7w\2\2\u0138\u0139\7g\2\2\u01398\3\2\2\2\u013a\u013b\5/\30"+
		"\2\u013b\u013c\7t\2\2\u013c\u013d\7g\2\2\u013d\u013e\7v\2\2\u013e\u013f"+
		"\7w\2\2\u013f\u0140\7t\2\2\u0140\u0141\7p\2\2\u0141\u0142\7a\2\2\u0142"+
		"\u0143\7v\2\2\u0143\u0144\7{\2\2\u0144\u0145\7r\2\2\u0145\u0146\7g\2\2"+
		"\u0146:\3\2\2\2\u0147\u0148\5/\30\2\u0148\u0149\7h\2\2\u0149\u014a\7w"+
		"\2\2\u014a\u014b\7p\2\2\u014b\u014c\7e\2\2\u014c\u014d\7v\2\2\u014d\u014e"+
		"\7k\2\2\u014e\u014f\7q\2\2\u014f\u0150\7p\2\2\u0150\u0151\7a\2\2\u0151"+
		"\u0152\7r\2\2\u0152\u0153\7t\2\2\u0153\u0154\7q\2\2\u0154\u0155\7v\2\2"+
		"\u0155\u0156\7q\2\2\u0156\u0157\7v\2\2\u0157\u0158\7{\2\2\u0158\u0159"+
		"\7r\2\2\u0159\u015a\7g\2\2\u015a<\3\2\2\2\u015b\u015c\5/\30\2\u015c\u015d"+
		"\7c\2\2\u015d\u015e\7t\2\2\u015e\u015f\7i\2\2\u015f\u0160\7w\2\2\u0160"+
		"\u0161\7o\2\2\u0161\u0162\7g\2\2\u0162\u0163\7p\2\2\u0163\u0164\7v\2\2"+
		"\u0164>\3\2\2\2\u0165\u0166\5/\30\2\u0166\u0167\7k\2\2\u0167\u0168\7v"+
		"\2\2\u0168\u0169\7g\2\2\u0169\u016a\7t\2\2\u016a\u016b\7c\2\2\u016b\u016c"+
		"\7v\2\2\u016c\u016d\7k\2\2\u016d\u016e\7q\2\2\u016e\u016f\7p\2\2\u016f"+
		"\u0170\7a\2\2\u0170\u0171\7e\2\2\u0171\u0172\7j\2\2\u0172\u0173\7c\2\2"+
		"\u0173\u0174\7p\2\2\u0174\u0175\7i\2\2\u0175\u0176\7g\2\2\u0176@\3\2\2"+
		"\2\u0177\u0178\5/\30\2\u0178\u0179\7k\2\2\u0179\u017a\7v\2\2\u017a\u017b"+
		"\7g\2\2\u017b\u017c\7t\2\2\u017c\u017d\7c\2\2\u017d\u017e\7v\2\2\u017e"+
		"\u017f\7k\2\2\u017f\u0180\7q\2\2\u0180\u0181\7p\2\2\u0181\u0182\7a\2\2"+
		"\u0182\u0183\7d\2\2\u0183\u0184\7q\2\2\u0184\u0185\7f\2\2\u0185\u0186"+
		"\7{\2\2\u0186B\3\2\2\2\u0187\u0188\5/\30\2\u0188\u0189\7k\2\2\u0189\u018a"+
		"\7p\2\2\u018a\u018b\7v\2\2\u018b\u018c\7g\2\2\u018c\u018d\7t\2\2\u018d"+
		"\u018e\7t\2\2\u018e\u018f\7w\2\2\u018f\u0190\7r\2\2\u0190\u0191\7v\2\2"+
		"\u0191D\3\2\2\2\u0192\u0193\5/\30\2\u0193\u0194\7e\2\2\u0194\u0195\7n"+
		"\2\2\u0195\u0196\7c\2\2\u0196\u0197\7u\2\2\u0197\u0198\7u\2\2\u0198\u0199"+
		"\7a\2\2\u0199\u019a\7h\2\2\u019a\u019b\7k\2\2\u019b\u019c\7g\2\2\u019c"+
		"\u019d\7n\2\2\u019d\u019e\7f\2\2\u019eF\3\2\2\2\u019f\u01a0\5/\30\2\u01a0"+
		"\u01a1\7e\2\2\u01a1\u01a2\7c\2\2\u01a2\u01a3\7n\2\2\u01a3\u01a4\7n\2\2"+
		"\u01a4\u01a5\7g\2\2\u01a5\u01a6\7t\2\2\u01a6H\3\2\2\2\u01a7\u01a8\5/\30"+
		"\2\u01a8\u01a9\7e\2\2\u01a9\u01aa\7q\2\2\u01aa\u01ab\7p\2\2\u01ab\u01ac"+
		"\7u\2\2\u01ac\u01ad\7v\2\2\u01ad\u01ae\7t\2\2\u01ae\u01af\7w\2\2\u01af"+
		"\u01b0\7e\2\2\u01b0\u01b1\7v\2\2\u01b1\u01b2\7q\2\2\u01b2\u01b3\7t\2\2"+
		"\u01b3J\3\2\2\2\u01b4\u01b5\5/\30\2\u01b5\u01b6\7d\2\2\u01b6\u01b7\7q"+
		"\2\2\u01b7\u01b8\7f\2\2\u01b8\u01b9\7{\2\2\u01b9L\3\2\2\2\u01ba\u01bb"+
		"\5/\30\2\u01bb\u01bc\7c\2\2\u01bc\u01bd\7e\2\2\u01bd\u01be\7e\2\2\u01be"+
		"\u01bf\7g\2\2\u01bf\u01c0\7u\2\2\u01c0\u01c1\7u\2\2\u01c1\u01c2\7a\2\2"+
		"\u01c2\u01c3\7o\2\2\u01c3\u01c4\7q\2\2\u01c4\u01c5\7f\2\2\u01c5\u01c6"+
		"\7k\2\2\u01c6\u01c7\7h\2\2\u01c7\u01c8\7k\2\2\u01c8\u01c9\7g\2\2\u01c9"+
		"\u01ca\7t\2\2\u01caN\3\2\2\2\u01cb\u01cc\5/\30\2\u01cc\u01cd\7o\2\2\u01cd"+
		"\u01ce\7g\2\2\u01ce\u01cf\7v\2\2\u01cf\u01d0\7j\2\2\u01d0\u01d1\7q\2\2"+
		"\u01d1\u01d2\7f\2\2\u01d2P\3\2\2\2\u01d3\u01d4\5g\64\2\u01d4\u01d5\7x"+
		"\2\2\u01d5\u01d6\7c\2\2\u01d6\u01d7\7t\2\2\u01d7\u01d8\7k\2\2\u01d8\u01d9"+
		"\7c\2\2\u01d9\u01da\7d\2\2\u01da\u01db\7n\2\2\u01db\u01dc\7g\2\2\u01dc"+
		"R\3\2\2\2\u01dd\u01de\5g\64\2\u01de\u01df\7o\2\2\u01df\u01e0\7g\2\2\u01e0"+
		"\u01e1\7v\2\2\u01e1\u01e2\7j\2\2\u01e2\u01e3\7q\2\2\u01e3\u01e4\7f\2\2"+
		"\u01e4T\3\2\2\2\u01e5\u01e6\5g\64\2\u01e6\u01e7\7c\2\2\u01e7\u01e8\7e"+
		"\2\2\u01e8\u01e9\7e\2\2\u01e9\u01ea\7g\2\2\u01ea\u01eb\7u\2\2\u01eb\u01ec"+
		"\7u\2\2\u01ec\u01ed\7a\2\2\u01ed\u01ee\7o\2\2\u01ee\u01ef\7q\2\2\u01ef"+
		"\u01f0\7f\2\2\u01f0\u01f1\7k\2\2\u01f1\u01f2\7h\2\2\u01f2\u01f3\7k\2\2"+
		"\u01f3\u01f4\7g\2\2\u01f4\u01f5\7t\2\2\u01f5\u01f6\7a\2\2\u01f6\u020d"+
		"\3\2\2\2\u01f7\u01f8\7r\2\2\u01f8\u01f9\7t\2\2\u01f9\u01fa\7k\2\2\u01fa"+
		"\u01fb\7x\2\2\u01fb\u01fc\7c\2\2\u01fc\u01fd\7v\2\2\u01fd\u020e\7g\2\2"+
		"\u01fe\u01ff\7r\2\2\u01ff\u0200\7w\2\2\u0200\u0201\7d\2\2\u0201\u0202"+
		"\7n\2\2\u0202\u0203\7k\2\2\u0203\u020e\7e\2\2\u0204\u0205\7r\2\2\u0205"+
		"\u0206\7t\2\2\u0206\u0207\7q\2\2\u0207\u0208\7v\2\2\u0208\u0209\7g\2\2"+
		"\u0209\u020a\7e\2\2\u020a\u020b\7v\2\2\u020b\u020c\7g\2\2\u020c\u020e"+
		"\7f\2\2\u020d\u01f7\3\2\2\2\u020d\u01fe\3\2\2\2\u020d\u0204\3\2\2\2\u020e"+
		"V\3\2\2\2\u020f\u0210\5g\64\2\u0210\u0211\7e\2\2\u0211\u0212\7q\2\2\u0212"+
		"\u0213\7f\2\2\u0213\u0214\7g\2\2\u0214\u0215\7a\2\2\u0215\u0216\7d\2\2"+
		"\u0216\u0217\7n\2\2\u0217\u0218\7q\2\2\u0218\u0219\7e\2\2\u0219\u021a"+
		"\7m\2\2\u021aX\3\2\2\2\u021b\u021c\5g\64\2\u021c\u021d\7h\2\2\u021d\u021e"+
		"\7q\2\2\u021e\u021f\7t\2\2\u021fZ\3\2\2\2\u0220\u0221\5g\64\2\u0221\u0222"+
		"\7d\2\2\u0222\u0223\7t\2\2\u0223\u0224\7g\2\2\u0224\u0225\7c\2\2\u0225"+
		"\u0226\7m\2\2\u0226\\\3\2\2\2\u0227\u0228\5g\64\2\u0228\u0229\5_\60\2"+
		"\u0229^\3\2\2\2\u022a\u022b\7e\2\2\u022b\u022c\7c\2\2\u022c\u022d\7n\2"+
		"\2\u022d\u022e\7n\2\2\u022e\u022f\7g\2\2\u022f\u0230\7f\2\2\u0230\u0231"+
		"\7a\2\2\u0231\u0232\7o\2\2\u0232\u0233\7g\2\2\u0233\u0234\7v\2\2\u0234"+
		"\u0235\7j\2\2\u0235\u0236\7q\2\2\u0236\u0237\7f\2\2\u0237`\3\2\2\2\u0238"+
		"\u0239\5g\64\2\u0239\u023a\7c\2\2\u023a\u023b\7t\2\2\u023b\u023c\7i\2"+
		"\2\u023c\u023d\7w\2\2\u023d\u023e\7o\2\2\u023e\u023f\7g\2\2\u023f\u0240"+
		"\7p\2\2\u0240\u0241\7v\2\2\u0241\u0243\3\2\2\2\u0242\u0244\7u\2\2\u0243"+
		"\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244b\3\2\2\2\u0245\u0246\5g\64\2"+
		"\u0246\u0247\7k\2\2\u0247\u0248\7v\2\2\u0248\u0249\7g\2\2\u0249\u024a"+
		"\7t\2\2\u024a\u024b\7c\2\2\u024b\u024c\7v\2\2\u024c\u024d\7k\2\2\u024d"+
		"\u024e\7q\2\2\u024e\u024f\7p\2\2\u024f\u0250\7a\2\2\u0250\u0251\7u\2\2"+
		"\u0251\u0252\7v\2\2\u0252\u0253\7c\2\2\u0253\u0254\7v\2\2\u0254\u0255"+
		"\7g\2\2\u0255\u0256\7o\2\2\u0256\u0257\7g\2\2\u0257\u0258\7p\2\2\u0258"+
		"\u0259\7v\2\2\u0259d\3\2\2\2\u025a\u025b\5g\64\2\u025b\u025c\7e\2\2\u025c"+
		"\u025d\7n\2\2\u025d\u025e\7c\2\2\u025e\u025f\7u\2\2\u025f\u0260\7u\2\2"+
		"\u0260f\3\2\2\2\u0261\u0262\7e\2\2\u0262\u0263\7q\2\2\u0263\u0264\7p\2"+
		"\2\u0264\u0265\7e\2\2\u0265\u0266\7g\2\2\u0266\u0267\7r\2\2\u0267\u0268"+
		"\7v\2\2\u0268\u0269\7a\2\2\u0269h\3\2\2\2\u026a\u026b\7e\2\2\u026b\u026c"+
		"\7n\2\2\u026c\u026d\7c\2\2\u026d\u026e\7u\2\2\u026e\u026f\7u\2\2\u026f"+
		"\u0270\7a\2\2\u0270j\3\2\2\2\u0271\u0272\7e\2\2\u0272\u0273\7q\2\2\u0273"+
		"\u0274\7p\2\2\u0274\u0275\7u\2\2\u0275\u0276\7v\2\2\u0276\u0277\7t\2\2"+
		"\u0277\u0278\7w\2\2\u0278\u0279\7e\2\2\u0279\u027a\7v\2\2\u027a\u027b"+
		"\7q\2\2\u027b\u027c\7t\2\2\u027c\u027d\7a\2\2\u027dl\3\2\2\2\u027e\u027f"+
		"\7q\2\2\u027f\u0280\7r\2\2\u0280\u0281\7g\2\2\u0281\u0282\7t\2\2\u0282"+
		"\u0283\7c\2\2\u0283\u0284\7v\2\2\u0284\u0285\7q\2\2\u0285\u0286\7t\2\2"+
		"\u0286\u0287\7a\2\2\u0287n\3\2\2\2\u0288\u0289\5m\67\2\u0289\u028a\7n"+
		"\2\2\u028a\u028b\7g\2\2\u028b\u028c\7u\2\2\u028c\u028d\7u\2\2\u028dp\3"+
		"\2\2\2\u028e\u028f\5m\67\2\u028f\u0290\7f\2\2\u0290\u0291\7g\2\2\u0291"+
		"\u0292\7e\2\2\u0292\u0293\7t\2\2\u0293\u0294\7g\2\2\u0294\u0295\7o\2\2"+
		"\u0295\u0296\7g\2\2\u0296\u0297\7p\2\2\u0297\u0298\7v\2\2\u0298r\3\2\2"+
		"\2\u0299\u029a\7t\2\2\u029a\u029b\7t\2\2\u029b\u029c\7g\2\2\u029c\u029d"+
		"\7n\2\2\u029d\u029e\7a\2\2\u029e\u02a1\3\2\2\2\u029f\u02a2\5\u0083B\2"+
		"\u02a0\u02a2\5}?\2\u02a1\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2t\3\2"+
		"\2\2\u02a3\u02a4\5m\67\2\u02a4v\3\2\2\2\u02a5\u02a7\5-\27\2\u02a6\u02a5"+
		"\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\5i\65\2\u02a9"+
		"\u02ac\5\u0083B\2\u02aa\u02ab\7a\2\2\u02ab\u02ad\5\u0083B\2\u02ac\u02aa"+
		"\3\2\2\2\u02ac\u02ad\3\2\2\2\u02adx\3\2\2\2\u02ae\u02b0\5-\27\2\u02af"+
		"\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\5k"+
		"\66\2\u02b2\u02b3\5\u0083B\2\u02b3\u02b4\7a\2\2\u02b4\u02b5\5\u0083B\2"+
		"\u02b5z\3\2\2\2\u02b6\u02b8\5-\27\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3"+
		"\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02bc\5\u0083B\2\u02ba\u02bc\5}?\2\u02bb"+
		"\u02b9\3\2\2\2\u02bb\u02ba\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bf\5\177"+
		"@\2\u02be\u02b7\3\2\2\2\u02be\u02bd\3\2\2\2\u02bf|\3\2\2\2\u02c0\u02c2"+
		"\t\3\2\2\u02c1\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4~\3\2\2\2\u02c5\u02c6\7\60\2\2\u02c6\u02c7\7\60\2"+
		"\2\u02c7\u02c8\7\60\2\2\u02c8\u0080\3\2\2\2\u02c9\u02ca\7<\2\2\u02ca\u0082"+
		"\3\2\2\2\u02cb\u02cd\t\4\2\2\u02cc\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u0084\3\2\2\2\20\2\u00dd\u020d"+
		"\u0243\u02a1\u02a6\u02ac\u02af\u02b7\u02bb\u02be\u02c3\u02cc\u02ce\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}