// BookService.java

import java.util.List;

public interface BookService {

    Book createBook(Book book);

    List<Book> getBooks();

    Book getBookById(Long id);

    Book updateBook(Long id, Book updatedBook);

    void deleteBook(Long id);
}

