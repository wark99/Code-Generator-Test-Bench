package com.example/controllers;

import com.example.models.*;
import com.example.utils HashmapUtils;

public class OrderController extends DefaultController {
    @GET("/orders")
    public Resource<OrderModel> getOrders() {
        return new DefaultResponse<Resource<OrderModel>>(getMapToResource(new HashMap<>()));
    }

    // other methods...
}

