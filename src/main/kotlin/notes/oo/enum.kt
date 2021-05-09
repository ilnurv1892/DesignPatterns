package oo

enum class Direction(degree: Double) {
    NORTH(0.0), EAST(90.0), SOUTH(180.0), WEST(270.0)
}

enum class Suits {
    HEARTS, SPADES, DIAMONDS, CLUBS
}

fun main() {
    val suits = Suits.SPADES


    val color = when (suits) {
        Suits.SPADES, Suits.DIAMONDS -> "red"
        Suits.HEARTS, Suits.CLUBS -> "black"
    }

    println(suits)

    println(color)

    println(Direction.EAST)
}