package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ContactMediumMVO;
import org.openapitools.model.GeographicAddressRefMVO;
import org.openapitools.model.TimePeriod;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GeographicAddressContactMediumMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-08T19:14:52.617209500+05:30[Asia/Calcutta]", comments = "Generator version: 7.7.0")
public class GeographicAddressContactMediumMVO extends ContactMediumMVO {

  private String city;

  private String country;

  private String postCode;

  private String stateOrProvince;

  private String street1;

  private String street2;

  private GeographicAddressRefMVO geographicAddress;

  public GeographicAddressContactMediumMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeographicAddressContactMediumMVO(String atType) {
    super(atType);
  }

  public GeographicAddressContactMediumMVO city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The city
   * @return city
   */
  
  @Schema(name = "city", description = "The city", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public GeographicAddressContactMediumMVO country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The country
   * @return country
   */
  
  @Schema(name = "country", description = "The country", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public GeographicAddressContactMediumMVO postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Postcode
   * @return postCode
   */
  
  @Schema(name = "postCode", description = "Postcode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postCode")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public GeographicAddressContactMediumMVO stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

  /**
   * State or province
   * @return stateOrProvince
   */
  
  @Schema(name = "stateOrProvince", description = "State or province", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateOrProvince")
  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public GeographicAddressContactMediumMVO street1(String street1) {
    this.street1 = street1;
    return this;
  }

  /**
   * Describes the street
   * @return street1
   */
  
  @Schema(name = "street1", description = "Describes the street", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("street1")
  public String getStreet1() {
    return street1;
  }

  public void setStreet1(String street1) {
    this.street1 = street1;
  }

  public GeographicAddressContactMediumMVO street2(String street2) {
    this.street2 = street2;
    return this;
  }

  /**
   * Complementary street description
   * @return street2
   */
  
  @Schema(name = "street2", description = "Complementary street description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("street2")
  public String getStreet2() {
    return street2;
  }

  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  public GeographicAddressContactMediumMVO geographicAddress(GeographicAddressRefMVO geographicAddress) {
    this.geographicAddress = geographicAddress;
    return this;
  }

  /**
   * Get geographicAddress
   * @return geographicAddress
   */
  @Valid 
  @Schema(name = "geographicAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("geographicAddress")
  public GeographicAddressRefMVO getGeographicAddress() {
    return geographicAddress;
  }

  public void setGeographicAddress(GeographicAddressRefMVO geographicAddress) {
    this.geographicAddress = geographicAddress;
  }


  public GeographicAddressContactMediumMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public GeographicAddressContactMediumMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public GeographicAddressContactMediumMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public GeographicAddressContactMediumMVO id(String id) {
    super.id(id);
    return this;
  }

  public GeographicAddressContactMediumMVO preferred(Boolean preferred) {
    super.preferred(preferred);
    return this;
  }

  public GeographicAddressContactMediumMVO contactType(String contactType) {
    super.contactType(contactType);
    return this;
  }

  public GeographicAddressContactMediumMVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicAddressContactMediumMVO geographicAddressContactMediumMVO = (GeographicAddressContactMediumMVO) o;
    return Objects.equals(this.city, geographicAddressContactMediumMVO.city) &&
        Objects.equals(this.country, geographicAddressContactMediumMVO.country) &&
        Objects.equals(this.postCode, geographicAddressContactMediumMVO.postCode) &&
        Objects.equals(this.stateOrProvince, geographicAddressContactMediumMVO.stateOrProvince) &&
        Objects.equals(this.street1, geographicAddressContactMediumMVO.street1) &&
        Objects.equals(this.street2, geographicAddressContactMediumMVO.street2) &&
        Objects.equals(this.geographicAddress, geographicAddressContactMediumMVO.geographicAddress) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, postCode, stateOrProvince, street1, street2, geographicAddress, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicAddressContactMediumMVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    geographicAddress: ").append(toIndentedString(geographicAddress)).append("\n");
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

