package com.example.demo.controller;

import com.example.demo.model.Book;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class BookControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        // Setup data and mocks if needed
    }

    @Test
    public void testGetAllBooks() throws Exception {
        List<Book> books = List.of(new Book(), new Book());

        when(mockBookService.getAllBooks()).thenReturn(books);

        mockMvc.perform(get("/api/books"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()").value(2));
    }

    @Test
    public void testGetBookById() throws Exception {
        Long id = 1L;
        Book book = new Book();

        when(mockBookService.getBookById(id)).thenReturn(Optional.of(book));

        mockMvc.perform(get("/api/books/{id}", id))
                .andExpect(status().isOk());
    }

    @Test
    public void testCreateBook() throws Exception {
        Book bookRequest = new Book();
        bookRequest.setTitle("New Book");
        bookRequest.setAuthor("Author Name");
        bookRequest.setYearPublished(2023);

        Book bookResponse = new Book();
        bookResponse.setId(1L);
        bookResponse.setTitle(bookRequest.getTitle());
        bookResponse.setAuthor(bookRequest.getAuthor());
        bookResponse.setYearPublished(bookRequest.getYearPublished());

        when(mockBookService.saveBook(bookRequest)).thenReturn(bookResponse);

        mockMvc.perform(post("/api/books")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(bookRequest)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(1));
    }

    @Test
    public void testUpdateBook() throws Exception {
        Long id = 1L;
        Book bookRequest = new Book();
        bookRequest.setTitle("Updated Title");
        bookRequest.setAuthor("Updated Author");
        bookRequest.setYearPublished(2024);

        Book bookResponse = new Book();
        bookResponse.setId(id);
        bookResponse.setTitle(bookRequest.getTitle());
        bookResponse.setAuthor(bookRequest.getAuthor());
        bookResponse.setYearPublished(bookRequest.getYearPublished());

        when(mockBookService.updateBook(id, bookRequest)).thenReturn(Optional.of(bookResponse));

        mockMvc.perform(put("/api/books/{id}", id)
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(bookRequest)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("Updated Title"));
    }

    @Test
    public void testDeleteBook() throws Exception {
        Long id = 1L;

        doNothing().when(mockBookService).deleteBook(id);

        mockMvc.perform(delete("/api/books/{id}", id))
                .andExpect(status().isNoContent());
    }
}

