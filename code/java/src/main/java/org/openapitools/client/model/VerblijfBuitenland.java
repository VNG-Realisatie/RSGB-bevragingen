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
import org.openapitools.client.model.Waardetabel;

/**
 * De gegevens over het verblijf in het buitenland
 */
@ApiModel(description = "De gegevens over het verblijf in het buitenland")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-22T11:55:38.455Z[Etc/UTC]")
public class VerblijfBuitenland {
  public static final String SERIALIZED_NAME_ADRES_REGEL1 = "adresRegel1";
  @SerializedName(SERIALIZED_NAME_ADRES_REGEL1)
  private String adresRegel1;

  public static final String SERIALIZED_NAME_ADRES_REGEL2 = "adresRegel2";
  @SerializedName(SERIALIZED_NAME_ADRES_REGEL2)
  private String adresRegel2;

  public static final String SERIALIZED_NAME_ADRES_REGEL3 = "adresRegel3";
  @SerializedName(SERIALIZED_NAME_ADRES_REGEL3)
  private String adresRegel3;

  public static final String SERIALIZED_NAME_VERTROKKEN_ONBEKEND_WAARHEEN = "vertrokkenOnbekendWaarheen";
  @SerializedName(SERIALIZED_NAME_VERTROKKEN_ONBEKEND_WAARHEEN)
  private Boolean vertrokkenOnbekendWaarheen;

  public static final String SERIALIZED_NAME_LAND = "land";
  @SerializedName(SERIALIZED_NAME_LAND)
  private Waardetabel land;


  public VerblijfBuitenland adresRegel1(String adresRegel1) {
    
    this.adresRegel1 = adresRegel1;
    return this;
  }

   /**
   * Het eerste deel van het adres in het buitenland dat de ingeschreven persoon opgeeft bij vertrek naar het buitenland dan wel waar de ingeschreven persoon in het buitenland verblijft.
   * @return adresRegel1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Het eerste deel van het adres in het buitenland dat de ingeschreven persoon opgeeft bij vertrek naar het buitenland dan wel waar de ingeschreven persoon in het buitenland verblijft.")

  public String getAdresRegel1() {
    return adresRegel1;
  }


  public void setAdresRegel1(String adresRegel1) {
    this.adresRegel1 = adresRegel1;
  }


  public VerblijfBuitenland adresRegel2(String adresRegel2) {
    
    this.adresRegel2 = adresRegel2;
    return this;
  }

   /**
   * Het tweede deel van het adres in het buitenland dat de ingeschreven persoon opgeeft bij vertrek naar het buitenland dan wel waar de ingeschreven persoon in het buitenland verblijft.
   * @return adresRegel2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Het tweede deel van het adres in het buitenland dat de ingeschreven persoon opgeeft bij vertrek naar het buitenland dan wel waar de ingeschreven persoon in het buitenland verblijft.")

  public String getAdresRegel2() {
    return adresRegel2;
  }


  public void setAdresRegel2(String adresRegel2) {
    this.adresRegel2 = adresRegel2;
  }


  public VerblijfBuitenland adresRegel3(String adresRegel3) {
    
    this.adresRegel3 = adresRegel3;
    return this;
  }

   /**
   * Het derde deel van het adres in het buitenland dat de ingeschreven persoon opgeeft bij vertrek naar het buitenland dan wel waar de ingeschreven persoon in het buitenland verblijft.
   * @return adresRegel3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Het derde deel van het adres in het buitenland dat de ingeschreven persoon opgeeft bij vertrek naar het buitenland dan wel waar de ingeschreven persoon in het buitenland verblijft.")

  public String getAdresRegel3() {
    return adresRegel3;
  }


  public void setAdresRegel3(String adresRegel3) {
    this.adresRegel3 = adresRegel3;
  }


  public VerblijfBuitenland vertrokkenOnbekendWaarheen(Boolean vertrokkenOnbekendWaarheen) {
    
    this.vertrokkenOnbekendWaarheen = vertrokkenOnbekendWaarheen;
    return this;
  }

   /**
   * Indicatie dat de ingeschreven persoon is vertrokken naar het buitenland, maar dat niet bekend is waar naar toe.
   * @return vertrokkenOnbekendWaarheen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicatie dat de ingeschreven persoon is vertrokken naar het buitenland, maar dat niet bekend is waar naar toe.")

  public Boolean getVertrokkenOnbekendWaarheen() {
    return vertrokkenOnbekendWaarheen;
  }


  public void setVertrokkenOnbekendWaarheen(Boolean vertrokkenOnbekendWaarheen) {
    this.vertrokkenOnbekendWaarheen = vertrokkenOnbekendWaarheen;
  }


  public VerblijfBuitenland land(Waardetabel land) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerblijfBuitenland verblijfBuitenland = (VerblijfBuitenland) o;
    return Objects.equals(this.adresRegel1, verblijfBuitenland.adresRegel1) &&
        Objects.equals(this.adresRegel2, verblijfBuitenland.adresRegel2) &&
        Objects.equals(this.adresRegel3, verblijfBuitenland.adresRegel3) &&
        Objects.equals(this.vertrokkenOnbekendWaarheen, verblijfBuitenland.vertrokkenOnbekendWaarheen) &&
        Objects.equals(this.land, verblijfBuitenland.land);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adresRegel1, adresRegel2, adresRegel3, vertrokkenOnbekendWaarheen, land);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerblijfBuitenland {\n");
    sb.append("    adresRegel1: ").append(toIndentedString(adresRegel1)).append("\n");
    sb.append("    adresRegel2: ").append(toIndentedString(adresRegel2)).append("\n");
    sb.append("    adresRegel3: ").append(toIndentedString(adresRegel3)).append("\n");
    sb.append("    vertrokkenOnbekendWaarheen: ").append(toIndentedString(vertrokkenOnbekendWaarheen)).append("\n");
    sb.append("    land: ").append(toIndentedString(land)).append("\n");
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

