package nodes;

public class FieldNode extends BaseNode {
    private String accessModifier;
    private Variable variable;

    public FieldNode(String accessModifier, Variable variable) {
        this.accessModifier = accessModifier;
        this.variable = variable;
    }

    @Override
    public String toString() {
        return accessModifier + " " + variable.toString();
    }
}
