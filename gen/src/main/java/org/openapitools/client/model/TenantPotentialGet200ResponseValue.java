/*
 * SME Professional API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.15.0-oas3.1
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.MetaResponse;
import org.openapitools.client.model.PotentialTenantResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TenantPotentialGet200ResponseValue
 */
@JsonPropertyOrder({
  TenantPotentialGet200ResponseValue.JSON_PROPERTY_META,
  TenantPotentialGet200ResponseValue.JSON_PROPERTY_POTENTIAL_TENANTS
})
@JsonTypeName("_tenant_potential_get_200_response_value")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TenantPotentialGet200ResponseValue {
  public static final String JSON_PROPERTY_META = "meta";
  private MetaResponse meta;

  public static final String JSON_PROPERTY_POTENTIAL_TENANTS = "potential_tenants";
  private List<PotentialTenantResponse> potentialTenants;

  public TenantPotentialGet200ResponseValue() {
  }

  public TenantPotentialGet200ResponseValue meta(MetaResponse meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetaResponse getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(MetaResponse meta) {
    this.meta = meta;
  }


  public TenantPotentialGet200ResponseValue potentialTenants(List<PotentialTenantResponse> potentialTenants) {
    
    this.potentialTenants = potentialTenants;
    return this;
  }

  public TenantPotentialGet200ResponseValue addPotentialTenantsItem(PotentialTenantResponse potentialTenantsItem) {
    if (this.potentialTenants == null) {
      this.potentialTenants = new ArrayList<>();
    }
    this.potentialTenants.add(potentialTenantsItem);
    return this;
  }

   /**
   * Get potentialTenants
   * @return potentialTenants
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POTENTIAL_TENANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PotentialTenantResponse> getPotentialTenants() {
    return potentialTenants;
  }


  @JsonProperty(JSON_PROPERTY_POTENTIAL_TENANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPotentialTenants(List<PotentialTenantResponse> potentialTenants) {
    this.potentialTenants = potentialTenants;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantPotentialGet200ResponseValue tenantPotentialGet200ResponseValue = (TenantPotentialGet200ResponseValue) o;
    return Objects.equals(this.meta, tenantPotentialGet200ResponseValue.meta) &&
        Objects.equals(this.potentialTenants, tenantPotentialGet200ResponseValue.potentialTenants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, potentialTenants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantPotentialGet200ResponseValue {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    potentialTenants: ").append(toIndentedString(potentialTenants)).append("\n");
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

