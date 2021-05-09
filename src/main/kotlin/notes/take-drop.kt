package OK

fun main() {
    val list = (1..1000).toList()
    val first10 = list.take(10)
    val withoutFirst900 = list.drop(900)

    println(first10)
    println(withoutFirst900)
    println()

    val list1 = generateSequence(0) {
        println("${it + 10}")
        it + 10
    }
    val first110 = list1.take(10).toList()
    val first120 = list1.take(20).toList()
    println(first110)
    println(first120)
    println()

}