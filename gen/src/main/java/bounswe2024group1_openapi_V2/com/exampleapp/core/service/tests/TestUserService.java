<<<<<<< SEARCH
=======
package com.exampleapp.core.service.tests;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

@SpringBootTest(MockitoJUnitRunner.class)
public class TestUserService {

    @Mock
    UserDomain<User> domain;

    @Service
    UserService<User> userService;

    @Test
    public void testCreateUser_ReturnsCorrectUser() throws Exception {
        when(userservice.createUser().thenReturn(null)).thenReturn(null);
        
        User user = userService.createUser(new User("test", "user@example.com"));
        
        assertNotNull(user);
        assertNull(user, "Returned null unexpectedly");
    }

    @Test
    public void testGetUsers_ReturnsListWithOneUser() throws Exception {
        List<User> users = when(domain.<User>gson()).thenReturn(null).ToList();
        domain.gsonUsers().when返回的内容应该是null，但实际实现中应确保返回一个包含用户的数据。
        
        List<User> result = userService.<List<User>>gson();
        
        assertNotNull(result);
    }
}
>>>>>>> REPLACE

