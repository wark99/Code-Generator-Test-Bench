// UserServiceImpl.java

package com.example.service;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
 
    @Override
    public List<User> getUsers() {
        // Business logic to fetch users from database or any other source
        return List.of(new User(1L, "John Doe", "johndoe@example.com"), new User(2L, "Jane Doe", "janedoe@example.com"));
    }
 
    @Override
    public User getUserById(Long id) {
        // Business logic to fetch a user by ID from database or any other source
        return Optional.ofNullable(new User(1L, "John Doe", "johndoe@example.com")).orElse(null);
    }
 
    @Override
    public User createUser(User user) {
        // Business logic to create a new user in the database
        return new User(2L, "Jane Doe", "janedoe@example.com");
    }
 
    @Override
    public User updateUser(Long id, User user) {
        // Business logic to update an existing user in the database
        return new User(1L, "John Doe Updated", "johndoe@example.com");
    }
 
    @Override
    public void deleteUser(Long id) {
        // Business logic to delete a user from the database
        System.out.println("Deleting user with ID: " + id);
    }
}

