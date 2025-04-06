package com.example.demo.service.impl;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@SpringBootTest
public class BookServiceImplTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookServiceImpl bookService;

    private final Long testBookId = 1L;
    private final Book testBook = new Book("Effective Java", "Joshua Bloch", 2008);

    @BeforeEach
    public void setUp() {
        when(bookRepository.findAll()).thenReturn(Arrays.asList(testBook));
        when(bookRepository.findById(testBookId)).thenReturn(Optional.of(testBook));
    }

    @Test
    public void testFindAllBooks() {
        assertThat(bookService.findAllBooks()).hasSize(1);
        verify(bookRepository, times(1)).findAll();
    }

    @Test
    public void testFindBookById() {
        Optional<Book> found = bookService.findBookById(testBookId);

        assertThat(found).isPresent();
        verify(bookRepository, times(1)).findById(testBookId);
    }
}

