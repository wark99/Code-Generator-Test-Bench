package com.example.myapp;

import com.example.myapp.model.Item;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class ItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    // Test data setup
    private List<Item> items = Arrays.asList(
            new Item(null, "Item 1", 10.0),
            new Item(null, "Item 2", 20.0)
    );

    @BeforeEach
    public void setUp() throws Exception {
        for (Item item : items) {
            mockMvc.perform(post("/items")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(objectMapper.writeValueAsString(item)))
                    .andExpect(status().isOk());
        }
    }

    @Test
    public void testGetAllItems() throws Exception {
        mockMvc.perform(get("/items"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)));
    }

    @Test
    public void testCreateItem() throws Exception {
        Item newItem = new Item(null, "Item 3", 30.0);

        mockMvc.perform(post("/items")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(newItem)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Item 3"));
    }

    @Test
    public void testGetItemById() throws Exception {
        Item item = items.get(0);

        mockMvc.perform(get("/items/" + item.getId()))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value(item.getName()));
    }
}

