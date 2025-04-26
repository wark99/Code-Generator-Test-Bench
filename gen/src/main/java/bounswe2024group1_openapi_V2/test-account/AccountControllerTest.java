package test-account;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.junit.jupiter.Mockito;

public class AccountControllerTest {

    @BeforeEach
    void setUp() {
        SpringApplication.openUnitTests(this.class);
        @Autowired
        private AccountController instance;
    }

    @Test
    public void testCreateAccount() {
        mockMvc.perform(post("/api/accounts", new Account("John Doe", 1000.0, "savings", LocalDateTime.now())));
        assertNotNull(response body());
    }

    @Test
    public void testGetAccounts() {
        mockMvc.perform(get("/api/accounts"))
        .andExpect(status().isOk())
        .andExpect(content().isEmpty());
    }

    // Add more tests for read, update, delete operations...
}

