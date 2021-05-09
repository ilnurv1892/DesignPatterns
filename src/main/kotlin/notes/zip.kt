package OK

fun main() {
    val list = listOf("Hi", "There", "Kotlin", "!!!")

    val containsT = listOf(false, true, true, false)

    val zipped: List<Pair<String, Boolean>> = list.zip(containsT)

    val mapping = list.zip(list.map { it.contains("t") })

    println(zipped)
    println(mapping)

}