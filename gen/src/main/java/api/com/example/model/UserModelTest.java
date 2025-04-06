// src/test/java/com/example/model/UserModelTest.java

package com.example.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserModelTest {

    @Autowired
    private UserService userService;

    @Test
    void testUserCreation() {
        User user = new User(1L, "John Doe", "password123", "john@example.com");
        User createdUser = userService.createUser(user);
        assertEquals(user.getId(), createdUser.getId());
        assertEquals(user.getUsername(), createdUser.getUsername());
        assertEquals(user.getPassword(), createdUser.getPassword());
        assertEquals(user.getEmail(), createdUser.getEmail());
    }

    @Test
    void testUserUpdate() {
        User user = new User(1L, "John Doe", "password123", "john@example.com");
        userService.createUser(user);
        user.setUsername("Jane Doe");
        user.setPassword("password456");
        user.setEmail("jane@example.com");
        User updatedUser = userService.updateUser(user.getId(), user);
        assertEquals(user.getUsername(), updatedUser.getUsername());
        assertEquals(user.getPassword(), updatedUser.getPassword());
        assertEquals(user.getEmail(), updatedUser.getEmail());
    }
}

