interface PrintServiceProvider {
    fun print()
}
/** Object Expression  - No need a class to implement the methods from Service **/
fun main() {
    val provider = object : PrintServiceProvider {
        override fun print() {
            println("Printing from object expression")
        }

        fun printNew() {
            println("Printing from new function")
        }
    }
    provider.printNew()
    provider.print()
}