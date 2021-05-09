package oo

abstract class Shape(val name: String) {

    abstract fun area(): Double
    open fun a() = 1

}

//implementation required!
class Circle(name: String, val radius: Double) : Shape(name) {
    override fun area(): Double = Math.PI * Math.pow(radius, 2.0)

}

//cant be instatiate abstract class
fun main() {
    // val shape = Shape("name")

    val shape = Circle("Large circle", 17.0)
    println(shape)

    shape.a()
}