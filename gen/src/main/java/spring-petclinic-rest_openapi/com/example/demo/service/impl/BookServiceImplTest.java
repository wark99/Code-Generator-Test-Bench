// src/test/java/com/example/demo/service/impl/BookServiceImplTest.java

package com.example.demo.service.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Optional;

public class BookServiceImplTest {

    private BookService bookService;
    private BookRepository bookRepository;

    @BeforeEach
    public void setUp() {
        bookRepository = mock(BookRepository.class);
        bookService = new BookServiceImpl(bookRepository);
    }

    @Test
    public void testFindAllBooksWhenNoBooksFound() {
        when(bookRepository.findAll()).thenReturn(Collections.emptyList());

        assertEquals(0, bookService.findAllBooks().size());
    }

    @Test
    public void testFindBookByIdWhenFound() {
        Book expectedBook = new Book();
        expectedBook.setId(1L);
        expectedBook.setTitle("Sample Book");
        
        when(bookRepository.findById(1L)).thenReturn(Optional.of(expectedBook));

        Book actualBook = bookService.findBookById(1L);

        assertEquals(expectedBook.getId(), actualBook.getId());
    }

    @Test
    public void testSaveBook() {
        Book newBook = new Book();
        newBook.setTitle("New Book");
        
        when(bookRepository.save(any(Book.class))).thenReturn(newBook);
        
        Book savedBook = bookService.saveBook(newBook);

        assertNotNull(savedBook);
        assertEquals("New Book", savedBook.getTitle());
    }
}

