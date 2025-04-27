// src/test/java/com/example/user/controller/UserControllerTest.java

package com.example.user.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllUsers() throws Exception {
        // Arrange and Act
        this.mockMvc.perform(get("/api/users"))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetUserById() throws Exception {
        // Arrange and Act
        User user = new User();
        user.setId(1L);
        user.setName("John Doe");
        user.setEmail("johndoe@example.com");

        this.mockMvc.perform(get("/api/users/1"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1L))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("John Doe"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email").value("johndoe@example.com"));
    }

    @Test
    public void testCreateUser() throws Exception {
        // Arrange and Act
        User user = new User();
        user.setName("Jane Doe");
        user.setEmail("janedoe@example.com");

        this.mockMvc.perform(post("/api/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"Jane Doe\",\"email\":\"janedoe@example.com\"}"))
                .andExpect(status().isCreated());
    }

    @Test
    public void testUpdateUser() throws Exception {
        // Arrange and Act
        User user = new User();
        user.setId(1L);
        user.setName("John Doe");
        user.setEmail("johndoe@example.com");

        this.mockMvc.perform(put("/api/users/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"Jane Doe\",\"email\":\"janedoe@example.com\"}"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1L))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Jane Doe"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email").value("janedoe@example.com"));
    }

    @Test
    public void testDeleteUser() throws Exception {
        // Arrange and Act
        this.mockMvc.perform(delete("/api/users/1"))
                .andExpect(status().isNoContent());
    }
}

