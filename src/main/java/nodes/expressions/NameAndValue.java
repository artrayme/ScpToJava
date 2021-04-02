package nodes;

public class NameAndValue extends Expression {
    private String name, value;

    public NameAndValue(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name + " = " + value;
    }
}