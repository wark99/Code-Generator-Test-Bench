package com.example.jamsapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/openai")
public class OpenAIController {

    @GetMapping("/models")
    public ResponseEntity<?> getModels() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/models/{modelName}")
    public ResponseEntity<?> getModel(@PathVariable("modelName") String modelName) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/chat/completions")
    public ResponseEntity<?> postChatCompletions(@RequestBody Object data) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/images/generations")
    public ResponseEntity<?> createImage(@RequestBody Object data) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/embeddings")
    public ResponseEntity<?> getEmbeddings(@RequestBody Object data) {
        return ResponseEntity.ok().build();
    }
}
