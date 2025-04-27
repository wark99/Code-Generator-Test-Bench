// BookService.java
package com.example.bookapi.service;

import com.example.bookapi.model.Book;
import com.example.bookapi.model.BookDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            throw new RuntimeException("Book not found");
        }
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book book) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            Book existingBook = optionalBook.get();
            existingBook.setTitle(book.getTitle());
            existingBook.setAuthor(book.getAuthor());
            existingBook.setPagesCount(book.getPagesCount());
            return bookRepository.save(existingBook);
        } else {
            throw new RuntimeException("Book not found");
        }
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

