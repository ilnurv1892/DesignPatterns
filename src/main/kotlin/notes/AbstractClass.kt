/*------------------------------------------------------------------------------
 ilnurv : 2021-4-26 8:15
 -----------------------------------------------------------------------------*/
package notes.ok

abstract class GraphicObject {
    fun moveTo(newX: Int, newY: Int) {
        print("moved")
    }

    abstract fun graph()
    abstract fun resize()

}


class Cicrcle : GraphicObject() {
    override fun graph() {
            println("Draw Circle")
    }

    override fun resize() {
        println("Resized ")
    }

}

class Triang : GraphicObject() {
    override fun graph() {
        TODO("Not yet implemented")
    }

    override fun resize() {
        TODO("Not yet implemented")

    }

}

fun main() {

    var graphicObject = Cicrcle()
    graphicObject.graph()
    graphicObject.resize()

    graphicObject.moveTo(1,2)
}