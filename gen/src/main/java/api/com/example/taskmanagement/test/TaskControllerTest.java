package com.example.taskmanagement.test;

import com.example.taskmanagement.controller.TaskController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskControllerTest {

    @Test
    void createTask_returnsSuccessMessage() {
        TaskController controller = new TaskController();
        String result = controller.createTask("Grocery Shopping", "Buy milk, eggs, and bread");
        assertTrue(result.contains("Task created successfully!"));
    }

    @Test
    void markComplete_marksTaskAsComplete() {
        TaskController controller = new TaskController();
        String result = controller.markComplete(1);
        assertTrue(result.contains("Task 1 marked as complete."));
    }

    @Test
    void listTasks_returnsAllTasks() {
        TaskController controller = new TaskController();
        controller.createTask("Task 1", "Description 1");
        controller.createTask("Task 2", "Description 2");
        String result = controller.listTasks();
        assertTrue(result.contains("Task{id=1, title='Task 1', description='Description 1', completed=false, createdAt=...}"));
        assertTrue(result.contains("Task{id=2, title='Task 2', description='Description 2', completed=false, createdAt=...}"));
    }

    @Test
    void deleteTask_deletesTask() {
        TaskController controller = new TaskController();
        controller.createTask("Task 1", "Description 1");
        String result = controller.deleteTask(1);
        assertTrue(result.contains("Task 1 deleted successfully."));
        // Verify that the task is actually removed
        assertFalse(controller.listTasks().contains("Task{id=1, title='Task 1', description='Description 1', completed=false, createdAt=...}"));
    }
}

