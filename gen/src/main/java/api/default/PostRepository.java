import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}

// Custom query for getting all posts
interface PostCustomQuery extends JpaRepository<Post, Long>, QueryMethodMapper {
    List<Post> findByTitleContaining(String title);
}

