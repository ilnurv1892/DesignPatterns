package OK

class Login<T>(name: T, password: T) {
    init {
        println("name $name password is $password")
    }
}

class Person(username: String, password: String) {
    var username: String? = null
    var password: String? = null


    init {
        this.username = username
        this.password = password
        println("person Class")
    }
}

fun main() {

    var login = Login<String>("qw", "qwdqw")
    var login2 = Login<Int>(1, 2)

    var person = Person("usernameeee", "hispassword")

    var user = Login<Person>(person, person)

    


}