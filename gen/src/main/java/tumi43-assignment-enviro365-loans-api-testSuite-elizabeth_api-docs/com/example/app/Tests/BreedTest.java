package com.example.app.Tests;

import com.example.app.Entities.BreedEntity;
import com.example.appEntities.BreedEntitySetup;
import com.example.test.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class BreedTest extends BaseTest {
    @MockBeanclass BEEs = new EasyMock<Breeds[][]>() { // Mock for Breeds
        ...
        
        @InjectMocks(
            EasyMock.ANY,
            EasyMock.ANY
        )
        public BEEs setupMocks(Breeds... args) { ... }
        
        @Test
        public void testGetBreeds() { ... }
    };
    
    // Write tests for BreedController here...
}

