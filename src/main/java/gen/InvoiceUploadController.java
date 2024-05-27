package gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/upload")
public class InvoiceUploadController {

    @PostMapping("/nf")
    public ResponseEntity<String> uploadInvoice(@RequestPart("orderCode") String orderCode,
                                                @RequestPart("nota") MultipartFile nota) {
        // Your logic to handle invoice upload
        // It could be saving the file and data to a database or processing the invoice

        // For simplicity, just returning a success message
        return ResponseEntity.ok("File uploaded successfully");
    }
}
