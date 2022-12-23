object Entity {
    fun initiate() = Person("Nandy", "Vish")
    fun printEntity() = println("Printing from entity class")
}

class Person(val firstName: String, val lastName: String) {
    override fun toString(): String {
        return "First Name = $firstName, LastName = $lastName"
    }
}


fun main() {
    val person = Person("Nandhini", "Viswanathan");
    val p1 = Entity.initiate()
    println(person)
    Entity.printEntity()
    println(p1)
}