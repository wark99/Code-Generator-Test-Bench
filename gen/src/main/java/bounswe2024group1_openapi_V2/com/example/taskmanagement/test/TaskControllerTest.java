package com.example.taskmanagement.test;

import com.example.taskmanagement.controller.TaskController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskControllerTest {

    @Test
    void createTask_returnsSuccessMessage() {
        TaskController controller = new TaskController();
        String result = controller.createTask("Grocery Shopping", "Buy milk, bread, and eggs");
        assertTrue(result.contains("Task created successfully!"));
    }

    @Test
    void getAllTasks_returnsAllTasks() {
        TaskController controller = new TaskController();
        controller.createTask("Task 1", "Description 1");
        controller.createTask("Task 2", "Description 2");
        List<Task> tasks = controller.getAllTasks();
        assertEquals(2, tasks.size());
        assertTrue(tasks.stream().anyMatch(task -> task.getTitle().equals("Task 1")));
        assertTrue(tasks.stream().anyMatch(task -> task.getTitle().equals("Task 2")));
    }

    @Test
    void markTaskComplete_updatesTaskStatus() {
        TaskController controller = new TaskController();
        controller.createTask("Task 1", "Description 1");
        controller.markTaskComplete(1);
        Task task = controller.getTaskById(1);
        assertTrue(task.isCompleted());
    }

    @Test
    void deleteTask_removesTask() {
        TaskController controller = new TaskController();
        controller.createTask("Task 1", "Description 1");
        controller.deleteTask(1);
        List<Task> tasks = controller.getAllTasks();
        assertEquals(0, tasks.size());
    }
}

