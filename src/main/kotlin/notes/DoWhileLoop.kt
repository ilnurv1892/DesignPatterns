package OK

fun main() {


    var isTrue = false



    do {
        var anser = readLine()?.toInt()

        when (anser) {
            1 -> println("false")
            2 -> {
                isTrue=true
                print(true)
            }
            else-> println("wrong")

        }



    } while (!isTrue)
}