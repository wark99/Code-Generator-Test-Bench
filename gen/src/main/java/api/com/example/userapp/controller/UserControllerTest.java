package com.example.userapp.controller;

import com.example.userapp.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class UserControllerTest {

    private UserController userController;
    private UserRepository userRepository;

    @BeforeEach
    public void setup() {
        userRepository = new UserRepository();
        userController = new UserController(userRepository);
    }

    @Test
    public void testCreateUser() {
        User newUser = new User(null, "John Doe", "john@example.com");
        User createdUser = userController.createUser(newUser);

        assertThat(createdUser).isNotNull();
        assertThat(createdUser.getId()).isGreaterThan(0L);
        assertThat(createdUser.getName()).isEqualTo("John Doe");
    }

    @Test
    public void testGetAllUsers() {
        userRepository.save(new User(null, "Alice", "alice@example.com"));
        userRepository.save(new User(null, "Bob", "bob@example.com"));

        List<User> users = userController.getAllUsers();

        assertThat(users).hasSize(2);
    }

    @Test
    public void testGetUserById() {
        User newUser = new User(null, "Charlie", "charlie@example.com");
        User savedUser = userRepository.save(newUser);

        User retrievedUser = userController.getUserById(savedUser.getId());

        assertThat(retrievedUser).isNotNull();
        assertThat(retrievedUser.getName()).isEqualTo("Charlie");
    }

    @Test
    public void testUpdateUser() {
        User newUser = new User(null, "Dave", "dave@example.com");
        User savedUser = userRepository.save(newUser);

        User updatedDetails = new User(savedUser.getId(), "David", "david@newemail.com");
        User updatedUser = userController.updateUser(updatedDetails.getId(), updatedDetails);

        assertThat(updatedUser.getName()).isEqualTo("David");
        assertThat(updatedUser.getEmail()).isEqualTo("david@newemail.com");
    }

    @Test
    public void testDeleteUser() {
        User newUser = new User(null, "Eve", "eve@example.com");
        User savedUser = userRepository.save(newUser);

        userController.deleteUser(savedUser.getId());

        List<User> users = userController.getAllUsers();

        assertThat(users).isEmpty();
    }
}

