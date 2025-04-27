// src/test/java/com/myapp/controllers/UserControllerTest.java

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock-webserver.MockServer;
import org.springframework.mock.webserver.MockRequest;
import org.springframework.mock.webserver MockResponse;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {
 
    @Autowired
    private UserController controller;
 
    @Test
    public void testGetUserById() throws Exception {
        // setup mock server
        MockServer mockServer = new MockServer();
        mockServer.start();
        
        // create request and response
        MockRequest request = new MockRequest("/users/1");
        MockResponse response = mockServer.enqueue(MockResponse.ok("John Doe"));
 
        // test get user by ID
        assertEquals(response status(), 200);
    }
}

