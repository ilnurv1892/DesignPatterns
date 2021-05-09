package notes

class Generics<T> {
    private var inside: T? = null

    fun put(t: T) {
        inside = t
    }

    fun get(): T? = inside

}


fun main() {
    val genericsStr = Generics<String>()
    genericsStr.put("1")

    val genericsInt = Generics<Int>()
    genericsInt.put(1)

    val genericsBoolean = Generics<Boolean>()
    genericsBoolean.put(true)

}