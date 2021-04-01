// Generated from C:/Users/User/Downloads/comicStore-master/Kursach/src/main/java/antlr\SCP.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SCPParser extends Parser {
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
	public static final int
		RULE_operators = 0, RULE_iteration_variable = 1, RULE_role = 2, RULE_condition = 3, 
		RULE_iteration_change = 4, RULE_iteration_body = 5, RULE_for_satement = 6, 
		RULE_break_rule = 7, RULE_code = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"operators", "iteration_variable", "role", "condition", "iteration_change", 
			"iteration_body", "for_satement", "break_rule", "code"
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

	@Override
	public String getGrammarFileName() { return "SCP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SCPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class OperatorsContext extends ParserRuleContext {
		public TerminalNode OPERATOR_LESS() { return getToken(SCPParser.OPERATOR_LESS, 0); }
		public TerminalNode OPERATOR_DECREMENT() { return getToken(SCPParser.OPERATOR_DECREMENT, 0); }
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).enterOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).exitOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCPVisitor ) return ((SCPVisitor<? extends T>)visitor).visitOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_la = _input.LA(1);
			if ( !(_la==OPERATOR_LESS || _la==OPERATOR_DECREMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Iteration_variableContext extends ParserRuleContext {
		public TerminalNode NREL_ITERATION_VAR() { return getToken(SCPParser.NREL_ITERATION_VAR, 0); }
		public List<TerminalNode> DVOETOCHIE() { return getTokens(SCPParser.DVOETOCHIE); }
		public TerminalNode DVOETOCHIE(int i) {
			return getToken(SCPParser.DVOETOCHIE, i);
		}
		public List<TerminalNode> NODE() { return getTokens(SCPParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(SCPParser.NODE, i);
		}
		public List<TerminalNode> BLOCK_START() { return getTokens(SCPParser.BLOCK_START); }
		public TerminalNode BLOCK_START(int i) {
			return getToken(SCPParser.BLOCK_START, i);
		}
		public List<TerminalNode> UNARY_RELATION_LEFT() { return getTokens(SCPParser.UNARY_RELATION_LEFT); }
		public TerminalNode UNARY_RELATION_LEFT(int i) {
			return getToken(SCPParser.UNARY_RELATION_LEFT, i);
		}
		public TerminalNode CONCEPT_VARIABLE() { return getToken(SCPParser.CONCEPT_VARIABLE, 0); }
		public List<TerminalNode> END_POINT() { return getTokens(SCPParser.END_POINT); }
		public TerminalNode END_POINT(int i) {
			return getToken(SCPParser.END_POINT, i);
		}
		public TerminalNode BINARY_RELATION_RIGHT() { return getToken(SCPParser.BINARY_RELATION_RIGHT, 0); }
		public TerminalNode NREL_VALUE() { return getToken(SCPParser.NREL_VALUE, 0); }
		public TerminalNode NUMBER() { return getToken(SCPParser.NUMBER, 0); }
		public List<TerminalNode> BLOCK_END() { return getTokens(SCPParser.BLOCK_END); }
		public TerminalNode BLOCK_END(int i) {
			return getToken(SCPParser.BLOCK_END, i);
		}
		public Iteration_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).enterIteration_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).exitIteration_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCPVisitor ) return ((SCPVisitor<? extends T>)visitor).visitIteration_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteration_variableContext iteration_variable() throws RecognitionException {
		Iteration_variableContext _localctx = new Iteration_variableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_iteration_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(NREL_ITERATION_VAR);
			setState(21);
			match(DVOETOCHIE);
			setState(22);
			match(NODE);
			setState(23);
			match(BLOCK_START);
			setState(24);
			match(UNARY_RELATION_LEFT);
			setState(25);
			match(CONCEPT_VARIABLE);
			setState(26);
			match(END_POINT);
			setState(27);
			match(BINARY_RELATION_RIGHT);
			setState(28);
			match(NREL_VALUE);
			setState(29);
			match(DVOETOCHIE);
			setState(30);
			match(NODE);
			setState(31);
			match(BLOCK_START);
			setState(32);
			match(UNARY_RELATION_LEFT);
			setState(33);
			match(NUMBER);
			setState(34);
			match(END_POINT);
			setState(35);
			match(BLOCK_END);
			setState(36);
			match(END_POINT);
			setState(37);
			match(BLOCK_END);
			setState(38);
			match(END_POINT);
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

	public static class RoleContext extends ParserRuleContext {
		public TerminalNode UNARY_RELATION_RIGHT() { return getToken(SCPParser.UNARY_RELATION_RIGHT, 0); }
		public TerminalNode ROLE() { return getToken(SCPParser.ROLE, 0); }
		public TerminalNode DVOETOCHIE() { return getToken(SCPParser.DVOETOCHIE, 0); }
		public TerminalNode NODE() { return getToken(SCPParser.NODE, 0); }
		public TerminalNode END_POINT() { return getToken(SCPParser.END_POINT, 0); }
		public RoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).enterRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).exitRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCPVisitor ) return ((SCPVisitor<? extends T>)visitor).visitRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoleContext role() throws RecognitionException {
		RoleContext _localctx = new RoleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_role);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(40);
			match(UNARY_RELATION_RIGHT);
			setState(41);
			match(ROLE);
			setState(42);
			match(DVOETOCHIE);
			setState(43);
			match(NODE);
			setState(44);
			match(END_POINT);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<TerminalNode> BINARY_RELATION_RIGHT() { return getTokens(SCPParser.BINARY_RELATION_RIGHT); }
		public TerminalNode BINARY_RELATION_RIGHT(int i) {
			return getToken(SCPParser.BINARY_RELATION_RIGHT, i);
		}
		public TerminalNode NREL_CONDITION() { return getToken(SCPParser.NREL_CONDITION, 0); }
		public List<TerminalNode> DVOETOCHIE() { return getTokens(SCPParser.DVOETOCHIE); }
		public TerminalNode DVOETOCHIE(int i) {
			return getToken(SCPParser.DVOETOCHIE, i);
		}
		public List<TerminalNode> NODE() { return getTokens(SCPParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(SCPParser.NODE, i);
		}
		public List<TerminalNode> BLOCK_START() { return getTokens(SCPParser.BLOCK_START); }
		public TerminalNode BLOCK_START(int i) {
			return getToken(SCPParser.BLOCK_START, i);
		}
		public TerminalNode BINARY_RELATION_LEFT() { return getToken(SCPParser.BINARY_RELATION_LEFT, 0); }
		public TerminalNode NREL_RETURN_VALUE() { return getToken(SCPParser.NREL_RETURN_VALUE, 0); }
		public List<TerminalNode> UNARY_RELATION_LEFT() { return getTokens(SCPParser.UNARY_RELATION_LEFT); }
		public TerminalNode UNARY_RELATION_LEFT(int i) {
			return getToken(SCPParser.UNARY_RELATION_LEFT, i);
		}
		public TerminalNode CALLED_METHOD() { return getToken(SCPParser.CALLED_METHOD, 0); }
		public List<TerminalNode> END_POINT() { return getTokens(SCPParser.END_POINT); }
		public TerminalNode END_POINT(int i) {
			return getToken(SCPParser.END_POINT, i);
		}
		public TerminalNode NREL_FUNCTION_PROTOTYPE() { return getToken(SCPParser.NREL_FUNCTION_PROTOTYPE, 0); }
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public TerminalNode NREL_ARGUMENT() { return getToken(SCPParser.NREL_ARGUMENT, 0); }
		public TerminalNode CONCEPT_ARGUMENT() { return getToken(SCPParser.CONCEPT_ARGUMENT, 0); }
		public List<TerminalNode> BLOCK_END() { return getTokens(SCPParser.BLOCK_END); }
		public TerminalNode BLOCK_END(int i) {
			return getToken(SCPParser.BLOCK_END, i);
		}
		public List<RoleContext> role() {
			return getRuleContexts(RoleContext.class);
		}
		public RoleContext role(int i) {
			return getRuleContext(RoleContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCPVisitor ) return ((SCPVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(BINARY_RELATION_RIGHT);
			setState(47);
			match(NREL_CONDITION);
			setState(48);
			match(DVOETOCHIE);
			setState(49);
			match(NODE);
			setState(50);
			match(BLOCK_START);
			setState(51);
			match(BINARY_RELATION_LEFT);
			setState(52);
			match(NREL_RETURN_VALUE);
			setState(53);
			match(DVOETOCHIE);
			setState(54);
			match(NODE);
			setState(55);
			match(BLOCK_START);
			setState(56);
			match(UNARY_RELATION_LEFT);
			setState(57);
			match(CALLED_METHOD);
			setState(58);
			match(END_POINT);
			setState(59);
			match(BINARY_RELATION_RIGHT);
			setState(60);
			match(NREL_FUNCTION_PROTOTYPE);
			setState(61);
			match(DVOETOCHIE);
			setState(62);
			operators();
			setState(63);
			match(END_POINT);
			setState(64);
			match(BINARY_RELATION_RIGHT);
			setState(65);
			match(NREL_ARGUMENT);
			setState(66);
			match(DVOETOCHIE);
			setState(67);
			match(NODE);
			setState(68);
			match(BLOCK_START);
			setState(69);
			match(UNARY_RELATION_LEFT);
			setState(70);
			match(CONCEPT_ARGUMENT);
			setState(71);
			match(END_POINT);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				role();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==UNARY_RELATION_RIGHT );
			setState(77);
			match(BLOCK_END);
			setState(78);
			match(END_POINT);
			setState(79);
			match(BLOCK_END);
			setState(80);
			match(END_POINT);
			setState(81);
			match(BLOCK_END);
			setState(82);
			match(END_POINT);
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

	public static class Iteration_changeContext extends ParserRuleContext {
		public List<TerminalNode> BINARY_RELATION_RIGHT() { return getTokens(SCPParser.BINARY_RELATION_RIGHT); }
		public TerminalNode BINARY_RELATION_RIGHT(int i) {
			return getToken(SCPParser.BINARY_RELATION_RIGHT, i);
		}
		public TerminalNode NREL_ITERATION_CHANGE() { return getToken(SCPParser.NREL_ITERATION_CHANGE, 0); }
		public List<TerminalNode> DVOETOCHIE() { return getTokens(SCPParser.DVOETOCHIE); }
		public TerminalNode DVOETOCHIE(int i) {
			return getToken(SCPParser.DVOETOCHIE, i);
		}
		public List<TerminalNode> NODE() { return getTokens(SCPParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(SCPParser.NODE, i);
		}
		public List<TerminalNode> BLOCK_START() { return getTokens(SCPParser.BLOCK_START); }
		public TerminalNode BLOCK_START(int i) {
			return getToken(SCPParser.BLOCK_START, i);
		}
		public List<TerminalNode> UNARY_RELATION_LEFT() { return getTokens(SCPParser.UNARY_RELATION_LEFT); }
		public TerminalNode UNARY_RELATION_LEFT(int i) {
			return getToken(SCPParser.UNARY_RELATION_LEFT, i);
		}
		public TerminalNode CALLED_METHOD() { return getToken(SCPParser.CALLED_METHOD, 0); }
		public List<TerminalNode> END_POINT() { return getTokens(SCPParser.END_POINT); }
		public TerminalNode END_POINT(int i) {
			return getToken(SCPParser.END_POINT, i);
		}
		public TerminalNode NREL_FUNCTION_PROTOTYPE() { return getToken(SCPParser.NREL_FUNCTION_PROTOTYPE, 0); }
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public TerminalNode NREL_ARGUMENT() { return getToken(SCPParser.NREL_ARGUMENT, 0); }
		public TerminalNode CONCEPT_ARGUMENT() { return getToken(SCPParser.CONCEPT_ARGUMENT, 0); }
		public TerminalNode UNARY_RELATION_RIGHT() { return getToken(SCPParser.UNARY_RELATION_RIGHT, 0); }
		public TerminalNode ROLE() { return getToken(SCPParser.ROLE, 0); }
		public List<TerminalNode> BLOCK_END() { return getTokens(SCPParser.BLOCK_END); }
		public TerminalNode BLOCK_END(int i) {
			return getToken(SCPParser.BLOCK_END, i);
		}
		public Iteration_changeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_change; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).enterIteration_change(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).exitIteration_change(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCPVisitor ) return ((SCPVisitor<? extends T>)visitor).visitIteration_change(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteration_changeContext iteration_change() throws RecognitionException {
		Iteration_changeContext _localctx = new Iteration_changeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_iteration_change);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(BINARY_RELATION_RIGHT);
			setState(85);
			match(NREL_ITERATION_CHANGE);
			setState(86);
			match(DVOETOCHIE);
			setState(87);
			match(NODE);
			setState(88);
			match(BLOCK_START);
			setState(89);
			match(UNARY_RELATION_LEFT);
			setState(90);
			match(CALLED_METHOD);
			setState(91);
			match(END_POINT);
			setState(92);
			match(BINARY_RELATION_RIGHT);
			setState(93);
			match(NREL_FUNCTION_PROTOTYPE);
			setState(94);
			match(DVOETOCHIE);
			setState(95);
			operators();
			setState(96);
			match(END_POINT);
			setState(97);
			match(BINARY_RELATION_RIGHT);
			setState(98);
			match(NREL_ARGUMENT);
			setState(99);
			match(DVOETOCHIE);
			setState(100);
			match(NODE);
			setState(101);
			match(BLOCK_START);
			setState(102);
			match(UNARY_RELATION_LEFT);
			setState(103);
			match(CONCEPT_ARGUMENT);
			setState(104);
			match(END_POINT);
			setState(105);
			match(UNARY_RELATION_RIGHT);
			setState(106);
			match(ROLE);
			setState(107);
			match(DVOETOCHIE);
			setState(108);
			match(NODE);
			setState(109);
			match(END_POINT);
			setState(110);
			match(BLOCK_END);
			setState(111);
			match(END_POINT);
			setState(112);
			match(BLOCK_END);
			setState(113);
			match(END_POINT);
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

	public static class Iteration_bodyContext extends ParserRuleContext {
		public TerminalNode BINARY_RELATION_RIGHT() { return getToken(SCPParser.BINARY_RELATION_RIGHT, 0); }
		public TerminalNode NREL_ITERATION_BODY() { return getToken(SCPParser.NREL_ITERATION_BODY, 0); }
		public TerminalNode DVOETOCHIE() { return getToken(SCPParser.DVOETOCHIE, 0); }
		public TerminalNode NODE() { return getToken(SCPParser.NODE, 0); }
		public TerminalNode BLOCK_START() { return getToken(SCPParser.BLOCK_START, 0); }
		public TerminalNode UNARY_RELATION_LEFT() { return getToken(SCPParser.UNARY_RELATION_LEFT, 0); }
		public List<TerminalNode> END_POINT() { return getTokens(SCPParser.END_POINT); }
		public TerminalNode END_POINT(int i) {
			return getToken(SCPParser.END_POINT, i);
		}
		public TerminalNode BLOCK_END() { return getToken(SCPParser.BLOCK_END, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public Iteration_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).enterIteration_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).exitIteration_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCPVisitor ) return ((SCPVisitor<? extends T>)visitor).visitIteration_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteration_bodyContext iteration_body() throws RecognitionException {
		Iteration_bodyContext _localctx = new Iteration_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_iteration_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(BINARY_RELATION_RIGHT);
			setState(116);
			match(NREL_ITERATION_BODY);
			setState(117);
			match(DVOETOCHIE);
			setState(118);
			match(NODE);
			setState(119);
			match(BLOCK_START);
			setState(120);
			match(UNARY_RELATION_LEFT);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CODE_BLOCK) {
				{
				{
				setState(121);
				code();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(END_POINT);
			setState(128);
			match(BLOCK_END);
			setState(129);
			match(END_POINT);
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

	public static class For_satementContext extends ParserRuleContext {
		public TerminalNode CODE_BLOCK() { return getToken(SCPParser.CODE_BLOCK, 0); }
		public List<TerminalNode> UNARY_RELATION_RIGHT() { return getTokens(SCPParser.UNARY_RELATION_RIGHT); }
		public TerminalNode UNARY_RELATION_RIGHT(int i) {
			return getToken(SCPParser.UNARY_RELATION_RIGHT, i);
		}
		public List<TerminalNode> NODE() { return getTokens(SCPParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(SCPParser.NODE, i);
		}
		public List<TerminalNode> BLOCK_START() { return getTokens(SCPParser.BLOCK_START); }
		public TerminalNode BLOCK_START(int i) {
			return getToken(SCPParser.BLOCK_START, i);
		}
		public TerminalNode ROLE() { return getToken(SCPParser.ROLE, 0); }
		public TerminalNode DVOETOCHIE() { return getToken(SCPParser.DVOETOCHIE, 0); }
		public TerminalNode UNARY_RELATION_LEFT() { return getToken(SCPParser.UNARY_RELATION_LEFT, 0); }
		public TerminalNode FOR() { return getToken(SCPParser.FOR, 0); }
		public TerminalNode END_POINT() { return getToken(SCPParser.END_POINT, 0); }
		public TerminalNode BINARY_RELATION_RIGHT() { return getToken(SCPParser.BINARY_RELATION_RIGHT, 0); }
		public Iteration_variableContext iteration_variable() {
			return getRuleContext(Iteration_variableContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Iteration_changeContext iteration_change() {
			return getRuleContext(Iteration_changeContext.class,0);
		}
		public Iteration_bodyContext iteration_body() {
			return getRuleContext(Iteration_bodyContext.class,0);
		}
		public For_satementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_satement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).enterFor_satement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).exitFor_satement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCPVisitor ) return ((SCPVisitor<? extends T>)visitor).visitFor_satement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_satementContext for_satement() throws RecognitionException {
		For_satementContext _localctx = new For_satementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_satement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(CODE_BLOCK);
			setState(132);
			match(UNARY_RELATION_RIGHT);
			setState(133);
			match(NODE);
			setState(134);
			match(BLOCK_START);
			{
			setState(135);
			match(UNARY_RELATION_RIGHT);
			setState(136);
			match(ROLE);
			setState(137);
			match(DVOETOCHIE);
			setState(138);
			match(NODE);
			setState(139);
			match(BLOCK_START);
			setState(140);
			match(UNARY_RELATION_LEFT);
			setState(141);
			match(FOR);
			setState(142);
			match(END_POINT);
			setState(143);
			match(BINARY_RELATION_RIGHT);
			setState(144);
			iteration_variable();
			setState(145);
			condition();
			setState(146);
			iteration_change();
			setState(147);
			iteration_body();
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

	public static class Break_ruleContext extends ParserRuleContext {
		public TerminalNode CODE_BLOCK() { return getToken(SCPParser.CODE_BLOCK, 0); }
		public List<TerminalNode> UNARY_RELATION_RIGHT() { return getTokens(SCPParser.UNARY_RELATION_RIGHT); }
		public TerminalNode UNARY_RELATION_RIGHT(int i) {
			return getToken(SCPParser.UNARY_RELATION_RIGHT, i);
		}
		public List<TerminalNode> NODE() { return getTokens(SCPParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(SCPParser.NODE, i);
		}
		public List<TerminalNode> BLOCK_START() { return getTokens(SCPParser.BLOCK_START); }
		public TerminalNode BLOCK_START(int i) {
			return getToken(SCPParser.BLOCK_START, i);
		}
		public TerminalNode ROLE() { return getToken(SCPParser.ROLE, 0); }
		public List<TerminalNode> DVOETOCHIE() { return getTokens(SCPParser.DVOETOCHIE); }
		public TerminalNode DVOETOCHIE(int i) {
			return getToken(SCPParser.DVOETOCHIE, i);
		}
		public TerminalNode UNARY_RELATION_LEFT() { return getToken(SCPParser.UNARY_RELATION_LEFT, 0); }
		public TerminalNode CONCEPT_ITERATION_STATEMENT() { return getToken(SCPParser.CONCEPT_ITERATION_STATEMENT, 0); }
		public List<TerminalNode> END_POINT() { return getTokens(SCPParser.END_POINT); }
		public TerminalNode END_POINT(int i) {
			return getToken(SCPParser.END_POINT, i);
		}
		public TerminalNode BINARY_RELATION_RIGHT() { return getToken(SCPParser.BINARY_RELATION_RIGHT, 0); }
		public TerminalNode NREL_INTERRUPT() { return getToken(SCPParser.NREL_INTERRUPT, 0); }
		public TerminalNode BREAK() { return getToken(SCPParser.BREAK, 0); }
		public List<TerminalNode> BLOCK_END() { return getTokens(SCPParser.BLOCK_END); }
		public TerminalNode BLOCK_END(int i) {
			return getToken(SCPParser.BLOCK_END, i);
		}
		public Break_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).enterBreak_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).exitBreak_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCPVisitor ) return ((SCPVisitor<? extends T>)visitor).visitBreak_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_ruleContext break_rule() throws RecognitionException {
		Break_ruleContext _localctx = new Break_ruleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_break_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(CODE_BLOCK);
			setState(150);
			match(UNARY_RELATION_RIGHT);
			setState(151);
			match(NODE);
			setState(152);
			match(BLOCK_START);
			setState(153);
			match(UNARY_RELATION_RIGHT);
			setState(154);
			match(ROLE);
			setState(155);
			match(DVOETOCHIE);
			setState(156);
			match(NODE);
			setState(157);
			match(BLOCK_START);
			setState(158);
			match(UNARY_RELATION_LEFT);
			setState(159);
			match(CONCEPT_ITERATION_STATEMENT);
			setState(160);
			match(END_POINT);
			setState(161);
			match(BINARY_RELATION_RIGHT);
			setState(162);
			match(NREL_INTERRUPT);
			setState(163);
			match(DVOETOCHIE);
			setState(164);
			match(NODE);
			setState(165);
			match(BLOCK_START);
			setState(166);
			match(BREAK);
			setState(167);
			match(END_POINT);
			setState(168);
			match(BLOCK_END);
			setState(169);
			match(END_POINT);
			setState(170);
			match(BLOCK_END);
			setState(171);
			match(END_POINT);
			setState(172);
			match(BLOCK_END);
			setState(173);
			match(END_POINT);
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

	public static class CodeContext extends ParserRuleContext {
		public List<For_satementContext> for_satement() {
			return getRuleContexts(For_satementContext.class);
		}
		public For_satementContext for_satement(int i) {
			return getRuleContext(For_satementContext.class,i);
		}
		public Break_ruleContext break_rule() {
			return getRuleContext(Break_ruleContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCPVisitor ) return ((SCPVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_code);
		try {
			int _alt;
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(175);
						for_satement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(178); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				break_rule();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\6\5L\n\5\r\5\16\5M\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7}\n"+
		"\7\f\7\16\7\u0080\13\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\6\n\u00b3\n\n\r\n\16\n\u00b4\3\n\5\n\u00b8\n\n\3\n\2\2\13\2\4"+
		"\6\b\n\f\16\20\22\2\3\3\2&\'\2\u00b4\2\24\3\2\2\2\4\26\3\2\2\2\6*\3\2"+
		"\2\2\b\60\3\2\2\2\nV\3\2\2\2\fu\3\2\2\2\16\u0085\3\2\2\2\20\u0097\3\2"+
		"\2\2\22\u00b7\3\2\2\2\24\25\t\2\2\2\25\3\3\2\2\2\26\27\7\24\2\2\27\30"+
		"\7\21\2\2\30\31\7\5\2\2\31\32\7\r\2\2\32\33\7\t\2\2\33\34\7\36\2\2\34"+
		"\35\7\f\2\2\35\36\7\n\2\2\36\37\7\25\2\2\37 \7\21\2\2 !\7\5\2\2!\"\7\r"+
		"\2\2\"#\7\t\2\2#$\7\4\2\2$%\7\f\2\2%&\7\16\2\2&\'\7\f\2\2\'(\7\16\2\2"+
		"()\7\f\2\2)\5\3\2\2\2*+\7\b\2\2+,\7\22\2\2,-\7\21\2\2-.\7\5\2\2./\7\f"+
		"\2\2/\7\3\2\2\2\60\61\7\n\2\2\61\62\7\26\2\2\62\63\7\21\2\2\63\64\7\5"+
		"\2\2\64\65\7\r\2\2\65\66\7\13\2\2\66\67\7\27\2\2\678\7\21\2\289\7\5\2"+
		"\29:\7\r\2\2:;\7\t\2\2;<\7\"\2\2<=\7\f\2\2=>\7\n\2\2>?\7\30\2\2?@\7\21"+
		"\2\2@A\5\2\2\2AB\7\f\2\2BC\7\n\2\2CD\7\31\2\2DE\7\21\2\2EF\7\5\2\2FG\7"+
		"\r\2\2GH\7\t\2\2HI\7#\2\2IK\7\f\2\2JL\5\6\4\2KJ\3\2\2\2LM\3\2\2\2MK\3"+
		"\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\16\2\2PQ\7\f\2\2QR\7\16\2\2RS\7\f\2\2S"+
		"T\7\16\2\2TU\7\f\2\2U\t\3\2\2\2VW\7\n\2\2WX\7\32\2\2XY\7\21\2\2YZ\7\5"+
		"\2\2Z[\7\r\2\2[\\\7\t\2\2\\]\7\"\2\2]^\7\f\2\2^_\7\n\2\2_`\7\30\2\2`a"+
		"\7\21\2\2ab\5\2\2\2bc\7\f\2\2cd\7\n\2\2de\7\31\2\2ef\7\21\2\2fg\7\5\2"+
		"\2gh\7\r\2\2hi\7\t\2\2ij\7#\2\2jk\7\f\2\2kl\7\b\2\2lm\7\22\2\2mn\7\21"+
		"\2\2no\7\5\2\2op\7\f\2\2pq\7\16\2\2qr\7\f\2\2rs\7\16\2\2st\7\f\2\2t\13"+
		"\3\2\2\2uv\7\n\2\2vw\7\33\2\2wx\7\21\2\2xy\7\5\2\2yz\7\r\2\2z~\7\t\2\2"+
		"{}\5\22\n\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\f\2\2\u0082\u0083\7\16\2\2\u0083"+
		"\u0084\7\f\2\2\u0084\r\3\2\2\2\u0085\u0086\7\37\2\2\u0086\u0087\7\b\2"+
		"\2\u0087\u0088\7\5\2\2\u0088\u0089\7\r\2\2\u0089\u008a\7\b\2\2\u008a\u008b"+
		"\7\22\2\2\u008b\u008c\7\21\2\2\u008c\u008d\7\5\2\2\u008d\u008e\7\r\2\2"+
		"\u008e\u008f\7\t\2\2\u008f\u0090\7 \2\2\u0090\u0091\7\f\2\2\u0091\u0092"+
		"\7\n\2\2\u0092\u0093\5\4\3\2\u0093\u0094\5\b\5\2\u0094\u0095\5\n\6\2\u0095"+
		"\u0096\5\f\7\2\u0096\17\3\2\2\2\u0097\u0098\7\37\2\2\u0098\u0099\7\b\2"+
		"\2\u0099\u009a\7\5\2\2\u009a\u009b\7\r\2\2\u009b\u009c\7\b\2\2\u009c\u009d"+
		"\7\22\2\2\u009d\u009e\7\21\2\2\u009e\u009f\7\5\2\2\u009f\u00a0\7\r\2\2"+
		"\u00a0\u00a1\7\t\2\2\u00a1\u00a2\7$\2\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4"+
		"\7\n\2\2\u00a4\u00a5\7\34\2\2\u00a5\u00a6\7\21\2\2\u00a6\u00a7\7\5\2\2"+
		"\u00a7\u00a8\7\r\2\2\u00a8\u00a9\7!\2\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab"+
		"\7\16\2\2\u00ab\u00ac\7\f\2\2\u00ac\u00ad\7\16\2\2\u00ad\u00ae\7\f\2\2"+
		"\u00ae\u00af\7\16\2\2\u00af\u00b0\7\f\2\2\u00b0\21\3\2\2\2\u00b1\u00b3"+
		"\5\16\b\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2"+
		"\u00b4\u00b5\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b8\5\20\t\2\u00b7\u00b2"+
		"\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\23\3\2\2\2\6M~\u00b4\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}