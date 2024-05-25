package com.example.inventorymanagement.controllers;

import com.example.inventorymanagement.models.Consumer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @GetMapping("/{consumerID}")
    public ResponseEntity<Consumer> getConsumerById(@PathVariable Integer consumerID) {
        // Fetch the consumer by ID logic
        return ResponseEntity.ok(new Consumer());
    }

    @GetMapping("/getconsumers")
    public ResponseEntity<List<Consumer>> getAllConsumers() {
        // Fetch all consumers logic
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PostMapping("/addNewConsumer")
    public ResponseEntity<Void> addNewConsumer(@RequestBody Consumer consumer) {
        // Add new consumer logic
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/deleteConsumer/{consumerID}")
    public ResponseEntity<Void> deleteConsumer(@PathVariable Integer consumerID) {
        // Delete consumer by ID logic
        return ResponseEntity.ok().build();
    }

    @PutMapping("/updateConsumer/{consumerID}")
    public ResponseEntity<Void> updateConsumer(@PathVariable Integer consumerID, @RequestBody Consumer consumer) {
        // Update consumer by ID logic
        return ResponseEntity.ok().build();
    }
}
