package com.example.taskmanagementapp.services;

import com.example.taskmanagementapp.models.User;
import com.example.taskmanagementapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

