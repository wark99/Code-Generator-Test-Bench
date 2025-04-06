package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

class BookControllerTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookController bookController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1L, "Book 1", "Author 1", 2020));
        books.add(new Book(2L, "Book 2", "Author 2", 2021));

        when(bookRepository.getAllBooks()).thenReturn(books);

        ResponseEntity<List<Book>> response = bookController.getAllBooks();
        assertEquals(200, response.getStatusCode().value());
        assertEquals(books, response.getBody());
    }

    @Test
    void testGetBookById() {
        Book book = new Book(1L, "Book 1", "Author 1", 2020);
        when(bookRepository.getBookById(anyLong())).thenReturn(Optional.of(book));

        ResponseEntity<Book> response = bookController.getBookById(1L);
        assertEquals(200, response.getStatusCode().value());
        assertEquals(book, response.getBody());
    }

    @Test
    void testCreateBook() {
        Book book = new Book(null, "New Book", "New Author", 2022);
        when(bookRepository.createBook(any(Book.class))).thenReturn(book);

        ResponseEntity<Book> response = bookController.createBook(book);
        assertEquals(201, response.getStatusCode().value());
        assertNotNull(response.getBody().getId());
    }

    @Test
    void testUpdateBook() {
        Book existingBook = new Book(1L, "Existing Book", "Existing Author", 2020);
        when(bookRepository.getBookById(anyLong())).thenReturn(Optional.of(existingBook));
        when(bookRepository.updateBook(anyLong(), any(Book.class))).thenReturn(new Book(1L, "Updated Book", "New Author", 2022));

        ResponseEntity<Book> response = bookController.updateBook(1L, new Book(null, "Updated Book", "New Author", 2022));
        assertEquals(200, response.getStatusCode().value());
        assertEquals("Updated Book", response.getBody().getTitle());
    }

    @Test
    void testDeleteBook() {
        when(bookRepository.getBookById(anyLong())).thenReturn(Optional.of(new Book(1L, "Book to Delete", "Author", 2020)));

        ResponseEntity<Void> response = bookController.deleteBook(1L);
        assertEquals(204, response.getStatusCode().value());
    }
}

