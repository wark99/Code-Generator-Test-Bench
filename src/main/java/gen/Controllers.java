package gen;

// RootController.java
@RestController
@RequestMapping("/")
public class RootController {
    @GetMapping
    public ResponseEntity<String> root() {
        return ResponseEntity.ok("Successful Response");
    }
}

// OpenAIController.java
@RestController
@RequestMapping("/openai")
public class OpenAIController {
    @GetMapping("/models")
    public ResponseEntity<String> models() {
        return ResponseEntity.ok("Successful Response");
    }

    @GetMapping("/models/{model_name}")
    public ResponseEntity<String> model(@PathVariable("model_name") String modelName) {
        return ResponseEntity.ok("Successful Response");
    }

    @PostMapping("/chat/completions")
    public ResponseEntity<String> postChatCompletions(@RequestBody Data data) {
        return ResponseEntity.ok("Successful Response");
    }

    @PostMapping("/images/generations")
    public ResponseEntity<String> createImage(@RequestBody Data data) {
        return ResponseEntity.ok("Successful Response");
    }

    @PostMapping("/embeddings")
    public ResponseEntity<String> embeddings(@RequestBody Data data) {
        return ResponseEntity.ok("Successful

