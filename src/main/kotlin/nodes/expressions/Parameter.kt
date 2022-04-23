package nodes.expressions

class Parameter : Expression {
    private var name: String? = null
    private var type: String? = null
    private var value: String? = null

    constructor(name: String?, type: String?) {
        this.name = name
        this.type = type
    }

    constructor(value: String?) {
        this.value = value
    }

    override fun toString(): String {
        return value ?: "$type $name"
    }
}