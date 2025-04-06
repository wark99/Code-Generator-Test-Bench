package com.example.demo;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class ProductRepositoryTests {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void whenSaveProduct_thenFindById() {
        // Given
        Product product = new Product();
        product.setName("Test Product");
        product.setPrice(19.99);

        // When
        productRepository.save(product);
        List<Product> allProducts = productRepository.findAll();

        // Then
        assertThat(allProducts).isNotEmpty().hasSize(1);
        assertThat(allProducts.get(0).getName()).isEqualTo("Test Product");
    }
}

