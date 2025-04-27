package com.example.taskmanagement.controllers;

import com.example.taskmanagement.models.Task;
import com.example.taskmanagement.models.Priority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/priorities")
public class PriorityController {

    @Autowired
    private PriorityService priorityService;

    @GetMapping
    public List<Priority> getAllPriorities() {
        return priorityService.getAllPriorities();
    }

    @PostMapping
    public Priority createPriority(@RequestBody Priority priority) {
        return priorityService.createPriority(priority);
    }

    @GetMapping("/{id}")
    public Priority getPriorityById(@PathVariable Long id) {
        return priorityService.getPriorityById(id);
    }

    @PutMapping("/{id}")
    public Priority updatePriority(@PathVariable Long id, @RequestBody Priority priority) {
        return priorityService.updatePriority(id, priority);
    }

    @DeleteMapping("/{id}")
    public void deletePriority(@PathVariable Long id) {
        priorityService.deletePriority(id);
    }
}

