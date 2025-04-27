package com.example.taskmanagementapp.controllers;

import com.example.taskmanagementapp.models.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.test.web.ModelAndViewaddObjectTester;

import java.util.Arrays;
import java.util.List;

class TaskControllerTest {

    @org.springframework.beans.factory.annotation.Autowired
    private TaskController taskController;

    @org.springframework.beans.factory.annotation.Autowired
    private TaskService taskService;

    @BeforeEach
    void setUp() {
        // Mock the TaskService
        TaskService mockTaskService = Mockito.mock(TaskService.class);
        TaskController controller = new TaskController(mockTaskService);
    }

    @Test
    void listTasks() {
        // Arrange
        Task task1 = new Task("Task 1", "Description 1");
        Task task2 = new Task("Task 2", "Description 2");

        Mockito.when(taskService.getAllTasks()).thenReturn(Arrays.asList(task1, task2));

        // Act & Assert
        String result = taskController.listTasks(null);
        System.out.println(result);
        // Add assertions here to verify the view is rendered correctly.
    }

    @Test
    void saveTask() {
        // Arrange
        Task task = new Task("New Task", "New Description");

        // Act
        // Assert
        // Add assertions here to verify the task is saved correctly.
    }
}

