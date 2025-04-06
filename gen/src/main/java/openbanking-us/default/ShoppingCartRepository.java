public class ShoppingCartRepository {
    private static final String DB_NAME = "shopping carts";

    @Override
    public Collection<CartItem> add(String productId, String name) {
        return htablePut(DB_NAME, new CartItem(productId, name, 1));
    }

    // Other repository methods...
}

