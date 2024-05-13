/*
 * AIRBIT IoT Workspace REST API
 * This API is intended to work with the application **AIRBIT IoT Workspace** .
 *
 * The version of the OpenAPI document: 2.0.1
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
 * ExternalAccountTagsBaseScheme
 */
@JsonPropertyOrder({
  ExternalAccountTagsBaseScheme.JSON_PROPERTY_ID,
  ExternalAccountTagsBaseScheme.JSON_PROPERTY_ACTION_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:05.417254227Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ExternalAccountTagsBaseScheme {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_ACTION_NAME = "action_name";
  private String actionName;

  public ExternalAccountTagsBaseScheme() {
  }

  public ExternalAccountTagsBaseScheme id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * external account tag id
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(Integer id) {
    this.id = id;
  }


  public ExternalAccountTagsBaseScheme actionName(String actionName) {
    
    this.actionName = actionName;
    return this;
  }

   /**
   * action name
   * @return actionName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACTION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getActionName() {
    return actionName;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActionName(String actionName) {
    this.actionName = actionName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalAccountTagsBaseScheme externalAccountTagsBaseScheme = (ExternalAccountTagsBaseScheme) o;
    return Objects.equals(this.id, externalAccountTagsBaseScheme.id) &&
        Objects.equals(this.actionName, externalAccountTagsBaseScheme.actionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, actionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalAccountTagsBaseScheme {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
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

