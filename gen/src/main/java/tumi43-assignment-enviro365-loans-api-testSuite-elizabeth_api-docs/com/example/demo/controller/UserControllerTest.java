package com.example.demo.controller;

import com.example.demo.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private User user1;
    private User user2;

    @BeforeEach
    public void setUp() {
        user1 = new User(1L, "Alice", "alice@example.com");
        user2 = new User(2L, "Bob", "bob@example.com");
    }

    @Test
    public void testGetAllUsers() throws Exception {
        mockMvc.perform(get("/users"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.length()").value(0));
    }

    @Test
    public void testCreateUser() throws Exception {
        String userJson = "{\"name\":\"Alice\", \"email\":\"alice@example.com\"}";

        mockMvc.perform(post("/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content(userJson))
               .andExpect(status().isCreated())
               .andExpect(jsonPath("$.id").value(1));
    }

    @Test
    public void testGetUserById() throws Exception {
        String userJson = "{\"id\":2, \"name\":\"Bob\", \"email\":\"bob@example.com\"}";
        mockMvc.perform(post("/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content(userJson))
               .andExpect(status().isCreated());

        mockMvc.perform(get("/users/2"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.id").value(2));
    }

    @Test
    public void testUpdateUser() throws Exception {
        String userJson = "{\"id\":1, \"name\":\"Alice\", \"email\":\"alice@example.com\"}";
        mockMvc.perform(post("/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content(userJson))
               .andExpect(status().isCreated());

        String updatedUserJson = "{\"id\":1, \"name\":\"Alicia\", \"email\":\"alicia@example.com\"}";
        mockMvc.perform(put("/users/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(updatedUserJson))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.name").value("Alicia"));
    }

    @Test
    public void testDeleteUser() throws Exception {
        String userJson = "{\"id\":3, \"name\":\"Charlie\", \"email\":\"charlie@example.com\"}";
        mockMvc.perform(post("/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content(userJson))
               .andExpect(status().isCreated());

        mockMvc.perform(delete("/users/3"))
               .andExpect(status().isOk());
    }
}

