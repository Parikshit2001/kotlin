package org.example.basics

fun main() {
    for (i in 1..5) {
        println("i in $i")
        if (i == 3) break
    }

    label()

    listOf(1, 2, 3, 4, 5).forEach each@{//if(it==3) return@forEach
        if (it == 3) return@each
    }

    println("End of program")
}

fun label() {
    loop@ for (i in 1..5) {
        println("i in label $i")
//        if (i == 3) break@loop
        innerloop@ for (j in 1..5) {
            println("j = $j")
            if (j == 2) break@innerloop
        }
    }
}
