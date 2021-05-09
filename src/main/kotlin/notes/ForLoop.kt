package OK

fun main() {


    for (item in 0..5) {
        if (item % 2 == 0 && item != 0) {
            println("devisible by 2 - $item")
        } else

            println("num $item")
    }
}