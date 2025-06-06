package org.example.nulls

data class Movie(
    val id: Int?,
    val name: String,
)

fun printName(name: String) {
    println("Name is $name")
}

fun main() {
    var nameNullable: String? = null

//    printName(nameNullable!!)

    nameNullable?.run {
        printName(this)
    }

    println("Value is ${nameNullable?.length}")     // ? safe operator
//    nameNullable = "Alex"
    val length = nameNullable?.length?.toLong() ?: 0    // ?: Elvis operator
    println("Value is ${length}")

//    if (nameNullable != null) {
//        println("Value is ${nameNullable.length}")
//    }

    nameNullable = "Dilip"
    println("Value is $nameNullable")

    var name: String = "Dilip"

    val movie = Movie(null, "Avengers")
    val savedMovie = saveMovie(movie)
    println(savedMovie.id!!)    // non null assertion !!
    println("Sved Moview: $savedMovie")
}

fun saveMovie(movie: Movie): Movie {
//    return movie.copy(id = 1)
    return movie
}
