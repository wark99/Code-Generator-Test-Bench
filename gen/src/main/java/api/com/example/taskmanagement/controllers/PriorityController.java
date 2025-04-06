package com.example.taskmanagement.controllers;

import com.example.taskmanagement.models.Task;
import com.example.taskmanagement.models.Priority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PriorityController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/task/priority")
    public String taskPriority(Model model) {
        model.addAttribute("task", new Task()); // Provide a default Task object
        return "task_priority"; // Render the view
    }

    @PostMapping("/task/priority")
    public String updatePriority(Model model, @ModelAttribute("task") Task task) {
        taskService.updatePriority(task);
        return "redirect:/task/" + task.getId(); // Redirect to the task detail page
    }
}

