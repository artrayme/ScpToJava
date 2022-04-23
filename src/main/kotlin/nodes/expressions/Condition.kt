package nodes.expressions

class Condition(private val left: String, private val right: String, private val operator: Operator) : Expression() {
    override fun toString(): String {
        return "$left $operator $right"
    }
}