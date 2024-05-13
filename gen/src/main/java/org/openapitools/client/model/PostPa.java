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
import org.openapitools.client.model.PostPaData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PostPa
 */
@JsonPropertyOrder({
  PostPa.JSON_PROPERTY_DATA
})
@JsonTypeName("post_pa")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:22:17.271343072Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PostPa {
  public static final String JSON_PROPERTY_DATA = "data";
  private PostPaData data;

  public PostPa() {
  }

  public PostPa data(PostPaData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PostPaData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(PostPaData data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPa postPa = (PostPa) o;
    return Objects.equals(this.data, postPa.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPa {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

