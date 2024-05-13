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
 * Error object
 */
@JsonPropertyOrder({
  Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet400ResponseAllOfError.JSON_PROPERTY_CODE,
  Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet400ResponseAllOfError.JSON_PROPERTY_DESCRIPTION,
  Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet400ResponseAllOfError.JSON_PROPERTY_ERRORS
})
@JsonTypeName("_1_mail_hostings__mail_hosting_id__mailboxes__mailbox_name__signatures__signature_id__get_400_response_allOf_error")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet400ResponseAllOfError {
  /**
   * Error code
   */
  public enum CodeEnum {
    SIGNATURE_DOES_NOT_EXIST("signature_does_not_exist");

    private String value;

    CodeEnum(String value) {
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
    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CODE = "code";
  private CodeEnum code;

  /**
   * Description of the error
   */
  public enum DescriptionEnum {
    SIGNATURE_DOES_NOT_EXIST("Signature does not exist");

    private String value;

    DescriptionEnum(String value) {
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
    public static DescriptionEnum fromValue(String value) {
      for (DescriptionEnum b : DescriptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private DescriptionEnum description;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<String> errors;

  public Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet400ResponseAllOfError() {
  }

  public Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet400ResponseAllOfError code(CodeEnum code) {
    
    this.code = code;
    return this;
  }

   /**
   * Error code
   * @return code
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CodeEnum getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet400ResponseAllOfError description(DescriptionEnum description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the error
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DescriptionEnum getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(DescriptionEnum description) {
    this.description = description;
  }


  public Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet400ResponseAllOfError errors(List<String> errors) {
    
    this.errors = errors;
    return this;
  }

  public Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet400ResponseAllOfError addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Error details
   * @return errors
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(List<String> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet400ResponseAllOfError _1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet400ResponseAllOfError = (Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet400ResponseAllOfError) o;
    return Objects.equals(this.code, _1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet400ResponseAllOfError.code) &&
        Objects.equals(this.description, _1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet400ResponseAllOfError.description) &&
        Objects.equals(this.errors, _1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet400ResponseAllOfError.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet400ResponseAllOfError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

