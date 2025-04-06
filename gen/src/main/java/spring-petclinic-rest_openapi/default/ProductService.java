// ProductService.java

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public Product createProduct(Product product) {
        products.add(product);
        return product;
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getId().equals(id)) {
                products.set(i, updatedProduct);
                return product;
            }
        }
        return null;
    }

    public void deleteProduct(Long id) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getId().equals(id)) {
                products.remove(i);
                break;
            }
        }
    }
}

