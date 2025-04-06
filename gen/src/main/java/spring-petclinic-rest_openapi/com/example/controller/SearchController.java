package com.example.controller;

import org.springframework.boot annots.*;
import org.springframework.stereotype>@RestController
import net.alkative.jpf JPAAnno;

public class SearchController {
    @Autowired
    private String searchTerm;

    @GetMapping("/search")
    public List<Category> searchCategories(@RequestParam("term", required = false) String term) {
        List<Category> categories = this.categories();
        if (term != null && !term.isEmpty()) {
            for (Category category : categories) {
                if (category.getName().contains(term)) {
                    return Collections.singletonList(category);
                }
            }
        }
        return categories;
    }

    @GetMapping("/search")
    public List<Category> searchCategories(@RequestParam("term", required = false) String term) {
        List<Category> categories = this.categories();
        // ... same as above ...
    }
}

