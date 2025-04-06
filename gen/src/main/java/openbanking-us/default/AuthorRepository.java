public class AuthorRepository {
    private static final String DB_NAME = "authors";

    @Override
    public Author save(Author author) {
        return htablePut(DB_NAME, new Author(author.name, author.email));
    }

    // Other repository methods...
}

