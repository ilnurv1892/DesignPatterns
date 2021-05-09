package oo.oo1




fun Bicycle.replaceWheel() {
    println("replacing wheel..")
}

fun Boat.startEngine(): Boolean {
    println("starting engine")
    return true
}

fun main() {
    val vehicle: Drivable = Bicycle()
    vehicle.drive()

    //istanceOf - <> is

    if (vehicle is Bicycle) {
        vehicle.replaceWheel() // smart cast

    }
    if (vehicle is Boat) {
        vehicle.startEngine()//smart cast
    }

    //smart cast  vehicle is Bicicle then error
    if (vehicle is Boat && vehicle.startEngine())
    {

    }
    //smart cast here OR //// vehicle.replaceWheel() does not work here!
    if (vehicle !is Boat || vehicle.startEngine())
    {

    }

    //after this vehicle always be bicycle
    if (vehicle !is Bicycle )
    {
        return
    }
    vehicle.replaceWheel()


}