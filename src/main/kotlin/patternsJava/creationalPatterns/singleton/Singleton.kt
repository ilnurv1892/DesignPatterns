/*------------------------------------------------------------------------------
 ilnurv : 2021-4-14 7:31
 -----------------------------------------------------------------------------*/
package patternsJava.creationalPatterns.singleton

import java.util.concurrent.atomic.AtomicInteger

class Cat

val firstCat = Cat()
val firstCat1 = Cat()
val firstCat2 = Cat()



//object cant have constructors
//object is more than singletons
// init for initi
object Singleton{
    private val counter = AtomicInteger(0)
    fun increment() = counter.incrementAndGet()

    init {
        println("singleton")
    }
}

val single1 = Singleton
val single2 = Singleton

fun main() {
    val increment = single1.increment()
    val increment2 = single2.increment()

   println(increment)
    println(increment2)
}