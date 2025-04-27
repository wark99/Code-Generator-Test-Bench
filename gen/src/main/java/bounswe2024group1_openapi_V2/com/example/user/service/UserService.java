// com.example.user.service.UserService.java

package com.example.user.service;

import com.example.user.model.User;
import java.util.List;

public interface UserService {

    User getUserById(Long id);

    List<User> getAllUsers();

    User createUser(User user);

    User updateUser(Long id, User user);

    void deleteUser(Long id);
}

