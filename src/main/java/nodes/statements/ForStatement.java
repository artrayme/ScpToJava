package nodes;

import nodes.BaseNode;
import nodes.Condition;

import java.util.List;

public class ForStatement extends Statement {
    private Condition condition;
    private Variable variable;
    private IterationChange iterationChange;
    private List<BaseNode> code;

    public ForStatement(Condition condition, Variable variable, IterationChange iterationChange, List<BaseNode> code) {
        this.condition = condition;
        this.variable = variable;
        this.iterationChange = iterationChange;
        this.code = code;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (BaseNode node : code) {
            builder.append(node.toString()).append(" ");
        }
        return "for(" + variable.toString() + ";" + condition.toString() + ";" + iterationChange.toString() + "){" +
                builder +
                "}";
    }
}
