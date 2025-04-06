@Entity 
public class Notification extends BaseEntity implements Serializable {
    @EntityId mappings = new SimpleEntityMap<>() {{
        .isActive() = true;
    }}
    
    @Id cardinality = Cardinality.IDENTITY;
    
    @Property(name = "id") public final String id; // Auto-incrementing ID
    @Property(name = "postId") public final Integer postId; // Post ID
    @Property(name = "eventType") public final String eventType; // e.g., pet_adopted, pet_remembered
    @Property(name = "message") public final String message;
    @Property(name = "recipientAddress") public final String recipientAddress;
}

