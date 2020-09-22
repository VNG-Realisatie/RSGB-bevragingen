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
import org.openapitools.client.model.GeboorteInOnderzoek;
import org.openapitools.client.model.Waardetabel;

/**
 * Gegevens over de geboorte van respectievelijk de persoon, de ouder, de echtgenoot/geregistreerd partner, de eerdere echtgenoot/geregistreerd partner of het kind.  * **datum** : Datum waarop de persoon is geboren.  * **land** : Land waar de persoon is geboren  * **plaats** : De plaats waar een persoon is geboren. Voor een plaats buiten Nederland is gemeentecode&#x3D;1999 (RNI) en gemeentenaam de buitenlandse plaatsnaam of aanduiding.
 */
@ApiModel(description = "Gegevens over de geboorte van respectievelijk de persoon, de ouder, de echtgenoot/geregistreerd partner, de eerdere echtgenoot/geregistreerd partner of het kind.  * **datum** : Datum waarop de persoon is geboren.  * **land** : Land waar de persoon is geboren  * **plaats** : De plaats waar een persoon is geboren. Voor een plaats buiten Nederland is gemeentecode=1999 (RNI) en gemeentenaam de buitenlandse plaatsnaam of aanduiding.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-22T11:55:38.455Z[Etc/UTC]")
public class GeboorteAllOf {
  public static final String SERIALIZED_NAME_LAND = "land";
  @SerializedName(SERIALIZED_NAME_LAND)
  private Waardetabel land;

  public static final String SERIALIZED_NAME_PLAATS = "plaats";
  @SerializedName(SERIALIZED_NAME_PLAATS)
  private Waardetabel plaats;

  public static final String SERIALIZED_NAME_IN_ONDERZOEK = "inOnderzoek";
  @SerializedName(SERIALIZED_NAME_IN_ONDERZOEK)
  private GeboorteInOnderzoek inOnderzoek;


  public GeboorteAllOf land(Waardetabel land) {
    
    this.land = land;
    return this;
  }

   /**
   * Get land
   * @return land
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardetabel getLand() {
    return land;
  }


  public void setLand(Waardetabel land) {
    this.land = land;
  }


  public GeboorteAllOf plaats(Waardetabel plaats) {
    
    this.plaats = plaats;
    return this;
  }

   /**
   * Get plaats
   * @return plaats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardetabel getPlaats() {
    return plaats;
  }


  public void setPlaats(Waardetabel plaats) {
    this.plaats = plaats;
  }


  public GeboorteAllOf inOnderzoek(GeboorteInOnderzoek inOnderzoek) {
    
    this.inOnderzoek = inOnderzoek;
    return this;
  }

   /**
   * Get inOnderzoek
   * @return inOnderzoek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GeboorteInOnderzoek getInOnderzoek() {
    return inOnderzoek;
  }


  public void setInOnderzoek(GeboorteInOnderzoek inOnderzoek) {
    this.inOnderzoek = inOnderzoek;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeboorteAllOf geboorteAllOf = (GeboorteAllOf) o;
    return Objects.equals(this.land, geboorteAllOf.land) &&
        Objects.equals(this.plaats, geboorteAllOf.plaats) &&
        Objects.equals(this.inOnderzoek, geboorteAllOf.inOnderzoek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(land, plaats, inOnderzoek);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeboorteAllOf {\n");
    sb.append("    land: ").append(toIndentedString(land)).append("\n");
    sb.append("    plaats: ").append(toIndentedString(plaats)).append("\n");
    sb.append("    inOnderzoek: ").append(toIndentedString(inOnderzoek)).append("\n");
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

