// UserServiceTest.java
package com.example.demo.service;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@SpringBootTest
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    private User user1, user2;

    @BeforeEach
    void setUp() {
        user1 = new User(1L, "user1", "user1@example.com", "password");
        user2 = new User(2L, "user2", "user2@example.com", "password");
    }

    @Test
    public void testSaveUser() {
        when(userRepository.save(any(User.class))).thenReturn(user1);
        User savedUser = userService.saveUser(new User("user3", "user3@example.com", "password"));
        assertNotNull(savedUser);
        assertEquals("user3", savedUser.getUsername());
    }

    @Test
    public void testGetAllUsers() {
        when(userRepository.findAll()).thenReturn(Arrays.asList(user1, user2));
        List<User> users = userService.getAllUsers();
        assertFalse(users.isEmpty());
        assertEquals(2, users.size());
    }

    @Test
    public void testFindUserByIdExisting() {
        when(userRepository.findById(1L)).thenReturn(Optional.of(user1));
        Optional<User> foundUser = userService.getUserById(1L);
        assertTrue(foundUser.isPresent());
        assertEquals("user1", foundUser.get().getUsername());
    }

    @Test
    public void testFindUserByIdNonExisting() {
        when(userRepository.findById(999L)).thenReturn(Optional.empty());
        Optional<User> foundUser = userService.getUserById(999L);
        assertFalse(foundUser.isPresent());
    }

    @Test
    public void testUpdateUser() {
        when(userRepository.existsById(1L)).thenReturn(true);
        when(userRepository.save(any(User.class))).thenReturn(user1);

        User updatedUser = new User("updatedUser", "user1@example.com", "newpassword");
        User resultUser = userService.updateUser(updatedUser, 1L);

        assertNotNull(resultUser);
        assertEquals("updatedUser", resultUser.getUsername());
    }

    @Test
    public void testDeleteUser() {
        doNothing().when(userRepository).deleteById(1L);
        userService.deleteUser(1L);
        verify(userRepository, times(1)).deleteById(1L);
    }
}

