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
import org.openapitools.client.model.Game;
import org.openapitools.client.model.Meet;
import org.openapitools.client.model.Venue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SessionDetailsAllOfEmbedded
 */
@JsonPropertyOrder({
  SessionDetailsAllOfEmbedded.JSON_PROPERTY_SESSION_COLON_VENUE,
  SessionDetailsAllOfEmbedded.JSON_PROPERTY_SESSION_COLON_GAME,
  SessionDetailsAllOfEmbedded.JSON_PROPERTY_SESSION_COLON_MEET
})
@JsonTypeName("SessionDetails_allOf__embedded")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:40.667796194Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SessionDetailsAllOfEmbedded {
  public static final String JSON_PROPERTY_SESSION_COLON_VENUE = "session:venue";
  private Venue sessionColonVenue;

  public static final String JSON_PROPERTY_SESSION_COLON_GAME = "session:game";
  private Game sessionColonGame;

  public static final String JSON_PROPERTY_SESSION_COLON_MEET = "session:meet";
  private Meet sessionColonMeet;

  public SessionDetailsAllOfEmbedded() {
  }

  public SessionDetailsAllOfEmbedded sessionColonVenue(Venue sessionColonVenue) {
    
    this.sessionColonVenue = sessionColonVenue;
    return this;
  }

   /**
   * Get sessionColonVenue
   * @return sessionColonVenue
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_COLON_VENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Venue getSessionColonVenue() {
    return sessionColonVenue;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_COLON_VENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessionColonVenue(Venue sessionColonVenue) {
    this.sessionColonVenue = sessionColonVenue;
  }


  public SessionDetailsAllOfEmbedded sessionColonGame(Game sessionColonGame) {
    
    this.sessionColonGame = sessionColonGame;
    return this;
  }

   /**
   * Get sessionColonGame
   * @return sessionColonGame
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_COLON_GAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Game getSessionColonGame() {
    return sessionColonGame;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_COLON_GAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessionColonGame(Game sessionColonGame) {
    this.sessionColonGame = sessionColonGame;
  }


  public SessionDetailsAllOfEmbedded sessionColonMeet(Meet sessionColonMeet) {
    
    this.sessionColonMeet = sessionColonMeet;
    return this;
  }

   /**
   * Get sessionColonMeet
   * @return sessionColonMeet
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_COLON_MEET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Meet getSessionColonMeet() {
    return sessionColonMeet;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_COLON_MEET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessionColonMeet(Meet sessionColonMeet) {
    this.sessionColonMeet = sessionColonMeet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionDetailsAllOfEmbedded sessionDetailsAllOfEmbedded = (SessionDetailsAllOfEmbedded) o;
    return Objects.equals(this.sessionColonVenue, sessionDetailsAllOfEmbedded.sessionColonVenue) &&
        Objects.equals(this.sessionColonGame, sessionDetailsAllOfEmbedded.sessionColonGame) &&
        Objects.equals(this.sessionColonMeet, sessionDetailsAllOfEmbedded.sessionColonMeet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionColonVenue, sessionColonGame, sessionColonMeet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionDetailsAllOfEmbedded {\n");
    sb.append("    sessionColonVenue: ").append(toIndentedString(sessionColonVenue)).append("\n");
    sb.append("    sessionColonGame: ").append(toIndentedString(sessionColonGame)).append("\n");
    sb.append("    sessionColonMeet: ").append(toIndentedString(sessionColonMeet)).append("\n");
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

