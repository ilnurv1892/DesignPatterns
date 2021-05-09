/*------------------------------------------------------------------------------
 ilnurv : 2021-4-22 7:44
 -----------------------------------------------------------------------------*/
package patternsJava.structuralPatterns.adapter

import java.util.stream.Stream

val l = listOf("a", "b", "c")

fun <T> streamProcessing(stream: Stream<T>) {

}

fun main() {
//    streamProcessing(l) error


    streamProcessing(l.stream()) //adapted



}
