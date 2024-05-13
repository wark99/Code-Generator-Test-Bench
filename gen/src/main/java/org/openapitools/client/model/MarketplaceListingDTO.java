/*
 * UEX Corp API
 * Created by [@thekronny](https://discord.com/users/224580858432978944). ## Downloads [Secification file](https://app.swaggerhub.com/apiproxy/registry/dolejska-daniel/UEX-API/v2.0?resolved=true&flatten=true&pretty=true) ## Other Resources
 *
 * The version of the OpenAPI document: v2.0
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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MarketplaceListingDTO
 */
@JsonPropertyOrder({
  MarketplaceListingDTO.JSON_PROPERTY_DATE_ADDED,
  MarketplaceListingDTO.JSON_PROPERTY_DATE_APPROVED,
  MarketplaceListingDTO.JSON_PROPERTY_DATE_EXPIRATION,
  MarketplaceListingDTO.JSON_PROPERTY_DESCRIPTION,
  MarketplaceListingDTO.JSON_PROPERTY_ID,
  MarketplaceListingDTO.JSON_PROPERTY_ID_CATEGORY,
  MarketplaceListingDTO.JSON_PROPERTY_OPERATION,
  MarketplaceListingDTO.JSON_PROPERTY_PHOTOS,
  MarketplaceListingDTO.JSON_PROPERTY_PRICE,
  MarketplaceListingDTO.JSON_PROPERTY_SLUG,
  MarketplaceListingDTO.JSON_PROPERTY_TITLE,
  MarketplaceListingDTO.JSON_PROPERTY_TOTAL_NEGOTIATIONS,
  MarketplaceListingDTO.JSON_PROPERTY_TOTAL_VIEWS,
  MarketplaceListingDTO.JSON_PROPERTY_TYPE,
  MarketplaceListingDTO.JSON_PROPERTY_UNIT,
  MarketplaceListingDTO.JSON_PROPERTY_USER_AVATAR,
  MarketplaceListingDTO.JSON_PROPERTY_USER_NAME,
  MarketplaceListingDTO.JSON_PROPERTY_USER_USERNAME,
  MarketplaceListingDTO.JSON_PROPERTY_VIDEO_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:46.594754675Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MarketplaceListingDTO {
  public static final String JSON_PROPERTY_DATE_ADDED = "date_added";
  private BigDecimal dateAdded;

  public static final String JSON_PROPERTY_DATE_APPROVED = "date_approved";
  private BigDecimal dateApproved;

  public static final String JSON_PROPERTY_DATE_EXPIRATION = "date_expiration";
  private BigDecimal dateExpiration;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_ID_CATEGORY = "id_category";
  private BigDecimal idCategory;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private String operation;

  public static final String JSON_PROPERTY_PHOTOS = "photos";
  private String photos;

  public static final String JSON_PROPERTY_PRICE = "price";
  private BigDecimal price;

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TOTAL_NEGOTIATIONS = "total_negotiations";
  private BigDecimal totalNegotiations;

  public static final String JSON_PROPERTY_TOTAL_VIEWS = "total_views";
  private BigDecimal totalViews;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private String unit;

  public static final String JSON_PROPERTY_USER_AVATAR = "user_avatar";
  private String userAvatar;

  public static final String JSON_PROPERTY_USER_NAME = "user_name";
  private String userName;

  public static final String JSON_PROPERTY_USER_USERNAME = "user_username";
  private String userUsername;

  public static final String JSON_PROPERTY_VIDEO_URL = "video_url";
  private Object videoUrl;

  public MarketplaceListingDTO() {
  }

  public MarketplaceListingDTO dateAdded(BigDecimal dateAdded) {
    
    this.dateAdded = dateAdded;
    return this;
  }

   /**
   * Get dateAdded
   * @return dateAdded
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_ADDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDateAdded() {
    return dateAdded;
  }


  @JsonProperty(JSON_PROPERTY_DATE_ADDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateAdded(BigDecimal dateAdded) {
    this.dateAdded = dateAdded;
  }


  public MarketplaceListingDTO dateApproved(BigDecimal dateApproved) {
    
    this.dateApproved = dateApproved;
    return this;
  }

   /**
   * Get dateApproved
   * @return dateApproved
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDateApproved() {
    return dateApproved;
  }


  @JsonProperty(JSON_PROPERTY_DATE_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateApproved(BigDecimal dateApproved) {
    this.dateApproved = dateApproved;
  }


  public MarketplaceListingDTO dateExpiration(BigDecimal dateExpiration) {
    
    this.dateExpiration = dateExpiration;
    return this;
  }

   /**
   * Get dateExpiration
   * @return dateExpiration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDateExpiration() {
    return dateExpiration;
  }


  @JsonProperty(JSON_PROPERTY_DATE_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateExpiration(BigDecimal dateExpiration) {
    this.dateExpiration = dateExpiration;
  }


  public MarketplaceListingDTO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
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


  public MarketplaceListingDTO id(BigDecimal id) {
    
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

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(BigDecimal id) {
    this.id = id;
  }


  public MarketplaceListingDTO idCategory(BigDecimal idCategory) {
    
    this.idCategory = idCategory;
    return this;
  }

   /**
   * Get idCategory
   * @return idCategory
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIdCategory() {
    return idCategory;
  }


  @JsonProperty(JSON_PROPERTY_ID_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdCategory(BigDecimal idCategory) {
    this.idCategory = idCategory;
  }


  public MarketplaceListingDTO operation(String operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOperation() {
    return operation;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperation(String operation) {
    this.operation = operation;
  }


  public MarketplaceListingDTO photos(String photos) {
    
    this.photos = photos;
    return this;
  }

   /**
   * Get photos
   * @return photos
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHOTOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhotos() {
    return photos;
  }


  @JsonProperty(JSON_PROPERTY_PHOTOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhotos(String photos) {
    this.photos = photos;
  }


  public MarketplaceListingDTO price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public MarketplaceListingDTO slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSlug() {
    return slug;
  }


  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSlug(String slug) {
    this.slug = slug;
  }


  public MarketplaceListingDTO title(String title) {
    
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


  public MarketplaceListingDTO totalNegotiations(BigDecimal totalNegotiations) {
    
    this.totalNegotiations = totalNegotiations;
    return this;
  }

   /**
   * Get totalNegotiations
   * @return totalNegotiations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_NEGOTIATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalNegotiations() {
    return totalNegotiations;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_NEGOTIATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalNegotiations(BigDecimal totalNegotiations) {
    this.totalNegotiations = totalNegotiations;
  }


  public MarketplaceListingDTO totalViews(BigDecimal totalViews) {
    
    this.totalViews = totalViews;
    return this;
  }

   /**
   * Get totalViews
   * @return totalViews
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalViews() {
    return totalViews;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalViews(BigDecimal totalViews) {
    this.totalViews = totalViews;
  }


  public MarketplaceListingDTO type(String type) {
    
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


  public MarketplaceListingDTO unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnit() {
    return unit;
  }


  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnit(String unit) {
    this.unit = unit;
  }


  public MarketplaceListingDTO userAvatar(String userAvatar) {
    
    this.userAvatar = userAvatar;
    return this;
  }

   /**
   * Get userAvatar
   * @return userAvatar
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_AVATAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserAvatar() {
    return userAvatar;
  }


  @JsonProperty(JSON_PROPERTY_USER_AVATAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserAvatar(String userAvatar) {
    this.userAvatar = userAvatar;
  }


  public MarketplaceListingDTO userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserName() {
    return userName;
  }


  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserName(String userName) {
    this.userName = userName;
  }


  public MarketplaceListingDTO userUsername(String userUsername) {
    
    this.userUsername = userUsername;
    return this;
  }

   /**
   * Get userUsername
   * @return userUsername
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserUsername() {
    return userUsername;
  }


  @JsonProperty(JSON_PROPERTY_USER_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserUsername(String userUsername) {
    this.userUsername = userUsername;
  }


  public MarketplaceListingDTO videoUrl(Object videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * Get videoUrl
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIDEO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getVideoUrl() {
    return videoUrl;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoUrl(Object videoUrl) {
    this.videoUrl = videoUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketplaceListingDTO marketplaceListingDTO = (MarketplaceListingDTO) o;
    return Objects.equals(this.dateAdded, marketplaceListingDTO.dateAdded) &&
        Objects.equals(this.dateApproved, marketplaceListingDTO.dateApproved) &&
        Objects.equals(this.dateExpiration, marketplaceListingDTO.dateExpiration) &&
        Objects.equals(this.description, marketplaceListingDTO.description) &&
        Objects.equals(this.id, marketplaceListingDTO.id) &&
        Objects.equals(this.idCategory, marketplaceListingDTO.idCategory) &&
        Objects.equals(this.operation, marketplaceListingDTO.operation) &&
        Objects.equals(this.photos, marketplaceListingDTO.photos) &&
        Objects.equals(this.price, marketplaceListingDTO.price) &&
        Objects.equals(this.slug, marketplaceListingDTO.slug) &&
        Objects.equals(this.title, marketplaceListingDTO.title) &&
        Objects.equals(this.totalNegotiations, marketplaceListingDTO.totalNegotiations) &&
        Objects.equals(this.totalViews, marketplaceListingDTO.totalViews) &&
        Objects.equals(this.type, marketplaceListingDTO.type) &&
        Objects.equals(this.unit, marketplaceListingDTO.unit) &&
        Objects.equals(this.userAvatar, marketplaceListingDTO.userAvatar) &&
        Objects.equals(this.userName, marketplaceListingDTO.userName) &&
        Objects.equals(this.userUsername, marketplaceListingDTO.userUsername) &&
        Objects.equals(this.videoUrl, marketplaceListingDTO.videoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateAdded, dateApproved, dateExpiration, description, id, idCategory, operation, photos, price, slug, title, totalNegotiations, totalViews, type, unit, userAvatar, userName, userUsername, videoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketplaceListingDTO {\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
    sb.append("    dateApproved: ").append(toIndentedString(dateApproved)).append("\n");
    sb.append("    dateExpiration: ").append(toIndentedString(dateExpiration)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCategory: ").append(toIndentedString(idCategory)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    totalNegotiations: ").append(toIndentedString(totalNegotiations)).append("\n");
    sb.append("    totalViews: ").append(toIndentedString(totalViews)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    userAvatar: ").append(toIndentedString(userAvatar)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userUsername: ").append(toIndentedString(userUsername)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
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

