@SpringBootTest
public class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private static final String BASE_URL = "/api/users";

    @Test
    public void testGetAllUsers() {
        // Arrange
        List<User> users = new ArrayList<>();
        users.add(new User("username", "password"));
        users.add(new User("anotherUsername", "anotherPassword"));

        // Act
        ResponseEntity<List<User>> response = restTemplate.getForEntity(BASE_URL, List.class);

        // Assert
        assertEquals(200, response.getStatusCode().value());
        assertEquals(users.size(), response.getBody().size());
    }

    @Test
    public void testCreateUser() {
        // Arrange
        User user = new User("newUsername", "newPassword");

        // Act
        ResponseEntity<User> response = restTemplate.postForEntity(BASE_URL + "/create", user, User.class);

        // Assert
        assertEquals(201, response.getStatusCode().value());
        assertNotNull(response.getBody());
    }

    @Test
    public void testUpdateUser() {
        // Arrange
        Long id = 1L;
        User user = new User("updatedUsername", "updatedPassword");

        // Act
        ResponseEntity<User> response = restTemplate.put(BASE_URL + "/{id}", id, user);

        // Assert
        assertEquals(200, response.getStatusCode().value());
        assertNotNull(response.getBody());
    }

    @Test
    public void testDeleteUser() {
        // Arrange
        Long id = 1L;

        // Act
        restTemplate.delete(BASE_URL + "/" + id);

        // Assert
        assertEquals(204, restTemplate.getForEntity(BASE_URL + "/{id}", Void.class).getStatusCode().value());
    }
}

