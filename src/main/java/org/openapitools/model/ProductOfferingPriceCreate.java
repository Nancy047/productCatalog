package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BundledProductOfferingPriceRelationship;
import org.openapitools.model.ConstraintRef;
import org.openapitools.model.Money;
import org.openapitools.model.PlaceRef;
import org.openapitools.model.PricingLogicAlgorithm;
import org.openapitools.model.ProductOfferingPriceRelationship;
import org.openapitools.model.ProductOfferingTerm;
import org.openapitools.model.ProductSpecificationCharacteristicValueUse;
import org.openapitools.model.Quantity;
import org.openapitools.model.TaxItem;
import org.openapitools.model.TimePeriod;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Is based on both the basic cost to develop and produce products and the enterprises policy on revenue targets. This price may be further revised through discounting (a Product Offering Price that reflects an alteration). The price, applied for a productOffering may also be influenced by the productOfferingTerm, the customer selected, eg: a productOffering can be offered with multiple terms, like commitment periods for the contract. The price may be influenced by this productOfferingTerm. A productOffering may be cheaper with a 24 month commitment than with a 12 month commitment. Skipped properties: id,href
 */

@Schema(name = "ProductOfferingPrice_Create", description = "Is based on both the basic cost to develop and produce products and the enterprises policy on revenue targets. This price may be further revised through discounting (a Product Offering Price that reflects an alteration). The price, applied for a productOffering may also be influenced by the productOfferingTerm, the customer selected, eg: a productOffering can be offered with multiple terms, like commitment periods for the contract. The price may be influenced by this productOfferingTerm. A productOffering may be cheaper with a 24 month commitment than with a 12 month commitment. Skipped properties: id,href")
@JsonTypeName("ProductOfferingPrice_Create")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-16T16:55:02.035577+05:30[GMT+05:30]", comments = "Generator version: 7.7.0")
public class ProductOfferingPriceCreate {

  private String description;

  private Boolean isBundle;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastUpdate;

  private String lifecycleStatus;

  private String name;

  private Float percentage;

  private String priceType;

  private Integer recurringChargePeriodLength;

  private String recurringChargePeriodType;

  private String version;

  @Valid
  private List<@Valid BundledProductOfferingPriceRelationship> bundledPopRelationship = new ArrayList<>();

  @Valid
  private List<@Valid ConstraintRef> constraint = new ArrayList<>();

  @Valid
  private List<@Valid PlaceRef> place = new ArrayList<>();

  @Valid
  private List<@Valid ProductOfferingPriceRelationship> popRelationship = new ArrayList<>();

  private Money price;

  @Valid
  private List<@Valid PricingLogicAlgorithm> pricingLogicAlgorithm = new ArrayList<>();

  @Valid
  private List<@Valid ProductSpecificationCharacteristicValueUse> prodSpecCharValueUse = new ArrayList<>();

  @Valid
  private List<@Valid ProductOfferingTerm> productOfferingTerm = new ArrayList<>();

  @Valid
  private List<@Valid TaxItem> tax = new ArrayList<>();

  private Quantity unitOfMeasure;

  private TimePeriod validFor;

  private String atBaseType;

  private String atSchemaLocation;

  private String atType;

  public ProductOfferingPriceCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProductOfferingPriceCreate(String name) {
    this.name = name;
  }

  public ProductOfferingPriceCreate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the productOfferingPrice
   * @return description
   */
  
