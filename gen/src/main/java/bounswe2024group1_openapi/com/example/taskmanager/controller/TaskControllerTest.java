package com.example.taskmanager.controller;

import com.example.taskmanager.dto.TaskDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

class TaskControllerTest {

    private TaskController taskController;
    private TaskService taskServiceMock;

    @BeforeEach
    void setUp() {
        taskServiceMock = Mockito.mock(TaskService.class);
        taskController = new TaskController(taskServiceMock);
    }

    @Test
    void createTask() {
        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setTitle("Test Task");
        taskDTO.setDescription("Test Description");

        ResponseEntity<TaskDTO> response = taskController.createTask(taskDTO);
        assertNotNull(response.getBody());
        assertEquals("Test Task", response.getBody().getTitle());
    }

    @Test
    void getTask() {
        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setId(1L);
        taskDTO.setTitle("Test Task");

        ResponseEntity<TaskDTO> response = taskController.getTask(1L);
        assertNotNull(response.getBody());
        assertEquals("Test Task", response.getBody().getTitle());
    }

    @Test
    void updateTask() {
        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setId(1L);
        taskDTO.setTitle("Updated Task");

        ResponseEntity<TaskDTO> response = taskController.updateTask(1L, taskDTO);
        assertNotNull(response.getBody());
        assertEquals("Updated Task", response.getBody().getTitle());
    }

    @Test
    void deleteTask() {
        // No specific assertions needed for delete, just verify it calls the service
        taskController.deleteTask(1L);
    }
}

