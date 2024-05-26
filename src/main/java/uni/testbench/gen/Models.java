package uni.testbench.gen;

// Model for the request body of /enhance_master_data endpoint
public class EnhanceMasterDataRequest {
    private MultipartFile masterData;
    private List<MultipartFile> knowledgeBase;

    // Getters and setters
}

// Model for the request body of /generate_moodboard endpoint
public class GenerateMoodboardRequest {
    private MultipartFile itemCsv;
    private List<MultipartFile> itemImages;
    private String moodboardTitle;
    private String canvasMode;
    private String paletteMode;
    private String backgroundMode;

    // Getters and setters
}

// Model for the request body of /process_client_matching endpoint
public class ProcessClientMatchingRequest {
    private MultipartFile masterData;
    private String userPrompt;
    private MultipartFile imagePrompt;

    // Getters and setters
}

// Model for the response of /get_enhanced_data endpoint
public class EnhancedDataResponse {
    private List<String> enhancedDataUrls;
    private String seoRules;
    private String categoryTaxonomy;
    private String attributeTaxonomy;

    // Getters and setters
}

// Model for the response of /get_enhanced_data_with_descriptions endpoint
public class EnhancedDataWithDescriptionsResponse {
    private List<String> enhancedDataUrls;

    // Getters and setters
}

// Model for the response of /get_client_matching endpoint
public class ClientMatchingResponse {
    private String filteredDataUrl;

    // Getters and setters
}

// Model for the response of /get_moodboard endpoint
public class MoodboardResponse {
    private String moodboardUrl;

    // Getters and setters
}

