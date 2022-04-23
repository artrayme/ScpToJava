package nodes.expressions

class Variable(private val accessModifier: String, private val type: String, private val nameAndValue: NameAndValue) :
    Expression() {
    override fun toString(): String {
        return "$accessModifier $type $nameAndValue"
    }
}