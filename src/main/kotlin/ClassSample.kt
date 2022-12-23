fun main() {
    val person = Person("Nandhini", "Viswanathan")
    println(person.firstName + " " + person.lastName)


    val person2 = Person2()
    println(person2.firstName + " " + person2.lastName)

    val person1 = Person1()
    println(person1.firstName + " " + person1.lastName)
    person1.nickName = "Nandy"
    person1.printPerson()

    val person3 = Person2("Anna", "Harvard")
    println(person3.firstName + " " + person3.lastName)
}