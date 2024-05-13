/*
 * Vikey Api
 * <h2>Description</h2></br><p>The Vikey Bureaucracy API can be exploited to manage every bureaucracy service inside Vikey:</p> <ul> <li>Portale alloggiati<li>Istat (to find out which regions are managed by Vikey you can use the /istat/regions endpoint)</ul></br><p>Follows the documentation about the most used APIs<br> This should be enough for the most cases, if you need more details on others APIs please drop a line to supporto@vikey.it.</p></br><h2>API Authorization</h2> <p> All the Vikey APIs have to been authorized with an <code>API token</code> inside the header of the HTTP packet. Please ask for the <code>API token</code> to your account reference or to supporto@vikey.it.</p></br><em> Please contact supporto@vikey.it in order to be guided to the choice.<br/><br/> **Country codes** --> <a href=\"https://alloggiatiweb.poliziadistato.it/PortaleAlloggiati/ashx/Download.ashx?ID=1&N=STATI\">Link</a><br/><br/>**Province and City codes** --> <a href=\"https://alloggiatiweb.poliziadistato.it/PortaleAlloggiati/ashx/Download.ashx?ID=0&N=COMUNI\">Link</a>
 *
 * The version of the OpenAPI document: 1.0.1-oas3.1
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PostIstatDataResvsTypePartenzeInnerGuestsInner
 */
@JsonPropertyOrder({
  PostIstatDataResvsTypePartenzeInnerGuestsInner.JSON_PROPERTY_IDSWH,
  PostIstatDataResvsTypePartenzeInnerGuestsInner.JSON_PROPERTY_IS_MAIN_GUEST
})
@JsonTypeName("post_istat_data_resvs_type_partenze_inner_guests_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:22:17.271343072Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PostIstatDataResvsTypePartenzeInnerGuestsInner {
  public static final String JSON_PROPERTY_IDSWH = "idswh";
  private String idswh;

  public static final String JSON_PROPERTY_IS_MAIN_GUEST = "is_main_guest";
  private Boolean isMainGuest;

  public PostIstatDataResvsTypePartenzeInnerGuestsInner() {
  }

  public PostIstatDataResvsTypePartenzeInnerGuestsInner idswh(String idswh) {
    
    this.idswh = idswh;
    return this;
  }

   /**
   * guest code
   * @return idswh
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDSWH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdswh() {
    return idswh;
  }


  @JsonProperty(JSON_PROPERTY_IDSWH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdswh(String idswh) {
    this.idswh = idswh;
  }


  public PostIstatDataResvsTypePartenzeInnerGuestsInner isMainGuest(Boolean isMainGuest) {
    
    this.isMainGuest = isMainGuest;
    return this;
  }

   /**
   * True if is the main guest, else False
   * @return isMainGuest
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_MAIN_GUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsMainGuest() {
    return isMainGuest;
  }


  @JsonProperty(JSON_PROPERTY_IS_MAIN_GUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsMainGuest(Boolean isMainGuest) {
    this.isMainGuest = isMainGuest;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostIstatDataResvsTypePartenzeInnerGuestsInner postIstatDataResvsTypePartenzeInnerGuestsInner = (PostIstatDataResvsTypePartenzeInnerGuestsInner) o;
    return Objects.equals(this.idswh, postIstatDataResvsTypePartenzeInnerGuestsInner.idswh) &&
        Objects.equals(this.isMainGuest, postIstatDataResvsTypePartenzeInnerGuestsInner.isMainGuest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idswh, isMainGuest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostIstatDataResvsTypePartenzeInnerGuestsInner {\n");
    sb.append("    idswh: ").append(toIndentedString(idswh)).append("\n");
    sb.append("    isMainGuest: ").append(toIndentedString(isMainGuest)).append("\n");
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

