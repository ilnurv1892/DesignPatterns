package oo

fun main() {
    val residence = Address("Main stret11111", 42, "1234", "New York")
    val residence2 = Address("Main stret", 42, "1234", "New York")

    println(residence)
    println(residence === residence2)
    println(residence == residence2)


    val neighbor = residence.copy(number = 1)
    println(neighbor)

        //destructuring operator
    val (street,number,poscode,city) = residence
    println(street)
}

//generates hashCode,equasls,toString,copy etc
data class Address(val Street: String, val number: Int, val postcode: String, val city: String)