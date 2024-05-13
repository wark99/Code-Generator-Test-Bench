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
import org.openapitools.client.model.AppApiv2ConstansActions1;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateExternalAccountTagScheme
 */
@JsonPropertyOrder({
  CreateExternalAccountTagScheme.JSON_PROPERTY_ACTION_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:05.417254227Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateExternalAccountTagScheme {
  public static final String JSON_PROPERTY_ACTION_NAME = "action_name";
  private AppApiv2ConstansActions1 actionName;

  public CreateExternalAccountTagScheme() {
  }

  public CreateExternalAccountTagScheme actionName(AppApiv2ConstansActions1 actionName) {
    
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

  public AppApiv2ConstansActions1 getActionName() {
    return actionName;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActionName(AppApiv2ConstansActions1 actionName) {
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
    CreateExternalAccountTagScheme createExternalAccountTagScheme = (CreateExternalAccountTagScheme) o;
    return Objects.equals(this.actionName, createExternalAccountTagScheme.actionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateExternalAccountTagScheme {\n");
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

