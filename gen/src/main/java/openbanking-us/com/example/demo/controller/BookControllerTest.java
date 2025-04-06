package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private BookRepository bookRepository;

    @BeforeEach
    public void setUp() {
        bookRepository.deleteAll();
    }

    @Test
    public void testGetBooks() throws Exception {
        // Given
        Book book1 = new Book("Book One", "Author A", 2020);
        Book book2 = new Book("Book Two", "Author B", 2021);

        bookRepository.save(book1);
        bookRepository.save(book2);

        // When & Then
        mockMvc.perform(get("/api/books"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].title", is("Book One")))
                .andExpect(jsonPath("$[1].author", is("Author B")));
    }

    @Test
    public void testGetBookById() throws Exception {
        // Given
        Book book = new Book("Book Title", "Author Name", 2022);
        bookRepository.save(book);

        Long id = book.getId();

        // When & Then
        mockMvc.perform(get("/api/books/" + id))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title", is(book.getTitle())));
    }

    @Test
    public void testCreateBook() throws Exception {
        // Given
        Book newBook = new Book("New Book", "New Author", 2023);

        // When & Then
        mockMvc.perform(post("/api/books")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"title\":\"" + newBook.getTitle() +
                        "\", \"author\":\"" + newBook.getAuthor() +
                        "\", \"yearPublished\":" + newBook.getYearPublished() + "}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title", is(newBook.getTitle())));
    }

    @Test
    public void testUpdateBook() throws Exception {
        // Given
        Book existingBook = new Book("Existing Title", "Existing Author", 2020);
        bookRepository.save(existingBook);

        Long id = existingBook.getId();

        Book updatedBook = new Book("Updated Title", "New Author", 2021);

        // When & Then
        mockMvc.perform(put("/api/books/" + id)
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"title\":\"" + updatedBook.getTitle() +
                        "\", \"author\":\"" + updatedBook.getAuthor() +
                        "\", \"yearPublished\":" + updatedBook.getYearPublished() + "}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title", is(updatedBook.getTitle())));
    }

    @Test
    public void testDeleteBook() throws Exception {
        // Given
        Book book = new Book("Deletable Book", "Author to Delete", 2022);
        bookRepository.save(book);

        Long id = book.getId();

        // When & Then
        mockMvc.perform(delete("/api/books/" + id))
                .andExpect(status().isNoContent());

        Optional<Book> deletedBook = bookRepository.findById(id);
        assertThat(deletedBook).doesNotContainValue();
    }
}

