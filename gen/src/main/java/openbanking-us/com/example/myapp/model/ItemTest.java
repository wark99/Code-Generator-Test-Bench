package com.example.myapp.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    @Test
    public void testItemCreation() {
        Item item = new Item(1L, "Test Item", 9.99);
        assertNotNull(item);
        assertEquals(1L, item.getId());
        assertEquals("Test Item", item.getName());
        assertEquals(9.99, item.getPrice(), 0.01);
    }
}

