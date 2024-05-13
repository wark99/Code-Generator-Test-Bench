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
import org.openapitools.client.model.AddressNodeNormSchemeCreator;
import org.openapitools.client.model.CompanyId;
import org.openapitools.client.model.ConvId;
import org.openapitools.client.model.Created;
import org.openapitools.client.model.Status;
import org.openapitools.client.model.Updated;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ObjectTypeBaseScheme
 */
@JsonPropertyOrder({
  ObjectTypeBaseScheme.JSON_PROPERTY_STATUS,
  ObjectTypeBaseScheme.JSON_PROPERTY_CREATED,
  ObjectTypeBaseScheme.JSON_PROPERTY_CREATOR,
  ObjectTypeBaseScheme.JSON_PROPERTY_UPDATED,
  ObjectTypeBaseScheme.JSON_PROPERTY_UPDATER,
  ObjectTypeBaseScheme.JSON_PROPERTY_COMPANY_ID,
  ObjectTypeBaseScheme.JSON_PROPERTY_ID,
  ObjectTypeBaseScheme.JSON_PROPERTY_NAME,
  ObjectTypeBaseScheme.JSON_PROPERTY_SLUG,
  ObjectTypeBaseScheme.JSON_PROPERTY_CONV_ID,
  ObjectTypeBaseScheme.JSON_PROPERTY_CONV_ATTACH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:05.417254227Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ObjectTypeBaseScheme {
  public static final String JSON_PROPERTY_STATUS = "status";
  private Status status;

  public static final String JSON_PROPERTY_CREATED = "created";
  private Created created;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private AddressNodeNormSchemeCreator creator;

  public static final String JSON_PROPERTY_UPDATED = "updated";
  private Updated updated;

  public static final String JSON_PROPERTY_UPDATER = "updater";
  private AddressNodeNormSchemeCreator updater;

  public static final String JSON_PROPERTY_COMPANY_ID = "company_id";
  private CompanyId companyId;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  public static final String JSON_PROPERTY_CONV_ID = "conv_id";
  private ConvId convId;

  public static final String JSON_PROPERTY_CONV_ATTACH = "conv_attach";
  private Boolean convAttach;

  public ObjectTypeBaseScheme() {
  }

  public ObjectTypeBaseScheme status(Status status) {
    
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


  public ObjectTypeBaseScheme created(Created created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Created getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreated(Created created) {
    this.created = created;
  }


  public ObjectTypeBaseScheme creator(AddressNodeNormSchemeCreator creator) {
    
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AddressNodeNormSchemeCreator getCreator() {
    return creator;
  }


  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreator(AddressNodeNormSchemeCreator creator) {
    this.creator = creator;
  }


  public ObjectTypeBaseScheme updated(Updated updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UPDATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Updated getUpdated() {
    return updated;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdated(Updated updated) {
    this.updated = updated;
  }


  public ObjectTypeBaseScheme updater(AddressNodeNormSchemeCreator updater) {
    
    this.updater = updater;
    return this;
  }

   /**
   * Get updater
   * @return updater
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UPDATER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AddressNodeNormSchemeCreator getUpdater() {
    return updater;
  }


  @JsonProperty(JSON_PROPERTY_UPDATER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdater(AddressNodeNormSchemeCreator updater) {
    this.updater = updater;
  }


  public ObjectTypeBaseScheme companyId(CompanyId companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CompanyId getCompanyId() {
    return companyId;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCompanyId(CompanyId companyId) {
    this.companyId = companyId;
  }


  public ObjectTypeBaseScheme id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * unique object id
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(Integer id) {
    this.id = id;
  }


  public ObjectTypeBaseScheme name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * object type name
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


  public ObjectTypeBaseScheme slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * object type slug
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


  public ObjectTypeBaseScheme convId(ConvId convId) {
    
    this.convId = convId;
    return this;
  }

   /**
   * Get convId
   * @return convId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONV_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConvId getConvId() {
    return convId;
  }


  @JsonProperty(JSON_PROPERTY_CONV_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConvId(ConvId convId) {
    this.convId = convId;
  }


  public ObjectTypeBaseScheme convAttach(Boolean convAttach) {
    
    this.convAttach = convAttach;
    return this;
  }

   /**
   * converter attach
   * @return convAttach
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONV_ATTACH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getConvAttach() {
    return convAttach;
  }


  @JsonProperty(JSON_PROPERTY_CONV_ATTACH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConvAttach(Boolean convAttach) {
    this.convAttach = convAttach;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectTypeBaseScheme objectTypeBaseScheme = (ObjectTypeBaseScheme) o;
    return Objects.equals(this.status, objectTypeBaseScheme.status) &&
        Objects.equals(this.created, objectTypeBaseScheme.created) &&
        Objects.equals(this.creator, objectTypeBaseScheme.creator) &&
        Objects.equals(this.updated, objectTypeBaseScheme.updated) &&
        Objects.equals(this.updater, objectTypeBaseScheme.updater) &&
        Objects.equals(this.companyId, objectTypeBaseScheme.companyId) &&
        Objects.equals(this.id, objectTypeBaseScheme.id) &&
        Objects.equals(this.name, objectTypeBaseScheme.name) &&
        Objects.equals(this.slug, objectTypeBaseScheme.slug) &&
        Objects.equals(this.convId, objectTypeBaseScheme.convId) &&
        Objects.equals(this.convAttach, objectTypeBaseScheme.convAttach);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, created, creator, updated, updater, companyId, id, name, slug, convId, convAttach);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectTypeBaseScheme {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    convId: ").append(toIndentedString(convId)).append("\n");
    sb.append("    convAttach: ").append(toIndentedString(convAttach)).append("\n");
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

