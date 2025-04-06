package com.example.taskmanagementapp.controllers;

import com.example.taskmanagementapp.models.Task;
import com.example.taskmanagementapp.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tasks") // Base URL for tasks
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String listTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks/list"; // Assuming you have a "tasks/list.html" view
    }

    @GetMapping("/create")
    public String createTaskForm(Model model) {
        model.addAttribute("task", new Task()); // Create a new Task object
        return "tasks/create";
    }

    @PostMapping("/save")
    public String saveTask(Task task) {
        taskService.saveTask(task);
        return "redirect:/tasks/"; // Redirect to the list page
    }

    @GetMapping("/{id}")
    public String showTask(@PathVariable Long id, Model model) {
        Task task = taskService.getTaskById(id);
        if (task != null) {
            model.addAttribute("task", task);
            return "tasks/show";
        } else {
            return "404"; // Or handle the not found case appropriately
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/tasks/";
    }
}

