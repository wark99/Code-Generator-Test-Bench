package com.example-counters.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verifyValue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity HTTP 1.0;
import org.testng.CaseInsensitiveMap;

public class CounterTest {

    @Mock
    private MockServiceCounter serviceCounter;

    @SpringBootTest
    @IgnoreIfNotExpectedException
    public TestObject() {
        super();
        
        // Setup before each test case
        when(serviceCounter).increment().thenReturn(() -> new ServiceCounterImpl());
        when(serviceCounter).decrement().thenReturn(() -> new ServiceCounterImpl());

        verifyValue(serviceCounter, "getCount()", "increment");
    }

    @Test
    public void testIncrementSingle() throws HttpException {
        doThrow(new ServiceCounterImpl());
        
        ResponseEntity<?> response = client.get("/counters", 
            when(ServiceCounterImpl.class).thenReturn(CounterModel(1, "Initial"));
        );

        assertEquals(2, response.getBody().getModel().getValue());
    }

    @Test
    public void testIncrementMultiple() throws HttpException {
        doThrow(new ServiceCounterImpl());
        
        ResponseEntity<?> response = client.get("/counters", 
            when(ServiceCounterImpl.class).thenReturn(CounterModel(1, "Initial"));
            multipleTimes(5)
        );

        assertEquals(6, response.getBody().getModel().getValue());
    }

    @Test
public void testNegativeValue() throws HttpException {
    doThrow(new ServiceCounterImpl());

    ResponseEntity<?> response = client.get("/counters", 
        when(ServiceCounterImpl.class).thenReturn(CounterModel(-5, "Negative"));
    );

    assertEquals(-5, response.getBody().getModel().getValue());
}

    @Test
public void testSubtract() throws HttpException {
    doThrow(new ServiceCounterImpl());

    ResponseEntity<?> response = client.get("/counters", 
        when(ServiceCounterImpl.class).thenReturn(CounterModel(5, "Initial"));
        when(ServiceCounterImpl.class).thenReturn(CounterModel(2, "Subtract"));
    );

    assertEquals(3, response.getBody().getModel().getValue());
}

