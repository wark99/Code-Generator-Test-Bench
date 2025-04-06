package com.example.app.tests;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoJUnit;

public class PostModelTest {
    @MockBean(MockFactory.class, (Class) com.example.app.models.PostModel.class)
    public void testCreatePost() throws Exception {
        when(post).setContent("test content").thenReturn(true);

        ResponseEntity<?> response = ...; // Implementation needed

        verify(...);
    }
}

