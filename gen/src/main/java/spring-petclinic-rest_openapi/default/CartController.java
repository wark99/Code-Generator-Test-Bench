@RestController
public class CartController {
    @GetMapping("/api/v1/carts")
    public List<Cart> getCarts() throws HttpStatusException;

    @PostMapping("/api/v1/carts")
    public void createCart(Cart cart) throws HttpStatusException;
    
    // Other cart operations...
}

