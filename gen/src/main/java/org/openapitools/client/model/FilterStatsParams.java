/*
 * Perch API
 * Perch API for accessing data from Perch. See our [API Guide](https://docs.google.com/document/d/1ms6LFNwFN4C4WkrfWs8Hlu5igFBpNLhNr7uLEkGmvJA) for guidance on best practices. <br/> <br/> Find out more about Perch at [https://perch.fit](https://perch.fit) or by contacting us at [support@perch.fit](mailto:support@perch.fit).
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support@perch.fit
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
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FilterStatsParams
 */
@JsonPropertyOrder({
  FilterStatsParams.JSON_PROPERTY_LIMIT,
  FilterStatsParams.JSON_PROPERTY_NEXT_TOKEN,
  FilterStatsParams.JSON_PROPERTY_USER_ID,
  FilterStatsParams.JSON_PROPERTY_GROUP_ID,
  FilterStatsParams.JSON_PROPERTY_EXERCISE_ID,
  FilterStatsParams.JSON_PROPERTY_BEGIN_TIME,
  FilterStatsParams.JSON_PROPERTY_END_TIME,
  FilterStatsParams.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:41.221792118Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FilterStatsParams {
  public static final String JSON_PROPERTY_LIMIT = "limit";
  private JsonNullable<Object> limit = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_NEXT_TOKEN = "next_token";
  private JsonNullable<Object> nextToken = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Integer userId;

  public static final String JSON_PROPERTY_GROUP_ID = "group_id";
  private Integer groupId;

  public static final String JSON_PROPERTY_EXERCISE_ID = "exercise_id";
  private Integer exerciseId;

  public static final String JSON_PROPERTY_BEGIN_TIME = "begin_time";
  private BigDecimal beginTime;

  public static final String JSON_PROPERTY_END_TIME = "end_time";
  private BigDecimal endTime;

  /**
   * A descriptor for what this recorded stat represents.
   */
  public enum TypeEnum {
    ONE_RM("ONE_RM");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public FilterStatsParams() {
  }

  public FilterStatsParams limit(Object limit) {
    this.limit = JsonNullable.<Object>of(limit);
    
    return this;
  }

   /**
   * Limit the number of data items returned per page. This will default to (and be capped at) the configured page size for each individual endpoint.
   * @return limit
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getLimit() {
        return limit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getLimit_JsonNullable() {
    return limit;
  }
  
  @JsonProperty(JSON_PROPERTY_LIMIT)
  public void setLimit_JsonNullable(JsonNullable<Object> limit) {
    this.limit = limit;
  }

  public void setLimit(Object limit) {
    this.limit = JsonNullable.<Object>of(limit);
  }


  public FilterStatsParams nextToken(Object nextToken) {
    this.nextToken = JsonNullable.<Object>of(nextToken);
    
    return this;
  }

   /**
   * The &#x60;next_token&#x60; from a previous page response.
   * @return nextToken
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getNextToken() {
        return nextToken.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getNextToken_JsonNullable() {
    return nextToken;
  }
  
  @JsonProperty(JSON_PROPERTY_NEXT_TOKEN)
  public void setNextToken_JsonNullable(JsonNullable<Object> nextToken) {
    this.nextToken = nextToken;
  }

  public void setNextToken(Object nextToken) {
    this.nextToken = JsonNullable.<Object>of(nextToken);
  }


  public FilterStatsParams userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Retrieve only stats for the user with ID &#x3D; &#x60;user_id&#x60;.
   * @return userId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public FilterStatsParams groupId(Integer groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Retrieve only stats for users in the group with ID &#x3D; &#x60;group_id&#x60;.
   * @return groupId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }


  public FilterStatsParams exerciseId(Integer exerciseId) {
    
    this.exerciseId = exerciseId;
    return this;
  }

   /**
   * Retrieve only sets for the exercise with ID &#x3D; &#x60;exercise_id&#x60;.
   * @return exerciseId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXERCISE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExerciseId() {
    return exerciseId;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExerciseId(Integer exerciseId) {
    this.exerciseId = exerciseId;
  }


  public FilterStatsParams beginTime(BigDecimal beginTime) {
    
    this.beginTime = beginTime;
    return this;
  }

   /**
   * Get beginTime
   * @return beginTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BEGIN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBeginTime() {
    return beginTime;
  }


  @JsonProperty(JSON_PROPERTY_BEGIN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBeginTime(BigDecimal beginTime) {
    this.beginTime = beginTime;
  }


  public FilterStatsParams endTime(BigDecimal endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(BigDecimal endTime) {
    this.endTime = endTime;
  }


  public FilterStatsParams type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * A descriptor for what this recorded stat represents.
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterStatsParams filterStatsParams = (FilterStatsParams) o;
    return equalsNullable(this.limit, filterStatsParams.limit) &&
        equalsNullable(this.nextToken, filterStatsParams.nextToken) &&
        Objects.equals(this.userId, filterStatsParams.userId) &&
        Objects.equals(this.groupId, filterStatsParams.groupId) &&
        Objects.equals(this.exerciseId, filterStatsParams.exerciseId) &&
        Objects.equals(this.beginTime, filterStatsParams.beginTime) &&
        Objects.equals(this.endTime, filterStatsParams.endTime) &&
        Objects.equals(this.type, filterStatsParams.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(limit), hashCodeNullable(nextToken), userId, groupId, exerciseId, beginTime, endTime, type);
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
    sb.append("class FilterStatsParams {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    exerciseId: ").append(toIndentedString(exerciseId)).append("\n");
    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

