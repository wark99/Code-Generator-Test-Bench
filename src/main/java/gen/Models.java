package gen;

// ClientLoginRequest.java
public class ClientLoginRequest {
    private String username;
    private String password;

    // Getters and setters
}

// AddDeviceResponse.java
public class AddDeviceResponse {
    private int connectCode;

    // Getters and setters
}

// StartSessionRequest.java
public class StartSessionRequest {
    private String deviceId;
    private String scenarioId;
    private String userId;

    // Getters and setters
}

// DeviceInfo.java
public class DeviceInfo {
    private String deviceId;
    private String deviceSerialNumber;
    private String clientId;
    private String connectCode;
    private boolean ready;
    private String runningScenario;
    private String runningRecord;

    // Getters and setters
}

