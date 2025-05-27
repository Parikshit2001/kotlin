package org.example.classes

open class User(val name: String) {
    open var isLoggedIn: Boolean = false
    open fun login() {
        println("Insdie User Login")
    }

    private fun secret() {
        println("Insdie User Secret [private]")
    }

    protected open fun logout() {
        println("Insdie User Logout [protected open]")
    }
}

class Student(name: String) : User(name) {

    companion object {
        const val noOfEnrolledCourses = 10
        fun country() = "USA"
    }

    override var isLoggedIn: Boolean = true
    override fun login() {
        println("Inside Student login")
    }

    override fun logout(){
        super.logout()
        println("Inside Student logout [override]")
    }
}

class Instructor(name: String) : User(name) {}

fun main() {
    val student = Student("Alex")
    println(student.name)
    student.login()
    println(student.isLoggedIn)

    val instructor = Instructor("Dilip")
    println(instructor.name)
    instructor.login()
    println(instructor.isLoggedIn)

    val country = Student.country()
    println(country)

    println(Student.noOfEnrolledCourses)

    val user = User("Dilip")
}