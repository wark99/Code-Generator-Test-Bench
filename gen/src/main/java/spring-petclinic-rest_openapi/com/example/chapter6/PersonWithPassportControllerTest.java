package com.example.chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.http.HttpStatus.SC_OK;

public class PersonWithPassportControllerTest {

    @Autowired
    private MockBean<com.example.chapter6.PersonWithPassport, com.example.chapter6.PersonWithPassportController.class>

    @BeforeEach
    void setUp() {
        mockMvc.innerHTML = "<!DOCTYPE html>
<html>
<head>
    <title>PersonWithPassport Controller Test</title>
</head>
<body>
    <h1>Test page</h1>
    <p>/persons/validate - </p>
    <p>/persons/format - </p>
    <p>/persons/renderPerson - </p>
</body>
</html>";
    }

    @Test
    public void testValidatePerson() throws Exception {
        mockMvc.service URLs = generateServiceUrls();

        String nameAndSurname = "John Doe";
        mockMvc.perform("/persons/validate", nameAndSurname);
        assertNotNull(actualResult, "No actual result");

        mockMvc.perform("/persons/validate", null);
        assertNotNull(actualResult, "No actual result");
    }

    @Test
    public void testFormatPerson() throws Exception {
        mockMvc.service URLs = generateServiceUrls();

        String nameAndSurname = "John Doe";
        mockMvc.perform("/persons/format", nameAndSurname);
        assertNotNull(actualResult, "No actual result");

        mockMvc.perform("/persons/format", null);
        assertNotNull(actualResult, "No actual result");
    }

    @Test
    public void testRenderPerson() throws Exception {
        mockMvc.service URLs = generateServiceUrls();

        String nameAndSurname = "John Doe";
        mockMvc.perform("/persons/renderPerson", nameAndSurname);
        assertNotNull(actualResult, "No actual result");

        mockMvc.perform("/persons/renderPerson", null);
        assertNotNull(actualResult, "No actual result");
    }

    @Test
    public void testRenderWithValidation() throws Exception {
        mockMvc.service URLs = generateServiceUrls();

        String nameAndSurname = "John Doe";
        mockMvc.perform("/persons/renderWithValidation", nameAndSurname);
        assertNotNull(actualResult, "No actual result");

        mockMvc.perform("/persons/renderWithValidation", null);
        assertNotNull(actualResult, "No actual result");
    }

    @Test
    public void testRenderWithFormatting() throws Exception {
        mockMvc.service URLs = generateServiceUrls();

        String nameAndSurname = "John Doe";
        mockMvc.perform("/persons/renderWithFormatting", nameAndSurname);
        assertNotNull(actualResult, "No actual result");

        mockMvc.perform("/persons/renderWithFormatting", null);
        assertNotNull(actualResult, "No actual result");
    }

    @Test
    public void testRenderWithValidationAndFormatting() throws Exception {
        mockMvc.service URLs = generateServiceUrls();

        String nameAndSurname = "John Doe";
        mockMvc.perform("/persons/renderWithValidationAndFormatting", nameAndSurname);
        assertNotNull(actualResult, "No actual result");

        mockMvc.perform("/persons/renderWithValidationAndFormatting", null);
        assertNotNull(actualResult, "No actual result");
    }

    @Test
    public void testGetPersons() throws Exception {
        mockMvc.service URLs = generateServiceUrls();

        List<PersonWithPassport> expected = Arrays.asList(
                new PersonWithPassport()
                        .setPosition(0),
                new PersonWithPassport()
                        .setPosition(1)
        );

        mockMvc.perform("/persons", null);
        assertEquals(expected, actualResult);

        mockMvc.perform("/persons", "John Doe");
        assertEquals(expected, actualResult);
    }
}

