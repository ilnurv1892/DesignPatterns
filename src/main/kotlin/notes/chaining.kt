package OK

fun main() {
    val inputRows = listOf(
        mapOf("input01.csv" to listOf(3, 5, 21, 33, 11)),
        mapOf("input02.csv" to listOf(32, 58, 29, 33, 1)),
        mapOf("input03.csv" to listOf(13, 5, 213, 13)),
        mapOf("input04.csv" to listOf(35, 65, 21, 3, 1))
    )

    val cleaned = inputRows.flatMap { it.values }
        .flatten()
        .filter { it in 0..100 }
        .toIntArray()


    println(cleaned.joinToString())
}