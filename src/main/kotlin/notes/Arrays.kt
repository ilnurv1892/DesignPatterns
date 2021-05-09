package OK

fun main() {
    var myArray = Array<Int>(5){3}


    for (element in myArray) {
        println(element)
    }



    for (index in 1 until myArray.size) {
        println(myArray[index])
    }


}