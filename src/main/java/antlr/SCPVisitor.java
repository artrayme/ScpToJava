// Generated from C:/Users/User/Downloads/comicStore-master/Kursach/src/main/java/antlr\SCP.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SCPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SCPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SCPParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SCPParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SCPParser#operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperators(SCPParser.OperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SCPParser#iteration_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_variable(SCPParser.Iteration_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SCPParser#role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole(SCPParser.RoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SCPParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SCPParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SCPParser#iteration_change}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_change(SCPParser.Iteration_changeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SCPParser#iteration_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_body(SCPParser.Iteration_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SCPParser#for_satement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_satement(SCPParser.For_satementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SCPParser#break_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_rule(SCPParser.Break_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SCPParser#class_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_statement(SCPParser.Class_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SCPParser#class_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_field(SCPParser.Class_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SCPParser#class_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_constructor(SCPParser.Class_constructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SCPParser#method_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_statement(SCPParser.Method_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SCPParser#called_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalled_method(SCPParser.Called_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SCPParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(SCPParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SCPParser#runtime_code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuntime_code(SCPParser.Runtime_codeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SCPParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(SCPParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SCPParser#cr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCr(SCPParser.CrContext ctx);
}