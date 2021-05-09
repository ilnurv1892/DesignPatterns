/*------------------------------------------------------------------------------
 ilnurv : 2021-4-26 8:22
 -----------------------------------------------------------------------------*/
package notes

enum class Suits {
    HEART, SPADES, DIAMONDS, CLUBS
}

fun main() {

    var cardPlayer = Suits.CLUBS


    println(cardPlayer.name)
    println(cardPlayer.ordinal)
    println(cardPlayer.declaringClass)
    println(cardPlayer.javaClass)
    



}