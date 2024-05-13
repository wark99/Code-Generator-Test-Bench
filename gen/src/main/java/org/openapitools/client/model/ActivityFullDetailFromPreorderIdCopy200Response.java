/*
 * Servantrip API Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0-oas3
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ActivityFullDetailFromPreorderIdCopy200ResponseActivityDestination;
import org.openapitools.client.model.ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo;
import org.openapitools.client.model.ActivityFullDetailFromPreorderIdCopy200ResponseCancellationRatesInner;
import org.openapitools.client.model.ActivityFullDetailFromPreorderIdCopy200ResponsePickupLocations;
import org.openapitools.client.model.ActivityFullDetailFromPreorderIdCopy200ResponsePricing;
import org.openapitools.client.model.ActivityFullDetailFromPreorderIdCopy200ResponseProvider;
import org.openapitools.client.model.ActivityFullDetailFromPreorderIdCopy200ResponseRatingInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ActivityFullDetailFromPreorderIdCopy200Response
 */
@JsonPropertyOrder({
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_ACTIVITY_DESTINATION,
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_ADDITIONAL_INFO,
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_AVAILABLE_LANGUAGES2ISO,
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_CANCELLATION_RATES,
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_CATEGORIES,
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_CHARACTERISTICS,
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_CULTURE_CODE,
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_DESCRIPTION,
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_DESTINATION,
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_DURATION_HOURS,
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_INSTRUCTIONS,
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_MAIN_PICTURE,
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_MODIFIERS,
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_PICKUP_LOCATIONS,
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_PICTURES,
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_PRICING,
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_PROVIDER,
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_RATING_INFO,
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_SUBTITLE,
  ActivityFullDetailFromPreorderIdCopy200Response.JSON_PROPERTY_TITLE
})
@JsonTypeName("activityFullDetailFromPreorderIdCopy_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:54.085425345Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ActivityFullDetailFromPreorderIdCopy200Response {
  public static final String JSON_PROPERTY_ACTIVITY_DESTINATION = "activity_destination";
  private ActivityFullDetailFromPreorderIdCopy200ResponseActivityDestination activityDestination;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additional_info";
  private ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo additionalInfo;

  public static final String JSON_PROPERTY_AVAILABLE_LANGUAGES2ISO = "available_languages_2iso";
  private List<String> availableLanguages2iso;

  public static final String JSON_PROPERTY_CANCELLATION_RATES = "cancellation_rates";
  private List<ActivityFullDetailFromPreorderIdCopy200ResponseCancellationRatesInner> cancellationRates;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private List<String> categories;

  public static final String JSON_PROPERTY_CHARACTERISTICS = "characteristics";
  private List<String> characteristics;

  public static final String JSON_PROPERTY_CULTURE_CODE = "culture_code";
  private String cultureCode;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DESTINATION = "destination";
  private ActivityFullDetailFromPreorderIdCopy200ResponseActivityDestination destination;

  public static final String JSON_PROPERTY_DURATION_HOURS = "duration_hours";
  private BigDecimal durationHours;

  public static final String JSON_PROPERTY_INSTRUCTIONS = "instructions";
  private String instructions;

  public static final String JSON_PROPERTY_MAIN_PICTURE = "main_picture";
  private String mainPicture;

  public static final String JSON_PROPERTY_MODIFIERS = "modifiers";
  private List<String> modifiers;

  public static final String JSON_PROPERTY_PICKUP_LOCATIONS = "pickup_locations";
  private ActivityFullDetailFromPreorderIdCopy200ResponsePickupLocations pickupLocations;

  public static final String JSON_PROPERTY_PICTURES = "pictures";
  private List<String> pictures;

  public static final String JSON_PROPERTY_PRICING = "pricing";
  private ActivityFullDetailFromPreorderIdCopy200ResponsePricing pricing;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private ActivityFullDetailFromPreorderIdCopy200ResponseProvider provider;

  public static final String JSON_PROPERTY_RATING_INFO = "rating_info";
  private ActivityFullDetailFromPreorderIdCopy200ResponseRatingInfo ratingInfo;

  public static final String JSON_PROPERTY_SUBTITLE = "subtitle";
  private String subtitle;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public ActivityFullDetailFromPreorderIdCopy200Response() {
  }

  public ActivityFullDetailFromPreorderIdCopy200Response activityDestination(ActivityFullDetailFromPreorderIdCopy200ResponseActivityDestination activityDestination) {
    
    this.activityDestination = activityDestination;
    return this;
  }

   /**
   * Get activityDestination
   * @return activityDestination
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVITY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActivityFullDetailFromPreorderIdCopy200ResponseActivityDestination getActivityDestination() {
    return activityDestination;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVITY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActivityDestination(ActivityFullDetailFromPreorderIdCopy200ResponseActivityDestination activityDestination) {
    this.activityDestination = activityDestination;
  }


  public ActivityFullDetailFromPreorderIdCopy200Response additionalInfo(ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo additionalInfo) {
    
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo getAdditionalInfo() {
    return additionalInfo;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalInfo(ActivityFullDetailFromPreorderIdCopy200ResponseAdditionalInfo additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public ActivityFullDetailFromPreorderIdCopy200Response availableLanguages2iso(List<String> availableLanguages2iso) {
    
    this.availableLanguages2iso = availableLanguages2iso;
    return this;
  }

  public ActivityFullDetailFromPreorderIdCopy200Response addAvailableLanguages2isoItem(String availableLanguages2isoItem) {
    if (this.availableLanguages2iso == null) {
      this.availableLanguages2iso = new ArrayList<>();
    }
    this.availableLanguages2iso.add(availableLanguages2isoItem);
    return this;
  }

   /**
   * Get availableLanguages2iso
   * @return availableLanguages2iso
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABLE_LANGUAGES2ISO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAvailableLanguages2iso() {
    return availableLanguages2iso;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_LANGUAGES2ISO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailableLanguages2iso(List<String> availableLanguages2iso) {
    this.availableLanguages2iso = availableLanguages2iso;
  }


  public ActivityFullDetailFromPreorderIdCopy200Response cancellationRates(List<ActivityFullDetailFromPreorderIdCopy200ResponseCancellationRatesInner> cancellationRates) {
    
    this.cancellationRates = cancellationRates;
    return this;
  }

  public ActivityFullDetailFromPreorderIdCopy200Response addCancellationRatesItem(ActivityFullDetailFromPreorderIdCopy200ResponseCancellationRatesInner cancellationRatesItem) {
    if (this.cancellationRates == null) {
      this.cancellationRates = new ArrayList<>();
    }
    this.cancellationRates.add(cancellationRatesItem);
    return this;
  }

   /**
   * Get cancellationRates
   * @return cancellationRates
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CANCELLATION_RATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ActivityFullDetailFromPreorderIdCopy200ResponseCancellationRatesInner> getCancellationRates() {
    return cancellationRates;
  }


  @JsonProperty(JSON_PROPERTY_CANCELLATION_RATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCancellationRates(List<ActivityFullDetailFromPreorderIdCopy200ResponseCancellationRatesInner> cancellationRates) {
    this.cancellationRates = cancellationRates;
  }


  public ActivityFullDetailFromPreorderIdCopy200Response categories(List<String> categories) {
    
    this.categories = categories;
    return this;
  }

  public ActivityFullDetailFromPreorderIdCopy200Response addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  public ActivityFullDetailFromPreorderIdCopy200Response characteristics(List<String> characteristics) {
    
    this.characteristics = characteristics;
    return this;
  }

  public ActivityFullDetailFromPreorderIdCopy200Response addCharacteristicsItem(String characteristicsItem) {
    if (this.characteristics == null) {
      this.characteristics = new ArrayList<>();
    }
    this.characteristics.add(characteristicsItem);
    return this;
  }

   /**
   * Get characteristics
   * @return characteristics
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARACTERISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCharacteristics() {
    return characteristics;
  }


  @JsonProperty(JSON_PROPERTY_CHARACTERISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCharacteristics(List<String> characteristics) {
    this.characteristics = characteristics;
  }


  public ActivityFullDetailFromPreorderIdCopy200Response cultureCode(String cultureCode) {
    
    this.cultureCode = cultureCode;
    return this;
  }

   /**
   * Get cultureCode
   * @return cultureCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CULTURE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCultureCode() {
    return cultureCode;
  }


  @JsonProperty(JSON_PROPERTY_CULTURE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCultureCode(String cultureCode) {
    this.cultureCode = cultureCode;
  }


  public ActivityFullDetailFromPreorderIdCopy200Response description(String description) {
    
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


  public ActivityFullDetailFromPreorderIdCopy200Response destination(ActivityFullDetailFromPreorderIdCopy200ResponseActivityDestination destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActivityFullDetailFromPreorderIdCopy200ResponseActivityDestination getDestination() {
    return destination;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestination(ActivityFullDetailFromPreorderIdCopy200ResponseActivityDestination destination) {
    this.destination = destination;
  }


  public ActivityFullDetailFromPreorderIdCopy200Response durationHours(BigDecimal durationHours) {
    
    this.durationHours = durationHours;
    return this;
  }

   /**
   * Get durationHours
   * @return durationHours
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDurationHours() {
    return durationHours;
  }


  @JsonProperty(JSON_PROPERTY_DURATION_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDurationHours(BigDecimal durationHours) {
    this.durationHours = durationHours;
  }


  public ActivityFullDetailFromPreorderIdCopy200Response instructions(String instructions) {
    
    this.instructions = instructions;
    return this;
  }

   /**
   * Get instructions
   * @return instructions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstructions() {
    return instructions;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }


  public ActivityFullDetailFromPreorderIdCopy200Response mainPicture(String mainPicture) {
    
    this.mainPicture = mainPicture;
    return this;
  }

   /**
   * Get mainPicture
   * @return mainPicture
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAIN_PICTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMainPicture() {
    return mainPicture;
  }


  @JsonProperty(JSON_PROPERTY_MAIN_PICTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMainPicture(String mainPicture) {
    this.mainPicture = mainPicture;
  }


  public ActivityFullDetailFromPreorderIdCopy200Response modifiers(List<String> modifiers) {
    
    this.modifiers = modifiers;
    return this;
  }

  public ActivityFullDetailFromPreorderIdCopy200Response addModifiersItem(String modifiersItem) {
    if (this.modifiers == null) {
      this.modifiers = new ArrayList<>();
    }
    this.modifiers.add(modifiersItem);
    return this;
  }

   /**
   * Get modifiers
   * @return modifiers
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getModifiers() {
    return modifiers;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifiers(List<String> modifiers) {
    this.modifiers = modifiers;
  }


  public ActivityFullDetailFromPreorderIdCopy200Response pickupLocations(ActivityFullDetailFromPreorderIdCopy200ResponsePickupLocations pickupLocations) {
    
    this.pickupLocations = pickupLocations;
    return this;
  }

   /**
   * Get pickupLocations
   * @return pickupLocations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICKUP_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActivityFullDetailFromPreorderIdCopy200ResponsePickupLocations getPickupLocations() {
    return pickupLocations;
  }


  @JsonProperty(JSON_PROPERTY_PICKUP_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPickupLocations(ActivityFullDetailFromPreorderIdCopy200ResponsePickupLocations pickupLocations) {
    this.pickupLocations = pickupLocations;
  }


  public ActivityFullDetailFromPreorderIdCopy200Response pictures(List<String> pictures) {
    
    this.pictures = pictures;
    return this;
  }

  public ActivityFullDetailFromPreorderIdCopy200Response addPicturesItem(String picturesItem) {
    if (this.pictures == null) {
      this.pictures = new ArrayList<>();
    }
    this.pictures.add(picturesItem);
    return this;
  }

   /**
   * Get pictures
   * @return pictures
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPictures() {
    return pictures;
  }


  @JsonProperty(JSON_PROPERTY_PICTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPictures(List<String> pictures) {
    this.pictures = pictures;
  }


  public ActivityFullDetailFromPreorderIdCopy200Response pricing(ActivityFullDetailFromPreorderIdCopy200ResponsePricing pricing) {
    
    this.pricing = pricing;
    return this;
  }

   /**
   * Get pricing
   * @return pricing
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActivityFullDetailFromPreorderIdCopy200ResponsePricing getPricing() {
    return pricing;
  }


  @JsonProperty(JSON_PROPERTY_PRICING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPricing(ActivityFullDetailFromPreorderIdCopy200ResponsePricing pricing) {
    this.pricing = pricing;
  }


  public ActivityFullDetailFromPreorderIdCopy200Response provider(ActivityFullDetailFromPreorderIdCopy200ResponseProvider provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActivityFullDetailFromPreorderIdCopy200ResponseProvider getProvider() {
    return provider;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvider(ActivityFullDetailFromPreorderIdCopy200ResponseProvider provider) {
    this.provider = provider;
  }


  public ActivityFullDetailFromPreorderIdCopy200Response ratingInfo(ActivityFullDetailFromPreorderIdCopy200ResponseRatingInfo ratingInfo) {
    
    this.ratingInfo = ratingInfo;
    return this;
  }

   /**
   * Get ratingInfo
   * @return ratingInfo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATING_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActivityFullDetailFromPreorderIdCopy200ResponseRatingInfo getRatingInfo() {
    return ratingInfo;
  }


  @JsonProperty(JSON_PROPERTY_RATING_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatingInfo(ActivityFullDetailFromPreorderIdCopy200ResponseRatingInfo ratingInfo) {
    this.ratingInfo = ratingInfo;
  }


  public ActivityFullDetailFromPreorderIdCopy200Response subtitle(String subtitle) {
    
    this.subtitle = subtitle;
    return this;
  }

   /**
   * Get subtitle
   * @return subtitle
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBTITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubtitle() {
    return subtitle;
  }


  @JsonProperty(JSON_PROPERTY_SUBTITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  public ActivityFullDetailFromPreorderIdCopy200Response title(String title) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityFullDetailFromPreorderIdCopy200Response activityFullDetailFromPreorderIdCopy200Response = (ActivityFullDetailFromPreorderIdCopy200Response) o;
    return Objects.equals(this.activityDestination, activityFullDetailFromPreorderIdCopy200Response.activityDestination) &&
        Objects.equals(this.additionalInfo, activityFullDetailFromPreorderIdCopy200Response.additionalInfo) &&
        Objects.equals(this.availableLanguages2iso, activityFullDetailFromPreorderIdCopy200Response.availableLanguages2iso) &&
        Objects.equals(this.cancellationRates, activityFullDetailFromPreorderIdCopy200Response.cancellationRates) &&
        Objects.equals(this.categories, activityFullDetailFromPreorderIdCopy200Response.categories) &&
        Objects.equals(this.characteristics, activityFullDetailFromPreorderIdCopy200Response.characteristics) &&
        Objects.equals(this.cultureCode, activityFullDetailFromPreorderIdCopy200Response.cultureCode) &&
        Objects.equals(this.description, activityFullDetailFromPreorderIdCopy200Response.description) &&
        Objects.equals(this.destination, activityFullDetailFromPreorderIdCopy200Response.destination) &&
        Objects.equals(this.durationHours, activityFullDetailFromPreorderIdCopy200Response.durationHours) &&
        Objects.equals(this.instructions, activityFullDetailFromPreorderIdCopy200Response.instructions) &&
        Objects.equals(this.mainPicture, activityFullDetailFromPreorderIdCopy200Response.mainPicture) &&
        Objects.equals(this.modifiers, activityFullDetailFromPreorderIdCopy200Response.modifiers) &&
        Objects.equals(this.pickupLocations, activityFullDetailFromPreorderIdCopy200Response.pickupLocations) &&
        Objects.equals(this.pictures, activityFullDetailFromPreorderIdCopy200Response.pictures) &&
        Objects.equals(this.pricing, activityFullDetailFromPreorderIdCopy200Response.pricing) &&
        Objects.equals(this.provider, activityFullDetailFromPreorderIdCopy200Response.provider) &&
        Objects.equals(this.ratingInfo, activityFullDetailFromPreorderIdCopy200Response.ratingInfo) &&
        Objects.equals(this.subtitle, activityFullDetailFromPreorderIdCopy200Response.subtitle) &&
        Objects.equals(this.title, activityFullDetailFromPreorderIdCopy200Response.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityDestination, additionalInfo, availableLanguages2iso, cancellationRates, categories, characteristics, cultureCode, description, destination, durationHours, instructions, mainPicture, modifiers, pickupLocations, pictures, pricing, provider, ratingInfo, subtitle, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityFullDetailFromPreorderIdCopy200Response {\n");
    sb.append("    activityDestination: ").append(toIndentedString(activityDestination)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    availableLanguages2iso: ").append(toIndentedString(availableLanguages2iso)).append("\n");
    sb.append("    cancellationRates: ").append(toIndentedString(cancellationRates)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
    sb.append("    cultureCode: ").append(toIndentedString(cultureCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    durationHours: ").append(toIndentedString(durationHours)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    mainPicture: ").append(toIndentedString(mainPicture)).append("\n");
    sb.append("    modifiers: ").append(toIndentedString(modifiers)).append("\n");
    sb.append("    pickupLocations: ").append(toIndentedString(pickupLocations)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    ratingInfo: ").append(toIndentedString(ratingInfo)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

