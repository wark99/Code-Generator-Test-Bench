package com.example.taskmanagement.controllers;

import com.example.taskmanagement.models.Task;
import com.example.taskmanagement.models.Priority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.taskmanagement.services.PriorityService;

@Controller
public class PriorityController {

    @Autowired
    private PriorityService priorityService;

    @GetMapping("/priorities")
    public String listPriorities(Model model) {
        model.addAttribute("priorities", priorityService.getAllPriorities());
        return "priorities"; // Assuming you have a "priorities.html" view
    }
}

