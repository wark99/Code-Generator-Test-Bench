package com.example.inventorymanagement.controllers;

import com.example.inventorymanagement.models.Provider;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @GetMapping("/getproviders")
    public ResponseEntity<List<Provider>> getAllProviders() {
        // Fetch all providers logic
        return ResponseEntity.ok(new ArrayList<>());
    }

    @GetMapping("/{providerID}")
    public ResponseEntity<Provider> getProviderById(@PathVariable Integer providerID) {
        // Fetch the provider by ID logic
        return ResponseEntity.ok(new Provider());
    }

    @PostMapping("/addprovider")
    public ResponseEntity<Void> addProvider(@RequestBody Provider provider) {
        // Add new provider logic
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/deleteprovider/{providerID}")
    public ResponseEntity<Void> deleteProvider(@PathVariable Integer providerID) {
        // Delete provider by ID logic
        return ResponseEntity.ok().build();
    }

    @PutMapping("/updateprovider/{providerID}")
    public ResponseEntity<Void> updateProvider(@PathVariable Integer providerID, @RequestBody Provider provider) {
        // Update provider by ID logic
        return ResponseEntity.ok().build();
    }
}
