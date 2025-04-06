package com.example.demo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    private Item sampleItem;

    @BeforeEach
    public void setUp() {
        sampleItem = new Item("Sample Item", 19.99);
    }

    @Test
    public void testGettersAndSetters() {
        assertEquals("Sample Item", sampleItem.getName());
        assertEquals(19.99, sampleItem.getPrice());

        sampleItem.setName("Updated Sample Item");
        sampleItem.setPrice(29.99);

        assertEquals("Updated Sample Item", sampleItem.getName());
        assertEquals(29.99, sampleItem.getPrice());
    }

    @Test
    public void testToString() {
        assertNotNull(sampleItem.toString());
    }
}

