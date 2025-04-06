package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong();

    public List<User> getAllUsers() {
        return users;
    }

    public User createUser(User user) {
        user.setId(idCounter.incrementAndGet());
        users.add(user);
        return user;
    }

    public User getUserById(Long id) {
        Optional<User> foundUser = users.stream().filter(u -> u.getId().equals(id)).findFirst();
        return foundUser.orElse(null);
    }

    public User updateUser(Long id, User userDetails) {
        Optional<User> foundUser = users.stream().filter(u -> u.getId().equals(id)).findFirst();
        if (foundUser.isPresent()) {
            User user = foundUser.get();
            user.setName(userDetails.getName());
            user.setEmail(userDetails.getEmail());
            return user;
        } else {
            return null;
        }
    }

    public void deleteUser(Long id) {
        users.removeIf(u -> u.getId().equals(id));
    }
}

