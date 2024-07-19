package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The reference object to the schema and type of target product which is described by product specification
 */

@Schema(name = "TargetProductSchema", description = "The reference object to the schema and type of target product which is described by product specification")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-09T13:05:26.782760900+05:30[GMT+05:30]", comments = "Generator version: 7.7.0")
public class TargetProductSchema {

  private String atBaseType;

  private String atSchemaLocation;

  private String atType;

  public TargetProductSchema() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TargetProductSchema(String atSchemaLocation, String atType) {
    this.atSchemaLocation = atSchemaLocation;
    this.atType = atType;
  }

  public TargetProductSchema atBaseType(String atBaseType) {
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

  public TargetProductSchema atSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * This field provides a link to the schema describing the target product
   * @return atSchemaLocation
   */
  @NotNull 
  @Schema(name = "@schemaLocation", description = "This field provides a link to the schema describing the target product", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@schemaLocation")
  public String getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public TargetProductSchema atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Class type of the target product
   * @return atType
   */
  @NotNull 
  @Schema(name = "@type", description = "Class type of the target product", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetProductSchema targetProductSchema = (TargetProductSchema) o;
    return Objects.equals(this.atBaseType, targetProductSchema.atBaseType) &&
        Objects.equals(this.atSchemaLocation, targetProductSchema.atSchemaLocation) &&
        Objects.equals(this.atType, targetProductSchema.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetProductSchema {\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
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

