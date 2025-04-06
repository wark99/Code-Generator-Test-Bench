package com.example.library.controller;

import com.example.library.model.Book;
import com.example.library.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class BookControllerTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookController bookController;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(bookController).build();
    }

    @Test
    void testGetAllBooks() throws Exception {
        given(bookRepository.findAll()).willReturn(Arrays.asList(
                new Book("Book One", "Author A", "ISBN-001"),
                new Book("Book Two", "Author B", "ISBN-002")
        ));

        mockMvc.perform(get("/api/books"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].title").value("Book One"))
                .andExpect(jsonPath("$[1].author").value("Author B"));
    }

    @Test
    void testGetBookById() throws Exception {
        Book book = new Book("Book Three", "Author C", "ISBN-003");
        given(bookRepository.findById(3L)).willReturn(Optional.of(book));

        mockMvc.perform(get("/api/books/3"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("Book Three"));
    }

    @Test
    void testCreateBook() throws Exception {
        Book book = new Book("Book Four", "Author D", "ISBN-004");

        given(bookRepository.save(any(Book.class))).willReturn(book);

        mockMvc.perform(post("/api/books")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"title\":\"Book Four\",\"author\":\"Author D\",\"isbn\":\"ISBN-004\"}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.title").value("Book Four"));
    }

    @Test
    void testUpdateBook() throws Exception {
        Book existingBook = new Book("Book Five", "Author E", "ISBN-005");
        given(bookRepository.findById(5L)).willReturn(Optional.of(existingBook));
        given(bookRepository.save(any(Book.class))).willReturn(new Book("Updated Title", "Author E", "ISBN-005"));

        mockMvc.perform(put("/api/books/5")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"title\":\"Updated Title\",\"author\":\"Author E\",\"isbn\":\"ISBN-005\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("Updated Title"));
    }

    @Test
    void testDeleteBook() throws Exception {
        given(bookRepository.findById(6L)).willReturn(Optional.of(new Book("Book Six", "Author F", "ISBN-006")));

        mockMvc.perform(delete("/api/books/6"))
                .andExpect(status().isNoContent());
    }
}

