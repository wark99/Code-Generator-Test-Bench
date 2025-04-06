package com.example.todo.controller;

import com.example.todo.model.Task;
import com.example.todo.service.TaskService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class TaskControllerTest {

    @Mock
    private TaskService taskService;

    @InjectMocks
    private TaskController taskController;

    private List<Task> tasks;
    private Task task1, task2;

    @BeforeEach
    void setUp() {
        task1 = new Task(1L, "Task 1", false);
        task2 = new Task(2L, "Task 2", true);

        tasks = Arrays.asList(task1, task2);
    }

    @Test
    void shouldReturnAllTasks() {
        when(taskService.getAllTasks()).thenReturn(tasks);

        List<Task> result = taskController.getAllTasks();

        verify(taskService).getAllTasks();
        assertThat(result, hasSize(2));
    }

    @Test
    void shouldReturnTaskById() {
        when(taskService.getTaskById(1L)).thenReturn(Optional.of(task1));

        ResponseEntity<Task> responseEntity = taskController.getTaskById(1L);

        verify(taskService).getTaskById(1L);
        assertThat(responseEntity.getStatusCode(), is(HttpStatus.OK));
        assertThat(responseEntity.getBody().getTitle(), is("Task 1"));
    }

    @Test
    void shouldReturnNotFoundForNonExistentTask() {
        when(taskService.getTaskById(3L)).thenReturn(Optional.empty());

        ResponseEntity<Task> responseEntity = taskController.getTaskById(3L);

        verify(taskService).getTaskById(3L);
        assertThat(responseEntity.getStatusCode(), is(HttpStatus.NOT_FOUND));
    }

    @Test
    void shouldCreateNewTask() {
        Task newTask = new Task(null, "New Task", false);
        when(taskService.createTask(any(Task.class))).thenReturn(newTask);

        Task createdTask = taskController.createTask(newTask);

        verify(taskService).createTask(any(Task.class));
        assertThat(createdTask.getTitle(), is("New Task"));
    }

    @Test
    void shouldUpdateExistingTask() {
        Task updatedTaskDetails = new Task(null, "Updated Title", true);
        when(taskService.updateTask(1L, any(Task.class))).thenReturn(task1);

        ResponseEntity<Task> responseEntity = taskController.updateTask(1L, updatedTaskDetails);

        verify(taskService).updateTask(1L, any(Task.class));
        assertThat(responseEntity.getStatusCode(), is(HttpStatus.OK));
        assertThat(responseEntity.getBody().getTitle(), is("Task 1"));
    }

    @Test
    void shouldReturnNotFoundForUpdateNonExistentTask() {
        when(taskService.updateTask(3L, any(Task.class)))
                .thenThrow(RuntimeException.class);

        ResponseEntity<Task> responseEntity = taskController.updateTask(3L, new Task(null, "Title", false));

        verify(taskService).updateTask(3L, any(Task.class));
        assertThat(responseEntity.getStatusCode(), is(HttpStatus.NOT_FOUND));
    }

    @Test
    void shouldDeleteTask() {
        doNothing().when(taskService).deleteTask(1L);

        ResponseEntity<Void> responseEntity = taskController.deleteTask(1L);

        verify(taskService).deleteTask(1L);
        assertThat(responseEntity.getStatusCode(), is(HttpStatus.NO_CONTENT));
    }

    @Test
    void shouldReturnNotFoundForDeleteNonExistentTask() {
        when(taskService.deleteTask(3L))
                .thenThrow(RuntimeException.class);

        ResponseEntity<Void> responseEntity = taskController.deleteTask(3L);

        verify(taskService).deleteTask(3L);
        assertThat(responseEntity.getStatusCode(), is(HttpStatus.NOT_FOUND));
    }
}

