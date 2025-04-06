// src/main/java/com/example/user/service/UserService.java

package com.example.user.service;

import com.example.user.model.User;
import com.example.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  
  private final UserRepository userRepository;
  
  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }
  
  public Iterable<User> getAllUsers() {
    return userRepository.findAll();
  }
  
  public User getUserById(Long id) {
    return userRepository.findById(id).orElseThrow();
  }
}

