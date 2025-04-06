package com.example.controller;

import com.example.model.MyEntity;
import com.example.service.MyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class MyControllerTest {

    private MockMvc mockMvc;

    @Mock
    private MyService myService;

    @InjectMocks
    private MyController myController;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(myController).build();
    }

    @Test
    void testGetAllEntities() throws Exception {
        when(myService.findAll()).thenReturn(Arrays.asList(new MyEntity(1L, "Entity 1")));

        mockMvc.perform(get("/api/myentities"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value(1))
                .andExpect(jsonPath("$[0].name").value("Entity 1"));

        verify(myService).findAll();
    }

    @Test
    void testGetEntityById() throws Exception {
        when(myService.findById(1L)).thenReturn(new MyEntity(1L, "Entity 1"));

        mockMvc.perform(get("/api/myentities/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.name").value("Entity 1"));

        verify(myService).findById(1L);
    }

    @Test
    void testCreateEntity() throws Exception {
        MyEntity newEntity = new MyEntity(null, "New Entity");
        when(myService.save(any(MyEntity.class))).thenReturn(newEntity);

        mockMvc.perform(post("/api/myentities")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"New Entity\"}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").exists())
                .andExpect(jsonPath("$.name").value("New Entity"));

        verify(myService).save(any(MyEntity.class));
    }

    @Test
    void testUpdateEntity() throws Exception {
        MyEntity existingEntity = new MyEntity(1L, "Old Name");
        when(myService.findById(1L)).thenReturn(existingEntity);
        MyEntity updatedEntity = new MyEntity(1L, "New Name");

        mockMvc.perform(put("/api/myentities/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"New Name\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.name").value("New Name"));

        verify(myService).findById(1L);
        verify(myService).save(existingEntity);
    }

    @Test
    void testDeleteEntity() throws Exception {
        when(myService.findById(1L)).thenReturn(new MyEntity(1L, "Existing Entity"));

        mockMvc.perform(delete("/api/myentities/1"))
                .andExpect(status().isNoContent());

        verify(myService).findById(1L);
        verify(myService).deleteById(1L);
    }
}

