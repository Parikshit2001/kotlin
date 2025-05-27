package org.example.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String,
    val courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

fun main() {
    val course = Course(1, "Reactive Programming", "Parik")
    println(course)

    val course1 = Course(1, "Reactive Programming", "Parik")

    println("Check object equality: ${course1 == course}")

    val course3 = course1.copy(id = 3, name = "Dilip")
    println(course3)

    val marketingCourse = Course(1, "Reactive Programming", "Parik", CourseCategory.MARKETING)
    println(marketingCourse)
}
