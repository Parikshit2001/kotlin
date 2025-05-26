package org.example.classes

open class User(val name: String) {

    fun login() {
        println("Insdie User Login")
    }
}

class Student(name: String) : User(name) {}
class Instructor(name: String) : User(name) {}

fun main() {
    val student = Student("Alex")
    println(student.name)
    student.login()

    val instructor = Instructor("Dilip")
    println(instructor.name)
    instructor.login()
}