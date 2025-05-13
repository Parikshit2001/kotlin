package org.example.basics

fun main() {

//    val range = 1..10
//    for (i in range) {
//        println(i)
//    }
//
//    val reverseRange = 10 downTo 1
//    for (i in reverseRange) {
//        println(i)
//    }
//
//    for (i in reverseRange step 2) {
//        println(i)
//    }

    exploreWhile()
    exploreDoWhile()
}

fun exploreDoWhile() {
    var i = 0
    do {
        println(i)
        i++
    } while (i <= 5)
}

fun exploreWhile() {
    var x = 1
    while (x <= 6) {
        println("Value of x is $x")
        x++
    }
}
