// LibraryController.java

package com.library;

import java.util.List;
import java.util.Optional;

public class LibraryController {
    private BookService bookService;

    public LibraryController(BookService bookService) {
        this.bookService = bookService;
    }

    // Get all books in the library
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // Get a specific book by its ID
    public Optional<Book> getBookById(int id) {
        return bookService.getBookById(id);
    }

    // Add a new book to the library
    public void addBook(Book book) {
        bookService.addBook(book);
    }

    // Update an existing book in the library
    public void updateBook(Book book) {
        bookService.updateBook(book);
    }

    // Delete a book from the library
    public void deleteBook(int id) {
        bookService.deleteBook(id);
    }
}

