package gen;

import com.fasterxml.jackson.annotation.JsonProperty;

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
