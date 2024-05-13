/*
 * RPHaven Games Management
 * This is a sample Pet Store Server based on the OpenAPI 3.1 specification.  You can find out more about Swagger at [https://swagger.io](https://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 * The version of the OpenAPI document: 1.0.2
 * Contact: apiteam@rphaven.co.uk
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
import java.net.URI;
import org.openapitools.client.model.MemberResourceLinksCuries;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MemberResourceLinks
 */
@JsonPropertyOrder({
  MemberResourceLinks.JSON_PROPERTY_SELF,
  MemberResourceLinks.JSON_PROPERTY_CURIES
})
@JsonTypeName("MemberResource__links")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:40.667796194Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MemberResourceLinks {
  public static final String JSON_PROPERTY_SELF = "self";
  private URI self;

  public static final String JSON_PROPERTY_CURIES = "curies";
  private MemberResourceLinksCuries curies;

  public MemberResourceLinks() {
  }

  public MemberResourceLinks self(URI self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getSelf() {
    return self;
  }


  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelf(URI self) {
    this.self = self;
  }


  public MemberResourceLinks curies(MemberResourceLinksCuries curies) {
    
    this.curies = curies;
    return this;
  }

   /**
   * Get curies
   * @return curies
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MemberResourceLinksCuries getCuries() {
    return curies;
  }


  @JsonProperty(JSON_PROPERTY_CURIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCuries(MemberResourceLinksCuries curies) {
    this.curies = curies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberResourceLinks memberResourceLinks = (MemberResourceLinks) o;
    return Objects.equals(this.self, memberResourceLinks.self) &&
        Objects.equals(this.curies, memberResourceLinks.curies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, curies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberResourceLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    curies: ").append(toIndentedString(curies)).append("\n");
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

