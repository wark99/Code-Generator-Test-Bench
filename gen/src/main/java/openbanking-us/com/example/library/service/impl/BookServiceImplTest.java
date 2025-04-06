package com.example.library.service.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.example.library.model.Book;
import com.example.library.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

public class BookServiceImplTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookServiceImpl bookService;

    private Book book;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        book = new Book("Effective Java", "Joshua Bloch", 2008);
    }

    @Test
    public void testSaveBook() {
        when(bookRepository.save(any(Book.class))).thenReturn(book);

        Book savedBook = bookService.saveBook(book);

        assertThat(savedBook).isNotNull();
        verify(bookRepository, times(1)).save(book);
    }

    @Test
    public void testGetAllBooks() {
        when(bookRepository.findAll()).thenReturn(List.of(book));

        List<Book> books = bookService.getAllBooks();

        assertThat(books).hasSize(1);
        verify(bookRepository, times(1)).findAll();
    }

    @Test
    public void testGetBookById() {
        Long id = 1L;
        when(bookRepository.findById(id)).thenReturn(Optional.of(book));

        Optional<Book> bookOptional = bookService.getBookById(id);

        assertTrue(bookOptional.isPresent());
        verify(bookRepository, times(1)).findById(id);
    }

    @Test
    public void testDeleteBook() {
        Long id = 1L;
        doNothing().when(bookRepository).deleteById(id);

        bookService.deleteBook(id);

        verify(bookRepository, times(1)).deleteById(id);
    }
}

