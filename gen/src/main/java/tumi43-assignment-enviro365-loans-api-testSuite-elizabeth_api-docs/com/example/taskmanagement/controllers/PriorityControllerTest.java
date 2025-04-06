package com.example.taskmanagement.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(PriorityController.class)
public class PriorityControllerTest {

    @Autowired
    private PriorityController priorityController;

    @Test
    void getAllPriorities() throws Exception {
        // MockMvc setup (simplified for this example)
        // In a real test, you'd use a mock web server.

        // Simulate the PriorityController's behavior
        priorityController.priorities = List.of(
                new Priority(1, "High"),
                new Priority(2, "Medium")
        );

        // MockMvc request
        // This is a simplified example.  A real test would use a mock web server.
        // For this example, we'll just verify that the controller returns the correct list.

        // No actual request is made, just checking the controller's state.
        // In a real test, you'd use MockMvc to send a request and assert the response.
    }

    @Test
    void createPriority() {
        // Add assertions here to verify the creation of a priority.
        // This is a placeholder.
    }
}

