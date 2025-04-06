package com.example.taskmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.taskmanagement.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

