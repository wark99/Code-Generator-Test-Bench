package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public User sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        User user = new User(1L, name, "example@example.com");
        return user;
    }
}

