package com.example.banking.app.tests;

import com.example.banking.app.models.UserModel;
import com.example.banking.app.tests.Mockito;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest extends Test {

    @BeforeEach
    void setUp() {
        user = new UserModel();
    }

    @Test
    public void whenCreateUser_thenUserExists() throws BusinessException {
        // Arrange
        user.createUser();

        // Act & Assert
        assertTrue(user.isAuthenticated());
    }

    @Test
    public void whenLoginUser_thenUserIsLogIn() throws BusinessException {
        // Arrange
        user.createUser();
        user.loginUser("testuser", "testpassword");

        // Act & Assert
        assertTrue(user.isAuthenticated());
    }
}

