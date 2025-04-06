package com.example.ecommerce;

import java.net.URI;
import java.util.List;
import javax.ws.rs.core.UriInfo;

public class Main {
    public static void main(String[] args) throws Exception {
        URI baseUri = new URI("http://localhost:8080");
        UriInfo uriInfo = new UriInfo(baseUri);

        // Initialize controllers
        ProductController productController = new ProductController();
        OrderController orderController = new OrderController();

        // Start server
        // ...
    }
}

