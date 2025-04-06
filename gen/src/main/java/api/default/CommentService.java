import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    // Create a new comment
    public Comment createComment(Long postId, Comment comment) {
        return commentRepository.save(comment);
    }

    // Get all comments for a post
    public List<Comment> getAllCommentsForPost(Long postId) {
        return commentRepository.findByPostId(postId);
    }
}

