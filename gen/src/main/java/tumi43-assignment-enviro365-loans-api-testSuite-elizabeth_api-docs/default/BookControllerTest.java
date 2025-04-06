// BookControllerTest.java

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllBooks() throws Exception {
        String url = "/api/books";
        MockMvcRequestBuilders.get(url).andExpect(status().isOk());
    }

    @Test
    public void testGetBookById() throws Exception {
        Book book = new Book();
        book.setId(UUID.randomUUID().toString());
        book.setTitle("Test Title");
        book.setAuthor("Test Author");

        String url = "/api/books/" + book.getId();
        MockMvcRequestBuilders.get(url).andExpect(status().isOk());

        mockMvc.perform(get("/api/books").queryParam("id", book.getId()))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.title").value(book.getTitle()));
    }

    @Test
    public void testCreateBook() throws Exception {
        String url = "/api/books";
        Book book = new Book();
        book.setTitle("Test Title");
        book.setAuthor("Test Author");

        MockMvcRequestBuilders.post(url).contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(book))
                .andExpect(status().isCreated())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(UUID.randomUUID().toString()));
    }

    @Test
    public void testUpdateBook() throws Exception {
        Book book = new Book();
        book.setId(UUID.randomUUID().toString());
        book.setTitle("Test Title");
        book.setAuthor("Test Author");

        String url = "/api/books/" + book.getId();
        MockMvcRequestBuilders.put(url).contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(book))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.title").value(book.getTitle()));
    }

    @Test
    public void testDeleteBook() throws Exception {
        String url = "/api/books";
        Book book = new Book();
        book.setId(UUID.randomUUID().toString());
        book.setTitle("Test Title");
        book.setAuthor("Test Author");

        mockMvc.perform(delete(url).queryParam("id", book.getId()))
                .andExpect(status().isNoContent());

        MockMvcRequestBuilders.get("/api/books/" + book.getId())
                .andExpect(status().isNotFound());
    }

    private String asJsonString(Object obj) {
        return org.json.JSONObject.quote(org.json.JSONObject.toString(obj));
    }
}

