package nodes.statements

import nodes.BaseNode
import nodes.expressions.Parameter

class MethodNode(
    private val accessModifier: String,
    private val type: String,
    private val name: String,
    private val parameters: List<Parameter>,
    private val statements: List<Statement>
) : BaseNode() {
    override fun toString(): String {
        val params = StringBuilder()
        for (parameter in parameters) params.append(parameter.toString()).append(",")
        params.deleteCharAt(params.length - 1)
        return "$accessModifier $type $name("
    }
}