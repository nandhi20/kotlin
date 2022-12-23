fun printFunc(list: List<String>, func: (String) -> Boolean) {
    list.forEach {
        if (func(it)) {
            println(it)
        }
    }
}

val func: (String) -> Boolean = {
    it.startsWith('K')
}

fun getFunction(): (String) -> Boolean {
    return { it.startsWith("J") }
}

fun main() {
    val list = listOf<String>("Java", "Kotlin", "Javascript")
    printFunc(list, func)
    printFunc(list) { it.startsWith("J") }
    printFunc(list, getFunction())
}