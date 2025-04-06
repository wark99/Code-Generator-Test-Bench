package com.example.todo.service;

import com.example.todo.model.Task;
import java.util.List;
import java.util.Optional;

public interface TaskService {

    List<Task> getAllTasks();
    
    Optional<Task> getTaskById(Long id);
    
    Task createTask(Task task);

    Task updateTask(Long id, Task taskDetails);

    void deleteTask(Long id);
}

