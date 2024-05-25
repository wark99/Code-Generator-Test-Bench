package com.example.inventorymanagement.controllers;

import com.example.inventorymanagement.models.Inventory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @GetMapping("/{inventoryID}")
    public ResponseEntity<Inventory> getInventoryById(@PathVariable Integer inventoryID) {
        // Fetch the inventory by ID logic
        return ResponseEntity.ok(new Inventory());
    }

    @GetMapping("/getinventories")
    public ResponseEntity<List<Inventory>> getAllInventories() {
        // Fetch all inventories logic
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PostMapping("/addnewinventory")
    public ResponseEntity<Void> addNewInventory(@RequestBody Inventory inventory) {
        // Add new inventory logic
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/deleteInventory/{inventoryID}")
    public ResponseEntity<Void> deleteInventory(@PathVariable Integer inventoryID) {
        // Delete inventory by ID logic
        return ResponseEntity.ok().build();
    }

    @PutMapping("/updateInventory/{inventoryID}")
    public ResponseEntity<Void> updateInventory(@PathVariable Integer inventoryID, @RequestBody Inventory inventory) {
        // Update inventory by ID logic
        return ResponseEntity.ok().build();
    }
}
