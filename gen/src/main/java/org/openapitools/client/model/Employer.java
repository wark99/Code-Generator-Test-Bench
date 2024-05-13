/*
 * Resume API
 * The Resume API allows developers to access resume content, providing detailed information about an individual's professional and educational background. This API offers endpoints for retrieving general information, such as name and contact details, as well as detailed sections for experience and education.
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: di-man@yandex.ru
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Position;
import org.openapitools.client.model.Url;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Employer
 */
@JsonPropertyOrder({
  Employer.JSON_PROPERTY_COMPANY,
  Employer.JSON_PROPERTY_LOGO,
  Employer.JSON_PROPERTY_POSITIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:15:28.161294873Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Employer {
  public static final String JSON_PROPERTY_COMPANY = "company";
  private String company;

  public static final String JSON_PROPERTY_LOGO = "logo";
  private Url logo;

  public static final String JSON_PROPERTY_POSITIONS = "positions";
  private List<Position> positions = new ArrayList<>();

  public Employer() {
  }

  public Employer company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCompany() {
    return company;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCompany(String company) {
    this.company = company;
  }


  public Employer logo(Url logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * Get logo
   * @return logo
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Url getLogo() {
    return logo;
  }


  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLogo(Url logo) {
    this.logo = logo;
  }


  public Employer positions(List<Position> positions) {
    
    this.positions = positions;
    return this;
  }

  public Employer addPositionsItem(Position positionsItem) {
    if (this.positions == null) {
      this.positions = new ArrayList<>();
    }
    this.positions.add(positionsItem);
    return this;
  }

   /**
   * Get positions
   * @return positions
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_POSITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Position> getPositions() {
    return positions;
  }


  @JsonProperty(JSON_PROPERTY_POSITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPositions(List<Position> positions) {
    this.positions = positions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employer employer = (Employer) o;
    return Objects.equals(this.company, employer.company) &&
        Objects.equals(this.logo, employer.logo) &&
        Objects.equals(this.positions, employer.positions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, logo, positions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employer {\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    positions: ").append(toIndentedString(positions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

