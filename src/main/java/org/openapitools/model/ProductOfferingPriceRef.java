package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProductPriceOffering reference. An amount, usually of money, that is asked for or allowed when a ProductOffering is bought, rented, or leased
 */

@Schema(name = "ProductOfferingPriceRef", description = "ProductPriceOffering reference. An amount, usually of money, that is asked for or allowed when a ProductOffering is bought, rented, or leased")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-16T16:55:02.035577+05:30[GMT+05:30]", comments = "Generator version: 7.7.0")
public class ProductOfferingPriceRef {

  private String id;

  private URI href;

  private String name;

  private String atBaseType;

  private URI atSchemaLocation;

  private String atType;

  private String atReferredType;

  public ProductOfferingPriceRef() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProductOfferingPriceRef(String id) {
    this.id = id;
  }

  public ProductOfferingPriceRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "unique identifier", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductOfferingPriceRef href(URI href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
   */
  @Valid 
  @Schema(name = "href", description = "Hyperlink reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public URI getHref() {
    return href;
  }

  public void setHref(URI href) {
    this.href = href;
  }

  public ProductOfferingPriceRef name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the related entity.
   * @return name
   */
  
  @Schema(name = "name", description = "Name of the related entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductOfferingPriceRef atBaseType(String atBaseType) {
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

  public ProductOfferingPriceRef atSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
   */
  @Valid 
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public URI getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public ProductOfferingPriceRef atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
   */
  
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public ProductOfferingPriceRef atReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return atReferredType
   */
  
  @Schema(name = "@referredType", description = "The actual type of the target instance when needed for disambiguation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@referredType")
  public String getAtReferredType() {
    return atReferredType;
  }

  public void setAtReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingPriceRef productOfferingPriceRef = (ProductOfferingPriceRef) o;
    return Objects.equals(this.id, productOfferingPriceRef.id) &&
        Objects.equals(this.href, productOfferingPriceRef.href) &&
        Objects.equals(this.name, productOfferingPriceRef.name) &&
        Objects.equals(this.atBaseType, productOfferingPriceRef.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productOfferingPriceRef.atSchemaLocation) &&
        Objects.equals(this.atType, productOfferingPriceRef.atType) &&
        Objects.equals(this.atReferredType, productOfferingPriceRef.atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, atBaseType, atSchemaLocation, atType, atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingPriceRef {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atReferredType: ").append(toIndentedString(atReferredType)).append("\n");
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

