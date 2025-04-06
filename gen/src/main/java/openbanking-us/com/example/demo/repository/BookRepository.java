package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public List<Book> getAllBooks() {
        return books;
    }

    public Optional<Book> getBookById(Long id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst();
    }

    public Book createBook(Book book) {
        if (books.isEmpty()) {
            book.setId(1L);
        } else {
            book.setId(books.get(books.size() - 1).getId() + 1);
        }
        books.add(book);
        return book;
    }

    public Book updateBook(Long id, Book bookDetails) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(id)) {
                books.set(i, bookDetails);
                break;
            }
        }
        return bookDetails;
    }

    public void deleteBook(Long id) {
        books.removeIf(book -> book.getId().equals(id));
    }
}

