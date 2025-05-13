package org.example.basics

fun main() {
    var name = "bing"
    name = "Chloe"

    val result = if (name.length == 4) {
        println("Name i s 4 chars")
        name.length
    } else {
        println("Name is not 4 chars")
        name.length
    }

    println("Result is $result")

    val position = 3

    val medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }



    println(medal)
}