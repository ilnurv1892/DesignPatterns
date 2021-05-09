package oo

class City {
    var name: String = ""
        get() {
            return field
        }
        set(value) {
            if (value.isNotBlank())
            field = value
        }
    var population: Int = 0
}

fun main() {
    val berliin = City()
    berliin.name = "Berlin"
    berliin.name = " "
    berliin.population = 123_231_212


    println(berliin.name)
    println(berliin.population)
}