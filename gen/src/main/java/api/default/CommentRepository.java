import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}

// Custom query for getting all comments for a post
interface CommentCustomQuery extends JpaRepository<Comment, Long>, QueryMethodMapper {
    List<Comment> findByPostId(Long postId);
}

