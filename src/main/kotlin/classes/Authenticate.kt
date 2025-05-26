package org.example.classes

object Authenticate {
    fun authenticate(username: String, password: String) {
        println("Authenticate successful")
    }
}

fun main() {
    Authenticate.authenticate("Dilip", "abc")
}