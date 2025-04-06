package com.example.app.tests;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoJUnit;

public class CategoryModelTest {
    @MockBean(MockFactory.class, (Class) com.example.app.models.CategoryModel.class)
    public void testAddCategory() throws Exception {
        when(category).setName("test category").thenReturn(true);

        ResponseEntity<?> response = ...; // Implementation needed

        verify(...);
    }
}

