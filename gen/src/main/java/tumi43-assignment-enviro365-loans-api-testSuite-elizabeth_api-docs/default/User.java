@Entity
public class User {
    
    @Id
    public static final String ID = "id";
    
    @GeneratedValue(strategyValue = GenerationType.IDENTITY)
    private Long id;
    
    @Property
    private String name;
    
    @Property
    private String email;
    
    @Property
    private Timestamp createdAt;

    // Getters and setters can be generated automatically by the IDE or annotation processor
}

