// Order.java

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="order_status")
    private String orderStatus;

    // Getters and Setters

}

