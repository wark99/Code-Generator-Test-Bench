/*
 * Matomo API
 * Complete Matomo reporting API documentation
 *
 * The version of the OpenAPI document: 5.0.0
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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * IndexPhpMethodUsersManagerAddUserPostRequest
 */
@JsonPropertyOrder({
  IndexPhpMethodUsersManagerAddUserPostRequest.JSON_PROPERTY_MODULE,
  IndexPhpMethodUsersManagerAddUserPostRequest.JSON_PROPERTY_FORMAT,
  IndexPhpMethodUsersManagerAddUserPostRequest.JSON_PROPERTY_METHOD,
  IndexPhpMethodUsersManagerAddUserPostRequest.JSON_PROPERTY_USER_LOGIN,
  IndexPhpMethodUsersManagerAddUserPostRequest.JSON_PROPERTY_PASSWORD,
  IndexPhpMethodUsersManagerAddUserPostRequest.JSON_PROPERTY_EMAIL,
  IndexPhpMethodUsersManagerAddUserPostRequest.JSON_PROPERTY_INITIAL_ID_SITE,
  IndexPhpMethodUsersManagerAddUserPostRequest.JSON_PROPERTY_PASSWORD_CONFIRMATION
})
@JsonTypeName("_index_php_method_UsersManager_addUser_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IndexPhpMethodUsersManagerAddUserPostRequest {
  public static final String JSON_PROPERTY_MODULE = "module";
  private Object module = null;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private Object format = null;

  public static final String JSON_PROPERTY_METHOD = "method";
  private Object method = null;

  public static final String JSON_PROPERTY_USER_LOGIN = "userLogin";
  private JsonNullable<Object> userLogin = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private JsonNullable<Object> password = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_EMAIL = "email";
  private JsonNullable<Object> email = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_INITIAL_ID_SITE = "initialIdSite";
  private JsonNullable<Object> initialIdSite = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PASSWORD_CONFIRMATION = "passwordConfirmation";
  private JsonNullable<Object> passwordConfirmation = JsonNullable.<Object>of(null);

  public IndexPhpMethodUsersManagerAddUserPostRequest() {
  }

  public IndexPhpMethodUsersManagerAddUserPostRequest module(Object module) {
    
    this.module = module;
    return this;
  }

   /**
   * Get module
   * @return module
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getModule() {
    return module;
  }


  @JsonProperty(JSON_PROPERTY_MODULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModule(Object module) {
    this.module = module;
  }


  public IndexPhpMethodUsersManagerAddUserPostRequest format(Object format) {
    
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getFormat() {
    return format;
  }


  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFormat(Object format) {
    this.format = format;
  }


  public IndexPhpMethodUsersManagerAddUserPostRequest method(Object method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMethod() {
    return method;
  }


  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMethod(Object method) {
    this.method = method;
  }


  public IndexPhpMethodUsersManagerAddUserPostRequest userLogin(Object userLogin) {
    this.userLogin = JsonNullable.<Object>of(userLogin);
    
    return this;
  }

   /**
   * Get userLogin
   * @return userLogin
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUserLogin() {
        return userLogin.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUserLogin_JsonNullable() {
    return userLogin;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_LOGIN)
  public void setUserLogin_JsonNullable(JsonNullable<Object> userLogin) {
    this.userLogin = userLogin;
  }

  public void setUserLogin(Object userLogin) {
    this.userLogin = JsonNullable.<Object>of(userLogin);
  }


  public IndexPhpMethodUsersManagerAddUserPostRequest password(Object password) {
    this.password = JsonNullable.<Object>of(password);
    
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPassword() {
        return password.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPassword_JsonNullable() {
    return password;
  }
  
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  public void setPassword_JsonNullable(JsonNullable<Object> password) {
    this.password = password;
  }

  public void setPassword(Object password) {
    this.password = JsonNullable.<Object>of(password);
  }


  public IndexPhpMethodUsersManagerAddUserPostRequest email(Object email) {
    this.email = JsonNullable.<Object>of(email);
    
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  public void setEmail_JsonNullable(JsonNullable<Object> email) {
    this.email = email;
  }

  public void setEmail(Object email) {
    this.email = JsonNullable.<Object>of(email);
  }


  public IndexPhpMethodUsersManagerAddUserPostRequest initialIdSite(Object initialIdSite) {
    this.initialIdSite = JsonNullable.<Object>of(initialIdSite);
    
    return this;
  }

   /**
   * Get initialIdSite
   * @return initialIdSite
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getInitialIdSite() {
        return initialIdSite.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INITIAL_ID_SITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getInitialIdSite_JsonNullable() {
    return initialIdSite;
  }
  
  @JsonProperty(JSON_PROPERTY_INITIAL_ID_SITE)
  public void setInitialIdSite_JsonNullable(JsonNullable<Object> initialIdSite) {
    this.initialIdSite = initialIdSite;
  }

  public void setInitialIdSite(Object initialIdSite) {
    this.initialIdSite = JsonNullable.<Object>of(initialIdSite);
  }


  public IndexPhpMethodUsersManagerAddUserPostRequest passwordConfirmation(Object passwordConfirmation) {
    this.passwordConfirmation = JsonNullable.<Object>of(passwordConfirmation);
    
    return this;
  }

   /**
   * Get passwordConfirmation
   * @return passwordConfirmation
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPasswordConfirmation() {
        return passwordConfirmation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PASSWORD_CONFIRMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPasswordConfirmation_JsonNullable() {
    return passwordConfirmation;
  }
  
  @JsonProperty(JSON_PROPERTY_PASSWORD_CONFIRMATION)
  public void setPasswordConfirmation_JsonNullable(JsonNullable<Object> passwordConfirmation) {
    this.passwordConfirmation = passwordConfirmation;
  }

  public void setPasswordConfirmation(Object passwordConfirmation) {
    this.passwordConfirmation = JsonNullable.<Object>of(passwordConfirmation);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPhpMethodUsersManagerAddUserPostRequest indexPhpMethodUsersManagerAddUserPostRequest = (IndexPhpMethodUsersManagerAddUserPostRequest) o;
    return Objects.equals(this.module, indexPhpMethodUsersManagerAddUserPostRequest.module) &&
        Objects.equals(this.format, indexPhpMethodUsersManagerAddUserPostRequest.format) &&
        Objects.equals(this.method, indexPhpMethodUsersManagerAddUserPostRequest.method) &&
        equalsNullable(this.userLogin, indexPhpMethodUsersManagerAddUserPostRequest.userLogin) &&
        equalsNullable(this.password, indexPhpMethodUsersManagerAddUserPostRequest.password) &&
        equalsNullable(this.email, indexPhpMethodUsersManagerAddUserPostRequest.email) &&
        equalsNullable(this.initialIdSite, indexPhpMethodUsersManagerAddUserPostRequest.initialIdSite) &&
        equalsNullable(this.passwordConfirmation, indexPhpMethodUsersManagerAddUserPostRequest.passwordConfirmation);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(module, format, method, hashCodeNullable(userLogin), hashCodeNullable(password), hashCodeNullable(email), hashCodeNullable(initialIdSite), hashCodeNullable(passwordConfirmation));
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
    sb.append("class IndexPhpMethodUsersManagerAddUserPostRequest {\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    userLogin: ").append(toIndentedString(userLogin)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    initialIdSite: ").append(toIndentedString(initialIdSite)).append("\n");
    sb.append("    passwordConfirmation: ").append(toIndentedString(passwordConfirmation)).append("\n");
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

