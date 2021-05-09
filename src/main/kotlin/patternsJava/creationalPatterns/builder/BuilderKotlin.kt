/*------------------------------------------------------------------------------
 ilnurv : 2021-4-10 2:57
 -----------------------------------------------------------------------------*/

//private var _message: String = "",
//Using underscores for private variables is a common convention in Kotlin. It allows us to
//avoid repeating this.message = message and mistakes such as message = message .

package patternsJava.creationalPatterns.builder


data class Mail(
    var to: String,
    val cc: List<String> = listOf(),
    val bcc: List<String> = listOf(),
    var title: String? = "",
    private var _message: String = "",
    val attachments: List<java.io.File> = listOf()
)

val mailFistWay = Mail("qwerty").apply {
    title = "messages"
    to = "qwer"
}


data class Mail2(
    var to: String,
    val cc: List<String> = listOf(),
    val bcc: List<String> = listOf(),
    var title: String? = "",
    var _message: String = "",
    val attachments: List<java.io.File> = listOf()
) {
    fun title(title: String): Mail2 {
        this.title = title
        return this
    }
}

private fun Mail2.message(message: String): Mail2 {

    this._message = message
    return this

}

val mailSecondWay = Mail2("qwe").title("ping").message("messssssssage")



//Параметры по умолчанию можно переопределить, и запустить .build()
class MailBuilder(private val to: String) {
    private var mail = Mail2(to)

    fun title(title: String): MailBuilder {
        mail.title = title
        return this
    }

    fun message(message: String): MailBuilder {
        mail._message = message
        return this
    }

    fun build(): Mail2 {
        return mail
    }
}

val emailThirdWay = MailBuilder("towho")

fun main() {
    println(emailThirdWay.build())
    println(emailThirdWay.title("tit").build())
    println(emailThirdWay.message("mes"))
    println(emailThirdWay.build())
}