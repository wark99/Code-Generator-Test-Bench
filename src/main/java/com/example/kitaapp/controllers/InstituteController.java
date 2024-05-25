package com.example.kitaapp.controllers;

import com.example.kitaapp.models.Institute;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kitaApp/v1/einrichtungen")
public class InstituteController {

    @GetMapping("/{kibigWebId}/mitGruppenUndKindern")
    public ResponseEntity<Institute> getGroupsWithKidsByKibigwebid(@PathVariable String kibigWebId) {
        // Mock response, replace with actual logic
        Institute institute = new Institute();
        institute.setInstituteId(kibigWebId);
        institute.setInstituteName("Mock Institute");

        // Return the mock response
        return ResponseEntity.ok(institute);
    }
}
