package org.example.basics

fun main() {
    val name = "Dilip"
    println(name)

    var age = 20
    println(age)
    age = 35
    println(age)

    val salary = 30000L
    println(salary)

    val course = "Kotlin Spring"
    println("Course is $course and the lenght of course is ${course.length}")

    val multiline = "ABC \n DEF"
    println(multiline)

    val multiline1 = """
        ABC
        DEF
    """.trimIndent()
    println(multiline1)
}