/*------------------------------------------------------------------------------
 ilnurv : 2021-4-25 10:41
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns


interface WhatCanHappens {
    fun seeHero()
    fun getHit(ptsOfDmg: Int)
    fun calmAgain()
}

class Snail : WhatCanHappens {
    private var healthPoints: Int = 100


    internal var mood: Mood = Still(this)


    fun getCurMood(): String {

        return when (mood) {
            is Aggressive -> "aggressive"
            is Dead -> "dead"
            is Retreating -> "retreating"
            is Still -> "still"

        }

    }

    override fun seeHero() {
        mood = when (mood) {
            is Still -> Aggressive()
            is Aggressive -> mood
            is Dead -> mood
            is Retreating -> mood

        }
    }


    override fun getHit(ptsOfDmg: Int) {
        healthPoints -= ptsOfDmg

        mood = when {
            (healthPoints <= 0) -> Dead()
            mood is Aggressive -> Retreating()
            else -> mood
        }
    }

    override fun calmAgain() {

    }
}


//Sealed classes are abstract and cannot be instantiated.
//Kotlin knows that there's a finite number of classes that extend from it
sealed class Mood:WhatCanHappens

//run {} -
//override fun seeHero(): Mood {
//snail.mood = Aggressive(snail)
//return snail.mood
//}
//By using run, we can preserve the same logic, but omit the function body.

class Still(private val snail:Snail): Mood() {
    override fun seeHero() {
        return snail.mood.run { Aggressive() }
    }

    override fun getHit(ptsOfDmg: Int) {
        TODO("Not yet implemented")
    }

    override fun calmAgain() {
        TODO("Not yet implemented")
    }
}


class Aggressive : Mood() {
    override fun seeHero() {
        TODO("Not yet implemented")
    }

    override fun getHit(ptsOfDmg: Int) {
        TODO("Not yet implemented")
    }

    override fun calmAgain() {
        TODO("Not yet implemented")
    }
}

class Retreating : Mood() {
    override fun seeHero() {
        TODO("Not yet implemented")
    }

    override fun getHit(ptsOfDmg: Int) {
        TODO("Not yet implemented")
    }

    override fun calmAgain() {
        TODO("Not yet implemented")
    }
}

class Dead : Mood() {
    override fun seeHero() {
        TODO("Not yet implemented")
    }

    override fun getHit(ptsOfDmg: Int) {
        TODO("Not yet implemented")
    }

    override fun calmAgain() {
        TODO("Not yet implemented")
    }
}

fun main() {

    val snail = Snail()
    println(snail.getCurMood())
    snail.seeHero()
    println(snail.getCurMood())
    snail.getHit(10)
    println(snail.getCurMood())
    snail.getHit(100)
    println(snail.getCurMood())

}