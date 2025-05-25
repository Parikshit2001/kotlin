package org.example.classes

class Person(val name: String = "", val age: Int = 0) {

    var email: String = ""
    var nameLength: Int = 0

    init {
        println("Initializing Person")
        nameLength = name.length
    }

    constructor(_email: String, _name: String = "", _age: Int = 0) : this(_name, _age) {
        email = _email
    }

    fun action() {
        println("Person Walks")
    }
}

fun main() {
//    val person = Person("Alex", 25)
//    person.action()
//    println("Name: ${person.name}, Age: ${person.age}")
//
//    val person1 = Person()
//    println("Person1")
//    println("Name: ${person1.name}, Age: ${person1.age}")

    val person2 = Person(_email = "abc@gmail.com", _name = "abc", _age = 25)
    println("Name: ${person2.name}, Age: ${person2.age}, Email: ${person2.email}, nameLength: ${person2.nameLength}")
}