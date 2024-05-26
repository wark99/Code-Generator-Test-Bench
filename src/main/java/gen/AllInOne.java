package gen;

// Company.java
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class Company {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("vat")
    private String vat;

    @JsonProperty("address")
    private String address;

    @JsonProperty("city")
    private String city;

    @JsonProperty("state")
    private String state;

    @JsonProperty("country")
    private String country;

    @JsonProperty("zipCode")
    private String zipCode;

    @JsonProperty("createdAt")
    private String createdAt;

    @JsonProperty("parentCompany")
    private Company parentCompany;

    // getters and setters, equals, hashCode, toString
}

// Plant.java
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class Plant {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("address")
    private String address;

    @JsonProperty("city")
    private String city;

    @JsonProperty("state")
    private String state;

    @JsonProperty("country")
    private String country;

    @JsonProperty("zipCode")
    private String zipCode;

    @JsonProperty("createdAt")
    private String createdAt;

    @JsonProperty("timeZone")
    private String timeZone;

    @JsonProperty("latitude")
    private Double latitude;

    @JsonProperty("longitude")
    private Double longitude;

    @JsonProperty("coverageRange")
    private Double coverageRange;

    @JsonProperty("company")
    private Company company;

    // getters and setters, equals, hashCode, toString
}

// Tool.java
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

public class Tool {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String type;

    @JsonProperty("totalCycles")
    private Integer totalCycles;

    @JsonProperty("usedCavities")
    private Integer usedCavities;

    @JsonProperty("availableCavities")
    private Integer availableCavities;

    @JsonProperty("producedParts")
    private List<ProducedPart> producedParts;

    @JsonProperty("ownerCompany")
    private Company ownerCompany;

    @JsonProperty("operatingPlant")
    private Plant operatingPlant;

    @JsonProperty("inHouse")
    private Boolean inHouse;

    @JsonProperty("createdAt")
    private String createdAt;

    @JsonProperty("commissioningDate")
    private String commissioningDate;

    @JsonProperty("targetCycleTime")
    private Double targetCycleTime;

    @JsonProperty("matixData")
    private MatixData matixData;

    // getters and setters, equals, hashCode, toString
}

class ProducedPart {
    @JsonProperty("key")
    private String key;

    @JsonProperty("value")
    private String value;

    // getters and setters, equals, hashCode, toString
}

class MatixData {
    @JsonProperty("deviceId")
    private String deviceId;

    @JsonProperty("position")
    private Position position;

    @JsonProperty("stateOfCharge")
    private TelemetryData stateOfCharge;

    @JsonProperty("battery")
    private TelemetryData battery;

    // getters and setters, equals, hashCode, toString
}

class Position {
    @JsonProperty("latitude")
    private Double latitude;

    @JsonProperty("longitude")
    private Double longitude;

    @JsonProperty("updatedAt")
    private String updatedAt;

    // getters and setters, equals, hashCode, toString
}

class TelemetryData {
    @JsonProperty("value")
    private Double value;

    @JsonProperty("updatedAt")
    private String updatedAt;

    // getters and setters, equals, hashCode, toString
}

// ToolController.java
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ToolController {

    @GetMapping("/companies")
    public ResponseEntity<List<Company>> getCompanies() {
        // Implementation to get companies
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/plants")
    public ResponseEntity<List<Plant>> getPlants() {
        // Implementation to get plants
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/tools")
    public ResponseEntity<Object> getTools(@RequestParam(required = false) Integer page) {
        // Implementation to get tools
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/tool")
    public ResponseEntity<Object> getTool(@RequestParam(required = false) Integer id, @RequestParam(required = false) String externalId) {
        // Implementation to get a specific tool
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/telemetry")
    public ResponseEntity<Object> getTelemetry(@RequestParam(required = false) Integer id, @RequestParam(required = false) String externalId, @RequestParam(required = false) Integer from, @RequestParam(required = false) Integer to, @RequestParam(required = false) String keys) {
        // Implementation to get tool telemetry
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
