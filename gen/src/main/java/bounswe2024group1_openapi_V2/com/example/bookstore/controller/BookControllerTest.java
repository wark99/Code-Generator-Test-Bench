package com.example.bookstore.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private BookRepository bookRepository;

    private Book book1, book2;

    @BeforeEach
    public void setUp() {
        book1 = new Book();
        book1.setId(1L);
        book1.setTitle("Test Book One");
        book1.setAuthor("Test Author A");
        book1.setYearPublished(2000);

        book2 = new Book();
        book2.setId(2L);
        book2.setTitle("Test Book Two");
        book2.setAuthor("Test Author B");
        book2.setYearPublished(2010);

        // Save books to in-memory database
        bookRepository.save(book1);
        bookRepository.save(book2);
    }

    @Test
    public void whenGetAllBooks_thenReturnBookList() throws Exception {
        mockMvc.perform(get("/api/books"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)));
    }

    @Test
    public void whenGetBookById_thenReturnBook() throws Exception {
        mockMvc.perform(get("/api/books/{id}", 1L))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value(book1.getTitle()));
    }

    @Test
    public void whenCreateNewBook_thenReturnBook() throws Exception {
        Book newBook = new Book();
        newBook.setTitle("New Test Book");
        newBook.setAuthor("New Author");

        mockMvc.perform(post("/api/books")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(newBook)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.title").value(newBook.getTitle()));
    }
}

