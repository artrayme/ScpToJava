// Generated from C:/Users/User/Downloads/comicStore-master/Kursach/src/main/java/antlr\SCP.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SCPParser}.
 */
public interface SCPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SCPParser#operators}.
	 * @param ctx the parse tree
	 */
	void enterOperators(SCPParser.OperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPParser#operators}.
	 * @param ctx the parse tree
	 */
	void exitOperators(SCPParser.OperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPParser#iteration_variable}.
	 * @param ctx the parse tree
	 */
	void enterIteration_variable(SCPParser.Iteration_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPParser#iteration_variable}.
	 * @param ctx the parse tree
	 */
	void exitIteration_variable(SCPParser.Iteration_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPParser#role}.
	 * @param ctx the parse tree
	 */
	void enterRole(SCPParser.RoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPParser#role}.
	 * @param ctx the parse tree
	 */
	void exitRole(SCPParser.RoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SCPParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SCPParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPParser#iteration_change}.
	 * @param ctx the parse tree
	 */
	void enterIteration_change(SCPParser.Iteration_changeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPParser#iteration_change}.
	 * @param ctx the parse tree
	 */
	void exitIteration_change(SCPParser.Iteration_changeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPParser#iteration_body}.
	 * @param ctx the parse tree
	 */
	void enterIteration_body(SCPParser.Iteration_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPParser#iteration_body}.
	 * @param ctx the parse tree
	 */
	void exitIteration_body(SCPParser.Iteration_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPParser#for_satement}.
	 * @param ctx the parse tree
	 */
	void enterFor_satement(SCPParser.For_satementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPParser#for_satement}.
	 * @param ctx the parse tree
	 */
	void exitFor_satement(SCPParser.For_satementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPParser#break_rule}.
	 * @param ctx the parse tree
	 */
	void enterBreak_rule(SCPParser.Break_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPParser#break_rule}.
	 * @param ctx the parse tree
	 */
	void exitBreak_rule(SCPParser.Break_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(SCPParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(SCPParser.CodeContext ctx);
}