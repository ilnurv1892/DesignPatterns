package patternsJava.creationalPatterns.factory

fun main() {


    //static = companion?//

    var a: A = A()

    val fffuuun1 = a.fffuuun()

    val nuuuf = B.nuuuf()
    val fffuuun = A().fffuuun()

    val b: B = B()


    //b.nuuuf() - выполнение метода из объекта невозможно

    // companion doesnot require instantiaing a class


    val create = MyClass.create()
    println(create)

    val myClass: MyClass = MyClass(1)

    println(myClass.int1)
    MyClass.create()

    MyClass.c = 22

    println(MyClass.c)


}


class A {

    fun fffuuun(): String = "q"

}

class B {

    companion object {
        fun nuuuf(): String = "w"
    }
}


private class MyClass constructor() {
var int1 =1
     constructor(int: Int) : this() {

    }

    constructor(int: Int,boolean: Boolean) : this() {

    }

    companion object MyCompanionObj {
        var c = 3
        fun create(): MyClass {
            return MyClass()
        }
    }



}

//summary
//companion object - альтернатива статик методу, только один может быть в классе, может юзаться для фактори методов например вызваться из другого класса или пакета для вызова самого себя(интенты)
//имя companion object только для читабельности
// нельзя из объекта класса достутчаться к элементам companion object

