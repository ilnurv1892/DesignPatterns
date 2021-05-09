package OK

fun main() {


    var arrays = ArrayList<String>()

    arrays.add("first")
    arrays.add("second")
    arrays.add("third")
    arrays.add("forth")
    arrays.add("fifth")

    arrays[1] = "ggg"
    arrays.removeAt(3)
    arrays.remove("fifth")



    if (arrays.contains("qwe")) println("trye")


    for (items in 0 until arrays.size) {
        println(arrays[items])
    }

}