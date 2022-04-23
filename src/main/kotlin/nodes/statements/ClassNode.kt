package nodes.statements

import nodes.BaseNode

class ClassNode(
    private val className: String,
    private val accessModifier: String,
    private val methodNodes: List<MethodNode>,
    private val fieldNodes: List<FieldNode>
) : BaseNode() {
    override fun toString(): String {
        val builder = StringBuilder()
        for (fieldNode in fieldNodes) {
            builder.append(fieldNode.toString()).append(";")
        }
        for (methodNode in methodNodes) {
            builder.append(methodNode.toString()).append("\n")
        }
        return "$accessModifier class $className{$builder}"
    }
}