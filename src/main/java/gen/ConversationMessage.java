package gen;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConversationMessage {
    @JsonProperty("role")
    private String role;

    @JsonProperty("content")
    private String content;

    // Getters and setters
}
