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
import org.openapitools.client.model.CompanyId;
import org.openapitools.client.model.Prefix2;
import org.openapitools.client.model.Prefix3;
import org.openapitools.client.model.Status;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateAddressNode
 */
@JsonPropertyOrder({
  CreateAddressNode.JSON_PROPERTY_STATUS,
  CreateAddressNode.JSON_PROPERTY_COMPANY_ID,
  CreateAddressNode.JSON_PROPERTY_NAME,
  CreateAddressNode.JSON_PROPERTY_PREFIX,
  CreateAddressNode.JSON_PROPERTY_POSTFIX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:05.417254227Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateAddressNode {
  public static final String JSON_PROPERTY_STATUS = "status";
  private Status status;

  public static final String JSON_PROPERTY_COMPANY_ID = "company_id";
  private CompanyId companyId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private Prefix2 prefix;

  public static final String JSON_PROPERTY_POSTFIX = "postfix";
  private Prefix3 postfix;

  public CreateAddressNode() {
  }

  public CreateAddressNode status(Status status) {
    
    this.status = status;
    return this;
  }

   /**
   * status (1 - Inactive, 2 - Active)
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Status getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(Status status) {
    this.status = status;
  }


  public CreateAddressNode companyId(CompanyId companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CompanyId getCompanyId() {
    return companyId;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyId(CompanyId companyId) {
    this.companyId = companyId;
  }


  public CreateAddressNode name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Address name
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CreateAddressNode prefix(Prefix2 prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Prefix2 getPrefix() {
    return prefix;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefix(Prefix2 prefix) {
    this.prefix = prefix;
  }


  public CreateAddressNode postfix(Prefix3 postfix) {
    
    this.postfix = postfix;
    return this;
  }

   /**
   * Get postfix
   * @return postfix
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Prefix3 getPostfix() {
    return postfix;
  }


  @JsonProperty(JSON_PROPERTY_POSTFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostfix(Prefix3 postfix) {
    this.postfix = postfix;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAddressNode createAddressNode = (CreateAddressNode) o;
    return Objects.equals(this.status, createAddressNode.status) &&
        Objects.equals(this.companyId, createAddressNode.companyId) &&
        Objects.equals(this.name, createAddressNode.name) &&
        Objects.equals(this.prefix, createAddressNode.prefix) &&
        Objects.equals(this.postfix, createAddressNode.postfix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, companyId, name, prefix, postfix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAddressNode {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    postfix: ").append(toIndentedString(postfix)).append("\n");
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

