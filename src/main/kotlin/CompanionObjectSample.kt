/** Companion Object is used to access private constructors, variable etc**/
class PersonEntity private constructor(val name: String) {
    companion object Factory : NameProvider {
        const val nameIns = "Nandy"
        override fun getName() = nameIns;
        fun create() = PersonEntity(getName());
    }
}

interface NameProvider {
    fun getName(): String
}

fun main() {
    val entity = PersonEntity.Factory.create()
    println(entity.name)
}

