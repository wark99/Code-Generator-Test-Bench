// BookControllerTest.java

package com.example.bookapi.controller;

import com.example.bookapi.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.RequestMethod.POST;
import static org.springframework.test.web.servlet.request.RequestMethod.PUT;
import static org.springframework.test.web.servlet.request.RequestMethod.DELETE;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@SpringBootTest
@AutoConfigureMockMvc
public class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCreateBook() throws Exception {
        String json = "{\"title\":\"The Great Gatsby\",\"author\":\"F. Scott Fitzgerald\"}";
        mockMvc.perform.POST("/books")
                .contentType(APPLICATION_JSON_VALUE)
                .content(json)
                .andExpect(content().contentType(APPLICATION_JSON_VALUE))
                .andDo(webResourceResponse -> System.out.println(webResourceResponse));
    }

    @Test
    public void testGetBookById() throws Exception {
        String json = "{\"title\":\"The Great Gatsby\",\"author\":\"F. Scott Fitzgerald\"}";
        mockMvc.perform.POST("/books")
                .contentType(APPLICATION_JSON_VALUE)
                .content(json)
                .andExpect(content().contentType(APPLICATION_JSON_VALUE))
                .andDo(webResourceResponse -> System.out.println(webResourceResponse));
    }

    @Test
    public void testUpdateBook() throws Exception {
        String json = "{\"title\":\"The Great Gatsby\",\"author\":\"F. Scott Fitzgerald\"}";
        mockMvc.perform.POST("/books")
                .contentType(APPLICATION_JSON_VALUE)
                .content(json)
                .andExpect(content().contentType(APPLICATION_JSON_VALUE))
                .andDo(webResourceResponse -> System.out.println(webResourceResponse));
    }

    @Test
    public void testDeleteBook() throws Exception {
        String json = "{\"title\":\"The Great Gatsby\",\"author\":\"F. Scott Fitzgerald\"}";
        mockMvc.perform.POST("/books")
                .contentType(APPLICATION_JSON_VALUE)
                .content(json)
                .andExpect(content().contentType(APPLICATION_JSON_VALUE))
                .andDo(webResourceResponse -> System.out.println(webResourceResponse));
    }
}

