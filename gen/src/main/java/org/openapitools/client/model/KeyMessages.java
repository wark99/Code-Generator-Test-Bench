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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Messages;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * KeyMessages
 */
@JsonPropertyOrder({
  KeyMessages.JSON_PROPERTY_KEY_MESSAGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class KeyMessages {
  public static final String JSON_PROPERTY_KEY_MESSAGES = "keyMessages";
  private List<Messages> keyMessages;

  public KeyMessages() {
  }

  public KeyMessages keyMessages(List<Messages> keyMessages) {
    
    this.keyMessages = keyMessages;
    return this;
  }

  public KeyMessages addKeyMessagesItem(Messages keyMessagesItem) {
    if (this.keyMessages == null) {
      this.keyMessages = new ArrayList<>();
    }
    this.keyMessages.add(keyMessagesItem);
    return this;
  }

   /**
   * Get keyMessages
   * @return keyMessages
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Messages> getKeyMessages() {
    return keyMessages;
  }


  @JsonProperty(JSON_PROPERTY_KEY_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyMessages(List<Messages> keyMessages) {
    this.keyMessages = keyMessages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyMessages keyMessages = (KeyMessages) o;
    return Objects.equals(this.keyMessages, keyMessages.keyMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyMessages {\n");
    sb.append("    keyMessages: ").append(toIndentedString(keyMessages)).append("\n");
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

