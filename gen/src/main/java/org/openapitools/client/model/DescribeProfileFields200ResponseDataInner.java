/*
 * Proxy API Adapter
 * Convert standard OpenAPI requests to Internal API s**t show, respond with normalized data and messaging
 *
 * The version of the OpenAPI document: 1.1.1
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
 * DescribeProfileFields200ResponseDataInner
 */
@JsonPropertyOrder({
  DescribeProfileFields200ResponseDataInner.JSON_PROPERTY_NAME,
  DescribeProfileFields200ResponseDataInner.JSON_PROPERTY_LABEL,
  DescribeProfileFields200ResponseDataInner.JSON_PROPERTY_INPUT_DATA_TYPE,
  DescribeProfileFields200ResponseDataInner.JSON_PROPERTY_REQUIRED
})
@JsonTypeName("describe_profile_fields_200_response_data_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:03.349465965Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DescribeProfileFields200ResponseDataInner {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_INPUT_DATA_TYPE = "input_data_type";
  private String inputDataType;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required;

  public DescribeProfileFields200ResponseDataInner() {
  }

  public DescribeProfileFields200ResponseDataInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public DescribeProfileFields200ResponseDataInner label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  public DescribeProfileFields200ResponseDataInner inputDataType(String inputDataType) {
    
    this.inputDataType = inputDataType;
    return this;
  }

   /**
   * Get inputDataType
   * @return inputDataType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInputDataType() {
    return inputDataType;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputDataType(String inputDataType) {
    this.inputDataType = inputDataType;
  }


  public DescribeProfileFields200ResponseDataInner required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequired() {
    return required;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequired(Boolean required) {
    this.required = required;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeProfileFields200ResponseDataInner describeProfileFields200ResponseDataInner = (DescribeProfileFields200ResponseDataInner) o;
    return Objects.equals(this.name, describeProfileFields200ResponseDataInner.name) &&
        Objects.equals(this.label, describeProfileFields200ResponseDataInner.label) &&
        Objects.equals(this.inputDataType, describeProfileFields200ResponseDataInner.inputDataType) &&
        Objects.equals(this.required, describeProfileFields200ResponseDataInner.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, label, inputDataType, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeProfileFields200ResponseDataInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    inputDataType: ").append(toIndentedString(inputDataType)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

