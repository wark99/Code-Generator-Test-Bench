package uni.testbench.gen;

import org.springframework.web.multipart.MultipartFile;

// Model for the request body of /enhance_master_data endpoint
public class EnhanceMasterDataRequest {
    private MultipartFile masterData;
    private List<MultipartFile> knowledgeBase;

    // Getters and setters
}

