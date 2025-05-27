package org.example.cast

import org.example.classes.Course

fun main() {
    val course = Course(1, "Reactive Programming", "Parik")

    checkType(course)
    checkType("Dilip")

    castNumber(1.0)
//    castNumber(1)

    val number = 1
    val numberDouble = number.toDouble()
    println(numberDouble)
}

fun castNumber(any: Any) {
    when (any) {
        any as Double -> println("Value id Double")
    }
}

fun checkType(type: Any) {

    when (type) {
        is Course -> println(type)
        is String -> println(type.lowercase())
    }
}
