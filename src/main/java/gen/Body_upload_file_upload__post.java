package gen;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Body_upload_file_upload__post {
    @JsonProperty("image_file")
    private String imageFile;

    @JsonProperty("username")
    private String username;

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
