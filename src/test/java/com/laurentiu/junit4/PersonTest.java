package com.laurentiu.junit4;

import com.laurentiu.Person;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class PersonTest {
    Person person = new Person();

    @Test
    public void givenPersonWithAge10(){
        person.setAge(10);

        boolean actualResult = person.isTeenager();

        assertTrue(actualResult);
    }

    @Test
    public void givenPersonWithAge20(){
        person.setAge(20);
        boolean expected = false;
        boolean actualResult = person.isTeenager();

        assertEquals(expected,actualResult);

    }
}
