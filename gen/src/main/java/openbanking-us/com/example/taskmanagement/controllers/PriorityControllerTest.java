package com.example.taskmanagement.controllers;

import org.junit.jupiter.api.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilder;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndViewaddObject;

class PriorityControllerTest {

    @Autowired
    private PriorityController priorityController;

    @Test
    void listPriorities() throws Exception {
        MockMvc mockMvc = MockMvcBuilder.standaloneSetup(priorityController)
                .setViewNames("priorities")
                .build();

        mockMvc.perform(get("/priorities"))
                .andExpect(status().isOk())
                .andExpect(view().name("priorities"));
    }
}

