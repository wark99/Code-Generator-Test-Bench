/*
 * Formuesgrunnlag for eiendomsskatt API
 * Tjenesten leverer fastsatte formuesgrunnlag for fast eiendom som grunnlag for eiendomsskatt, og inneholder informasjon om eiendomsopplysninger, adresseopplysninger og eiendomsrelasjoner for fast eiendom, samt beregnede markedsverdier med tilhørende grunnlag for boliger
 *
 * The version of the OpenAPI document: 1.2.0
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
import java.time.LocalDate;
import org.openapitools.client.model.BoenhetIBoligselskap;
import org.openapitools.client.model.Matrikkelnummer;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Angir opplysninger om eiendommer
 */
@JsonPropertyOrder({
  Eiendomsopplysninger.JSON_PROPERTY_IDENTIFIKATOR_FRA_MATRIKKELEN,
  Eiendomsopplysninger.JSON_PROPERTY_MATRIKKELNUMMER,
  Eiendomsopplysninger.JSON_PROPERTY_KOMMUNENUMMER,
  Eiendomsopplysninger.JSON_PROPERTY_BOENHET_I_BOLIGSELSKAP,
  Eiendomsopplysninger.JSON_PROPERTY_BRUKSNAVN,
  Eiendomsopplysninger.JSON_PROPERTY_ETABLERT_DATO,
  Eiendomsopplysninger.JSON_PROPERTY_UTGAATT_I_MATRIKKEL,
  Eiendomsopplysninger.JSON_PROPERTY_BOLIGSELSKAP_EIENDOM_UTGAATT_I_MATRIKKEL,
  Eiendomsopplysninger.JSON_PROPERTY_OPPLYSNINGENES_OPPHAV
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:17.794277948Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Eiendomsopplysninger {
  public static final String JSON_PROPERTY_IDENTIFIKATOR_FRA_MATRIKKELEN = "identifikatorFraMatrikkelen";
  private String identifikatorFraMatrikkelen;

  public static final String JSON_PROPERTY_MATRIKKELNUMMER = "matrikkelnummer";
  private Matrikkelnummer matrikkelnummer;

  public static final String JSON_PROPERTY_KOMMUNENUMMER = "kommunenummer";
  private String kommunenummer;

  public static final String JSON_PROPERTY_BOENHET_I_BOLIGSELSKAP = "boenhetIBoligselskap";
  private BoenhetIBoligselskap boenhetIBoligselskap;

  public static final String JSON_PROPERTY_BRUKSNAVN = "bruksnavn";
  private String bruksnavn;

  public static final String JSON_PROPERTY_ETABLERT_DATO = "etablertDato";
  private LocalDate etablertDato;

  public static final String JSON_PROPERTY_UTGAATT_I_MATRIKKEL = "utgaattIMatrikkel";
  private LocalDate utgaattIMatrikkel;

  public static final String JSON_PROPERTY_BOLIGSELSKAP_EIENDOM_UTGAATT_I_MATRIKKEL = "boligselskapEiendomUtgaattIMatrikkel";
  private LocalDate boligselskapEiendomUtgaattIMatrikkel;

  public static final String JSON_PROPERTY_OPPLYSNINGENES_OPPHAV = "opplysningenesOpphav";
  private String opplysningenesOpphav;

  public Eiendomsopplysninger() {
  }

  public Eiendomsopplysninger identifikatorFraMatrikkelen(String identifikatorFraMatrikkelen) {
    
    this.identifikatorFraMatrikkelen = identifikatorFraMatrikkelen;
    return this;
  }

   /**
   * (&lt;a href&#x3D;&#39;https://data.skatteetaten.no/web/datakatalog/begrep/20b2e2f8-9fe1-11e5-a9f8-e4115b280940&#39;&gt;Begrepsreferanse&lt;/a&gt;)
   * @return identifikatorFraMatrikkelen
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDENTIFIKATOR_FRA_MATRIKKELEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentifikatorFraMatrikkelen() {
    return identifikatorFraMatrikkelen;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFIKATOR_FRA_MATRIKKELEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentifikatorFraMatrikkelen(String identifikatorFraMatrikkelen) {
    this.identifikatorFraMatrikkelen = identifikatorFraMatrikkelen;
  }


  public Eiendomsopplysninger matrikkelnummer(Matrikkelnummer matrikkelnummer) {
    
    this.matrikkelnummer = matrikkelnummer;
    return this;
  }

   /**
   * Get matrikkelnummer
   * @return matrikkelnummer
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATRIKKELNUMMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Matrikkelnummer getMatrikkelnummer() {
    return matrikkelnummer;
  }


  @JsonProperty(JSON_PROPERTY_MATRIKKELNUMMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatrikkelnummer(Matrikkelnummer matrikkelnummer) {
    this.matrikkelnummer = matrikkelnummer;
  }


  public Eiendomsopplysninger kommunenummer(String kommunenummer) {
    
    this.kommunenummer = kommunenummer;
    return this;
  }

   /**
   * nummer for kommune (&lt;a href&#x3D;&#39;https://data.skatteetaten.no/web/datakatalog/begrep/20b2e0f3-9fe1-11e5-a9f8-e4115b280940&#39;&gt;Begrepsreferanse&lt;/a&gt;)
   * @return kommunenummer
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KOMMUNENUMMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKommunenummer() {
    return kommunenummer;
  }


  @JsonProperty(JSON_PROPERTY_KOMMUNENUMMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKommunenummer(String kommunenummer) {
    this.kommunenummer = kommunenummer;
  }


  public Eiendomsopplysninger boenhetIBoligselskap(BoenhetIBoligselskap boenhetIBoligselskap) {
    
    this.boenhetIBoligselskap = boenhetIBoligselskap;
    return this;
  }

   /**
   * Get boenhetIBoligselskap
   * @return boenhetIBoligselskap
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOENHET_I_BOLIGSELSKAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BoenhetIBoligselskap getBoenhetIBoligselskap() {
    return boenhetIBoligselskap;
  }


  @JsonProperty(JSON_PROPERTY_BOENHET_I_BOLIGSELSKAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBoenhetIBoligselskap(BoenhetIBoligselskap boenhetIBoligselskap) {
    this.boenhetIBoligselskap = boenhetIBoligselskap;
  }


  public Eiendomsopplysninger bruksnavn(String bruksnavn) {
    
    this.bruksnavn = bruksnavn;
    return this;
  }

   /**
   * vilkårlig lang sekvens av tegn inkludert aksenter og spesielle tegn fra standardiserte tegnsett (&lt;a href&#x3D;&#39;https://data.skatteetaten.no/web/datakatalog/begrep/20b52af3-9fe1-11e5-a9f8-e4115b280940&#39;&gt;Begrepsreferanse&lt;/a&gt;)
   * @return bruksnavn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRUKSNAVN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBruksnavn() {
    return bruksnavn;
  }


  @JsonProperty(JSON_PROPERTY_BRUKSNAVN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBruksnavn(String bruksnavn) {
    this.bruksnavn = bruksnavn;
  }


  public Eiendomsopplysninger etablertDato(LocalDate etablertDato) {
    
    this.etablertDato = etablertDato;
    return this;
  }

   /**
   * gir verdier for år, måned og dag. Kodes som en tekststreng etter datoformatering spesifisert i  ISO 8601 (ISO 8601:2004 Data elements and interchange formats -- Information interchange -- Representation of dates and times). Eksempel : 1998-12-21 eller 19981221. (&lt;a href&#x3D;&#39;https://data.skatteetaten.no/web/datakatalog/begrep/20b52aed-9fe1-11e5-a9f8-e4115b280940&#39;&gt;Begrepsreferanse&lt;/a&gt;)
   * @return etablertDato
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ETABLERT_DATO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getEtablertDato() {
    return etablertDato;
  }


  @JsonProperty(JSON_PROPERTY_ETABLERT_DATO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEtablertDato(LocalDate etablertDato) {
    this.etablertDato = etablertDato;
  }


  public Eiendomsopplysninger utgaattIMatrikkel(LocalDate utgaattIMatrikkel) {
    
    this.utgaattIMatrikkel = utgaattIMatrikkel;
    return this;
  }

   /**
   * gir verdier for år, måned og dag. Kodes som en tekststreng etter datoformatering spesifisert i  ISO 8601 (ISO 8601:2004 Data elements and interchange formats -- Information interchange -- Representation of dates and times). Eksempel : 1998-12-21 eller 19981221. (&lt;a href&#x3D;&#39;https://data.skatteetaten.no/web/datakatalog/begrep/20b52aed-9fe1-11e5-a9f8-e4115b280940&#39;&gt;Begrepsreferanse&lt;/a&gt;)
   * @return utgaattIMatrikkel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UTGAATT_I_MATRIKKEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getUtgaattIMatrikkel() {
    return utgaattIMatrikkel;
  }


  @JsonProperty(JSON_PROPERTY_UTGAATT_I_MATRIKKEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUtgaattIMatrikkel(LocalDate utgaattIMatrikkel) {
    this.utgaattIMatrikkel = utgaattIMatrikkel;
  }


  public Eiendomsopplysninger boligselskapEiendomUtgaattIMatrikkel(LocalDate boligselskapEiendomUtgaattIMatrikkel) {
    
    this.boligselskapEiendomUtgaattIMatrikkel = boligselskapEiendomUtgaattIMatrikkel;
    return this;
  }

   /**
   * gir verdier for år, måned og dag. Kodes som en tekststreng etter datoformatering spesifisert i  ISO 8601 (ISO 8601:2004 Data elements and interchange formats -- Information interchange -- Representation of dates and times). Eksempel : 1998-12-21 eller 19981221. (&lt;a href&#x3D;&#39;https://data.skatteetaten.no/web/datakatalog/begrep/20b52aed-9fe1-11e5-a9f8-e4115b280940&#39;&gt;Begrepsreferanse&lt;/a&gt;)
   * @return boligselskapEiendomUtgaattIMatrikkel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOLIGSELSKAP_EIENDOM_UTGAATT_I_MATRIKKEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getBoligselskapEiendomUtgaattIMatrikkel() {
    return boligselskapEiendomUtgaattIMatrikkel;
  }


  @JsonProperty(JSON_PROPERTY_BOLIGSELSKAP_EIENDOM_UTGAATT_I_MATRIKKEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBoligselskapEiendomUtgaattIMatrikkel(LocalDate boligselskapEiendomUtgaattIMatrikkel) {
    this.boligselskapEiendomUtgaattIMatrikkel = boligselskapEiendomUtgaattIMatrikkel;
  }


  public Eiendomsopplysninger opplysningenesOpphav(String opplysningenesOpphav) {
    
    this.opplysningenesOpphav = opplysningenesOpphav;
    return this;
  }

   /**
   * Kodeliste som beskriver hvor opplysningene i entitet stammer fra, for eksempel 31 desember skattelggingsperiode eller oppdatert matrikkelinformasjon som har oppstått etter 31 desember skattleggingsperiode (&lt;a href&#x3D;&#39;https://data.skatteetaten.no/web/datakatalog/kodeliste/805aef00-3de1-4da5-901e-80b58a9e8a32&#39;&gt;Kodelistereferanse&lt;/a&gt;)
   * @return opplysningenesOpphav
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPPLYSNINGENES_OPPHAV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOpplysningenesOpphav() {
    return opplysningenesOpphav;
  }


  @JsonProperty(JSON_PROPERTY_OPPLYSNINGENES_OPPHAV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpplysningenesOpphav(String opplysningenesOpphav) {
    this.opplysningenesOpphav = opplysningenesOpphav;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Eiendomsopplysninger eiendomsopplysninger = (Eiendomsopplysninger) o;
    return Objects.equals(this.identifikatorFraMatrikkelen, eiendomsopplysninger.identifikatorFraMatrikkelen) &&
        Objects.equals(this.matrikkelnummer, eiendomsopplysninger.matrikkelnummer) &&
        Objects.equals(this.kommunenummer, eiendomsopplysninger.kommunenummer) &&
        Objects.equals(this.boenhetIBoligselskap, eiendomsopplysninger.boenhetIBoligselskap) &&
        Objects.equals(this.bruksnavn, eiendomsopplysninger.bruksnavn) &&
        Objects.equals(this.etablertDato, eiendomsopplysninger.etablertDato) &&
        Objects.equals(this.utgaattIMatrikkel, eiendomsopplysninger.utgaattIMatrikkel) &&
        Objects.equals(this.boligselskapEiendomUtgaattIMatrikkel, eiendomsopplysninger.boligselskapEiendomUtgaattIMatrikkel) &&
        Objects.equals(this.opplysningenesOpphav, eiendomsopplysninger.opplysningenesOpphav);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifikatorFraMatrikkelen, matrikkelnummer, kommunenummer, boenhetIBoligselskap, bruksnavn, etablertDato, utgaattIMatrikkel, boligselskapEiendomUtgaattIMatrikkel, opplysningenesOpphav);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eiendomsopplysninger {\n");
    sb.append("    identifikatorFraMatrikkelen: ").append(toIndentedString(identifikatorFraMatrikkelen)).append("\n");
    sb.append("    matrikkelnummer: ").append(toIndentedString(matrikkelnummer)).append("\n");
    sb.append("    kommunenummer: ").append(toIndentedString(kommunenummer)).append("\n");
    sb.append("    boenhetIBoligselskap: ").append(toIndentedString(boenhetIBoligselskap)).append("\n");
    sb.append("    bruksnavn: ").append(toIndentedString(bruksnavn)).append("\n");
    sb.append("    etablertDato: ").append(toIndentedString(etablertDato)).append("\n");
    sb.append("    utgaattIMatrikkel: ").append(toIndentedString(utgaattIMatrikkel)).append("\n");
    sb.append("    boligselskapEiendomUtgaattIMatrikkel: ").append(toIndentedString(boligselskapEiendomUtgaattIMatrikkel)).append("\n");
    sb.append("    opplysningenesOpphav: ").append(toIndentedString(opplysningenesOpphav)).append("\n");
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

