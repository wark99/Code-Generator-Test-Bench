// Product.java

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="product_name")
    private String productName;

    @Column(name="product_price")
    private Double productPrice;

    // Getters and Setters

}

