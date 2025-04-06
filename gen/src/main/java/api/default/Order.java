public class Order {
    private String id;
    private String customerName;
    private double totalPrice;
    private List<Product> products;

    // Constructor
    public Order(String id, String customerName) {
        this.id = id;
        this.customerName = customerName;
        this.totalPrice = 0.0;
        this.products = new ArrayList<>();
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getCustomerName() { return customerName; }
    public double getTotalPrice() { return totalPrice; }
    public List<Product> getProducts() { return products; }

    // Add Product
    public void addProduct(Product product) {
        this.totalPrice += product.getPrice();
        this.products.add(product);
    }
}

