@Entity 
public class UserPetPermission extends BaseEntity implements Serializable {
    @EntityId mappings = new SimpleEntityMap<>() {{
        .isActive() = true;
    }}
    
    @Id cardinality = Cardinality.IDENTITY;
    
    @Property(name = "userId") public final int userId; // User ID
    @Property(name = "petId") public final int petId;  // Pet ID (foreign key to Pet)
    @Property(name = "breedId") public final int breedId; // Breed ID (foreign key to Breed)
}

