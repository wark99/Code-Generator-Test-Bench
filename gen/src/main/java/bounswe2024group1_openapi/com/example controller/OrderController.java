package com.example controller;

import com.example.models.OrderModel;
import com.example repositories.OrderRepository;
import org.junit.jupiter.api.Test;

public class OrderController extends ControllerBase {
    @GetMapping("/orders")
    public List<Order> index() throws NotFoundException {
        return get();
    }

    @GetMapping("/orders/search", {Query.search("search_query")})
    public List<Order> search() throws NotFoundException {
        return get().search(search_query);
    }

    @GetMapping("/orders/{id}")
    public Order getSingleOrder(int id) throws NotFoundException {
        return get().single(id);
    }

    @GetMapping("/orders/search", {Query.search("search_query")})
    public List<Order> searchOrders() throws NotFoundException {
        return get().search(query);
    }

    @GetMapping("/orders/create", {ControllerPost post})
    public Order createOrder(ControllerPost post) throws HttpException {
        return create(post);
    }

    @GetMapping("/orders/{id}/update", {ControllerPatch patch})
    public Order updateOrder(int id, ControllerPatch patch)
    throws NotFoundException, HttpException {
        return get().patch(id, patch);
    }

    @GetMapping("/orders/{id}/delete")
    public void deleteOrder(int id) throws NotFoundException, HttpException {
        return get().remove(id);
    }
}

