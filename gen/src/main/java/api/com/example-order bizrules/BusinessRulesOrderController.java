package com.example-order bizrules;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class BusinessRulesOrderController implements OrderController {
    @Test
    void createOrderValidation() throws Exception {
        // Verifies that order creation fails if customer is null
        mockMvc.perform(post("/orders", "null", "ProductA"))
            .andExpect(status().notEqual(201))
            .andExpect(response().isEmpty())
            .andExpect(content().isEmpty());
    }

    @Test
    void createOrderValidation_Success() throws Exception {
        // Verifies that order creation is successful if customer and product are present
        mockMvc.perform(post("/orders", "customer1", "ProductA"))
            .andExpect(status().isOk(201))
            .andExpect(content().isEmpty());
    }

    @Test(expected = HTTPException.class)
    void createOrderValidation_CustomerIsNull() throws Exception {
        // Verifies that order creation fails if customer is null
        mockMvc.perform(post("/orders", null, "ProductA"))
            .andExpect(status().notEqual(201))
            .andExpect(response().isEmpty())
            .andExpect(content().isEmpty());
    }
}

