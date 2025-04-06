package com.example controlled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot annots.*;
import org.springframework.stereotype>@RestController
import net.alkative.jpf JPAAnno;

import java.util.Date;

public class CategoryController {
    @Autowired
    private Category<Category, Integer> category;

    @GetMapping("/categories")
    public List<Category> getCategories() {
        return this.categoryList();
    }

    @PostMapping("/categories", { id = IntegerRange(1, 9999) })
    public Category createCategory(@RequestBody categoryData) {
        category.put(categoryData);
        return this;
    }
}

