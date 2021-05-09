package OK

fun main() {
    val modifyString1 = modifyString("koTlIn") { it.toUpperCase() }

    val modifyString = modifyString(("koTlIn"), { it.toUpperCase() }, { modifyString -> modifyString.toLowerCase() })

    println(modifyString)
    println(modifyString1)
}

fun modifyString(str: String, operation1: (String) -> String): String {

    return operation1(str)
}


inline fun modifyString(str: String, noinline operation: (String) -> String, operation1: (String) -> String): String {

    return operation(operation1(str))
}