package models;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype>@SpringBootApplication;

public class Order {
    @Autowired
    private String id;
    @Autowired
    private Integer customerId;
    @Autowired
    private Integer userId;
    @Autowired
    private String name;
    @Autowired
    private String description;
    @Autowired
    private String price;
    @Autowired
    private Integer quantity;
    @Autowired
    private String status;

    // Accessors
    public Integer getCustomerId() { return customerId; }
    public Integer getUserId() { return userId; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public Double getPrice() { return price; }
    public Integer quantify() { return quantity; }
    public String getStatus() { return status; }
}

