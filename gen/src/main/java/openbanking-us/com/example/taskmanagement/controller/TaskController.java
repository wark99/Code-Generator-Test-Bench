package com.example.taskmanagement.controller;

import com.example.taskmanagement.model.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskController {

    private List<Task> tasks = new ArrayList<>();
    private int nextId = 1; // Simple ID generation

    public String createTask(String title, String description) {
        Task newTask = new Task(nextId++, title, description);
        tasks.add(newTask);
        return "Task created successfully! Task ID: " + newTask.getId();
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks); // Return a copy to prevent external modification
    }

    public Task getTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public void markTaskComplete(int id) {
        Task task = getTaskById(id);
        if (task != null) {
            task.setCompleted(true);
        }
    }

    public void deleteTask(int id) {
        for (int i = 0, count = tasks.size(); i < count; i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                return;
            }
        }
    }
}

