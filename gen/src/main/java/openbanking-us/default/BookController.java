import java.util.ArrayList;
import java.util.List;

public class BookController {
    private List<Book> books = new ArrayList<>();
    
    // Add a book to the list
    public void addBook(Book book) {
        books.add(book);
    }

    // Get all books
    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    // Find a book by ID
    public Book findBookById(Long id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }
    
    // Delete a book by ID
    public boolean deleteBook(Long id) {
        return books.removeIf(book -> book.getId().equals(id));
    }
}

