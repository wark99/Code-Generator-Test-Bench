package com.example.inventorymanagement.controllers;

import com.example.inventorymanagement.models.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @GetMapping("/getitems")
    public ResponseEntity<List<Item>> getAllItems() {
        // Fetch all items logic
        return ResponseEntity.ok(new ArrayList<>());
    }

    @GetMapping("/{itemID}")
    public ResponseEntity<Item> getItemById(@PathVariable Integer itemID) {
        // Fetch the item by ID logic
        return ResponseEntity.ok(new Item());
    }

    @PostMapping("/additem")
    public ResponseEntity<Void> addItem(@RequestBody Item item) {
        // Add new item logic
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/deleteitem/{itemID}")
    public ResponseEntity<Void> deleteItem(@PathVariable Integer itemID) {
        // Delete item by ID logic
        return ResponseEntity.ok().build();
    }

    @PutMapping("/updateitem/{itemID}")
    public ResponseEntity<Void> updateItem(@PathVariable Integer itemID, @RequestBody Item item) {
        // Update item by ID logic
        return ResponseEntity.ok().build();
    }
}
