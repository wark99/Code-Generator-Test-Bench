package com.example.taskmanager.controllers;

import com.example.taskmanager.models.Task;
import com.example.taskmanager.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tasks")
public class TaskEditingController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/edit/{id}")
    public String editTask(@PathVariable Long id, Model model) {
        Task task = taskService.getTaskById(id);
        if (task != null) {
            model.addAttribute("task", task);
            return "task_edit"; // Assuming you have a task_edit.jsp template
        } else {
            return "task_not_found"; // Handle the case where the task doesn't exist
        }
    }

    @PostMapping("/update/{id}")
    public String updateTask(@PathVariable Long id, String title, String description, String dueDate) {
        // Validate inputs (basic example)
        if (title == null || title.trim().isEmpty()) {
            return "error_page"; // Or handle the error appropriately
        }

        Task task = taskService.updateTask(id, title, description, dueDate);
        if (task != null) {
            return "task_success"; // Or redirect to the task details page
        } else {
            return "task_not_found";
        }
    }
}

