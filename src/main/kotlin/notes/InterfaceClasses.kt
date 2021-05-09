package OK

interface InputHandler {
    fun clicked()

}

interface InputClicker {
    fun clickAgain()
}


class Button : InputHandler, InputClicker {
    override fun clicked() {
        println("Clicked")
    }

    override fun clickAgain() {
        TODO("Not yet implemented")
    }
}

fun main() {


    var btn = Button()
    btn.clicked()

}