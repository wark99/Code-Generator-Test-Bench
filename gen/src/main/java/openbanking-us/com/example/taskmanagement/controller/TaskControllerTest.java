package com.example.taskmanagement.controller;

import com.example.taskmanagement.model.Task;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskControllerTest {

    private TaskController controller = new TaskController();

    @BeforeEach
    public void setUp() {
        // Reset tasks before each test
        controller.getAllTasks().clear();
    }

    @Test
    public void addTask_taskAdded() {
        Task task = new Task(1, "Grocery Shopping", "To Do", new Date());
        Task addedTask = controller.addTask(task);
        assertEquals(addedTask, addedTask);
        assertTrue(controller.getAllTasks().contains(addedTask));
    }

    @Test
    public void getTaskById_taskFound() {
        Task task = new Task(1, "Grocery Shopping", "To Do", new Date());
        controller.addTask(task);
        Task retrievedTask = controller.getTaskById(1);
        assertNotNull(retrievedTask);
        assertEquals("Grocery Shopping", retrievedTask.getDescription());
        assertEquals("To Do", retrievedTask.getStatus());
    }

    @Test
    public void updateTask_taskUpdated() {
        Task task = new Task(1, "Grocery Shopping", "To Do", new Date());
        controller.addTask(task);
        controller.updateTask(1, "Buy Milk", "In Progress", new Date());
        Task updatedTask = controller.getTaskById(1);
        assertEquals("Buy Milk", updatedTask.getDescription());
        assertEquals("In Progress", updatedTask.getStatus());
    }

    @Test
    public void deleteTask_taskDeleted() {
        Task task = new Task(1, "Grocery Shopping", "To Do", new Date());
        controller.addTask(task);
        controller.deleteTask(1);
        assertFalse(controller.getAllTasks().contains(task));
    }
}

