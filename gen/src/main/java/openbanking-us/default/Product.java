import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    public Product() {}

    public Product(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // Getters and setters
}

