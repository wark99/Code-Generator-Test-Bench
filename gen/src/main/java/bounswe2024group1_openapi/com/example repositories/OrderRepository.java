package com.example repositories;

import com.example.models.OrderModel;
import com.example.services.OrderService;
import org.junit.jupiter.api.Test;

public class OrderRepository extends AbstractRepository<OrderModel, OrderService> {
    
    @Test
    public void save(OrderModel order) throws HttpException, BusinessLogicException {
        repository.save(order);
    }

    // Other methods...
}

