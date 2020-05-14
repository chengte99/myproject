package com.chengte99.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    fun grading() {
        val s = Student("Kevin", 60, 80)
        Assertions.assertEquals('C', s.grading())
    }
}