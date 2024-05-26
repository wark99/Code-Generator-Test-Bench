package gen;

import java.util.List;
import java.util.Map;

public class NetworkInfo {
    private String lanMac;
    private String lanIpv4;
    private String lanIpv6;
    private String wifiMac;
    private String wifiIpv4;
    private String wifiIpv6;
    private String wifiSsid;

    // Getters and setters
}

public class CameraResolution {
    private int width;
    private int height;

    // Getters and setters
}

public class CameraConfig {
    private String cameraId;
    private String path;
    private String name;
    private String driver;
    private String triggerScheme;
    private CameraResolution resolution;
    private NetworkInfo networkInfo;

    // Getters and setters
}

public class CameraOptions {
    private List<CameraResolution> availableResolutions;

    // Getters and setters
}

public class CameraRequest {
    private CameraConfig config;
    private CameraOptions options;
    private List<String> capabilities;

    // Getters and setters
}

public class CameraResponse {
    private int id;
    private String name;
    private CameraConfig config;
    private CameraOptions options;
    private List<String> capabilities;
    private int teamId;
    private String printerUuid;
    private String token;
    private String origin;
    private int deleted;
    private boolean registered;
    private int sortOrder;

    // Getters and setters
}

public class Status {
    private String code;
    private String message;

    // Getters and setters
}

