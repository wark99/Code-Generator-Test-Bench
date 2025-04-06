package com.example.taskmanagementapp.models;

import javax.validation.constraints.NotNull;

public class Task {
    private Long id;
    @NotNull(message = "Task name cannot be empty")
    private String name;
    private String description;
    private boolean completed;

    public Task() {
        // Default constructor - important for creating new Task objects
    }

    public Task(Long id, String name, String description, boolean completed) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

