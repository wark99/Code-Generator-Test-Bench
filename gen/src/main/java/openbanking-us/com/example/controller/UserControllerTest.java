// UserControllerTest.java

package com.example.controller;

import com.example.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest {
    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @Test
    public void testGetAllUsers() {
        when(userService.getAllUsers()).thenReturn(List.of(new User(1, "User 1", "user1@example.com", "password")));
        assertEquals(1, userController.getAllUsers().size());
    }

    @Test
    public void testGetUserById() {
        User user = new User(1, "User 1", "user1@example.com", "password");
        when(userService.getUserById(1L)).thenReturn(user);
        assertEquals(1, userController.getUserById(1L).getId());
    }

    @Test
    public void testCreateUser() {
        User user = new User(1, "User 1", "user1@example.com", "password");
        when(userService.createUser(new User(0, "", "", ""))).thenReturn(user);
        assertEquals(2, userController.createUser(new User(0, "", "", "")).getId());
    }

    @Test
    public void testUpdateUser() {
        User user = new User(1, "User 1", "user1@example.com", "password");
        when(userService.updateUser(1L, new User(2, "User 2", "user2@example.com", ""))).thenReturn(user);
        assertEquals(2, userController.updateUser(1L, new User(2, "User 2", "user2@example.com", "")).getId());
    }

    @Test
    public void testDeleteUser() {
        User user = new User(1, "User 1", "user1@example.com", "password");
        when(userService.deleteUser(1L)).thenReturn(user);
        assertEquals(null, userController.deleteUser(1L));
    }
}

