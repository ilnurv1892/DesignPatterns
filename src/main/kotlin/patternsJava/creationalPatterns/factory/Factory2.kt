package patternsJava.creationalPatterns.factory

var counter = 0
private val dogFactory = DogFactory()
private val catFactory = CatFactory()


interface Animal {
    val id: Int
    val name: String
}

class Cat(override val id: Int) : Animal {
    override var name = "Cat"
}

class Dog(override val id: Int) : Animal {
    override var name = "Dog"
}

fun animalFactory(type: String, secondType: String): Animal {

    return when (type) {
        "cat" -> catFactory.createCat(secondType, counter++)
        "dog" -> dogFactory.createDog(secondType, counter++)


        else -> throw RuntimeException("WRONK!")
    }

}


fun main() {
    val animals = listOf(
        "cat" to "a",
        "dog" to "b",
        "dog" to "b",
        "dog" to "a",
        "dog" to "a",
        "cat" to "b",
        "cat" to "b",
        "cat" to "a"
    )

    for ((a, b) in animals) {

        val animalFactory = animalFactory(a, b)
        println("" + animalFactory.name + " " + animalFactory.id)
    }
}

class CatFactory {
    fun createCat(a: String, counter: Int): Animal {
        return when (a) {
            "a" -> A(counter,a)
            "b" -> B(counter,a)
            else -> throw RuntimeException("WRONK!")
        }
    }
    class A(override val id: Int, override val name: String) : Animal
    class B(override val id: Int, override val name: String) : Animal
}

class DogFactory {
    fun createDog(a: String, counter: Int): Animal {
        return when (a) {
            "a" -> A(counter,a)
            "b" -> B(counter,a)
            else -> throw RuntimeException("WRONK!")
        }
    }
    class A(override val id: Int, override val name: String) : Animal
    class B(override val id: Int, override val name: String) : Animal
}