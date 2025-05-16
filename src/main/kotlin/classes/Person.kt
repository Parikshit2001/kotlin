package org.example.classes

class Person(val name: String = "", val age: Int = 0) {

    fun action() {
        println("Person Walks")
    }
}

fun main() {
    val person = Person("Alex", 25)
    person.action()
    println("Name: ${person.name}, Age: ${person.age}")

    val person1 = Person()
    println("Person1")
    println("Name: ${person1.name}, Age: ${person1.age}")


}