/*------------------------------------------------------------------------------
 ilnurv : 2021-4-26 8:22
 -----------------------------------------------------------------------------*/
package notes

class Inheritance {

    open class Animal {
        open val image = ""
        open val food = ""
        open val habitat = ""

        var hunger = 10

        open fun makeNoise() {
            println("The OK.Animal is making a noise")
        }

        open fun eat() {
            println("The OK.Animal is eating")
        }

        open fun roam() {
            println("The OK.Animal is roaming")
        }

        fun sleep() {
            println("The OK.Animal is sleeping")
        }
    }


    class Hippo : Animal() {
        override val image = "awd.jph"
        override val food = "grass"
        override val habitat = "water"
    }
}