@SpringBootTest
public class ProductTest {
    
    @Autowired
    private TestProductRepository testProductRepository;
    
    @Test
    public void testGetAllProducts() {
        List<Product> products = testProductRepository.findAll();
        assertEquals(0, products.size());
    }
    
    @Test
    public void testGetProductById() {
        Product product = new Product("Test Product", 10.99);
        testProductRepository.save(product);
        Product foundProduct = testProductRepository.findById(1L).orElseThrow();
        assertEquals(product.getName(), foundProduct.getName());
        assertEquals(product.getPrice(), foundProduct.getPrice());
    }
    
    @Test
    public void testCreateProduct() {
        Product product = new Product("Test Product", 10.99);
        Product createdProduct = testProductRepository.save(product);
        assertEquals(product.getName(), createdProduct.getName());
        assertEquals(product.getPrice(), createdProduct.getPrice());
    }
}

