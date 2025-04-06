// UserControllerTest.java

package com.example.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
 
@ExtendWith(MockitoExtension.class)
public class UserControllerTest {
 
    @Mock
    private UserService userService;
 
    @InjectMocks
    private UserController userController;
 
    @Test
    public void testGetUsers() {
        List<User> users = List.of(new User(1L, "John Doe", "johndoe@example.com"));
        when(userService.getUsers()).thenReturn(users);
        assertEquals(users, userController.getUsers());
    }
 
    @Test
    public void testGetUserById() {
        User user = new User(1L, "John Doe", "johndoe@example.com");
        when(userService.getUserById(any())).thenReturn(user);
        assertEquals(user, userController.getUserById(1L));
    }
 
    @Test
    public void testCreateUser() {
        User user = new User(2L, "Jane Doe", "janedoe@example.com");
        when(userService.createUser(any())).thenReturn(user);
        assertEquals(user, userController.createUser(user));
    }
 
    @Test
    public void testUpdateUser() {
        User user = new User(1L, "John Doe", "johndoe@example.com");
        when(userService.updateUser(any(), any())).thenReturn(user);
        assertEquals(user, userController.updateUser(1L, user));
    }
 
    @Test
    public void testDeleteUser() {
        userService.deleteUser(1L);
        // Since we're returning no content in the controller,
        // we can't directly check for it. Instead, we'll check if an exception is thrown.
        assertThrows(EmptyResponseException.class, () -> userController.deleteUser(1L));
    }
}

