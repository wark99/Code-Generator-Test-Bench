import java.util.ArrayList;
import java.util.List;

public class BookService {
    private List<Book> books = new ArrayList<>();

    public Iterable<Book> getAllBooks() {
        return books;
    }

    public Book getBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public Book createBook(Book book) {
        book.setId(books.size() + 1);
        books.add(book);
        return book;
    }

    public Book updateBook(int id, Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.set(i, book);
                break;
            }
        }
        return null;
    }

    public void deleteBook(int id) {
        books.removeIf(book -> book.getId() == id);
    }
}

