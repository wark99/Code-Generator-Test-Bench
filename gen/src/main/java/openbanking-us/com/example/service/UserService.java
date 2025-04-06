// UserService.java

package com.example.service;

import com.example.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    public UserService() {
        // Initialize users with some sample data
        for (int i = 0; i < 10; i++) {
            User user = new User(i, "User " + i, "user" + i + "@example.com", "password");
            users.add(user);
        }
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserById(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public User createUser(User user) {
        // Add new user to the list
        int id = Math.max(1, getNewId()) + 1;
        user.setId(id);
        users.add(user);
        return user;
    }

    public User updateUser(Long id, User user) {
        for (User u : users) {
            if (u.getId().equals(id)) {
                // Update existing user
                u.setName(user.getName());
                u.setEmail(user.getEmail());
                u.setPassword(user.getPassword());
                break;
            }
        }
        return null;
    }

    public void deleteUser(Long id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                users.remove(i);
                break;
            }
        }
    }

    private int getNewId() {
        Random random = new Random();
        return random.nextInt(1000000) + 1;
    }
}

