import java.util.ArrayList;
import java.util.List;

public class CartController {
    private List<Product> cart = new ArrayList<>();

    public void addProduct(Product product) {
        cart.add(product);
    }

    public List<Product> getCart() {
        return cart;
    }
}

