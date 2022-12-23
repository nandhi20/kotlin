fun main() {
    val intArray = arrayOf(1, 2, 3);
    intArray.forEach { element ->
        println(element);
    }

    val strList = listOf("Nandhini", "Kotlin", null)

    val mutableList = mutableListOf("Nandhini", 4);

    mutableList.forEachIndexed { index, element ->
        println("$index $element")
    }
    val keyValMap = mapOf(1 to "Nandhini", 2 to "Kotlin")

    keyValMap.forEach { (key, value) ->
        println("$key -> $value");
    }

    //Collection functions
    strList.filterNotNull().associate { it to it.length } // associate returns map
        .forEach {
            println(it)
        }
    strList.filterNotNull().filter { it.startsWith('N') }
        .forEach {
            println(it)
        }
    strList.filterNotNull().takeLast(1)
        .forEach {
            println(it)
        }
    strList.filterNotNull().filter { it.startsWith('N') }.map { it.length }
        .forEach {
            println(it)
        }
    println(strList.first())
    println(strList.last())
    println(strList.filterNotNull().findLast { it.startsWith("Kot") }.orEmpty())
}