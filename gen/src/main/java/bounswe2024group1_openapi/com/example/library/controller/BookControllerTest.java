package com.example.library.controller;

import com.example.library.model.Book;
import com.example.library.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.Optional;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
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
    public void setup() {
        testBook = new Book(1L, "The Great Gatsby", "F. Scott Fitzgerald", 1925);
    }

    @Test
    public void shouldReturnAllBooks() throws Exception {
        when(bookRepository.findAll()).thenReturn(Collections.singletonList(testBook));

        mockMvc.perform(get("/api/books"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].title").value("The Great Gatsby"));
    }

    @Test
    public void shouldReturnSingleBook() throws Exception {
        when(bookRepository.findById(any(Long.class))).thenReturn(Optional.of(testBook));

        mockMvc.perform(get("/api/books/{id}", 1))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("The Great Gatsby"));
    }

    @Test
    public void shouldCreateNewBook() throws Exception {
        when(bookRepository.save(any(Book.class))).thenReturn(testBook);

        mockMvc.perform(post("/api/books")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"title\":\"1984\",\"author\":\"George Orwell\",\"yearPublished\":1949}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").exists());
    }

    @Test
    public void shouldUpdateBook() throws Exception {
        when(bookRepository.findById(any(Long.class))).thenReturn(Optional.of(testBook));
        when(bookRepository.save(any(Book.class))).thenReturn(testBook);

        mockMvc.perform(put("/api/books/{id}", 1)
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"title\":\"1984\",\"author\":\"George Orwell\",\"yearPublished\":1949}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("1984"));
    }

    @Test
    public void shouldDeleteBook() throws Exception {
        when(bookRepository.findById(any(Long.class))).thenReturn(Optional.of(testBook));

        mockMvc.perform(delete("/api/books/{id}", 1))
                .andExpect(status().noContent());
    }
}

