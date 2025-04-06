package com.example.taskmanagement.test;

import com.example.taskmanagement.controller.TaskController;
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
    void getTaskById_returnsTask() {
        TaskController controller = new TaskController();
        Task newTask = controller.createTask("Clean Room", "To Do", new Date());
        Task retrievedTask = controller.getTaskById(1);
        assertNotNull(retrievedTask);
        assertEquals("Clean Room", retrievedTask.getDescription());
        assertEquals("To Do", retrievedTask.getStatus());
    }

    @Test
    void getTaskById_returnsNullIfNotFound() {
        TaskController controller = new TaskController();
        Task retrievedTask = controller.getTaskById(99);
        assertNull(retrievedTask);
    }

    @Test
    void updateTask_updatesTask() {
        TaskController controller = new TaskController();
        Task newTask = controller.createTask("Wash Car", "To Do", new Date());
        controller.updateTask(1, "Detail Car", "In Progress", new Date());
        Task updatedTask = controller.getTaskById(1);
        assertNotNull(updatedTask);
        assertEquals("Detail Car", updatedTask.getDescription());
        assertEquals("In Progress", updatedTask.getStatus());
    }

    @Test
    void deleteTask_deletesTask() {
        TaskController controller = new TaskController();
        Task newTask = controller.createTask("Pay Bills", "To Do", new Date());
        controller.deleteTask(1);
        List<Task> tasks = controller.getAllTasks();
        assertEquals(0, tasks.size());
    }
}

