@RunWith(SpringRunner.class)
@SpringBootTest
public class BookTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private BookRepository bookRepository;

    @Before
    public void setup() {
        // Clear database before each test
        bookRepository.deleteAll();
    }

    @Test
    public void testGetAllBooks() {
        Book book1 = new Book("Book 1", "Author 1", 100);
        Book book2 = new Book("Book 2", "Author 2", 200);

        bookRepository.save(book1);
        bookRepository.save(book2);

        List<Book> books = restTemplate.getForObject("/api/books", Book.class);
        assertEquals(2, books.size());
    }

    @Test
    public void testGetBookById() {
        Book book = new Book("Book 1", "Author 1", 100);

        bookRepository.save(book);

        Optional<Book> bookOptional = restTemplate.getForObject("/api/books/1", Book.class);
        assertNotNull(bookOptional);
        assertEquals(book, bookOptional.get());
    }

    @Test
    public void testAddBook() {
        Book book = new Book("New Book", "Author 3", 300);

        restTemplate.postForObject("/api/books", book, Book.class);

        List<Book> books = restTemplate.getForObject("/api/books", Book.class);
        assertEquals(3, books.size());
    }

    @Test
    public void testDeleteBook() {
        Book book = new Book("Book 1", "Author 1", 100);

        bookRepository.save(book);

        restTemplate.delete("/api/books/1");

        List<Book> books = restTemplate.getForObject("/api/books", Book.class);
        assertEquals(2, books.size());
    }
}

