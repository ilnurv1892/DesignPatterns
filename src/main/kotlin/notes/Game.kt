package OK

fun main(args: Array<String>) {
    val options  = arrayOf("Rock","Paper","Scissors")


    println(getGameChoice(options))
}

fun getGameChoice(optionsParam: Array<String>) =
optionsParam[(Math.random() * optionsParam.size).toInt()]