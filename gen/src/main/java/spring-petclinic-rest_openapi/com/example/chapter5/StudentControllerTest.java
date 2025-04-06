package com.example.chapter5;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.test.autoconfigure.web.servlet.MockMvc;
import org.springframework.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvcResult;
import com.example.chapter5.StudentController;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StudentControllerTest {

    @BeforeEach
    void setUp() {
        SpringApplication.add(Singleton.class).start();
        // Mock EasyMock classes
    }

    @Autowired
    private String[] args;
    
    @Test
    public void testCreateStudent_ReturnsNewStudent() throws Exception {
        mockMvc.perform(post("/students", "John", 20, "Doe"));
        assertEquals(HTMLObj, args[0]);
        assertNotNull(args[1], "Expected JSON response");
        
        // Verify if the student was created
    }
}

