/*
 * CHT SA GPT Application
 * Development Environment.
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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BaseHttpActionPutCorrectResponseModel
 */
@JsonPropertyOrder({
  BaseHttpActionPutCorrectResponseModel.JSON_PROPERTY_EXECUTED,
  BaseHttpActionPutCorrectResponseModel.JSON_PROPERTY_CODE,
  BaseHttpActionPutCorrectResponseModel.JSON_PROPERTY_MESSAGE,
  BaseHttpActionPutCorrectResponseModel.JSON_PROPERTY_ENTITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:15:35.805334182Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BaseHttpActionPutCorrectResponseModel {
  public static final String JSON_PROPERTY_EXECUTED = "executed";
  private Boolean executed = true;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code = "20001";

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message = "put correct";

  public static final String JSON_PROPERTY_ENTITY = "entity";
  private JsonNullable<Object> entity = JsonNullable.<Object>of(null);

  public BaseHttpActionPutCorrectResponseModel() {
  }

  public BaseHttpActionPutCorrectResponseModel executed(Boolean executed) {
    
    this.executed = executed;
    return this;
  }

   /**
   * Get executed
   * @return executed
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExecuted() {
    return executed;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecuted(Boolean executed) {
    this.executed = executed;
  }


  public BaseHttpActionPutCorrectResponseModel code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public BaseHttpActionPutCorrectResponseModel message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public BaseHttpActionPutCorrectResponseModel entity(Object entity) {
    this.entity = JsonNullable.<Object>of(entity);
    
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getEntity() {
        return entity.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getEntity_JsonNullable() {
    return entity;
  }
  
  @JsonProperty(JSON_PROPERTY_ENTITY)
  public void setEntity_JsonNullable(JsonNullable<Object> entity) {
    this.entity = entity;
  }

  public void setEntity(Object entity) {
    this.entity = JsonNullable.<Object>of(entity);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseHttpActionPutCorrectResponseModel baseHttpActionPutCorrectResponseModel = (BaseHttpActionPutCorrectResponseModel) o;
    return Objects.equals(this.executed, baseHttpActionPutCorrectResponseModel.executed) &&
        Objects.equals(this.code, baseHttpActionPutCorrectResponseModel.code) &&
        Objects.equals(this.message, baseHttpActionPutCorrectResponseModel.message) &&
        equalsNullable(this.entity, baseHttpActionPutCorrectResponseModel.entity);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(executed, code, message, hashCodeNullable(entity));
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
    sb.append("class BaseHttpActionPutCorrectResponseModel {\n");
    sb.append("    executed: ").append(toIndentedString(executed)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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

