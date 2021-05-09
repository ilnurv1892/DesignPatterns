package oo

fun main() {
    println(5.isEven())

    val naturals = listOf(2, 5, 1, 3, 65, 78, 21)
    println(naturals.filter { it.isEven() })


    val  kazan = City()
    kazan.name = "Kazan"
    kazan.population  = 123_321
    println(kazan.isLarge())
}


fun Int.isEven(): Boolean = (this % 2 == 0)


fun City.isLarge() = population > 123_123_321