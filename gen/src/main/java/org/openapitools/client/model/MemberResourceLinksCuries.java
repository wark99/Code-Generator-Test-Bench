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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MemberResourceLinksCuries
 */
@JsonPropertyOrder({
  MemberResourceLinksCuries.JSON_PROPERTY_NAME,
  MemberResourceLinksCuries.JSON_PROPERTY_HREF,
  MemberResourceLinksCuries.JSON_PROPERTY_TEMPLATED
})
@JsonTypeName("MemberResource__links_curies")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:40.667796194Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MemberResourceLinksCuries {
  /**
   * Gets or Sets name
   */
  public enum NameEnum {
    MEMBER("member");

    private String value;

    NameEnum(String value) {
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
    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_NAME = "name";
  private NameEnum name;

  /**
   * Gets or Sets href
   */
  public enum HrefEnum {
    HTTPS_WIKI_RPHAVEN_CO_UK_API_RELS_REL_("https://wiki.rphaven.co.uk/api/rels/{rel}");

    private Object value;

    HrefEnum(Object value) {
      this.value = value;
    }

    @JsonValue
    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HrefEnum fromValue(Object value) {
      for (HrefEnum b : HrefEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_HREF = "href";
  private HrefEnum href = null;

  public static final String JSON_PROPERTY_TEMPLATED = "templated";
  private JsonNullable<Object> templated = JsonNullable.<Object>of(true);

  public MemberResourceLinksCuries() {
  }

  public MemberResourceLinksCuries name(NameEnum name) {
    
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

  public NameEnum getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(NameEnum name) {
    this.name = name;
  }


  public MemberResourceLinksCuries href(HrefEnum href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public HrefEnum getHref() {
    return href;
  }


  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHref(HrefEnum href) {
    this.href = href;
  }


  public MemberResourceLinksCuries templated(Object templated) {
    this.templated = JsonNullable.<Object>of(templated);
    
    return this;
  }

   /**
   * Get templated
   * @return templated
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getTemplated() {
        return templated.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEMPLATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTemplated_JsonNullable() {
    return templated;
  }
  
  @JsonProperty(JSON_PROPERTY_TEMPLATED)
  public void setTemplated_JsonNullable(JsonNullable<Object> templated) {
    this.templated = templated;
  }

  public void setTemplated(Object templated) {
    this.templated = JsonNullable.<Object>of(templated);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberResourceLinksCuries memberResourceLinksCuries = (MemberResourceLinksCuries) o;
    return Objects.equals(this.name, memberResourceLinksCuries.name) &&
        Objects.equals(this.href, memberResourceLinksCuries.href) &&
        equalsNullable(this.templated, memberResourceLinksCuries.templated);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, href, hashCodeNullable(templated));
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
    sb.append("class MemberResourceLinksCuries {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    templated: ").append(toIndentedString(templated)).append("\n");
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
