@SpringBootTest @WebMvcTest
@SpringBootTest
import static org.springframework.boot.test.autoconfigure.web.servlet.MockMvc;
import static org.springframework.boot.test.Mockito.Mockito;

public class TestUserProfileUpdateController {

    @Autowired
    private UserProfileUpdateController controller;

    @Before
    public void setUp() {
        // Autoconfigure bindings and mocks
        configureBindings();
        setupMocksaveToDb();
    }

    private void setupMocksaveToDb() throws Exception {
        when(controller.doUpdate("POST", "/profile/update", Map.class, userId)).thenReturn(null);
    }

    @Test
    public void WHENyouCallupdateUser_THENyouShouldReceiveRequestToDB(){
        // Mock when saveToDb is called
        mockMvc.perform(controller.updateUser(PartialUser.MAP(user)))

            .andExpect(anyRequestMapping(
                "POST",
                "/profile/update",
                Map.class,
                userId: any()
            ))
    }
}

