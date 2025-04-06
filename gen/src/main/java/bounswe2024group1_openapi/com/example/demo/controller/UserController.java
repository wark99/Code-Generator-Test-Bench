package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<User> users = new ArrayList<>();

    // GET all users
    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    // GET a single user by ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        throw new RuntimeException("User not found");
    }

    // POST a new user
    @PostMapping
    public User createUser(@RequestBody User user) {
        user.setId((long) users.size() + 1);
        users.add(user);
        return user;
    }

    // PUT update an existing user
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                user.setName(userDetails.getName());
                user.setEmail(userDetails.getEmail());
                return user;
            }
        }
        throw new RuntimeException("User not found");
    }

    // DELETE a user
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}

