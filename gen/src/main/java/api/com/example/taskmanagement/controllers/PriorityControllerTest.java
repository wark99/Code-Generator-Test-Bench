package com.example.taskmanagement.controllers;

import com.example.taskmanagement.models.Priority;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

public class PriorityControllerTest {

    private PriorityController controller;
    private PriorityService service;
    @Mock
    private PriorityRepository repository;

    @BeforeEach
    void setUp() {
        controller = new PriorityController(service, repository);
        service = new PriorityService();
    }

    @Test
    void createPriority_returnsSuccessMessage() {
        String result = controller.createPriority("High");
        assertTrue(result.contains("Priority High created."));
    }

    @Test
    void updatePriority_returnsSuccessMessage() {
        String result = controller.updatePriority(1L, "Critical");
        assertTrue(result.contains("Priority 1 updated to Critical."));
    }

    @Test
    void deletePriority_returnsSuccessMessage() {
        String result = controller.deletePriority(1L);
        assertTrue(result.contains("Priority 1 deleted."));
    }
}

