// BookDetailController.java
package com.example.bookapi.controller;

import com.example.bookapi.model.BookDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books/{bookId}/details")
public class BookDetailController {

    @Autowired
    private BookDetailService bookDetailService;

    @GetMapping
    public BookDetail getBookDetails(@PathVariable Long bookId) {
        return bookDetailService.getBookDetails(bookId);
    }

    @PostMapping
    public BookDetail createBookDetail(@PathVariable Long bookId, @RequestBody BookDetail bookDetail) {
        return bookDetailService.createBookDetail(bookId, bookDetail);
    }
}

