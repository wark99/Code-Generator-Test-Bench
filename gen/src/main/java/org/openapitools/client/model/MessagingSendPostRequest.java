/*
 * Childcare Provider API
 * Childcare Provider RESTful Service API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: p.oforduru@zodiac-software.com
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MessagingSendPostRequest
 */
@JsonPropertyOrder({
  MessagingSendPostRequest.JSON_PROPERTY_THREAD_ID,
  MessagingSendPostRequest.JSON_PROPERTY_SUBJECT,
  MessagingSendPostRequest.JSON_PROPERTY_BODY,
  MessagingSendPostRequest.JSON_PROPERTY_RECIPIENT
})
@JsonTypeName("_messaging_send_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:24.544913406Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MessagingSendPostRequest {
  public static final String JSON_PROPERTY_THREAD_ID = "thread_id";
  private String threadId;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_BODY = "body";
  private String body;

  public static final String JSON_PROPERTY_RECIPIENT = "recipient";
  private String recipient;

  public MessagingSendPostRequest() {
  }

  public MessagingSendPostRequest threadId(String threadId) {
    
    this.threadId = threadId;
    return this;
  }

   /**
   * Only required if message is part of an existing thread otherwise a new thread is created
   * @return threadId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreadId() {
    return threadId;
  }


  @JsonProperty(JSON_PROPERTY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }


  public MessagingSendPostRequest subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubject(String subject) {
    this.subject = subject;
  }


  public MessagingSendPostRequest body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBody() {
    return body;
  }


  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBody(String body) {
    this.body = body;
  }


  public MessagingSendPostRequest recipient(String recipient) {
    
    this.recipient = recipient;
    return this;
  }

   /**
   * This is the recipient&#39;s id
   * @return recipient
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECIPIENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRecipient() {
    return recipient;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingSendPostRequest messagingSendPostRequest = (MessagingSendPostRequest) o;
    return Objects.equals(this.threadId, messagingSendPostRequest.threadId) &&
        Objects.equals(this.subject, messagingSendPostRequest.subject) &&
        Objects.equals(this.body, messagingSendPostRequest.body) &&
        Objects.equals(this.recipient, messagingSendPostRequest.recipient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threadId, subject, body, recipient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingSendPostRequest {\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
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

