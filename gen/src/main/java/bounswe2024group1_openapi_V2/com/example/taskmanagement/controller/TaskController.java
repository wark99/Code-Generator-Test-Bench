package com.example.taskmanagement.controller;

import com.example.taskmanagement.model.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskController {

    private List<Task> tasks = new ArrayList<>();

    public Task addTask(Task task) {
        tasks.add(task);
        return task;
    }

    public Task getTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null; // Task not found
    }

    public void updateTask(int id, String newDescription, String newStatus, Date newDueDate) {
        Task task = getTaskById(id);
        if (task != null) {
            task.setDescription(newDescription);
            task.setStatus(newStatus);
            task.setDueDate(newDueDate);
        }
    }

    public void deleteTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks); // Return a copy to prevent external modification
    }
}

