// src/test/java/com/example/controller/UserControllerTest.java

package com.example.controller;

import com.example.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserService userService;

    @Test
    void testGetAllUsers() throws Exception {
        List<User> users = userService.getAllUsers();
        mockMvc.perform(MockRequestBuilders.get("/api/users"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json(users, true));
    }

    @Test
    void testGetUserById() throws Exception {
        User user = userService.getUserById(1L);
        mockMvc.perform(MockRequestBuilders.get("/api/users/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json(user, true));
    }

    @Test
    void testCreateUser() throws Exception {
        User user = new User(1L, "John Doe", "password123", "john@example.com");
        mockMvc.perform(MockRequestBuilders.post("/api/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(user)))
                .andExpect(status().isCreated())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json(user, true));
    }

    @Test
    void testUpdateUser() throws Exception {
        User user = new User(1L, "Jane Doe", "password456", "jane@example.com");
        mockMvc.perform(MockRequestBuilders.put("/api/users/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(user)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json(user, true));
    }

    @Test
    void testDeleteUser() throws Exception {
        mockMvc.perform(MockRequestBuilders.delete("/api/users/1"))
                .andExpect(status().isNoContent());
    }
}

