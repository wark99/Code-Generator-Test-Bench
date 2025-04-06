package com.examplecontrolled.Controllers;

import org.springframework.stereotype.RestController;
import com.example Controlled.Order;

@RestController
public class OrdersController extends Default RESTController {
    @Rest("/orders", persistence = RequestType.C, produces = WireFormat.C<String>)
    public List<Order> getAllOrders() {
        return wireList(new ArrayList<Order>());
    }

    @Rest("/orders/{id}", persistence = RequestType.R, produces = WireFormat.C<String>)
    public Order getOrder(String orderId) {
        return controller.get(OBJECT_ID, orderId);
    }
}

