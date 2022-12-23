enum class ProgramEnum {
    KOTLIN, JAVA, NODEJS;

    fun getProgramName() = name.lowercase();
}

fun getProgram(type: ProgramEnum): String {
    return type.getProgramName()
}

fun main() {
    println(getProgram(ProgramEnum.KOTLIN));
}