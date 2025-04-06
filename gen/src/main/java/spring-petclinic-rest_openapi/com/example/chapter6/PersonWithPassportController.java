package com.example.chapter6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class PersonWithPassportController {

    @Autowired
    private PersonWithPassportService personService;

    @GetMapping("/persons")
    public List<PersonWithPassport> getAllPersons() throws IOException {
        return personService.getPersons();
    }

    @GetMapping("/persons/validate", Map.Entry<String, String>())
    public void validatePerson(final String nameAndSurname) throws IOException {
        try {
            PersonWithPassport validationResult = personService.validate(
                    null, nameAndSurname);
            System.out.println("Valid person: " + validationResult);
        } catch (IllegalArgumentException e) {
            System.err.println("Validation error: " + e.getMessage());
        }
    }

    @GetMapping("/persons/format", Map.Entry<String, String>())
    public void formatPerson(final String nameAndSurname) throws IOException {
        try {
            String formatted = personService.format(nameAndSurname);
            System.out.println("Formatted person: " + formatted);
        } catch (IllegalArgumentException e) {
            System.err.println("Formatting error: " + e.getMessage());
        }
    }

    @PreValidate
    public void validate(final Integer passportNumber,
                         final String nameAndSurname) throws IOException {
        try {
            PersonWithPassport result = personService.validate(passportNumber, nameAndSurname);
            if (!result.isValid) {
                throw new IllegalStateException("Invalid person data");
            }
        } catch (IllegalArgumentException e) {
            // Do something with validation error
        }
    }

    @PreFormat
    public void format(final String nameAndSurname,
                      final Integer passportNumber) throws IOException {
        try {
            PersonWithPassport result = personService.format(nameAndSurname, passportNumber);
            if (!result.isValid) {
                throw new IllegalStateException("Invalid formatting");
            }
        } catch (IllegalArgumentException e) {
            // Do something with formatting error
        }
    }

    @PreRender
    public void renderPerson(final Integer passportNumber,
                             final String nameAndSurname) throws IOException {
        try {
            PersonWithPassport result = personService.render(passportNumber, nameAndSurname);
            if (!result.isValid) {
                throw new IllegalStateException("Invalid rendering");
            }
        } catch (IllegalArgumentException e) {
            // Handle rendering error
        }
    }

    @PreRender
    public void renderWithValidation(final Integer passportNumber,
                                     final String nameAndSurname) throws IOException {
        try {
            PersonWithPassport result = personService.render(passportNumber, nameAndSurname);
            if (!result.isValid) {
                throw new IllegalStateException("Invalid rendering with validation");
            }
        } catch (IllegalArgumentException e) {
            // Handle rendering error
        }
    }

    @PreRender
    public void renderWithFormatting(final String nameAndSurname,
                                     Integer passportNumber) throws IOException {
        try {
            PersonWithPassport result = personService.render(nameAndSurname, passportNumber);
            if (!result.isValid) {
                throw new IllegalStateException("Invalid rendering with formatting");
            }
        } catch (IllegalArgumentException e) {
            // Handle rendering error
        }
    }

    @PreRender
    public void renderWithValidationAndFormatting(final Integer passportNumber,
                                                  final String nameAndSurname) throws IOException {
        try {
            PersonWithPassport result = personService.render(passportNumber, nameAndSurname);
            if (!result.isValid) {
                throw new IllegalStateException("Invalid rendering with validation and formatting");
            }
        } catch (IllegalArgumentException e) {
            // Handle rendering error
        }
    }
}

