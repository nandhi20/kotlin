var name = "Nandhini";
var name1: String? = null;

fun main(args: Array<String>) {
//    println("Hello World!")
//    name = 4;
//    name1 = "Nandhini";
//    println(name1);
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    name1 = "Hi";
    when (name1) {
        null -> println("Hi");
        "Hi" -> println("Equals Hi");
        else -> println(name1);
    }

    val assignName = when(name1) {
        null -> "Hello"
        else -> name1
    }

    println(assignName);
    val result = sayHello();
    println(result);
    getGreeting();
}

//fun sayHello(): String {
//    println("Welcome to my project");
//    return "Success";
//}

fun sayHello(): String = "Welocme to my Project "

fun getGreeting() = println("Welcome to getGreeting function");