package com.example.taskmanagement.services;

import com.example.taskmanagement.models.Priority;
import com.example.taskmanagement.repositories.PriorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriorityService {

    @Autowired
    private PriorityRepository priorityRepository;

    public List<Priority> getAllPriorities() {
        return priorityRepository.findAll();
    }

    public Priority createPriority(Priority priority) {
        return priorityRepository.save(priority);
    }

    public Priority getPriorityById(Long id) {
        return priorityRepository.findById(id).orElse(null);
    }

    public Priority updatePriority(Long id, Priority priority) {
        Priority existingPriority = getPriorityById(id);
        if (existingPriority != null) {
            existingPriority.setName(priority.getName());
            return priorityRepository.save(existingPriority);
        }
        return null;
    }

    public void deletePriority(Long id) {
        priorityRepository.deleteById(id);
    }
}

