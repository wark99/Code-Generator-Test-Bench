package com.example.taskmanager.controllers;

import com.example.taskmanager.models.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/task-edit") // URL path for this controller
public class TaskEditController {

    @GetMapping
    public String editTask(@RequestParam("id") Long taskId, Model model) {
        // Retrieve the task from the database based on the ID
        // (Assume you have a method to fetch tasks by ID)
        Task task = taskService.getTaskById(taskId); // Replace with your actual retrieval method

        if (task == null) {
            return "error"; // Handle the case where the task doesn't exist
        }

        model.addAttribute("task", task); // Pass the task to the view
        return "task-edit"; // Render the task-edit view
    }

    // (Optional)  Add a method to handle the form submission and update the task.
    // This would involve a POST request to this controller.
}

