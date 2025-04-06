// ServiceTest.java

package com.example.crud.service;

import com.example.crud.model.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    @Test
    public void testFindAll() {
        // Arrange
        Person person = new Person(1L, "John Doe", 30);
        UserService userService = new UserService(new CRUDRepository());

        // Act
        List<Person> result = userService.findAll();

        // Assert
        assertNotNull(result);
        assertEquals(1, result.size());
    }
}

