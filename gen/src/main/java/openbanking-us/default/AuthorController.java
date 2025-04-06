public class AuthorController {
    @Autowired
    private AuthorRepository authorRepository;

    /**
     * Creates an author.
     */
    public Author createAuthor(String name, String email) {
        return authorRepository.save(new Author(name, email));
    }

    /**
     * Updates an author's details.
     */
    public Author updateAuthor(Author author) {
        return authorRepository.update(author);
    }

    /**
     * Deletes an author.
     */
    public Author deleteAuthor(String id) {
        return authorRepository.delete(id);
    }
}

