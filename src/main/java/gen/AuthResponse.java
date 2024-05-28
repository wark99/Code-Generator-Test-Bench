package gen;

class AuthResponse {
    private String access_token;
    private String token_type;

    public AuthResponse(String access_token, String token_type) {
        this.access_token = access_token;
        this.token_type = token_type;
    }

    // Getters and setters
}

