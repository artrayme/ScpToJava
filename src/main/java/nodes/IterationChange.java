package nodes;

import nodes.BaseNode;

public class IterationChange extends BaseNode {
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
