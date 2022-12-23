sealed class SealedEntity() {
    object Help : SealedEntity() {
        val name = "Help"
    }

    class Kotlin(name: String) : SealedEntity()
    class Java(name: String) : SealedEntity()
    class NodeJs(name: String) : SealedEntity()
}

fun main() {
    val k = getSealedClass(ProgramEnum.KOTLIN)
    println(k.toString())
}

fun getSealedClass(type: ProgramEnum): SealedEntity {
    val entity = when (type) {
        ProgramEnum.KOTLIN -> SealedEntity.Kotlin(type.getProgramName())
        ProgramEnum.JAVA -> SealedEntity.Java(type.getProgramName())
        ProgramEnum.NODEJS -> SealedEntity.NodeJs(type.getProgramName())
        else -> SealedEntity.Help
    }
    return entity
}