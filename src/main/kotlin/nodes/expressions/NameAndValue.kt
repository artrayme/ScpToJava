package nodes.expressions

class NameAndValue(private val name: String, private val value: String) : Expression() {
    override fun toString(): String {
        return "$name = $value"
    }
}