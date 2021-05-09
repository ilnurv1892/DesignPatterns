package OK

fun main() {


    var hashMap = HashMap<String,String>()

    hashMap.put("first","newStrring")
    hashMap["second"] = "oldStrring"


    for (elements in hashMap.entries) {
        println(elements.key + " "+elements.value)
    }


    println(hashMap.get("first"))
    println(hashMap["second"])


    var hashMap2 = HashMap<Any, Any>()

    hashMap2["1"] = 2
    hashMap2["2z"]="q"
    hashMap2[3] = 2


    for (elements in hashMap2.entries) {
        print(elements.key)
        print(" ")
        println(elements.value)
    }
}