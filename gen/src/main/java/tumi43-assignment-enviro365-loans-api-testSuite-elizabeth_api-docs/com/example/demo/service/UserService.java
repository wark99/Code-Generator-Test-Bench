package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    @Transactional
    public User createUser(User user) {
        users.add(user);
        return user;
    }

    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return users;
    }

    @Transactional(readOnly = true)
    public User getUserById(Long id) {
        Optional<User> userOptional = users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
        return userOptional.orElse(null);
    }

    @Transactional
    public User updateUser(Long id, User userDetails) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                users.set(i, userDetails);
                return userDetails;
            }
        }
        return null;
    }

    @Transactional
    public boolean deleteUser(Long id) {
        Optional<User> userOptional = users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
        if (userOptional.isPresent()) {
            users.remove(userOptional.get());
            return true;
        }
        return false;
    }
}

