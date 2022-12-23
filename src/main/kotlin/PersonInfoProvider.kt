interface PersonInfoProvider {
    val defaultName: String
    fun printPerson(person: Person) {
        val firstName = person.firstName
        val lastName = person.lastName
        println("Person in $defaultName is $firstName $lastName")
    }
}

class BasicInfoProvider : PersonInfoProvider {
    override val defaultName: String
        get() = "Basic Info Provider";

    override fun printPerson(person: Person) {
        super.printPerson(person)
        println("Printing action completed")
    }
}

fun main() {
    val person = Person("Nandhini", "Viswanathan")
    val bp = BasicInfoProvider();
    bp.printPerson(person)
    if (bp is PersonInfoProvider) {
        println("is a instance of person info provider")
    }
    (bp as PersonInfoProvider).printPerson(person)
}