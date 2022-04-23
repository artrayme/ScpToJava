package nodes.statements

import nodes.BaseNode
import nodes.expressions.Variable

class FieldNode(private val accessModifier: String, private val variable: Variable) : BaseNode() {
    override fun toString(): String {
        return "$accessModifier $variable"
    }
}