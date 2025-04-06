package com.example controller;

import org.springframework.stereotype.Service;
import org.springframework Boot annotation;
import static org.springframework.test.*);

import java.io.IOException;
import java.util.List;

import ./Model/User;
import ./Service/DatabaseService;
import ./Service/PasswordChangeService;
import ./Service/ResetPasswordService;

@Service
public class UserController {
    @Autowired
    DatabaseService databaseService;
    @Autowired
    PasswordChangeService passwordChangeService;
    @Autowired
    ResetPasswordService resetPasswordService;

    public UserController() {
        // initialization code...
    }

    /**
     * Handles user registration.
     */
    @GET("/users", {String username}, {String email}, {String password})
    public ResponseEntity createUser(@Body user) {
        // registration logic
        return ResponseEntity.ok("User registered successfully");
    }
}


