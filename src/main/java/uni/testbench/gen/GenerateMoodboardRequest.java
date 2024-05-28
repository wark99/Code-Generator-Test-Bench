package uni.testbench.gen;

import org.springframework.web.multipart.MultipartFile;

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
