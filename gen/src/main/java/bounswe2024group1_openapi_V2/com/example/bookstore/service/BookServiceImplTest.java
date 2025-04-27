package com.example.bookstore.service;

import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@SpringBootTest
public class BookServiceImplTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService = new BookServiceImpl(bookRepository);

    private Book book1, book2;

    @BeforeEach
    public void setUp() {
        book1 = new Book();
        book1.setId(1L);
        book1.setTitle("Book One");
        book1.setAuthor("Author A");
        book1.setYearPublished(2000);

        book2 = new Book();
        book2.setId(2L);
        book2.setTitle("Book Two");
        book2.setAuthor("Author B");
        book2.setYearPublished(2010);
    }

    @Test
    public void whenFindAllBooks_thenReturnAllBooks() {
        // Arrange
        List<Book> books = Arrays.asList(book1, book2);
        when(bookRepository.findAll()).thenReturn(books);

        // Act
        List<Book> result = bookService.findAllBooks();

        // Assert
        assertThat(result).containsExactlyInAnyOrder(book1, book2);
    }

    @Test
    public void whenFindBookById_thenReturnBook() {
        // Arrange
        when(bookRepository.findById(1L)).thenReturn(Optional.of(book1));

        // Act
        Optional<Book> result = bookService.findBookById(1L);

        // Assert
        assertThat(result).contains(book1);
    }

    @Test
    public void whenSaveBook_thenReturnSavedBook() {
        // Arrange
        Book newBook = new Book();
        newBook.setTitle("New Book");
        when(bookRepository.save(any(Book.class))).thenAnswer(invocation -> invocation.getArgument(0));

        // Act
        Book result = bookService.saveBook(newBook);

        // Assert
        assertThat(result).isEqualTo(newBook);
    }
}

