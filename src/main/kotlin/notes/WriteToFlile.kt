package OK

import java.io.FileWriter
import java.lang.Exception

fun main() {

    writeToFile("hello!\n")
}


fun writeToFile(message: String) {


    try {
        var writer = FileWriter("message.txt",true)

        writer.write(message)
        writer.close()
    } catch (ex: Exception) {

    }




}
