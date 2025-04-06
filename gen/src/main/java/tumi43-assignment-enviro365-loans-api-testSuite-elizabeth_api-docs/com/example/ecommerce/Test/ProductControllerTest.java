package com.example.ecommerce.Test;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.ecommerce.Controller.ProductController;
import com.example.ecommerce.Service.ProductService;

public class ProductControllerTest {
    private ProductController productController = new ProductController();
    private ProductService productService = new ProductService();

    @Test
    public void testGetAllProducts() {
        List<Product> products = productController.getAllProducts();
        assertEquals(productService.getAllProducts(), products);
    }
}

