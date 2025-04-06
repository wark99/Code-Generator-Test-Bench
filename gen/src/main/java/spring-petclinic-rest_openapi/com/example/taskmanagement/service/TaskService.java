package com.example.taskmanagement.service;

import java.util.ArrayList;
import java.util.List;

import com.example.taskmanagement.model.Task;

public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    public TaskService() {
        // Initialize with some sample tasks (for demonstration)
        Task task1 = new Task("Grocery Shopping", "Buy milk, eggs, bread", false);
        Task task2 = new Task("Pay Bills", "Electricity, Water, Internet", true);
        tasks.add(task1);
        tasks.add(task2);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public void saveTask(Task task) {
        tasks.add(task);
    }

    public Task getTaskById(Long id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public void updateTask(Task task) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == task.getId()) {
                tasks.set(i, task);
                return;
            }
        }
    }

    public void deleteTask(Long id) {
        tasks.removeIf(task -> task.getId() == id);
    }
}

