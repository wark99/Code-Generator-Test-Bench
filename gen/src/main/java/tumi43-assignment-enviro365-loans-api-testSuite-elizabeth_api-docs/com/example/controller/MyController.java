package com.example.controller;

import com.example.model.MyEntity;
import com.example.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/myentities")
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping
    public List<MyEntity> getAll() {
        return myService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MyEntity> getById(@PathVariable Long id) {
        MyEntity entity = myService.findById(id);
        if (entity == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(entity);
    }

    @PostMapping
    public MyEntity create(@RequestBody MyEntity entity) {
        return myService.save(entity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MyEntity> update(@PathVariable Long id, @RequestBody MyEntity updatedEntity) {
        MyEntity existingEntity = myService.findById(id);
        if (existingEntity == null) {
            return ResponseEntity.notFound().build();
        }
        existingEntity.setName(updatedEntity.getName());
        myService.save(existingEntity);
        return ResponseEntity.ok(existingEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        MyEntity entity = myService.findById(id);
        if (entity == null) {
            return ResponseEntity.notFound().build();
        }
        myService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

