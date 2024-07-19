package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.TimePeriod;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PartyCreditProfileMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-08T19:14:52.617209500+05:30[Asia/Calcutta]", comments = "Generator version: 7.7.0")
public class PartyCreditProfileMVO {

  private String atType;

  private String atBaseType;

  private String atSchemaLocation;

  private String creditAgencyName;

  private String creditAgencyType;

  private String ratingReference;

  private Integer ratingScore;

  private TimePeriod validFor;

  public PartyCreditProfileMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PartyCreditProfileMVO(String atType) {
    this.atType = atType;
  }

  public PartyCreditProfileMVO atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
   */
  @NotNull 
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public PartyCreditProfileMVO atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
   */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public PartyCreditProfileMVO atSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
   */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public String getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public PartyCreditProfileMVO creditAgencyName(String creditAgencyName) {
    this.creditAgencyName = creditAgencyName;
    return this;
  }

  /**
   * Name of the credit agency giving the score
   * @return creditAgencyName
   */
  
  @Schema(name = "creditAgencyName", description = "Name of the credit agency giving the score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditAgencyName")
  public String getCreditAgencyName() {
    return creditAgencyName;
  }

  public void setCreditAgencyName(String creditAgencyName) {
    this.creditAgencyName = creditAgencyName;
  }

  public PartyCreditProfileMVO creditAgencyType(String creditAgencyType) {
    this.creditAgencyType = creditAgencyType;
    return this;
  }

  /**
   * Type of the credit agency giving the score
   * @return creditAgencyType
   */
  
  @Schema(name = "creditAgencyType", description = "Type of the credit agency giving the score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditAgencyType")
  public String getCreditAgencyType() {
    return creditAgencyType;
  }

  public void setCreditAgencyType(String creditAgencyType) {
    this.creditAgencyType = creditAgencyType;
  }

  public PartyCreditProfileMVO ratingReference(String ratingReference) {
    this.ratingReference = ratingReference;
    return this;
  }

  /**
   * Reference corresponding to the credit rating
   * @return ratingReference
   */
  
  @Schema(name = "ratingReference", description = "Reference corresponding to the credit rating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ratingReference")
  public String getRatingReference() {
    return ratingReference;
  }

  public void setRatingReference(String ratingReference) {
    this.ratingReference = ratingReference;
  }

  public PartyCreditProfileMVO ratingScore(Integer ratingScore) {
    this.ratingScore = ratingScore;
    return this;
  }

  /**
   * A measure of a party's creditworthiness calculated on the basis of a combination of factors such as their income and credit history
   * @return ratingScore
   */
  
  @Schema(name = "ratingScore", description = "A measure of a party's creditworthiness calculated on the basis of a combination of factors such as their income and credit history", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ratingScore")
  public Integer getRatingScore() {
    return ratingScore;
  }

  public void setRatingScore(Integer ratingScore) {
    this.ratingScore = ratingScore;
  }

  public PartyCreditProfileMVO validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
   */
  @Valid 
  @Schema(name = "validFor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validFor")
  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyCreditProfileMVO partyCreditProfileMVO = (PartyCreditProfileMVO) o;
    return Objects.equals(this.atType, partyCreditProfileMVO.atType) &&
        Objects.equals(this.atBaseType, partyCreditProfileMVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, partyCreditProfileMVO.atSchemaLocation) &&
        Objects.equals(this.creditAgencyName, partyCreditProfileMVO.creditAgencyName) &&
        Objects.equals(this.creditAgencyType, partyCreditProfileMVO.creditAgencyType) &&
        Objects.equals(this.ratingReference, partyCreditProfileMVO.ratingReference) &&
        Objects.equals(this.ratingScore, partyCreditProfileMVO.ratingScore) &&
        Objects.equals(this.validFor, partyCreditProfileMVO.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, creditAgencyName, creditAgencyType, ratingReference, ratingScore, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyCreditProfileMVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    creditAgencyName: ").append(toIndentedString(creditAgencyName)).append("\n");
    sb.append("    creditAgencyType: ").append(toIndentedString(creditAgencyType)).append("\n");
    sb.append("    ratingReference: ").append(toIndentedString(ratingReference)).append("\n");
    sb.append("    ratingScore: ").append(toIndentedString(ratingScore)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

