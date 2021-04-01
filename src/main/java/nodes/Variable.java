package nodes;

import nodes.BaseNode;

public class Variable extends BaseNode {
    private String type, name, value;

    public Variable(String type, String name, String value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return type + " " + name + " =" + value ;
    }
}
