public class ShoppingCartController {
    @Autowired
    private ShoppingCartRepository cartRepository;

    /**
     * Adds an item to the cart.
     */
    public void addItem(String productId, String name) {
        return cartRepository.add(productId, name);
    }

    /**
     * Removes an item from the cart.
     */
    public void removeItem(String productId) {
        return cartRepository.remove(productId);
    }

    /**
     * Updates the quantity of an item in the cart.
     */
    public void updateQuantity(String productId, int quantity) {
        return cartRepository.update(productId, quantity);
    }
}

