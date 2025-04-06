package com.example.library.service;

import com.example.library.model.Book;
import java.util.List;

public interface BookService {

    List<Book> getAllBooks();
    
    Book getBookById(Long id);
    
    Book saveBook(Book book);
    
    void deleteBookById(Long id);
}

