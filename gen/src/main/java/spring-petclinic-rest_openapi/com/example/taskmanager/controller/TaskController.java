package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskController {

    private List<Task> tasks = new ArrayList<>();

    public Task createTask(String description, String status, java.util.Date dueDate) {
        int id = tasks.size() + 1; // Simple ID generation
        Task newTask = new Task(id, description, status, dueDate);
        tasks.add(newTask);
        return newTask;
    }

    public Task getTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null; // Task not found
    }

    public void updateTask(int id, String newDescription, String newStatus, java.util.Date newDueDate) {
        Task task = getTaskById(id);
        if (task != null) {
            task.setDescription(newDescription);
            task.setStatus(newStatus);
            task.setDueDate(newDueDate);
        }
    }

    public void deleteTask(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                return;
            }
        }
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks); // Return a copy to prevent external modification
    }
}

