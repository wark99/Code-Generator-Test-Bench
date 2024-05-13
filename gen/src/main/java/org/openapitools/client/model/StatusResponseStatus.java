/*
 * NSA Client API
 * This is the official Client API To interact with National Service Alliance (NSA)  # Dates All dates are in the ISO 8601 format - YYYY-MM-DD - ex. 2021-12-31  See this article for more information: [ISO 8601 article](https://en.wikipedia.org/wiki/ISO_8601)  # Authenication Authenication is handled via basic authentication.   Dev and Production credentials will be provided during the implimentation process  See this article for more information: [basic auth article](https://en.wikipedia.org/wiki/Basic_access_authentication) 
 *
 * The version of the OpenAPI document: 1.0.17
 * Contact: rj.whitehead@nationalservicealliance.com
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
import org.openapitools.client.model.StatusResponseStatusEstimatesInner;
import org.openapitools.client.model.StatusResponseStatusPartOrdersInner;
import org.openapitools.client.model.StatusResponseStatusPartShipToAddress;
import org.openapitools.client.model.StatusResponseStatusShipmentsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * StatusResponseStatus
 */
@JsonPropertyOrder({
  StatusResponseStatus.JSON_PROPERTY_CLIENT_CASE_NUMBER,
  StatusResponseStatus.JSON_PROPERTY_AUTHORIZATION_NUMBER,
  StatusResponseStatus.JSON_PROPERTY_CUSTOMER_NUMBER,
  StatusResponseStatus.JSON_PROPERTY_CLAIM_NUMBER,
  StatusResponseStatus.JSON_PROPERTY_PRE_AUTH_AMOUNT,
  StatusResponseStatus.JSON_PROPERTY_DEDUCTIBLE,
  StatusResponseStatus.JSON_PROPERTY_PLAN,
  StatusResponseStatus.JSON_PROPERTY_EXCLUSIONS,
  StatusResponseStatus.JSON_PROPERTY_CREATE_DATE,
  StatusResponseStatus.JSON_PROPERTY_CLOSE_DATE,
  StatusResponseStatus.JSON_PROPERTY_CURRENT_SCHEDULE_DATE,
  StatusResponseStatus.JSON_PROPERTY_ORIGINAL_SCHEDULE_DATE,
  StatusResponseStatus.JSON_PROPERTY_TIME_SLOT,
  StatusResponseStatus.JSON_PROPERTY_HEADER_STATUS,
  StatusResponseStatus.JSON_PROPERTY_SUB_STATUS_CODE,
  StatusResponseStatus.JSON_PROPERTY_SUB_STATUS_DESCRIPTION,
  StatusResponseStatus.JSON_PROPERTY_MAX_PART_ORDER_DATE,
  StatusResponseStatus.JSON_PROPERTY_MAX_PART_SUPPLIER_E_T_A_DATE,
  StatusResponseStatus.JSON_PROPERTY_MAX_PART_DUE_DATE,
  StatusResponseStatus.JSON_PROPERTY_SERVICER_NAME,
  StatusResponseStatus.JSON_PROPERTY_SERVICER_PHONE_NUMBER,
  StatusResponseStatus.JSON_PROPERTY_SERVICER_EMAIL,
  StatusResponseStatus.JSON_PROPERTY_PROGRAM,
  StatusResponseStatus.JSON_PROPERTY_PRODUCT_TYPE,
  StatusResponseStatus.JSON_PROPERTY_BRAND,
  StatusResponseStatus.JSON_PROPERTY_MODEL,
  StatusResponseStatus.JSON_PROPERTY_COMPLAINT,
  StatusResponseStatus.JSON_PROPERTY_SERVICE_PERFORMED,
  StatusResponseStatus.JSON_PROPERTY_CANCEL_REASON,
  StatusResponseStatus.JSON_PROPERTY_PART_ORDERS,
  StatusResponseStatus.JSON_PROPERTY_PART_SHIP_TO_ADDRESS,
  StatusResponseStatus.JSON_PROPERTY_SHIPMENTS,
  StatusResponseStatus.JSON_PROPERTY_ESTIMATES,
  StatusResponseStatus.JSON_PROPERTY_SUSPECTED_RECALL,
  StatusResponseStatus.JSON_PROPERTY_FORCE_ICE_MAKER_COVERED
})
@JsonTypeName("StatusResponse_status")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:53.009381485Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class StatusResponseStatus {
  public static final String JSON_PROPERTY_CLIENT_CASE_NUMBER = "clientCaseNumber";
  private String clientCaseNumber;

  public static final String JSON_PROPERTY_AUTHORIZATION_NUMBER = "authorizationNumber";
  private String authorizationNumber;

  public static final String JSON_PROPERTY_CUSTOMER_NUMBER = "customerNumber";
  private String customerNumber;

  public static final String JSON_PROPERTY_CLAIM_NUMBER = "claimNumber";
  private String claimNumber;

  public static final String JSON_PROPERTY_PRE_AUTH_AMOUNT = "preAuthAmount";
  private String preAuthAmount;

  public static final String JSON_PROPERTY_DEDUCTIBLE = "deductible";
  private String deductible;

  public static final String JSON_PROPERTY_PLAN = "plan";
  private String plan;

  public static final String JSON_PROPERTY_EXCLUSIONS = "exclusions";
  private String exclusions;

  public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
  private String createDate;

  public static final String JSON_PROPERTY_CLOSE_DATE = "closeDate";
  private String closeDate;

  public static final String JSON_PROPERTY_CURRENT_SCHEDULE_DATE = "currentScheduleDate";
  private String currentScheduleDate;

  public static final String JSON_PROPERTY_ORIGINAL_SCHEDULE_DATE = "originalScheduleDate";
  private String originalScheduleDate;

  public static final String JSON_PROPERTY_TIME_SLOT = "timeSlot";
  private String timeSlot;

  public static final String JSON_PROPERTY_HEADER_STATUS = "headerStatus";
  private String headerStatus;

  public static final String JSON_PROPERTY_SUB_STATUS_CODE = "subStatusCode";
  private String subStatusCode;

  public static final String JSON_PROPERTY_SUB_STATUS_DESCRIPTION = "subStatusDescription";
  private String subStatusDescription;

  public static final String JSON_PROPERTY_MAX_PART_ORDER_DATE = "maxPartOrderDate";
  private String maxPartOrderDate;

  public static final String JSON_PROPERTY_MAX_PART_SUPPLIER_E_T_A_DATE = "maxPartSupplierETADate";
  private String maxPartSupplierETADate;

  public static final String JSON_PROPERTY_MAX_PART_DUE_DATE = "maxPartDueDate";
  private String maxPartDueDate;

  public static final String JSON_PROPERTY_SERVICER_NAME = "servicerName";
  private String servicerName;

  public static final String JSON_PROPERTY_SERVICER_PHONE_NUMBER = "servicerPhoneNumber";
  private String servicerPhoneNumber;

  public static final String JSON_PROPERTY_SERVICER_EMAIL = "servicerEmail";
  private String servicerEmail;

  public static final String JSON_PROPERTY_PROGRAM = "program";
  private String program;

  public static final String JSON_PROPERTY_PRODUCT_TYPE = "productType";
  private String productType;

  public static final String JSON_PROPERTY_BRAND = "brand";
  private String brand;

  public static final String JSON_PROPERTY_MODEL = "model";
  private String model;

  public static final String JSON_PROPERTY_COMPLAINT = "complaint";
  private String complaint;

  public static final String JSON_PROPERTY_SERVICE_PERFORMED = "servicePerformed";
  private String servicePerformed;

  public static final String JSON_PROPERTY_CANCEL_REASON = "cancelReason";
  private String cancelReason;

  public static final String JSON_PROPERTY_PART_ORDERS = "partOrders";
  private List<StatusResponseStatusPartOrdersInner> partOrders = new ArrayList<>();

  public static final String JSON_PROPERTY_PART_SHIP_TO_ADDRESS = "partShipToAddress";
  private StatusResponseStatusPartShipToAddress partShipToAddress;

  public static final String JSON_PROPERTY_SHIPMENTS = "shipments";
  private List<StatusResponseStatusShipmentsInner> shipments = new ArrayList<>();

  public static final String JSON_PROPERTY_ESTIMATES = "estimates";
  private List<StatusResponseStatusEstimatesInner> estimates = new ArrayList<>();

  public static final String JSON_PROPERTY_SUSPECTED_RECALL = "suspectedRecall";
  private String suspectedRecall;

  public static final String JSON_PROPERTY_FORCE_ICE_MAKER_COVERED = "forceIceMakerCovered";
  private Object forceIceMakerCovered = null;

  public StatusResponseStatus() {
  }

  public StatusResponseStatus clientCaseNumber(String clientCaseNumber) {
    
    this.clientCaseNumber = clientCaseNumber;
    return this;
  }

   /**
   * Get clientCaseNumber
   * @return clientCaseNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLIENT_CASE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientCaseNumber() {
    return clientCaseNumber;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_CASE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientCaseNumber(String clientCaseNumber) {
    this.clientCaseNumber = clientCaseNumber;
  }


  public StatusResponseStatus authorizationNumber(String authorizationNumber) {
    
    this.authorizationNumber = authorizationNumber;
    return this;
  }

   /**
   * Get authorizationNumber
   * @return authorizationNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAuthorizationNumber() {
    return authorizationNumber;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthorizationNumber(String authorizationNumber) {
    this.authorizationNumber = authorizationNumber;
  }


  public StatusResponseStatus customerNumber(String customerNumber) {
    
    this.customerNumber = customerNumber;
    return this;
  }

   /**
   * Get customerNumber
   * @return customerNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CUSTOMER_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCustomerNumber() {
    return customerNumber;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }


  public StatusResponseStatus claimNumber(String claimNumber) {
    
    this.claimNumber = claimNumber;
    return this;
  }

   /**
   * Get claimNumber
   * @return claimNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLAIM_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClaimNumber() {
    return claimNumber;
  }


  @JsonProperty(JSON_PROPERTY_CLAIM_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClaimNumber(String claimNumber) {
    this.claimNumber = claimNumber;
  }


  public StatusResponseStatus preAuthAmount(String preAuthAmount) {
    
    this.preAuthAmount = preAuthAmount;
    return this;
  }

   /**
   * Get preAuthAmount
   * @return preAuthAmount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRE_AUTH_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPreAuthAmount() {
    return preAuthAmount;
  }


  @JsonProperty(JSON_PROPERTY_PRE_AUTH_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPreAuthAmount(String preAuthAmount) {
    this.preAuthAmount = preAuthAmount;
  }


  public StatusResponseStatus deductible(String deductible) {
    
    this.deductible = deductible;
    return this;
  }

   /**
   * Get deductible
   * @return deductible
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEDUCTIBLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDeductible() {
    return deductible;
  }


  @JsonProperty(JSON_PROPERTY_DEDUCTIBLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeductible(String deductible) {
    this.deductible = deductible;
  }


  public StatusResponseStatus plan(String plan) {
    
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlan() {
    return plan;
  }


  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlan(String plan) {
    this.plan = plan;
  }


  public StatusResponseStatus exclusions(String exclusions) {
    
    this.exclusions = exclusions;
    return this;
  }

   /**
   * Get exclusions
   * @return exclusions
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXCLUSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExclusions() {
    return exclusions;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExclusions(String exclusions) {
    this.exclusions = exclusions;
  }


  public StatusResponseStatus createDate(String createDate) {
    
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreateDate() {
    return createDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }


  public StatusResponseStatus closeDate(String closeDate) {
    
    this.closeDate = closeDate;
    return this;
  }

   /**
   * Get closeDate
   * @return closeDate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLOSE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCloseDate() {
    return closeDate;
  }


  @JsonProperty(JSON_PROPERTY_CLOSE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCloseDate(String closeDate) {
    this.closeDate = closeDate;
  }


  public StatusResponseStatus currentScheduleDate(String currentScheduleDate) {
    
    this.currentScheduleDate = currentScheduleDate;
    return this;
  }

   /**
   * Get currentScheduleDate
   * @return currentScheduleDate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENT_SCHEDULE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrentScheduleDate() {
    return currentScheduleDate;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_SCHEDULE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrentScheduleDate(String currentScheduleDate) {
    this.currentScheduleDate = currentScheduleDate;
  }


  public StatusResponseStatus originalScheduleDate(String originalScheduleDate) {
    
    this.originalScheduleDate = originalScheduleDate;
    return this;
  }

   /**
   * Get originalScheduleDate
   * @return originalScheduleDate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORIGINAL_SCHEDULE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOriginalScheduleDate() {
    return originalScheduleDate;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_SCHEDULE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOriginalScheduleDate(String originalScheduleDate) {
    this.originalScheduleDate = originalScheduleDate;
  }


  public StatusResponseStatus timeSlot(String timeSlot) {
    
    this.timeSlot = timeSlot;
    return this;
  }

   /**
   * Get timeSlot
   * @return timeSlot
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TIME_SLOT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTimeSlot() {
    return timeSlot;
  }


  @JsonProperty(JSON_PROPERTY_TIME_SLOT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimeSlot(String timeSlot) {
    this.timeSlot = timeSlot;
  }


  public StatusResponseStatus headerStatus(String headerStatus) {
    
    this.headerStatus = headerStatus;
    return this;
  }

   /**
   * Get headerStatus
   * @return headerStatus
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HEADER_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHeaderStatus() {
    return headerStatus;
  }


  @JsonProperty(JSON_PROPERTY_HEADER_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHeaderStatus(String headerStatus) {
    this.headerStatus = headerStatus;
  }


  public StatusResponseStatus subStatusCode(String subStatusCode) {
    
    this.subStatusCode = subStatusCode;
    return this;
  }

   /**
   * Get subStatusCode
   * @return subStatusCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUB_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubStatusCode() {
    return subStatusCode;
  }


  @JsonProperty(JSON_PROPERTY_SUB_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubStatusCode(String subStatusCode) {
    this.subStatusCode = subStatusCode;
  }


  public StatusResponseStatus subStatusDescription(String subStatusDescription) {
    
    this.subStatusDescription = subStatusDescription;
    return this;
  }

   /**
   * Get subStatusDescription
   * @return subStatusDescription
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUB_STATUS_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubStatusDescription() {
    return subStatusDescription;
  }


  @JsonProperty(JSON_PROPERTY_SUB_STATUS_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubStatusDescription(String subStatusDescription) {
    this.subStatusDescription = subStatusDescription;
  }


  public StatusResponseStatus maxPartOrderDate(String maxPartOrderDate) {
    
    this.maxPartOrderDate = maxPartOrderDate;
    return this;
  }

   /**
   * Get maxPartOrderDate
   * @return maxPartOrderDate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_PART_ORDER_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxPartOrderDate() {
    return maxPartOrderDate;
  }


  @JsonProperty(JSON_PROPERTY_MAX_PART_ORDER_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxPartOrderDate(String maxPartOrderDate) {
    this.maxPartOrderDate = maxPartOrderDate;
  }


  public StatusResponseStatus maxPartSupplierETADate(String maxPartSupplierETADate) {
    
    this.maxPartSupplierETADate = maxPartSupplierETADate;
    return this;
  }

   /**
   * Get maxPartSupplierETADate
   * @return maxPartSupplierETADate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_PART_SUPPLIER_E_T_A_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxPartSupplierETADate() {
    return maxPartSupplierETADate;
  }


  @JsonProperty(JSON_PROPERTY_MAX_PART_SUPPLIER_E_T_A_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxPartSupplierETADate(String maxPartSupplierETADate) {
    this.maxPartSupplierETADate = maxPartSupplierETADate;
  }


  public StatusResponseStatus maxPartDueDate(String maxPartDueDate) {
    
    this.maxPartDueDate = maxPartDueDate;
    return this;
  }

   /**
   * Get maxPartDueDate
   * @return maxPartDueDate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_PART_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxPartDueDate() {
    return maxPartDueDate;
  }


  @JsonProperty(JSON_PROPERTY_MAX_PART_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxPartDueDate(String maxPartDueDate) {
    this.maxPartDueDate = maxPartDueDate;
  }


  public StatusResponseStatus servicerName(String servicerName) {
    
    this.servicerName = servicerName;
    return this;
  }

   /**
   * Get servicerName
   * @return servicerName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SERVICER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServicerName() {
    return servicerName;
  }


  @JsonProperty(JSON_PROPERTY_SERVICER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServicerName(String servicerName) {
    this.servicerName = servicerName;
  }


  public StatusResponseStatus servicerPhoneNumber(String servicerPhoneNumber) {
    
    this.servicerPhoneNumber = servicerPhoneNumber;
    return this;
  }

   /**
   * Get servicerPhoneNumber
   * @return servicerPhoneNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SERVICER_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServicerPhoneNumber() {
    return servicerPhoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_SERVICER_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServicerPhoneNumber(String servicerPhoneNumber) {
    this.servicerPhoneNumber = servicerPhoneNumber;
  }


  public StatusResponseStatus servicerEmail(String servicerEmail) {
    
    this.servicerEmail = servicerEmail;
    return this;
  }

   /**
   * Get servicerEmail
   * @return servicerEmail
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SERVICER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServicerEmail() {
    return servicerEmail;
  }


  @JsonProperty(JSON_PROPERTY_SERVICER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServicerEmail(String servicerEmail) {
    this.servicerEmail = servicerEmail;
  }


  public StatusResponseStatus program(String program) {
    
    this.program = program;
    return this;
  }

   /**
   * Get program
   * @return program
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROGRAM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProgram() {
    return program;
  }


  @JsonProperty(JSON_PROPERTY_PROGRAM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProgram(String program) {
    this.program = program;
  }


  public StatusResponseStatus productType(String productType) {
    
    this.productType = productType;
    return this;
  }

   /**
   * Get productType
   * @return productType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRODUCT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProductType() {
    return productType;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProductType(String productType) {
    this.productType = productType;
  }


  public StatusResponseStatus brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBrand() {
    return brand;
  }


  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBrand(String brand) {
    this.brand = brand;
  }


  public StatusResponseStatus model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModel() {
    return model;
  }


  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModel(String model) {
    this.model = model;
  }


  public StatusResponseStatus complaint(String complaint) {
    
    this.complaint = complaint;
    return this;
  }

   /**
   * Get complaint
   * @return complaint
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMPLAINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getComplaint() {
    return complaint;
  }


  @JsonProperty(JSON_PROPERTY_COMPLAINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setComplaint(String complaint) {
    this.complaint = complaint;
  }


  public StatusResponseStatus servicePerformed(String servicePerformed) {
    
    this.servicePerformed = servicePerformed;
    return this;
  }

   /**
   * Get servicePerformed
   * @return servicePerformed
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SERVICE_PERFORMED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServicePerformed() {
    return servicePerformed;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_PERFORMED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServicePerformed(String servicePerformed) {
    this.servicePerformed = servicePerformed;
  }


  public StatusResponseStatus cancelReason(String cancelReason) {
    
    this.cancelReason = cancelReason;
    return this;
  }

   /**
   * Get cancelReason
   * @return cancelReason
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CANCEL_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCancelReason() {
    return cancelReason;
  }


  @JsonProperty(JSON_PROPERTY_CANCEL_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCancelReason(String cancelReason) {
    this.cancelReason = cancelReason;
  }


  public StatusResponseStatus partOrders(List<StatusResponseStatusPartOrdersInner> partOrders) {
    
    this.partOrders = partOrders;
    return this;
  }

  public StatusResponseStatus addPartOrdersItem(StatusResponseStatusPartOrdersInner partOrdersItem) {
    if (this.partOrders == null) {
      this.partOrders = new ArrayList<>();
    }
    this.partOrders.add(partOrdersItem);
    return this;
  }

   /**
   * Get partOrders
   * @return partOrders
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PART_ORDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<StatusResponseStatusPartOrdersInner> getPartOrders() {
    return partOrders;
  }


  @JsonProperty(JSON_PROPERTY_PART_ORDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPartOrders(List<StatusResponseStatusPartOrdersInner> partOrders) {
    this.partOrders = partOrders;
  }


  public StatusResponseStatus partShipToAddress(StatusResponseStatusPartShipToAddress partShipToAddress) {
    
    this.partShipToAddress = partShipToAddress;
    return this;
  }

   /**
   * Get partShipToAddress
   * @return partShipToAddress
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PART_SHIP_TO_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusResponseStatusPartShipToAddress getPartShipToAddress() {
    return partShipToAddress;
  }


  @JsonProperty(JSON_PROPERTY_PART_SHIP_TO_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPartShipToAddress(StatusResponseStatusPartShipToAddress partShipToAddress) {
    this.partShipToAddress = partShipToAddress;
  }


  public StatusResponseStatus shipments(List<StatusResponseStatusShipmentsInner> shipments) {
    
    this.shipments = shipments;
    return this;
  }

  public StatusResponseStatus addShipmentsItem(StatusResponseStatusShipmentsInner shipmentsItem) {
    if (this.shipments == null) {
      this.shipments = new ArrayList<>();
    }
    this.shipments.add(shipmentsItem);
    return this;
  }

   /**
   * Get shipments
   * @return shipments
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SHIPMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<StatusResponseStatusShipmentsInner> getShipments() {
    return shipments;
  }


  @JsonProperty(JSON_PROPERTY_SHIPMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShipments(List<StatusResponseStatusShipmentsInner> shipments) {
    this.shipments = shipments;
  }


  public StatusResponseStatus estimates(List<StatusResponseStatusEstimatesInner> estimates) {
    
    this.estimates = estimates;
    return this;
  }

  public StatusResponseStatus addEstimatesItem(StatusResponseStatusEstimatesInner estimatesItem) {
    if (this.estimates == null) {
      this.estimates = new ArrayList<>();
    }
    this.estimates.add(estimatesItem);
    return this;
  }

   /**
   * Get estimates
   * @return estimates
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ESTIMATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<StatusResponseStatusEstimatesInner> getEstimates() {
    return estimates;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEstimates(List<StatusResponseStatusEstimatesInner> estimates) {
    this.estimates = estimates;
  }


  public StatusResponseStatus suspectedRecall(String suspectedRecall) {
    
    this.suspectedRecall = suspectedRecall;
    return this;
  }

   /**
   * Get suspectedRecall
   * @return suspectedRecall
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUSPECTED_RECALL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSuspectedRecall() {
    return suspectedRecall;
  }


  @JsonProperty(JSON_PROPERTY_SUSPECTED_RECALL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSuspectedRecall(String suspectedRecall) {
    this.suspectedRecall = suspectedRecall;
  }


  public StatusResponseStatus forceIceMakerCovered(Object forceIceMakerCovered) {
    
    this.forceIceMakerCovered = forceIceMakerCovered;
    return this;
  }

   /**
   * Get forceIceMakerCovered
   * @return forceIceMakerCovered
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORCE_ICE_MAKER_COVERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getForceIceMakerCovered() {
    return forceIceMakerCovered;
  }


  @JsonProperty(JSON_PROPERTY_FORCE_ICE_MAKER_COVERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setForceIceMakerCovered(Object forceIceMakerCovered) {
    this.forceIceMakerCovered = forceIceMakerCovered;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusResponseStatus statusResponseStatus = (StatusResponseStatus) o;
    return Objects.equals(this.clientCaseNumber, statusResponseStatus.clientCaseNumber) &&
        Objects.equals(this.authorizationNumber, statusResponseStatus.authorizationNumber) &&
        Objects.equals(this.customerNumber, statusResponseStatus.customerNumber) &&
        Objects.equals(this.claimNumber, statusResponseStatus.claimNumber) &&
        Objects.equals(this.preAuthAmount, statusResponseStatus.preAuthAmount) &&
        Objects.equals(this.deductible, statusResponseStatus.deductible) &&
        Objects.equals(this.plan, statusResponseStatus.plan) &&
        Objects.equals(this.exclusions, statusResponseStatus.exclusions) &&
        Objects.equals(this.createDate, statusResponseStatus.createDate) &&
        Objects.equals(this.closeDate, statusResponseStatus.closeDate) &&
        Objects.equals(this.currentScheduleDate, statusResponseStatus.currentScheduleDate) &&
        Objects.equals(this.originalScheduleDate, statusResponseStatus.originalScheduleDate) &&
        Objects.equals(this.timeSlot, statusResponseStatus.timeSlot) &&
        Objects.equals(this.headerStatus, statusResponseStatus.headerStatus) &&
        Objects.equals(this.subStatusCode, statusResponseStatus.subStatusCode) &&
        Objects.equals(this.subStatusDescription, statusResponseStatus.subStatusDescription) &&
        Objects.equals(this.maxPartOrderDate, statusResponseStatus.maxPartOrderDate) &&
        Objects.equals(this.maxPartSupplierETADate, statusResponseStatus.maxPartSupplierETADate) &&
        Objects.equals(this.maxPartDueDate, statusResponseStatus.maxPartDueDate) &&
        Objects.equals(this.servicerName, statusResponseStatus.servicerName) &&
        Objects.equals(this.servicerPhoneNumber, statusResponseStatus.servicerPhoneNumber) &&
        Objects.equals(this.servicerEmail, statusResponseStatus.servicerEmail) &&
        Objects.equals(this.program, statusResponseStatus.program) &&
        Objects.equals(this.productType, statusResponseStatus.productType) &&
        Objects.equals(this.brand, statusResponseStatus.brand) &&
        Objects.equals(this.model, statusResponseStatus.model) &&
        Objects.equals(this.complaint, statusResponseStatus.complaint) &&
        Objects.equals(this.servicePerformed, statusResponseStatus.servicePerformed) &&
        Objects.equals(this.cancelReason, statusResponseStatus.cancelReason) &&
        Objects.equals(this.partOrders, statusResponseStatus.partOrders) &&
        Objects.equals(this.partShipToAddress, statusResponseStatus.partShipToAddress) &&
        Objects.equals(this.shipments, statusResponseStatus.shipments) &&
        Objects.equals(this.estimates, statusResponseStatus.estimates) &&
        Objects.equals(this.suspectedRecall, statusResponseStatus.suspectedRecall) &&
        Objects.equals(this.forceIceMakerCovered, statusResponseStatus.forceIceMakerCovered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientCaseNumber, authorizationNumber, customerNumber, claimNumber, preAuthAmount, deductible, plan, exclusions, createDate, closeDate, currentScheduleDate, originalScheduleDate, timeSlot, headerStatus, subStatusCode, subStatusDescription, maxPartOrderDate, maxPartSupplierETADate, maxPartDueDate, servicerName, servicerPhoneNumber, servicerEmail, program, productType, brand, model, complaint, servicePerformed, cancelReason, partOrders, partShipToAddress, shipments, estimates, suspectedRecall, forceIceMakerCovered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusResponseStatus {\n");
    sb.append("    clientCaseNumber: ").append(toIndentedString(clientCaseNumber)).append("\n");
    sb.append("    authorizationNumber: ").append(toIndentedString(authorizationNumber)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    claimNumber: ").append(toIndentedString(claimNumber)).append("\n");
    sb.append("    preAuthAmount: ").append(toIndentedString(preAuthAmount)).append("\n");
    sb.append("    deductible: ").append(toIndentedString(deductible)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    exclusions: ").append(toIndentedString(exclusions)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    closeDate: ").append(toIndentedString(closeDate)).append("\n");
    sb.append("    currentScheduleDate: ").append(toIndentedString(currentScheduleDate)).append("\n");
    sb.append("    originalScheduleDate: ").append(toIndentedString(originalScheduleDate)).append("\n");
    sb.append("    timeSlot: ").append(toIndentedString(timeSlot)).append("\n");
    sb.append("    headerStatus: ").append(toIndentedString(headerStatus)).append("\n");
    sb.append("    subStatusCode: ").append(toIndentedString(subStatusCode)).append("\n");
    sb.append("    subStatusDescription: ").append(toIndentedString(subStatusDescription)).append("\n");
    sb.append("    maxPartOrderDate: ").append(toIndentedString(maxPartOrderDate)).append("\n");
    sb.append("    maxPartSupplierETADate: ").append(toIndentedString(maxPartSupplierETADate)).append("\n");
    sb.append("    maxPartDueDate: ").append(toIndentedString(maxPartDueDate)).append("\n");
    sb.append("    servicerName: ").append(toIndentedString(servicerName)).append("\n");
    sb.append("    servicerPhoneNumber: ").append(toIndentedString(servicerPhoneNumber)).append("\n");
    sb.append("    servicerEmail: ").append(toIndentedString(servicerEmail)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    complaint: ").append(toIndentedString(complaint)).append("\n");
    sb.append("    servicePerformed: ").append(toIndentedString(servicePerformed)).append("\n");
    sb.append("    cancelReason: ").append(toIndentedString(cancelReason)).append("\n");
    sb.append("    partOrders: ").append(toIndentedString(partOrders)).append("\n");
    sb.append("    partShipToAddress: ").append(toIndentedString(partShipToAddress)).append("\n");
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
    sb.append("    estimates: ").append(toIndentedString(estimates)).append("\n");
    sb.append("    suspectedRecall: ").append(toIndentedString(suspectedRecall)).append("\n");
    sb.append("    forceIceMakerCovered: ").append(toIndentedString(forceIceMakerCovered)).append("\n");
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

