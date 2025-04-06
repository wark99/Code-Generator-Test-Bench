package com.example.ecommerce.service;

import com.example.ecommerce.model.ProductCategory;
import com.example.ecommerce.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductCategoryService {

    private ProductCategoryRepository productCategoryRepository;

    @Autowired
    public ProductCategoryService(ProductCategoryRepository productCategoryRepository) {
        this.productCategoryRepository = productCategoryRepository;
    }

    public List<ProductCategory> getAllCategories() {
        return productCategoryRepository.findAll();
    }

    public ProductCategory getCategoryById(Long id) {
        return productCategoryRepository.findById(id);
    }

    public ProductCategory createCategory(ProductCategory category) {
        return productCategoryRepository.save(category);
    }

    public ProductCategory updateCategory(Long id, ProductCategory category) {
        ProductCategory existingCategory = productCategoryRepository.findById(id);
        if (existingCategory != null) {
            existingCategory.setName(category.getName());
            existingCategory.setDescription(category.getDescription());
            return productCategoryRepository.save(existingCategory);
        }
        return null;
    }

    public void deleteCategory(Long id) {
        productCategoryRepository.deleteById(id);
    }
}

