open class Basic {
    protected open val className = "Base"
    open fun display() {
        println("$className Class Function")
    }
}

class Derived : Basic() {
    override val className: String
        get() = "Derived"

    override fun display() {
        println("$className Class Function")
    }
}

fun main() {

    val base = Basic()
    base.display()
    val derived = Derived()
    derived.display()
}
