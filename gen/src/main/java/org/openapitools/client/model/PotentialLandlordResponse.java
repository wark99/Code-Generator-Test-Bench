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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.EnquiryContactResponse;
import org.openapitools.client.model.LinkedEmployeeResponse;
import org.openapitools.client.model.MaintenancePost200ResponseValueCreatedDate;
import org.openapitools.client.model.PotentialLandlordResponseFollowUp;
import org.openapitools.client.model.PotentialPropertyResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PotentialLandlordResponse
 */
@JsonPropertyOrder({
  PotentialLandlordResponse.JSON_PROPERTY_ID,
  PotentialLandlordResponse.JSON_PROPERTY_STATUS,
  PotentialLandlordResponse.JSON_PROPERTY_TITLE,
  PotentialLandlordResponse.JSON_PROPERTY_FIRST_NAME,
  PotentialLandlordResponse.JSON_PROPERTY_LAST_NAME,
  PotentialLandlordResponse.JSON_PROPERTY_CONTACT,
  PotentialLandlordResponse.JSON_PROPERTY_ADDRESS,
  PotentialLandlordResponse.JSON_PROPERTY_NATURE_OF_ENQUIRY,
  PotentialLandlordResponse.JSON_PROPERTY_ENQUIRY_SOURCE,
  PotentialLandlordResponse.JSON_PROPERTY_MARKETING_CONSENT,
  PotentialLandlordResponse.JSON_PROPERTY_LINKED_EMPLOYEES,
  PotentialLandlordResponse.JSON_PROPERTY_BRANCH,
  PotentialLandlordResponse.JSON_PROPERTY_REPORTED,
  PotentialLandlordResponse.JSON_PROPERTY_CHASED,
  PotentialLandlordResponse.JSON_PROPERTY_FOLLOW_UP,
  PotentialLandlordResponse.JSON_PROPERTY_INITIAL_MEETING_DATE,
  PotentialLandlordResponse.JSON_PROPERTY_INITIAL_MEETING_START_TIME,
  PotentialLandlordResponse.JSON_PROPERTY_INITIAL_MEETING_END_TIME,
  PotentialLandlordResponse.JSON_PROPERTY_POTENTIAL_PROPERTIES,
  PotentialLandlordResponse.JSON_PROPERTY_COMPLETE,
  PotentialLandlordResponse.JSON_PROPERTY_CREATED,
  PotentialLandlordResponse.JSON_PROPERTY_UPDATED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:30.009582082Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PotentialLandlordResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  /**
   * 1 &#x3D; Suspect, 2 &#x3D; Prospect, 3 &#x3D; Lead, 4 &#x3D; Won, 5 &#x3D; Qualified out, 6 &#x3D; Lost
   */
  public enum StatusEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6);

    private Integer value;

    StatusEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(Integer value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_FIRST_NAME = "first_name";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "last_name";
  private String lastName;

  public static final String JSON_PROPERTY_CONTACT = "contact";
  private EnquiryContactResponse contact;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_NATURE_OF_ENQUIRY = "nature_of_enquiry";
  private String natureOfEnquiry;

  public static final String JSON_PROPERTY_ENQUIRY_SOURCE = "enquiry_source";
  private String enquirySource;

  public static final String JSON_PROPERTY_MARKETING_CONSENT = "marketing_consent";
  private Boolean marketingConsent;

  public static final String JSON_PROPERTY_LINKED_EMPLOYEES = "linked_employees";
  private List<LinkedEmployeeResponse> linkedEmployees;

  public static final String JSON_PROPERTY_BRANCH = "branch";
  private String branch;

  public static final String JSON_PROPERTY_REPORTED = "reported";
  private MaintenancePost200ResponseValueCreatedDate reported;

  public static final String JSON_PROPERTY_CHASED = "chased";
  private MaintenancePost200ResponseValueCreatedDate chased;

  public static final String JSON_PROPERTY_FOLLOW_UP = "follow_up";
  private PotentialLandlordResponseFollowUp followUp;

  public static final String JSON_PROPERTY_INITIAL_MEETING_DATE = "initial_meeting_date";
  private MaintenancePost200ResponseValueCreatedDate initialMeetingDate;

  public static final String JSON_PROPERTY_INITIAL_MEETING_START_TIME = "initial_meeting_start_time";
  private String initialMeetingStartTime;

  public static final String JSON_PROPERTY_INITIAL_MEETING_END_TIME = "initial_meeting_end_time";
  private String initialMeetingEndTime;

  public static final String JSON_PROPERTY_POTENTIAL_PROPERTIES = "potential_properties";
  private List<PotentialPropertyResponse> potentialProperties;

  public static final String JSON_PROPERTY_COMPLETE = "complete";
  private Boolean complete;

  public static final String JSON_PROPERTY_CREATED = "created";
  private MaintenancePost200ResponseValueCreatedDate created;

  public static final String JSON_PROPERTY_UPDATED = "updated";
  private MaintenancePost200ResponseValueCreatedDate updated;

  public PotentialLandlordResponse() {
  }

  public PotentialLandlordResponse id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
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


  public PotentialLandlordResponse status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * 1 &#x3D; Suspect, 2 &#x3D; Prospect, 3 &#x3D; Lead, 4 &#x3D; Won, 5 &#x3D; Qualified out, 6 &#x3D; Lost
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public PotentialLandlordResponse title(String title) {
    
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


  public PotentialLandlordResponse firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public PotentialLandlordResponse lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public PotentialLandlordResponse contact(EnquiryContactResponse contact) {
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnquiryContactResponse getContact() {
    return contact;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContact(EnquiryContactResponse contact) {
    this.contact = contact;
  }


  public PotentialLandlordResponse address(String address) {
    
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

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(String address) {
    this.address = address;
  }


  public PotentialLandlordResponse natureOfEnquiry(String natureOfEnquiry) {
    
    this.natureOfEnquiry = natureOfEnquiry;
    return this;
  }

   /**
   * Get natureOfEnquiry
   * @return natureOfEnquiry
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NATURE_OF_ENQUIRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNatureOfEnquiry() {
    return natureOfEnquiry;
  }


  @JsonProperty(JSON_PROPERTY_NATURE_OF_ENQUIRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNatureOfEnquiry(String natureOfEnquiry) {
    this.natureOfEnquiry = natureOfEnquiry;
  }


  public PotentialLandlordResponse enquirySource(String enquirySource) {
    
    this.enquirySource = enquirySource;
    return this;
  }

   /**
   * 1 &#x3D; 118 118, 2 &#x3D; Accountant, 51 &#x3D; Advertising board, 99 &#x3D; Agent Comparison Site, 3 &#x3D; Airbnb, 83 &#x3D; allAgents, 4 &#x3D; Applicant conversion, 5 &#x3D; Bing, 6 &#x3D; Blog, 7 &#x3D; BNI, 81 &#x3D; Boomin, 8 &#x3D; Branded car, 70 &#x3D; BT phonebook, 10 &#x3D; Canvassing, 11 &#x3D; Chamber of Commerce, 12 &#x3D; Citylets, 85 &#x3D; Commercial People, 13 &#x3D; Conveyancing referral, 14 &#x3D; Door knock, 18 &#x3D; Employee, 15 &#x3D; Facebook, 16 &#x3D; Facebook paid adverts, 76 &#x3D; feefo, 17 &#x3D; Financial advisor referral, 72 &#x3D; Friend, 19 &#x3D; Google, 20 &#x3D; Google Adwords, 21 &#x3D; Gumtree, 98 &#x3D; Homesearch, 66 &#x3D; Instagram, 22 &#x3D; Instant online valuation, 64 &#x3D; Lawyer, 23 &#x3D; Leaflet campaign, 24 &#x3D; Lettings referral, 25 &#x3D; Lettingweb, 26 &#x3D; LinkedIn, 65 &#x3D; LinkedIn paid adverts, 27 &#x3D; Local newspaper, 28 &#x3D; Maintenance contractor, 29 &#x3D; National newspaper, 30 &#x3D; Networking event, 31 &#x3D; New homes part exchange (NHPX), 9 &#x3D; Newsletter mailer, 32 &#x3D; Not asked, 33 &#x3D; Office location, 35 &#x3D; On The Market, 82 &#x3D; OneDome, 100 &#x3D; Open Rent, 36 &#x3D; Other, 37 &#x3D; Other branch referral, 63 &#x3D; Other search engine, 38 &#x3D; Our website, 39 &#x3D; Part exchange, 67 &#x3D; Pintrest, 61 &#x3D; Planning applications, 40 &#x3D; Previous client, 42 &#x3D; Prime location, 62 &#x3D; Property auctions, 91 &#x3D; Propertynews, 43 &#x3D; Radio advert, 44 &#x3D; Recommendation, 45 &#x3D; Referral, 46 &#x3D; Repossession, 97 &#x3D; Residential People, 47 &#x3D; rightmove, 48 &#x3D; s1homes, 49 &#x3D; Sales referral, 50 &#x3D; Seminar, 101 &#x3D; Spectre, 52 &#x3D; Sponsorship, 53 &#x3D; Tradeshow, 54 &#x3D; Twitter, 94 &#x3D; UKHomesearch, 79 &#x3D; Unknown, 96 &#x3D; Valpal, 55 &#x3D; Vendor, 56 &#x3D; Walk past, 57 &#x3D; Yahoo, 58 &#x3D; Yell.com, 68 &#x3D; Yellow Pages, 60 &#x3D; Zoopla
   * @return enquirySource
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENQUIRY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnquirySource() {
    return enquirySource;
  }


  @JsonProperty(JSON_PROPERTY_ENQUIRY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnquirySource(String enquirySource) {
    this.enquirySource = enquirySource;
  }


  public PotentialLandlordResponse marketingConsent(Boolean marketingConsent) {
    
    this.marketingConsent = marketingConsent;
    return this;
  }

   /**
   * Get marketingConsent
   * @return marketingConsent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARKETING_CONSENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMarketingConsent() {
    return marketingConsent;
  }


  @JsonProperty(JSON_PROPERTY_MARKETING_CONSENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketingConsent(Boolean marketingConsent) {
    this.marketingConsent = marketingConsent;
  }


  public PotentialLandlordResponse linkedEmployees(List<LinkedEmployeeResponse> linkedEmployees) {
    
    this.linkedEmployees = linkedEmployees;
    return this;
  }

  public PotentialLandlordResponse addLinkedEmployeesItem(LinkedEmployeeResponse linkedEmployeesItem) {
    if (this.linkedEmployees == null) {
      this.linkedEmployees = new ArrayList<>();
    }
    this.linkedEmployees.add(linkedEmployeesItem);
    return this;
  }

   /**
   * Get linkedEmployees
   * @return linkedEmployees
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_EMPLOYEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LinkedEmployeeResponse> getLinkedEmployees() {
    return linkedEmployees;
  }


  @JsonProperty(JSON_PROPERTY_LINKED_EMPLOYEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkedEmployees(List<LinkedEmployeeResponse> linkedEmployees) {
    this.linkedEmployees = linkedEmployees;
  }


  public PotentialLandlordResponse branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRANCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBranch() {
    return branch;
  }


  @JsonProperty(JSON_PROPERTY_BRANCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBranch(String branch) {
    this.branch = branch;
  }


  public PotentialLandlordResponse reported(MaintenancePost200ResponseValueCreatedDate reported) {
    
    this.reported = reported;
    return this;
  }

   /**
   * Get reported
   * @return reported
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MaintenancePost200ResponseValueCreatedDate getReported() {
    return reported;
  }


  @JsonProperty(JSON_PROPERTY_REPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReported(MaintenancePost200ResponseValueCreatedDate reported) {
    this.reported = reported;
  }


  public PotentialLandlordResponse chased(MaintenancePost200ResponseValueCreatedDate chased) {
    
    this.chased = chased;
    return this;
  }

   /**
   * Get chased
   * @return chased
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHASED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MaintenancePost200ResponseValueCreatedDate getChased() {
    return chased;
  }


  @JsonProperty(JSON_PROPERTY_CHASED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChased(MaintenancePost200ResponseValueCreatedDate chased) {
    this.chased = chased;
  }


  public PotentialLandlordResponse followUp(PotentialLandlordResponseFollowUp followUp) {
    
    this.followUp = followUp;
    return this;
  }

   /**
   * Get followUp
   * @return followUp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOLLOW_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PotentialLandlordResponseFollowUp getFollowUp() {
    return followUp;
  }


  @JsonProperty(JSON_PROPERTY_FOLLOW_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFollowUp(PotentialLandlordResponseFollowUp followUp) {
    this.followUp = followUp;
  }


  public PotentialLandlordResponse initialMeetingDate(MaintenancePost200ResponseValueCreatedDate initialMeetingDate) {
    
    this.initialMeetingDate = initialMeetingDate;
    return this;
  }

   /**
   * Get initialMeetingDate
   * @return initialMeetingDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INITIAL_MEETING_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MaintenancePost200ResponseValueCreatedDate getInitialMeetingDate() {
    return initialMeetingDate;
  }


  @JsonProperty(JSON_PROPERTY_INITIAL_MEETING_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitialMeetingDate(MaintenancePost200ResponseValueCreatedDate initialMeetingDate) {
    this.initialMeetingDate = initialMeetingDate;
  }


  public PotentialLandlordResponse initialMeetingStartTime(String initialMeetingStartTime) {
    
    this.initialMeetingStartTime = initialMeetingStartTime;
    return this;
  }

   /**
   * Get initialMeetingStartTime
   * @return initialMeetingStartTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INITIAL_MEETING_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInitialMeetingStartTime() {
    return initialMeetingStartTime;
  }


  @JsonProperty(JSON_PROPERTY_INITIAL_MEETING_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitialMeetingStartTime(String initialMeetingStartTime) {
    this.initialMeetingStartTime = initialMeetingStartTime;
  }


  public PotentialLandlordResponse initialMeetingEndTime(String initialMeetingEndTime) {
    
    this.initialMeetingEndTime = initialMeetingEndTime;
    return this;
  }

   /**
   * Get initialMeetingEndTime
   * @return initialMeetingEndTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INITIAL_MEETING_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInitialMeetingEndTime() {
    return initialMeetingEndTime;
  }


  @JsonProperty(JSON_PROPERTY_INITIAL_MEETING_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitialMeetingEndTime(String initialMeetingEndTime) {
    this.initialMeetingEndTime = initialMeetingEndTime;
  }


  public PotentialLandlordResponse potentialProperties(List<PotentialPropertyResponse> potentialProperties) {
    
    this.potentialProperties = potentialProperties;
    return this;
  }

  public PotentialLandlordResponse addPotentialPropertiesItem(PotentialPropertyResponse potentialPropertiesItem) {
    if (this.potentialProperties == null) {
      this.potentialProperties = new ArrayList<>();
    }
    this.potentialProperties.add(potentialPropertiesItem);
    return this;
  }

   /**
   * Get potentialProperties
   * @return potentialProperties
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POTENTIAL_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PotentialPropertyResponse> getPotentialProperties() {
    return potentialProperties;
  }


  @JsonProperty(JSON_PROPERTY_POTENTIAL_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPotentialProperties(List<PotentialPropertyResponse> potentialProperties) {
    this.potentialProperties = potentialProperties;
  }


  public PotentialLandlordResponse complete(Boolean complete) {
    
    this.complete = complete;
    return this;
  }

   /**
   * Get complete
   * @return complete
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getComplete() {
    return complete;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComplete(Boolean complete) {
    this.complete = complete;
  }


  public PotentialLandlordResponse created(MaintenancePost200ResponseValueCreatedDate created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MaintenancePost200ResponseValueCreatedDate getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(MaintenancePost200ResponseValueCreatedDate created) {
    this.created = created;
  }


  public PotentialLandlordResponse updated(MaintenancePost200ResponseValueCreatedDate updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MaintenancePost200ResponseValueCreatedDate getUpdated() {
    return updated;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdated(MaintenancePost200ResponseValueCreatedDate updated) {
    this.updated = updated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PotentialLandlordResponse potentialLandlordResponse = (PotentialLandlordResponse) o;
    return Objects.equals(this.id, potentialLandlordResponse.id) &&
        Objects.equals(this.status, potentialLandlordResponse.status) &&
        Objects.equals(this.title, potentialLandlordResponse.title) &&
        Objects.equals(this.firstName, potentialLandlordResponse.firstName) &&
        Objects.equals(this.lastName, potentialLandlordResponse.lastName) &&
        Objects.equals(this.contact, potentialLandlordResponse.contact) &&
        Objects.equals(this.address, potentialLandlordResponse.address) &&
        Objects.equals(this.natureOfEnquiry, potentialLandlordResponse.natureOfEnquiry) &&
        Objects.equals(this.enquirySource, potentialLandlordResponse.enquirySource) &&
        Objects.equals(this.marketingConsent, potentialLandlordResponse.marketingConsent) &&
        Objects.equals(this.linkedEmployees, potentialLandlordResponse.linkedEmployees) &&
        Objects.equals(this.branch, potentialLandlordResponse.branch) &&
        Objects.equals(this.reported, potentialLandlordResponse.reported) &&
        Objects.equals(this.chased, potentialLandlordResponse.chased) &&
        Objects.equals(this.followUp, potentialLandlordResponse.followUp) &&
        Objects.equals(this.initialMeetingDate, potentialLandlordResponse.initialMeetingDate) &&
        Objects.equals(this.initialMeetingStartTime, potentialLandlordResponse.initialMeetingStartTime) &&
        Objects.equals(this.initialMeetingEndTime, potentialLandlordResponse.initialMeetingEndTime) &&
        Objects.equals(this.potentialProperties, potentialLandlordResponse.potentialProperties) &&
        Objects.equals(this.complete, potentialLandlordResponse.complete) &&
        Objects.equals(this.created, potentialLandlordResponse.created) &&
        Objects.equals(this.updated, potentialLandlordResponse.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, title, firstName, lastName, contact, address, natureOfEnquiry, enquirySource, marketingConsent, linkedEmployees, branch, reported, chased, followUp, initialMeetingDate, initialMeetingStartTime, initialMeetingEndTime, potentialProperties, complete, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PotentialLandlordResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    natureOfEnquiry: ").append(toIndentedString(natureOfEnquiry)).append("\n");
    sb.append("    enquirySource: ").append(toIndentedString(enquirySource)).append("\n");
    sb.append("    marketingConsent: ").append(toIndentedString(marketingConsent)).append("\n");
    sb.append("    linkedEmployees: ").append(toIndentedString(linkedEmployees)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    reported: ").append(toIndentedString(reported)).append("\n");
    sb.append("    chased: ").append(toIndentedString(chased)).append("\n");
    sb.append("    followUp: ").append(toIndentedString(followUp)).append("\n");
    sb.append("    initialMeetingDate: ").append(toIndentedString(initialMeetingDate)).append("\n");
    sb.append("    initialMeetingStartTime: ").append(toIndentedString(initialMeetingStartTime)).append("\n");
    sb.append("    initialMeetingEndTime: ").append(toIndentedString(initialMeetingEndTime)).append("\n");
    sb.append("    potentialProperties: ").append(toIndentedString(potentialProperties)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
