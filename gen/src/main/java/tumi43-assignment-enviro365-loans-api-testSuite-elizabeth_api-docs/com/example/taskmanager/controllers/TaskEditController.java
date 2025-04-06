package com.example.taskmanager.controllers;

import com.example.taskmanager.models.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/task-edit")
public class TaskEditController {

    @GetMapping
    public String editTask(Model model, @RequestParam("id") Long taskId) {
        // Retrieve the task from the database (or wherever you store tasks)
        // This is a placeholder - replace with your actual retrieval logic
        Task task = retrieveTaskById(taskId);

        if (task == null) {
            return "error"; // Or handle the error appropriately
        }

        // Pass the task to the view
        model.addAttribute("task", task);

        return "task-edit"; // Assuming you have a task-edit.jsp view
    }

    @PostMapping
    public String saveTask(Task task, Model model) {
        // Save the updated task to the database
        // This is a placeholder - replace with your actual save logic
        saveTaskToDatabase(task);

        // Redirect to the task details page or a success page
        return "redirect:/task/" + task.getId(); // Example: Redirect to task details
    }

    // Placeholder methods - replace with your actual database interaction
    private Task retrieveTaskById(Long taskId) {
        // Replace with your database retrieval logic
        // Example:
        // Task task = taskRepository.findById(taskId);
        return new Task(taskId, "Updated Task Name", "Updated Description");
    }

    private void saveTaskToDatabase(Task task) {
        // Replace with your database saving logic
        // Example:
        // taskRepository.save(task);
    }
}

