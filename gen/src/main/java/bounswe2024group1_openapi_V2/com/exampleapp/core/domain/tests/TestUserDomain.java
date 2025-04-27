<<<<<<< SEARCH
=======
package com.exampleapp.core.domain.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestUserDomain {

    @BeforeEach
    void setUp() {
        when(UserDomain.class).createUser().thenReturn(null);
    }

    @Test
    public void testCreateUser_Success() throws Exception {
        UserDomain<User> domain = new UserDomain<>();
        User user = domain.createUser(new User("test", "user@example.com"));
        
        assertTrue(user != null);
        assertNotNull(user.username);
    }
}
>>>>>>> REPLACE

