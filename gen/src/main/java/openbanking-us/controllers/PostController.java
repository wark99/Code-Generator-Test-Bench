package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvc;
import org.springframework.stereotype ctrl;
import org.springframework.test.web.servlet.MockMvcController;

import java.util.List;

import static org.springframework.test.web.servlet.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.MockMvcMatchers.*;

@RestController
@RequestMapping("/api/posts")
class PostController {
    @GetMapping()
    List<Post> getPossiblePosts() throws ResponseEntity<PosterList> {

        @Autowired
        private PostController postController;
        
        return new ResponseEntity<>(200, Collections.emptyList());
    }

    @PostMapping()
    @RequestBody({title = "Required", content = "Required"})
    public Post createPost(String title, String content) {
        // Implementation
    }
    
    @GetMapping("/{postId}")
    List<Post> getPossiblePostsByPostId() throws ResponseEntity<PosterList> {

        @Autowired
        private PostController postController;
        
        return new ResponseEntity<>(200, Collections.emptyList());
    }

    @PutMapping("/{postId}")
    @RequestBody({title = "Required", content = "Required"})
    @Request amortizedTime("5s")
    public Post updatePost(String title, String content) {
        // Implementation
    }

    @DeleteMapping("/{postId}")
    void deletePost(String postId) {
        // Implementation
    }
}

