package gen;

public class UserRequest {
    private String phoneNumber;
    private String address;
    private String password;

    // Getters and setters
}

public class LoginRequest {
    private String email;
    private String password;

    // Getters and setters
}

public class LogoutRequest {
    private String token;

    // Getters and setters
}

public class StoreClothesRequest {
    private int user_id;
    private int order_id;
    private String description;
    private int clothes_category_id;
    private String order_date;
    private int storage_duration_months;
    private String token;

    // Getters and setters
}

public class ReturnClothesRequest {
    private int order_id;
    private String token;

    // Getters and setters
}

public class RetryPaymentsRequest {
    private int userId;

    // Getters and setters
}

public class SlackNotificationRequest {
    private int userId;
    private String message;

    // Getters and setters
}

