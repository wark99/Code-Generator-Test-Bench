// TestBookModelTest.java

package com.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

public class BookTest {

    @Mock
    private Book book;

    @InjectMocks
    private Book model;

    @Test
    void testBookCreation() {
        // Arrange

        // Act and Assert
        assertEquals(book, model);
    }
}

