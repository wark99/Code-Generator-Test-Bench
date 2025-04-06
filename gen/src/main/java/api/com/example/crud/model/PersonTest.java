// ModelTest.java

package com.example.crud.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void testPerson() {
        Person person = new Person(1L, "John Doe", 30);
        assertNotNull(person);
        assertEquals(1L, person.getId());
        assertEquals("John Doe", person.getName());
        assertEquals(30, person.getAge());
    }
}

