package uni.testbench.gen;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class DeepHabitatController {

    @PostMapping("/enhance_master_data")
    public ResponseEntity<String> enhanceMasterData(@RequestParam("masterData") MultipartFile masterData,
                                                    @RequestParam(value = "knowledgeBase", required = false) List<MultipartFile> knowledgeBase) {
        // Your implementation here
    }

    @PostMapping("/enhance_data_with_descriptions")
    public ResponseEntity<String> enhanceDataWithDescriptions(@RequestParam("petitionId") int petitionId) {
        // Your implementation here
    }

    @PostMapping("/process_client_matching")
    public ResponseEntity<String> processClientMatching(@RequestParam("masterData") MultipartFile masterData,
                                                        @RequestParam(value = "userPrompt", required = false) String userPrompt,
                                                        @RequestParam(value = "imagePrompt", required = false) MultipartFile imagePrompt) {
        // Your implementation here
    }

    @PostMapping("/generate_moodboard")
    public ResponseEntity<String> generateMoodboard(@RequestParam(value = "itemCsv", required = false) MultipartFile itemCsv,
                                                    @RequestParam(value = "itemImages", required = false) List<MultipartFile> itemImages,
                                                    @RequestParam(value = "moodboardTitle", required = false) String moodboardTitle,
                                                    @RequestParam(value = "canvasMode", required = false) String canvasMode,
                                                    @RequestParam(value = "paletteMode", required = false) String paletteMode,
                                                    @RequestParam(value = "backgroundMode", required = false) String backgroundMode) {
        // Your implementation here
    }

    @GetMapping("/get_enhanced_data")
    public ResponseEntity<EnhancedDataResponse> getEnhancedData(@RequestParam("petitionId") int petitionId) {
        // Your implementation here
    }

    @GetMapping("/get_enhanced_data_with_descriptions")
    public ResponseEntity<EnhancedDataWithDescriptionsResponse> getEnhancedDataWithDescriptions(@RequestParam("petitionId") int petitionId) {
        // Your implementation here
    }

    @GetMapping("/get_client_matching")
    public ResponseEntity<ClientMatchingResponse> getClientMatching(@RequestParam("clientMatchingId") int clientMatchingId) {
        // Your implementation here
    }

    @GetMapping("/get_moodboard")
    public ResponseEntity<MoodboardResponse> getMoodboard(@RequestParam("moodboardId") int moodboardId) {
        // Your implementation here
    }
}

