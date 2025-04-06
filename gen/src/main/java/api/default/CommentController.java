import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    // Create a new comment
    @PostMapping("/{postId}")
    public ResponseEntity<Comment> createComment(@PathVariable Long postId, @RequestBody Comment comment) {
        return new ResponseEntity<>(commentService.createComment(postId, comment), HttpStatus.CREATED);
    }

    // Get all comments for a post
    @GetMapping("/{postId}")
    public ResponseEntity<List<Comment>> getAllCommentsForPost(@PathVariable Long postId) {
        List<Comment> comments = commentService.getAllCommentsForPost(postId);
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }
}

