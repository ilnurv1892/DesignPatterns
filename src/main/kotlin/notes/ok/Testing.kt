/*------------------------------------------------------------------------------
 ilnurv : 2021-5-3 6:56
 -----------------------------------------------------------------------------*/
package notes.ok
;

fun main() {





    val array = arrayOf(
        "Rock",
        "Paper",
        "Scissors"
    )
    println(foo(array))


    var b = Canine()
    var c = Woolf()

    var aa:Canine = Woolf()
    var bb: Canine = Canine()

}

fun foo(array: Array<String>) = array[(Math.random() * array.size).toInt()]



abstract class Animal{
    abstract fun nasda()
}
open class Canine :Animal() {
    override fun nasda() {
        TODO("Not yet implemented")
    }
}

class  Woolf : Canine() {
    override fun nasda() {
        TODO("Not yet implemented")
    }
}