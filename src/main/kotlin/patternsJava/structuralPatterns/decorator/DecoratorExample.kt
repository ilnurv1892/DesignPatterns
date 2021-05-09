/*------------------------------------------------------------------------------
 ilnurv : 2021-4-21 8:51
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns

class CustomMap<K, V>(private val map: MutableMap<K, V> = mutableMapOf()) : MutableMap<K, V> by map {
    override fun put(key: K, value: V): V? {
        return map.put(key, value).apply { println("decorated put   $key $value") }
    }
}


class CustomMap2<K, V>(private val map: MutableMap<K, V> = mutableMapOf()) : MutableMap<K, V> by map {
    override fun remove(key: K): V? {
        println("removed $key")
        return map.remove(key)
    }
}



fun main() {
    val a = CustomMap<Int,Int>(CustomMap2<Int,Int>())

    a.put(1,1)
    a.remove(2)


    val b = CustomMap(CustomMap<Int,Int>())

    b.put(1,2)
    b.remove(1)


    val c = CustomMap2(CustomMap2<Int,Int>())

    c.put(1,2)
    c.remove(1)


    println(a is CustomMap2<*,*>)
    println(b is CustomMap2<*,*>)
    println(c is CustomMap<*,*>)
    println(c is MutableMap<*,*>)
}