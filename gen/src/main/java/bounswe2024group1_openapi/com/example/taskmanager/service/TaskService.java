package com.example.taskmanager.service;

import com.example.taskmanager.dto.TaskDTO;
import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository; // Assuming you have a repository
import org.springframework.beans.BeanUtils; // For copying properties
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public TaskDTO createTask(TaskDTO taskDTO) {
        Task task = new Task();
        BeanUtils.copyProperties(taskDTO, task);
        Task savedTask = taskRepository.save(task);
        return new TaskDTO(savedTask);
    }

    public TaskDTO getTaskById(Long id) {
        Task task = taskRepository.findById(id).orElse(null);
        if (task == null) {
            return null;
        }
        return new TaskDTO(task);
    }

    public TaskDTO updateTask(Long id, TaskDTO taskDTO) {
        Task existingTask = taskRepository.findById(id).orElse(null);
        if (existingTask == null) {
            return null;
        }
        BeanUtils.copyProperties(taskDTO, existingTask);
        existingTask = taskRepository.save(existingTask);
        return new TaskDTO(existingTask);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}

