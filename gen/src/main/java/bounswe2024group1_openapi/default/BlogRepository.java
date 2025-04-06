public interface BlogRepository {
    List<Blog> findAll();
    Blog findById(Long id);
    Blog create(Blog blog);
    Blog update(Blog blog);
    void deleteById(Long id);
}

