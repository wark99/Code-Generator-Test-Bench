@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogTest {
    @Autowired
    private BlogRepository repository;

    @Test
    public void testCreateBlog() {
        Blog blog = new Blog(1L, "My First Blog", "This is my first blog post.");
        Blog createdBlog = (Blog) repository.create(blog);
        assertNotNull(createdBlog);
        assertEquals("My First Blog", createdBlog.getTitle());
        assertEquals("This is my first blog post.", createdBlog.getContent());
    }

    @Test
    public void testUpdateBlog() {
        Blog blog = new Blog(1L, "My Updated Blog", "This is my updated blog post.");
        repository.create(blog);
        Blog updatedBlog = (Blog) repository.findById(1L);
        assertNotNull(updatedBlog);
        assertEquals("My Updated Blog", updatedBlog.getTitle());
        assertEquals("This is my updated blog post.", updatedBlog.getContent());
    }

    @Test
    public void testDeleteBlog() {
        Blog blog = new Blog(1L, "My First Blog", "This is my first blog post.");
        repository.create(blog);
        repository.deleteById(1L);
        assertNull(repository.findById(1L));
    }
}

