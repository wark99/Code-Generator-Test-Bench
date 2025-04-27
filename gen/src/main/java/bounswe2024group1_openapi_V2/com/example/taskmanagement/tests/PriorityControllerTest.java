package com.example.taskmanagement.tests;

import com.example.taskmanagement.controllers.PriorityController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockedOperation;
import org.springframework.boot.test.mock.mockito.MockOperation;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockOperations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PriorityControllerTest {

    @Autowired
    private PriorityController priorityController;

    @MockBean
    private PriorityService priorityService;

    @BeforeEach
    void setUp() {
        priorityController = new PriorityController(priorityService);
    }

    @Test
    void getAllPriorities() {
        List<Priority> priorities = Arrays.asList(new Priority("High"), new Priority("Medium"));
        when(priorityService.getAllPriorities()).thenReturn(priorities);
        List<Priority> result = priorityController.getAllPriorities();
        assertEquals(2, result.size());
        assertEquals("High", result.get(0).getName());
        assertEquals("Medium", result.get(1).getName());
    }

    @Test
    void createPriority() {
        Priority newPriority = new Priority("Low");
        when(priorityService.createPriority(newPriority)).thenReturn(newPriority);
        Priority result = priorityController.createPriority(newPriority);
        assertEquals("Low", result.getName());
    }

    @Test
    void getPriorityById() {
        Priority existingPriority = new Priority("Medium");
        when(priorityService.getPriorityById(1L)).thenReturn(existingPriority);
        Priority result = priorityController.getPriorityById(1L);
        assertEquals("Medium", result.getName());
    }

    @Test
    void updatePriority() {
        Priority existingPriority = new Priority("Medium");
        when(priorityService.getPriorityById(1L)).thenReturn(existingPriority);
        when(priorityService.createPriority(existingPriority)).thenReturn(existingPriority);
        Priority updatedPriority = new Priority("High");
        Priority result = priorityController.updatePriority(1L, updatedPriority);
        assertEquals("High", result.getName());
    }

    @Test
    void deletePriority() {
        priorityController.deletePriority(1L);
        verify(priorityService, MockOperations.CALL_CONVENTION).deletePriority(1L);
    }
}

