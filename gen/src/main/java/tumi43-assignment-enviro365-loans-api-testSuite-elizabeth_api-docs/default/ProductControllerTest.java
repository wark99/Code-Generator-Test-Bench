import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ProductService productService;

    @Test
    public void testGetAllProducts() throws Exception {
        mockMvc.perform(get("/api/products"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()", isGreaterThanOrEqualTo(0)));
    }

    @Test
    public void testGetProductById() throws Exception {
        Product product = new Product();
        product.setId(1L);
        productService.createProduct(product);

        mockMvc.perform(get("/api/products/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1));
    }

    @Test
    public void testCreateProduct() throws Exception {
        Product product = new Product();
        product.setName("New Product");
        product.setDescription("This is a new product");

        mockMvc.perform(post("/api/products")
                .contentType(MediaType.APPLICATION_JSON)
                .content(product.toString()))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(1));
    }

    @Test
    public void testUpdateProduct() throws Exception {
        Product product = new Product();
        product.setId(1L);
        product.setName("Updated Name");
        productService.createProduct(product);

        mockMvc.perform	put("/api/products/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(product.toString())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Updated Name"));
    }

    @Test
    public void testDeleteProduct() throws Exception {
        Product product = new Product();
        product.setId(1L);
        productService.createProduct(product);

        mockMvc.perform(delete("/api/products/1"))
                .andExpect(status().isNoContent());
    }
}

