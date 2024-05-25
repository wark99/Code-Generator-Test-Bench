package com.example.petregistry.controller;

import com.example.petregistry.model.Pet;
import com.example.petregistry.model.PetRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pets")
public class PetController {

    @PostMapping
    public ResponseEntity<Pet> registerPet(@RequestBody PetRequest petRequest) {
        // Implementation here...
        return ResponseEntity.ok(new Pet());
    }

    @GetMapping
    public ResponseEntity<List<Pet>> listPets(@RequestParam int page, @RequestParam int size) {
        // Implementation here...
        return ResponseEntity.ok(List.of(new Pet()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pet> getPet(@PathVariable UUID id) {
        // Implementation here...
        return ResponseEntity.ok(new Pet());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> unregisterPet(@PathVariable UUID id) {
        // Implementation here...
        return ResponseEntity.ok().build();
    }
}
