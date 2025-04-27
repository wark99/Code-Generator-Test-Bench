package com.example.petstoreapi.controller;

import com.example.petstoreapi.model.Pet;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Operation(summary = "List all pets", operationId = "listPets")
    @GetMapping
    public List<String> listPets() {
        return Arrays.asList("Dog", "Cat");
    }
}

