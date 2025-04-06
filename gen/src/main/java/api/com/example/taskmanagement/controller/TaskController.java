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

    public String markComplete(int taskId) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.setCompleted(true);
                return "Task " + taskId + " marked as complete.";
            }
        }
        return "Task " + taskId + " not found.";
    }

    public String listTasks() {
        StringBuilder sb = new StringBuilder();
        for (Task task : tasks) {
            sb.append(task).append("\n");
        }
        return sb.toString();
    }

    public String deleteTask(int taskId) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == taskId) {
                tasks.remove(i);
                return "Task " + taskId + " deleted successfully.";
            }
        }
        return "Task " + taskId + " not found.";
    }
}

