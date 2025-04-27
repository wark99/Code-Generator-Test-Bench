// com.example.user.controller.TestUserController.java

package com.example.user.controller;

import com.example.user.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class TestUserController {

    private final MockMvc mockMvc;

    @Autowired
    public TestUserController(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    @Test
    public void testGetUserById() throws Exception {
        User user = new User(1L, "John Doe", "johndoe@example.com");
        mockMvc.perform(MockMvcRequestBuilders.get("/api/users/{id}", 1L))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("John Doe"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email").value("johndoe@example.com"));
    }

    @Test
    public void testCreateUser() throws Exception {
        User user = new User(1L, "John Doe", "johndoe@example.com");
        mockMvc.perform(MockMvcRequestBuilders.post("/api/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(user)))
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("John Doe"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email").value("johndoe@example.com"));
    }

    @Test
    public void testUpdateUser() throws Exception {
        User user = new User(1L, "Jane Doe", "janedoe@example.com");
        mockMvc.perform(MockMvcRequestBuilders.put("/api/users/{id}", 1L)
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(user)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Jane Doe"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email").value("janedoe@example.com"));
    }

    @Test
    public void testDeleteUser() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/api/users/{id}", 1L))
                .andExpect(MockMvcResultMatchers.status().isNoContent());
    }
}

