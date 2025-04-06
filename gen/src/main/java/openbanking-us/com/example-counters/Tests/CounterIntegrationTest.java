package com.example-counters.Tests;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verifyValue;
import static org.mockito.Mockito.when;

public class CounterIntegrationTest {

    @Mock
    private MockServiceCounter serviceCounter;

    @SpringBootTest
    public TestObject() {
        super();

        when(serviceCounter).increment().thenReturn(() -> new ServiceCounterImpl());
        when(serviceCounter).decrement().thenReturn(() -> new ServiceCounterImpl());

        verifyValue(serviceCounter, "getCount()", "increment");
    }

    @Test
    public void whenServiceCountsAreNegative() throws Exception {
        doThrow(new ServiceCounterImpl());

        ResponseEntity<?> response = client.get("/counters", 
            when(ServiceCounterImpl.class).thenReturn(CounterModel(-5, "Initial"));
        );

        assertEquals(-5, response.getBody().getModel().getValue());
    }

    @Test
    public void whenServiceCountsAreZero() throws Exception {
        doThrow(new ServiceCounterImpl());

        ResponseEntity<?> response = client.get("/counters", 
            when(ServiceCounterImpl.class).thenReturn(CounterModel(0, "Zero"));
        );

        assertEquals(0, response.getBody().getModel().getValue());
    }

    @Test
    public void whenServiceCountsArePositiveAndNegative() throws Exception {
        doThrow(new ServiceCounterImpl());

        ResponseEntity<?> response = client.get("/counters", 
            when(ServiceCounterImpl.class).thenReturn(CounterModel(-5, "A"));
            when(ServiceCounterImpl.class).thenReturn(CounterModel(2, "B"));
            when(ServiceCounterImpl.class).thenReturn(CounterModel(10, "C"));
        );

        ResponseEntity<?> responses = client.get("/counters");

        assertEquals(new int[]{ -5, 2, 10 }, 
                responses.getBody().getModels()
                    .stream()
                    .mapToInt(m -> m.getValue())
                    .toArray(int[]::new));
    }
}

