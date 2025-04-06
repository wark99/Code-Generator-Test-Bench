package com.example.taskmanager.tests;

import com.example.taskmanager.controllers.TaskEditingController;
import com.example.taskmanager.models.Task;
import com.example.taskmanager.services.TaskService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class TaskEditingControllerTests {

    @Autowired
    private TaskService taskService; // Mocked in the test

    @BeforeEach
    void setUp() {
        // Mock the TaskService -  This is crucial for testing without a real database.
        taskService = Mockito.mock(TaskService.class);
    }

    @Test
    void editTask_returnsTask_whenTaskExists() {
        // Arrange
        Long taskId = 1L;
        Task task = new Task(taskId, "Original Title", "Original Description", "2024-12-31");

        Mockito.when(taskService.getTaskById(taskId)).thenReturn(task);

        // Act
        MockMvc mockMvc = Mockito.mockMvc();
        MockMvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/tasks/edit/" + taskId))
                .andExpect(status().isOk());

        // Assert
        Mockito.verify(taskService, Mockito.never()).updateTask(taskId, anyString(), anyString(), anyString());
    }

    @Test
    void updateTask_updatesTask_whenSuccessful() {
        // Arrange
        Long taskId = 1L;
        String newTitle = "Updated Title";
        String newDescription = "Updated Description";

        Mockito.doNothing().when(taskService.updateTask(taskId, newTitle, newDescription, "2024-12-31"));

        // Act & Assert
        MockMvc mockMvc = Mockito.mockMvc();
        mockMvc.perform(MockMvcRequestBuilders.post("/tasks/update/" + taskId)
                .param("title", newTitle)
                .param("description", newDescription)
                .param("dueDate", "2024-12-31"))
                .andExpect(status().isOk());

        Mockito.verify(taskService, Mockito.never()).getTaskById(taskId);
    }
}

