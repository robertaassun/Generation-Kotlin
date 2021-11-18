package service

import model.Course
import model.Module
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


internal class CourseServiceTest {

    val courseService = CourseService()
    val curso = Course("INTRO-CS-1", "Introduction to Computer Science", 9,
        Module("INTRO-CS-1", "Curso de Kotlin", "Introdução ao Kotlin")
    )

    @Test
    fun registerCourse() {
        courseService.registerCourse(curso)
        assertEquals(true, courseService.verifica("INTRO-CS-1"))
    }
}