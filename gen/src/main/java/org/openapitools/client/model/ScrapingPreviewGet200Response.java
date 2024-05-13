/*
 * Data Scraper API
 * A RESTful API for managing web scraping data related to educational institutions, programmes, courses, and schedules.
 *
 * The version of the OpenAPI document: 1.0.0
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
import org.openapitools.client.model.ScrapingPreviewGet200ResponseSessionsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ScrapingPreviewGet200Response
 */
@JsonPropertyOrder({
  ScrapingPreviewGet200Response.JSON_PROPERTY_SESSIONS
})
@JsonTypeName("_scraping_preview_get_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:15:20.052181070Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ScrapingPreviewGet200Response {
  public static final String JSON_PROPERTY_SESSIONS = "sessions";
  private List<ScrapingPreviewGet200ResponseSessionsInner> sessions;

  public ScrapingPreviewGet200Response() {
  }

  public ScrapingPreviewGet200Response sessions(List<ScrapingPreviewGet200ResponseSessionsInner> sessions) {
    
    this.sessions = sessions;
    return this;
  }

  public ScrapingPreviewGet200Response addSessionsItem(ScrapingPreviewGet200ResponseSessionsInner sessionsItem) {
    if (this.sessions == null) {
      this.sessions = new ArrayList<>();
    }
    this.sessions.add(sessionsItem);
    return this;
  }

   /**
   * Get sessions
   * @return sessions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ScrapingPreviewGet200ResponseSessionsInner> getSessions() {
    return sessions;
  }


  @JsonProperty(JSON_PROPERTY_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessions(List<ScrapingPreviewGet200ResponseSessionsInner> sessions) {
    this.sessions = sessions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScrapingPreviewGet200Response scrapingPreviewGet200Response = (ScrapingPreviewGet200Response) o;
    return Objects.equals(this.sessions, scrapingPreviewGet200Response.sessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScrapingPreviewGet200Response {\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
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

