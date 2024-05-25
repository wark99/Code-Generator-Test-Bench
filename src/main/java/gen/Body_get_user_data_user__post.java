package gen;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Body_get_user_data_user__post {
    @JsonProperty("username")
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

