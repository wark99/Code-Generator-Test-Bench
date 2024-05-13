/*
 * Customer Authorization API
 *  # Introduction Customer Authorization API The Customer Authorization API is the web service that allows you to exchange your application's `Client ID` and `Client Secret` for an `Access Token`. You will need to use the `accessToken` as authentication for all the other web requests, in the form of a HTTP Header as it follows: ``` Authorization: Bearer {accessToken} ```   Data API The Data API is the web service that allows you to obtain three kinds of data related to your users:    - Bank Account data   - Bank Transactions data   - Credit Score (VS 4.0) data   - Credit Report (VS 4.0) data 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: vs4plus@vantagescore.com
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
import org.openapitools.client.model.Person;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Names
 */
@JsonPropertyOrder({
  Names.JSON_PROPERTY_PERSON,
  Names.JSON_PROPERTY_QUALIFIER,
  Names.JSON_PROPERTY_SEARCH_INDICATOR,
  Names.JSON_PROPERTY_SOURCE,
  Names.JSON_PROPERTY_UNPARSED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Names {
  public static final String JSON_PROPERTY_PERSON = "person";
  private Person person;

  public static final String JSON_PROPERTY_QUALIFIER = "qualifier";
  private String qualifier;

  public static final String JSON_PROPERTY_SEARCH_INDICATOR = "searchIndicator";
  private Integer searchIndicator;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_UNPARSED = "unparsed";
  private String unparsed;

  public Names() {
  }

  public Names person(Person person) {
    
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Person getPerson() {
    return person;
  }


  @JsonProperty(JSON_PROPERTY_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerson(Person person) {
    this.person = person;
  }


  public Names qualifier(String qualifier) {
    
    this.qualifier = qualifier;
    return this;
  }

   /**
   * Get qualifier
   * @return qualifier
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUALIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQualifier() {
    return qualifier;
  }


  @JsonProperty(JSON_PROPERTY_QUALIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }


  public Names searchIndicator(Integer searchIndicator) {
    
    this.searchIndicator = searchIndicator;
    return this;
  }

   /**
   * Get searchIndicator
   * @return searchIndicator
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSearchIndicator() {
    return searchIndicator;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchIndicator(Integer searchIndicator) {
    this.searchIndicator = searchIndicator;
  }


  public Names source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(String source) {
    this.source = source;
  }


  public Names unparsed(String unparsed) {
    
    this.unparsed = unparsed;
    return this;
  }

   /**
   * Get unparsed
   * @return unparsed
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNPARSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnparsed() {
    return unparsed;
  }


  @JsonProperty(JSON_PROPERTY_UNPARSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnparsed(String unparsed) {
    this.unparsed = unparsed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Names names = (Names) o;
    return Objects.equals(this.person, names.person) &&
        Objects.equals(this.qualifier, names.qualifier) &&
        Objects.equals(this.searchIndicator, names.searchIndicator) &&
        Objects.equals(this.source, names.source) &&
        Objects.equals(this.unparsed, names.unparsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(person, qualifier, searchIndicator, source, unparsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Names {\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
    sb.append("    searchIndicator: ").append(toIndentedString(searchIndicator)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    unparsed: ").append(toIndentedString(unparsed)).append("\n");
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

