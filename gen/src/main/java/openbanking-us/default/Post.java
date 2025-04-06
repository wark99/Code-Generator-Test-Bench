@Entity
public interface Post extends JpaRepository {
    @Id
    public Long id;
    
    @Column(nullable = false, unique = true)
    public String title;
    
    @Column(nullable = false, unique = true)
    public String content;
    
    @OneToOne(binaryColumns = true)
    @JoinColumn(name = "user.id")
    public User user;
    
    @Column(nullable = false)
    public String date;
}

@Entity
public class PostController extends JpaRepositoryController {
    @GetMapping("/api/posts")
    public List<Post> getPossiblePosts() throws IOException {
        return load(PossiblePostController.class);
    }

    @PostMapping("/api/posts", {title = "Required", content = "Required"})
    public Post createPost(@Body body) throws IOException {
        return map(from(body));
    }
    
    @GetMapping("/api/posts/{postId}")
    public Post getPost(@PathVariable Long postId) throws IOException {
        return load(PossiblePostController.class);
    }

    @PutMapping("/api/posts/{postId}", {title = "Required", content = "Required"})
    public Post updatePost(@BodyAndPath bodyAndPath, @PathVariable Long postId)
            throws IOException {
        return map(from(bodyAndPath));
    }

    @DeleteMapping("/api/posts/{postId}")
    public void deletePost(@PathVariable Long postId) throws IOException {
        return map();
    }
}

