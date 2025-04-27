package com.example.demo.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(BookController.class)
public class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookRepository bookRepository;

    @InjectMocks
    private BookController bookController;

    @Test
    public void testCreateBook() throws Exception {
        Book book = new Book(1L, "Java Programming", "John Doe", 2023);
        when(bookRepository.save(any(Book.class))).thenReturn(book);

        mockMvc.perform(post("/api/books")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(book)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.title").value("Java Programming"))
                .andExpect(jsonPath("$.author").value("John Doe"))
                .andExpect(jsonPath("$.yearPublished").value(2023));
    }

    @Test
    public void testGetAllBooks() throws Exception {
        List<Book> books = List.of(
                new Book(1L, "Book 1", "Author 1", 2020),
                new Book(2L, "Book 2", "Author 2", 2021)
        );
        when(bookRepository.findAll()).thenReturn(books);

        mockMvc.perform(get("/api/books"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()").value(2));
    }

    @Test
    public void testGetBookById() throws Exception {
        Book book = new Book(1L, "Book 1", "Author 1", 2020);
        when(bookRepository.findById(1L)).thenReturn(Optional.of(book));

        mockMvc.perform(get("/api/books/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.title").value("Book 1"))
                .andExpect(jsonPath("$.author").value("Author 1"))
                .andExpect(jsonPath("$.yearPublished").value(2020));
    }

    @Test
    public void testUpdateBook() throws Exception {
        Book existingBook = new Book(1L, "Old Title", "Old Author", 2019);
        when(bookRepository.findById(1L)).thenReturn(Optional.of(existingBook));

        Book updatedBook = new Book(1L, "New Title", "New Author", 2020);
        when(bookRepository.save(any(Book.class))).thenReturn(updatedBook);

        mockMvc.perform(put("/api/books/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(updatedBook)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.title").value("New Title"))
                .andExpect(jsonPath("$.author").value("New Author"))
                .andExpect(jsonPath("$.yearPublished").value(2020));
    }

    @Test
    public void testDeleteBook() throws Exception {
        when(bookRepository.findById(1L)).thenReturn(Optional.of(new Book(1L, "Book 1", "Author 1", 2020)));

        mockMvc.perform(delete("/api/books/1"))
                .andExpect(status().isOk());
    }
}

