package nodes.expressions

class IterationChange(private val variable: String, private val operator: Operator) : Expression() {
    override fun toString(): String {
        return variable + operator.toString()
    }
}