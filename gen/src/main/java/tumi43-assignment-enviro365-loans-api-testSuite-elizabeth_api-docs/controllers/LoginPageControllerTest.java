package controllers;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity HTTP Status;

from .LoginPageController;

public class LoginPageControllerTest {

    @Test
    public void loginWithValidCredentials_Returns200() throws Exception {
        // Test that login with valid credentials returns 200 OK
    }

    @Test(expected = IOException.class)
    public void loginWithInvalidEmail_ReturnsException() throws Exception {
        // Test that login with invalid email throws an exception
    }
}

