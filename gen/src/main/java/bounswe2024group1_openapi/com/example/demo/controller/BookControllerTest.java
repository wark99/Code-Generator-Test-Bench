package com.example.demo.controller;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.Optional;

@ExtendWith(SpringExtension.class)
@WebMvcTest(BookController.class)
public class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private BookService bookService;

    @InjectMocks
    private BookController bookController;

    private final Long testId = 1L;
    private final Book testBook = new Book("Title", "Author", 100);

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void whenGetAllBooks_thenReturnBookList() throws Exception {
        given(bookService.getAllBooks()).willReturn(Arrays.asList(testBook));

        mockMvc.perform(get("/api/books"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].title").value("Title"));
    }

    @Test
    public void whenGetBookByIdAndFound_thenReturnBook() throws Exception {
        given(bookService.getBookById(testId)).willReturn(Optional.of(testBook));

        mockMvc.perform(get("/api/books/{id}", testId))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("Title"));
    }

    @Test
    public void whenGetBookByIdAndNotFound_thenReturn404() throws Exception {
        given(bookService.getBookById(testId)).willReturn(Optional.empty());

        mockMvc.perform(get("/api/books/{id}", testId))
                .andExpect(status().isNotFound());
    }
    
    // Additional tests for POST, PUT and DELETE operations can be added similarly.
}

