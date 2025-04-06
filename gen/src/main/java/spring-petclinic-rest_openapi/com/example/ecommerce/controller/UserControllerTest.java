// UserControllerTest.java

package com.example.ecommerce.controller;

import com.example.ecommerce.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllUsers() throws Exception {
        when(mvc.perform(MockRequestBuilders.get("/api/users")))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andReturn();
    }

    @Test
    public void test GetUserById() throws Exception {
        User user = new User(1L, "John Doe", "john.doe@example.com");
        when(mvc.perform(MockRequestBuilders.get("/api/users/1")))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(matchingJsonPath("$.id").value("1"))
                .andExpect(matchingJsonPath("$.name").value("John Doe"))
                .andExpect(matchingJsonPath("$.email").value("john.doe@example.com"));
    }

    @Test
    public void testCreateUser() throws Exception {
        User user = new User(1L, "Jane Doe", "jane.doe@example.com");
        when(mvc.perform(MockRequestBuilders.post("/api/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(user))))
                .andExpect(status().isCreated())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andReturn();
    }

    @Test
    public void testUpdateUser() throws Exception {
        User user = new User(1L, "John Doe", "john.doe@example.com");
        when(mvc.perform(MockRequestBuilders.put("/api/users/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(user))))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    public void testDeleteUser() throws Exception {
        when(mvc.perform(MockRequestBuilders.delete("/api/users/1")))
                .andExpect(status().isNoContent());
    }
}

