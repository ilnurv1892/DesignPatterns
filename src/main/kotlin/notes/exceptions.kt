package OK

import java.io.IOException

fun main(args: Array<String>) {


    var input = try {
        getExternalInput()
    } catch (e: IOException) {
        e.printStackTrace()
        " "
    } finally {
        println("finished")
    }

    println(input)
}


fun getExternalInput(): String {
    throw IOException("Cold not read external input")
}