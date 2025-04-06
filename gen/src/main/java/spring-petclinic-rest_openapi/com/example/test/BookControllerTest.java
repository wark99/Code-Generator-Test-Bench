package com.example.test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest(dataProvider = "dataProvider")
public class BookControllerTest {

    @Autowired
    private Book.Book.Book bookUnderTest;

    @GetMapping("/books")
    List<Book> books = BookController.getBooks();

    when(books).thenReturn(null);

    verifyThat(books, isa(List.class));
}

