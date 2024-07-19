package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CancelProductOrder;
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

@Schema(name = "CancelProductOrderInformationRequiredEventPayload", description = "The event data structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-09T13:05:26.782760900+05:30[GMT+05:30]", comments = "Generator version: 7.7.0")
public class CancelProductOrderInformationRequiredEventPayload {

  private CancelProductOrder cancelProductOrder;

  public CancelProductOrderInformationRequiredEventPayload cancelProductOrder(CancelProductOrder cancelProductOrder) {
    this.cancelProductOrder = cancelProductOrder;
    return this;
  }

  /**
   * Get cancelProductOrder
   * @return cancelProductOrder
   */
  @Valid 
  @Schema(name = "cancelProductOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cancelProductOrder")
  public CancelProductOrder getCancelProductOrder() {
    return cancelProductOrder;
  }

  public void setCancelProductOrder(CancelProductOrder cancelProductOrder) {
    this.cancelProductOrder = cancelProductOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelProductOrderInformationRequiredEventPayload cancelProductOrderInformationRequiredEventPayload = (CancelProductOrderInformationRequiredEventPayload) o;
    return Objects.equals(this.cancelProductOrder, cancelProductOrderInformationRequiredEventPayload.cancelProductOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelProductOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelProductOrderInformationRequiredEventPayload {\n");
    sb.append("    cancelProductOrder: ").append(toIndentedString(cancelProductOrder)).append("\n");
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

