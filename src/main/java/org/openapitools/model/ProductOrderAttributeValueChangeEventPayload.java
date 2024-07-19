package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ProductOrder;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The event data structure
 */

@Schema(name = "ProductOrderAttributeValueChangeEventPayload", description = "The event data structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-09T13:05:26.782760900+05:30[GMT+05:30]", comments = "Generator version: 7.7.0")
public class ProductOrderAttributeValueChangeEventPayload {

  private ProductOrder productOrder;

  public ProductOrderAttributeValueChangeEventPayload productOrder(ProductOrder productOrder) {
    this.productOrder = productOrder;
    return this;
  }

  /**
   * Get productOrder
   * @return productOrder
   */
  @Valid 
  @Schema(name = "productOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productOrder")
  public ProductOrder getProductOrder() {
    return productOrder;
  }

  public void setProductOrder(ProductOrder productOrder) {
    this.productOrder = productOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOrderAttributeValueChangeEventPayload productOrderAttributeValueChangeEventPayload = (ProductOrderAttributeValueChangeEventPayload) o;
    return Objects.equals(this.productOrder, productOrderAttributeValueChangeEventPayload.productOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOrderAttributeValueChangeEventPayload {\n");
    sb.append("    productOrder: ").append(toIndentedString(productOrder)).append("\n");
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

