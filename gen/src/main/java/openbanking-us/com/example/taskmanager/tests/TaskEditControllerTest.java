package com.example.taskmanager.tests;

import com.example.taskmanager.controllers.TaskEditController;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.ui.WebContentResult;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class TaskEditControllerTest {

    @Test
    void editTask_returnsCorrectView() {
        // Arrange
        Long taskId = 1L;

        // Act
        TaskEditController controller = new TaskEditController();
        ModelAndView result = controller.editTask(taskId, null);

        // Assert
        assertEquals("task-edit", result.getViewName());
    }
}

