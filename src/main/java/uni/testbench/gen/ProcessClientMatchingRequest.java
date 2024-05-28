package uni.testbench.gen;

import org.springframework.web.multipart.MultipartFile;

// Model for the request body of /process_client_matching endpoint
public class ProcessClientMatchingRequest {
    private MultipartFile masterData;
    private String userPrompt;
    private MultipartFile imagePrompt;

    // Getters and setters
}
