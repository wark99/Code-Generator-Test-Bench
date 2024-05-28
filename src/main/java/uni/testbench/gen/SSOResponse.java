package uni.testbench.gen;

public class SSOResponse {
    private String ssoUrl;
    private long expirationTime;

    public SSOResponse(String ssoUrl, long expirationTime) {
        this.ssoUrl = ssoUrl;
        this.expirationTime = expirationTime;
    }

    // Getters and setters
}
