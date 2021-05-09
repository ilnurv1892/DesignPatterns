package OK

fun main() {

    //map()
    val list = (1..10).toList()

    val doubled = list.map { element -> element * 2 }
    val doubled1 = list.map { it * 2 }

    val average = list.average()
    val shifted = list.map { it - average }

    println(doubled)
    println(doubled1)
    println(average)
    println(shifted)

    println()
    //flatMap()

    val nestedList = listOf(
        (1..10).toList(),
        (11..20).toList(),
        (21..30).toList(),
    )

    val notFlattened = nestedList.map { it.sortedDescending() }
    val reFlattened1 = nestedList.map { it.sortedDescending() }.flatten()
    val flattened = nestedList.flatMap { it.sortedDescending() }

    println(notFlattened)
    println(reFlattened1)
    println(flattened)
}