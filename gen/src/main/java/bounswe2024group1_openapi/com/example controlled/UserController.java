package com.example controlled;

import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.Request;
import org.springframework.web.servlet.RestController;

import static org.junit.jupiter.api.Assertions.*;
import static org.easyui Arrange.*;

public class UserController {
    @RestController
    public static final Resources UserController = new Resources();

    // List and create users controller methods (part of UserController)
    @GetMapping("/api/users")
    public Resource<Map<User, String>> listUsers(@Nullable String id) {
        return new ResponseEntity<Map<User, String>>(users, "Get all users");
    }

    @PostMapping("/api/users")
    public Resource<User> createUser(@Nullable String username) {
        if (username != null && !username.isEmpty()) {
            User user = new User();
            user.username = username;
            return createUser(user);
        }
        throw new IllegalArgumentException("Username is empty");
    }

    @Preconditions.checkArgument("id", "not-null")
    @Preconditions.checkArgument("username", "not-empty")
    public Resource<User> createUser(@Nullable String id, @Nullable String username) {
        User user = new User();
        if (id != null && !id.isEmpty()) {
            user.setId(id);
        }
        user.username = username;
        return createUser(user);
    }

    // List create users method
    @GetMapping("/api/users/batch")
    public Resource<Map<User, String>> listCreateUsers(@Nullable String[] users) {
        Map<User, String> result = new HashMap<>();
        for (User user : users) {
            if (user != null && !user.getId().isEmpty()) {
                result.put(user.getId(), user.username);
            }
        }
        return new ResponseEntity<Map<User, String>>(result, "Get all users");
    }

    @PostMapping("/api/users/batch")
    public Resource<Resource<Map<User, String>>> listCreateUsers(@Nullable String[] users) {
        Map<User, String> batchCreatedUsers = new HashMap<>();
        for (User user : users) {
            if (user != null && !user.getId().isEmpty()) {
                User existingUser = db.query(User::id)
                    .filter(u -> u.getId().equals(user.getId()))
                    .findFirst();
                if (existingUser != null) {
                    throw new ConflictException("User already exists with id: " + user.getId());
                }
                existingUser.setUsername(user.username);
                batchCreatedUsers.put(user.getId(), user.username);
            } else {
                User newUser = new User();
                newUser.setId(user.getId());
                newUser.setUsername(user.username);
                db.add(newUser);
                batchCreatedUsers.put(user.getId(), user.username);
            }
        }
        return new ResponseEntity<Resource<Map<User, String>>>(
            batchCreatedUsers,
            "Create users in batch"
        );
    }

    // Cleanup method (part of UserController)
    @GetMapping("/api/users/cleanup")
    public Resource<Map<String, String>> cleanup(@Nullable String[] ids) {
        Map<String, String> result = new HashMap<>();
        for (String id : ids) {
            User user = db.query(User::id).filter(u -> u.getId().equals(id)).findFirst();
            if (user != null) {
                try {
                    db.delete(user);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                result.put(id, user);
            }
        }
        return new ResponseEntity<Map<String, String>>(result, "Clean up users");
    }
}

