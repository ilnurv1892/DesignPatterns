/*------------------------------------------------------------------------------
 ilnurv : 2021-4-12 8:26
 -----------------------------------------------------------------------------*/
package patternsJava.creationalPatterns.prototype

data class PC(
    val motherboard: String = "Terasus XZ27",
    val cpu: String = "Until Atom K500",
    val ram: String = "8GB Microcend BBR5",
    val graphicCard: String = "nKCF 8100TZ"
)

val pc = PC()

//prototype = clone object

val pcFromeWarehouse = PC()

val pwnerPC = pcFromeWarehouse.copy(graphicCard = "GFORKE 2300SZ", cpu = "pentium Atom")

fun main() {
    println(pcFromeWarehouse)
    println(pwnerPC)
}

