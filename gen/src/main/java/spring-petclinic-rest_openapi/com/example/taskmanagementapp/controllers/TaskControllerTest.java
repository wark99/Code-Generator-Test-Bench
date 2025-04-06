package com.example.taskmanagementapp.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
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
    void getTaskById_existingTask() {
        // Mock the taskService to return a mock task
        Task mockTask = new Task(1L, "Buy groceries", 1L);
        Mockito.when(taskServiceMock.getTaskById(1L)).thenReturn(mockTask);

        // Call the method
        ResponseEntity<Task> response = taskController.getTask(1L);

        // Assertions
        org.assertj.core.api.Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        org.assertj.core.api.Assertions.assertThat(response.getBody()).isEqualTo(mockTask);
    }

    @Test
    void getTaskById_taskNotFound() {
        Mockito.when(taskServiceMock.getTaskById(1L)).thenThrow(new TaskNotFoundException(1L));

        ResponseEntity<Void> response = taskController.getTask(1L);

        org.assertj.core.api.Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }

    @Test
    void createTask_success() {
        Task newTask = new Task(null, "New Task", 1L);
        Mockito.when(taskServiceMock.createTask(newTask)).thenReturn(newTask);

        ResponseEntity<Task> response = taskController.createTask(newTask);

        org.assertj.core.api.Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        org.assertj.core.api.Assertions.assertThat(response.getBody()).isEqualTo(newTask);
    }
}

