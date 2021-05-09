package OK

open class Animal(name1:String) {
    var name: String? = null
    var color: String? = null
    var numLegs: Int? = null

    constructor(name: String, color: String, numLegs: Int) : this(name1 = "heloshka") {
        this.name = name
        this.color = color
        this.numLegs = numLegs
        println(this.name + this.color + this.numLegs)
    }



    constructor() : this("name")
}

class Animal2 {
    constructor(name: String, color: String, numLegs: Int)
}


class Lion : Animal() {

}

fun main() {


    var animal: Animal = Animal("Dog", "brown", 12)

    var lion: Lion = Lion()
    lion.numLegs = 2

    println(" "+lion.numLegs +" "+ lion.color)



}