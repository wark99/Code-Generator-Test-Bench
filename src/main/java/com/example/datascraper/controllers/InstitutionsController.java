package com.example.datascraper.controllers;

import com.example.datascraper.models.InstitutionDTO;
import com.example.datascraper.models.ProgrammeDTO;
import com.example.datascraper.models.CourseDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/institutions")
public class InstitutionsController {

    @GetMapping
    public List<String> getAllInstitutions() {
        // Implementation
        return null;
    }

    @GetMapping("/{institution}/programmes")
    public List<ProgrammeDTO> getProgrammesByInstitution(@PathVariable String institution) {
        // Implementation
        return null;
    }

    @GetMapping("/{institution}/courses")
    public List<CourseDTO> getCoursesByInstitution(@PathVariable String institution) {
        // Implementation
        return null;
    }
}
