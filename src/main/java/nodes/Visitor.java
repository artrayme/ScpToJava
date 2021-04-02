package nodes;

import antlr.SCPBaseVisitor;
import antlr.SCPParser;
import nodes.BaseNode;
import nodes.BreakRule;
import nodes.expressions.*;
import nodes.statements.ForStatement;


import java.util.ArrayList;
import java.util.List;

public class Visitor extends SCPBaseVisitor<BaseNode> {
    public static List<String> code = new ArrayList<>();

    @Override
    public BaseNode visitFor_satement(SCPParser.For_satementContext ctx) {
        List<BaseNode> nodes = new ArrayList<>();
        for (int i = 0; i < ctx.iteration_body().code().size(); i++) {
            nodes.add(visit(ctx.iteration_body().code(i)));
        }

        ForStatement forStatement = new ForStatement(
                visitCondition(ctx.condition()),
                new Variable("int", new NameAndValue(ctx.iteration_variable().NODE(0).getText(), ctx.iteration_variable().NODE(1).getText())),
                visitIteration_change(ctx.iteration_change()), nodes);
        code.add(forStatement.toString());
        return forStatement;
    }

    @Override
    public Condition visitCondition(SCPParser.ConditionContext ctx) {
        return new Condition(ctx.role(0).NODE().getText(), ctx.role(1).NODE().getText(), visitOperators(ctx.operators()));
    }

    @Override
    public BaseNode visitBreak_rule(SCPParser.Break_ruleContext ctx) {
        BreakRule breakRule = new BreakRule();

        return breakRule;
    }

    @Override
    public Operator visitOperators(SCPParser.OperatorsContext ctx) {
        switch (ctx.getText()) {
            case "operator_less": {
                return new Operator("<");
            }
            case "operator_decrement": {
                return new Operator("--");
            }
        }
        return new Operator(ctx.getText());
    }


    @Override
    public IterationChange visitIteration_change(SCPParser.Iteration_changeContext ctx) {
        return new IterationChange(ctx.NODE(1).getText(), visitOperators(ctx.operators()));
    }

    @Override
    public BaseNode visitClass_statement(SCPParser.Class_statementContext ctx) {
        return super.visitClass_statement(ctx);
    }

}
