package com.example.taskmanagementapp.repositories;

import com.example.taskmanagementapp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<Task, Long> {
    // You can add custom queries here if needed.
}

