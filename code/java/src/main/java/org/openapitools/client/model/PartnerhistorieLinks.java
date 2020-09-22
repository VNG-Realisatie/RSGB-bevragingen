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
import org.openapitools.client.model.HalLink;

/**
 * PartnerhistorieLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-22T11:55:38.455Z[Etc/UTC]")
public class PartnerhistorieLinks {
  public static final String SERIALIZED_NAME_INGESCHREVEN_PERSOON = "ingeschrevenPersoon";
  @SerializedName(SERIALIZED_NAME_INGESCHREVEN_PERSOON)
  private HalLink ingeschrevenPersoon;


  public PartnerhistorieLinks ingeschrevenPersoon(HalLink ingeschrevenPersoon) {
    
    this.ingeschrevenPersoon = ingeschrevenPersoon;
    return this;
  }

   /**
   * Get ingeschrevenPersoon
   * @return ingeschrevenPersoon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HalLink getIngeschrevenPersoon() {
    return ingeschrevenPersoon;
  }


  public void setIngeschrevenPersoon(HalLink ingeschrevenPersoon) {
    this.ingeschrevenPersoon = ingeschrevenPersoon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerhistorieLinks partnerhistorieLinks = (PartnerhistorieLinks) o;
    return Objects.equals(this.ingeschrevenPersoon, partnerhistorieLinks.ingeschrevenPersoon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingeschrevenPersoon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerhistorieLinks {\n");
    sb.append("    ingeschrevenPersoon: ").append(toIndentedString(ingeschrevenPersoon)).append("\n");
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

