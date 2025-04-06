import static org.junit.jupiter.api.Assertions.*;

public class TestController extends AbstractTest {
    @Mock 
    private ListController<?> listController;

    @Before
    void setUp() throws Exception {
        super.setUp();
        setupMock(listController);
    }

    @Test 
    public void testGetItems() {
        String[] params = {"param1", "value"};
        List<SomeModel> items = listController.getItems(params);
        
        assertEquals(expectedList, items);
        verifyServiceMethodInvocation(...);
    }
}

