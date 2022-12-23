/** Access modifiers
public, private, internal, protected **/

class Person(constFirstName: String, constLastName: String) {
    val firstName: String
    val lastName: String

    //initializing from constructor
    init {
        firstName = constFirstName
        lastName = constLastName
    }

    //Another way
//    private val firstName: String = _firstName
//    private val lastName: String = _lastName

}

//Class can also be declared as below using primary constructor
class Person1(val firstName: String = "Elsa", val lastName: String = "Harvard") {

    constructor() : this("Nandhini", "Viswanathan") {
        println("Secondary Constructor is called")
    }

    internal var nickName: String? = null
        //overriding getter and setter
        set(value) {
            field = value
            println("Nick name = $field")
        }
        get() {
            println("Returned nick name = $field")
            return field
        }

    fun printPerson() {
        val nick = nickName ?: "no nick name"
        println("$firstName ($nick) $lastName")
    }
}

class Person2(val firstName: String, val lastName: String) {
    init {
        println("init 1 called")
    }

    //Default / Secondary constructor
    constructor() : this("Nandhini", "Viswanathan") {
        println("Secondary Constructor is called")
    }

    init {
        println("init 2 called")
    }
}
