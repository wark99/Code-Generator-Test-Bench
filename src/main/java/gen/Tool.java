package gen;

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
