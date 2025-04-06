// CrudRepositoryTest.java

package com.example.crud.repositories;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CRUDRepositoryTest {
    @Test
    public void testFindAll() {
        // Arrange
        Person person = new Person(1L, "John Doe", 30);
        CRUDRepository crudRepository = new CRUDRepository();

        // Act
        List<Person> result = crudRepository.findAll();

        // Assert
        assertNotNull(result);
        assertEquals(1, result.size());
    }
}

