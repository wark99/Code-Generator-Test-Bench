/*
 * RPHaven Games Management
 * This is a sample Pet Store Server based on the OpenAPI 3.1 specification.  You can find out more about Swagger at [https://swagger.io](https://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 * The version of the OpenAPI document: 1.0.2
 * Contact: apiteam@rphaven.co.uk
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
import org.openapitools.client.model.Table;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VenueTablesAllOfEmbedded
 */
@JsonPropertyOrder({
  VenueTablesAllOfEmbedded.JSON_PROPERTY_VENUE_COLON_TABLES
})
@JsonTypeName("VenueTables_allOf__embedded")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:40.667796194Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class VenueTablesAllOfEmbedded {
  public static final String JSON_PROPERTY_VENUE_COLON_TABLES = "venue:tables";
  private List<Table> venueColonTables;

  public VenueTablesAllOfEmbedded() {
  }

  public VenueTablesAllOfEmbedded venueColonTables(List<Table> venueColonTables) {
    
    this.venueColonTables = venueColonTables;
    return this;
  }

  public VenueTablesAllOfEmbedded addVenueColonTablesItem(Table venueColonTablesItem) {
    if (this.venueColonTables == null) {
      this.venueColonTables = new ArrayList<>();
    }
    this.venueColonTables.add(venueColonTablesItem);
    return this;
  }

   /**
   * Get venueColonTables
   * @return venueColonTables
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VENUE_COLON_TABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Table> getVenueColonTables() {
    return venueColonTables;
  }


  @JsonProperty(JSON_PROPERTY_VENUE_COLON_TABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVenueColonTables(List<Table> venueColonTables) {
    this.venueColonTables = venueColonTables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VenueTablesAllOfEmbedded venueTablesAllOfEmbedded = (VenueTablesAllOfEmbedded) o;
    return Objects.equals(this.venueColonTables, venueTablesAllOfEmbedded.venueColonTables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(venueColonTables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VenueTablesAllOfEmbedded {\n");
    sb.append("    venueColonTables: ").append(toIndentedString(venueColonTables)).append("\n");
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
