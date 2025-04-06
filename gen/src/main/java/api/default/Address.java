@Entity
public class Address {
    @Id
    public BigInteger id;
    
    @Property(transient = true)
    public String address;

    // getters
}

// Add other necessary entity classes as needed, like Business, Region, etc.

