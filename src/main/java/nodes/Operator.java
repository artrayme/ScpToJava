package nodes;

import nodes.BaseNode;

public class Operator extends BaseNode {
    private String operator;

    public Operator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return operator;
    }
}
