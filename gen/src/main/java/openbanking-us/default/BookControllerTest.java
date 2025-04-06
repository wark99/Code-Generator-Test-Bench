import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookControllerTest {

    private BookController controller;

    @BeforeEach
    public void setUp() {
        controller = new BookController();
    }

    @Test
    public void testAddAndGetAllBooks() {
        Book book1 = new Book(1L, "The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book(2L, "1984", "George Orwell", 1949);

        controller.addBook(book1);
        controller.addBook(book2);

        List<Book> books = controller.getAllBooks();
        
        assertEquals(2, books.size());
        assertTrue(books.contains(book1));
        assertTrue(books.contains(book2));
    }

    @Test
    public void testFindBookById() {
        Book book = new Book(1L, "To Kill a Mockingbird", "Harper Lee", 1960);
        controller.addBook(book);

        Book foundBook = controller.findBookById(1L);

        assertNotNull(foundBook);
        assertEquals("To Kill a Mockingbird", foundBook.getTitle());
    }

    @Test
    public void testDeleteBook() {
        Book book = new Book(1L, "Brave New World", "Aldous Huxley", 1932);
        controller.addBook(book);

        boolean isDeleted = controller.deleteBook(1L);

        assertTrue(isDeleted);
        assertNull(controller.findBookById(1L));
    }

    @Test
    public void testDeleteNonExistentBook() {
        Book book = new Book(1L, "Moby Dick", "Herman Melville", 1851);
        controller.addBook(book);

        boolean isDeleted = controller.deleteBook(2L);

        assertFalse(isDeleted);
        assertNotNull(controller.findBookById(1L));
    }
}

