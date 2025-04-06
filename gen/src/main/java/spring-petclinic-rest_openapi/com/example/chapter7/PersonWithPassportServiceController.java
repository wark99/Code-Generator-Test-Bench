package com.example.chapter7;

import org.springframework.stereotype.Service;
import com.example.chapter6.PersonWithPassPort;
import com.example.chapter7.PersonWithPassportService;

@Service
public class PersonWithPassportServiceController {

    @Autowired
    private PersonWithPassPortService service;

    public List<PersonWithPassPort> getAllPersons() throws IOException {
        return service.getAllPersons();
    }

    // Similar logic for other methods...
}

