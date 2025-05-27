package org.example.nulls

data class Movie(
    val id: Int?,
    val name: String,
)

fun main() {
    var nameNullable: String? = null
    println("Value is $nameNullable")

    nameNullable = "Dilip"
    println("Value is $nameNullable")

    var name: String = "Dilip"

    val movie = Movie(null, "Avengers")
    val savedMovie = saveMovie(movie)
    println("Sved Moview: $savedMovie")
}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
}
