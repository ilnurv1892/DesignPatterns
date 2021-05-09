package OK

fun main() {
    val together = concat(listOf("Kotlin","Java","Scala"),": ")
    val together1 = concat(listOf("Kotlin","Java","Scala"),separator = ": ")
    val together11 = concat(separator = ": ",texts = listOf("Kotlin","Java","Scala"))
    val together2 = concat(listOf("Kotlin","Java","Scala"))
    println(together)
    println(together1)
    println(together11)
    println(together2)
}


fun concat(texts: List<String>, separator: String = ", ") = texts.joinToString(separator)