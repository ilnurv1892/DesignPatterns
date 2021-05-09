package oo

import java.util.*

val list: List<Int> = listOf(1, 2, 3)


class TimeLine<E> {
    val date2Date: MutableMap<Date, E> = mutableMapOf()

    fun add(element: E) {
        date2Date[Date()] = element
    }

    fun getLatest(): E {
        return date2Date.values.last()
    }
}

fun <E> timelineOf(vararg elements: E): TimeLine<E> {
    val result = TimeLine<E>()
    for (element in elements){
        result.add(element)
    }
    return result
}


fun main() {
    val timeLine: TimeLine<Int> = TimeLine()
    val timeLine2: TimeLine<String> = TimeLine()

    timeLine.add(2)
    timeLine2.add("212")

    println(timeLine.getLatest())
    println(timeLine2.getLatest())

    val timeline3 = timelineOf(1,2,3,4)

}