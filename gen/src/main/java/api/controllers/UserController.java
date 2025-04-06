package controllers;
import java.io.*;
import java.util Krut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype>@SpringBootApplication;
import org.springframework.web.servlet.http.ResponseEntity;

import static org.springframework.test.web.servlet.MockMvc;

import static org.springframework.utils.automated.Automation;

import org.junit.jupiter.api.Test;

public class UserController {
    @Autowired
    private UserDAO userDao;

    public ResponseEntity<User> createUser(@RequestBody User user) {
        return userDao.createUser(user);
    }

    public ResponseEntity<User> getUserById(@RequestId rid) {
        return userDao.getUserById(rid);
    }

    public ResponseEntity<User> updateUser(@RequestId rid, @RequestBody User userDetails) {
        return userDao updateUser(rid, userDetails);
    }

    public ResponseEntity<User> deleteUser(@RequestId rid) {
        return userDao.deleteUser(rid);
    }
}

