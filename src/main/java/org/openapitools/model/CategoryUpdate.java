package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CategoryRef;
import org.openapitools.model.ProductOfferingRef;
import org.openapitools.model.TimePeriod;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates. Skipped properties: id,href,lastUpdate,@type,@baseType
 */

@Schema(name = "Category_Update", description = "The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates. Skipped properties: id,href,lastUpdate,@type,@baseType")
@JsonTypeName("Category_Update")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-16T16:55:02.035577+05:30[GMT+05:30]", comments = "Generator version: 7.7.0")
public class CategoryUpdate {

  private String description;

  private Boolean isRoot;

  private String lifecycleStatus;

  private String name;

  private String parentId;

  private String version;

  @Valid
  private List<@Valid ProductOfferingRef> productOffering = new ArrayList<>();

  @Valid
  private List<@Valid CategoryRef> subCategory = new ArrayList<>();

  private TimePeriod validFor;

  private URI atSchemaLocation;

  public CategoryUpdate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the category
   * @return description
   */
  
  @Schema(name = "description", description = "Description of the category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CategoryUpdate isRoot(Boolean isRoot) {
    this.isRoot = isRoot;
    return this;
  }

  /**
   * If true, this Boolean indicates that the category is a root of categories
   * @return isRoot
   */
  
  @Schema(name = "isRoot", description = "If true, this Boolean indicates that the category is a root of categories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isRoot")
  public Boolean getIsRoot() {
    return isRoot;
  }

  public void setIsRoot(Boolean isRoot) {
    this.isRoot = isRoot;
  }

  public CategoryUpdate lifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  /**
   * Used to indicate the current lifecycle status
   * @return lifecycleStatus
   */
  
  @Schema(name = "lifecycleStatus", description = "Used to indicate the current lifecycle status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifecycleStatus")
  public String getLifecycleStatus() {
    return lifecycleStatus;
  }

  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  public CategoryUpdate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the category
   * @return name
   */
  
  @Schema(name = "name", description = "Name of the category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CategoryUpdate parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Unique identifier of the parent category
   * @return parentId
   */
  
  @Schema(name = "parentId", description = "Unique identifier of the parent category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentId")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public CategoryUpdate version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Category version
   * @return version
   */
  
  @Schema(name = "version", description = "Category version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public CategoryUpdate productOffering(List<@Valid ProductOfferingRef> productOffering) {
    this.productOffering = productOffering;
    return this;
  }

  public CategoryUpdate addProductOfferingItem(ProductOfferingRef productOfferingItem) {
    if (this.productOffering == null) {
      this.productOffering = new ArrayList<>();
    }
    this.productOffering.add(productOfferingItem);
    return this;
  }

  /**
   * A product offering represents entities that are orderable from the provider of the catalog, this resource includes pricing information.
   * @return productOffering
   */
  @Valid 
  @Schema(name = "productOffering", description = "A product offering represents entities that are orderable from the provider of the catalog, this resource includes pricing information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productOffering")
  public List<@Valid ProductOfferingRef> getProductOffering() {
    return productOffering;
  }

  public void setProductOffering(List<@Valid ProductOfferingRef> productOffering) {
    this.productOffering = productOffering;
  }

  public CategoryUpdate subCategory(List<@Valid CategoryRef> subCategory) {
    this.subCategory = subCategory;
    return this;
  }

  public CategoryUpdate addSubCategoryItem(CategoryRef subCategoryItem) {
    if (this.subCategory == null) {
      this.subCategory = new ArrayList<>();
    }
    this.subCategory.add(subCategoryItem);
    return this;
  }

  /**
   * The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other (sub-)categories and/or product offerings.
   * @return subCategory
   */
  @Valid 
  @Schema(name = "subCategory", description = "The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other (sub-)categories and/or product offerings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subCategory")
  public List<@Valid CategoryRef> getSubCategory() {
    return subCategory;
  }

  public void setSubCategory(List<@Valid CategoryRef> subCategory) {
    this.subCategory = subCategory;
  }

  public CategoryUpdate validFor(TimePeriod validFor) {
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

  public CategoryUpdate atSchemaLocation(URI atSchemaLocation) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryUpdate categoryUpdate = (CategoryUpdate) o;
    return Objects.equals(this.description, categoryUpdate.description) &&
        Objects.equals(this.isRoot, categoryUpdate.isRoot) &&
        Objects.equals(this.lifecycleStatus, categoryUpdate.lifecycleStatus) &&
        Objects.equals(this.name, categoryUpdate.name) &&
        Objects.equals(this.parentId, categoryUpdate.parentId) &&
        Objects.equals(this.version, categoryUpdate.version) &&
        Objects.equals(this.productOffering, categoryUpdate.productOffering) &&
        Objects.equals(this.subCategory, categoryUpdate.subCategory) &&
        Objects.equals(this.validFor, categoryUpdate.validFor) &&
        Objects.equals(this.atSchemaLocation, categoryUpdate.atSchemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isRoot, lifecycleStatus, name, parentId, version, productOffering, subCategory, validFor, atSchemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryUpdate {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isRoot: ").append(toIndentedString(isRoot)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
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

