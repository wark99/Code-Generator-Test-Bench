package com.example.taskmanagement.controller;

import com.example.taskmanagement.model.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

class TaskControllerTest {

    private TaskController taskController;
    private TaskService taskServiceMock;

    @BeforeEach
    void setUp() {
        taskServiceMock = Mockito.mock(TaskService.class);
        taskController = new TaskController(taskServiceMock);
    }

    @Test
    void listTasks() {
        // Mock the task service to return some tasks
        Mockito.when(taskServiceMock.getAllTasks()).thenReturn(List.of(new Task("Task 1", "Description 1", false)));

        // Call the method being tested
        String result = taskController.listTasks(null);

        // Assert that the result is the correct view name
        assertEquals("tasks/list", result);
    }

    @Test
    void addTaskForm() {
        String result = taskController.addTaskForm(null);
        assertEquals("tasks/add", result);
    }

    @Test
    void saveTask() {
        // No assertions needed for saveTask, as it modifies the task service
        taskController.saveTask(new Task("New Task", "Description", false));
        // Verify that the task service was called
        Mockito.verify(taskServiceMock, Mockito.times(1)).saveTask(Mockito.any(Task.class));
    }

    @Test
    void getTask() {
        // Mock the task service to return a task
        Mockito.when(taskServiceMock.getTaskById(1L)).thenReturn(new Task("Task 1", "Description 1", false));

        String result = taskController.getTask(1L, null);
        assertEquals("tasks/edit", result);
    }

    @Test
    void updateTask() {
        // Mock the task service to update the task
        Mockito.when(taskServiceMock.updateTask(Mockito.any(Task.class))).thenReturn(true);

        Task task = new Task("Updated Task", "New Description", true);
        String result = taskController.updateTask(1L, task);
        assertEquals("redirect:/tasks/", result);
        Mockito.verify(taskServiceMock, Mockito.times(1)).updateTask(Mockito.any(Task.class));
    }

    @Test
    void deleteTask() {
        // Mock the task service to delete the task
        Mockito.when(taskServiceMock.deleteTask(1L)).thenReturn(true);

        taskController.deleteTask(1L);
        Mockito.verify(taskServiceMock, Mockito.times(1)).deleteTask(Mockito.anyLong());
    }
}

