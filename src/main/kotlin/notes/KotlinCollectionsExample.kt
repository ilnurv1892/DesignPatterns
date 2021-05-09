package OK

fun main() {

//immutable
    var myArray = listOf<String>("me", "you", "they", "enought")
    var myArray2 = listOf(2, "you", "they", "enought")
    println(myArray)

//    myArray[2]=2 = error!

    //make mutable

    var mylist = mutableListOf("q","w")
    mylist[1] = "Z"

    println(myArray[0])



    var haspMap = mutableMapOf(1 to "qwe",2 to "sss")

    var hashmapImm = hashMapOf(1 to "zz")
    hashmapImm[1]="as"


    var myarrays = arrayOf(1, 2, 3, 4)
    

}