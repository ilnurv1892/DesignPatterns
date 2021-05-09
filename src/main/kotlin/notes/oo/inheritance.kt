package oo

import kotlin.math.pow

open class Base

//only from open classes can be inherited
class Child : Base()

//parameters of constructor can be overridden
open class Shape1(open val name: String="Shape") {
    //fun should be open too. in Java all classes are open
    open fun area() = 0.0
}

open class Circle1(override val name: String, val radius: Double) : Shape1(name) {
    override fun area() = Math.PI * radius.pow(2.0)
}


fun main() {
    val smallCircle = Circle1("Small Circle", 2.0)

    println(smallCircle.name)
    println(smallCircle.radius)
    println(smallCircle.area())
}