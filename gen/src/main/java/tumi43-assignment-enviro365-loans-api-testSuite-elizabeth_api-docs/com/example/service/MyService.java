package com.example.service;

import com.example.model.MyEntity;
import java.util.List;

public interface MyService {
    List<MyEntity> findAll();
    MyEntity findById(Long id);
    MyEntity save(MyEntity myEntity);
    void deleteById(Long id);
}

