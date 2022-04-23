package nodes

import nodes.statements.Statement

class BreakRule : Statement() {
    override fun toString(): String {
        return "break;"
    }
}