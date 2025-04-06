package com.example.myapp.controller;

import com.example.myapp.model.Item;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private List<Item> items = new ArrayList<>();

    public ItemController() {
        // Adding some sample data
        items.add(new Item(1L, "Item 1", 10.99));
        items.add(new Item(2L, "Item 2", 20.99));
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Long id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        item.setId((long) (items.size() + 1));
        items.add(item);
        return item;
    }
}

