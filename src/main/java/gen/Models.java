package gen;

import java.util.List;

public class MeasurementEvent {
    private String id;
    private String timestamp;
    private String lastModified;
    private String type;
    private MeasurementEventDevice device;
    private MeasurementEventRaw raw;
    private List<Measurement> measurements;

    // Getters and setters
}

public class MeasurementEventDevice {
    private String serialNumber;
    private String peripheralId;
    private String partnerDeviceId;
    private Integer dealerId;

    // Getters and setters
}

public class MeasurementEventRaw {
    private String encoding;
    private String value;

    // Getters and setters
}

public class Measurement {
    private String type;
    private String name;
    private String value;
    private String unit;
    private String bodySite;

    // Getters and setters
}

public class CreateMeasurementEventRequest {
    private String type;
    private CreateMeasurementEventDeviceRequest device;
    private MeasurementEventRaw raw;
    private List<Measurement> measurements;

    // Getters and setters
}

public class MeasurementWebhook {
    private String id;
    private String url;
    private boolean active;
    private Integer minSecondsPerCall;
    private List<String> eventTypes;

    // Getters and setters
}

public class MeasurementWebhookBase {
    private String url;
    private boolean active;
    private Integer minSecondsPerCall;
    private List<String> eventTypes;

    // Getters and setters
}

public class MeasurementWebhookTestResult {
    private String id;
    private String url;
    private Integer statusCode;

    // Getters and setters
}