  @Schema(name = "description", description = "Description of the productOfferingPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductOfferingPriceCreate isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * A flag indicating if this ProductOfferingPrice is composite (bundle) or not
   * @return isBundle
   */
  
  @Schema(name = "isBundle", description = "A flag indicating if this ProductOfferingPrice is composite (bundle) or not", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isBundle")
  public Boolean getIsBundle() {
    return isBundle;
  }

  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public ProductOfferingPriceCreate lastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * the last update time of this ProductOfferingPrice
   * @return lastUpdate
   */
  @Valid 
  @Schema(name = "lastUpdate", description = "the last update time of this ProductOfferingPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdate")
  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public ProductOfferingPriceCreate lifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  /**
   * the lifecycle status of this ProductOfferingPrice
   * @return lifecycleStatus
   */
  
  @Schema(name = "lifecycleStatus", description = "the lifecycle status of this ProductOfferingPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifecycleStatus")
  public String getLifecycleStatus() {
    return lifecycleStatus;
  }

  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  public ProductOfferingPriceCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the productOfferingPrice
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "Name of the productOfferingPrice", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductOfferingPriceCreate percentage(Float percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Percentage to apply if this Product Offering Price is an Alteration (such as a Discount)
   * @return percentage
   */
  
  @Schema(name = "percentage", description = "Percentage to apply if this Product Offering Price is an Alteration (such as a Discount)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("percentage")
  public Float getPercentage() {
    return percentage;
  }

  public void setPercentage(Float percentage) {
    this.percentage = percentage;
  }

  public ProductOfferingPriceCreate priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

  /**
   * A category that describes the price, such as recurring, discount, allowance, penalty, and so forth.
   * @return priceType
   */
  
  @Schema(name = "priceType", description = "A category that describes the price, such as recurring, discount, allowance, penalty, and so forth.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priceType")
  public String getPriceType() {
    return priceType;
  }

  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  public ProductOfferingPriceCreate recurringChargePeriodLength(Integer recurringChargePeriodLength) {
    this.recurringChargePeriodLength = recurringChargePeriodLength;
    return this;
  }

  /**
   * the period of the recurring charge:  1, 2, ... .It sets to zero if it is not applicable
   * @return recurringChargePeriodLength
   */
  
  @Schema(name = "recurringChargePeriodLength", description = "the period of the recurring charge:  1, 2, ... .It sets to zero if it is not applicable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recurringChargePeriodLength")
  public Integer getRecurringChargePeriodLength() {
    return recurringChargePeriodLength;
  }

  public void setRecurringChargePeriodLength(Integer recurringChargePeriodLength) {
    this.recurringChargePeriodLength = recurringChargePeriodLength;
  }

  public ProductOfferingPriceCreate recurringChargePeriodType(String recurringChargePeriodType) {
    this.recurringChargePeriodType = recurringChargePeriodType;
    return this;
  }

  /**
   * The period to repeat the application of the price Could be month, week...
   * @return recurringChargePeriodType
   */
  
  @Schema(name = "recurringChargePeriodType", description = "The period to repeat the application of the price Could be month, week...", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recurringChargePeriodType")
  public String getRecurringChargePeriodType() {
    return recurringChargePeriodType;
  }

  public void setRecurringChargePeriodType(String recurringChargePeriodType) {
    this.recurringChargePeriodType = recurringChargePeriodType;
  }

  public ProductOfferingPriceCreate version(String version) {
    this.version = version;
    return this;
  }

  /**
   * ProductOfferingPrice version
   * @return version
   */
  
  @Schema(name = "version", description = "ProductOfferingPrice version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ProductOfferingPriceCreate bundledPopRelationship(List<@Valid BundledProductOfferingPriceRelationship> bundledPopRelationship) {
    this.bundledPopRelationship = bundledPopRelationship;
    return this;
  }

  public ProductOfferingPriceCreate addBundledPopRelationshipItem(BundledProductOfferingPriceRelationship bundledPopRelationshipItem) {
    if (this.bundledPopRelationship == null) {
      this.bundledPopRelationship = new ArrayList<>();
    }
    this.bundledPopRelationship.add(bundledPopRelationshipItem);
    return this;
  }

  /**
   * this object represents a bundle relationship from a bundle product offering price (parent) to a simple product offering price (child). A simple product offering price may participate in more than one bundle relationship.
   * @return bundledPopRelationship
   */
  @Valid 
  @Schema(name = "bundledPopRelationship", description = "this object represents a bundle relationship from a bundle product offering price (parent) to a simple product offering price (child). A simple product offering price may participate in more than one bundle relationship.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bundledPopRelationship")
  public List<@Valid BundledProductOfferingPriceRelationship> getBundledPopRelationship() {
    return bundledPopRelationship;
  }

  public void setBundledPopRelationship(List<@Valid BundledProductOfferingPriceRelationship> bundledPopRelationship) {
    this.bundledPopRelationship = bundledPopRelationship;
  }

  public ProductOfferingPriceCreate constraint(List<@Valid ConstraintRef> constraint) {
    this.constraint = constraint;
    return this;
  }

  public ProductOfferingPriceCreate addConstraintItem(ConstraintRef constraintItem) {
    if (this.constraint == null) {
      this.constraint = new ArrayList<>();
    }
    this.constraint.add(constraintItem);
    return this;
  }

  /**
   * The Constraint resource represents a policy/rule applied to ProductOfferingPrice.
   * @return constraint
   */
  @Valid 
  @Schema(name = "constraint", description = "The Constraint resource represents a policy/rule applied to ProductOfferingPrice.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("constraint")
  public List<@Valid ConstraintRef> getConstraint() {
    return constraint;
  }

  public void setConstraint(List<@Valid ConstraintRef> constraint) {
    this.constraint = constraint;
  }

  public ProductOfferingPriceCreate place(List<@Valid PlaceRef> place) {
    this.place = place;
    return this;
  }

  public ProductOfferingPriceCreate addPlaceItem(PlaceRef placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<>();
    }
    this.place.add(placeItem);
    return this;
  }

  /**
   * Place defines the places where the products are sold or delivered.
   * @return place
   */
  @Valid 
  @Schema(name = "place", description = "Place defines the places where the products are sold or delivered.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("place")
  public List<@Valid PlaceRef> getPlace() {
    return place;
  }

  public void setPlace(List<@Valid PlaceRef> place) {
    this.place = place;
  }

  public ProductOfferingPriceCreate popRelationship(List<@Valid ProductOfferingPriceRelationship> popRelationship) {
    this.popRelationship = popRelationship;
    return this;
  }

  public ProductOfferingPriceCreate addPopRelationshipItem(ProductOfferingPriceRelationship popRelationshipItem) {
    if (this.popRelationship == null) {
      this.popRelationship = new ArrayList<>();
    }
    this.popRelationship.add(popRelationshipItem);
    return this;
  }

  /**
   * Product Offering Prices related to this Product Offering Price, for example a price alteration such as allowance or discount
   * @return popRelationship
   */
  @Valid 
  @Schema(name = "popRelationship", description = "Product Offering Prices related to this Product Offering Price, for example a price alteration such as allowance or discount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("popRelationship")
  public List<@Valid ProductOfferingPriceRelationship> getPopRelationship() {
    return popRelationship;
  }

  public void setPopRelationship(List<@Valid ProductOfferingPriceRelationship> popRelationship) {
    this.popRelationship = popRelationship;
  }

  public ProductOfferingPriceCreate price(Money price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  @Valid 
  @Schema(name = "price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public Money getPrice() {
    return price;
  }

  public void setPrice(Money price) {
    this.price = price;
  }

  public ProductOfferingPriceCreate pricingLogicAlgorithm(List<@Valid PricingLogicAlgorithm> pricingLogicAlgorithm) {
    this.pricingLogicAlgorithm = pricingLogicAlgorithm;
    return this;
  }

  public ProductOfferingPriceCreate addPricingLogicAlgorithmItem(PricingLogicAlgorithm pricingLogicAlgorithmItem) {
    if (this.pricingLogicAlgorithm == null) {
      this.pricingLogicAlgorithm = new ArrayList<>();
    }
    this.pricingLogicAlgorithm.add(pricingLogicAlgorithmItem);
    return this;
  }

  /**
   * The PricingLogicAlgorithm entity represents an instantiation of an interface specification to external rating function (without a modeled behavior in SID). Some of the parameters of the interface definition may be already set (such as price per unit) and some may be gathered during the rating process from the event (such as call duration) or from ProductCharacteristicValues (such as assigned bandwidth).
   * @return pricingLogicAlgorithm
   */
  @Valid 
  @Schema(name = "pricingLogicAlgorithm", description = "The PricingLogicAlgorithm entity represents an instantiation of an interface specification to external rating function (without a modeled behavior in SID). Some of the parameters of the interface definition may be already set (such as price per unit) and some may be gathered during the rating process from the event (such as call duration) or from ProductCharacteristicValues (such as assigned bandwidth).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pricingLogicAlgorithm")
  public List<@Valid PricingLogicAlgorithm> getPricingLogicAlgorithm() {
    return pricingLogicAlgorithm;
  }

  public void setPricingLogicAlgorithm(List<@Valid PricingLogicAlgorithm> pricingLogicAlgorithm) {
    this.pricingLogicAlgorithm = pricingLogicAlgorithm;
  }

  public ProductOfferingPriceCreate prodSpecCharValueUse(List<@Valid ProductSpecificationCharacteristicValueUse> prodSpecCharValueUse) {
    this.prodSpecCharValueUse = prodSpecCharValueUse;
    return this;
  }

  public ProductOfferingPriceCreate addProdSpecCharValueUseItem(ProductSpecificationCharacteristicValueUse prodSpecCharValueUseItem) {
    if (this.prodSpecCharValueUse == null) {
      this.prodSpecCharValueUse = new ArrayList<>();
    }
    this.prodSpecCharValueUse.add(prodSpecCharValueUseItem);
    return this;
  }

  /**
   * A use of the ProductSpecificationCharacteristicValue by a ProductOfferingPrice to which additional properties (attributes) apply or override the properties of similar properties contained in ProductSpecificationCharacteristicValue. It should be noted that characteristics which their value(s) addressed by this object must exist in corresponding product specification. The available characteristic values for a ProductSpecificationCharacteristic in a Product specification can be modified at the ProductOffering and ProcuctOfferingPrice level. The list of values in ProductSpecificationCharacteristicValueUse is a strict subset of the list of values as defined in the corresponding product specification characteristics.
   * @return prodSpecCharValueUse
   */
  @Valid 
  @Schema(name = "prodSpecCharValueUse", description = "A use of the ProductSpecificationCharacteristicValue by a ProductOfferingPrice to which additional properties (attributes) apply or override the properties of similar properties contained in ProductSpecificationCharacteristicValue. It should be noted that characteristics which their value(s) addressed by this object must exist in corresponding product specification. The available characteristic values for a ProductSpecificationCharacteristic in a Product specification can be modified at the ProductOffering and ProcuctOfferingPrice level. The list of values in ProductSpecificationCharacteristicValueUse is a strict subset of the list of values as defined in the corresponding product specification characteristics.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prodSpecCharValueUse")
  public List<@Valid ProductSpecificationCharacteristicValueUse> getProdSpecCharValueUse() {
    return prodSpecCharValueUse;
  }

  public void setProdSpecCharValueUse(List<@Valid ProductSpecificationCharacteristicValueUse> prodSpecCharValueUse) {
    this.prodSpecCharValueUse = prodSpecCharValueUse;
  }

  public ProductOfferingPriceCreate productOfferingTerm(List<@Valid ProductOfferingTerm> productOfferingTerm) {
    this.productOfferingTerm = productOfferingTerm;
    return this;
  }

  public ProductOfferingPriceCreate addProductOfferingTermItem(ProductOfferingTerm productOfferingTermItem) {
    if (this.productOfferingTerm == null) {
      this.productOfferingTerm = new ArrayList<>();
    }
    this.productOfferingTerm.add(productOfferingTermItem);
    return this;
  }

  /**
   * A list of conditions under which a ProductOfferingPrice is made available to Customers. For instance, a Product Offering Price can be offered with multiple commitment periods.
   * @return productOfferingTerm
   */
  @Valid 
  @Schema(name = "productOfferingTerm", description = "A list of conditions under which a ProductOfferingPrice is made available to Customers. For instance, a Product Offering Price can be offered with multiple commitment periods.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productOfferingTerm")
  public List<@Valid ProductOfferingTerm> getProductOfferingTerm() {
    return productOfferingTerm;
  }

  public void setProductOfferingTerm(List<@Valid ProductOfferingTerm> productOfferingTerm) {
    this.productOfferingTerm = productOfferingTerm;
  }

  public ProductOfferingPriceCreate tax(List<@Valid TaxItem> tax) {
    this.tax = tax;
    return this;
  }

  public ProductOfferingPriceCreate addTaxItem(TaxItem taxItem) {
    if (this.tax == null) {
      this.tax = new ArrayList<>();
    }
    this.tax.add(taxItem);
    return this;
  }

  /**
   * An amount of money levied on the price of a Product by a legislative body.
   * @return tax
   */
  @Valid 
  @Schema(name = "tax", description = "An amount of money levied on the price of a Product by a legislative body.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tax")
  public List<@Valid TaxItem> getTax() {
    return tax;
  }

  public void setTax(List<@Valid TaxItem> tax) {
    this.tax = tax;
  }

  public ProductOfferingPriceCreate unitOfMeasure(Quantity unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  /**
   * Get unitOfMeasure
   * @return unitOfMeasure
   */
  @Valid 
  @Schema(name = "unitOfMeasure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unitOfMeasure")
  public Quantity getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(Quantity unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public ProductOfferingPriceCreate validFor(TimePeriod validFor) {
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

  public ProductOfferingPriceCreate atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * the immediate base class type of this product offering price
   * @return atBaseType
   */
  
  @Schema(name = "@baseType", description = "the immediate base class type of this product offering price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public ProductOfferingPriceCreate atSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * hyperlink reference to the schema describing this resource
   * @return atSchemaLocation
   */
  
  @Schema(name = "@schemaLocation", description = "hyperlink reference to the schema describing this resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public String getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public ProductOfferingPriceCreate atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * The class type of this Product offering price
   * @return atType
   */
  
  @Schema(name = "@type", description = "The class type of this Product offering price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ProductOfferingPriceCreate productOfferingPriceCreate = (ProductOfferingPriceCreate) o;
    return Objects.equals(this.description, productOfferingPriceCreate.description) &&
        Objects.equals(this.isBundle, productOfferingPriceCreate.isBundle) &&
        Objects.equals(this.lastUpdate, productOfferingPriceCreate.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, productOfferingPriceCreate.lifecycleStatus) &&
        Objects.equals(this.name, productOfferingPriceCreate.name) &&
        Objects.equals(this.percentage, productOfferingPriceCreate.percentage) &&
        Objects.equals(this.priceType, productOfferingPriceCreate.priceType) &&
        Objects.equals(this.recurringChargePeriodLength, productOfferingPriceCreate.recurringChargePeriodLength) &&
        Objects.equals(this.recurringChargePeriodType, productOfferingPriceCreate.recurringChargePeriodType) &&
        Objects.equals(this.version, productOfferingPriceCreate.version) &&
        Objects.equals(this.bundledPopRelationship, productOfferingPriceCreate.bundledPopRelationship) &&
        Objects.equals(this.constraint, productOfferingPriceCreate.constraint) &&
        Objects.equals(this.place, productOfferingPriceCreate.place) &&
        Objects.equals(this.popRelationship, productOfferingPriceCreate.popRelationship) &&
        Objects.equals(this.price, productOfferingPriceCreate.price) &&
        Objects.equals(this.pricingLogicAlgorithm, productOfferingPriceCreate.pricingLogicAlgorithm) &&
        Objects.equals(this.prodSpecCharValueUse, productOfferingPriceCreate.prodSpecCharValueUse) &&
        Objects.equals(this.productOfferingTerm, productOfferingPriceCreate.productOfferingTerm) &&
        Objects.equals(this.tax, productOfferingPriceCreate.tax) &&
        Objects.equals(this.unitOfMeasure, productOfferingPriceCreate.unitOfMeasure) &&
        Objects.equals(this.validFor, productOfferingPriceCreate.validFor) &&
        Objects.equals(this.atBaseType, productOfferingPriceCreate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productOfferingPriceCreate.atSchemaLocation) &&
        Objects.equals(this.atType, productOfferingPriceCreate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isBundle, lastUpdate, lifecycleStatus, name, percentage, priceType, recurringChargePeriodLength, recurringChargePeriodType, version, bundledPopRelationship, constraint, place, popRelationship, price, pricingLogicAlgorithm, prodSpecCharValueUse, productOfferingTerm, tax, unitOfMeasure, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingPriceCreate {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    recurringChargePeriodLength: ").append(toIndentedString(recurringChargePeriodLength)).append("\n");
    sb.append("    recurringChargePeriodType: ").append(toIndentedString(recurringChargePeriodType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    bundledPopRelationship: ").append(toIndentedString(bundledPopRelationship)).append("\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    popRelationship: ").append(toIndentedString(popRelationship)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    pricingLogicAlgorithm: ").append(toIndentedString(pricingLogicAlgorithm)).append("\n");
    sb.append("    prodSpecCharValueUse: ").append(toIndentedString(prodSpecCharValueUse)).append("\n");
    sb.append("    productOfferingTerm: ").append(toIndentedString(productOfferingTerm)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

