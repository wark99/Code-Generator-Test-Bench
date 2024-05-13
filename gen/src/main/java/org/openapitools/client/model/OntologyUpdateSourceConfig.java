/*
 * Euboul - Studio Backend
 * listing of all APIs of studio backend 
 *
 * The version of the OpenAPI document: 0.1.25
 * Contact: admin@cognitivegarage.ai
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OntologyUpdateSourceConfig
 */
@JsonPropertyOrder({
  OntologyUpdateSourceConfig.JSON_PROPERTY_QUESTION,
  OntologyUpdateSourceConfig.JSON_PROPERTY_DISPLAY_DATA_TYPE,
  OntologyUpdateSourceConfig.JSON_PROPERTY_ALLOWED_VALUES,
  OntologyUpdateSourceConfig.JSON_PROPERTY_INTEGRATION_TYPE,
  OntologyUpdateSourceConfig.JSON_PROPERTY_INTEGRATION_NAME,
  OntologyUpdateSourceConfig.JSON_PROPERTY_FUNCTION_NAME,
  OntologyUpdateSourceConfig.JSON_PROPERTY_NODE_LIST
})
@JsonTypeName("OntologyUpdate_source_config")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:14:21.073249278Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OntologyUpdateSourceConfig {
  public static final String JSON_PROPERTY_QUESTION = "question";
  private String question;

  public static final String JSON_PROPERTY_DISPLAY_DATA_TYPE = "displayDataType";
  private String displayDataType;

  public static final String JSON_PROPERTY_ALLOWED_VALUES = "allowedValues";
  private List<String> allowedValues;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integrationType";
  private String integrationType;

  public static final String JSON_PROPERTY_INTEGRATION_NAME = "integrationName";
  private String integrationName;

  public static final String JSON_PROPERTY_FUNCTION_NAME = "functionName";
  private String functionName;

  public static final String JSON_PROPERTY_NODE_LIST = "nodeList";
  private List<String> nodeList;

  public OntologyUpdateSourceConfig() {
  }

  public OntologyUpdateSourceConfig question(String question) {
    
    this.question = question;
    return this;
  }

   /**
   * Get question
   * @return question
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUESTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuestion() {
    return question;
  }


  @JsonProperty(JSON_PROPERTY_QUESTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuestion(String question) {
    this.question = question;
  }


  public OntologyUpdateSourceConfig displayDataType(String displayDataType) {
    
    this.displayDataType = displayDataType;
    return this;
  }

   /**
   * Get displayDataType
   * @return displayDataType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayDataType() {
    return displayDataType;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayDataType(String displayDataType) {
    this.displayDataType = displayDataType;
  }


  public OntologyUpdateSourceConfig allowedValues(List<String> allowedValues) {
    
    this.allowedValues = allowedValues;
    return this;
  }

  public OntologyUpdateSourceConfig addAllowedValuesItem(String allowedValuesItem) {
    if (this.allowedValues == null) {
      this.allowedValues = new ArrayList<>();
    }
    this.allowedValues.add(allowedValuesItem);
    return this;
  }

   /**
   * Get allowedValues
   * @return allowedValues
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAllowedValues() {
    return allowedValues;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedValues(List<String> allowedValues) {
    this.allowedValues = allowedValues;
  }


  public OntologyUpdateSourceConfig integrationType(String integrationType) {
    
    this.integrationType = integrationType;
    return this;
  }

   /**
   * Get integrationType
   * @return integrationType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationType() {
    return integrationType;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationType(String integrationType) {
    this.integrationType = integrationType;
  }


  public OntologyUpdateSourceConfig integrationName(String integrationName) {
    
    this.integrationName = integrationName;
    return this;
  }

   /**
   * Get integrationName
   * @return integrationName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationName() {
    return integrationName;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationName(String integrationName) {
    this.integrationName = integrationName;
  }


  public OntologyUpdateSourceConfig functionName(String functionName) {
    
    this.functionName = functionName;
    return this;
  }

   /**
   * Get functionName
   * @return functionName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUNCTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFunctionName() {
    return functionName;
  }


  @JsonProperty(JSON_PROPERTY_FUNCTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFunctionName(String functionName) {
    this.functionName = functionName;
  }


  public OntologyUpdateSourceConfig nodeList(List<String> nodeList) {
    
    this.nodeList = nodeList;
    return this;
  }

  public OntologyUpdateSourceConfig addNodeListItem(String nodeListItem) {
    if (this.nodeList == null) {
      this.nodeList = new ArrayList<>();
    }
    this.nodeList.add(nodeListItem);
    return this;
  }

   /**
   * Get nodeList
   * @return nodeList
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getNodeList() {
    return nodeList;
  }


  @JsonProperty(JSON_PROPERTY_NODE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNodeList(List<String> nodeList) {
    this.nodeList = nodeList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OntologyUpdateSourceConfig ontologyUpdateSourceConfig = (OntologyUpdateSourceConfig) o;
    return Objects.equals(this.question, ontologyUpdateSourceConfig.question) &&
        Objects.equals(this.displayDataType, ontologyUpdateSourceConfig.displayDataType) &&
        Objects.equals(this.allowedValues, ontologyUpdateSourceConfig.allowedValues) &&
        Objects.equals(this.integrationType, ontologyUpdateSourceConfig.integrationType) &&
        Objects.equals(this.integrationName, ontologyUpdateSourceConfig.integrationName) &&
        Objects.equals(this.functionName, ontologyUpdateSourceConfig.functionName) &&
        Objects.equals(this.nodeList, ontologyUpdateSourceConfig.nodeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(question, displayDataType, allowedValues, integrationType, integrationName, functionName, nodeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OntologyUpdateSourceConfig {\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    displayDataType: ").append(toIndentedString(displayDataType)).append("\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    integrationName: ").append(toIndentedString(integrationName)).append("\n");
    sb.append("    functionName: ").append(toIndentedString(functionName)).append("\n");
    sb.append("    nodeList: ").append(toIndentedString(nodeList)).append("\n");
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

