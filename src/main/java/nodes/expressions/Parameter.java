package nodes;

import nodes.expressions.Expression;

public class Parameter extends Expression {
    private String name, type, value;

    public Parameter(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Parameter(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == null)
            return type + " " + name;
        return value;
    }
}
