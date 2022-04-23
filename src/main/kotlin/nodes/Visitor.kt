package nodes

import SCPBaseVisitor
import SCPParser.*
import nodes.expressions.*
import nodes.statements.ForStatement


class Visitor : SCPBaseVisitor<BaseNode>() {
    var code: MutableList<String> = ArrayList()

    override fun visitFor_satement(ctx: For_satementContext): BaseNode {
        val nodes: MutableList<BaseNode> = ArrayList()
        for (i in 0 until ctx.iteration_body().code().size) {
            nodes.add(visit(ctx.iteration_body().code(i)))
        }

        val forStatement = ForStatement(
            visitCondition(ctx.condition()),
            Variable("int", ctx.iteration_variable().NODE(1).text, NameAndValue(ctx.iteration_variable().NODE(0).text, "a")),
            visitIteration_change(ctx.iteration_change()), nodes
        )
        code.add(forStatement.toString())
        return forStatement
    }

    override fun visitCondition(ctx: ConditionContext): Condition {
//        return Condition(ctx.role(0).NODE().getText(), ctx.role(1).NODE().getText(), visitOperators(ctx.operators()))
        return Condition("a", "b", visitOperators(OperatorsContext(null, 1)))
    }

    override fun visitBreak_rule(ctx: Break_ruleContext?): BaseNode {
        return BreakRule()
    }

    override fun visitOperators(ctx: OperatorsContext): Operator {
        when (ctx.text) {
            "operator_less" -> {
                return Operator("<")
            }
            "operator_decrement" -> {
                return Operator("--")
            }
        }
        return Operator(ctx.text)
    }

    override fun visitIteration_change(ctx: Iteration_changeContext): IterationChange {
        return IterationChange(ctx.NODE(1).text, visitOperators(ctx.operators()))
    }

    override fun visitClass_statement(ctx: Class_statementContext?): BaseNode {
        return super.visitClass_statement(ctx)
    }

}