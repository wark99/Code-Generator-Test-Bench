package com.example.taskmanagement.controller;

import com.example.taskmanagement.model.Task;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskControllerTest {

    @Test
    void createTask_returnsNewTask() {
        TaskController controller = new TaskController();
        Task newTask = controller.createTask("Grocery Shopping", "To Do", new Date());
        assertNotNull(newTask);
        assertEquals("Grocery Shopping", newTask.getDescription());
        assertEquals("To Do", newTask.getStatus());
    }

    @Test
    void updateTask_updatesTaskDetails() {
        TaskController controller = new TaskController();
        Task task = controller.createTask("Initial Task", "To Do", new Date());
        controller.updateTask(task.getId(), "Updated Task", "In Progress", new Date());
        assertEquals("Updated Task", task.getDescription());
        assertEquals("In Progress", task.getStatus());
    }

    @Test
    void deleteTask_removesTask() {
        TaskController controller = new TaskController();
        Task task = controller.createTask("Delete Me", "To Do", new Date());
        controller.deleteTask(task.getId());
        assertTrue(controller.getAllTasks().isEmpty());
    }

    @Test
    void getAllTasks_returnsAllTasks() {
        TaskController controller = new TaskController();
        Task task1 = controller.createTask("Task 1", "To Do", new Date());
        Task task2 = controller.createTask("Task 2", "In Progress", new Date());
        List<Task> tasks = controller.getAllTasks();
        assertEquals(2, tasks.size());
        assertTrue(tasks.contains(task1));
        assertTrue(tasks.contains(task2));
    }
}

