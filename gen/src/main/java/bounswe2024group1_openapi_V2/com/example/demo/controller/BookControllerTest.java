// BookControllerTest.java
package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.Optional;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(BookController.class)
public class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookRepository bookRepository;

    private Book testBook;

    @BeforeEach
    public void setUp() {
        testBook = new Book();
        testBook.setId(1L);
        testBook.setTitle("Effective Java");
        testBook.setAuthor("Joshua Bloch");

        when(bookRepository.save(any(Book.class))).thenReturn(testBook);
        when(bookRepository.findAll()).thenReturn(Arrays.asList(testBook));
        when(bookRepository.findById(1L)).thenReturn(Optional.of(testBook));
    }

    @Test
    public void getAllBooks() throws Exception {
        mockMvc.perform(get("/api/books"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$.[0].id").value(1))
                .andExpect(jsonPath("$.[0].title").value("Effective Java"));
    }

    @Test
    public void getBookById() throws Exception {
        mockMvc.perform(get("/api/books/{id}", 1))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.title").value("Effective Java"));
    }

    @Test
    public void createBook() throws Exception {
        mockMvc.perform(post("/api/books")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"title\":\"Clean Code\",\"author\":\"Robert C. Martin\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.title").value("Effective Java"));

        verify(bookRepository, times(1)).save(any(Book.class));
    }

    @Test
    public void updateBook() throws Exception {
        mockMvc.perform(put("/api/books/{id}", 1)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"title\":\"Clean Code\",\"author\":\"Robert C. Martin\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.title").value("Clean Code"));

        verify(bookRepository, times(1)).save(any(Book.class));
    }

    @Test
    public void deleteBook() throws Exception {
        mockMvc.perform(delete("/api/books/{id}", 1))
                .andExpect(status().isNoContent());

        verify(bookRepository, times(1)).deleteById(1L);
    }
}

