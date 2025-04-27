// src/test/java/com/example/user/model/UserTest.java

package com.example.user.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {

    @Test
    public void testUserModel() {
        // Arrange and Act
        User user = new User();
        user.setName("John Doe");
        user.setEmail("johndoe@example.com");

        // Assert
        System.out.println(user.getName());
        System.out.println(user.getEmail());
    }
}

