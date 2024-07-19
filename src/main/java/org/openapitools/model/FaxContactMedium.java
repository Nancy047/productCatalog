package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.model.ContactMedium;
import org.openapitools.model.TimePeriod;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FaxContactMedium
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-08T19:14:52.617209500+05:30[Asia/Calcutta]", comments = "Generator version: 7.7.0")
public class FaxContactMedium extends ContactMedium {

  private String faxNumber;

  public FaxContactMedium() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FaxContactMedium(String atType) {
    super(atType);
  }

  public FaxContactMedium faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

  /**
   * The fax number of the contact
   * @return faxNumber
   */
  
  @Schema(name = "faxNumber", description = "The fax number of the contact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("faxNumber")
  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }


  public FaxContactMedium atType(String atType) {
    super.atType(atType);
    return this;
  }

  public FaxContactMedium atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public FaxContactMedium atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public FaxContactMedium id(String id) {
    super.id(id);
    return this;
  }

  public FaxContactMedium preferred(Boolean preferred) {
    super.preferred(preferred);
    return this;
  }

  public FaxContactMedium contactType(String contactType) {
    super.contactType(contactType);
    return this;
  }

  public FaxContactMedium validFor(TimePeriod validFor) {
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
    FaxContactMedium faxContactMedium = (FaxContactMedium) o;
    return Objects.equals(this.faxNumber, faxContactMedium.faxNumber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faxNumber, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxContactMedium {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
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

