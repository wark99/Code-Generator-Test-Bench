package com.example.demo.controller;

import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ItemController.class)
public class ItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ItemRepository itemRepository;

    private Item sampleItem;

    @BeforeEach
    public void setUp() {
        sampleItem = new Item("Sample Item", 19.99);
    }

    @Test
    public void testGetAllItems() throws Exception {
        when(itemRepository.findAll()).thenReturn(List.of(sampleItem));

        mockMvc.perform(get("/api/items"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].name").value("Sample Item"))
                .andExpect(jsonPath("$[0].price").value(19.99));
    }

    @Test
    public void testCreateItem() throws Exception {
        when(itemRepository.save(any(Item.class))).thenReturn(sampleItem);

        mockMvc.perform(post("/api/items")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\":\"Sample Item\",\"price\":19.99}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.name").value("Sample Item"))
                .andExpect(jsonPath("$.price").value(19.99));
    }

    @Test
    public void testGetItemById() throws Exception {
        when(itemRepository.findById(anyLong())).thenReturn(Optional.of(sampleItem));

        mockMvc.perform(get("/api/items/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Sample Item"))
                .andExpect(jsonPath("$.price").value(19.99));
    }

    @Test
    public void testUpdateItem() throws Exception {
        when(itemRepository.findById(anyLong())).thenReturn(Optional.of(sampleItem));
        sampleItem.setName("Updated Sample Item");
        when(itemRepository.save(any(Item.class))).thenReturn(sampleItem);

        mockMvc.perform(put("/api/items/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\":\"Updated Sample Item\",\"price\":19.99}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Updated Sample Item"))
                .andExpect(jsonPath("$.price").value(19.99));
    }

    @Test
    public void testDeleteItem() throws Exception {
        when(itemRepository.findById(anyLong())).thenReturn(Optional.of(sampleItem));

        mockMvc.perform(delete("/api/items/1"))
                .andExpect(status().isNoContent());
    }
}

