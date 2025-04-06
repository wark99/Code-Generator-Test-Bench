package com.example.ecommerce.Controller;

import java.util.List;
import com.example.ecommerce.Service.ProductService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.example.ecommerce.Model.Product;

@Path("/products")
public class ProductController {
    private ProductService productService;

    public ProductController() {
        this.productService = new ProductService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}

