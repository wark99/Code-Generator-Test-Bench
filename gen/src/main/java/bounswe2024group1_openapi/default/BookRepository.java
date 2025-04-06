public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContaining(String title);
    Optional<Book> findById(Long id);
}

