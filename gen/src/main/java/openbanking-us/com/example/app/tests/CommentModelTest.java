package com.example.app.tests;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoJUnit;

public class CommentModelTest {
    @MockBean(MockFactory.class, (Class) com.example.app.models.CommentModel.class)
    public void testCreateComment() throws Exception {
        when(comment).setAuthor("test user").thenReturn(true);

        ResponseEntity<?> response = ...; // Implementation needed

        verify(...);
    }
}

