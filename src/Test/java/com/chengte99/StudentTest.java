package com.chengte99;

import com.chengte99.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void highestTest() {
        Student student = new Student("Tom", 69, 80);
        Assertions.assertEquals(80, student.highest());
    }

    @Test
    public void averageTest() {
        Student student = new Student("Tom", 69, 80);
        Assertions.assertEquals((69+80)/2, student.getAverage());
    }
}
