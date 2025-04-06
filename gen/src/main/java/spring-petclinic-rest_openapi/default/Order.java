public class Order {
    private Long id;
    private String customerId;
    private List<Product> products;

    public Order(Long id, String customerId) {
        this.id = id;
        this.customerId = customerId;
        this.products = new ArrayList<>();
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
}

