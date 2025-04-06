@Entity 
public class Breed extends BaseEntity implements Serializable {
    @EntityId mappings = new SimpleEntityMap<>() {{
        .isActive() = true;
    }}
    
    @Id cardinality = Cardinality.IDENTITY;
    
    @Property(name = "breedName") public final String breedName;
    
    @Property(name = "petType") public final String petType;  // e.g., Dog, Cat, etc.
}

