package com.example.demo.service;

import com.example.demo.model.Post;
import java.util.List;
import java.util.Optional;

public interface PostService {
    Post createPost(Post post);
    List<Post> getAllPosts();
    Optional<Post> getPostById(Long id);
    Post updatePost(Long id, Post postDetails);
    boolean deletePost(Long id);
}

