package com.example.petregistry.controller;

import com.example.petregistry.model.Owner;
import com.example.petregistry.model.OwnerRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    @PostMapping
    public ResponseEntity<Owner> registerOwner(@RequestBody OwnerRequest ownerRequest) {
        // Implementation here...
        return ResponseEntity.ok(new Owner());
    }

    @GetMapping
    public ResponseEntity<List<Owner>> listOwners(@RequestParam int page, @RequestParam int size) {
        // Implementation here...
        return ResponseEntity.ok(List.of(new Owner()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Owner> getOwner(@PathVariable UUID id) {
        // Implementation here...
        return ResponseEntity.ok(new Owner());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> unregisterOwner(@PathVariable UUID id) {
        // Implementation here...
        return ResponseEntity.ok().build();
    }
}
