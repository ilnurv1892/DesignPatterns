/*------------------------------------------------------------------------------
 ilnurv : 2021-4-20 8:48
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns

//decorator тот же прототип, только паттерн поведенческий, методы функции итд.


class HappyMap<K, V> : HashMap<K, V>() {
    override fun put(key: K, value: V): V? {
        return super.put(key, value).apply {
            println("YAY!$key")  //  this -  if(this!=null)
        }
    }
    override fun remove(key: K): V? {
        println("removed")
        return super.remove(key)
    }
}




class HappyMap2<K, V>(private val map: MutableMap<K, V> = mutableMapOf()) : MutableMap<K, V> by map {
    override fun put(key: K, value: V): V? {
        return map.put(key, value).apply { println("YAY123123 $key $value") }
    }
}

class SadMap<K, V> : HashMap<K, V>() {
    override fun remove(key: K): V? {
        return super.remove(key).apply {
            println("okay")
        }
    }
}


fun main() {
    val happy = HappyMap<String, String>()
    happy.put("2", "3")
    happy["1"] = "2"
    happy.remove("2")

    val sad = SadMap<String, String>()
    sad["1"] = "2"

    sad.remove("1")


    val happy2 = HappyMap2<Int,Int>(SadMap())

    happy2.put(333,333)
    happy2.remove(333,333)

    happy2[1] = 1

    val a = listOf("a")
    val b = listOf("b")
    val c = a + b

    println(c)


    val j11 = Json1("""{"a{:"b"}""")
    val j22 = Json1("""{"j{:"d"}""")
    //err !!!!println(j11+j22)

    //а так декоратор плюса или минуса работает
    val j1 = Json("""{"a{:"b"}""")
    val j2 = Json("""{"j{:"d"}""")
    println(j1 + j2)
    println(j2 - j1)

}

data class Json(val j: String)
data class Json1(val j: String)


//operator  its + -  etc
//error ! println(j1+j2)
operator fun Json.plus(j2: Json): Json {
    val jsonFields = this.j.split(":") + j2.j.split(":")
    val s = (jsonFields).joinToString(":")
    return Json("""{$s}""")
}

operator fun Json.minus(j2: Json): Json {
    val jsonFields = this.j.split(":") - j2.j.split(":")
    val s = (jsonFields).joinToString(":")
    return Json("""{$s}""")
}

