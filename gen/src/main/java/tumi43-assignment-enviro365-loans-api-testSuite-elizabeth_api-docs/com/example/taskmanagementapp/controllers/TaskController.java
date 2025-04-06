package com.example.taskmanagementapp.controllers;

import com.example.taskmanagementapp.models.Task;
import com.example.taskmanagementapp.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tasks") // Base URL for all tasks endpoints
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("")
    public String listTasks(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        return "tasks/list"; // Assuming you have a "tasks/list.html" view
    }

    @GetMapping("/{id}")
    public String getTask(@PathVariable Long id, Model model) {
        Task task = taskService.getTaskById(id);
        if (task != null) {
            model.addAttribute("task", task);
            return "tasks/details"; // Assuming you have a "tasks/details.html" view
        } else {
            return "404"; // Or handle the not found case appropriately
        }
    }

    @PostMapping
    public String createTask(Task task) {
        taskService.saveTask(task);
        return "redirect:/tasks"; // Redirect back to the task list
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/tasks";
    }
}

