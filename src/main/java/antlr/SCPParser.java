// Generated from C:/Users/User/Downloads/comicStore-master/Kursach/src/main/java/antlr\SCP.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SCPParser extends Parser {
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
	public static final int
		RULE_type = 0, RULE_operators = 1, RULE_iteration_variable = 2, RULE_role = 3, 
		RULE_condition = 4, RULE_iteration_change = 5, RULE_iteration_body = 6, 
		RULE_for_satement = 7, RULE_break_rule = 8, RULE_class_statement = 9, 
		RULE_class_field = 10, RULE_class_constructor = 11, RULE_method_statement = 12, 
		RULE_called_method = 13, RULE_body = 14, RULE_runtime_code = 15, RULE_code = 16, 
		RULE_cr = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"type", "operators", "iteration_variable", "role", "condition", "iteration_change", 
			"iteration_body", "for_satement", "break_rule", "class_statement", "class_field", 
			"class_constructor", "method_statement", "called_method", "body", "runtime_code", 
			"code", "cr"
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCPVisitor ) return ((SCPVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
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

	public static class OperatorsContext extends ParserRuleContext {
		public TerminalNode OPERATOR_LESS() { return getToken(SCPParser.OPERATOR_LESS, 0); }
		public TerminalNode OPERATOR_DECREMENT() { return getToken(SCPParser.OPERATOR_DECREMENT, 0); }
		public TerminalNode OPERATOR() { return getToken(SCPParser.OPERATOR, 0); }
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
		enterRule(_localctx, 2, RULE_operators);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(OPERATOR_LESS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(OPERATOR_DECREMENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				match(OPERATOR);
				setState(41);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(OPERATOR);
				setState(43);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				match(OPERATOR);
				setState(45);
				match(T__6);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				match(OPERATOR);
				setState(47);
				match(T__7);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(48);
				match(OPERATOR);
				setState(49);
				match(T__8);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(50);
				match(OPERATOR);
				setState(51);
				match(T__9);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(52);
				match(OPERATOR);
				setState(53);
				match(T__10);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(54);
				match(OPERATOR);
				setState(55);
				match(T__11);
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
		enterRule(_localctx, 4, RULE_iteration_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(NREL_ITERATION_VAR);
			setState(59);
			match(DVOETOCHIE);
			setState(60);
			match(NODE);
			setState(61);
			match(BLOCK_START);
			setState(62);
			match(UNARY_RELATION_LEFT);
			setState(63);
			match(CONCEPT_VARIABLE);
			setState(64);
			match(END_POINT);
			setState(65);
			match(BINARY_RELATION_RIGHT);
			setState(66);
			match(NREL_VALUE);
			setState(67);
			match(DVOETOCHIE);
			setState(68);
			match(NODE);
			setState(69);
			match(BLOCK_START);
			setState(70);
			match(UNARY_RELATION_LEFT);
			setState(71);
			match(NUMBER);
			setState(72);
			match(END_POINT);
			setState(73);
			match(BLOCK_END);
			setState(74);
			match(END_POINT);
			setState(75);
			match(BLOCK_END);
			setState(76);
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
		enterRule(_localctx, 6, RULE_role);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(78);
			match(UNARY_RELATION_RIGHT);
			setState(79);
			match(ROLE);
			setState(80);
			match(DVOETOCHIE);
			setState(81);
			match(NODE);
			setState(82);
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
		enterRule(_localctx, 8, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(BINARY_RELATION_RIGHT);
			setState(85);
			match(NREL_CONDITION);
			setState(86);
			match(DVOETOCHIE);
			setState(87);
			match(NODE);
			setState(88);
			match(BLOCK_START);
			setState(89);
			match(BINARY_RELATION_LEFT);
			setState(90);
			match(NREL_RETURN_VALUE);
			setState(91);
			match(DVOETOCHIE);
			setState(92);
			match(NODE);
			setState(93);
			match(BLOCK_START);
			setState(94);
			match(UNARY_RELATION_LEFT);
			setState(95);
			match(CALLED_METHOD);
			setState(96);
			match(END_POINT);
			setState(97);
			match(BINARY_RELATION_RIGHT);
			setState(98);
			match(NREL_FUNCTION_PROTOTYPE);
			setState(99);
			match(DVOETOCHIE);
			setState(100);
			operators();
			setState(101);
			match(END_POINT);
			setState(102);
			match(BINARY_RELATION_RIGHT);
			setState(103);
			match(NREL_ARGUMENT);
			setState(104);
			match(DVOETOCHIE);
			setState(105);
			match(NODE);
			setState(106);
			match(BLOCK_START);
			setState(107);
			match(UNARY_RELATION_LEFT);
			setState(108);
			match(CONCEPT_ARGUMENT);
			setState(109);
			match(END_POINT);
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				role();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==UNARY_RELATION_RIGHT );
			setState(115);
			match(BLOCK_END);
			setState(116);
			match(END_POINT);
			setState(117);
			match(BLOCK_END);
			setState(118);
			match(END_POINT);
			setState(119);
			match(BLOCK_END);
			setState(120);
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
		enterRule(_localctx, 10, RULE_iteration_change);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(BINARY_RELATION_RIGHT);
			setState(123);
			match(NREL_ITERATION_CHANGE);
			setState(124);
			match(DVOETOCHIE);
			setState(125);
			match(NODE);
			setState(126);
			match(BLOCK_START);
			setState(127);
			match(UNARY_RELATION_LEFT);
			setState(128);
			match(CALLED_METHOD);
			setState(129);
			match(END_POINT);
			setState(130);
			match(BINARY_RELATION_RIGHT);
			setState(131);
			match(NREL_FUNCTION_PROTOTYPE);
			setState(132);
			match(DVOETOCHIE);
			setState(133);
			operators();
			setState(134);
			match(END_POINT);
			setState(135);
			match(BINARY_RELATION_RIGHT);
			setState(136);
			match(NREL_ARGUMENT);
			setState(137);
			match(DVOETOCHIE);
			setState(138);
			match(NODE);
			setState(139);
			match(BLOCK_START);
			setState(140);
			match(UNARY_RELATION_LEFT);
			setState(141);
			match(CONCEPT_ARGUMENT);
			setState(142);
			match(END_POINT);
			setState(143);
			match(UNARY_RELATION_RIGHT);
			setState(144);
			match(ROLE);
			setState(145);
			match(DVOETOCHIE);
			setState(146);
			match(NODE);
			setState(147);
			match(END_POINT);
			setState(148);
			match(BLOCK_END);
			setState(149);
			match(END_POINT);
			setState(150);
			match(BLOCK_END);
			setState(151);
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
		enterRule(_localctx, 12, RULE_iteration_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(BINARY_RELATION_RIGHT);
			setState(154);
			match(NREL_ITERATION_BODY);
			setState(155);
			match(DVOETOCHIE);
			setState(156);
			match(NODE);
			setState(157);
			match(BLOCK_START);
			setState(158);
			match(UNARY_RELATION_LEFT);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CODE_BLOCK) {
				{
				{
				setState(159);
				code();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(END_POINT);
			setState(166);
			match(BLOCK_END);
			setState(167);
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
		enterRule(_localctx, 14, RULE_for_satement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(CODE_BLOCK);
			setState(170);
			match(UNARY_RELATION_RIGHT);
			setState(171);
			match(NODE);
			setState(172);
			match(BLOCK_START);
			{
			setState(173);
			match(UNARY_RELATION_RIGHT);
			setState(174);
			match(ROLE);
			setState(175);
			match(DVOETOCHIE);
			setState(176);
			match(NODE);
			setState(177);
			match(BLOCK_START);
			setState(178);
			match(UNARY_RELATION_LEFT);
			setState(179);
			match(FOR);
			setState(180);
			match(END_POINT);
			setState(181);
			match(BINARY_RELATION_RIGHT);
			setState(182);
			iteration_variable();
			setState(183);
			condition();
			setState(184);
			iteration_change();
			setState(185);
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
		public List<TerminalNode> UNARY_RELATION_LEFT() { return getTokens(SCPParser.UNARY_RELATION_LEFT); }
		public TerminalNode UNARY_RELATION_LEFT(int i) {
			return getToken(SCPParser.UNARY_RELATION_LEFT, i);
		}
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
		enterRule(_localctx, 16, RULE_break_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(CODE_BLOCK);
			setState(188);
			match(UNARY_RELATION_RIGHT);
			setState(189);
			match(NODE);
			setState(190);
			match(BLOCK_START);
			setState(191);
			match(UNARY_RELATION_RIGHT);
			setState(192);
			match(ROLE);
			setState(193);
			match(DVOETOCHIE);
			setState(194);
			match(NODE);
			setState(195);
			match(BLOCK_START);
			setState(196);
			match(UNARY_RELATION_LEFT);
			setState(197);
			match(CONCEPT_ITERATION_STATEMENT);
			setState(198);
			match(END_POINT);
			setState(199);
			match(BINARY_RELATION_RIGHT);
			setState(200);
			match(NREL_INTERRUPT);
			setState(201);
			match(DVOETOCHIE);
			setState(202);
			match(NODE);
			setState(203);
			match(BLOCK_START);
			setState(204);
			match(UNARY_RELATION_LEFT);
			setState(205);
			match(BREAK);
			setState(206);
			match(END_POINT);
			setState(207);
			match(BLOCK_END);
			setState(208);
			match(END_POINT);
			setState(209);
			match(BLOCK_END);
			setState(210);
			match(END_POINT);
			setState(211);
			match(BLOCK_END);
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(212);
				match(END_POINT);
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

	public static class Class_statementContext extends ParserRuleContext {
		public TerminalNode CONCEPT_CLASS() { return getToken(SCPParser.CONCEPT_CLASS, 0); }
		public TerminalNode UNARY_RELATION_RIGHT() { return getToken(SCPParser.UNARY_RELATION_RIGHT, 0); }
		public TerminalNode CLASS_NODE() { return getToken(SCPParser.CLASS_NODE, 0); }
		public TerminalNode BLOCK_START() { return getToken(SCPParser.BLOCK_START, 0); }
		public TerminalNode BLOCK_END() { return getToken(SCPParser.BLOCK_END, 0); }
		public TerminalNode END_POINT() { return getToken(SCPParser.END_POINT, 0); }
		public List<Class_fieldContext> class_field() {
			return getRuleContexts(Class_fieldContext.class);
		}
		public Class_fieldContext class_field(int i) {
			return getRuleContext(Class_fieldContext.class,i);
		}
		public List<Class_constructorContext> class_constructor() {
			return getRuleContexts(Class_constructorContext.class);
		}
		public Class_constructorContext class_constructor(int i) {
			return getRuleContext(Class_constructorContext.class,i);
		}
		public List<Method_statementContext> method_statement() {
			return getRuleContexts(Method_statementContext.class);
		}
		public Method_statementContext method_statement(int i) {
			return getRuleContext(Method_statementContext.class,i);
		}
		public Class_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).enterClass_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).exitClass_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCPVisitor ) return ((SCPVisitor<? extends T>)visitor).visitClass_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_statementContext class_statement() throws RecognitionException {
		Class_statementContext _localctx = new Class_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_class_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(CONCEPT_CLASS);
			setState(216);
			match(UNARY_RELATION_RIGHT);
			setState(217);
			match(CLASS_NODE);
			setState(218);
			match(BLOCK_START);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BINARY_RELATION_RIGHT) {
				{
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(219);
					class_field();
					}
					break;
				case 2:
					{
					setState(220);
					class_constructor();
					}
					break;
				case 3:
					{
					setState(221);
					method_statement();
					}
					break;
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			match(BLOCK_END);
			setState(228);
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

	public static class Class_fieldContext extends ParserRuleContext {
		public List<TerminalNode> BINARY_RELATION_RIGHT() { return getTokens(SCPParser.BINARY_RELATION_RIGHT); }
		public TerminalNode BINARY_RELATION_RIGHT(int i) {
			return getToken(SCPParser.BINARY_RELATION_RIGHT, i);
		}
		public TerminalNode NREL_CLASS_FIELD() { return getToken(SCPParser.NREL_CLASS_FIELD, 0); }
		public List<TerminalNode> DVOETOCHIE() { return getTokens(SCPParser.DVOETOCHIE); }
		public TerminalNode DVOETOCHIE(int i) {
			return getToken(SCPParser.DVOETOCHIE, i);
		}
		public TerminalNode CLASS_NODE() { return getToken(SCPParser.CLASS_NODE, 0); }
		public TerminalNode BLOCK_START() { return getToken(SCPParser.BLOCK_START, 0); }
		public TerminalNode BLOCK_END() { return getToken(SCPParser.BLOCK_END, 0); }
		public List<TerminalNode> END_POINT() { return getTokens(SCPParser.END_POINT); }
		public TerminalNode END_POINT(int i) {
			return getToken(SCPParser.END_POINT, i);
		}
		public List<TerminalNode> UNARY_RELATION_LEFT() { return getTokens(SCPParser.UNARY_RELATION_LEFT); }
		public TerminalNode UNARY_RELATION_LEFT(int i) {
			return getToken(SCPParser.UNARY_RELATION_LEFT, i);
		}
		public List<TerminalNode> CONCEPT_VARIABLE() { return getTokens(SCPParser.CONCEPT_VARIABLE); }
		public TerminalNode CONCEPT_VARIABLE(int i) {
			return getToken(SCPParser.CONCEPT_VARIABLE, i);
		}
		public List<TerminalNode> CONCEPT() { return getTokens(SCPParser.CONCEPT); }
		public TerminalNode CONCEPT(int i) {
			return getToken(SCPParser.CONCEPT, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> NREL_ACCESS_MODIFIER() { return getTokens(SCPParser.NREL_ACCESS_MODIFIER); }
		public TerminalNode NREL_ACCESS_MODIFIER(int i) {
			return getToken(SCPParser.NREL_ACCESS_MODIFIER, i);
		}
		public List<TerminalNode> CONCEPT_ACCESS_MODIFIER() { return getTokens(SCPParser.CONCEPT_ACCESS_MODIFIER); }
		public TerminalNode CONCEPT_ACCESS_MODIFIER(int i) {
			return getToken(SCPParser.CONCEPT_ACCESS_MODIFIER, i);
		}
		public Class_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).enterClass_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).exitClass_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCPVisitor ) return ((SCPVisitor<? extends T>)visitor).visitClass_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_fieldContext class_field() throws RecognitionException {
		Class_fieldContext _localctx = new Class_fieldContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_class_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(BINARY_RELATION_RIGHT);
			setState(231);
			match(NREL_CLASS_FIELD);
			setState(232);
			match(DVOETOCHIE);
			setState(233);
			match(CLASS_NODE);
			setState(234);
			match(BLOCK_START);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNARY_RELATION_LEFT || _la==BINARY_RELATION_RIGHT) {
				{
				{
				setState(244);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(235);
					match(UNARY_RELATION_LEFT);
					setState(236);
					match(CONCEPT_VARIABLE);
					}
					break;
				case 2:
					{
					setState(237);
					match(UNARY_RELATION_LEFT);
					setState(238);
					match(CONCEPT);
					setState(239);
					type();
					}
					break;
				case 3:
					{
					setState(240);
					match(BINARY_RELATION_RIGHT);
					setState(241);
					match(NREL_ACCESS_MODIFIER);
					setState(242);
					match(DVOETOCHIE);
					setState(243);
					match(CONCEPT_ACCESS_MODIFIER);
					}
					break;
				}
				setState(246);
				match(END_POINT);
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
			match(BLOCK_END);
			setState(253);
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

	public static class Class_constructorContext extends ParserRuleContext {
		public TerminalNode BINARY_RELATION_RIGHT() { return getToken(SCPParser.BINARY_RELATION_RIGHT, 0); }
		public TerminalNode NREL_CONSTRUCTOR() { return getToken(SCPParser.NREL_CONSTRUCTOR, 0); }
		public List<TerminalNode> DVOETOCHIE() { return getTokens(SCPParser.DVOETOCHIE); }
		public TerminalNode DVOETOCHIE(int i) {
			return getToken(SCPParser.DVOETOCHIE, i);
		}
		public TerminalNode CONSTRUCTOR_NODE() { return getToken(SCPParser.CONSTRUCTOR_NODE, 0); }
		public List<TerminalNode> BLOCK_START() { return getTokens(SCPParser.BLOCK_START); }
		public TerminalNode BLOCK_START(int i) {
			return getToken(SCPParser.BLOCK_START, i);
		}
		public List<TerminalNode> UNARY_RELATION_RIGHT() { return getTokens(SCPParser.UNARY_RELATION_RIGHT); }
		public TerminalNode UNARY_RELATION_RIGHT(int i) {
			return getToken(SCPParser.UNARY_RELATION_RIGHT, i);
		}
		public List<TerminalNode> NODE() { return getTokens(SCPParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(SCPParser.NODE, i);
		}
		public List<TerminalNode> UNARY_RELATION_LEFT() { return getTokens(SCPParser.UNARY_RELATION_LEFT); }
		public TerminalNode UNARY_RELATION_LEFT(int i) {
			return getToken(SCPParser.UNARY_RELATION_LEFT, i);
		}
		public TerminalNode CONCEPT_ARGUMENT() { return getToken(SCPParser.CONCEPT_ARGUMENT, 0); }
		public List<TerminalNode> END_POINT() { return getTokens(SCPParser.END_POINT); }
		public TerminalNode END_POINT(int i) {
			return getToken(SCPParser.END_POINT, i);
		}
		public List<TerminalNode> BLOCK_END() { return getTokens(SCPParser.BLOCK_END); }
		public TerminalNode BLOCK_END(int i) {
			return getToken(SCPParser.BLOCK_END, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> ROLE() { return getTokens(SCPParser.ROLE); }
		public TerminalNode ROLE(int i) {
			return getToken(SCPParser.ROLE, i);
		}
		public List<TerminalNode> CONCEPT_VARIABLE() { return getTokens(SCPParser.CONCEPT_VARIABLE); }
		public TerminalNode CONCEPT_VARIABLE(int i) {
			return getToken(SCPParser.CONCEPT_VARIABLE, i);
		}
		public Class_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).enterClass_constructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).exitClass_constructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCPVisitor ) return ((SCPVisitor<? extends T>)visitor).visitClass_constructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_constructorContext class_constructor() throws RecognitionException {
		Class_constructorContext _localctx = new Class_constructorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_class_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(BINARY_RELATION_RIGHT);
			setState(256);
			match(NREL_CONSTRUCTOR);
			setState(257);
			match(DVOETOCHIE);
			setState(258);
			match(CONSTRUCTOR_NODE);
			setState(259);
			match(BLOCK_START);
			setState(260);
			match(UNARY_RELATION_RIGHT);
			setState(261);
			match(NODE);
			setState(262);
			match(BLOCK_START);
			setState(263);
			match(UNARY_RELATION_LEFT);
			setState(264);
			match(CONCEPT_ARGUMENT);
			setState(265);
			match(END_POINT);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNARY_RELATION_RIGHT) {
				{
				{
				setState(266);
				match(UNARY_RELATION_RIGHT);
				setState(267);
				match(ROLE);
				setState(268);
				match(DVOETOCHIE);
				setState(269);
				match(NODE);
				setState(270);
				match(BLOCK_START);
				setState(271);
				match(UNARY_RELATION_LEFT);
				setState(272);
				match(CONCEPT_VARIABLE);
				setState(273);
				match(END_POINT);
				setState(274);
				match(BLOCK_END);
				setState(275);
				match(END_POINT);
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			match(BLOCK_END);
			setState(282);
			match(END_POINT);
			setState(283);
			body();
			setState(284);
			match(END_POINT);
			setState(285);
			match(BLOCK_END);
			setState(286);
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

	public static class Method_statementContext extends ParserRuleContext {
		public List<TerminalNode> BINARY_RELATION_RIGHT() { return getTokens(SCPParser.BINARY_RELATION_RIGHT); }
		public TerminalNode BINARY_RELATION_RIGHT(int i) {
			return getToken(SCPParser.BINARY_RELATION_RIGHT, i);
		}
		public TerminalNode NREL_METHOD() { return getToken(SCPParser.NREL_METHOD, 0); }
		public List<TerminalNode> DVOETOCHIE() { return getTokens(SCPParser.DVOETOCHIE); }
		public TerminalNode DVOETOCHIE(int i) {
			return getToken(SCPParser.DVOETOCHIE, i);
		}
		public TerminalNode CLASS_NODE() { return getToken(SCPParser.CLASS_NODE, 0); }
		public TerminalNode BLOCK_START() { return getToken(SCPParser.BLOCK_START, 0); }
		public TerminalNode BLOCK_END() { return getToken(SCPParser.BLOCK_END, 0); }
		public List<TerminalNode> END_POINT() { return getTokens(SCPParser.END_POINT); }
		public TerminalNode END_POINT(int i) {
			return getToken(SCPParser.END_POINT, i);
		}
		public List<TerminalNode> UNARY_RELATION_LEFT() { return getTokens(SCPParser.UNARY_RELATION_LEFT); }
		public TerminalNode UNARY_RELATION_LEFT(int i) {
			return getToken(SCPParser.UNARY_RELATION_LEFT, i);
		}
		public List<TerminalNode> CONCEPT_METHOD() { return getTokens(SCPParser.CONCEPT_METHOD); }
		public TerminalNode CONCEPT_METHOD(int i) {
			return getToken(SCPParser.CONCEPT_METHOD, i);
		}
		public List<TerminalNode> NREL_ACCESS_MODIFIER() { return getTokens(SCPParser.NREL_ACCESS_MODIFIER); }
		public TerminalNode NREL_ACCESS_MODIFIER(int i) {
			return getToken(SCPParser.NREL_ACCESS_MODIFIER, i);
		}
		public List<TerminalNode> CONCEPT_ACCESS_MODIFIER() { return getTokens(SCPParser.CONCEPT_ACCESS_MODIFIER); }
		public TerminalNode CONCEPT_ACCESS_MODIFIER(int i) {
			return getToken(SCPParser.CONCEPT_ACCESS_MODIFIER, i);
		}
		public List<TerminalNode> NREL_RETURN_TYPE() { return getTokens(SCPParser.NREL_RETURN_TYPE); }
		public TerminalNode NREL_RETURN_TYPE(int i) {
			return getToken(SCPParser.NREL_RETURN_TYPE, i);
		}
		public List<TerminalNode> CONCEPT() { return getTokens(SCPParser.CONCEPT); }
		public TerminalNode CONCEPT(int i) {
			return getToken(SCPParser.CONCEPT, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public Method_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).enterMethod_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).exitMethod_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCPVisitor ) return ((SCPVisitor<? extends T>)visitor).visitMethod_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_statementContext method_statement() throws RecognitionException {
		Method_statementContext _localctx = new Method_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_method_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(BINARY_RELATION_RIGHT);
			setState(289);
			match(NREL_METHOD);
			setState(290);
			match(DVOETOCHIE);
			setState(291);
			match(CLASS_NODE);
			setState(292);
			match(BLOCK_START);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNARY_RELATION_LEFT || _la==BINARY_RELATION_RIGHT) {
				{
				{
				setState(305);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(293);
					match(UNARY_RELATION_LEFT);
					setState(294);
					match(CONCEPT_METHOD);
					}
					break;
				case 2:
					{
					setState(295);
					match(BINARY_RELATION_RIGHT);
					setState(296);
					match(NREL_ACCESS_MODIFIER);
					setState(297);
					match(DVOETOCHIE);
					setState(298);
					match(CONCEPT_ACCESS_MODIFIER);
					}
					break;
				case 3:
					{
					setState(299);
					match(BINARY_RELATION_RIGHT);
					setState(300);
					match(NREL_RETURN_TYPE);
					setState(301);
					match(DVOETOCHIE);
					setState(302);
					match(CONCEPT);
					setState(303);
					type();
					}
					break;
				case 4:
					{
					setState(304);
					body();
					}
					break;
				}
				setState(307);
				match(END_POINT);
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			match(BLOCK_END);
			setState(314);
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

	public static class Called_methodContext extends ParserRuleContext {
		public List<TerminalNode> NODE() { return getTokens(SCPParser.NODE); }
		public TerminalNode NODE(int i) {
			return getToken(SCPParser.NODE, i);
		}
		public List<TerminalNode> BLOCK_START() { return getTokens(SCPParser.BLOCK_START); }
		public TerminalNode BLOCK_START(int i) {
			return getToken(SCPParser.BLOCK_START, i);
		}
		public List<TerminalNode> BLOCK_END() { return getTokens(SCPParser.BLOCK_END); }
		public TerminalNode BLOCK_END(int i) {
			return getToken(SCPParser.BLOCK_END, i);
		}
		public List<TerminalNode> END_POINT() { return getTokens(SCPParser.END_POINT); }
		public TerminalNode END_POINT(int i) {
			return getToken(SCPParser.END_POINT, i);
		}
		public List<TerminalNode> UNARY_RELATION_LEFT() { return getTokens(SCPParser.UNARY_RELATION_LEFT); }
		public TerminalNode UNARY_RELATION_LEFT(int i) {
			return getToken(SCPParser.UNARY_RELATION_LEFT, i);
		}
		public List<TerminalNode> CONCEPT_CALLED_METHOD() { return getTokens(SCPParser.CONCEPT_CALLED_METHOD); }
		public TerminalNode CONCEPT_CALLED_METHOD(int i) {
			return getToken(SCPParser.CONCEPT_CALLED_METHOD, i);
		}
		public List<TerminalNode> BINARY_RELATION_RIGHT() { return getTokens(SCPParser.BINARY_RELATION_RIGHT); }
		public TerminalNode BINARY_RELATION_RIGHT(int i) {
			return getToken(SCPParser.BINARY_RELATION_RIGHT, i);
		}
		public List<TerminalNode> NREL_CALLER() { return getTokens(SCPParser.NREL_CALLER); }
		public TerminalNode NREL_CALLER(int i) {
			return getToken(SCPParser.NREL_CALLER, i);
		}
		public List<TerminalNode> DVOETOCHIE() { return getTokens(SCPParser.DVOETOCHIE); }
		public TerminalNode DVOETOCHIE(int i) {
			return getToken(SCPParser.DVOETOCHIE, i);
		}
		public List<TerminalNode> NREL_FUNCTION_PROTOTYPE() { return getTokens(SCPParser.NREL_FUNCTION_PROTOTYPE); }
		public TerminalNode NREL_FUNCTION_PROTOTYPE(int i) {
			return getToken(SCPParser.NREL_FUNCTION_PROTOTYPE, i);
		}
		public List<TerminalNode> NREL_ARGUMENT() { return getTokens(SCPParser.NREL_ARGUMENT); }
		public TerminalNode NREL_ARGUMENT(int i) {
			return getToken(SCPParser.NREL_ARGUMENT, i);
		}
		public List<TerminalNode> CONCEPT_ARGUMENT() { return getTokens(SCPParser.CONCEPT_ARGUMENT); }
		public TerminalNode CONCEPT_ARGUMENT(int i) {
			return getToken(SCPParser.CONCEPT_ARGUMENT, i);
		}
		public List<OperatorsContext> operators() {
			return getRuleContexts(OperatorsContext.class);
		}
		public OperatorsContext operators(int i) {
			return getRuleContext(OperatorsContext.class,i);
		}
		public List<TerminalNode> CLASS_NODE() { return getTokens(SCPParser.CLASS_NODE); }
		public TerminalNode CLASS_NODE(int i) {
			return getToken(SCPParser.CLASS_NODE, i);
		}
		public List<TerminalNode> UNARY_RELATION_RIGHT() { return getTokens(SCPParser.UNARY_RELATION_RIGHT); }
		public TerminalNode UNARY_RELATION_RIGHT(int i) {
			return getToken(SCPParser.UNARY_RELATION_RIGHT, i);
		}
		public List<TerminalNode> ROLE() { return getTokens(SCPParser.ROLE); }
		public TerminalNode ROLE(int i) {
			return getToken(SCPParser.ROLE, i);
		}
		public List<Called_methodContext> called_method() {
			return getRuleContexts(Called_methodContext.class);
		}
		public Called_methodContext called_method(int i) {
			return getRuleContext(Called_methodContext.class,i);
		}
		public Called_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_called_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).enterCalled_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).exitCalled_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCPVisitor ) return ((SCPVisitor<? extends T>)visitor).visitCalled_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Called_methodContext called_method() throws RecognitionException {
		Called_methodContext _localctx = new Called_methodContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_called_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(NODE);
			setState(317);
			match(BLOCK_START);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNARY_RELATION_LEFT || _la==BINARY_RELATION_RIGHT) {
				{
				{
				setState(353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					{
					setState(318);
					match(UNARY_RELATION_LEFT);
					setState(319);
					match(CONCEPT_CALLED_METHOD);
					}
					}
					break;
				case 2:
					{
					{
					setState(320);
					match(BINARY_RELATION_RIGHT);
					setState(321);
					match(NREL_CALLER);
					setState(322);
					match(DVOETOCHIE);
					setState(323);
					match(NODE);
					}
					}
					break;
				case 3:
					{
					{
					setState(324);
					match(BINARY_RELATION_RIGHT);
					setState(325);
					match(NREL_FUNCTION_PROTOTYPE);
					setState(326);
					match(DVOETOCHIE);
					setState(329);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPERATOR:
					case OPERATOR_LESS:
					case OPERATOR_DECREMENT:
						{
						setState(327);
						operators();
						}
						break;
					case CLASS_NODE:
						{
						setState(328);
						match(CLASS_NODE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				case 4:
					{
					{
					setState(331);
					match(BINARY_RELATION_RIGHT);
					setState(332);
					match(NREL_ARGUMENT);
					setState(333);
					match(DVOETOCHIE);
					setState(334);
					match(NODE);
					setState(335);
					match(BLOCK_START);
					setState(336);
					match(UNARY_RELATION_LEFT);
					setState(337);
					match(CONCEPT_ARGUMENT);
					setState(338);
					match(END_POINT);
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==UNARY_RELATION_RIGHT) {
						{
						{
						setState(339);
						match(UNARY_RELATION_RIGHT);
						setState(340);
						match(ROLE);
						setState(341);
						match(DVOETOCHIE);
						setState(344);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
						case 1:
							{
							setState(342);
							match(NODE);
							}
							break;
						case 2:
							{
							setState(343);
							called_method();
							}
							break;
						}
						setState(346);
						match(END_POINT);
						}
						}
						setState(351);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(352);
					match(BLOCK_END);
					}
					}
					break;
				}
				setState(355);
				match(END_POINT);
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			match(BLOCK_END);
			setState(362);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode BINARY_RELATION_RIGHT() { return getToken(SCPParser.BINARY_RELATION_RIGHT, 0); }
		public TerminalNode NREL_BODY() { return getToken(SCPParser.NREL_BODY, 0); }
		public TerminalNode DVOETOCHIE() { return getToken(SCPParser.DVOETOCHIE, 0); }
		public TerminalNode NODE() { return getToken(SCPParser.NODE, 0); }
		public TerminalNode BLOCK_START() { return getToken(SCPParser.BLOCK_START, 0); }
		public TerminalNode UNARY_RELATION_LEFT() { return getToken(SCPParser.UNARY_RELATION_LEFT, 0); }
		public TerminalNode CODE_BLOCK() { return getToken(SCPParser.CODE_BLOCK, 0); }
		public TerminalNode END_POINT() { return getToken(SCPParser.END_POINT, 0); }
		public Runtime_codeContext runtime_code() {
			return getRuleContext(Runtime_codeContext.class,0);
		}
		public TerminalNode BLOCK_END() { return getToken(SCPParser.BLOCK_END, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCPVisitor ) return ((SCPVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(BINARY_RELATION_RIGHT);
			setState(365);
			match(NREL_BODY);
			setState(366);
			match(DVOETOCHIE);
			setState(367);
			match(NODE);
			setState(368);
			match(BLOCK_START);
			setState(369);
			match(UNARY_RELATION_LEFT);
			setState(370);
			match(CODE_BLOCK);
			setState(371);
			match(END_POINT);
			setState(372);
			runtime_code();
			setState(373);
			match(BLOCK_END);
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

	public static class Runtime_codeContext extends ParserRuleContext {
		public List<TerminalNode> UNARY_RELATION_LEFT() { return getTokens(SCPParser.UNARY_RELATION_LEFT); }
		public TerminalNode UNARY_RELATION_LEFT(int i) {
			return getToken(SCPParser.UNARY_RELATION_LEFT, i);
		}
		public List<TerminalNode> ROLE() { return getTokens(SCPParser.ROLE); }
		public TerminalNode ROLE(int i) {
			return getToken(SCPParser.ROLE, i);
		}
		public List<Called_methodContext> called_method() {
			return getRuleContexts(Called_methodContext.class);
		}
		public Called_methodContext called_method(int i) {
			return getRuleContext(Called_methodContext.class,i);
		}
		public Runtime_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runtime_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).enterRuntime_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).exitRuntime_code(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCPVisitor ) return ((SCPVisitor<? extends T>)visitor).visitRuntime_code(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Runtime_codeContext runtime_code() throws RecognitionException {
		Runtime_codeContext _localctx = new Runtime_codeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_runtime_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNARY_RELATION_LEFT) {
				{
				{
				setState(375);
				match(UNARY_RELATION_LEFT);
				setState(376);
				match(ROLE);
				setState(377);
				called_method();
				}
				}
				setState(382);
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

	public static class CodeContext extends ParserRuleContext {
		public For_satementContext for_satement() {
			return getRuleContext(For_satementContext.class,0);
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
		enterRule(_localctx, 32, RULE_code);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				for_satement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
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

	public static class CrContext extends ParserRuleContext {
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public CrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).enterCr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCPListener ) ((SCPListener)listener).exitCr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SCPVisitor ) return ((SCPVisitor<? extends T>)visitor).visitCr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrContext cr() throws RecognitionException {
		CrContext _localctx = new CrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(387);
				code();
				}
				}
				setState(390); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CODE_BLOCK );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u018b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6r\n\6\r\6\16\6s\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a3\n\b\f\b\16\b\u00a6\13\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d8\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u00e1\n\13\f\13\16\13\u00e4\13\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f7"+
		"\n\f\3\f\7\f\u00fa\n\f\f\f\16\f\u00fd\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7"+
		"\r\u0117\n\r\f\r\16\r\u011a\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0134\n\16\3\16\7\16\u0137\n\16\f\16\16\16\u013a\13\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u014c\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u015b\n\17\3\17\7\17\u015e\n\17\f\17\16\17\u0161"+
		"\13\17\3\17\5\17\u0164\n\17\3\17\7\17\u0167\n\17\f\17\16\17\u016a\13\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\7\21\u017d\n\21\f\21\16\21\u0180\13\21\3\22\3\22\5\22"+
		"\u0184\n\22\3\23\6\23\u0187\n\23\r\23\16\23\u0188\3\23\2\2\24\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$\2\3\3\2\3\6\2\u0199\2&\3\2\2\2\4:"+
		"\3\2\2\2\6<\3\2\2\2\bP\3\2\2\2\nV\3\2\2\2\f|\3\2\2\2\16\u009b\3\2\2\2"+
		"\20\u00ab\3\2\2\2\22\u00bd\3\2\2\2\24\u00d9\3\2\2\2\26\u00e8\3\2\2\2\30"+
		"\u0101\3\2\2\2\32\u0122\3\2\2\2\34\u013e\3\2\2\2\36\u016e\3\2\2\2 \u017e"+
		"\3\2\2\2\"\u0183\3\2\2\2$\u0186\3\2\2\2&\'\t\2\2\2\'\3\3\2\2\2(;\79\2"+
		"\2);\7:\2\2*+\78\2\2+;\7\7\2\2,-\78\2\2-;\7\b\2\2./\78\2\2/;\7\t\2\2\60"+
		"\61\78\2\2\61;\7\n\2\2\62\63\78\2\2\63;\7\13\2\2\64\65\78\2\2\65;\7\f"+
		"\2\2\66\67\78\2\2\67;\7\r\2\289\78\2\29;\7\16\2\2:(\3\2\2\2:)\3\2\2\2"+
		":*\3\2\2\2:,\3\2\2\2:.\3\2\2\2:\60\3\2\2\2:\62\3\2\2\2:\64\3\2\2\2:\66"+
		"\3\2\2\2:8\3\2\2\2;\5\3\2\2\2<=\7\32\2\2=>\7B\2\2>?\7?\2\2?@\7\26\2\2"+
		"@A\7\22\2\2AB\7*\2\2BC\7\25\2\2CD\7\23\2\2DE\7\33\2\2EF\7B\2\2FG\7?\2"+
		"\2GH\7\26\2\2HI\7\22\2\2IJ\7\20\2\2JK\7\25\2\2KL\7\27\2\2LM\7\25\2\2M"+
		"N\7\27\2\2NO\7\25\2\2O\7\3\2\2\2PQ\7\21\2\2QR\7;\2\2RS\7B\2\2ST\7?\2\2"+
		"TU\7\25\2\2U\t\3\2\2\2VW\7\23\2\2WX\7\34\2\2XY\7B\2\2YZ\7?\2\2Z[\7\26"+
		"\2\2[\\\7\24\2\2\\]\7\35\2\2]^\7B\2\2^_\7?\2\2_`\7\26\2\2`a\7\22\2\2a"+
		"b\7\61\2\2bc\7\25\2\2cd\7\23\2\2de\7\37\2\2ef\7B\2\2fg\5\4\3\2gh\7\25"+
		"\2\2hi\7\23\2\2ij\7 \2\2jk\7B\2\2kl\7?\2\2lm\7\26\2\2mn\7\22\2\2no\7\62"+
		"\2\2oq\7\25\2\2pr\5\b\5\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3"+
		"\2\2\2uv\7\27\2\2vw\7\25\2\2wx\7\27\2\2xy\7\25\2\2yz\7\27\2\2z{\7\25\2"+
		"\2{\13\3\2\2\2|}\7\23\2\2}~\7!\2\2~\177\7B\2\2\177\u0080\7?\2\2\u0080"+
		"\u0081\7\26\2\2\u0081\u0082\7\22\2\2\u0082\u0083\7\61\2\2\u0083\u0084"+
		"\7\25\2\2\u0084\u0085\7\23\2\2\u0085\u0086\7\37\2\2\u0086\u0087\7B\2\2"+
		"\u0087\u0088\5\4\3\2\u0088\u0089\7\25\2\2\u0089\u008a\7\23\2\2\u008a\u008b"+
		"\7 \2\2\u008b\u008c\7B\2\2\u008c\u008d\7?\2\2\u008d\u008e\7\26\2\2\u008e"+
		"\u008f\7\22\2\2\u008f\u0090\7\62\2\2\u0090\u0091\7\25\2\2\u0091\u0092"+
		"\7\21\2\2\u0092\u0093\7;\2\2\u0093\u0094\7B\2\2\u0094\u0095\7?\2\2\u0095"+
		"\u0096\7\25\2\2\u0096\u0097\7\27\2\2\u0097\u0098\7\25\2\2\u0098\u0099"+
		"\7\27\2\2\u0099\u009a\7\25\2\2\u009a\r\3\2\2\2\u009b\u009c\7\23\2\2\u009c"+
		"\u009d\7\"\2\2\u009d\u009e\7B\2\2\u009e\u009f\7?\2\2\u009f\u00a0\7\26"+
		"\2\2\u00a0\u00a4\7\22\2\2\u00a1\u00a3\5\"\22\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\25\2\2\u00a8\u00a9\7\27\2\2\u00a9"+
		"\u00aa\7\25\2\2\u00aa\17\3\2\2\2\u00ab\u00ac\7-\2\2\u00ac\u00ad\7\21\2"+
		"\2\u00ad\u00ae\7?\2\2\u00ae\u00af\7\26\2\2\u00af\u00b0\7\21\2\2\u00b0"+
		"\u00b1\7;\2\2\u00b1\u00b2\7B\2\2\u00b2\u00b3\7?\2\2\u00b3\u00b4\7\26\2"+
		"\2\u00b4\u00b5\7\22\2\2\u00b5\u00b6\7.\2\2\u00b6\u00b7\7\25\2\2\u00b7"+
		"\u00b8\7\23\2\2\u00b8\u00b9\5\6\4\2\u00b9\u00ba\5\n\6\2\u00ba\u00bb\5"+
		"\f\7\2\u00bb\u00bc\5\16\b\2\u00bc\21\3\2\2\2\u00bd\u00be\7-\2\2\u00be"+
		"\u00bf\7\21\2\2\u00bf\u00c0\7?\2\2\u00c0\u00c1\7\26\2\2\u00c1\u00c2\7"+
		"\21\2\2\u00c2\u00c3\7;\2\2\u00c3\u00c4\7B\2\2\u00c4\u00c5\7?\2\2\u00c5"+
		"\u00c6\7\26\2\2\u00c6\u00c7\7\22\2\2\u00c7\u00c8\7\63\2\2\u00c8\u00c9"+
		"\7\25\2\2\u00c9\u00ca\7\23\2\2\u00ca\u00cb\7#\2\2\u00cb\u00cc\7B\2\2\u00cc"+
		"\u00cd\7?\2\2\u00cd\u00ce\7\26\2\2\u00ce\u00cf\7\22\2\2\u00cf\u00d0\7"+
		"/\2\2\u00d0\u00d1\7\25\2\2\u00d1\u00d2\7\27\2\2\u00d2\u00d3\7\25\2\2\u00d3"+
		"\u00d4\7\27\2\2\u00d4\u00d5\7\25\2\2\u00d5\u00d7\7\27\2\2\u00d6\u00d8"+
		"\7\25\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\23\3\2\2\2\u00d9"+
		"\u00da\7\64\2\2\u00da\u00db\7\21\2\2\u00db\u00dc\7=\2\2\u00dc\u00e2\7"+
		"\26\2\2\u00dd\u00e1\5\26\f\2\u00de\u00e1\5\30\r\2\u00df\u00e1\5\32\16"+
		"\2\u00e0\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\7\27\2\2\u00e6\u00e7\7\25\2\2\u00e7\25\3\2"+
		"\2\2\u00e8\u00e9\7\23\2\2\u00e9\u00ea\7$\2\2\u00ea\u00eb\7B\2\2\u00eb"+
		"\u00ec\7=\2\2\u00ec\u00fb\7\26\2\2\u00ed\u00ee\7\22\2\2\u00ee\u00f7\7"+
		"*\2\2\u00ef\u00f0\7\22\2\2\u00f0\u00f1\7\65\2\2\u00f1\u00f7\5\2\2\2\u00f2"+
		"\u00f3\7\23\2\2\u00f3\u00f4\7(\2\2\u00f4\u00f5\7B\2\2\u00f5\u00f7\7,\2"+
		"\2\u00f6\u00ed\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00fa\7\25\2\2\u00f9\u00f6\3\2\2\2\u00fa\u00fd\3\2\2\2"+
		"\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fe\u00ff\7\27\2\2\u00ff\u0100\7\25\2\2\u0100\27\3\2\2\2\u0101"+
		"\u0102\7\23\2\2\u0102\u0103\7&\2\2\u0103\u0104\7B\2\2\u0104\u0105\7>\2"+
		"\2\u0105\u0106\7\26\2\2\u0106\u0107\7\21\2\2\u0107\u0108\7?\2\2\u0108"+
		"\u0109\7\26\2\2\u0109\u010a\7\22\2\2\u010a\u010b\7\62\2\2\u010b\u0118"+
		"\7\25\2\2\u010c\u010d\7\21\2\2\u010d\u010e\7;\2\2\u010e\u010f\7B\2\2\u010f"+
		"\u0110\7?\2\2\u0110\u0111\7\26\2\2\u0111\u0112\7\22\2\2\u0112\u0113\7"+
		"*\2\2\u0113\u0114\7\25\2\2\u0114\u0115\7\27\2\2\u0115\u0117\7\25\2\2\u0116"+
		"\u010c\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7\27\2\2\u011c"+
		"\u011d\7\25\2\2\u011d\u011e\5\36\20\2\u011e\u011f\7\25\2\2\u011f\u0120"+
		"\7\27\2\2\u0120\u0121\7\25\2\2\u0121\31\3\2\2\2\u0122\u0123\7\23\2\2\u0123"+
		"\u0124\7)\2\2\u0124\u0125\7B\2\2\u0125\u0126\7=\2\2\u0126\u0138\7\26\2"+
		"\2\u0127\u0128\7\22\2\2\u0128\u0134\7+\2\2\u0129\u012a\7\23\2\2\u012a"+
		"\u012b\7(\2\2\u012b\u012c\7B\2\2\u012c\u0134\7,\2\2\u012d\u012e\7\23\2"+
		"\2\u012e\u012f\7\36\2\2\u012f\u0130\7B\2\2\u0130\u0131\7\65\2\2\u0131"+
		"\u0134\5\2\2\2\u0132\u0134\5\36\20\2\u0133\u0127\3\2\2\2\u0133\u0129\3"+
		"\2\2\2\u0133\u012d\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0137\7\25\2\2\u0136\u0133\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3"+
		"\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013c\7\27\2\2\u013c\u013d\7\25\2\2\u013d\33\3\2\2\2\u013e\u013f\7?\2"+
		"\2\u013f\u0168\7\26\2\2\u0140\u0141\7\22\2\2\u0141\u0164\7\60\2\2\u0142"+
		"\u0143\7\23\2\2\u0143\u0144\7%\2\2\u0144\u0145\7B\2\2\u0145\u0164\7?\2"+
		"\2\u0146\u0147\7\23\2\2\u0147\u0148\7\37\2\2\u0148\u014b\7B\2\2\u0149"+
		"\u014c\5\4\3\2\u014a\u014c\7=\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2"+
		"\2\2\u014c\u0164\3\2\2\2\u014d\u014e\7\23\2\2\u014e\u014f\7 \2\2\u014f"+
		"\u0150\7B\2\2\u0150\u0151\7?\2\2\u0151\u0152\7\26\2\2\u0152\u0153\7\22"+
		"\2\2\u0153\u0154\7\62\2\2\u0154\u015f\7\25\2\2\u0155\u0156\7\21\2\2\u0156"+
		"\u0157\7;\2\2\u0157\u015a\7B\2\2\u0158\u015b\7?\2\2\u0159\u015b\5\34\17"+
		"\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e"+
		"\7\25\2\2\u015d\u0155\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2"+
		"\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0164"+
		"\7\27\2\2\u0163\u0140\3\2\2\2\u0163\u0142\3\2\2\2\u0163\u0146\3\2\2\2"+
		"\u0163\u014d\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\7\25\2\2\u0166\u0163"+
		"\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7\27\2\2\u016c\u016d\7"+
		"\25\2\2\u016d\35\3\2\2\2\u016e\u016f\7\23\2\2\u016f\u0170\7\'\2\2\u0170"+
		"\u0171\7B\2\2\u0171\u0172\7?\2\2\u0172\u0173\7\26\2\2\u0173\u0174\7\22"+
		"\2\2\u0174\u0175\7-\2\2\u0175\u0176\7\25\2\2\u0176\u0177\5 \21\2\u0177"+
		"\u0178\7\27\2\2\u0178\37\3\2\2\2\u0179\u017a\7\22\2\2\u017a\u017b\7;\2"+
		"\2\u017b\u017d\5\34\17\2\u017c\u0179\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f!\3\2\2\2\u0180\u017e\3\2\2\2"+
		"\u0181\u0184\5\20\t\2\u0182\u0184\5\22\n\2\u0183\u0181\3\2\2\2\u0183\u0182"+
		"\3\2\2\2\u0184#\3\2\2\2\u0185\u0187\5\"\22\2\u0186\u0185\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189%\3\2\2\2"+
		"\25:s\u00a4\u00d7\u00e0\u00e2\u00f6\u00fb\u0118\u0133\u0138\u014b\u015a"+
		"\u015f\u0163\u0168\u017e\u0183\u0188";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}