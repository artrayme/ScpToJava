package nodes;

import java.util.List;

public class MethodNode extends BaseNode{
    private String  accessModifier,type,name;
    private List<Parameter>parameters;
    private List<Statement>statements;

    public MethodNode(String accessModifier, String type, String name, List<Parameter> parameters, List<Statement> statements) {
        this.accessModifier = accessModifier;
        this.type = type;
        this.name = name;
        this.parameters = parameters;
        this.statements = statements;
    }

    @Override
    public String toString() {
        StringBuilder params = new StringBuilder();
        for (Parameter parameter:parameters)
            params.append(parameter.toString()).append(",");
        params.deleteCharAt(params.length() - 1);


        return accessModifier+" "+type+" "+name+"("+;
    }
}
