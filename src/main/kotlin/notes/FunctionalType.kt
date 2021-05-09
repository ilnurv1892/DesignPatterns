/*------------------------------------------------------------------------------
 ilnurv : 2021-4-28 6:45
 -----------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------
 ilnurv : 2021-4-28 6:42
 -----------------------------------------------------------------------------*/
package notes

//анонимные функции имеет тип называемый функциональным типом. переменные этого типа могут передаваться по коду как обычные переменные
//Анонимные функции неявно, или автоматически, возвращают резуль-
//тат выполнения последней инструкции в теле функции, позволяя отбросить
//ключевое слово return .
//Эта особенность анонимных функций и удобна, и нужна для их синтаксиса.
//Ключевое слово return запрещено в анонимной функции, так как это создает
//двусмысленность для компилятора: из какой функции вернуть значение — из
//функции, в которой была вызвана анонимная функция, или из самой анонимной функции.


// !!! вот откуда переменная до стрелки, это параметр
val greetingFunction: (String) -> String = { name ->
    val currentYear = 2018

    "welkome to wilage year :$name $currentYear"

}
//it это один параметр


//В анонимной функции, которая принимает ровно один аргумент, вместо опреде-
//ления имени параметра можно использовать удобную альтернативу — ключевое
//слово it . В анонимных функциях с одним параметром можно использовать
//и именованный параметр, и его замену — ключевое слово it .
val greetingFunction3: (String) -> String = {
    val currentYear = 2018

    "welkome to wilage year :$it $currentYear"

}

val greetingFunction1: () -> String = {
    val currentYear = 2018

    "welkome to wilage year :$currentYear"

}


// несколько аргуметов
val greetingFunction4: (String, Int) -> String = { a, b ->
    val currentYear = 2018

    "welkome to wilage year :$a $b $currentYear"

}

//расширенно
val greetingFunction5 = { a: String, b: Int ->
    val currentYear = 2018
    print("itisexist")
    "welkome to wilage year :$a $b $currentYear"

}


fun main() {
    println(greetingFunction("name"))
    println(greetingFunction3("it works"))
    println(greetingFunction4("it works", 12312))


    //передали шаблон существуюшей лямбды
    lambdaAsParam("hello", 1, greetingFunction5)
    //передали саму лямбду
    lambdaAsParam("hello", 213) { name, count -> "$name , $count" }

    lambdaAsParam3("firstname", 100, greetingFunction5, ::printConstructionCost)
}


//лямбда в функции

fun lambdaAsParam(name: String, count: Int, greetingFunction6: (String, Int) -> String) {
    println(name + " " + greetingFunction6(name, count))
}

//inline

//Когда вы объявляете лямбду, она представляется в JVM экземпляром объ-
//екта. JVM также выделяет память для всех переменных, доступных в лямбде,а это увеличивает расход памяти. Проще говоря, лямбды очень неэффективно
//расходуют память, что сказывается на производительности. А потерь производительности следует избегать.К счастью, есть возможность включить оптимизацию, которая избавит от чрез-
//мерного расходования памяти при использовании лямбд в качестве аргументов.
//Такая возможность называется встраиванием (инлайнинг). Встраивание из-
//бавляет JVM от необходимости использовать экземпляр объекта и выделять
//память для переменных в лямбде.
inline fun lambdaAsParam2(name: String, count: Int, greetingFunction6: (String, Int) -> String) {
    println(name + " " + greetingFunction6(name, count))
}


//fun ref ссылка на функцию
//До этого момента вы объявляли лямбды для передачи в аргументе другой
//функции. Сделать это можно иначе: передать ссылку на функцию. Ссылка на
//функцию преобразует именованную функцию (функцию, объявленную с клю-
//чевым словом fun ) в значение, которое можно передавать как аргумент. Ссылку
//на функцию можно использовать везде, где допускается лямбда-выражение.

fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}
// передали cost
inline fun lambdaAsParam3(name: String, count: Int, greetingFunction5: (String, Int) -> String, cost: (Int) -> Unit) {
    cost(count)
    println(name + " " + greetingFunction5(name, count) + " ")
}

//бывает функция как возвращаемый тип. загуглировать для доп инфы