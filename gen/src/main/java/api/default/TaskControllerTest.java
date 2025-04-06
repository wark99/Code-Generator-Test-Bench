import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockedOperation;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class TaskControllerTest {

    @Autowired
    private MockedOperation mockedOperation; // MockedOperation is needed for Spring Boot tests

    @Test
    public void listTasksTest() throws Exception {
        // Mock the TaskService
        TaskService taskServiceMock = mock(TaskService.class);
        when(taskServiceMock.getAllTasks()).thenReturn(List.of(new Task(1L, "Task 1")));

        // MockMvc setup
        MockMvc mockMvc = new MockMvc();

        // Request builder
        MvcRequestBuilders requestBuilders = MockMvcRequestBuilders.get("/tasks");

        // Perform the request
        MvcResult result = mockMvc.perform(requestBuilders).andReturn(MvcResult.of(200, "", "Task 1"));

        // Assertions
        assertEquals(200, result.getResolvedStatus());
        assertEquals("Task 1", result.getResponseString());
    }
}

