package oo

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

object CountryFactory {
    val a = 4
    fun createCountry() = Country("Asutralia", 0)
}

object DafaultClickListener : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent?) {
        println("mose was clickded")
    }
}


fun main() {
    CountryFactory.a
    CountryFactory.createCountry()



}