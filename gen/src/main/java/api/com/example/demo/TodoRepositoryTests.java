package com.example.demo;

import com.example.demo.model.Todo;
import com.example.demo.repository.TodoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class TodoRepositoryTests {

    @Autowired
    private TodoRepository todoRepository;

    @Test
    public void testCreateAndFindTodo() {
        // Given
        Todo todo = new Todo("Sample Todo", "This is a sample description");

        // When
        Todo savedTodo = todoRepository.save(todo);

        // Then
        assertThat(savedTodo).isNotNull();
        assertThat(savedTodo.getId()).isNotNull();

        // Verify that the entity was retrieved correctly
        Todo foundTodo = todoRepository.findById(savedTodo.getId()).orElse(null);
        assertThat(foundTodo).isEqualToComparingFieldByField(savedTodo);
    }
}

