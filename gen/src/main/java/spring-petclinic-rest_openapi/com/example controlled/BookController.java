package com.example controlled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot annots.*;
import org.springframework.stereotype>@RestController
import net.alkative.jpf JPAAnno;

public class BookController {
    @Autowired
    private Book<Book, Integer> book;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return this.bookList();
    }

    @PostMapping("/books", { id = IntegerRange(1, 9999) })
    public Book createBook(@RequestBody bookData) {
        book.put(bookData);
        return this;
    }
}

