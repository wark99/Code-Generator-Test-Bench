package com.example.chapter7;

import org.springframework.stereotype.Service;
import com.example.chapter6.PersonWithPassport;

@Service
public class PersonWithPassportService {

    public List<PersonWithPassport> getAllPersons() throws IOException {
        return IntStream.range(0, 10).map(i -> new PersonWithPassPort(i.toString())).collect(Collectors.toList());
    }

    public void validate(final Integer passportNumber,
                         final String nameAndSurname) throws IOException {
        try {
            PersonWithPassPort result = this.validateSingle(passportNumber, nameAndSurname);
            return result;
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException("Invalid person data: " + e.getMessage());
        }
    }

    // Similar logic for other methods...
}

