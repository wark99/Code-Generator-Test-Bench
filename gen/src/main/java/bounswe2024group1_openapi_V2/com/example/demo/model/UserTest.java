package com.example.demo.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testUserCreation() {
        User user = new User(1L, "John Doe", "john.doe@example.com");
        
        assertEquals(1L, user.getId());
        assertEquals("John Doe", user.getName());
        assertEquals("john.doe@example.com", user.getEmail());
    }

    @Test
    public void testUserSetters() {
        User user = new User();
        user.setId(2L);
        user.setName("Jane Smith");
        user.setEmail("jane.smith@example.com");

        assertEquals(2L, user.getId());
        assertEquals("Jane Smith", user.getName());
        assertEquals("jane.smith@example.com", user.getEmail());
    }
}

