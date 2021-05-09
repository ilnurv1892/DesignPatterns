package OK

import java.io.FileReader
import java.nio.file.Files
import java.nio.file.Paths

fun main() {
    readFromFile2()
}

fun readFromFile() {
    var reader = FileReader("message.txt")
    val readMessage: String? = null
    var char: Int?

    try {

        do {

            char = reader.read()
            print(char.toChar())


        } while (char != -1)
        reader.close()

    } catch (ex: Exception) {

    }


}

fun readFromFile2() {
    val stream = Files.newInputStream(Paths.get("message.txt"))
    stream.buffered().reader().use { reader-> println(reader.readText()) }
}