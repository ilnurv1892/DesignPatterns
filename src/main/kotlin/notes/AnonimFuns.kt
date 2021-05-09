/*------------------------------------------------------------------------------
 ilnurv : 2021-4-26 8:16
 -----------------------------------------------------------------------------*/
package notes


fun main() {
    val numofLetters = "qweqwrwqrqwrqw"
    val count = numofLetters.count { c -> c == 'q' }



    println(count)


    println({
        val currentYear1 = 2018
        "welkome !!!!(C$currentYear1)"
    }())



}