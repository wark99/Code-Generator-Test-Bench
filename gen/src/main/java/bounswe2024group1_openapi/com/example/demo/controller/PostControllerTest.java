package com.example.demo.controller;

import com.example.demo.model.Post;
import com.example.demo.service.PostService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(PostController.class)
public class PostControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PostService postService;

    private Post testPost;

    @BeforeEach
    public void setUp() {
        testPost = new Post(1L, "Sample Title", "Sample Content", "John Doe");
    }

    @Test
    public void createPost_ShouldReturnCreatedPost() throws Exception {
        when(postService.createPost(any(Post.class))).thenReturn(testPost);

        mockMvc.perform(post("/api/posts")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"title\": \"Sample Title\", \"content\": \"Sample Content\", \"author\": \"John Doe\"}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.title").value("Sample Title"))
                .andExpect(jsonPath("$.content").value("Sample Content"))
                .andExpect(jsonPath("$.author").value("John Doe"));
    }

    @Test
    public void getAllPosts_ShouldReturnAllPosts() throws Exception {
        List<Post> posts = List.of(testPost);
        when(postService.getAllPosts()).thenReturn(posts);

        mockMvc.perform(get("/api/posts"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value(1L))
                .andExpect(jsonPath("$[0].title").value("Sample Title"))
                .andExpect(jsonPath("$[0].content").value("Sample Content"))
                .andExpect(jsonPath("$[0].author").value("John Doe"));
    }

    @Test
    public void getPostById_ShouldReturnPost() throws Exception {
        when(postService.getPostById(1L)).thenReturn(Optional.of(testPost));

        mockMvc.perform(get("/api/posts/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.title").value("Sample Title"))
                .andExpect(jsonPath("$.content").value("Sample Content"))
                .andExpect(jsonPath("$.author").value("John Doe"));
    }

    @Test
    public void updatePost_ShouldReturnUpdatedPost() throws Exception {
        Post updatedPost = new Post(1L, "Updated Title", "Updated Content", "Jane Doe");
        when(postService.updatePost(1L, updatedPost)).thenReturn(updatedPost);

        mockMvc.perform(put("/api/posts/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"title\": \"Updated Title\", \"content\": \"Updated Content\", \"author\": \"Jane Doe\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.title").value("Updated Title"))
                .andExpect(jsonPath("$.content").value("Updated Content"))
                .andExpect(jsonPath("$.author").value("Jane Doe"));
    }

    @Test
    public void deletePost_ShouldReturnNoContent() throws Exception {
        when(postService.deletePost(1L)).thenReturn(true);

        mockMvc.perform(delete("/api/posts/1"))
                .andExpect(status().isNoContent());
    }
}

