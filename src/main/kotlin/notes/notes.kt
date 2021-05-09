/*------------------------------------------------------------------------------
 ilnurv : 2021-4-12 9:29
 -----------------------------------------------------------------------------*/
package notes

//Functions declared outside of any class are already static.
//fun howToIf(isBsd : Boolean) = if (isBsd) "kqueue" else "epoll"
//In Java, all classes can be extended, unless they're marked final . In Kotlin, no class can be extended, unless it's marked open .
//Whereas in Java, @Override is an optional annotation, in Kotlin it is a mandatory keyword.


//properties
/*In Java, we are used to the concept of getters and setters. A typical class may look something like this:
public class Person {
private String name;
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
// More methods come here
}
If we want to get a person's name, we call getName() . If we want to change it, wecall setName()


//If we want to set the name only once, during object instantiation, we can specify the non-default constructor and remove the setter as follows:
/*public class ImmutablePerson {
private String name;
public ImmutablePerson(String name) {
this.name = name;
}
public String getName() {
return name;
}
}*/


 */

//kotlin getters and setters
class Person() {
    var name: String = ""
        get() = field
        set(value) {
            field = value.toUpperCase()
        }
}

fun main() {
    val p = Person()

    p.name = "qwe"
    println(p.name)
}

// private val bullets = List(capacity) { Bullet() }

///Plain Old Java Object (POJO). it is basically an object that only has getters,setters, and an implementation of equals or hashCode methods.

//extension functions