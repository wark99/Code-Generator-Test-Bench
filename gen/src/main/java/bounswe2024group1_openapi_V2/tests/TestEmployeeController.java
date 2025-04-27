package tests;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMock;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.servlet.MockMvc;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class TestEmployeeController {
    @Autowired
    private EmployeeController employeeController;

    @InjectMocks
    private Mock<EmployeeService> empService;
    @InjectMocks
    private Mock<EmpRepository> empRepo;

    @Mock spy = MockitoAnnotations
    public <T> void whenGetInvokedWhen(
            @ spy("get", "/emp")
        ) throws Exception {
    }

}

