import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

@UnitTest
public class ProjectTests {
    
    @BeforeEach
    void setUp() {
        mapper = createMock(Mapping);
        verify(mapper).whenCalled("get", "all")
            .thenReturn(new List<POJO>());
    }

    @Test
    public void testGetAllProjects() throws Exception {
        List<Task> expectedTasks = Arrays.asList(task1, task2);
        
        mapper.get("all")
            .andReturn(expectedTasks)
            .andExpect(0).exception();
        
        assertEquals(expectedTasks, mapper.getAll());
    }
}

