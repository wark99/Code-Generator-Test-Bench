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
 * RequestBody64
 */
@JsonPropertyOrder({
  RequestBody64.JSON_PROPERTY_COUNTRY_ID,
  RequestBody64.JSON_PROPERTY_CURRENT_ACCOUNT_ID,
  RequestBody64.JSON_PROPERTY_CURRENT_PASSWORD,
  RequestBody64.JSON_PROPERTY_EMAIL,
  RequestBody64.JSON_PROPERTY_FIRSTNAME,
  RequestBody64.JSON_PROPERTY_KEEP_SESSION_IDS,
  RequestBody64.JSON_PROPERTY_LANGUAGE_ID,
  RequestBody64.JSON_PROPERTY_LASTNAME,
  RequestBody64.JSON_PROPERTY_LOCALE,
  RequestBody64.JSON_PROPERTY_PASSWORD,
  RequestBody64.JSON_PROPERTY_REMINDER_EMAIL,
  RequestBody64.JSON_PROPERTY_REMINDER_PHONE,
  RequestBody64.JSON_PROPERTY_SUCCESSFUL_CONNEXION_NOTIFICATION,
  RequestBody64.JSON_PROPERTY_TIMEZONE,
  RequestBody64.JSON_PROPERTY_TIMEZONE_ID,
  RequestBody64.JSON_PROPERTY_UNSUCCESSFUL_CONNEXION_LIMIT,
  RequestBody64.JSON_PROPERTY_UNSUCCESSFUL_CONNEXION_NOTIFICATION,
  RequestBody64.JSON_PROPERTY_UNSUCCESSFUL_CONNEXION_RATE_LIMIT
})
@JsonTypeName("Request_body_64")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RequestBody64 {
  public static final String JSON_PROPERTY_COUNTRY_ID = "country_id";
  private Integer countryId;

  public static final String JSON_PROPERTY_CURRENT_ACCOUNT_ID = "current_account_id";
  private Integer currentAccountId;

  public static final String JSON_PROPERTY_CURRENT_PASSWORD = "current_password";
  private String currentPassword;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_FIRSTNAME = "firstname";
  private String firstname;

  public static final String JSON_PROPERTY_KEEP_SESSION_IDS = "keep_session_ids";
  private List<String> keepSessionIds;

  public static final String JSON_PROPERTY_LANGUAGE_ID = "language_id";
  private Integer languageId;

  public static final String JSON_PROPERTY_LASTNAME = "lastname";
  private String lastname;

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private String locale;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_REMINDER_EMAIL = "reminder_email";
  private String reminderEmail;

  public static final String JSON_PROPERTY_REMINDER_PHONE = "reminder_phone";
  private String reminderPhone;

  public static final String JSON_PROPERTY_SUCCESSFUL_CONNEXION_NOTIFICATION = "successful_connexion_notification";
  private Boolean successfulConnexionNotification;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_TIMEZONE_ID = "timezone_id";
  private Integer timezoneId;

  public static final String JSON_PROPERTY_UNSUCCESSFUL_CONNEXION_LIMIT = "unsuccessful_connexion_limit";
  private Boolean unsuccessfulConnexionLimit;

  public static final String JSON_PROPERTY_UNSUCCESSFUL_CONNEXION_NOTIFICATION = "unsuccessful_connexion_notification";
  private Boolean unsuccessfulConnexionNotification;

  public static final String JSON_PROPERTY_UNSUCCESSFUL_CONNEXION_RATE_LIMIT = "unsuccessful_connexion_rate_limit";
  private Integer unsuccessfulConnexionRateLimit;

  public RequestBody64() {
  }

  public RequestBody64 countryId(Integer countryId) {
    
    this.countryId = countryId;
    return this;
  }

   /**
   * Get countryId
   * @return countryId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCountryId() {
    return countryId;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryId(Integer countryId) {
    this.countryId = countryId;
  }


  public RequestBody64 currentAccountId(Integer currentAccountId) {
    
    this.currentAccountId = currentAccountId;
    return this;
  }

   /**
   * Get currentAccountId
   * @return currentAccountId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCurrentAccountId() {
    return currentAccountId;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentAccountId(Integer currentAccountId) {
    this.currentAccountId = currentAccountId;
  }


  public RequestBody64 currentPassword(String currentPassword) {
    
    this.currentPassword = currentPassword;
    return this;
  }

   /**
   * Get currentPassword
   * @return currentPassword
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrentPassword() {
    return currentPassword;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
  }


  public RequestBody64 email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email
   * @return email
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


  public RequestBody64 firstname(String firstname) {
    
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstname() {
    return firstname;
  }


  @JsonProperty(JSON_PROPERTY_FIRSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public RequestBody64 keepSessionIds(List<String> keepSessionIds) {
    
    this.keepSessionIds = keepSessionIds;
    return this;
  }

  public RequestBody64 addKeepSessionIdsItem(String keepSessionIdsItem) {
    if (this.keepSessionIds == null) {
      this.keepSessionIds = new ArrayList<>();
    }
    this.keepSessionIds.add(keepSessionIdsItem);
    return this;
  }

   /**
   * Get keepSessionIds
   * @return keepSessionIds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEEP_SESSION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getKeepSessionIds() {
    return keepSessionIds;
  }


  @JsonProperty(JSON_PROPERTY_KEEP_SESSION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeepSessionIds(List<String> keepSessionIds) {
    this.keepSessionIds = keepSessionIds;
  }


  public RequestBody64 languageId(Integer languageId) {
    
    this.languageId = languageId;
    return this;
  }

   /**
   * Unique identifier of the &#x60;language&#x60; that is related to the resource &#x60;{name}&#x60;
   * @return languageId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLanguageId() {
    return languageId;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguageId(Integer languageId) {
    this.languageId = languageId;
  }


  public RequestBody64 lastname(String lastname) {
    
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LASTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastname() {
    return lastname;
  }


  @JsonProperty(JSON_PROPERTY_LASTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public RequestBody64 locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Represents a language identifier and a region identifier
   * @return locale
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocale() {
    return locale;
  }


  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocale(String locale) {
    this.locale = locale;
  }


  public RequestBody64 password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public RequestBody64 reminderEmail(String reminderEmail) {
    
    this.reminderEmail = reminderEmail;
    return this;
  }

   /**
   * Get reminderEmail
   * @return reminderEmail
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMINDER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReminderEmail() {
    return reminderEmail;
  }


  @JsonProperty(JSON_PROPERTY_REMINDER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReminderEmail(String reminderEmail) {
    this.reminderEmail = reminderEmail;
  }


  public RequestBody64 reminderPhone(String reminderPhone) {
    
    this.reminderPhone = reminderPhone;
    return this;
  }

   /**
   * Get reminderPhone
   * @return reminderPhone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMINDER_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReminderPhone() {
    return reminderPhone;
  }


  @JsonProperty(JSON_PROPERTY_REMINDER_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReminderPhone(String reminderPhone) {
    this.reminderPhone = reminderPhone;
  }


  public RequestBody64 successfulConnexionNotification(Boolean successfulConnexionNotification) {
    
    this.successfulConnexionNotification = successfulConnexionNotification;
    return this;
  }

   /**
   * Get successfulConnexionNotification
   * @return successfulConnexionNotification
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL_CONNEXION_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessfulConnexionNotification() {
    return successfulConnexionNotification;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESSFUL_CONNEXION_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessfulConnexionNotification(Boolean successfulConnexionNotification) {
    this.successfulConnexionNotification = successfulConnexionNotification;
  }


  public RequestBody64 timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public RequestBody64 timezoneId(Integer timezoneId) {
    
    this.timezoneId = timezoneId;
    return this;
  }

   /**
   * Get timezoneId
   * @return timezoneId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimezoneId() {
    return timezoneId;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezoneId(Integer timezoneId) {
    this.timezoneId = timezoneId;
  }


  public RequestBody64 unsuccessfulConnexionLimit(Boolean unsuccessfulConnexionLimit) {
    
    this.unsuccessfulConnexionLimit = unsuccessfulConnexionLimit;
    return this;
  }

   /**
   * Get unsuccessfulConnexionLimit
   * @return unsuccessfulConnexionLimit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNSUCCESSFUL_CONNEXION_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUnsuccessfulConnexionLimit() {
    return unsuccessfulConnexionLimit;
  }


  @JsonProperty(JSON_PROPERTY_UNSUCCESSFUL_CONNEXION_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnsuccessfulConnexionLimit(Boolean unsuccessfulConnexionLimit) {
    this.unsuccessfulConnexionLimit = unsuccessfulConnexionLimit;
  }


  public RequestBody64 unsuccessfulConnexionNotification(Boolean unsuccessfulConnexionNotification) {
    
    this.unsuccessfulConnexionNotification = unsuccessfulConnexionNotification;
    return this;
  }

   /**
   * Get unsuccessfulConnexionNotification
   * @return unsuccessfulConnexionNotification
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNSUCCESSFUL_CONNEXION_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUnsuccessfulConnexionNotification() {
    return unsuccessfulConnexionNotification;
  }


  @JsonProperty(JSON_PROPERTY_UNSUCCESSFUL_CONNEXION_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnsuccessfulConnexionNotification(Boolean unsuccessfulConnexionNotification) {
    this.unsuccessfulConnexionNotification = unsuccessfulConnexionNotification;
  }


  public RequestBody64 unsuccessfulConnexionRateLimit(Integer unsuccessfulConnexionRateLimit) {
    
    this.unsuccessfulConnexionRateLimit = unsuccessfulConnexionRateLimit;
    return this;
  }

   /**
   * Get unsuccessfulConnexionRateLimit
   * minimum: 1
   * maximum: 100
   * @return unsuccessfulConnexionRateLimit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNSUCCESSFUL_CONNEXION_RATE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUnsuccessfulConnexionRateLimit() {
    return unsuccessfulConnexionRateLimit;
  }


  @JsonProperty(JSON_PROPERTY_UNSUCCESSFUL_CONNEXION_RATE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnsuccessfulConnexionRateLimit(Integer unsuccessfulConnexionRateLimit) {
    this.unsuccessfulConnexionRateLimit = unsuccessfulConnexionRateLimit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBody64 requestBody64 = (RequestBody64) o;
    return Objects.equals(this.countryId, requestBody64.countryId) &&
        Objects.equals(this.currentAccountId, requestBody64.currentAccountId) &&
        Objects.equals(this.currentPassword, requestBody64.currentPassword) &&
        Objects.equals(this.email, requestBody64.email) &&
        Objects.equals(this.firstname, requestBody64.firstname) &&
        Objects.equals(this.keepSessionIds, requestBody64.keepSessionIds) &&
        Objects.equals(this.languageId, requestBody64.languageId) &&
        Objects.equals(this.lastname, requestBody64.lastname) &&
        Objects.equals(this.locale, requestBody64.locale) &&
        Objects.equals(this.password, requestBody64.password) &&
        Objects.equals(this.reminderEmail, requestBody64.reminderEmail) &&
        Objects.equals(this.reminderPhone, requestBody64.reminderPhone) &&
        Objects.equals(this.successfulConnexionNotification, requestBody64.successfulConnexionNotification) &&
        Objects.equals(this.timezone, requestBody64.timezone) &&
        Objects.equals(this.timezoneId, requestBody64.timezoneId) &&
        Objects.equals(this.unsuccessfulConnexionLimit, requestBody64.unsuccessfulConnexionLimit) &&
        Objects.equals(this.unsuccessfulConnexionNotification, requestBody64.unsuccessfulConnexionNotification) &&
        Objects.equals(this.unsuccessfulConnexionRateLimit, requestBody64.unsuccessfulConnexionRateLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryId, currentAccountId, currentPassword, email, firstname, keepSessionIds, languageId, lastname, locale, password, reminderEmail, reminderPhone, successfulConnexionNotification, timezone, timezoneId, unsuccessfulConnexionLimit, unsuccessfulConnexionNotification, unsuccessfulConnexionRateLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBody64 {\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    currentAccountId: ").append(toIndentedString(currentAccountId)).append("\n");
    sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    keepSessionIds: ").append(toIndentedString(keepSessionIds)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    reminderEmail: ").append(toIndentedString(reminderEmail)).append("\n");
    sb.append("    reminderPhone: ").append(toIndentedString(reminderPhone)).append("\n");
    sb.append("    successfulConnexionNotification: ").append(toIndentedString(successfulConnexionNotification)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    timezoneId: ").append(toIndentedString(timezoneId)).append("\n");
    sb.append("    unsuccessfulConnexionLimit: ").append(toIndentedString(unsuccessfulConnexionLimit)).append("\n");
    sb.append("    unsuccessfulConnexionNotification: ").append(toIndentedString(unsuccessfulConnexionNotification)).append("\n");
    sb.append("    unsuccessfulConnexionRateLimit: ").append(toIndentedString(unsuccessfulConnexionRateLimit)).append("\n");
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
