/*
 * AIRBIT IoT Workspace REST API
 * This API is intended to work with the application **AIRBIT IoT Workspace** .
 *
 * The version of the OpenAPI document: 2.0.1
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
import org.openapitools.client.model.Account;
import org.openapitools.client.model.CompanyId1;
import org.openapitools.client.model.ConvClass;
import org.openapitools.client.model.DataDirection;
import org.openapitools.client.model.Protocol;
import org.openapitools.client.model.Status;
import org.openapitools.client.model.UriDetailedField;
import org.openapitools.client.model.UriFullManual;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateDataChannelScheme
 */
@JsonPropertyOrder({
  CreateDataChannelScheme.JSON_PROPERTY_STATUS,
  CreateDataChannelScheme.JSON_PROPERTY_COMPANY_ID,
  CreateDataChannelScheme.JSON_PROPERTY_DIRECT,
  CreateDataChannelScheme.JSON_PROPERTY_PROTO,
  CreateDataChannelScheme.JSON_PROPERTY_CLASS_CONVERTER,
  CreateDataChannelScheme.JSON_PROPERTY_NET_ID_TYPE_ID,
  CreateDataChannelScheme.JSON_PROPERTY_NAME,
  CreateDataChannelScheme.JSON_PROPERTY_SLUG,
  CreateDataChannelScheme.JSON_PROPERTY_SAVE_TO_DB,
  CreateDataChannelScheme.JSON_PROPERTY_URI_FULL_MANUAL,
  CreateDataChannelScheme.JSON_PROPERTY_URI_UNBLOCK,
  CreateDataChannelScheme.JSON_PROPERTY_ACCOUNT,
  CreateDataChannelScheme.JSON_PROPERTY_URI_DETAILED_FIELD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:05.417254227Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateDataChannelScheme {
  public static final String JSON_PROPERTY_STATUS = "status";
  private Status status;

  public static final String JSON_PROPERTY_COMPANY_ID = "company_id";
  private CompanyId1 companyId;

  public static final String JSON_PROPERTY_DIRECT = "direct";
  private DataDirection direct;

  public static final String JSON_PROPERTY_PROTO = "proto";
  private Protocol proto;

  public static final String JSON_PROPERTY_CLASS_CONVERTER = "class_converter";
  private ConvClass classConverter;

  public static final String JSON_PROPERTY_NET_ID_TYPE_ID = "net_id_type_id";
  private Integer netIdTypeId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  public static final String JSON_PROPERTY_SAVE_TO_DB = "save_to_db";
  private Boolean saveToDb = true;

  public static final String JSON_PROPERTY_URI_FULL_MANUAL = "uri_full_manual";
  private UriFullManual uriFullManual;

  public static final String JSON_PROPERTY_URI_UNBLOCK = "uri_unblock";
  private Boolean uriUnblock = false;

  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private Account account;

  public static final String JSON_PROPERTY_URI_DETAILED_FIELD = "uri_detailed_field";
  private UriDetailedField uriDetailedField;

  public CreateDataChannelScheme() {
  }

  public CreateDataChannelScheme status(Status status) {
    
    this.status = status;
    return this;
  }

   /**
   * status (1 - Inactive, 2 - Active)
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Status getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(Status status) {
    this.status = status;
  }


  public CreateDataChannelScheme companyId(CompanyId1 companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CompanyId1 getCompanyId() {
    return companyId;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyId(CompanyId1 companyId) {
    this.companyId = companyId;
  }


  public CreateDataChannelScheme direct(DataDirection direct) {
    
    this.direct = direct;
    return this;
  }

   /**
   * Direction
   * @return direct
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DataDirection getDirect() {
    return direct;
  }


  @JsonProperty(JSON_PROPERTY_DIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDirect(DataDirection direct) {
    this.direct = direct;
  }


  public CreateDataChannelScheme proto(Protocol proto) {
    
    this.proto = proto;
    return this;
  }

   /**
   * Protocol
   * @return proto
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROTO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Protocol getProto() {
    return proto;
  }


  @JsonProperty(JSON_PROPERTY_PROTO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProto(Protocol proto) {
    this.proto = proto;
  }


  public CreateDataChannelScheme classConverter(ConvClass classConverter) {
    
    this.classConverter = classConverter;
    return this;
  }

   /**
   * Converter class
   * @return classConverter
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLASS_CONVERTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConvClass getClassConverter() {
    return classConverter;
  }


  @JsonProperty(JSON_PROPERTY_CLASS_CONVERTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClassConverter(ConvClass classConverter) {
    this.classConverter = classConverter;
  }


  public CreateDataChannelScheme netIdTypeId(Integer netIdTypeId) {
    
    this.netIdTypeId = netIdTypeId;
    return this;
  }

   /**
   * Type of devices ID
   * @return netIdTypeId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NET_ID_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getNetIdTypeId() {
    return netIdTypeId;
  }


  @JsonProperty(JSON_PROPERTY_NET_ID_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNetIdTypeId(Integer netIdTypeId) {
    this.netIdTypeId = netIdTypeId;
  }


  public CreateDataChannelScheme name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CreateDataChannelScheme slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Slug. \&quot;The following characters are valid: A-Z a-z 0-9 - . _\&quot;
   * @return slug
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSlug() {
    return slug;
  }


  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSlug(String slug) {
    this.slug = slug;
  }


  public CreateDataChannelScheme saveToDb(Boolean saveToDb) {
    
    this.saveToDb = saveToDb;
    return this;
  }

   /**
   * Save to DB. Save incoming data and decoding result to database
   * @return saveToDb
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAVE_TO_DB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSaveToDb() {
    return saveToDb;
  }


  @JsonProperty(JSON_PROPERTY_SAVE_TO_DB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaveToDb(Boolean saveToDb) {
    this.saveToDb = saveToDb;
  }


  public CreateDataChannelScheme uriFullManual(UriFullManual uriFullManual) {
    
    this.uriFullManual = uriFullManual;
    return this;
  }

   /**
   * Get uriFullManual
   * @return uriFullManual
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URI_FULL_MANUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UriFullManual getUriFullManual() {
    return uriFullManual;
  }


  @JsonProperty(JSON_PROPERTY_URI_FULL_MANUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUriFullManual(UriFullManual uriFullManual) {
    this.uriFullManual = uriFullManual;
  }


  public CreateDataChannelScheme uriUnblock(Boolean uriUnblock) {
    
    this.uriUnblock = uriUnblock;
    return this;
  }

   /**
   * Unblock URI field
   * @return uriUnblock
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URI_UNBLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUriUnblock() {
    return uriUnblock;
  }


  @JsonProperty(JSON_PROPERTY_URI_UNBLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUriUnblock(Boolean uriUnblock) {
    this.uriUnblock = uriUnblock;
  }


  public CreateDataChannelScheme account(Account account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Account getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccount(Account account) {
    this.account = account;
  }


  public CreateDataChannelScheme uriDetailedField(UriDetailedField uriDetailedField) {
    
    this.uriDetailedField = uriDetailedField;
    return this;
  }

   /**
   * Get uriDetailedField
   * @return uriDetailedField
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URI_DETAILED_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UriDetailedField getUriDetailedField() {
    return uriDetailedField;
  }


  @JsonProperty(JSON_PROPERTY_URI_DETAILED_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUriDetailedField(UriDetailedField uriDetailedField) {
    this.uriDetailedField = uriDetailedField;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDataChannelScheme createDataChannelScheme = (CreateDataChannelScheme) o;
    return Objects.equals(this.status, createDataChannelScheme.status) &&
        Objects.equals(this.companyId, createDataChannelScheme.companyId) &&
        Objects.equals(this.direct, createDataChannelScheme.direct) &&
        Objects.equals(this.proto, createDataChannelScheme.proto) &&
        Objects.equals(this.classConverter, createDataChannelScheme.classConverter) &&
        Objects.equals(this.netIdTypeId, createDataChannelScheme.netIdTypeId) &&
        Objects.equals(this.name, createDataChannelScheme.name) &&
        Objects.equals(this.slug, createDataChannelScheme.slug) &&
        Objects.equals(this.saveToDb, createDataChannelScheme.saveToDb) &&
        Objects.equals(this.uriFullManual, createDataChannelScheme.uriFullManual) &&
        Objects.equals(this.uriUnblock, createDataChannelScheme.uriUnblock) &&
        Objects.equals(this.account, createDataChannelScheme.account) &&
        Objects.equals(this.uriDetailedField, createDataChannelScheme.uriDetailedField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, companyId, direct, proto, classConverter, netIdTypeId, name, slug, saveToDb, uriFullManual, uriUnblock, account, uriDetailedField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDataChannelScheme {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    direct: ").append(toIndentedString(direct)).append("\n");
    sb.append("    proto: ").append(toIndentedString(proto)).append("\n");
    sb.append("    classConverter: ").append(toIndentedString(classConverter)).append("\n");
    sb.append("    netIdTypeId: ").append(toIndentedString(netIdTypeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    saveToDb: ").append(toIndentedString(saveToDb)).append("\n");
    sb.append("    uriFullManual: ").append(toIndentedString(uriFullManual)).append("\n");
    sb.append("    uriUnblock: ").append(toIndentedString(uriUnblock)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    uriDetailedField: ").append(toIndentedString(uriDetailedField)).append("\n");
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

