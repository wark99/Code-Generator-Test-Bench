package com.example.datascraper.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scraping-jobs")
public class ScrapingJobsController {

    @GetMapping
    public List<Object> getAllScrapingJobs() {
        // Implementation
        return null;
    }

    @PostMapping("/{scrapingId}")
    public void approveOrRejectScrapingJob(@PathVariable String scrapingId, @RequestBody Object approval) {
        // Implementation
    }

    @GetMapping("/{institutionName}")
    public List<Object> getScrapingJobsByInstitution(@PathVariable String institutionName) {
        // Implementation
        return null;
    }

    @PostMapping("/{institutionName}")
    public void startOrStopScrapingJob(@PathVariable String institutionName, @RequestBody Object action) {
        // Implementation
    }
}
