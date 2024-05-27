package gen;

import java.util.List;
import java.util.Map;

public class ConsumerFile {
    private String aggregator;
    private List<Account> accounts;
    private String bureau;
    private Credit credit;

    // Getters and setters
}

public class Account {
    private String bank_id;
    private String account_id;
    private String product_type;
    private Object open_date; // String or Integer
    private Double balance;
    private Object balance_date; // String or Integer
    private List<Transaction> transactions;

    // Getters and setters
}

public class Transaction {
    private String account_id;
    private String transaction_type;
    private Double transaction_amount;
    private Object transaction_date; // String or Integer

    // Getters and setters
}

public class Credit {
    private String credit_score_date;
    private Boolean credit_score_facta_inquiries_indicator;
    private String credit_score_model_name_type;
    private String credit_score_model_name_description;
    private Integer credit_score_rank_percentile_value;
    private Integer credit_score_value;
    private List<CreditScoreFactor> credit_score_factors;

    // Getters and setters
}

public class CreditScoreFactor {
    private String credit_score_factor_code;
    private String credit_score_factor_text;

    // Getters and setters
}

public class ConsumerFileForVerification {
    private List<AccountForVerification> accounts;
    private CreditForVerification credit;

    // Getters and setters
}

public class AccountForVerification {
    private List<AccountOwner> owners;

    // Getters and setters
}

public class AccountOwner {
    private AccountOwnerName name;
    private List<AccountOwnerAddress> addresses;

    // Getters and setters
}

public class AccountOwnerName {
    private String first_name;
    private String last_name;

    // Getters and setters
}

public class AccountOwnerAddress {
    private String address_line;
    private String city;
    private String state;
    private String postal_code;

    // Getters and setters
}

public class CreditForVerification {
    private CreditOwner owner;

    // Getters and setters
}

public class CreditOwner {
    private List<CreditOwnerName> names;
    private List<CreditOwnerAddress> addresses;

    // Getters and setters
}

public class CreditOwnerName {
    private String first_name;
    private String last_name;

    // Getters and setters
}

public class CreditOwnerAddress {
    private String address_line;
    private String city;
    private String state;
    private String postal_code;

    // Getters and setters
}

public class ScoreResponse {
    private String response;
    private Integer score;
    private Map<String, String> reasonCodes;

    // Getters and setters
}

public class AttributesResponse {
    private String response;
    private Map<String, Object> attributes;

    // Getters and setters
}

public class UploadSessionResponse {
    private String session_id;

    // Getters and setters
}

public class UploadURLResponse {
    private String response;
    private String uploadURL;

    // Getters and setters
}

public class VerificationResponse {
    private String response;

    // Getters and setters
}
