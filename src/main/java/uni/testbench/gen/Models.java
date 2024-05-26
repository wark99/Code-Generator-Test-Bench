package uni.testbench.gen;

public class Brand {
    private String codeName;
    private WsbApiUri wsbApiUri;

    public Brand(String codeName, WsbApiUri wsbApiUri) {
        this.codeName = codeName;
        this.wsbApiUri = wsbApiUri;
    }

    // Getters and setters
}

public class WsbApiUri {
    private String hostname;
    private String baseUrl;

    public WsbApiUri(String hostname, String baseUrl) {
        this.hostname = hostname;
        this.baseUrl = baseUrl;
    }

    // Getters and setters
}

public class SSOResponse {
    private String ssoUrl;
    private long expirationTime;

    public SSOResponse(String ssoUrl, long expirationTime) {
        this.ssoUrl = ssoUrl;
        this.expirationTime = expirationTime;
    }

    // Getters and setters
}
