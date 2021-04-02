package nodes;

import nodes.expressions.Expression;
import nodes.expressions.Operator;

public class Condition extends Expression {
    private String left, right;
    private Operator operator;

    public Condition(String left, String right, Operator operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return left + " " + operator.toString() + " " + right + "";
    }
}
