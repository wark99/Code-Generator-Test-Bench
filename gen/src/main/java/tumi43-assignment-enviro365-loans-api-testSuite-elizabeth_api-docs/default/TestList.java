import static org.junit.jupiter.api.Assertions.*;

public class TestList {
    @Mock 
    private RESTController<?> controller;
    
    @Before
    void setUp() throws Exception {
        setupMock(new RESTController<>());
    }

    @Test 
    public void testCreateList() {
        List<SomeModel> list = new ListController<>(controller);
        assertEquals(0, list.size());
    }

    @Test 
    public void testAddElement() {
        SomeModel model = createModel(...);
        List<SomeModel> list = new ListController<>(controller);
        list.add(model);
        assertTrue(list.size() == 1);
    }

    // Add more methods as needed
}

public class TestModel extends TestList {
    @Mock 
    private DAO<?> daos[]; // Mock for different DAO types

    @Before
    void setUp() throws Exception {
        super.setUp();
        setupMocks(daos); // Mock DAOs
    }

    // Add model-specific tests here
}

