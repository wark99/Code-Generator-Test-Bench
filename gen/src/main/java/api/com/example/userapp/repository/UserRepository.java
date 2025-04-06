package com.example.userapp.repository;

import com.example.userapp.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    private List<User> users = new ArrayList<>();

    public User save(User user) {
        if (user.getId() == null) {
            user.setId((long) (users.size() + 1));
        }
        users.removeIf(u -> u.getId().equals(user.getId()));
        users.add(user);
        return user;
    }

    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    public Optional<User> findById(Long id) {
        return users.stream()
                    .filter(user -> user.getId().equals(id))
                    .findFirst();
    }

    public void deleteById(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}

