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
 * &lt;body&gt;&lt;p&gt;Gegevens over het verblijf en adres van de ingeschreven persoon. Dit is het adres waarop een persoon is ingeschreven of ingeschreven is geweest.&lt;/p&gt;&lt;p&gt;  &lt;em&gt;*&lt;/em&gt; datumAanvangAdreshuishouding** : De datum van aangifte of ambtshalve melding van verblijf en adres.&lt;/p&gt;&lt;p&gt;  &lt;em&gt;*&lt;/em&gt; datumIngangGeldigheid** : Datum waarop de gegevens over de verblijfplaats geldig zijn geworden.&lt;/p&gt;&lt;p&gt;  &lt;em&gt;*&lt;/em&gt; datumInschrijvingInGemeente**: Bij inschrijving op grond van een aangifte door de burger van zijn vestiging in een (volgende) gemeente is dit de aangiftedatum. Bij inschrijving op grond van een geboorteakte is dit de geboortedatum. Bij ambtshalve inschrijving is dit de datum waarop de betrokkene schriftelijk van het voornemen van ambtshalve opneming mededeling is gedaan.&lt;/p&gt;&lt;p&gt;  &lt;em&gt;*&lt;/em&gt; datumVestigingInNederland** : Datum van inschrijving in Nederland&lt;/p&gt;&lt;p&gt;  &lt;em&gt;*&lt;/em&gt; landVanWaarIngeschreven** : Het land waar de ingeschreven persoon verblijf hield voor (her)vestiging in Nederland.&lt;/p&gt;&lt;p&gt;  &lt;em&gt;*&lt;/em&gt; gemeenteVanInschrijving** : Een aanduiding die aangeeft in welke gemeente de PK zich bevindt. De code kan voorloopnullen bevatten&lt;/p&gt;&lt;p&gt;  &lt;em&gt;*&lt;/em&gt; landVanWaarIngeschreven** : Het LAND waar de INGESCHREVEN PERSOON verblijf hield voor (her)vestiging in Nederland.&lt;/p&gt;&lt;/body&gt;
 */
@ApiModel(description = "<body><p>Gegevens over het verblijf en adres van de ingeschreven persoon. Dit is het adres waarop een persoon is ingeschreven of ingeschreven is geweest.</p><p>  <em>*</em> datumAanvangAdreshuishouding** : De datum van aangifte of ambtshalve melding van verblijf en adres.</p><p>  <em>*</em> datumIngangGeldigheid** : Datum waarop de gegevens over de verblijfplaats geldig zijn geworden.</p><p>  <em>*</em> datumInschrijvingInGemeente**: Bij inschrijving op grond van een aangifte door de burger van zijn vestiging in een (volgende) gemeente is dit de aangiftedatum. Bij inschrijving op grond van een geboorteakte is dit de geboortedatum. Bij ambtshalve inschrijving is dit de datum waarop de betrokkene schriftelijk van het voornemen van ambtshalve opneming mededeling is gedaan.</p><p>  <em>*</em> datumVestigingInNederland** : Datum van inschrijving in Nederland</p><p>  <em>*</em> landVanWaarIngeschreven** : Het land waar de ingeschreven persoon verblijf hield voor (her)vestiging in Nederland.</p><p>  <em>*</em> gemeenteVanInschrijving** : Een aanduiding die aangeeft in welke gemeente de PK zich bevindt. De code kan voorloopnullen bevatten</p><p>  <em>*</em> landVanWaarIngeschreven** : Het LAND waar de INGESCHREVEN PERSOON verblijf hield voor (her)vestiging in Nederland.</p></body>")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-22T11:55:38.455Z[Etc/UTC]")
public class VerblijfplaatshistorieAllOf {
  public static final String SERIALIZED_NAME_DATUM_TOT = "datumTot";
  @SerializedName(SERIALIZED_NAME_DATUM_TOT)
  private DatumOnvolledig datumTot = null;

  public static final String SERIALIZED_NAME_GEHEIMHOUDING_PERSOONSGEGEVENS = "geheimhoudingPersoonsgegevens";
  @SerializedName(SERIALIZED_NAME_GEHEIMHOUDING_PERSOONSGEGEVENS)
  private Boolean geheimhoudingPersoonsgegevens;


  public VerblijfplaatshistorieAllOf datumTot(DatumOnvolledig datumTot) {
    
    this.datumTot = datumTot;
    return this;
  }

   /**
   * Get datumTot
   * @return datumTot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumTot() {
    return datumTot;
  }


  public void setDatumTot(DatumOnvolledig datumTot) {
    this.datumTot = datumTot;
  }


  public VerblijfplaatshistorieAllOf geheimhoudingPersoonsgegevens(Boolean geheimhoudingPersoonsgegevens) {
    
    this.geheimhoudingPersoonsgegevens = geheimhoudingPersoonsgegevens;
    return this;
  }

   /**
   * Een aanduiding die aangeeft dat gegevens wel of niet verstrekt mogen worden. Indien true: op verzoek van deze persoon is het verstrekken van gegevens over deze persoon aan bepaalde derden niet toegestaan.
   * @return geheimhoudingPersoonsgegevens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Een aanduiding die aangeeft dat gegevens wel of niet verstrekt mogen worden. Indien true: op verzoek van deze persoon is het verstrekken van gegevens over deze persoon aan bepaalde derden niet toegestaan.")

  public Boolean getGeheimhoudingPersoonsgegevens() {
    return geheimhoudingPersoonsgegevens;
  }


  public void setGeheimhoudingPersoonsgegevens(Boolean geheimhoudingPersoonsgegevens) {
    this.geheimhoudingPersoonsgegevens = geheimhoudingPersoonsgegevens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerblijfplaatshistorieAllOf verblijfplaatshistorieAllOf = (VerblijfplaatshistorieAllOf) o;
    return Objects.equals(this.datumTot, verblijfplaatshistorieAllOf.datumTot) &&
        Objects.equals(this.geheimhoudingPersoonsgegevens, verblijfplaatshistorieAllOf.geheimhoudingPersoonsgegevens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datumTot, geheimhoudingPersoonsgegevens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerblijfplaatshistorieAllOf {\n");
    sb.append("    datumTot: ").append(toIndentedString(datumTot)).append("\n");
    sb.append("    geheimhoudingPersoonsgegevens: ").append(toIndentedString(geheimhoudingPersoonsgegevens)).append("\n");
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

