import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@ExtendWith(org.mockito.extensions.SpringMockExtension.class)
@WebMvcTest
public class ResourceControllerTest {

    @Autowired
    private ResourceController resourceController;

    @Test
    public void getResource_success() {
        MockMvc mockMvc =MvcMatchers.createMockMvc();
        mockMvc.perform(MockMvcRequestBuilders.get("/resources/1"))
                .andExpect(MvcMatchers.status().isOk());
    }

    @Test
    public void postResource_success() {
        MockMvc mockMvc = MvcMatchers.createMockMvc();
        mockMvc.perform(MockMvcRequestBuilders.post("/resources"))
                .andExpect(MvcMatchers.status().isCreated());
    }
}

