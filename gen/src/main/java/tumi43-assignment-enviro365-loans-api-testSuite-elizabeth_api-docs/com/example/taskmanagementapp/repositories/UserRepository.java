package com.example.taskmanagementapp.repositories;

import com.example.taskmanagementapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
}

