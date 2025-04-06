// UserService.java

package com.example.service;

import java.util.List;
import java.util.Optional;

public interface UserService {
 
    List<User> getUsers();
    User getUserById(Long id);
    User createUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}

