package com.example.taskmanager.models;

import java.time.LocalDateTime;

public class Task {
    private Long id;
    private String name;
    private LocalDateTime dueDate;
    // ... other fields (status, description, etc.)
    public Task(Long id, String name, LocalDateTime dueDate) {
        this.id = id;
        this.name = name;
        this.dueDate = dueDate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }
}

