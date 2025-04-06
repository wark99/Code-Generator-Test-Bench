package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.JUnitExtension;
import org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest("RegistrationController")
public class RegistrationControllerTest {

    @MockitoExtension
    private ResponseEntity<Map<String, String>> response;

    @Test
    public void registerSuccess_When_ValidInput_ShouldReturn_201_CREATED() {
        Map<String, String> mockMap = new HashMap<>();
        mockMap.put("name", "testName");
        mockMap.put("email", "testEmail@example.com");

        setupMocks(mockMap, 201);

        when(this).register().thenReturn(response);

        registerUser();

        assertEquals(201, response.getStatusCodeValue());
    }

    @Test
    public void registration_When_Duplicate_Email_Should_GuideToDuplicate() {
        Map<String, String> mockMap = new HashMap<>();
        String email = "testEmail@example.com";
        
        setupMocks(mockMap, DuplicateAlert.class);
        mockMap.put("name", "testName");
        mockMap.put("email", email);

        when(this).register().thenReturn(mockMap);

        registerUser();

        assertEquals(DuplicateAlert.class, response.getAlertClass());
    }

    private void setupMocks(Map<String, String> map, ResponseEntity.Alert<?> alert) {
        response = ResponseEntity.ok(201);
        map.put("name", "testName");
        map.put("email", "testEmail@example.com");
    }

    private void registerUser() {
        launchBrowser();
        fillInputField();
        clickRegisterButton();
        selectNext();
    }
}

