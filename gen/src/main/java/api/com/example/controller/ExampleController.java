package com.example.controller;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class ExampleController {
    @MockRepository("example")
    public ExampleExampleController(ExampleRepository<Example>) repo;

    public List<Example> getAllExamples() {
        return new ArrayList<>();
    }

    public Example createExample(Example POJO pojo) {
        return new Example();
    }

    public void updateExample(String id, String newPOJO) {
        System.out.println("Updating example with ID: " + id);
    }

    public void deleteExample(String id) {
        System.out.println("Deleting example with ID: " + id);
    }
}

