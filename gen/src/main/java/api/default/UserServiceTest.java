@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetAllUsers() {
        List<User> users = userService.getAllUsers();
        assertNotNull(users);
        assertTrue(!users.isEmpty());
    }

    @Test
    public void testGetUserById() {
        User user = new User(1L, "John Doe", "johndoe@example.com");
        User foundUser = userService.getUserById(user.getId());
        assertEquals(user.getId(), foundUser.getId());
        assertEquals(user.getName(), foundUser.getName());
        assertEquals(user.getEmail(), foundUser.getEmail());
    }

    @Test
    public void testCreateUser() {
        User user = new User(1L, "Jane Doe", "janedoe@example.com");
        User createdUser = userService.createUser(user);
        assertNotNull(createdUser);
        assertEquals(user.getId(), createdUser.getId());
        assertEquals(user.getName(), createdUser.getName());
        assertEquals(user.getEmail(), createdUser.getEmail());
    }

    @Test
    public void testUpdateUser() {
        User user = new User(1L, "John Doe", "johndoe@example.com");
        User updatedUser = userService.updateUser(user.getId(), new User(1L, "Jane Doe", "janedoe@example.com"));
        assertEquals("Jane Doe", updatedUser.getName());
        assertEquals("janedoe@example.com", updatedUser.getEmail());
    }

    @Test
    public void testDeleteUser() {
        User user = new User(1L, "John Doe", "johndoe@example.com");
        userService.deleteUser(user.getId());
        assertNull(userRepository.findById(user.getId()));
    }
}

