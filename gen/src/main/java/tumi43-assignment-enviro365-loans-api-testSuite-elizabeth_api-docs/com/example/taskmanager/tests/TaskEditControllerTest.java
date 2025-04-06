package com.example.taskmanager.tests;

import com.example.taskmanager.controllers.TaskEditController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.ModelAndView;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardOnly;

@SuppressWarnings("deprecation")
public class TaskEditControllerTest {

    @Autowired
    @MockBean
    private TaskEditController controller;

    @Test
    public void editTask_returnsCorrectView() {
        // Arrange
        Long taskId = 1L;

        // Act
        ModelAndView result = controller.editTask(null, taskId);

        // Assert
        verify(controller, never()).saveTask(any(Task.class)); // Ensure saveTask isn't called yet
        assertEquals("task-edit", result.getViewName());
    }

    @Test
    public void saveTask_savesTaskToDatabase() {
        // Arrange
        Long taskId = 1L;
        Task task = new Task(taskId, "New Task Name", "New Description");

        // Act
        MockMvc mockMvc = MockMvc.setup(controller);
        mockMvc.perform(forwardOnly(String.format("/task-edit?id=%d", taskId)))
                .andDo(forwardOnly());

        // Assert
        verify(controller, times(1)).saveTask(eq(task));
    }
}

