package patternsJava.creationalPatterns.factory

interface Car {
    fun drive()
}


class Toyota : Car {
    override fun drive() {
        println("drive toyota")
    }
}

class Audi : Car {
    override fun drive() {
        println("drive audi")
    }
}


fun main() {

    val factory: Factory = Factory()
    val create: Car? = factory.create("patterns.creationalPatterns.factory.Audi")
    val create2: Car? = factory.create("patterns.creationalPatterns.factory.Toyota")
    val create3: Car? = factory.create("Toyota1")
    create?.drive()
    create2?.drive()
    create3?.drive()



}

class Factory {
    fun create(typeOfCar: String): Car? {

        return when (typeOfCar) {
            "patterns.creationalPatterns.factory.Audi" -> Audi()
            "patterns.creationalPatterns.factory.Toyota" -> Toyota()
            else -> null
        }


    }
}