package oo.oo1

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


abstract class Vehicle {
    open fun drive() {
        println("Driving")
    }

    abstract fun honk()
}

class Sedan : Vehicle(), Drivable {
    override fun drive() {
        super<Vehicle>.drive()  //!!!
        super<Drivable>.drive() //!!! супером опеределяется что вызывается
    }


    override fun honk() {
        println("awd")
    }


}

fun main() {
    val sedan = Sedan()
    sedan.drive()
    sedan.honk()
}