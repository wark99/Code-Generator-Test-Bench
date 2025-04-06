// src/main/java/com/example/user/test/UserTest.java

package com.example.user.test;

import com.example.user.model.User;
import com.example.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetAllUsers() {
        List<User> users = userService.getAllUsers();
        assertEquals(0, users.size());
    }

    @Test
    public void testGetUserById() {
        Long id = 1L;
        Optional<User> user = userService.getUserById(id);
        assertTrue(user.isPresent());
        assertNotNull(user.get());
    }

    @Test
    public void testCreateUser() {
        User user = new User(1L, "John Doe", "john.doe@example.com");
        User createdUser = userService.createUser(user);
        assertEquals(1L, createdUser.getId());
        assertEquals("John Doe", createdUser.getName());
        assertEquals("john.doe@example.com", createdUser.getEmail());
    }

    @Test
    public void testUpdateUser() {
        Long id = 1L;
        User user = new User(id, "Jane Doe", "jane.doe@example.com");
        User updatedUser = userService.updateUser(user);
        assertEquals(1L, updatedUser.getId());
        assertEquals("Jane Doe", updatedUser.getName());
        assertEquals("jane.doe@example.com", updatedUser.getEmail());
    }

    @Test
    public void testDeleteUser() {
        Long id = 1L;
        userService.deleteUser(id);
        assertFalse(userService.getUserById(id).isPresent());
    }
}

