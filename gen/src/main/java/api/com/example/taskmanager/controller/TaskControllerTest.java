package com.example.taskmanager.controller;

import com.example.taskmanager.dto.TaskDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

class TaskControllerTest {

    private TaskController taskController;
    private TaskService taskService;
    private TaskRepository taskRepository; // Mock Repository

    @BeforeEach
    void setUp() {
        taskService = Mockito.mock(TaskService.class);
        taskRepository = Mockito.mock(TaskRepository.class);
        taskController = new TaskController(taskService);
    }

    @Test
    void createTask_success() {
        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setTitle("Grocery Shopping");
        taskDTO.setDescription("Buy milk, eggs, bread");
        taskDTO.setDueDate("2024-01-27");

        Mockito.when(taskService.createTask(taskDTO)).thenReturn(new TaskDTO());

        ResponseEntity<TaskDTO> response = taskController.createTask(taskDTO);

        assertNotNull(response.getBody());
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
    }

    @Test
    void getTask_success() {
        // Mock data for a task
        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setId(1L);
        taskDTO.setTitle("Test Task");
        taskDTO.setDescription("Test Description");
        taskDTO.setDueDate("2024-01-27");

        Mockito.when(taskService.getTaskById(1L)).thenReturn(taskDTO);

        ResponseEntity<TaskDTO> response = taskController.getTask(1L);

        assertNotNull(response.getBody());
        assertEquals(taskDTO, response.getBody());
    }
}

