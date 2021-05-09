package oo

interface Drivable {

    fun drive()
    {
        println("Drivable (interface)")
    }

}

class Bicycle : Drivable {
    override fun drive() {
        println("Driving bicycle ")
    }
}


class Boat: Drivable {
    override fun drive() {
        println("Driving boat")
    }
}

fun main() {
    val drivable: Drivable = Bicycle()
    drivable.drive()

    val drivable2: Drivable = Boat()
    drivable2.drive()


    val drivable3 = Bicycle()
    drivable3.drive()

}