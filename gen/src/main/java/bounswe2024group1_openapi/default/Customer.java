@Entity
@Table(name = "customers")
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    private String email;
    
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders;
    
    public Customer() {}
    
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    // Getters and setters
}

