// com.example.user.service.UserServiceImpl.java

package com.example.user.service;

import com.example.user.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    private List<User> users = new ArrayList<>();

    @Override
    public User getUserById(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User createUser(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User updateUser(Long id, User user) {
        for (User u : users) {
            if (u.getId().equals(id)) {
                u.setName(user.getName());
                u.setEmail(user.getEmail());
                u.setPassword(user.getPassword());
                break;
            }
        }
        return users.get(0);
    }

    @Override
    public void deleteUser(Long id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                users.remove(i);
                break;
            }
        }
    }
}

