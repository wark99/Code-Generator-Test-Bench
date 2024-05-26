package gen;

public class InstantActivationRequest {
    private String ClientCode;
    private String IMEI;
    private String SerialNumber;
    private String PortMobileNo;
    private int Carrrier_Type;
    private String TariffId;
    private int Month;
    private int Rental;
    private boolean isWifi;
    private boolean isEsim;
    private String TransactionId;
    private int ActivationOrPortin;
    private Customer_Details Customer_Details;

    // Getters and setters
}

public class RechargeRequest {
    private String ClientCode;
    private String TransactionId;
    private String MSISDN;
    private String PlanID;
    private double Rental;
    private int Carrier_Type;
    private int RechargeType;

    // Getters and setters
}

public class CheckPortinMdnRequest {
    private String ClientCode;
    private String Imei;
    private String SerialNumber;
    private String Msisdn;
    private int Carrier_Type;

    // Getters and setters
}

public class GetDetailsByMdnRequest {
    private String ClientCode;
    private String Msisdn;
    private int Carrier_Type;

    // Getters and setters
}

public class CheckPortinStatusRequest {
    private String ClientCode;
    private String Msisdn;
    private int Carrier_Type;

    // Getters and setters
}

public class CheckIMEIRequest {
    private String ClientCode;
    private String Imei;
    private int Carrier_Type;
    private boolean is4g;

    // Getters and setters
}

public class CheckSerialNumberRequest {
    private String ClientCode;
    private String SerialNumber;
    private int Carrier_Type;

    // Getters and setters
}

public class Customer_Details {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String contactNumber;
    private String portableFromProvider;
    private String portableFromAccountNumber;
    private String portableFromAccountPassCode;

    // Getters and setters
}

public class ApiResponse {
    private String errorcode;
    private String data;
    private String details;
    private boolean status;

    // Getters and setters
}

public class GetDetailsByMdnApiResponse {
    private String errorcode;
    private String data;
    private String details;
    private String creationTime;
    private boolean delayActivation;
    private boolean status;

    // Getters and setters
}
