package oo

open class Being
open class Person : Being()
class Student : Person()

fun main() {


    //Covariance = we can use a more derived type ( a subtype)


    val people: MutableList<Person> = mutableListOf(Person(), Person())

    people.add(Student())

    //not posible
    //people.OK.add(Being())

    val p : Any = Person() //covariance
    val p1 : Person = Student() //covariance

    //read only
    //val  student0 : List<Student> = listOf<Being>()
   // val students1 : List<Student> = listOf<OK.Person>()
    val students : List<Person> = listOf<Student>()
    //val students12 : List<OK.Person> = listOf<Being>()
       val student3 : List<Being> = listOf<Person>()
       val student33 : List<Being> = listOf<Student>()


    //mutable error
   // val students2 : MutableList<OK.Person> = mutableListOf<Student>()  //- not allowed ...  it error
   // val students3 : MutableList<Student> = mutableListOf<OK.Person>()  //- not allowed ...  it error



//wtf
    //read only
    //val students : List<OK.Person> = listOf<Student>()
   // val students1 : List<Student> = listOf<OK.Person>() as List<Student>
    //mutable error
   // val students2 : MutableList<OK.Person> = mutableListOf<Student>().toMutableList()  //- not allowed ...  it error
  //  val students3 : MutableList<Student> = mutableListOf<OK.Person>().toMutableList() as MutableList<Student>  //- not allowed ...  it error

}