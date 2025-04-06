// Service.java

package com.example.crud.service;

import com.example.crud.model.Person;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final CRUDRepository crudRepository;

    public UserService(CRUDRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    // Add methods for business logic operations here...
}

