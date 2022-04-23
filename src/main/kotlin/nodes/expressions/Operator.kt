package nodes.expressions

class Operator(private val operator: String) : Expression() {
    override fun toString(): String {
        return operator
    }
}