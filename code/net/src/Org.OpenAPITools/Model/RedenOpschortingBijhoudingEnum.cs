/* 
 * Bevragingen ingeschreven personen
 *
 * API voor het ontsluiten van gegevens van ingeschreven personen en aanverwante gegevens uit de GBA en RNI. Met deze API worden de actuele gegevens van ingeschreven personen, hun kinderen, partners en ouders ontsloten. <br> Heeft een persoon bijvoorbeeld geen geldige nationaliteit, dan wordt nationaliteit niet geretourneerd. <br> Heeft een persoon een beëindigd partnerschap of huwelijk, dan wordt de partner niet geretourneerd. <br> <br> Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Bevragingen-ingeschreven-personen/tree/master/features) voor nadere toelichting. <br> 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Redenen voor opschorting van de bijhouding.: * &#x60;overlijden&#x60; - O * &#x60;emigratie&#x60; - E * &#x60;ministerieel_besluit&#x60; - M * &#x60;pl_aangelegd_in_de_rni&#x60; - R * &#x60;fout&#x60; - F
    /// </summary>
    /// <value>Redenen voor opschorting van de bijhouding.: * &#x60;overlijden&#x60; - O * &#x60;emigratie&#x60; - E * &#x60;ministerieel_besluit&#x60; - M * &#x60;pl_aangelegd_in_de_rni&#x60; - R * &#x60;fout&#x60; - F</value>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum RedenOpschortingBijhoudingEnum
    {
        /// <summary>
        /// Enum Overlijden for value: overlijden
        /// </summary>
        [EnumMember(Value = "overlijden")]
        Overlijden = 1,

        /// <summary>
        /// Enum Emigratie for value: emigratie
        /// </summary>
        [EnumMember(Value = "emigratie")]
        Emigratie = 2,

        /// <summary>
        /// Enum Ministerieelbesluit for value: ministerieel_besluit
        /// </summary>
        [EnumMember(Value = "ministerieel_besluit")]
        Ministerieelbesluit = 3,

        /// <summary>
        /// Enum Plaangelegdinderni for value: pl_aangelegd_in_de_rni
        /// </summary>
        [EnumMember(Value = "pl_aangelegd_in_de_rni")]
        Plaangelegdinderni = 4,

        /// <summary>
        /// Enum Fout for value: fout
        /// </summary>
        [EnumMember(Value = "fout")]
        Fout = 5

    }

}