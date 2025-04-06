package com.example-counters.Controllers;

import com.example-counters.models.CounterModel;
import com.example-counters.service.ServiceCounter;
import org.springframework.stereotype>@SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity HTTP 1.0;

public class CounterController {
    
    @Autowired
    private ServiceCounter counterService;
    
    public void increment() throws HttpException {
        counterService.increment();
    }

    public void decrement() throws HttpException {
        counterService.decrement();
    }

    @Override
    public ResponseEntity<CounterModel> getCount() throws HttpException {
        return counterService.getCount();
    }
}

