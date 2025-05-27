package org.example.interfaces

import org.example.classes.Course

interface CourseRepository {
    val isCoursePersisted: Boolean
    fun getById(id: Int): Course

    fun save(course: Course): Int {
        println("Course: $course")
        return course.id
    }
}

interface Repository {
    fun getAll(): Any
}

class SqlCourseRepository : CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Reactive Programming", "Parik")
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }

    override fun getAll(): Any {
        return 1
    }
}

class NoSqlCourseRepository : CourseRepository {
    override val isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Reactive Programming", "Parik")
    }

    override fun save(course: Course): Int {
        println("Course in noSqlCourseRepository: $course")
        return course.id
    }
}

interface A {
    fun doSomething() {
        println("doSomething in A")
    }
}

interface B {
    fun doSomething() {
        println("doSomething in B")
    }
}

class AB : A, B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("doSomething in AB")
    }
}


fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println("Course is $course")
    val courseID = sqlCourseRepository.save(Course(5, "Reactive Programming", "Parik"))
    println("Course persisted value is ${sqlCourseRepository.isCoursePersisted}")
    println("Saved courseId is $courseID")

    val noSqlCourseRepository = NoSqlCourseRepository()
    val course1 = noSqlCourseRepository.getById(1)
    println("Course1 is $course1")
    val course2 = noSqlCourseRepository.save(Course(6, "Reactive Programming", "Parik"))
    println("Saved courseId in noSQLCourseRepository is $course2")

    val ab = AB()
    ab.doSomething()
}