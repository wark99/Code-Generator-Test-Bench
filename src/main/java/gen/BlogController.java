package gen;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @PostMapping("/create")
    public ResponseEntity<?> createBlog(@RequestBody CreateBlogRequest createBlogRequest) {
        // Implement your logic here
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/user/{user_id}")
    public ResponseEntity<?> getUserPost(@PathVariable("user_id") String userId) {
        // Implement your logic here
        return ResponseEntity.ok().build();
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllBlog() {
        // Implement your logic here
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{blog_id}")
    public ResponseEntity<?> deleteUserPost(@PathVariable("blog_id") String blogId) {
        // Implement your logic here
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{user_id}")
    public ResponseEntity<?> updateBlog(@PathVariable("user_id") String userId, @RequestBody UpdateBlogRequest updateBlogRequest) {
        // Implement your logic here
        return ResponseEntity.ok().build();
    }

    @GetMapping("/comments/{blog_id}")
    public ResponseEntity<?> getBlogComments(@PathVariable("blog_id") String blogId) {
        // Implement your logic here
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/comment/{blog_id}")
    public ResponseEntity<?> addComment(@PathVariable("blog_id") String blogId, @RequestBody UpdateCommentRequest updateCommentRequest) {
        // Implement your logic here
        return ResponseEntity.ok().build();
    }
}

