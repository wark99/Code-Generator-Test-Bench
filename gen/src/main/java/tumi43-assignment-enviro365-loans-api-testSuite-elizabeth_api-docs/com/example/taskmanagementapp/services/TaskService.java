package com.example.taskmanagementapp.services;

import com.example.taskmanagementapp.models.Task;
import com.example.taskmanagementapp.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public void saveTask(Task task) {
        taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}

