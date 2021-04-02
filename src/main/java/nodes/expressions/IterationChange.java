package nodes;

import nodes.expressions.Expression;
import nodes.expressions.Operator;

public class IterationChange extends Expression {
    private String variable;
    private Operator operator;

    public IterationChange(String variable, Operator operator) {
        this.variable = variable;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return variable + operator.toString();
    }
}
