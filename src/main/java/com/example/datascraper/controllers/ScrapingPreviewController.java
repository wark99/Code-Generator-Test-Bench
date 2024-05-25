package com.example.datascraper.controllers;

import com.example.datascraper.models.SessionPreviewDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scraping-preview")
public class ScrapingPreviewController {

    @GetMapping
    public List<SessionPreviewDTO> getAllScrapingSessions() {
        // Implementation
        return null;
    }

    @GetMapping("/{institution}")
    public List<SessionPreviewDTO> getScrapingSessionsByInstitution(@PathVariable String institution) {
        // Implementation
        return null;
    }

    @GetMapping("/{institution}/{sessionId}")
    public SessionPreviewDTO getSessionPreview(@PathVariable String institution, @PathVariable String sessionId) {
        // Implementation
        return null;
    }
}
