@RestController
public class ProductController {
    @GetMapping("/api/v1/products")
    public List<Product> getProductList() throws HttpStatusException;

    @PostMapping("/api/v1/products")
    public Product createProduct(Product product) throws HttpStatusException;
    
    // Other product operations...
}

