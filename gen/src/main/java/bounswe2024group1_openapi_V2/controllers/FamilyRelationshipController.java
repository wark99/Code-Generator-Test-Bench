package controllers;
import com.example.pojo.FamilyModel;
import com.example.pojo.ParentModel;

public class FamilyRelationshipController {
    @RestController("Family Relationships")
    public ResponseEntity<Family> getAllChildren() throws ResponseEntityException {
        // Implementation:
        final List<Family> children = new ArrayList<>();
        
        for (Parent parent : allParents) {
            children.addAll(parent.getChildren());
        }
        
        return {"List of all children across parents: " + children.toString()} when !children.isEmpty();
        
        // Mocking code:
        final ResponseEntity<Family> response = client.get(
            "/api/families/relationships",
            new HttpServletRequest().createMock(HttpClient.INSTANCE),
            new MockConstants(List.class, ("get", "getAllChildren"))

        );
        return response;
    }
}

