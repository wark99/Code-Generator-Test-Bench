package com.example services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private @Data User user;

    @ServiceMethod
    public User createUser(@Data User user) {
        return user;
    }

    @ServiceMethod
    public List<User> getUsers() {
        // Implement method to get all users from database
        return Collections.emptyList();
    }

    @ServiceMethod
    public void updateUser(@Put Map<String, Object> parameters, @Data User user) {
        if (parameters.containsKey("name")) {
            user.setName(parameters.get("name"));
        }
        if (parameters.containsKey("email")) {
            user.setEmail(parameters.get("email"));
        }
        // Handle other properties as needed
    }

    @ServiceMethod
    public void deleteUser(@Data User user) {
        user.remove();
    }

    @ServiceMethod
    public void updateUserisActive(@Put Boolean isActive, @Data User user) {
        if (isActive) {
            user.setActive(true);
        } else {
            user.setActive(false);
        }
    }
}

