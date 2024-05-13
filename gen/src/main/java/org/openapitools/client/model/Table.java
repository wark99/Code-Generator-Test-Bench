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
import org.openapitools.client.model.TableLinksLinks;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The base HAL Table schema
 */
@JsonPropertyOrder({
  Table.JSON_PROPERTY_LINKS,
  Table.JSON_PROPERTY_NAME,
  Table.JSON_PROPERTY_SEATS,
  Table.JSON_PROPERTY_FORMED,
  Table.JSON_PROPERTY_DISBANDS,
  Table.JSON_PROPERTY_SIGNUP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:40.667796194Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Table {
  public static final String JSON_PROPERTY_LINKS = "_links";
  private TableLinksLinks links;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<Object> name = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SEATS = "seats";
  private JsonNullable<Object> seats = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_FORMED = "formed";
  private JsonNullable<Object> formed = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DISBANDS = "disbands";
  private JsonNullable<Object> disbands = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SIGNUP = "signup";
  private JsonNullable<Object> signup = JsonNullable.<Object>of(null);

  public Table() {
  }

  public Table links(TableLinksLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TableLinksLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(TableLinksLinks links) {
    this.links = links;
  }


  public Table name(Object name) {
    this.name = JsonNullable.<Object>of(name);
    
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<Object> name) {
    this.name = name;
  }

  public void setName(Object name) {
    this.name = JsonNullable.<Object>of(name);
  }


  public Table seats(Object seats) {
    this.seats = JsonNullable.<Object>of(seats);
    
    return this;
  }

   /**
   * The maximum number of participants (including GMs)
   * @return seats
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSeats() {
        return seats.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SEATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSeats_JsonNullable() {
    return seats;
  }
  
  @JsonProperty(JSON_PROPERTY_SEATS)
  public void setSeats_JsonNullable(JsonNullable<Object> seats) {
    this.seats = seats;
  }

  public void setSeats(Object seats) {
    this.seats = JsonNullable.<Object>of(seats);
  }


  public Table formed(Object formed) {
    this.formed = JsonNullable.<Object>of(formed);
    
    return this;
  }

   /**
   * Get formed
   * @return formed
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getFormed() {
        return formed.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FORMED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getFormed_JsonNullable() {
    return formed;
  }
  
  @JsonProperty(JSON_PROPERTY_FORMED)
  public void setFormed_JsonNullable(JsonNullable<Object> formed) {
    this.formed = formed;
  }

  public void setFormed(Object formed) {
    this.formed = JsonNullable.<Object>of(formed);
  }


  public Table disbands(Object disbands) {
    this.disbands = JsonNullable.<Object>of(disbands);
    
    return this;
  }

   /**
   * Get disbands
   * @return disbands
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDisbands() {
        return disbands.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISBANDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDisbands_JsonNullable() {
    return disbands;
  }
  
  @JsonProperty(JSON_PROPERTY_DISBANDS)
  public void setDisbands_JsonNullable(JsonNullable<Object> disbands) {
    this.disbands = disbands;
  }

  public void setDisbands(Object disbands) {
    this.disbands = JsonNullable.<Object>of(disbands);
  }


  public Table signup(Object signup) {
    this.signup = JsonNullable.<Object>of(signup);
    
    return this;
  }

   /**
   * Get signup
   * @return signup
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSignup() {
        return signup.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIGNUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSignup_JsonNullable() {
    return signup;
  }
  
  @JsonProperty(JSON_PROPERTY_SIGNUP)
  public void setSignup_JsonNullable(JsonNullable<Object> signup) {
    this.signup = signup;
  }

  public void setSignup(Object signup) {
    this.signup = JsonNullable.<Object>of(signup);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Table table = (Table) o;
    return Objects.equals(this.links, table.links) &&
        equalsNullable(this.name, table.name) &&
        equalsNullable(this.seats, table.seats) &&
        equalsNullable(this.formed, table.formed) &&
        equalsNullable(this.disbands, table.disbands) &&
        equalsNullable(this.signup, table.signup);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, hashCodeNullable(name), hashCodeNullable(seats), hashCodeNullable(formed), hashCodeNullable(disbands), hashCodeNullable(signup));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Table {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seats: ").append(toIndentedString(seats)).append("\n");
    sb.append("    formed: ").append(toIndentedString(formed)).append("\n");
    sb.append("    disbands: ").append(toIndentedString(disbands)).append("\n");
    sb.append("    signup: ").append(toIndentedString(signup)).append("\n");
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
