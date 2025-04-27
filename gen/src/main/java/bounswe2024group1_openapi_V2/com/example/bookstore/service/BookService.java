package com.example.bookstore.service;

import com.example.bookstore.model.Book;
import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAllBooks();
    Optional<Book> findBookById(Long id);
    Book saveBook(Book book);
    void deleteBook(Long id);
}


