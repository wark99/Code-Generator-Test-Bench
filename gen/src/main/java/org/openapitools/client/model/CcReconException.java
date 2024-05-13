/*
 * Customer Payment Domain
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.1
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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CcReconException
 */
@JsonPropertyOrder({
  CcReconException.JSON_PROPERTY_EXCEPTION_U_U_I_D,
  CcReconException.JSON_PROPERTY_EXCEPTION_CODE,
  CcReconException.JSON_PROPERTY_PSP,
  CcReconException.JSON_PROPERTY_CREATED_DATE,
  CcReconException.JSON_PROPERTY_LATEST_UPDATE_DATE,
  CcReconException.JSON_PROPERTY_EXCEPTION_SOURCE,
  CcReconException.JSON_PROPERTY_DOCUMENT_U_U_I_D,
  CcReconException.JSON_PROPERTY_DOCUMENT_NUMBER,
  CcReconException.JSON_PROPERTY_PNR,
  CcReconException.JSON_PROPERTY_ASSIGNED_USER_I_D,
  CcReconException.JSON_PROPERTY_AUTO_RESOLVER,
  CcReconException.JSON_PROPERTY_EXCEPTION_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:16:54.275857511Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CcReconException {
  public static final String JSON_PROPERTY_EXCEPTION_U_U_I_D = "exceptionUUID";
  private String exceptionUUID;

  public static final String JSON_PROPERTY_EXCEPTION_CODE = "exceptionCode";
  private String exceptionCode;

  public static final String JSON_PROPERTY_PSP = "psp";
  private String psp;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private OffsetDateTime createdDate;

  public static final String JSON_PROPERTY_LATEST_UPDATE_DATE = "latestUpdateDate";
  private OffsetDateTime latestUpdateDate;

  public static final String JSON_PROPERTY_EXCEPTION_SOURCE = "exceptionSource";
  private String exceptionSource;

  public static final String JSON_PROPERTY_DOCUMENT_U_U_I_D = "documentUUID";
  private String documentUUID;

  public static final String JSON_PROPERTY_DOCUMENT_NUMBER = "documentNumber";
  private String documentNumber;

  public static final String JSON_PROPERTY_PNR = "pnr";
  private String pnr;

  public static final String JSON_PROPERTY_ASSIGNED_USER_I_D = "assignedUserID";
  private String assignedUserID;

  public static final String JSON_PROPERTY_AUTO_RESOLVER = "autoResolver";
  private String autoResolver;

  public static final String JSON_PROPERTY_EXCEPTION_STATUS = "exceptionStatus";
  private String exceptionStatus;

  public CcReconException() {
  }

  public CcReconException exceptionUUID(String exceptionUUID) {
    
    this.exceptionUUID = exceptionUUID;
    return this;
  }

   /**
   * Get exceptionUUID
   * @return exceptionUUID
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCEPTION_U_U_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExceptionUUID() {
    return exceptionUUID;
  }


  @JsonProperty(JSON_PROPERTY_EXCEPTION_U_U_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExceptionUUID(String exceptionUUID) {
    this.exceptionUUID = exceptionUUID;
  }


  public CcReconException exceptionCode(String exceptionCode) {
    
    this.exceptionCode = exceptionCode;
    return this;
  }

   /**
   * Get exceptionCode
   * @return exceptionCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCEPTION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExceptionCode() {
    return exceptionCode;
  }


  @JsonProperty(JSON_PROPERTY_EXCEPTION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExceptionCode(String exceptionCode) {
    this.exceptionCode = exceptionCode;
  }


  public CcReconException psp(String psp) {
    
    this.psp = psp;
    return this;
  }

   /**
   * Get psp
   * @return psp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PSP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPsp() {
    return psp;
  }


  @JsonProperty(JSON_PROPERTY_PSP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPsp(String psp) {
    this.psp = psp;
  }


  public CcReconException createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public CcReconException latestUpdateDate(OffsetDateTime latestUpdateDate) {
    
    this.latestUpdateDate = latestUpdateDate;
    return this;
  }

   /**
   * Get latestUpdateDate
   * @return latestUpdateDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATEST_UPDATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLatestUpdateDate() {
    return latestUpdateDate;
  }


  @JsonProperty(JSON_PROPERTY_LATEST_UPDATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestUpdateDate(OffsetDateTime latestUpdateDate) {
    this.latestUpdateDate = latestUpdateDate;
  }


  public CcReconException exceptionSource(String exceptionSource) {
    
    this.exceptionSource = exceptionSource;
    return this;
  }

   /**
   * Get exceptionSource
   * @return exceptionSource
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCEPTION_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExceptionSource() {
    return exceptionSource;
  }


  @JsonProperty(JSON_PROPERTY_EXCEPTION_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExceptionSource(String exceptionSource) {
    this.exceptionSource = exceptionSource;
  }


  public CcReconException documentUUID(String documentUUID) {
    
    this.documentUUID = documentUUID;
    return this;
  }

   /**
   * Get documentUUID
   * @return documentUUID
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_U_U_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDocumentUUID() {
    return documentUUID;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_U_U_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentUUID(String documentUUID) {
    this.documentUUID = documentUUID;
  }


  public CcReconException documentNumber(String documentNumber) {
    
    this.documentNumber = documentNumber;
    return this;
  }

   /**
   * Get documentNumber
   * @return documentNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDocumentNumber() {
    return documentNumber;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }


  public CcReconException pnr(String pnr) {
    
    this.pnr = pnr;
    return this;
  }

   /**
   * Get pnr
   * @return pnr
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PNR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPnr() {
    return pnr;
  }


  @JsonProperty(JSON_PROPERTY_PNR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPnr(String pnr) {
    this.pnr = pnr;
  }


  public CcReconException assignedUserID(String assignedUserID) {
    
    this.assignedUserID = assignedUserID;
    return this;
  }

   /**
   * Get assignedUserID
   * @return assignedUserID
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNED_USER_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssignedUserID() {
    return assignedUserID;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNED_USER_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignedUserID(String assignedUserID) {
    this.assignedUserID = assignedUserID;
  }


  public CcReconException autoResolver(String autoResolver) {
    
    this.autoResolver = autoResolver;
    return this;
  }

   /**
   * Get autoResolver
   * @return autoResolver
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_RESOLVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAutoResolver() {
    return autoResolver;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_RESOLVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoResolver(String autoResolver) {
    this.autoResolver = autoResolver;
  }


  public CcReconException exceptionStatus(String exceptionStatus) {
    
    this.exceptionStatus = exceptionStatus;
    return this;
  }

   /**
   * Get exceptionStatus
   * @return exceptionStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCEPTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExceptionStatus() {
    return exceptionStatus;
  }


  @JsonProperty(JSON_PROPERTY_EXCEPTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExceptionStatus(String exceptionStatus) {
    this.exceptionStatus = exceptionStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CcReconException ccReconException = (CcReconException) o;
    return Objects.equals(this.exceptionUUID, ccReconException.exceptionUUID) &&
        Objects.equals(this.exceptionCode, ccReconException.exceptionCode) &&
        Objects.equals(this.psp, ccReconException.psp) &&
        Objects.equals(this.createdDate, ccReconException.createdDate) &&
        Objects.equals(this.latestUpdateDate, ccReconException.latestUpdateDate) &&
        Objects.equals(this.exceptionSource, ccReconException.exceptionSource) &&
        Objects.equals(this.documentUUID, ccReconException.documentUUID) &&
        Objects.equals(this.documentNumber, ccReconException.documentNumber) &&
        Objects.equals(this.pnr, ccReconException.pnr) &&
        Objects.equals(this.assignedUserID, ccReconException.assignedUserID) &&
        Objects.equals(this.autoResolver, ccReconException.autoResolver) &&
        Objects.equals(this.exceptionStatus, ccReconException.exceptionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptionUUID, exceptionCode, psp, createdDate, latestUpdateDate, exceptionSource, documentUUID, documentNumber, pnr, assignedUserID, autoResolver, exceptionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CcReconException {\n");
    sb.append("    exceptionUUID: ").append(toIndentedString(exceptionUUID)).append("\n");
    sb.append("    exceptionCode: ").append(toIndentedString(exceptionCode)).append("\n");
    sb.append("    psp: ").append(toIndentedString(psp)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    latestUpdateDate: ").append(toIndentedString(latestUpdateDate)).append("\n");
    sb.append("    exceptionSource: ").append(toIndentedString(exceptionSource)).append("\n");
    sb.append("    documentUUID: ").append(toIndentedString(documentUUID)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    pnr: ").append(toIndentedString(pnr)).append("\n");
    sb.append("    assignedUserID: ").append(toIndentedString(assignedUserID)).append("\n");
    sb.append("    autoResolver: ").append(toIndentedString(autoResolver)).append("\n");
    sb.append("    exceptionStatus: ").append(toIndentedString(exceptionStatus)).append("\n");
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

