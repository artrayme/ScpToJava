package nodes;

import nodes.BaseNode;

public class Condition extends BaseNode {
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
