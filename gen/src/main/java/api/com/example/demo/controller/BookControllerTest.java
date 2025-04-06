package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.Optional;

import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(BookController.class)
public class BookControllerTest {

    @MockBean
    private BookService bookService;

    @InjectMocks
    private MockMvc mockMvc;

    private Book testBook;

    @BeforeEach
    void setUp() {
        testBook = new Book("Effective Java", "Joshua Bloch", 2008);
    }

    @Test
    public void getAllBooks_ShouldReturnAllBooks() throws Exception {
        when(bookService.findAll()).thenReturn(Collections.singletonList(testBook));

        mockMvc.perform(get("/api/books"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$[0].title", is("Effective Java")));
    }

    @Test
    public void getBookById_ShouldReturnBook_WhenBookExists() throws Exception {
        when(bookService.findById(anyLong())).thenReturn(testBook);

        mockMvc.perform(get("/api/books/{id}", testBook.getId()))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.title", is("Effective Java")));
    }

    @Test
    public void getBookById_ShouldReturnNotFound_WhenBookDoesNotExist() throws Exception {
        when(bookService.findById(anyLong())).thenReturn(null);

        mockMvc.perform(get("/api/books/{id}", 999L))
               .andExpect(status().isNotFound());
    }

    @Test
    public void createBook_ShouldSaveAndReturnBook() throws Exception {
        doReturn(testBook).when(bookService).save(any(Book.class));

        mockMvc.perform(post("/api/books")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"title\":\"Effective Java\",\"author\":\"Joshua Bloch\",\"yearPublished\":2008}"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.title", is("Effective Java")));
    }

    @Test
    public void updateBook_ShouldUpdateAndReturnUpdatedBook() throws Exception {
        doReturn(testBook).when(bookService).save(any(Book.class));

        mockMvc.perform(put("/api/books/{id}", testBook.getId())
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"title\":\"Clean Code\",\"author\":\"Robert C. Martin\",\"yearPublished\":2008}"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.title", is("Clean Code")));
    }

    @Test
    public void deleteBook_ShouldDeleteAndReturnNoContent() throws Exception {
        doNothing().when(bookService).delete(anyLong());

        mockMvc.perform(delete("/api/books/{id}", testBook.getId()))
               .andExpect(status().isNoContent());
    }
}

