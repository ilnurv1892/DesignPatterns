/*------------------------------------------------------------------------------
 ilnurv : 2021-4-25 8:5
 -----------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------
 ilnurv : 2021-4-25 8:3
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.momento


class Manager {
    private var lastThought = "Should get some coffee"
    private var repeatThat = 3
    private var theHistate = "Or maybe tea?"
    private var secretThought = "No,coffee it is"


    fun whatAreYouThinking() {
        for (i in 1..repeatThat) {
            println(lastThought)
        }
        println(theHistate)
    }

    fun anotherThought() {
        lastThought = "Tea would be better"
        repeatThat = 2
        theHistate = "But coffee is also nice"
        secretThought = "Big latte would be great"
    }

    inner class Thought {
        fun captureThought(): CapturedThought {
            return CapturedThought(lastThought, repeatThat, theHistate, secretThought)
        }


        fun rewindThought(prevTho: CapturedThought) {
            with(prevTho) {
                lastThought = thought
                repeatThat = repeat
                theHistate = hesitate
                secretThought = secret
            }

        }
    }


    data class CapturedThought(
        val thought: String,
        val repeat: Int,
        val hesitate: String,
        val secret: String
    )
}


fun main() {
    val v = Manager()

    v.whatAreYouThinking()

    val captured: Manager.CapturedThought = v.Thought().captureThought()
    v.anotherThought()




    v.whatAreYouThinking()

    println("___")

    println(captured)

    v.Thought().rewindThought(captured)

    println("_____")

    v.whatAreYouThinking()

}