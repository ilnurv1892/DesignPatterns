package OK

import kotlin.system.measureTimeMillis

fun main() {
    val veryLongList = (1..999999L).toList()

    var sum = 0L
    val measureTimeMillis = measureTimeMillis {
        sum = veryLongList.filter { it > 50 }
            .take(1000000)
            .map { it * 2 }
            .map { it / 3 }
            .map { it + 17 }

            .sum()
    }
    println(sum)
    println(measureTimeMillis)
    println()

    var sum1 = 0L
    val measureTimeMillis1 = measureTimeMillis {
        sum1 = veryLongList
            .asSequence()
            .filter { it > 50 }
            .take(1000000)
            .map { it * 2 }
            .map { it / 3 }
            .map { it + 17 }
            .sum()
    }
    println(sum1)


    println(measureTimeMillis1)


    val seq = generateSequence(1, { it + 1 })
    println(seq.take(10).toList())
}