package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AttachmentRefOrValueMVO;
import org.openapitools.model.TaxDefinitionMVO;
import org.openapitools.model.TimePeriod;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TaxExemptionCertificateMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-08T19:14:52.617209500+05:30[Asia/Calcutta]", comments = "Generator version: 7.7.0")
public class TaxExemptionCertificateMVO {

  private String atType;

  private String atBaseType;

  private String atSchemaLocation;

  private String id;

  @Valid
  private List<TaxDefinitionMVO> taxDefinition = new ArrayList<>();

  private TimePeriod validFor;

  private String certificateNumber;

  private String issuingJurisdiction;

  private String reason;

  private AttachmentRefOrValueMVO attachment;

  public TaxExemptionCertificateMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaxExemptionCertificateMVO(String atType) {
    this.atType = atType;
  }

  public TaxExemptionCertificateMVO atType(String atType) {
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

  public TaxExemptionCertificateMVO atBaseType(String atBaseType) {
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

  public TaxExemptionCertificateMVO atSchemaLocation(String atSchemaLocation) {
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

  public TaxExemptionCertificateMVO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the tax exemption within list of the exemptions
   * @return id
   */
  
  @Schema(name = "id", description = "Identifier of the tax exemption within list of the exemptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TaxExemptionCertificateMVO taxDefinition(List<TaxDefinitionMVO> taxDefinition) {
    this.taxDefinition = taxDefinition;
    return this;
  }

  public TaxExemptionCertificateMVO addTaxDefinitionItem(TaxDefinitionMVO taxDefinitionItem) {
    if (this.taxDefinition == null) {
      this.taxDefinition = new ArrayList<>();
    }
    this.taxDefinition.add(taxDefinitionItem);
    return this;
  }

  /**
   * A list of taxes that are covered by the exemption, e.g. City Tax, State Tax. The definition would include the exemption (e.g. for a rate exemption 0% would be a full exemption, 5% could be a partial exemption if the actual rate was 10%).
   * @return taxDefinition
   */
  @Valid 
  @Schema(name = "taxDefinition", description = "A list of taxes that are covered by the exemption, e.g. City Tax, State Tax. The definition would include the exemption (e.g. for a rate exemption 0% would be a full exemption, 5% could be a partial exemption if the actual rate was 10%).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxDefinition")
  public List<TaxDefinitionMVO> getTaxDefinition() {
    return taxDefinition;
  }

  public void setTaxDefinition(List<TaxDefinitionMVO> taxDefinition) {
    this.taxDefinition = taxDefinition;
  }

  public TaxExemptionCertificateMVO validFor(TimePeriod validFor) {
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

  public TaxExemptionCertificateMVO certificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
    return this;
  }

  /**
   * Identifier of a document that shows proof of exemption from taxes for the taxing jurisdiction
   * @return certificateNumber
   */
  
  @Schema(name = "certificateNumber", description = "Identifier of a document that shows proof of exemption from taxes for the taxing jurisdiction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("certificateNumber")
  public String getCertificateNumber() {
    return certificateNumber;
  }

  public void setCertificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
  }

  public TaxExemptionCertificateMVO issuingJurisdiction(String issuingJurisdiction) {
    this.issuingJurisdiction = issuingJurisdiction;
    return this;
  }

  /**
   * Name of the jurisdiction that issued the exemption
   * @return issuingJurisdiction
   */
  
  @Schema(name = "issuingJurisdiction", example = "USA", description = "Name of the jurisdiction that issued the exemption", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuingJurisdiction")
  public String getIssuingJurisdiction() {
    return issuingJurisdiction;
  }

  public void setIssuingJurisdiction(String issuingJurisdiction) {
    this.issuingJurisdiction = issuingJurisdiction;
  }

  public TaxExemptionCertificateMVO reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for the tax exemption
   * @return reason
   */
  
  @Schema(name = "reason", description = "Reason for the tax exemption", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public TaxExemptionCertificateMVO attachment(AttachmentRefOrValueMVO attachment) {
    this.attachment = attachment;
    return this;
  }

  /**
   * Get attachment
   * @return attachment
   */
  @Valid 
  @Schema(name = "attachment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachment")
  public AttachmentRefOrValueMVO getAttachment() {
    return attachment;
  }

  public void setAttachment(AttachmentRefOrValueMVO attachment) {
    this.attachment = attachment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxExemptionCertificateMVO taxExemptionCertificateMVO = (TaxExemptionCertificateMVO) o;
    return Objects.equals(this.atType, taxExemptionCertificateMVO.atType) &&
        Objects.equals(this.atBaseType, taxExemptionCertificateMVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, taxExemptionCertificateMVO.atSchemaLocation) &&
        Objects.equals(this.id, taxExemptionCertificateMVO.id) &&
        Objects.equals(this.taxDefinition, taxExemptionCertificateMVO.taxDefinition) &&
        Objects.equals(this.validFor, taxExemptionCertificateMVO.validFor) &&
        Objects.equals(this.certificateNumber, taxExemptionCertificateMVO.certificateNumber) &&
        Objects.equals(this.issuingJurisdiction, taxExemptionCertificateMVO.issuingJurisdiction) &&
        Objects.equals(this.reason, taxExemptionCertificateMVO.reason) &&
        Objects.equals(this.attachment, taxExemptionCertificateMVO.attachment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, id, taxDefinition, validFor, certificateNumber, issuingJurisdiction, reason, attachment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxExemptionCertificateMVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taxDefinition: ").append(toIndentedString(taxDefinition)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    certificateNumber: ").append(toIndentedString(certificateNumber)).append("\n");
    sb.append("    issuingJurisdiction: ").append(toIndentedString(issuingJurisdiction)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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

