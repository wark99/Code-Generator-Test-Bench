@Service
public class BlogServiceImpl implements BlogRepository {
    private final List<Blog> blogs = new ArrayList<>();

    @Override
    public List<Blog> findAll() {
        return blogs;
    }

    @Override
    public Blog findById(Long id) {
        for (Blog blog : blogs) {
            if (blog.getId().equals(id)) {
                return blog;
            }
        }
        return null;
    }

    @Override
    public Blog create(Blog blog) {
        blogs.add(blog);
        return blog;
    }

    @Override
    public Blog update(Blog blog) {
        for (Blog existingBlog : blogs) {
            if (existingBlog.getId().equals(blog.getId())) {
                existingBlog.setTitle(blog.getTitle());
                existingBlog.setContent(blog.getContent());
                return existingBlog;
            }
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        blogs.removeIf(blog -> blog.getId().equals(id));
    }
}

