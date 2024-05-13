/*
 * SME Professional API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.15.0-oas3.1
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
import org.openapitools.client.model.DateRequest;
import org.openapitools.client.model.MaintenancePostRequestAddress;
import org.openapitools.client.model.MaintenancePostRequestReporter;
import org.openapitools.client.model.MaintenanceStatusConfig;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MaintenancePostRequest
 */
@JsonPropertyOrder({
  MaintenancePostRequest.JSON_PROPERTY_REPORTED_DATE,
  MaintenancePostRequest.JSON_PROPERTY_TITLE,
  MaintenancePostRequest.JSON_PROPERTY_STATUS,
  MaintenancePostRequest.JSON_PROPERTY_MAINTENANCE_ISSUE,
  MaintenancePostRequest.JSON_PROPERTY_CONTRACTOR_ACCEPTED,
  MaintenancePostRequest.JSON_PROPERTY_CONTRACTOR_VISIT,
  MaintenancePostRequest.JSON_PROPERTY_CONTRACTOR_ID,
  MaintenancePostRequest.JSON_PROPERTY_INVOICE_RECEIVED_DATE,
  MaintenancePostRequest.JSON_PROPERTY_ASSIGNED_EMPLOYEE_ID,
  MaintenancePostRequest.JSON_PROPERTY_CONTACT_DETAILS_PASSED_TO_THIRD_PARTY,
  MaintenancePostRequest.JSON_PROPERTY_PROPERTY_CAN_BE_ACCESSED_WITHOUT_TENANT,
  MaintenancePostRequest.JSON_PROPERTY_REPORTER,
  MaintenancePostRequest.JSON_PROPERTY_ADDRESS,
  MaintenancePostRequest.JSON_PROPERTY_THIRD_PARTY_SYSTEM_ID
})
@JsonTypeName("_maintenance_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MaintenancePostRequest {
  public static final String JSON_PROPERTY_REPORTED_DATE = "reported_date";
  private DateRequest reportedDate;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_STATUS = "status";
  private MaintenanceStatusConfig status;

  public static final String JSON_PROPERTY_MAINTENANCE_ISSUE = "maintenance_issue";
  private String maintenanceIssue;

  public static final String JSON_PROPERTY_CONTRACTOR_ACCEPTED = "contractor_accepted";
  private DateRequest contractorAccepted;

  public static final String JSON_PROPERTY_CONTRACTOR_VISIT = "contractor_visit";
  private DateRequest contractorVisit;

  public static final String JSON_PROPERTY_CONTRACTOR_ID = "contractor_id";
  private Integer contractorId;

  public static final String JSON_PROPERTY_INVOICE_RECEIVED_DATE = "invoice_received_date";
  private DateRequest invoiceReceivedDate;

  public static final String JSON_PROPERTY_ASSIGNED_EMPLOYEE_ID = "assigned_employee_id";
  private Integer assignedEmployeeId;

  public static final String JSON_PROPERTY_CONTACT_DETAILS_PASSED_TO_THIRD_PARTY = "contact_details_passed_to_third_party";
  private Boolean contactDetailsPassedToThirdParty;

  public static final String JSON_PROPERTY_PROPERTY_CAN_BE_ACCESSED_WITHOUT_TENANT = "property_can_be_accessed_without_tenant";
  private Boolean propertyCanBeAccessedWithoutTenant;

  public static final String JSON_PROPERTY_REPORTER = "reporter";
  private MaintenancePostRequestReporter reporter;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private MaintenancePostRequestAddress address;

  public static final String JSON_PROPERTY_THIRD_PARTY_SYSTEM_ID = "third_party_system_id";
  private String thirdPartySystemId;

  public MaintenancePostRequest() {
  }

  public MaintenancePostRequest reportedDate(DateRequest reportedDate) {
    
    this.reportedDate = reportedDate;
    return this;
  }

   /**
   * Get reportedDate
   * @return reportedDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPORTED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateRequest getReportedDate() {
    return reportedDate;
  }


  @JsonProperty(JSON_PROPERTY_REPORTED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportedDate(DateRequest reportedDate) {
    this.reportedDate = reportedDate;
  }


  public MaintenancePostRequest title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public MaintenancePostRequest status(MaintenanceStatusConfig status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MaintenanceStatusConfig getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(MaintenanceStatusConfig status) {
    this.status = status;
  }


  public MaintenancePostRequest maintenanceIssue(String maintenanceIssue) {
    
    this.maintenanceIssue = maintenanceIssue;
    return this;
  }

   /**
   * Get maintenanceIssue
   * @return maintenanceIssue
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAINTENANCE_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMaintenanceIssue() {
    return maintenanceIssue;
  }


  @JsonProperty(JSON_PROPERTY_MAINTENANCE_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaintenanceIssue(String maintenanceIssue) {
    this.maintenanceIssue = maintenanceIssue;
  }


  public MaintenancePostRequest contractorAccepted(DateRequest contractorAccepted) {
    
    this.contractorAccepted = contractorAccepted;
    return this;
  }

   /**
   * Get contractorAccepted
   * @return contractorAccepted
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTRACTOR_ACCEPTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateRequest getContractorAccepted() {
    return contractorAccepted;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACTOR_ACCEPTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractorAccepted(DateRequest contractorAccepted) {
    this.contractorAccepted = contractorAccepted;
  }


  public MaintenancePostRequest contractorVisit(DateRequest contractorVisit) {
    
    this.contractorVisit = contractorVisit;
    return this;
  }

   /**
   * Get contractorVisit
   * @return contractorVisit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTRACTOR_VISIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateRequest getContractorVisit() {
    return contractorVisit;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACTOR_VISIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractorVisit(DateRequest contractorVisit) {
    this.contractorVisit = contractorVisit;
  }


  public MaintenancePostRequest contractorId(Integer contractorId) {
    
    this.contractorId = contractorId;
    return this;
  }

   /**
   * Get contractorId
   * @return contractorId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTRACTOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getContractorId() {
    return contractorId;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACTOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractorId(Integer contractorId) {
    this.contractorId = contractorId;
  }


  public MaintenancePostRequest invoiceReceivedDate(DateRequest invoiceReceivedDate) {
    
    this.invoiceReceivedDate = invoiceReceivedDate;
    return this;
  }

   /**
   * Get invoiceReceivedDate
   * @return invoiceReceivedDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOICE_RECEIVED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateRequest getInvoiceReceivedDate() {
    return invoiceReceivedDate;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_RECEIVED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceReceivedDate(DateRequest invoiceReceivedDate) {
    this.invoiceReceivedDate = invoiceReceivedDate;
  }


  public MaintenancePostRequest assignedEmployeeId(Integer assignedEmployeeId) {
    
    this.assignedEmployeeId = assignedEmployeeId;
    return this;
  }

   /**
   * Get assignedEmployeeId
   * @return assignedEmployeeId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNED_EMPLOYEE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAssignedEmployeeId() {
    return assignedEmployeeId;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNED_EMPLOYEE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignedEmployeeId(Integer assignedEmployeeId) {
    this.assignedEmployeeId = assignedEmployeeId;
  }


  public MaintenancePostRequest contactDetailsPassedToThirdParty(Boolean contactDetailsPassedToThirdParty) {
    
    this.contactDetailsPassedToThirdParty = contactDetailsPassedToThirdParty;
    return this;
  }

   /**
   * Get contactDetailsPassedToThirdParty
   * @return contactDetailsPassedToThirdParty
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT_DETAILS_PASSED_TO_THIRD_PARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContactDetailsPassedToThirdParty() {
    return contactDetailsPassedToThirdParty;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_DETAILS_PASSED_TO_THIRD_PARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactDetailsPassedToThirdParty(Boolean contactDetailsPassedToThirdParty) {
    this.contactDetailsPassedToThirdParty = contactDetailsPassedToThirdParty;
  }


  public MaintenancePostRequest propertyCanBeAccessedWithoutTenant(Boolean propertyCanBeAccessedWithoutTenant) {
    
    this.propertyCanBeAccessedWithoutTenant = propertyCanBeAccessedWithoutTenant;
    return this;
  }

   /**
   * Get propertyCanBeAccessedWithoutTenant
   * @return propertyCanBeAccessedWithoutTenant
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTY_CAN_BE_ACCESSED_WITHOUT_TENANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPropertyCanBeAccessedWithoutTenant() {
    return propertyCanBeAccessedWithoutTenant;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTY_CAN_BE_ACCESSED_WITHOUT_TENANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropertyCanBeAccessedWithoutTenant(Boolean propertyCanBeAccessedWithoutTenant) {
    this.propertyCanBeAccessedWithoutTenant = propertyCanBeAccessedWithoutTenant;
  }


  public MaintenancePostRequest reporter(MaintenancePostRequestReporter reporter) {
    
    this.reporter = reporter;
    return this;
  }

   /**
   * Get reporter
   * @return reporter
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPORTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MaintenancePostRequestReporter getReporter() {
    return reporter;
  }


  @JsonProperty(JSON_PROPERTY_REPORTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReporter(MaintenancePostRequestReporter reporter) {
    this.reporter = reporter;
  }


  public MaintenancePostRequest address(MaintenancePostRequestAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MaintenancePostRequestAddress getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(MaintenancePostRequestAddress address) {
    this.address = address;
  }


  public MaintenancePostRequest thirdPartySystemId(String thirdPartySystemId) {
    
    this.thirdPartySystemId = thirdPartySystemId;
    return this;
  }

   /**
   * Alphanumeric characters only
   * @return thirdPartySystemId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THIRD_PARTY_SYSTEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThirdPartySystemId() {
    return thirdPartySystemId;
  }


  @JsonProperty(JSON_PROPERTY_THIRD_PARTY_SYSTEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThirdPartySystemId(String thirdPartySystemId) {
    this.thirdPartySystemId = thirdPartySystemId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenancePostRequest maintenancePostRequest = (MaintenancePostRequest) o;
    return Objects.equals(this.reportedDate, maintenancePostRequest.reportedDate) &&
        Objects.equals(this.title, maintenancePostRequest.title) &&
        Objects.equals(this.status, maintenancePostRequest.status) &&
        Objects.equals(this.maintenanceIssue, maintenancePostRequest.maintenanceIssue) &&
        Objects.equals(this.contractorAccepted, maintenancePostRequest.contractorAccepted) &&
        Objects.equals(this.contractorVisit, maintenancePostRequest.contractorVisit) &&
        Objects.equals(this.contractorId, maintenancePostRequest.contractorId) &&
        Objects.equals(this.invoiceReceivedDate, maintenancePostRequest.invoiceReceivedDate) &&
        Objects.equals(this.assignedEmployeeId, maintenancePostRequest.assignedEmployeeId) &&
        Objects.equals(this.contactDetailsPassedToThirdParty, maintenancePostRequest.contactDetailsPassedToThirdParty) &&
        Objects.equals(this.propertyCanBeAccessedWithoutTenant, maintenancePostRequest.propertyCanBeAccessedWithoutTenant) &&
        Objects.equals(this.reporter, maintenancePostRequest.reporter) &&
        Objects.equals(this.address, maintenancePostRequest.address) &&
        Objects.equals(this.thirdPartySystemId, maintenancePostRequest.thirdPartySystemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportedDate, title, status, maintenanceIssue, contractorAccepted, contractorVisit, contractorId, invoiceReceivedDate, assignedEmployeeId, contactDetailsPassedToThirdParty, propertyCanBeAccessedWithoutTenant, reporter, address, thirdPartySystemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenancePostRequest {\n");
    sb.append("    reportedDate: ").append(toIndentedString(reportedDate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    maintenanceIssue: ").append(toIndentedString(maintenanceIssue)).append("\n");
    sb.append("    contractorAccepted: ").append(toIndentedString(contractorAccepted)).append("\n");
    sb.append("    contractorVisit: ").append(toIndentedString(contractorVisit)).append("\n");
    sb.append("    contractorId: ").append(toIndentedString(contractorId)).append("\n");
    sb.append("    invoiceReceivedDate: ").append(toIndentedString(invoiceReceivedDate)).append("\n");
    sb.append("    assignedEmployeeId: ").append(toIndentedString(assignedEmployeeId)).append("\n");
    sb.append("    contactDetailsPassedToThirdParty: ").append(toIndentedString(contactDetailsPassedToThirdParty)).append("\n");
    sb.append("    propertyCanBeAccessedWithoutTenant: ").append(toIndentedString(propertyCanBeAccessedWithoutTenant)).append("\n");
    sb.append("    reporter: ").append(toIndentedString(reporter)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    thirdPartySystemId: ").append(toIndentedString(thirdPartySystemId)).append("\n");
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
