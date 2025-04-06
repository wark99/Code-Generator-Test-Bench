package com.example.app.Controllers;

import com.example.app.DTO.*; // Include all DŌs here
import com.example.appEntities.BreedEntity;
import com.example.test.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BreedController extends BaseController {
    @GET("/breeds")
    public Breeds getBreeds() { ... }
    
    // Other CRUD operations...
}

