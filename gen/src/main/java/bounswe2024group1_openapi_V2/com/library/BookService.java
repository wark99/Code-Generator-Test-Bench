// BookService.java

package com.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookService {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        // Add book to the list and save changes
        books.add(book);
    }

    public void updateBook(Book book) {
        // Update book in the list
        for (Book existingBook : books) {
            if (existingBook.getId() == book.getId()) {
                existingBook.setTitle(book.getTitle());
                existingBook.setAuthor(book.getAuthor());
                break;
            }
        }
    }

    public void deleteBook(int id) {
        // Remove book from the list
        books.removeIf(book -> book.getId() == id);
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public Optional<Book> getBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }
}

