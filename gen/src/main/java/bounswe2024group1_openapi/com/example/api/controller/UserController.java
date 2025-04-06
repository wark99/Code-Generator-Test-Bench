package com.example.api.controller;

import com.example.api.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {
        // Dummy data for demonstration
        return List.of(new User(1L, "John Doe"), new User(2L, "Jane Smith"));
    }
}

