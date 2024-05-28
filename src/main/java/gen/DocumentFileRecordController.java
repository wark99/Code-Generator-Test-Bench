package gen;

// DocumentFileRecordController.java
@RestController
@RequestMapping("/api/document-file-record")
public class DocumentFileRecordController {

    @GetMapping
    public ResponseEntity<?> getDocumentFileRecord(@RequestParam("target_id") int targetId) {
        // Implementation
    }

    @PostMapping
    public ResponseEntity<BaseHttpActionPostCorrectResponseModel> createDocumentFileRecord(@RequestBody Body__api_document_file_record_post body) {
        // Implementation
    }

    @PutMapping("/{target_id}")
    public ResponseEntity<BaseHttpActionPutCorrectResponseModel> updateDocumentFileRecord(@PathVariable("target_id") int targetId, @RequestBody Body__api_document_file_record__target_id__put body) {
        // Implementation
    }

    @DeleteMapping("/{target_id}")
    public ResponseEntity<BaseHttpActionDeleteCorrectResponseModel> deleteDocumentFileRecord(@PathVariable("target_id") int targetId) {
        // Implementation
    }
