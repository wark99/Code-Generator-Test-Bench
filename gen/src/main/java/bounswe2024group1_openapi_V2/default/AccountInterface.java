interface AccountInterface {
    String id;
    String name;
    double balance;
    String accountType; // "savings" or "checking"
    java.time.DateTime creationDate;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof AccountInterface)) return false;
        AccountInterface other = (AccountInterface) obj;
        return id.equals(other.id) && name.equals(other.name) &&
               balance.equals(other.balance) &&
               accountType.equals(other.accountType) &&
               creationDate.equals(other.creationDate);
    }
}

interface AccountController extends JpaRepository<AccountInterface> {
    @RestController
    public class UserController {
        // CRUD operations will be implemented here
    }
}

