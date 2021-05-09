/*------------------------------------------------------------------------------
 ilnurv : 2021-4-23 8:11
 -----------------------------------------------------------------------------*/
package patternsJava.structuralPatterns.flyweight

class TanzanianSnail() {
    val directionFacing = Directions.LEFT

    val sprites = listOf(java.io.File("snail-left.jgp"), java.io.File("snail-right.jgp"))


}

fun TanzanianSnail.getCurrentSprite(): java.io.File {
    return when (directionFacing) {
        Directions.LEFT -> sprites[0]
        Directions.RIGHT -> sprites[1]
    }
}

enum class Directions {
    LEFT, RIGHT
}

val sprites = List(8) { i ->
    java.io.File(
        when (i) {
            0 -> "snail-left.jpg"
            1 -> "snail-right.jpg"
            in 2..4 -> "snail-right.jpg"
            else -> "snail-move-right ${(4 - i)}.jpg"
        }
    )
}

fun TanzanianSnail.getCurrentSprite(sprites: List<java.io.File>): java.io.File {
    return sprites[0]
}
