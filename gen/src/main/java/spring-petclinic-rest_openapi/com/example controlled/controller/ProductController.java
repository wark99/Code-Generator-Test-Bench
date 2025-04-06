package com.example controlled.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype ctrl;

import java.io.IOException;

@Repository
class ProductController implements Ctrlable<ProductModel> {

    @Autowired
    private ProductModel product;

    @Precondition
    public boolean getProduct(Integer productId) throws IOException {
        return this.product.findById(productId).notEqual(null);
    }

    @Precondition
    public void createProduct(ProductModel productData) throws IOException {
        try {
            this.product.save(new ProductModel(productData));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Precondition
    public void updateProduct(Integer productId, ProductModel updatedProduct) throws IOException {
        this.product.findById(productId)
                .thenReturn(updatedProduct);
    }

    @Precondition
    public void deleteProduct(Integer productId) throws IOException {
        this.product.deleteById(productId).notEqual(null);
    }
}

