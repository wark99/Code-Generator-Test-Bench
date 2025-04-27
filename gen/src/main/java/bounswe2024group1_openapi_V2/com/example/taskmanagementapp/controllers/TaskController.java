package com.example.taskmanagementapp.controllers;

import com.example.taskmanagementapp.models.Task;
import com.example.taskmanagementapp.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public String listTasks(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        return "tasks/list"; // Assuming you have a "tasks/list.html" view
    }

    @GetMapping("/tasks/add")
    public String addTaskForm(Model model) {
        model.addAttribute("task", new Task());
        return "tasks/add";
    }

    @PostMapping("/tasks")
    public String saveTask(@ModelAttribute Task task) {
        taskService.saveTask(task);
        return "redirect:/tasks"; // Redirect back to the task list
    }

    @GetMapping("/tasks/{id}")
    public String getTask(@PathVariable Long id, Model model) {
        Task task = taskService.getTaskById(id);
        if (task != null) {
            model.addAttribute("task", task);
            return "tasks/view";
        } else {
            return "404"; // Or handle the not found case appropriately
        }
    }

    @GetMapping("/tasks/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/tasks";
    }
}

