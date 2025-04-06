@RestController
@RequestMapping("/api/blogs")
public class BlogController {
    private final BlogRepository repository;

    @Autowired
    public BlogController(BlogRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Blog> getAllBlogs() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Blog getBlogById(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping
    public Blog createBlog(@RequestBody Blog blog) {
        return repository.create(blog);
    }

    @PutMapping("/{id}")
    public Blog updateBlog(@PathVariable Long id, @RequestBody Blog updatedBlog) {
        Blog existingBlog = repository.findById(id);
        if (existingBlog != null) {
            existingBlog.setTitle(updatedBlog.getTitle());
            existingBlog.setContent(updatedBlog.getContent());
            return existingBlog;
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteBlog(@PathVariable Long id) {
        repository.deleteById(id);
    }
}

