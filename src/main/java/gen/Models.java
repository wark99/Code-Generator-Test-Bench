package gen;

import java.util.List;

public class CreateCommunicationGateway {
    private String endpointUrl;
    private String friendlyName;
    private String description;
    // getters and setters
}

public class CommunicationGateway extends CreateCommunicationGateway {
    private String id;
    // getters and setters
}

public class CreateCommunicationSchedule {
    private String gatewayId;
    private String userId;
    private CalendarSpec calendarSpec;
    private boolean paused;
    // getters and setters
}

public class CommunicationSchedule extends CreateCommunicationSchedule {
    private String id;
    private List<ScheduleActionResult> recentActions;
    private List<String> nextActionTimes;
    // getters and setters
}

public class RetryPolicy {
    private String maximumAttempts;
    private double backoffCoefficient;
    private String initialInterval;
    private String maximumInterval;
    private String startToCloseTimeout;
    // getters and setters
}

public class CalendarSpec {
    private List<ScheduledRange> seconds;
    private List<ScheduledRange> minutes;
    private List<ScheduledRange> hour;
    private List<ScheduledRange> dayOfMonth;
    private List<ScheduledRange> month;
    private List<ScheduledRange> year;
    private List<ScheduledRange> dayOfWeek;
    // getters and setters
}

public class ScheduledRange {
    private int start;
    private int end;
    private int step;
    // getters and setters
}

public class ScheduleActionResult {
    private String scheduledAt;
    private String runId;
    // getters and setters
}

public class Timestamp {
    private long seconds;
    private int nanos;
    // getters and setters
}

public class Pageable {
    private int pageNumber;
    private int pageSize;
    // getters and setters
}

