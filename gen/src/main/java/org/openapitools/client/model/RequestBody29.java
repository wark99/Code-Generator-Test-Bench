/*
 * API Reference - Developer tools
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@infomaniak.com
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
 * RequestBody29
 */
@JsonPropertyOrder({
  RequestBody29.JSON_PROPERTY_APPLY_ALL,
  RequestBody29.JSON_PROPERTY_ENABLED,
  RequestBody29.JSON_PROPERTY_MAILBOXES
})
@JsonTypeName("Request_body_29")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RequestBody29 {
  public static final String JSON_PROPERTY_APPLY_ALL = "apply_all";
  private Boolean applyAll;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_MAILBOXES = "mailboxes";
  private List<String> mailboxes;

  public RequestBody29() {
  }

  public RequestBody29 applyAll(Boolean applyAll) {
    
    this.applyAll = applyAll;
    return this;
  }

   /**
   * Get applyAll
   * @return applyAll
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLY_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getApplyAll() {
    return applyAll;
  }


  @JsonProperty(JSON_PROPERTY_APPLY_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplyAll(Boolean applyAll) {
    this.applyAll = applyAll;
  }


  public RequestBody29 enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public RequestBody29 mailboxes(List<String> mailboxes) {
    
    this.mailboxes = mailboxes;
    return this;
  }

  public RequestBody29 addMailboxesItem(String mailboxesItem) {
    if (this.mailboxes == null) {
      this.mailboxes = new ArrayList<>();
    }
    this.mailboxes.add(mailboxesItem);
    return this;
  }

   /**
   * Get mailboxes
   * @return mailboxes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAILBOXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMailboxes() {
    return mailboxes;
  }


  @JsonProperty(JSON_PROPERTY_MAILBOXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMailboxes(List<String> mailboxes) {
    this.mailboxes = mailboxes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBody29 requestBody29 = (RequestBody29) o;
    return Objects.equals(this.applyAll, requestBody29.applyAll) &&
        Objects.equals(this.enabled, requestBody29.enabled) &&
        Objects.equals(this.mailboxes, requestBody29.mailboxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyAll, enabled, mailboxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBody29 {\n");
    sb.append("    applyAll: ").append(toIndentedString(applyAll)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    mailboxes: ").append(toIndentedString(mailboxes)).append("\n");
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
