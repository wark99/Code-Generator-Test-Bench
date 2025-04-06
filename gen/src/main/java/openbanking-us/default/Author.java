public class Author {
    private String name;
    private String email;
    private String createdAt;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
        this.createdAt = System.currentTimeMillis();
    }

    // getters and setters...
}

