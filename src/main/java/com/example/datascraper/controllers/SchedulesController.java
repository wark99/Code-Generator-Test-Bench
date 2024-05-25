package com.example.datascraper.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedules")
public class SchedulesController {

    @GetMapping
    public List<Object> getAllSchedules() {
        // Implementation
        return null;
    }

    @PostMapping
    public void enableOrDisableSchedules(@RequestBody Object action) {
        // Implementation
    }
}
