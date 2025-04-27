package controllers;
import com.example.pojo.FamilyModel;

import org.springframework.http.ResponseEntity HTTPRequest;
import org.springframework.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.MockMvcListener.*;

public class FamilySearchController {
    @RestController("Family Search")
    public ResponseEntity<String> searchFamilies(@RequestParam("/name") String name) throws ResponseEntityException {
        // Implementation: 
        return {"Families found with the given name: " + names.toString()} when names size > 0;
        
        // Mocking code:
        final ResponseEntity<String> response = client.get(
            "/api/families/search",
            new HttpServletRequest().createMock(HttpClient.INSTANCE),
            new MockConstants(HashMap.class, ("name", "searchFamilies"))

        );
        return response;
    }
}

