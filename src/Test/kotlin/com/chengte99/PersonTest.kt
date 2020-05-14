package com.chengte99.kotlin

import com.chengte99.Human
import com.chengte99.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun bmiTest() {
        val h = Human(66.5f, 1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f), h.bmi())
    }

    @Test
    fun personBmiTest() {
        val p = Person(70.5f, 1.7f)
        Assertions.assertEquals(70.5f/(1.7f*1.7f), p.bmi())
    }
}