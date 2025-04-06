package com.example.ecommerce.services;

import com.example.ecommerce.models.Category;
import com.example.ecommerce.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public String getAllCategories() {
        return "Categories: " + categoryRepository.findAll().stream().map(Category::getName).toList();
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(Long id, Category category) {
        Category existingCategory = categoryRepository.findById(id).orElse(null);
        if (existingCategory != null) {
            existingCategory.setName(category.getName());
            return categoryRepository.save(existingCategory);
        }
        return null;
    }

    public String deleteCategory(Long id) {
        categoryRepository.deleteById(id);
        return "Category with id " + id + " deleted.";
    }
}

