package com.example.demo.service.impl;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private Map<Integer, User> userMap = new HashMap<>();
    private int nextId = 1;

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public User createUser(User user) {
        user.setId(nextId++);
        userMap.put(user.getId(), user);
        return user;
    }

    @Override
    public User getUserById(int id) {
        return userMap.get(id);
    }

    @Override
    public User updateUser(int id, User user) {
        if (userMap.containsKey(id)) {
            user.setId(id);
            userMap.put(id, user);
            return user;
        }
        return null;
    }

    @Override
    public boolean deleteUser(int id) {
        return userMap.remove(id) != null;
    }
}

