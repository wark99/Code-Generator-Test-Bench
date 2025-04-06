package com.example.taskmanagement.services;

import com.example.taskmanagement.models.Priority;
import java.util.ArrayList;
import java.util.List;

public class PriorityService {

    private List<Priority> priorities = new ArrayList<>();
    {
        priorities.add(new Priority(1L, "High"));
        priorities.add(new Priority(2L, "Medium"));
        priorities.add(new Priority(3L, "Low"));
    }

    public Priority getPriority(Long id) {
        return priorities.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void createPriority(String name) {
        Priority newPriority = new Priority(priorities.size() + 1L, name);
        priorities.add(newPriority);
    }

    public void updatePriority(Long id, String newName) {
        Priority priorityToUpdate = getPriority(id);
        if (priorityToUpdate != null) {
            priorityToUpdate.setName(newName);
        }
    }

    public void deletePriority(Long id) {
        priorities.removeIf(p -> p.getId().equals(id));
    }
}

