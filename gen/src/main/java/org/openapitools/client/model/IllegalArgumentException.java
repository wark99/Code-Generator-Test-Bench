/*
 * Optima Solutions - Asteo Ticketing
 * Remote API to interact between Freshdesk accounts and MasMovil application.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Exception for wrong value if any of the fields of the received ticket has an invalid value, a required field is missing, etc.
 */
@JsonPropertyOrder({
  IllegalArgumentException.JSON_PROPERTY_ILLEGAL_ARGUMENT_EXCEPTION
})
@JsonTypeName("illegalArgumentException")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:28.900088471Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IllegalArgumentException {
  public static final String JSON_PROPERTY_ILLEGAL_ARGUMENT_EXCEPTION = "illegalArgumentException";
  private String illegalArgumentException;

  public IllegalArgumentException() {
  }

  public IllegalArgumentException illegalArgumentException(String illegalArgumentException) {
    
    this.illegalArgumentException = illegalArgumentException;
    return this;
  }

   /**
   * Get illegalArgumentException
   * @return illegalArgumentException
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ILLEGAL_ARGUMENT_EXCEPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIllegalArgumentException() {
    return illegalArgumentException;
  }


  @JsonProperty(JSON_PROPERTY_ILLEGAL_ARGUMENT_EXCEPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIllegalArgumentException(String illegalArgumentException) {
    this.illegalArgumentException = illegalArgumentException;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IllegalArgumentException illegalArgumentException = (IllegalArgumentException) o;
    return Objects.equals(this.illegalArgumentException, illegalArgumentException.illegalArgumentException);
  }

  @Override
  public int hashCode() {
    return Objects.hash(illegalArgumentException);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IllegalArgumentException {\n");
    sb.append("    illegalArgumentException: ").append(toIndentedString(illegalArgumentException)).append("\n");
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

