package OK

fun main() {


    println(myltyply(2,3))

    println("great + ${returnString("hello ")}")
}

fun myltyply(num1:Int,num2:Int):Int
{

    return num1 * num2

}

fun returnString(name: String): String {

    return name+"added this text"

}