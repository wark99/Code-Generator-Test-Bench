/*
 * kf+ - K@rl Schnittstellenspezifikation
 * kita finder+ - K@rl Schnittstellenspezifikation für die Übertragung von  Ereignissen aus dem Antragsmodul
 *
 * The version of the OpenAPI document: 11
 * Contact: itm.km23@muenchen.de
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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ApiKitafinderAntraegeUnterlageneingangPostRequest
 */
@JsonPropertyOrder({
  ApiKitafinderAntraegeUnterlageneingangPostRequest.JSON_PROPERTY_ID,
  ApiKitafinderAntraegeUnterlageneingangPostRequest.JSON_PROPERTY_TIMESTAMP,
  ApiKitafinderAntraegeUnterlageneingangPostRequest.JSON_PROPERTY_KF_KIND_ID,
  ApiKitafinderAntraegeUnterlageneingangPostRequest.JSON_PROPERTY_NACHNAME,
  ApiKitafinderAntraegeUnterlageneingangPostRequest.JSON_PROPERTY_VORNAME,
  ApiKitafinderAntraegeUnterlageneingangPostRequest.JSON_PROPERTY_GEBURTSDATUM,
  ApiKitafinderAntraegeUnterlageneingangPostRequest.JSON_PROPERTY_KF_KITA_ID,
  ApiKitafinderAntraegeUnterlageneingangPostRequest.JSON_PROPERTY_KIND_KIBIG_ID,
  ApiKitafinderAntraegeUnterlageneingangPostRequest.JSON_PROPERTY_KITA_KIBIG_ID,
  ApiKitafinderAntraegeUnterlageneingangPostRequest.JSON_PROPERTY_EINRICHTUNGSJAHR,
  ApiKitafinderAntraegeUnterlageneingangPostRequest.JSON_PROPERTY_ANTRAGSDATUM,
  ApiKitafinderAntraegeUnterlageneingangPostRequest.JSON_PROPERTY_ANTRAGSNUMMER
})
@JsonTypeName("_api_kitafinder_antraege_unterlageneingang_post_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:16:41.833762886Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ApiKitafinderAntraegeUnterlageneingangPostRequest {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public static final String JSON_PROPERTY_KF_KIND_ID = "kf_kind_id";
  private Integer kfKindId;

  public static final String JSON_PROPERTY_NACHNAME = "nachname";
  private String nachname;

  public static final String JSON_PROPERTY_VORNAME = "vorname";
  private String vorname;

  public static final String JSON_PROPERTY_GEBURTSDATUM = "geburtsdatum";
  private String geburtsdatum;

  public static final String JSON_PROPERTY_KF_KITA_ID = "kf_kita_id";
  private Integer kfKitaId;

  public static final String JSON_PROPERTY_KIND_KIBIG_ID = "kind_kibig_id";
  private String kindKibigId;

  public static final String JSON_PROPERTY_KITA_KIBIG_ID = "kita_kibig_id";
  private String kitaKibigId;

  public static final String JSON_PROPERTY_EINRICHTUNGSJAHR = "einrichtungsjahr";
  private String einrichtungsjahr;

  public static final String JSON_PROPERTY_ANTRAGSDATUM = "antragsdatum";
  private String antragsdatum;

  public static final String JSON_PROPERTY_ANTRAGSNUMMER = "antragsnummer";
  private Integer antragsnummer;

  public ApiKitafinderAntraegeUnterlageneingangPostRequest() {
  }

  public ApiKitafinderAntraegeUnterlageneingangPostRequest id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Eindeutige ID des Events
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


  public ApiKitafinderAntraegeUnterlageneingangPostRequest timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Zeitstempel des Events (ISO 8601)
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public ApiKitafinderAntraegeUnterlageneingangPostRequest kfKindId(Integer kfKindId) {
    
    this.kfKindId = kfKindId;
    return this;
  }

   /**
   * eindeutige ID für das Kind, KindmappenID aus Kita-Planer
   * @return kfKindId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KF_KIND_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getKfKindId() {
    return kfKindId;
  }


  @JsonProperty(JSON_PROPERTY_KF_KIND_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKfKindId(Integer kfKindId) {
    this.kfKindId = kfKindId;
  }


  public ApiKitafinderAntraegeUnterlageneingangPostRequest nachname(String nachname) {
    
    this.nachname = nachname;
    return this;
  }

   /**
   * Get nachname
   * @return nachname
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NACHNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNachname() {
    return nachname;
  }


  @JsonProperty(JSON_PROPERTY_NACHNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNachname(String nachname) {
    this.nachname = nachname;
  }


  public ApiKitafinderAntraegeUnterlageneingangPostRequest vorname(String vorname) {
    
    this.vorname = vorname;
    return this;
  }

   /**
   * Get vorname
   * @return vorname
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VORNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVorname() {
    return vorname;
  }


  @JsonProperty(JSON_PROPERTY_VORNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVorname(String vorname) {
    this.vorname = vorname;
  }


  public ApiKitafinderAntraegeUnterlageneingangPostRequest geburtsdatum(String geburtsdatum) {
    
    this.geburtsdatum = geburtsdatum;
    return this;
  }

   /**
   * Geburstdatum des Kindes
   * @return geburtsdatum
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GEBURTSDATUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGeburtsdatum() {
    return geburtsdatum;
  }


  @JsonProperty(JSON_PROPERTY_GEBURTSDATUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGeburtsdatum(String geburtsdatum) {
    this.geburtsdatum = geburtsdatum;
  }


  public ApiKitafinderAntraegeUnterlageneingangPostRequest kfKitaId(Integer kfKitaId) {
    
    this.kfKitaId = kfKitaId;
    return this;
  }

   /**
   * Einrichtungs-ID aus Kita-Planer
   * @return kfKitaId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KF_KITA_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getKfKitaId() {
    return kfKitaId;
  }


  @JsonProperty(JSON_PROPERTY_KF_KITA_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKfKitaId(Integer kfKitaId) {
    this.kfKitaId = kfKitaId;
  }


  public ApiKitafinderAntraegeUnterlageneingangPostRequest kindKibigId(String kindKibigId) {
    
    this.kindKibigId = kindKibigId;
    return this;
  }

   /**
   * KiBiG-ID des Kindes
   * @return kindKibigId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KIND_KIBIG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKindKibigId() {
    return kindKibigId;
  }


  @JsonProperty(JSON_PROPERTY_KIND_KIBIG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKindKibigId(String kindKibigId) {
    this.kindKibigId = kindKibigId;
  }


  public ApiKitafinderAntraegeUnterlageneingangPostRequest kitaKibigId(String kitaKibigId) {
    
    this.kitaKibigId = kitaKibigId;
    return this;
  }

   /**
   * KiBiG-ID der Einrichtung
   * @return kitaKibigId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KITA_KIBIG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKitaKibigId() {
    return kitaKibigId;
  }


  @JsonProperty(JSON_PROPERTY_KITA_KIBIG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKitaKibigId(String kitaKibigId) {
    this.kitaKibigId = kitaKibigId;
  }


  public ApiKitafinderAntraegeUnterlageneingangPostRequest einrichtungsjahr(String einrichtungsjahr) {
    
    this.einrichtungsjahr = einrichtungsjahr;
    return this;
  }

   /**
   * erste Jahreszahl des Kitajahre, z.B. 2021 bei 2021/2022
   * @return einrichtungsjahr
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EINRICHTUNGSJAHR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEinrichtungsjahr() {
    return einrichtungsjahr;
  }


  @JsonProperty(JSON_PROPERTY_EINRICHTUNGSJAHR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEinrichtungsjahr(String einrichtungsjahr) {
    this.einrichtungsjahr = einrichtungsjahr;
  }


  public ApiKitafinderAntraegeUnterlageneingangPostRequest antragsdatum(String antragsdatum) {
    
    this.antragsdatum = antragsdatum;
    return this;
  }

   /**
   * Datum der Antragsstellung
   * @return antragsdatum
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ANTRAGSDATUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAntragsdatum() {
    return antragsdatum;
  }


  @JsonProperty(JSON_PROPERTY_ANTRAGSDATUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAntragsdatum(String antragsdatum) {
    this.antragsdatum = antragsdatum;
  }


  public ApiKitafinderAntraegeUnterlageneingangPostRequest antragsnummer(Integer antragsnummer) {
    
    this.antragsnummer = antragsnummer;
    return this;
  }

   /**
   * Get antragsnummer
   * @return antragsnummer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ANTRAGSNUMMER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAntragsnummer() {
    return antragsnummer;
  }


  @JsonProperty(JSON_PROPERTY_ANTRAGSNUMMER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAntragsnummer(Integer antragsnummer) {
    this.antragsnummer = antragsnummer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKitafinderAntraegeUnterlageneingangPostRequest apiKitafinderAntraegeUnterlageneingangPostRequest = (ApiKitafinderAntraegeUnterlageneingangPostRequest) o;
    return Objects.equals(this.id, apiKitafinderAntraegeUnterlageneingangPostRequest.id) &&
        Objects.equals(this.timestamp, apiKitafinderAntraegeUnterlageneingangPostRequest.timestamp) &&
        Objects.equals(this.kfKindId, apiKitafinderAntraegeUnterlageneingangPostRequest.kfKindId) &&
        Objects.equals(this.nachname, apiKitafinderAntraegeUnterlageneingangPostRequest.nachname) &&
        Objects.equals(this.vorname, apiKitafinderAntraegeUnterlageneingangPostRequest.vorname) &&
        Objects.equals(this.geburtsdatum, apiKitafinderAntraegeUnterlageneingangPostRequest.geburtsdatum) &&
        Objects.equals(this.kfKitaId, apiKitafinderAntraegeUnterlageneingangPostRequest.kfKitaId) &&
        Objects.equals(this.kindKibigId, apiKitafinderAntraegeUnterlageneingangPostRequest.kindKibigId) &&
        Objects.equals(this.kitaKibigId, apiKitafinderAntraegeUnterlageneingangPostRequest.kitaKibigId) &&
        Objects.equals(this.einrichtungsjahr, apiKitafinderAntraegeUnterlageneingangPostRequest.einrichtungsjahr) &&
        Objects.equals(this.antragsdatum, apiKitafinderAntraegeUnterlageneingangPostRequest.antragsdatum) &&
        Objects.equals(this.antragsnummer, apiKitafinderAntraegeUnterlageneingangPostRequest.antragsnummer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, kfKindId, nachname, vorname, geburtsdatum, kfKitaId, kindKibigId, kitaKibigId, einrichtungsjahr, antragsdatum, antragsnummer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKitafinderAntraegeUnterlageneingangPostRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    kfKindId: ").append(toIndentedString(kfKindId)).append("\n");
    sb.append("    nachname: ").append(toIndentedString(nachname)).append("\n");
    sb.append("    vorname: ").append(toIndentedString(vorname)).append("\n");
    sb.append("    geburtsdatum: ").append(toIndentedString(geburtsdatum)).append("\n");
    sb.append("    kfKitaId: ").append(toIndentedString(kfKitaId)).append("\n");
    sb.append("    kindKibigId: ").append(toIndentedString(kindKibigId)).append("\n");
    sb.append("    kitaKibigId: ").append(toIndentedString(kitaKibigId)).append("\n");
    sb.append("    einrichtungsjahr: ").append(toIndentedString(einrichtungsjahr)).append("\n");
    sb.append("    antragsdatum: ").append(toIndentedString(antragsdatum)).append("\n");
    sb.append("    antragsnummer: ").append(toIndentedString(antragsnummer)).append("\n");
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

