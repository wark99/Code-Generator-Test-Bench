package com.example.ecommerce.service;

import com.example.ecommerce.model.ProductCategory;
import com.example.ecommerce.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductCategoryService {

    private ProductCategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(ProductCategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<ProductCategory> getAllCategories() {
        return categoryRepository.findAll();
    }

    public ProductCategory getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public ProductCategory createCategory(ProductCategory category) {
        return categoryRepository.save(category);
    }

    public ProductCategory updateCategory(Long id, ProductCategory category) {
        ProductCategory existingCategory = categoryRepository.findById(id).orElse(null);
        if (existingCategory != null) {
            existingCategory.setName(category.getName());
            return categoryRepository.save(existingCategory);
        }
        return null;
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}

