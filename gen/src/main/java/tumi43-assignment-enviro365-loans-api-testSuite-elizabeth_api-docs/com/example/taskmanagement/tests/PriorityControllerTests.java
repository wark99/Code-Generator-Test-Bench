package com.example.taskmanagement.tests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.viewName;

@WebMvcTest(PriorityController.class)
public class PriorityControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void listPriorities_returnsCorrectView() {
        // Assuming you have a "priorities.jsp" view
        mockMvc.perform(get("/priorities"))
                .andExpect(status().isOk())
                .andExpect(viewName("priorities"));
    }
}

