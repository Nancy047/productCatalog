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
 * TaxDefinitionMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-08T19:14:52.617209500+05:30[Asia/Calcutta]", comments = "Generator version: 7.7.0")
public class TaxDefinitionMVO {

  private String atType;

  private String atBaseType;

  private String atSchemaLocation;

  private String id;

  private String name;

  private TimePeriod validFor;

  private String jurisdictionName;

  private String jurisdictionLevel;

  private String taxType;

  public TaxDefinitionMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaxDefinitionMVO(String atType) {
    this.atType = atType;
  }

  public TaxDefinitionMVO atType(String atType) {
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

  public TaxDefinitionMVO atBaseType(String atBaseType) {
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

  public TaxDefinitionMVO atSchemaLocation(String atSchemaLocation) {
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

  public TaxDefinitionMVO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the tax.
   * @return id
   */
  
  @Schema(name = "id", description = "Unique identifier of the tax.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TaxDefinitionMVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Tax name.
   * @return name
   */
  
  @Schema(name = "name", description = "Tax name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaxDefinitionMVO validFor(TimePeriod validFor) {
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

  public TaxDefinitionMVO jurisdictionName(String jurisdictionName) {
    this.jurisdictionName = jurisdictionName;
    return this;
  }

  /**
   * Name of the jurisdiction that levies the tax
   * @return jurisdictionName
   */
  
  @Schema(name = "jurisdictionName", example = "USA", description = "Name of the jurisdiction that levies the tax", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jurisdictionName")
  public String getJurisdictionName() {
    return jurisdictionName;
  }

  public void setJurisdictionName(String jurisdictionName) {
    this.jurisdictionName = jurisdictionName;
  }

  public TaxDefinitionMVO jurisdictionLevel(String jurisdictionLevel) {
    this.jurisdictionLevel = jurisdictionLevel;
    return this;
  }

  /**
   * Level of the jurisdiction that levies the tax
   * @return jurisdictionLevel
   */
  
  @Schema(name = "jurisdictionLevel", example = "Country", description = "Level of the jurisdiction that levies the tax", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jurisdictionLevel")
  public String getJurisdictionLevel() {
    return jurisdictionLevel;
  }

  public void setJurisdictionLevel(String jurisdictionLevel) {
    this.jurisdictionLevel = jurisdictionLevel;
  }

  public TaxDefinitionMVO taxType(String taxType) {
    this.taxType = taxType;
    return this;
  }

  /**
   * Type of the tax.
   * @return taxType
   */
  
  @Schema(name = "taxType", example = "VAT", description = "Type of the tax.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxType")
  public String getTaxType() {
    return taxType;
  }

  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxDefinitionMVO taxDefinitionMVO = (TaxDefinitionMVO) o;
    return Objects.equals(this.atType, taxDefinitionMVO.atType) &&
        Objects.equals(this.atBaseType, taxDefinitionMVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, taxDefinitionMVO.atSchemaLocation) &&
        Objects.equals(this.id, taxDefinitionMVO.id) &&
        Objects.equals(this.name, taxDefinitionMVO.name) &&
        Objects.equals(this.validFor, taxDefinitionMVO.validFor) &&
        Objects.equals(this.jurisdictionName, taxDefinitionMVO.jurisdictionName) &&
        Objects.equals(this.jurisdictionLevel, taxDefinitionMVO.jurisdictionLevel) &&
        Objects.equals(this.taxType, taxDefinitionMVO.taxType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, id, name, validFor, jurisdictionName, jurisdictionLevel, taxType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxDefinitionMVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    jurisdictionName: ").append(toIndentedString(jurisdictionName)).append("\n");
    sb.append("    jurisdictionLevel: ").append(toIndentedString(jurisdictionLevel)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
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

