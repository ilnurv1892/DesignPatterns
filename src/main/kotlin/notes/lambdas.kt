package OK

fun main() {
    val timesTwo: (Int) -> Int = { x: Int -> x * 2 }

    val add: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

    println(timesTwo.invoke(12))
    println(add.invoke(12, 5))


    val list = (1..100).toList()
    println(list.filter { element: Int -> element % 2 == 0 })

    println(list.filter { element: Int -> element % 2 == 0 })

    println(list.filter { it % 2 == 0 })

    println(list.filter { it.even() })

    println(list.filter { isEven(it) })

    println(list.filter(::isEven))

}

fun isEven(i: Int) = i % 2 == 0

fun Int.even() = this % 2 == 0