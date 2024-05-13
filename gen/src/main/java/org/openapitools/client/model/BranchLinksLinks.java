/*
 * RPHaven Games Management
 * This is a sample Pet Store Server based on the OpenAPI 3.1 specification.  You can find out more about Swagger at [https://swagger.io](https://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 * The version of the OpenAPI document: 1.0.2
 * Contact: apiteam@rphaven.co.uk
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
import java.net.URI;
import org.openapitools.client.model.PartyLinksLinksPartyMembers;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BranchLinksLinks
 */
@JsonPropertyOrder({
  BranchLinksLinks.JSON_PROPERTY_SELF,
  BranchLinksLinks.JSON_PROPERTY_BRANCH,
  BranchLinksLinks.JSON_PROPERTY_BRANCH_COLON_MEETS,
  BranchLinksLinks.JSON_PROPERTY_BRANCH_COLON_TABLES,
  BranchLinksLinks.JSON_PROPERTY_BRANCH_COLON_VENUES
})
@JsonTypeName("BranchLinks__links")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:40.667796194Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BranchLinksLinks {
  public static final String JSON_PROPERTY_SELF = "self";
  private URI self;

  public static final String JSON_PROPERTY_BRANCH = "branch";
  private PartyLinksLinksPartyMembers branch;

  public static final String JSON_PROPERTY_BRANCH_COLON_MEETS = "branch:meets";
  private PartyLinksLinksPartyMembers branchColonMeets;

  public static final String JSON_PROPERTY_BRANCH_COLON_TABLES = "branch:tables";
  private PartyLinksLinksPartyMembers branchColonTables;

  public static final String JSON_PROPERTY_BRANCH_COLON_VENUES = "branch:venues";
  private PartyLinksLinksPartyMembers branchColonVenues;

  public BranchLinksLinks() {
  }

  public BranchLinksLinks self(URI self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getSelf() {
    return self;
  }


  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelf(URI self) {
    this.self = self;
  }


  public BranchLinksLinks branch(PartyLinksLinksPartyMembers branch) {
    
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

  public PartyLinksLinksPartyMembers getBranch() {
    return branch;
  }


  @JsonProperty(JSON_PROPERTY_BRANCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBranch(PartyLinksLinksPartyMembers branch) {
    this.branch = branch;
  }


  public BranchLinksLinks branchColonMeets(PartyLinksLinksPartyMembers branchColonMeets) {
    
    this.branchColonMeets = branchColonMeets;
    return this;
  }

   /**
   * Get branchColonMeets
   * @return branchColonMeets
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRANCH_COLON_MEETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PartyLinksLinksPartyMembers getBranchColonMeets() {
    return branchColonMeets;
  }


  @JsonProperty(JSON_PROPERTY_BRANCH_COLON_MEETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBranchColonMeets(PartyLinksLinksPartyMembers branchColonMeets) {
    this.branchColonMeets = branchColonMeets;
  }


  public BranchLinksLinks branchColonTables(PartyLinksLinksPartyMembers branchColonTables) {
    
    this.branchColonTables = branchColonTables;
    return this;
  }

   /**
   * Get branchColonTables
   * @return branchColonTables
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRANCH_COLON_TABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PartyLinksLinksPartyMembers getBranchColonTables() {
    return branchColonTables;
  }


  @JsonProperty(JSON_PROPERTY_BRANCH_COLON_TABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBranchColonTables(PartyLinksLinksPartyMembers branchColonTables) {
    this.branchColonTables = branchColonTables;
  }


  public BranchLinksLinks branchColonVenues(PartyLinksLinksPartyMembers branchColonVenues) {
    
    this.branchColonVenues = branchColonVenues;
    return this;
  }

   /**
   * Get branchColonVenues
   * @return branchColonVenues
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRANCH_COLON_VENUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PartyLinksLinksPartyMembers getBranchColonVenues() {
    return branchColonVenues;
  }


  @JsonProperty(JSON_PROPERTY_BRANCH_COLON_VENUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBranchColonVenues(PartyLinksLinksPartyMembers branchColonVenues) {
    this.branchColonVenues = branchColonVenues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchLinksLinks branchLinksLinks = (BranchLinksLinks) o;
    return Objects.equals(this.self, branchLinksLinks.self) &&
        Objects.equals(this.branch, branchLinksLinks.branch) &&
        Objects.equals(this.branchColonMeets, branchLinksLinks.branchColonMeets) &&
        Objects.equals(this.branchColonTables, branchLinksLinks.branchColonTables) &&
        Objects.equals(this.branchColonVenues, branchLinksLinks.branchColonVenues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, branch, branchColonMeets, branchColonTables, branchColonVenues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchLinksLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    branchColonMeets: ").append(toIndentedString(branchColonMeets)).append("\n");
    sb.append("    branchColonTables: ").append(toIndentedString(branchColonTables)).append("\n");
    sb.append("    branchColonVenues: ").append(toIndentedString(branchColonVenues)).append("\n");
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
