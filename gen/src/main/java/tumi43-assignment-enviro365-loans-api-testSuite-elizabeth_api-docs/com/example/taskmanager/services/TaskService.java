package com.example.taskmanager.services;

import com.example.taskmanager.models.Task;
import com.example.taskmanager.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    public Task updateTask(Long id, String title, String description, String dueDate) {
        Task task = taskRepository.findById(id);
        if (task != null) {
            task.setTitle(title);
            task.setDescription(description);
            task.setDueDate(dueDate);
            return task;
        }
        return null; // Task not found
    }
}

