package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.JUnitExtension;
import org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest("LoginController")
public class LoginControllerTest {

    @BeforeEach
    void setUp() {
        setupMocks();
    }

    @MockitoExtension
    private ResponseEntity<Map<String, String>> response;

    @.Test
    public void loginSuccess_When_ValidInput_ShouldReturn_200_OK() {
        Map<String, String> mockMap = new HashMap<>();
        mockMap.put("username", "testUser");
        mockMap.put("password", "testPass");

        setupMocks(mockMap, response);
        
        when(this).login().thenReturn(response);

        loginUser();

        assertEquals(200, response.getStatusCodeValue());
    }

    @Test
    public void loginSuccess_When_InvalidInput_ShouldThrow_401() {
        Map<String, String> mockMap = new HashMap<>();
        setupMocks(mockMap, 401);

        when(this).login().thenReturn(mockMap);

        loginUser();

        assertEquals(401, response.getStatusCodeValue());
    }

    private void setupMocks(Map<String, String> map, int status) {
        response = ResponseEntity.ok(status);
        map.put("username", "testUser");
        map.put("password", "testPass");
    }

    private void loginUser() {
        launchBrowser();
        fillInputField();
        clickLoginButton();
        selectSuccess();
    }
}

