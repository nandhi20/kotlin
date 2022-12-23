fun main() {
    val argList = arrayOf<String>("Nandhini", "Kotlin");
    sayHello("Hi");
    //spread operator
    sayHello("Hello", *argList);
    //Invoking with named argument
    sayHelloWithName(name = "Nandhini", greeting = "Good day")
    //Invoking function with default argument value
    sayHelloWithDefault();
    sayHelloWithDefault(name = "Coding");
}

//Passing variable arguments
fun sayHello(greeting: String, vararg list: String) {
    list.forEach {
        println("$greeting $it");
    }
}

//named arguments
fun sayHelloWithName(greeting: String, name: String) = println("$greeting $name")

//Default argument value
fun sayHelloWithDefault(greeting: String = "Welcome To", name: String = "Kotlin") = println("$greeting $name")