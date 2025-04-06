// BookServiceImpl.java

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private List<Book> books = new ArrayList<>();

    @Override
    public Book createBook(Book book) {
        book.setId(1L);
        books.add(book);
        return book;
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Book getBookById(Long id) {
        for (Book b : books) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    @Override
    public Book updateBook(Long id, Book updatedBook) {
        Book existingBook = getBookById(id);
        if (existingBook != null) {
            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setAuthor(updatedBook.getAuthor());

            return existingBook;
        }
        return null;
    }

    @Override
    public void deleteBook(Long id) {
        for (Book b : books) {
            if (b.getId().equals(id)) {
                books.remove(b);
                return;
            }
        }
    }
}

