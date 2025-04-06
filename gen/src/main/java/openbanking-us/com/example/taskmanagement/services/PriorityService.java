package com.example.taskmanagement.services;

import com.example.taskmanagement.models.Priority;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PriorityService {

    // In a real application, you'd likely use a repository here
    // For simplicity, we'll just return a hardcoded list.
    public List<Priority> getAllPriorities() {
        return List.of(
                new Priority("High"),
                new Priority("Medium"),
                new Priority("Low")
        );
    }
}

