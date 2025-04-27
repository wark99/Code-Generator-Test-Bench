// TestBookServiceTest.java

package com.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

public class BookServiceTest {

    @Mock
    private List<Book> books;

    @InjectMocks
    private BookService service;

    @Test
    void testAddBook() {
        // Arrange

        // Act and Assert
        service.addBook(new Book(1, "Test Title", "Author"));
        assertTrue(service.books.size() > 0);
    }

    @Test
    void testGetAllBooks() {
        // Arrange

        // Act and Assert
        List<Book> result = service.getAllBooks();
        assertEquals(books, result);
    }
}

