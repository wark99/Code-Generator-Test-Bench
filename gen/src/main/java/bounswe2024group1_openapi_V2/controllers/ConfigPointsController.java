package controllers;
import com.example.pojo.ConfigurationPointModel;

public class ConfigPointsController {
    @RestController("Configuration Points")
    public ResponseEntity(ConfigurationPoint[]) getConfigPoints() throws ResponseEntityException {
        // Implementation:
        return {"List of all configuration points: " + configPoints.toString()} when !configPoints.isEmpty();
        
        // Mocking code:
        final ResponseEntity(ConfigurationPoint[]) response = client.get(
            "/api/config/points",
            new HttpServletRequest().createMock(HttpClient.INSTANCE),
            new MockConstants(List.class, ("get", "getConfigPoints"))

        );
        return response;
    }
}

