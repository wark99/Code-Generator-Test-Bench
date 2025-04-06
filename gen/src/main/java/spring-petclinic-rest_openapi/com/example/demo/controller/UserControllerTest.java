package com.example.demo.controller;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.Arrays;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    private User testUser;

    @BeforeEach
    public void setUp() {
        testUser = new User("John Doe", "john.doe@example.com");
    }

    @Test
    public void testGetAllUsers() throws Exception {
        when(userService.findAllUsers()).thenReturn(Arrays.asList(testUser));

        mockMvc.perform(get("/api/users"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("John Doe"));
        
        verify(userService, times(1)).findAllUsers();
    }

    @Test
    public void testGetUserById() throws Exception {
        when(userService.findUserById(1L)).thenReturn(Optional.of(testUser));

        mockMvc.perform(get("/api/users/{id}", 1))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("John Doe"));
        
        verify(userService, times(1)).findUserById(1L);
    }

    @Test
    public void testCreateUser() throws Exception {
        when(userService.saveUser(testUser)).thenReturn(testUser);

        mockMvc.perform(post("/api/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"John Doe\",\"email\":\"john.doe@example.com\"}"))
                .andExpect(status().isCreated());
        
        verify(userService, times(1)).saveUser(any(User.class));
    }

    @Test
    public void testUpdateUser() throws Exception {
        when(userService.findUserById(1L)).thenReturn(Optional.of(testUser));

        mockMvc.perform(put("/api/users/{id}", 1)
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"Jane Doe\",\"email\":\"jane.doe@example.com\"}"))
                .andExpect(status().isOk());
        
        verify(userService, times(1)).findUserById(1L);
    }

    @Test
    public void testDeleteUser() throws Exception {
        when(userService.findUserById(1L)).thenReturn(Optional.of(testUser));

        mockMvc.perform(delete("/api/users/{id}", 1))
                .andExpect(status().isOk());
        
        verify(userService, times(1)).deleteUser(1L);
    }
}

