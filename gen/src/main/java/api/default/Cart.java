import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;
    private User user;

    public Cart(User user) {
        this.products = new ArrayList<>();
        this.user = user;
    }

    // Add product to cart
    public void addProduct(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            products.add(product);
        }
    }

    // Remove product from cart
    public void removeProduct(Product product) {
        products.remove(product);
    }

    // Get cart contents
    public List<Product> getCartContents() {
        return products;
    }

    // Calculate total cost
    public double calculateTotalCost() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Get user associated with cart
    public User getUser() { return user; }
}

