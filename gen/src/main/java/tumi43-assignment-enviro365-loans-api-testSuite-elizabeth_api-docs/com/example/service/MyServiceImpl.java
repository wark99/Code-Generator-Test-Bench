package com.example.service;

import com.example.model.MyEntity;
import com.example.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyServiceImpl implements MyService {

    @Autowired
    private MyRepository myRepository;

    @Override
    public List<MyEntity> findAll() {
        return myRepository.findAll();
    }

    @Override
    public MyEntity findById(Long id) {
        Optional<MyEntity> result = myRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public MyEntity save(MyEntity myEntity) {
        return myRepository.save(myEntity);
    }

    @Override
    public void deleteById(Long id) {
        myRepository.deleteById(id);
    }
}

