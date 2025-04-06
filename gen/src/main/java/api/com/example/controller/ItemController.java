package com.example.controller;

import com.example.model.Item;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final List<Item> items = new ArrayList<>();

    @GetMapping
    public List<Item> getAllItems() {
        return items;
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        items.add(item);
        return item;
    }
}

