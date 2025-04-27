// BookDetailControllerTest.java
package com.example.bookapi.controller;

import com.example.bookapi.model.BookDetail;
import com.example.bookapi.service.BookDetailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BookDetailControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private BookDetailService bookDetailService;

    @Test
    public void testGetBookDetails() throws Exception {
        BookDetail bookDetail = bookDetailService.getBookDetails(1L);
        mockMvc.perform(get("/api/books/1/details"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(content().content(toJson(bookDetail)));
    }

    @Test
    public void testCreateBookDetail() throws Exception {
        Book book = new Book("Book Title", "Author Name", 100);
        BookDetail bookDetail = new BookDetail(1L, "Isbn123", 2020);
        mockMvc.perform(post("/api/books/1/details")
                .contentType(MediaType.APPLICATION_JSON)
                .content(toJson(bookDetail)))
                .andExpect(status().isCreated())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
    }

    @Test
    public void testUpdateBookDetail() throws Exception {
        Book book = new Book("Updated Title", "Author Name", 100);
        BookDetail bookDetail = new BookDetail(1L, "Isbn123", 2020);
        mockMvc.perform(put("/api/books/1/details")
                .contentType(MediaType.APPLICATION_JSON)
                .content(toJson(bookDetail)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
    }

    @Test
    public void testDeleteBookDetail() throws Exception {
        bookDetailService.createBookDetail(1L, new BookDetail(1L, "Isbn123", 2020));
        mockMvc.perform(delete("/api/books/1/details"))
                .andExpect(status().isNoContent());
    }
}

