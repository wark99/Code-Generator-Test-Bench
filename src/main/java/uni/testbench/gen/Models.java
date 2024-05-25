package uni.testbench.gen;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class FileDto {
    private String id;
    private String filename;
    private String mimetype;
    private String created_at;
    private String status;
    private String hash;
    private int size;
    private String cid;
    // Getters and setters
}

public class TokenDto {
    private String id;
    private String created_at;
    private String asset_code;
    private String description;
    private String ledger;
    private String status;
    private String issuer_wallet;
    private String mapping;
    // Getters and setters
}

public class GetDataAttachmentPaginationSet {
    private int total_records;
    private int current_page;
    private int total_pages;
    private List<GetDataAttachmentResponse> content;
    // Getters and setters
}

public class GetDataAttachmentResponse {
    private String id;
    private String created_at;
    private String status;
    private String presigned_url;
    private String token_id;
    private String filename;
    private String tx_hash;
    private boolean upload_as_zip;
    private int size;
    private TokenDto token;
    private int file_count;
    private List<FileDto> files;
    // Getters and setters
}

public class HTTPValidationError {
    private List<ValidationError> detail;
    // Getters and setters
}

public class ItemNotFoundMessage {
    private String error;
    private String message;
    // Getters and setters
}

public class ValidationError {
    private List<Object> loc;
    private String msg;
    private String type;
    // Getters and setters
}

