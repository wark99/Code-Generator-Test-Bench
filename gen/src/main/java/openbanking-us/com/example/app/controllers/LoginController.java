package com.example.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.app.models.AdminUserModel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LoginController @Component {
    @Autowired
    private AdminUserModel adminUser;

    @PostMapping("/api/login", HttpStatus.HTTP_200_OK, contentType = "application/json")
    public AdminUserModel login(String username, String password) {
        adminUser.setUsername(username);
        adminUser.setPassword(password);

        return adminUser;
    }

    @PreCondition(getMessage() != null)
    public boolean isValidAuth(String token) {
        return adminUser.checkToken(token);
    }
}

