@RunWith(SpringRunner.class)
@SpringBootTest
public class TestEmployeeController {

    private MockMvc mockMvc;

    @Autowired
    private EmployeeController employeeController;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
    }

    @Test
    public void testCreateEmployee() throws Exception {
        // Arrange
        Employee employee = new Employee(1L, "John Doe", "johndoe@example.com");

        // Act
        mockMvc.perform(post("/employees")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json(employee)))
                .andExpect(status().isCreated());

        // Assert
        mockMvc.perform(get("/employees/1"))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetEmployeeById() throws Exception {
        // Arrange
        Employee employee = new Employee(1L, "John Doe", "johndoe@example.com");

        // Act
        mockMvc.perform(get("/employees/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(json(employee));
    }
}

