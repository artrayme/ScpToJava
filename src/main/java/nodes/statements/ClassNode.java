package nodes;

import java.util.List;

public class ClassNode extends BaseNode {
    private final String className;
    private final String accessModifier;
    private final List<MethodNode> methodNodes;
    private final List<FieldNode> fieldNodes;


    public ClassNode(String className, String accessModifier, List<MethodNode> methodNodes, List<FieldNode> fieldNodes) {
        this.className = className;
        this.accessModifier = accessModifier;
        this.methodNodes = methodNodes;
        this.fieldNodes = fieldNodes;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (FieldNode fieldNode : fieldNodes) {
            builder.append(fieldNode.toString()).append(";");
        }
        for (MethodNode methodNode : methodNodes) {
            builder.append(methodNode.toString()).append("\n");
        }
        return accessModifier + " class " + className + "{" + builder + "}";
    }
}
