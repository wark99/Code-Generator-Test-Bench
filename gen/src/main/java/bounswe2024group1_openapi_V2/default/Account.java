@Entity
public class Account implements AccountInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false, unique = true)
    private String name;
    
    @Column(nullable = false, precision = "10", scale = 2)
    private Double balance;

    @Column(strategy = @Strategy("SNAP"), spanStrategy = SpanStrategy.NO)
    private String accountType; // "savings" or "checking"

    @Column(DateTime, format = "yyyy-MM-dd HH:mm:ss")
    private DateTime creationDate;
}

