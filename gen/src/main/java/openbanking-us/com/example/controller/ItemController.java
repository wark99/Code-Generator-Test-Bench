package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ItemController {

    @GetMapping("/items")
    public List<Item> getAllItems() {
        // Mock data for demonstration
        return List.of(
            new Item(1L, "Item 1"),
            new Item(2L, "Item 2")
        );
    }
}

