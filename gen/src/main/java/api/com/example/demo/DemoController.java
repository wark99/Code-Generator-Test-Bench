package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class DemoController {

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        // Simulating a database fetch
        return new User(id, "John Doe", 30);
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user) {
        // Simulating creating a new user
        return user;
    }
}

