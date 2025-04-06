package com.example.taskmanagement.controllers;

import com.example.taskmanagement.models.Task;
import com.example.taskmanagement.models.Priority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class PriorityController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/priorities")
    public String listPriorities(Model model) {
        List<Priority> priorities = taskService.getAllPriorities();
        model.addAttribute("priorities", priorities);
        return "priorities"; // Assuming you have a "priorities.jsp" view
    }

    @ModelAttribute("priorities")
    public List<Priority> getPriorities() {
        return taskService.getAllPriorities();
    }
}

