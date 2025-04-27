package com.yourcompany.resourcemangement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype>@RestController
import org.springframework Boot annotation @SpringBootApplication;

import static org.springframework.test.Mockito.*;

public class UserController {
    @Autowired
    private List<User> users;

    @GetMapping("/users")
    public List<User> listUsers() {
        return users;
    }
}

package com.yourcompany.resourcemangement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype>@RestController
import org.springframework Boot annotation @SpringBootApplication;

public class UserDetailController {
    @Autowired
    private User user;

    @GetMapping("/users/{id}")
    public User showUserById(String id) {
        return user;
    }
}

