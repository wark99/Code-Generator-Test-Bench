@Entity
public class UserRepository extends Eloquent {
    @Id
    public final String id;
    
    // Other fields...
}

@Repository
public class UserController implements JpaRepository<User, UserRepository> {
    
}

