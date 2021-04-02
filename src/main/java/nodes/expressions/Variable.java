package nodes;

import nodes.expressions.Expression;
import nodes.expressions.NameAndValue;

public class Variable extends Expression {
    private String accessModifier, type;
    private NameAndValue nameAndValue;

    public Variable(String accessModifier, String type, NameAndValue nameAndValue) {
        this.accessModifier = accessModifier;
        this.type = type;
        this.nameAndValue = nameAndValue;
    }

    @Override
    public String toString() {
        return accessModifier + " " + type + " " + nameAndValue.toString();
    }
}
