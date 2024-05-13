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
import org.openapitools.client.model.Accountaddress;
import org.openapitools.client.model.Order;
import org.openapitools.client.model.Tag;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Account
 */
@JsonPropertyOrder({
  Account.JSON_PROPERTY_ID,
  Account.JSON_PROPERTY_NAME,
  Account.JSON_PROPERTY_LEGAL_ENTITY_TYPE,
  Account.JSON_PROPERTY_CREATED_AT,
  Account.JSON_PROPERTY_ADDRESSES,
  Account.JSON_PROPERTY_TIMEZONE,
  Account.JSON_PROPERTY_WEBSITE,
  Account.JSON_PROPERTY_PHONE,
  Account.JSON_PROPERTY_FAX,
  Account.JSON_PROPERTY_LANGUAGE,
  Account.JSON_PROPERTY_LOCALE,
  Account.JSON_PROPERTY_LANGUAGE_ID,
  Account.JSON_PROPERTY_LOGO,
  Account.JSON_PROPERTY_ORDER,
  Account.JSON_PROPERTY_BETA,
  Account.JSON_PROPERTY_TYPE,
  Account.JSON_PROPERTY_BILLING,
  Account.JSON_PROPERTY_MAILING,
  Account.JSON_PROPERTY_BILLING_MAILING,
  Account.JSON_PROPERTY_WORKSPACE_ONLY,
  Account.JSON_PROPERTY_NO_ACCESS,
  Account.JSON_PROPERTY_IS_BLOCKED,
  Account.JSON_PROPERTY_BLOCKED_AT,
  Account.JSON_PROPERTY_VAT_NUMBER,
  Account.JSON_PROPERTY_FIELD1,
  Account.JSON_PROPERTY_FIELD2,
  Account.JSON_PROPERTY_TAGS,
  Account.JSON_PROPERTY_SERVICES_ALREADY_DEMO,
  Account.JSON_PROPERTY_CUSTOMIZATION_URL,
  Account.JSON_PROPERTY_NB_INVITATIONS,
  Account.JSON_PROPERTY_NB_USERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Account {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * Gets or Sets legalEntityType
   */
  public enum LegalEntityTypeEnum {
    COMPANY("company"),
    
    INDIVIDUAL("individual"),
    
    PUBLIC_BODY("public_body"),
    
    RESTRICT("restrict");

    private String value;

    LegalEntityTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LegalEntityTypeEnum fromValue(String value) {
      for (LegalEntityTypeEnum b : LegalEntityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LEGAL_ENTITY_TYPE = "legal_entity_type";
  private LegalEntityTypeEnum legalEntityType;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Integer createdAt;

  public static final String JSON_PROPERTY_ADDRESSES = "addresses";
  private List<Accountaddress> addresses;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_WEBSITE = "website";
  private String website;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_FAX = "fax";
  private String fax;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private String locale;

  public static final String JSON_PROPERTY_LANGUAGE_ID = "language_id";
  private Integer languageId;

  public static final String JSON_PROPERTY_LOGO = "logo";
  private String logo;

  public static final String JSON_PROPERTY_ORDER = "order";
  private Order order;

  public static final String JSON_PROPERTY_BETA = "beta";
  private Boolean beta;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_BILLING = "billing";
  private Boolean billing;

  public static final String JSON_PROPERTY_MAILING = "mailing";
  private Boolean mailing;

  public static final String JSON_PROPERTY_BILLING_MAILING = "billing_mailing";
  private Boolean billingMailing;

  public static final String JSON_PROPERTY_WORKSPACE_ONLY = "workspace_only";
  private Boolean workspaceOnly;

  public static final String JSON_PROPERTY_NO_ACCESS = "no_access";
  private Boolean noAccess;

  public static final String JSON_PROPERTY_IS_BLOCKED = "is_blocked";
  private Boolean isBlocked;

  public static final String JSON_PROPERTY_BLOCKED_AT = "blocked_at";
  private Integer blockedAt;

  public static final String JSON_PROPERTY_VAT_NUMBER = "vat_number";
  private String vatNumber;

  public static final String JSON_PROPERTY_FIELD1 = "field1";
  private String field1;

  public static final String JSON_PROPERTY_FIELD2 = "field2";
  private String field2;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<Tag> tags;

  public static final String JSON_PROPERTY_SERVICES_ALREADY_DEMO = "services_already_demo";
  private List<String> servicesAlreadyDemo;

  public static final String JSON_PROPERTY_CUSTOMIZATION_URL = "customization_url";
  private Object customizationUrl;

  public static final String JSON_PROPERTY_NB_INVITATIONS = "nb_invitations";
  private Integer nbInvitations;

  public static final String JSON_PROPERTY_NB_USERS = "nb_users";
  private Integer nbUsers;

  public Account() {
  }

  public Account id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the resource &#x60;Account&#x60;
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


  public Account name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the resource &#x60;Account&#x60;
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


  public Account legalEntityType(LegalEntityTypeEnum legalEntityType) {
    
    this.legalEntityType = legalEntityType;
    return this;
  }

   /**
   * Get legalEntityType
   * @return legalEntityType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LegalEntityTypeEnum getLegalEntityType() {
    return legalEntityType;
  }


  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLegalEntityType(LegalEntityTypeEnum legalEntityType) {
    this.legalEntityType = legalEntityType;
  }


  public Account createdAt(Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp &#x60;Account&#x60; has been created
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  public Account addresses(List<Accountaddress> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public Account addAddressesItem(Accountaddress addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Accountaddress> getAddresses() {
    return addresses;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddresses(List<Accountaddress> addresses) {
    this.addresses = addresses;
  }


  public Account timezone(String timezone) {
    
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


  public Account website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebsite() {
    return website;
  }


  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebsite(String website) {
    this.website = website;
  }


  public Account phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(String phone) {
    this.phone = phone;
  }


  public Account fax(String fax) {
    
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFax() {
    return fax;
  }


  @JsonProperty(JSON_PROPERTY_FAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFax(String fax) {
    this.fax = fax;
  }


  public Account language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }


  public Account locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Represents a language identifier and a region identifier
   * @return locale
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLocale() {
    return locale;
  }


  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocale(String locale) {
    this.locale = locale;
  }


  public Account languageId(Integer languageId) {
    
    this.languageId = languageId;
    return this;
  }

   /**
   * Unique identifier of the &#x60;language&#x60; that is related to the resource &#x60;Account&#x60;
   * @return languageId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LANGUAGE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getLanguageId() {
    return languageId;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLanguageId(Integer languageId) {
    this.languageId = languageId;
  }


  public Account logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * Get logo
   * @return logo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogo() {
    return logo;
  }


  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogo(String logo) {
    this.logo = logo;
  }


  public Account order(Order order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Order getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(Order order) {
    this.order = order;
  }


  public Account beta(Boolean beta) {
    
    this.beta = beta;
    return this;
  }

   /**
   * Get beta
   * @return beta
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BETA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getBeta() {
    return beta;
  }


  @JsonProperty(JSON_PROPERTY_BETA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBeta(Boolean beta) {
    this.beta = beta;
  }


  public Account type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public Account billing(Boolean billing) {
    
    this.billing = billing;
    return this;
  }

   /**
   * Get billing
   * @return billing
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBilling() {
    return billing;
  }


  @JsonProperty(JSON_PROPERTY_BILLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBilling(Boolean billing) {
    this.billing = billing;
  }


  public Account mailing(Boolean mailing) {
    
    this.mailing = mailing;
    return this;
  }

   /**
   * Get mailing
   * @return mailing
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAILING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMailing() {
    return mailing;
  }


  @JsonProperty(JSON_PROPERTY_MAILING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMailing(Boolean mailing) {
    this.mailing = mailing;
  }


  public Account billingMailing(Boolean billingMailing) {
    
    this.billingMailing = billingMailing;
    return this;
  }

   /**
   * Get billingMailing
   * @return billingMailing
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_MAILING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBillingMailing() {
    return billingMailing;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_MAILING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingMailing(Boolean billingMailing) {
    this.billingMailing = billingMailing;
  }


  public Account workspaceOnly(Boolean workspaceOnly) {
    
    this.workspaceOnly = workspaceOnly;
    return this;
  }

   /**
   * Get workspaceOnly
   * @return workspaceOnly
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKSPACE_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWorkspaceOnly() {
    return workspaceOnly;
  }


  @JsonProperty(JSON_PROPERTY_WORKSPACE_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkspaceOnly(Boolean workspaceOnly) {
    this.workspaceOnly = workspaceOnly;
  }


  public Account noAccess(Boolean noAccess) {
    
    this.noAccess = noAccess;
    return this;
  }

   /**
   * Get noAccess
   * @return noAccess
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNoAccess() {
    return noAccess;
  }


  @JsonProperty(JSON_PROPERTY_NO_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoAccess(Boolean noAccess) {
    this.noAccess = noAccess;
  }


  public Account isBlocked(Boolean isBlocked) {
    
    this.isBlocked = isBlocked;
    return this;
  }

   /**
   * Get isBlocked
   * @return isBlocked
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_BLOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsBlocked() {
    return isBlocked;
  }


  @JsonProperty(JSON_PROPERTY_IS_BLOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
  }


  public Account blockedAt(Integer blockedAt) {
    
    this.blockedAt = blockedAt;
    return this;
  }

   /**
   * Get blockedAt
   * @return blockedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCKED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBlockedAt() {
    return blockedAt;
  }


  @JsonProperty(JSON_PROPERTY_BLOCKED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockedAt(Integer blockedAt) {
    this.blockedAt = blockedAt;
  }


  public Account vatNumber(String vatNumber) {
    
    this.vatNumber = vatNumber;
    return this;
  }

   /**
   * Get vatNumber
   * @return vatNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VAT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVatNumber() {
    return vatNumber;
  }


  @JsonProperty(JSON_PROPERTY_VAT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }


  public Account field1(String field1) {
    
    this.field1 = field1;
    return this;
  }

   /**
   * Get field1
   * @return field1
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getField1() {
    return field1;
  }


  @JsonProperty(JSON_PROPERTY_FIELD1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setField1(String field1) {
    this.field1 = field1;
  }


  public Account field2(String field2) {
    
    this.field2 = field2;
    return this;
  }

   /**
   * Get field2
   * @return field2
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getField2() {
    return field2;
  }


  @JsonProperty(JSON_PROPERTY_FIELD2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setField2(String field2) {
    this.field2 = field2;
  }


  public Account tags(List<Tag> tags) {
    
    this.tags = tags;
    return this;
  }

  public Account addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Tag> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }


  public Account servicesAlreadyDemo(List<String> servicesAlreadyDemo) {
    
    this.servicesAlreadyDemo = servicesAlreadyDemo;
    return this;
  }

  public Account addServicesAlreadyDemoItem(String servicesAlreadyDemoItem) {
    if (this.servicesAlreadyDemo == null) {
      this.servicesAlreadyDemo = new ArrayList<>();
    }
    this.servicesAlreadyDemo.add(servicesAlreadyDemoItem);
    return this;
  }

   /**
   * Get servicesAlreadyDemo
   * @return servicesAlreadyDemo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICES_ALREADY_DEMO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getServicesAlreadyDemo() {
    return servicesAlreadyDemo;
  }


  @JsonProperty(JSON_PROPERTY_SERVICES_ALREADY_DEMO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServicesAlreadyDemo(List<String> servicesAlreadyDemo) {
    this.servicesAlreadyDemo = servicesAlreadyDemo;
  }


  public Account customizationUrl(Object customizationUrl) {
    
    this.customizationUrl = customizationUrl;
    return this;
  }

   /**
   * Get customizationUrl
   * @return customizationUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMIZATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getCustomizationUrl() {
    return customizationUrl;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMIZATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomizationUrl(Object customizationUrl) {
    this.customizationUrl = customizationUrl;
  }


  public Account nbInvitations(Integer nbInvitations) {
    
    this.nbInvitations = nbInvitations;
    return this;
  }

   /**
   * Get nbInvitations
   * @return nbInvitations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NB_INVITATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNbInvitations() {
    return nbInvitations;
  }


  @JsonProperty(JSON_PROPERTY_NB_INVITATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNbInvitations(Integer nbInvitations) {
    this.nbInvitations = nbInvitations;
  }


  public Account nbUsers(Integer nbUsers) {
    
    this.nbUsers = nbUsers;
    return this;
  }

   /**
   * Get nbUsers
   * @return nbUsers
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NB_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNbUsers() {
    return nbUsers;
  }


  @JsonProperty(JSON_PROPERTY_NB_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNbUsers(Integer nbUsers) {
    this.nbUsers = nbUsers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.legalEntityType, account.legalEntityType) &&
        Objects.equals(this.createdAt, account.createdAt) &&
        Objects.equals(this.addresses, account.addresses) &&
        Objects.equals(this.timezone, account.timezone) &&
        Objects.equals(this.website, account.website) &&
        Objects.equals(this.phone, account.phone) &&
        Objects.equals(this.fax, account.fax) &&
        Objects.equals(this.language, account.language) &&
        Objects.equals(this.locale, account.locale) &&
        Objects.equals(this.languageId, account.languageId) &&
        Objects.equals(this.logo, account.logo) &&
        Objects.equals(this.order, account.order) &&
        Objects.equals(this.beta, account.beta) &&
        Objects.equals(this.type, account.type) &&
        Objects.equals(this.billing, account.billing) &&
        Objects.equals(this.mailing, account.mailing) &&
        Objects.equals(this.billingMailing, account.billingMailing) &&
        Objects.equals(this.workspaceOnly, account.workspaceOnly) &&
        Objects.equals(this.noAccess, account.noAccess) &&
        Objects.equals(this.isBlocked, account.isBlocked) &&
        Objects.equals(this.blockedAt, account.blockedAt) &&
        Objects.equals(this.vatNumber, account.vatNumber) &&
        Objects.equals(this.field1, account.field1) &&
        Objects.equals(this.field2, account.field2) &&
        Objects.equals(this.tags, account.tags) &&
        Objects.equals(this.servicesAlreadyDemo, account.servicesAlreadyDemo) &&
        Objects.equals(this.customizationUrl, account.customizationUrl) &&
        Objects.equals(this.nbInvitations, account.nbInvitations) &&
        Objects.equals(this.nbUsers, account.nbUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, legalEntityType, createdAt, addresses, timezone, website, phone, fax, language, locale, languageId, logo, order, beta, type, billing, mailing, billingMailing, workspaceOnly, noAccess, isBlocked, blockedAt, vatNumber, field1, field2, tags, servicesAlreadyDemo, customizationUrl, nbInvitations, nbUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    legalEntityType: ").append(toIndentedString(legalEntityType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    beta: ").append(toIndentedString(beta)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    mailing: ").append(toIndentedString(mailing)).append("\n");
    sb.append("    billingMailing: ").append(toIndentedString(billingMailing)).append("\n");
    sb.append("    workspaceOnly: ").append(toIndentedString(workspaceOnly)).append("\n");
    sb.append("    noAccess: ").append(toIndentedString(noAccess)).append("\n");
    sb.append("    isBlocked: ").append(toIndentedString(isBlocked)).append("\n");
    sb.append("    blockedAt: ").append(toIndentedString(blockedAt)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    field1: ").append(toIndentedString(field1)).append("\n");
    sb.append("    field2: ").append(toIndentedString(field2)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    servicesAlreadyDemo: ").append(toIndentedString(servicesAlreadyDemo)).append("\n");
    sb.append("    customizationUrl: ").append(toIndentedString(customizationUrl)).append("\n");
    sb.append("    nbInvitations: ").append(toIndentedString(nbInvitations)).append("\n");
    sb.append("    nbUsers: ").append(toIndentedString(nbUsers)).append("\n");
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

