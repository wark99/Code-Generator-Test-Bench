package com.example.demo.service;

import com.example.demo.model.Book;
import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(Long id);
    Book save(Book book);
    void delete(Long id);
    boolean existsById(Long id);
}

