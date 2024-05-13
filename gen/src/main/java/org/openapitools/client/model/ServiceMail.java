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
import org.openapitools.client.model.DomainRights;
import org.openapitools.client.model.Limit;
import org.openapitools.client.model.MailDiagnosticDns;
import org.openapitools.client.model.MailPack;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServiceMail
 */
@JsonPropertyOrder({
  ServiceMail.JSON_PROPERTY_ID,
  ServiceMail.JSON_PROPERTY_ACCOUNT_ID,
  ServiceMail.JSON_PROPERTY_SERVICE_ID,
  ServiceMail.JSON_PROPERTY_SERVICE_NAME,
  ServiceMail.JSON_PROPERTY_CUSTOMER_NAME,
  ServiceMail.JSON_PROPERTY_INTERNAL_NAME,
  ServiceMail.JSON_PROPERTY_CREATED_AT,
  ServiceMail.JSON_PROPERTY_EXPIRED_AT,
  ServiceMail.JSON_PROPERTY_HAS_MAINTENANCE,
  ServiceMail.JSON_PROPERTY_IS_LOCKED,
  ServiceMail.JSON_PROPERTY_TAGS,
  ServiceMail.JSON_PROPERTY_UNIQUE_ID,
  ServiceMail.JSON_PROPERTY_DESCRIPTION,
  ServiceMail.JSON_PROPERTY_IS_FREE,
  ServiceMail.JSON_PROPERTY_IS_ZERO_PRICE,
  ServiceMail.JSON_PROPERTY_RIGHTS,
  ServiceMail.JSON_PROPERTY_HAS_OPERATION_IN_PROGRESS,
  ServiceMail.JSON_PROPERTY_MAIN_FQDN,
  ServiceMail.JSON_PROPERTY_MAIN_FQDN_IDN,
  ServiceMail.JSON_PROPERTY_BILL_REFERENCE,
  ServiceMail.JSON_PROPERTY_BILL_PERIODICITY,
  ServiceMail.JSON_PROPERTY_QUOTA,
  ServiceMail.JSON_PROPERTY_USED,
  ServiceMail.JSON_PROPERTY_TOTAL,
  ServiceMail.JSON_PROPERTY_DIAGNOSTIC_DNS,
  ServiceMail.JSON_PROPERTY_PACK,
  ServiceMail.JSON_PROPERTY_LIMIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ServiceMail {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private Integer accountId;

  public static final String JSON_PROPERTY_SERVICE_ID = "service_id";
  private Integer serviceId;

  public static final String JSON_PROPERTY_SERVICE_NAME = "service_name";
  private String serviceName;

  public static final String JSON_PROPERTY_CUSTOMER_NAME = "customer_name";
  private String customerName;

  public static final String JSON_PROPERTY_INTERNAL_NAME = "internal_name";
  private String internalName;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Integer createdAt;

  public static final String JSON_PROPERTY_EXPIRED_AT = "expired_at";
  private Integer expiredAt;

  public static final String JSON_PROPERTY_HAS_MAINTENANCE = "has_maintenance";
  private Boolean hasMaintenance;

  public static final String JSON_PROPERTY_IS_LOCKED = "is_locked";
  private Boolean isLocked;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  public static final String JSON_PROPERTY_UNIQUE_ID = "unique_id";
  private Integer uniqueId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_IS_FREE = "is_free";
  private Boolean isFree;

  public static final String JSON_PROPERTY_IS_ZERO_PRICE = "is_zero_price";
  private Boolean isZeroPrice;

  public static final String JSON_PROPERTY_RIGHTS = "rights";
  private DomainRights rights;

  public static final String JSON_PROPERTY_HAS_OPERATION_IN_PROGRESS = "has_operation_in_progress";
  private Boolean hasOperationInProgress;

  public static final String JSON_PROPERTY_MAIN_FQDN = "main_fqdn";
  private String mainFqdn;

  public static final String JSON_PROPERTY_MAIN_FQDN_IDN = "main_fqdn_idn";
  private String mainFqdnIdn;

  public static final String JSON_PROPERTY_BILL_REFERENCE = "bill_reference";
  private String billReference;

  public static final String JSON_PROPERTY_BILL_PERIODICITY = "bill_periodicity";
  private Integer billPeriodicity;

  public static final String JSON_PROPERTY_QUOTA = "quota";
  private Integer quota;

  public static final String JSON_PROPERTY_USED = "used";
  private Integer used;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_DIAGNOSTIC_DNS = "diagnostic_dns";
  private MailDiagnosticDns diagnosticDns;

  public static final String JSON_PROPERTY_PACK = "pack";
  private MailPack pack;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Limit limit;

  public ServiceMail() {
  }

  public ServiceMail id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Ressource identifier  
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public ServiceMail accountId(Integer accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Account id  
   * @return accountId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }


  public ServiceMail serviceId(Integer serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Service id  
   * @return serviceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getServiceId() {
    return serviceId;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceId(Integer serviceId) {
    this.serviceId = serviceId;
  }


  public ServiceMail serviceName(String serviceName) {
    
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Service name  
   * @return serviceName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceName() {
    return serviceName;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public ServiceMail customerName(String customerName) {
    
    this.customerName = customerName;
    return this;
  }

   /**
   * Customer name  
   * @return customerName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerName() {
    return customerName;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public ServiceMail internalName(String internalName) {
    
    this.internalName = internalName;
    return this;
  }

   /**
   * Internal name  
   * @return internalName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERNAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInternalName() {
    return internalName;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternalName(String internalName) {
    this.internalName = internalName;
  }


  public ServiceMail createdAt(Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Created at timestamp  
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  public ServiceMail expiredAt(Integer expiredAt) {
    
    this.expiredAt = expiredAt;
    return this;
  }

   /**
   * Expired at timestamp  
   * @return expiredAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExpiredAt() {
    return expiredAt;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
  }


  public ServiceMail hasMaintenance(Boolean hasMaintenance) {
    
    this.hasMaintenance = hasMaintenance;
    return this;
  }

   /**
   * Maintenance  
   * @return hasMaintenance
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_MAINTENANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasMaintenance() {
    return hasMaintenance;
  }


  @JsonProperty(JSON_PROPERTY_HAS_MAINTENANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasMaintenance(Boolean hasMaintenance) {
    this.hasMaintenance = hasMaintenance;
  }


  public ServiceMail isLocked(Boolean isLocked) {
    
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Locked  
   * @return isLocked
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsLocked() {
    return isLocked;
  }


  @JsonProperty(JSON_PROPERTY_IS_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }


  public ServiceMail tags(Object tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * 
   * @return tags
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(Object tags) {
    this.tags = tags;
  }


  public ServiceMail uniqueId(Integer uniqueId) {
    
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * Unique id  
   * @return uniqueId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUniqueId() {
    return uniqueId;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniqueId(Integer uniqueId) {
    this.uniqueId = uniqueId;
  }


  public ServiceMail description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description  
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ServiceMail isFree(Boolean isFree) {
    
    this.isFree = isFree;
    return this;
  }

   /**
   * Is free  
   * @return isFree
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_FREE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsFree() {
    return isFree;
  }


  @JsonProperty(JSON_PROPERTY_IS_FREE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsFree(Boolean isFree) {
    this.isFree = isFree;
  }


  public ServiceMail isZeroPrice(Boolean isZeroPrice) {
    
    this.isZeroPrice = isZeroPrice;
    return this;
  }

   /**
   * Is zero price  
   * @return isZeroPrice
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ZERO_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsZeroPrice() {
    return isZeroPrice;
  }


  @JsonProperty(JSON_PROPERTY_IS_ZERO_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsZeroPrice(Boolean isZeroPrice) {
    this.isZeroPrice = isZeroPrice;
  }


  public ServiceMail rights(DomainRights rights) {
    
    this.rights = rights;
    return this;
  }

   /**
   * Get rights
   * @return rights
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DomainRights getRights() {
    return rights;
  }


  @JsonProperty(JSON_PROPERTY_RIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRights(DomainRights rights) {
    this.rights = rights;
  }


  public ServiceMail hasOperationInProgress(Boolean hasOperationInProgress) {
    
    this.hasOperationInProgress = hasOperationInProgress;
    return this;
  }

   /**
   * Operation in progress  **This field is provided only if you have set with&#x3D;operation_in_progress**
   * @return hasOperationInProgress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_OPERATION_IN_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasOperationInProgress() {
    return hasOperationInProgress;
  }


  @JsonProperty(JSON_PROPERTY_HAS_OPERATION_IN_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasOperationInProgress(Boolean hasOperationInProgress) {
    this.hasOperationInProgress = hasOperationInProgress;
  }


  public ServiceMail mainFqdn(String mainFqdn) {
    
    this.mainFqdn = mainFqdn;
    return this;
  }

   /**
   * Fully qualified domain name  
   * @return mainFqdn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAIN_FQDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMainFqdn() {
    return mainFqdn;
  }


  @JsonProperty(JSON_PROPERTY_MAIN_FQDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMainFqdn(String mainFqdn) {
    this.mainFqdn = mainFqdn;
  }


  public ServiceMail mainFqdnIdn(String mainFqdnIdn) {
    
    this.mainFqdnIdn = mainFqdnIdn;
    return this;
  }

   /**
   * Fully qualified domain name, internationalized domain name  
   * @return mainFqdnIdn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAIN_FQDN_IDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMainFqdnIdn() {
    return mainFqdnIdn;
  }


  @JsonProperty(JSON_PROPERTY_MAIN_FQDN_IDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMainFqdnIdn(String mainFqdnIdn) {
    this.mainFqdnIdn = mainFqdnIdn;
  }


  public ServiceMail billReference(String billReference) {
    
    this.billReference = billReference;
    return this;
  }

   /**
   * Bill reference  
   * @return billReference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillReference() {
    return billReference;
  }


  @JsonProperty(JSON_PROPERTY_BILL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillReference(String billReference) {
    this.billReference = billReference;
  }


  public ServiceMail billPeriodicity(Integer billPeriodicity) {
    
    this.billPeriodicity = billPeriodicity;
    return this;
  }

   /**
   * Bill periodicity  
   * @return billPeriodicity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILL_PERIODICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBillPeriodicity() {
    return billPeriodicity;
  }


  @JsonProperty(JSON_PROPERTY_BILL_PERIODICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillPeriodicity(Integer billPeriodicity) {
    this.billPeriodicity = billPeriodicity;
  }


  public ServiceMail quota(Integer quota) {
    
    this.quota = quota;
    return this;
  }

   /**
   * Quota  **This field is provided only if you have set with&#x3D;quota**
   * @return quota
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getQuota() {
    return quota;
  }


  @JsonProperty(JSON_PROPERTY_QUOTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuota(Integer quota) {
    this.quota = quota;
  }


  public ServiceMail used(Integer used) {
    
    this.used = used;
    return this;
  }

   /**
   * Used  **This field is provided only if you have set with&#x3D;quota**
   * @return used
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUsed() {
    return used;
  }


  @JsonProperty(JSON_PROPERTY_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsed(Integer used) {
    this.used = used;
  }


  public ServiceMail total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total  **This field is provided only if you have set with&#x3D;quota**
   * @return total
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(Integer total) {
    this.total = total;
  }


  public ServiceMail diagnosticDns(MailDiagnosticDns diagnosticDns) {
    
    this.diagnosticDns = diagnosticDns;
    return this;
  }

   /**
   * Get diagnosticDns
   * @return diagnosticDns
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIAGNOSTIC_DNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MailDiagnosticDns getDiagnosticDns() {
    return diagnosticDns;
  }


  @JsonProperty(JSON_PROPERTY_DIAGNOSTIC_DNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiagnosticDns(MailDiagnosticDns diagnosticDns) {
    this.diagnosticDns = diagnosticDns;
  }


  public ServiceMail pack(MailPack pack) {
    
    this.pack = pack;
    return this;
  }

   /**
   * Get pack
   * @return pack
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MailPack getPack() {
    return pack;
  }


  @JsonProperty(JSON_PROPERTY_PACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPack(MailPack pack) {
    this.pack = pack;
  }


  public ServiceMail limit(Limit limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Limit getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Limit limit) {
    this.limit = limit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceMail serviceMail = (ServiceMail) o;
    return Objects.equals(this.id, serviceMail.id) &&
        Objects.equals(this.accountId, serviceMail.accountId) &&
        Objects.equals(this.serviceId, serviceMail.serviceId) &&
        Objects.equals(this.serviceName, serviceMail.serviceName) &&
        Objects.equals(this.customerName, serviceMail.customerName) &&
        Objects.equals(this.internalName, serviceMail.internalName) &&
        Objects.equals(this.createdAt, serviceMail.createdAt) &&
        Objects.equals(this.expiredAt, serviceMail.expiredAt) &&
        Objects.equals(this.hasMaintenance, serviceMail.hasMaintenance) &&
        Objects.equals(this.isLocked, serviceMail.isLocked) &&
        Objects.equals(this.tags, serviceMail.tags) &&
        Objects.equals(this.uniqueId, serviceMail.uniqueId) &&
        Objects.equals(this.description, serviceMail.description) &&
        Objects.equals(this.isFree, serviceMail.isFree) &&
        Objects.equals(this.isZeroPrice, serviceMail.isZeroPrice) &&
        Objects.equals(this.rights, serviceMail.rights) &&
        Objects.equals(this.hasOperationInProgress, serviceMail.hasOperationInProgress) &&
        Objects.equals(this.mainFqdn, serviceMail.mainFqdn) &&
        Objects.equals(this.mainFqdnIdn, serviceMail.mainFqdnIdn) &&
        Objects.equals(this.billReference, serviceMail.billReference) &&
        Objects.equals(this.billPeriodicity, serviceMail.billPeriodicity) &&
        Objects.equals(this.quota, serviceMail.quota) &&
        Objects.equals(this.used, serviceMail.used) &&
        Objects.equals(this.total, serviceMail.total) &&
        Objects.equals(this.diagnosticDns, serviceMail.diagnosticDns) &&
        Objects.equals(this.pack, serviceMail.pack) &&
        Objects.equals(this.limit, serviceMail.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, serviceId, serviceName, customerName, internalName, createdAt, expiredAt, hasMaintenance, isLocked, tags, uniqueId, description, isFree, isZeroPrice, rights, hasOperationInProgress, mainFqdn, mainFqdnIdn, billReference, billPeriodicity, quota, used, total, diagnosticDns, pack, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceMail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    internalName: ").append(toIndentedString(internalName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
    sb.append("    hasMaintenance: ").append(toIndentedString(hasMaintenance)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isFree: ").append(toIndentedString(isFree)).append("\n");
    sb.append("    isZeroPrice: ").append(toIndentedString(isZeroPrice)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
    sb.append("    hasOperationInProgress: ").append(toIndentedString(hasOperationInProgress)).append("\n");
    sb.append("    mainFqdn: ").append(toIndentedString(mainFqdn)).append("\n");
    sb.append("    mainFqdnIdn: ").append(toIndentedString(mainFqdnIdn)).append("\n");
    sb.append("    billReference: ").append(toIndentedString(billReference)).append("\n");
    sb.append("    billPeriodicity: ").append(toIndentedString(billPeriodicity)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    diagnosticDns: ").append(toIndentedString(diagnosticDns)).append("\n");
    sb.append("    pack: ").append(toIndentedString(pack)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
