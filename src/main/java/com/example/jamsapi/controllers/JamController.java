package com.example.jamsapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class JamController {

    @GetMapping("/submitJam/{jamSlug}/{finishedURL}/{title}")
    public ResponseEntity<?> submitJam(
        @PathVariable("jamSlug") String jamSlug,
        @PathVariable("finishedURL") String finishedURL,
        @PathVariable("title") String title) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getSubmissions")
    public ResponseEntity<?> getSubmissions() {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/deleteSubmission")
    public ResponseEntity<?> deleteSubmission(
        @RequestParam("url") String url,
        @RequestParam("password") String password) {
        return ResponseEntity.ok().build();
    }
}
