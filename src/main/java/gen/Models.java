package gen;

import java.util.List;

public class Product {
    private String productCode;
    private String name;
    private String description;
    private boolean isValueBased;
    private boolean isOpenValue;
    private boolean isStatusAvailable;
    private boolean isMultipleUse;
    private String currency;
    private int amount;
    private Integer quantity;
    private String expiryScheme;
    private String validFrom;
    private String validUntil;
    private String image;
    private String termsAndConditions;
    // Getters and setters
}

public class Voucher {
    private String voucherCode;
    private String voucherId;
    private String name;
    private String status;
    private String expiration;
    private String currency;
    private int remainingAmount;
    private String productCode;
    private String productName;
    private boolean isValueBased;
    private boolean isStatusAvailable;
    private boolean isMultipleUse;
    private String url;
    private String shortUrl;
    private int shortUrlPin;
    // Getters and setters
}

public class IssueVouchersRequest {
    private int quantity;
    private int faceValue;
    // Getters and setters
}

