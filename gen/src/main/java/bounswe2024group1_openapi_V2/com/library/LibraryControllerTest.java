// TestBookControllerTest.java

package com.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LibraryControllerTest {

    @Mock
    private BookService bookService;

    @InjectMocks
    private LibraryController libraryController;

    @Test
    void testGetAllBooks() {
        // Arrange
        List<Book> books = new ArrayList<>();
        when(bookService.getAllBooks()).thenReturn(books);

        // Act and Assert
        List<Book> result = libraryController.getAllBooks();
        assertEquals(books, result);
    }

    @Test
    void testGetBookById() {
        // Arrange
        Book book = new Book(1, "Test Title", "Author");
        when(bookService.getBookById(1)).thenReturn(Optional.of(book));

        // Act and Assert
        Optional<Book> result = libraryController.getBookById(1);
        assertTrue(result.isPresent());
        assertEquals(book, result.get());
    }

    @Test
    void testAddBook() {
        // Arrange
        Book book = new Book(2, "New Title", "Author");
        when(bookService.addBook(book)).thenReturn(true);

        // Act and Assert
        boolean result = libraryController.addBook(book);
        assertTrue(result);
    }
}

