package oo

class Country(name: String, areaSqKm: Int) {
    val name: String
    val area: Int

    init {
        this.name = name
        this.area = areaSqKm
    }
}

class Country1(name: String, areaSqKm: Int) {
    val name: String = name
    val area: Int = areaSqKm

}

class Country2( val name: String,  val areaSqKm: Int) {
    fun print() = "$name, $areaSqKm"

    constructor(name:String) : this(name,0){
        println("second called")
    }
}


fun main() {
    val australia = Country2("Australia", 12)
   println( australia.print())

   println(australia.name)
   println(australia.areaSqKm)

    val spain = Country2("Spain")

    println(spain.print())
    println(spain.name)
    println(spain.areaSqKm)

}