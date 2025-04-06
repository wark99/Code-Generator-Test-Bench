package com.example.services;

import com.example.models.OrderModel;
import com.example.repositories.OrderRepository;

public interface OrderService {
    
    List<Order> get();
    List<Order> search();
    List<Order> remove(int id);
}

public class OrderServiceImpl implements OrderService {
    
    @Transactional
    public List<Order> get() throws RepositoryException {
        return repository.get();
    }

    // Other methods...
}

