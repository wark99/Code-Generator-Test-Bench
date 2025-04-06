package com.example.myapp.controller;

import com.example.myapp.model.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ItemController.class)
public class ItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        // Initialize the controller or mock dependencies if needed
    }

    @Test
    public void testGetItemById() throws Exception {
        mockMvc.perform(get("/items/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.name").value("Item 1"))
                .andExpect(jsonPath("$.price").value(10.99));
    }

    @Test
    public void testCreateItem() throws Exception {
        Item newItem = new Item(null, "New Item", 5.99);
        mockMvc.perform(post("/items")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\":\"New Item\",\"price\":5.99}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(3L)) // Assuming there are 2 items already
                .andExpect(jsonPath("$.name").value("New Item"))
                .andExpect(jsonPath("$.price").value(5.99));
    }
}

