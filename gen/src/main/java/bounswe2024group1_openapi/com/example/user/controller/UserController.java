// src/main/java/com/example/user/controller/UserController.java

package com.example.user.controller;

import com.example.user.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  
  private final User userRepository;
  
  public UserController(User userRepository) {
    this.userRepository = userRepository;
  }
  
  @GetMapping("/users")
  public Iterable<User> getAllUsers() {
    return userRepository.findAll();
  }
  
  @GetMapping("/users/{id}")
  public User getUserById(@PathVariable Long id) {
    return userRepository.findById(id).orElseThrow();
  }
}

