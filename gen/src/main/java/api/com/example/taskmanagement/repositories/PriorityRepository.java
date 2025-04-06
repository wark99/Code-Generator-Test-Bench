package com.example.taskmanagement.repositories;

import com.example.taskmanagement.models.Priority;
import java.util.List;

public interface PriorityRepository {
    List<Priority> getAllPriorities();
    Priority getPriorityById(Long id);
    void savePriority(Priority priority);
    void deletePriority(Long id);
}

