@Entity 
public class Order {
    @Data private String orderNumber;
    @Data private int quantity;
    
    // getters
    @Getter 
    public String getOrderNumber() { return orderNumber; }

    @Getter 
    public Integer getQuantity() { return quantity; }
}

