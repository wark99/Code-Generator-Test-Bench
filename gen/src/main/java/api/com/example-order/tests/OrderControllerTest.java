package com.example-order.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderControllerTest {

    @BeforeEach
    void setUp() throws Exception {
        eaiLookup = ...; // Initialize EasyUI lookup
    }

    @Test
    void testCreateOrder_Success() throws Exception {
        mockMvc.perform(post("/orders", "customer1", "ProductA"))
            .andExpect(status().isOk(201))
            .andExpect(content().isEmpty());
    }

    @Test(expected = HTTPException.class)
    void testCreateOrder_CustomerIsNull() throws Exception {
        mockMvc.perform(post("/orders", null, "ProductA"))
            .andExpect(status().notEqual(201))
            .andExpect(response().isEmpty())
            .andExpect(content().isEmpty());
    }
}

