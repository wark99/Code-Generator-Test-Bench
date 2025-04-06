package com.example.taskmanagement.services;

import com.example.taskmanagement.models.Priority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PriorityService {

    @Autowired
    private PriorityRepository priorityRepository;

    public List<Priority> getAllPriorities() {
        List<Priority> priorities = new ArrayList<>();
        for (Priority priority : priorityRepository.findAll()) {
            priorities.add(priority);
        }
        return priorities;
    }
}

