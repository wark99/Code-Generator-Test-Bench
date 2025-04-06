package com.example.taskmanagement.services;

import com.example.taskmanagement.models.Task;
import com.example.taskmanagement.repositories.TaskRepository;

public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public void updatePriority(Task task) {
        task.setPriority(task.getPriority()); // Set the priority
        taskRepository.save(task); // Save the updated task
    }
}

