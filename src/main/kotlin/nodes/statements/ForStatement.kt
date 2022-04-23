package nodes.statements

import nodes.BaseNode
import nodes.expressions.Condition
import nodes.expressions.IterationChange
import nodes.expressions.Variable

class ForStatement(
    private val condition: Condition,
    private val variable: Variable,
    private val iterationChange: IterationChange,
    private val code: List<BaseNode>
) : Statement() {
    override fun toString(): String {
        val builder = StringBuilder()
        for (node in code) {
            builder.append(node.toString()).append(" ")
        }
        return "for(" + variable.toString() + ";" + condition.toString() + ";" + iterationChange.toString() + "){" +
                builder +
                "}"
    }
}