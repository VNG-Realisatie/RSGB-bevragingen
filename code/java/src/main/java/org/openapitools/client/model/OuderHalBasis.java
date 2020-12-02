/*
 * Bevragen Ingeschreven Personen
 * API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.1.0/features) voor nadere toelichting. 
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.DatumOnvolledig;
import org.openapitools.client.model.Geboorte;
import org.openapitools.client.model.GeslachtEnum;
import org.openapitools.client.model.Naam;
import org.openapitools.client.model.Ouder;
import org.openapitools.client.model.OuderAanduidingEnum;
import org.openapitools.client.model.OuderHalBasisAllOf;
import org.openapitools.client.model.OuderInOnderzoek;
import org.openapitools.client.model.OuderLinks;

/**
 * OuderHalBasis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-02T08:12:12.840Z[Etc/UTC]")
public class OuderHalBasis {
  public static final String SERIALIZED_NAME_BURGERSERVICENUMMER = "burgerservicenummer";
  @SerializedName(SERIALIZED_NAME_BURGERSERVICENUMMER)
  private String burgerservicenummer;

  public static final String SERIALIZED_NAME_GESLACHTSAANDUIDING = "geslachtsaanduiding";
  @SerializedName(SERIALIZED_NAME_GESLACHTSAANDUIDING)
  private GeslachtEnum geslachtsaanduiding;

  public static final String SERIALIZED_NAME_OUDER_AANDUIDING = "ouderAanduiding";
  @SerializedName(SERIALIZED_NAME_OUDER_AANDUIDING)
  private OuderAanduidingEnum ouderAanduiding;

  public static final String SERIALIZED_NAME_DATUM_INGANG_FAMILIERECHTELIJKE_BETREKKING = "datumIngangFamilierechtelijkeBetrekking";
  @SerializedName(SERIALIZED_NAME_DATUM_INGANG_FAMILIERECHTELIJKE_BETREKKING)
  private DatumOnvolledig datumIngangFamilierechtelijkeBetrekking;

  public static final String SERIALIZED_NAME_NAAM = "naam";
  @SerializedName(SERIALIZED_NAME_NAAM)
  private Naam naam;

  public static final String SERIALIZED_NAME_IN_ONDERZOEK = "inOnderzoek";
  @SerializedName(SERIALIZED_NAME_IN_ONDERZOEK)
  private OuderInOnderzoek inOnderzoek;

  public static final String SERIALIZED_NAME_GEBOORTE = "geboorte";
  @SerializedName(SERIALIZED_NAME_GEBOORTE)
  private Geboorte geboorte = null;

  public static final String SERIALIZED_NAME_GEHEIMHOUDING_PERSOONSGEGEVENS = "geheimhoudingPersoonsgegevens";
  @SerializedName(SERIALIZED_NAME_GEHEIMHOUDING_PERSOONSGEGEVENS)
  private Boolean geheimhoudingPersoonsgegevens;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private OuderLinks links;


  public OuderHalBasis burgerservicenummer(String burgerservicenummer) {
    
    this.burgerservicenummer = burgerservicenummer;
    return this;
  }

   /**
   * Get burgerservicenummer
   * @return burgerservicenummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "555555021", value = "")

  public String getBurgerservicenummer() {
    return burgerservicenummer;
  }


  public void setBurgerservicenummer(String burgerservicenummer) {
    this.burgerservicenummer = burgerservicenummer;
  }


  public OuderHalBasis geslachtsaanduiding(GeslachtEnum geslachtsaanduiding) {
    
    this.geslachtsaanduiding = geslachtsaanduiding;
    return this;
  }

   /**
   * Get geslachtsaanduiding
   * @return geslachtsaanduiding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GeslachtEnum getGeslachtsaanduiding() {
    return geslachtsaanduiding;
  }


  public void setGeslachtsaanduiding(GeslachtEnum geslachtsaanduiding) {
    this.geslachtsaanduiding = geslachtsaanduiding;
  }


  public OuderHalBasis ouderAanduiding(OuderAanduidingEnum ouderAanduiding) {
    
    this.ouderAanduiding = ouderAanduiding;
    return this;
  }

   /**
   * Get ouderAanduiding
   * @return ouderAanduiding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OuderAanduidingEnum getOuderAanduiding() {
    return ouderAanduiding;
  }


  public void setOuderAanduiding(OuderAanduidingEnum ouderAanduiding) {
    this.ouderAanduiding = ouderAanduiding;
  }


  public OuderHalBasis datumIngangFamilierechtelijkeBetrekking(DatumOnvolledig datumIngangFamilierechtelijkeBetrekking) {
    
    this.datumIngangFamilierechtelijkeBetrekking = datumIngangFamilierechtelijkeBetrekking;
    return this;
  }

   /**
   * Get datumIngangFamilierechtelijkeBetrekking
   * @return datumIngangFamilierechtelijkeBetrekking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumIngangFamilierechtelijkeBetrekking() {
    return datumIngangFamilierechtelijkeBetrekking;
  }


  public void setDatumIngangFamilierechtelijkeBetrekking(DatumOnvolledig datumIngangFamilierechtelijkeBetrekking) {
    this.datumIngangFamilierechtelijkeBetrekking = datumIngangFamilierechtelijkeBetrekking;
  }


  public OuderHalBasis naam(Naam naam) {
    
    this.naam = naam;
    return this;
  }

   /**
   * Get naam
   * @return naam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Naam getNaam() {
    return naam;
  }


  public void setNaam(Naam naam) {
    this.naam = naam;
  }


  public OuderHalBasis inOnderzoek(OuderInOnderzoek inOnderzoek) {
    
    this.inOnderzoek = inOnderzoek;
    return this;
  }

   /**
   * Get inOnderzoek
   * @return inOnderzoek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OuderInOnderzoek getInOnderzoek() {
    return inOnderzoek;
  }


  public void setInOnderzoek(OuderInOnderzoek inOnderzoek) {
    this.inOnderzoek = inOnderzoek;
  }


  public OuderHalBasis geboorte(Geboorte geboorte) {
    
    this.geboorte = geboorte;
    return this;
  }

   /**
   * Get geboorte
   * @return geboorte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Geboorte getGeboorte() {
    return geboorte;
  }


  public void setGeboorte(Geboorte geboorte) {
    this.geboorte = geboorte;
  }


  public OuderHalBasis geheimhoudingPersoonsgegevens(Boolean geheimhoudingPersoonsgegevens) {
    
    this.geheimhoudingPersoonsgegevens = geheimhoudingPersoonsgegevens;
    return this;
  }

   /**
   * Gegevens mogen niet worden verstrekt aan derden / maarschappelijke instellingen. 
   * @return geheimhoudingPersoonsgegevens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gegevens mogen niet worden verstrekt aan derden / maarschappelijke instellingen. ")

  public Boolean getGeheimhoudingPersoonsgegevens() {
    return geheimhoudingPersoonsgegevens;
  }


  public void setGeheimhoudingPersoonsgegevens(Boolean geheimhoudingPersoonsgegevens) {
    this.geheimhoudingPersoonsgegevens = geheimhoudingPersoonsgegevens;
  }


  public OuderHalBasis links(OuderLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OuderLinks getLinks() {
    return links;
  }


  public void setLinks(OuderLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OuderHalBasis ouderHalBasis = (OuderHalBasis) o;
    return Objects.equals(this.burgerservicenummer, ouderHalBasis.burgerservicenummer) &&
        Objects.equals(this.geslachtsaanduiding, ouderHalBasis.geslachtsaanduiding) &&
        Objects.equals(this.ouderAanduiding, ouderHalBasis.ouderAanduiding) &&
        Objects.equals(this.datumIngangFamilierechtelijkeBetrekking, ouderHalBasis.datumIngangFamilierechtelijkeBetrekking) &&
        Objects.equals(this.naam, ouderHalBasis.naam) &&
        Objects.equals(this.inOnderzoek, ouderHalBasis.inOnderzoek) &&
        Objects.equals(this.geboorte, ouderHalBasis.geboorte) &&
        Objects.equals(this.geheimhoudingPersoonsgegevens, ouderHalBasis.geheimhoudingPersoonsgegevens) &&
        Objects.equals(this.links, ouderHalBasis.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(burgerservicenummer, geslachtsaanduiding, ouderAanduiding, datumIngangFamilierechtelijkeBetrekking, naam, inOnderzoek, geboorte, geheimhoudingPersoonsgegevens, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OuderHalBasis {\n");
    sb.append("    burgerservicenummer: ").append(toIndentedString(burgerservicenummer)).append("\n");
    sb.append("    geslachtsaanduiding: ").append(toIndentedString(geslachtsaanduiding)).append("\n");
    sb.append("    ouderAanduiding: ").append(toIndentedString(ouderAanduiding)).append("\n");
    sb.append("    datumIngangFamilierechtelijkeBetrekking: ").append(toIndentedString(datumIngangFamilierechtelijkeBetrekking)).append("\n");
    sb.append("    naam: ").append(toIndentedString(naam)).append("\n");
    sb.append("    inOnderzoek: ").append(toIndentedString(inOnderzoek)).append("\n");
    sb.append("    geboorte: ").append(toIndentedString(geboorte)).append("\n");
    sb.append("    geheimhoudingPersoonsgegevens: ").append(toIndentedString(geheimhoudingPersoonsgegevens)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

