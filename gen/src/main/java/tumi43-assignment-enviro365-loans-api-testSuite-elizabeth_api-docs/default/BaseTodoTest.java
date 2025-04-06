import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.equals;

class BaseTodoTest {

    @MockRepository("todo")
    private Repository<BaseTodo> todoRepository;

    @BeforeEach
    void setUp() {
        setupMocks();
    }

    @InjectMocks(Todo todo)
    void testCreateTodo() throws Exception {
        when(todoRepository.createTodo().thenReturn(null)).thenReturn(todo);
        createTodo();
        verify(todoRepository.createTodo());
    }

    // Similar tests for getTodos(), deleteTodo(), etc.
}

