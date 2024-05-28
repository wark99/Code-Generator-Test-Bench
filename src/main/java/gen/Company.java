package gen;

// Company.java
import com.fasterxml.jackson.annotation.JsonProperty;

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