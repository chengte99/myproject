package com.chengte99;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void bmiTest() {
        Person person = new Person(66.5f, 1.7f);
        Assertions.assertEquals(66.5f/(1.7f*1.7f), person.bmi());
    }

    @Test
    public void bmiTest2() {
        Human human = new Human(70.2f, 1.7f, "Kevin");
        Assertions.assertEquals(70.2f/(1.7f*1.7f), human.bmi());
    }
}
