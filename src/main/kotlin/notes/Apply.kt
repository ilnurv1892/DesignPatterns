/*------------------------------------------------------------------------------
 ilnurv : 2021-4-10 3:50
 -----------------------------------------------------------------------------*/
package notes

data class Mail(var a: String, val b: Int, val c: Boolean, var d: String = "D")

val mail = Mail("a", 1, true).apply {
    a = "1"
    d = "d"
}