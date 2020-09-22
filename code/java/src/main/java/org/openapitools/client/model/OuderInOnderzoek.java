/*
 * Bevragingen ingeschreven personen
 * API voor het ontsluiten van gegevens van ingeschreven personen en aanverwante gegevens uit de GBA en RNI. Met deze API worden de actuele gegevens van ingeschreven personen, hun kinderen, partners en ouders ontsloten. <br> Heeft een persoon bijvoorbeeld geen geldige nationaliteit, dan wordt nationaliteit niet geretourneerd. <br> Heeft een persoon een beëindigd partnerschap of huwelijk, dan wordt de partner niet geretourneerd. <br> <br> Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Bevragingen-ingeschreven-personen/tree/master/features) voor nadere toelichting. <br> 
 *
 * The version of the OpenAPI document: 1.0.0
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

/**
 * Indicators over het in onderzoek zijn van gegevens over de aangaan van het huwelijk van de INGESCHREVEN PERSOON. Zie de [functionele specificaties](https://github.com/VNG-Realisatie/Bevragingen-ingeschreven-personen/blob/master/features/in_onderzoek.feature)
 */
@ApiModel(description = "Indicators over het in onderzoek zijn van gegevens over de aangaan van het huwelijk van de INGESCHREVEN PERSOON. Zie de [functionele specificaties](https://github.com/VNG-Realisatie/Bevragingen-ingeschreven-personen/blob/master/features/in_onderzoek.feature)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-22T11:55:38.455Z[Etc/UTC]")
public class OuderInOnderzoek {
  public static final String SERIALIZED_NAME_BURGERSERVICENUMMER = "burgerservicenummer";
  @SerializedName(SERIALIZED_NAME_BURGERSERVICENUMMER)
  private Boolean burgerservicenummer;

  public static final String SERIALIZED_NAME_DATUM_INGANG_FAMILIERECHTELIJKE_BETREKKING = "datumIngangFamilierechtelijkeBetrekking";
  @SerializedName(SERIALIZED_NAME_DATUM_INGANG_FAMILIERECHTELIJKE_BETREKKING)
  private Boolean datumIngangFamilierechtelijkeBetrekking;

  public static final String SERIALIZED_NAME_GESLACHTSAANDUIDING = "geslachtsaanduiding";
  @SerializedName(SERIALIZED_NAME_GESLACHTSAANDUIDING)
  private Boolean geslachtsaanduiding;

  public static final String SERIALIZED_NAME_DATUM_INGANG_ONDERZOEK = "datumIngangOnderzoek";
  @SerializedName(SERIALIZED_NAME_DATUM_INGANG_ONDERZOEK)
  private DatumOnvolledig datumIngangOnderzoek;


  public OuderInOnderzoek burgerservicenummer(Boolean burgerservicenummer) {
    
    this.burgerservicenummer = burgerservicenummer;
    return this;
  }

   /**
   * Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is.
   * @return burgerservicenummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is.")

  public Boolean getBurgerservicenummer() {
    return burgerservicenummer;
  }


  public void setBurgerservicenummer(Boolean burgerservicenummer) {
    this.burgerservicenummer = burgerservicenummer;
  }


  public OuderInOnderzoek datumIngangFamilierechtelijkeBetrekking(Boolean datumIngangFamilierechtelijkeBetrekking) {
    
    this.datumIngangFamilierechtelijkeBetrekking = datumIngangFamilierechtelijkeBetrekking;
    return this;
  }

   /**
   * Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is.
   * @return datumIngangFamilierechtelijkeBetrekking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is.")

  public Boolean getDatumIngangFamilierechtelijkeBetrekking() {
    return datumIngangFamilierechtelijkeBetrekking;
  }


  public void setDatumIngangFamilierechtelijkeBetrekking(Boolean datumIngangFamilierechtelijkeBetrekking) {
    this.datumIngangFamilierechtelijkeBetrekking = datumIngangFamilierechtelijkeBetrekking;
  }


  public OuderInOnderzoek geslachtsaanduiding(Boolean geslachtsaanduiding) {
    
    this.geslachtsaanduiding = geslachtsaanduiding;
    return this;
  }

   /**
   * Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is.
   * @return geslachtsaanduiding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator die aangeeft of het corresponderende gegeven voor deze persoon in onderzoek is.")

  public Boolean getGeslachtsaanduiding() {
    return geslachtsaanduiding;
  }


  public void setGeslachtsaanduiding(Boolean geslachtsaanduiding) {
    this.geslachtsaanduiding = geslachtsaanduiding;
  }


  public OuderInOnderzoek datumIngangOnderzoek(DatumOnvolledig datumIngangOnderzoek) {
    
    this.datumIngangOnderzoek = datumIngangOnderzoek;
    return this;
  }

   /**
   * Get datumIngangOnderzoek
   * @return datumIngangOnderzoek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumIngangOnderzoek() {
    return datumIngangOnderzoek;
  }


  public void setDatumIngangOnderzoek(DatumOnvolledig datumIngangOnderzoek) {
    this.datumIngangOnderzoek = datumIngangOnderzoek;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OuderInOnderzoek ouderInOnderzoek = (OuderInOnderzoek) o;
    return Objects.equals(this.burgerservicenummer, ouderInOnderzoek.burgerservicenummer) &&
        Objects.equals(this.datumIngangFamilierechtelijkeBetrekking, ouderInOnderzoek.datumIngangFamilierechtelijkeBetrekking) &&
        Objects.equals(this.geslachtsaanduiding, ouderInOnderzoek.geslachtsaanduiding) &&
        Objects.equals(this.datumIngangOnderzoek, ouderInOnderzoek.datumIngangOnderzoek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(burgerservicenummer, datumIngangFamilierechtelijkeBetrekking, geslachtsaanduiding, datumIngangOnderzoek);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OuderInOnderzoek {\n");
    sb.append("    burgerservicenummer: ").append(toIndentedString(burgerservicenummer)).append("\n");
    sb.append("    datumIngangFamilierechtelijkeBetrekking: ").append(toIndentedString(datumIngangFamilierechtelijkeBetrekking)).append("\n");
    sb.append("    geslachtsaanduiding: ").append(toIndentedString(geslachtsaanduiding)).append("\n");
    sb.append("    datumIngangOnderzoek: ").append(toIndentedString(datumIngangOnderzoek)).append("\n");
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

