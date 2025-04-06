package com.example.demo.controller;

import com.example.demo.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        // Reset the user list before each test
        UserController.users.clear();
    }

    @Test
    public void testGetAllUsers() throws Exception {
        User user1 = new User(1L, "Alice", "alice@example.com");
        User user2 = new User(2L, "Bob", "bob@example.com");

        UserController.users.add(user1);
        UserController.users.add(user2);

        mockMvc.perform(MockMvcRequestBuilders.get("/users"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(2))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name").value("Alice"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].email").value("bob@example.com"));
    }

    @Test
    public void testCreateUser() throws Exception {
        String userJson = "{\"id\": 3, \"name\": \"Charlie\", \"email\": \"charlie@example.com\"}";

        mockMvc.perform(MockMvcRequestBuilders.post("/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content(userJson))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(3))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Charlie"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email").value("charlie@example.com"));
    }

    @Test
    public void testGetUserById() throws Exception {
        User user = new User(4L, "David", "david@example.com");
        UserController.users.add(user);

        mockMvc.perform(MockMvcRequestBuilders.get("/users/4"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(4))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("David"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email").value("david@example.com"));
    }

    @Test
    public void testUpdateUser() throws Exception {
        User user = new User(5L, "Eve", "eve@example.com");
        UserController.users.add(user);

        String updatedUserJson = "{\"id\": 5, \"name\": \"Eve Updated\", \"email\": \"updated@eve.example.com\"}";

        mockMvc.perform(MockMvcRequestBuilders.put("/users/5")
                .contentType(MediaType.APPLICATION_JSON)
                .content(updatedUserJson))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(5))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Eve Updated"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email").value("updated@eve.example.com"));
    }

    @Test
    public void testDeleteUser() throws Exception {
        User user = new User(6L, "Frank", "frank@example.com");
        UserController.users.add(user);

        mockMvc.perform(MockMvcRequestBuilders.delete("/users/6"))
                .andExpect(MockMvcResultMatchers.status().isNoContent());
    }
}

