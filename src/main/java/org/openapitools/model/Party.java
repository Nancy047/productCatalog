package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Characteristic;
import org.openapitools.model.ContactMedium;
import org.openapitools.model.ExternalIdentifier;
import org.openapitools.model.PartyCreditProfile;
import org.openapitools.model.RelatedPartyOrPartyRole;
import org.openapitools.model.TaxExemptionCertificate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Party
 */

@JsonIgnoreProperties(
  value = "@type", // ignore manually set @type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the @type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Individual.class, name = "Individual"),
  @JsonSubTypes.Type(value = Organization.class, name = "Organization"),
  @JsonSubTypes.Type(value = Party.class, name = "Party")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-08T19:14:52.617209500+05:30[Asia/Calcutta]", comments = "Generator version: 7.7.0")
public class Party {

  private String atType;

  private String atBaseType;

  private String atSchemaLocation;

  private String href;

  private String id;

  @Valid
  private List<ExternalIdentifier> externalReference = new ArrayList<>();

  @Valid
  private List<Characteristic> partyCharacteristic = new ArrayList<>();

  @Valid
  private List<TaxExemptionCertificate> taxExemptionCertificate = new ArrayList<>();

  @Valid
  private List<PartyCreditProfile> creditRating = new ArrayList<>();

  @Valid
  private List<RelatedPartyOrPartyRole> relatedParty = new ArrayList<>();

  @Valid
  private List<ContactMedium> contactMedium = new ArrayList<>();

  public Party() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Party(String atType) {
    this.atType = atType;
  }

  public Party atType(String atType) {
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

  public Party atBaseType(String atBaseType) {
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

  public Party atSchemaLocation(String atSchemaLocation) {
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

  public Party href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
   */
  
  @Schema(name = "href", description = "Hyperlink reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Party id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
   */
  
  @Schema(name = "id", description = "unique identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Party externalReference(List<ExternalIdentifier> externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  public Party addExternalReferenceItem(ExternalIdentifier externalReferenceItem) {
    if (this.externalReference == null) {
      this.externalReference = new ArrayList<>();
    }
    this.externalReference.add(externalReferenceItem);
    return this;
  }

  /**
   * List of identifiers of the Party in an external system, for example when party information is imported from a commerce system
   * @return externalReference
   */
  @Valid 
  @Schema(name = "externalReference", description = "List of identifiers of the Party in an external system, for example when party information is imported from a commerce system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalReference")
  public List<ExternalIdentifier> getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(List<ExternalIdentifier> externalReference) {
    this.externalReference = externalReference;
  }

  public Party partyCharacteristic(List<Characteristic> partyCharacteristic) {
    this.partyCharacteristic = partyCharacteristic;
    return this;
  }

  public Party addPartyCharacteristicItem(Characteristic partyCharacteristicItem) {
    if (this.partyCharacteristic == null) {
      this.partyCharacteristic = new ArrayList<>();
    }
    this.partyCharacteristic.add(partyCharacteristicItem);
    return this;
  }

  /**
   * List of additional characteristics that a Party can take on.
   * @return partyCharacteristic
   */
  @Valid 
  @Schema(name = "partyCharacteristic", description = "List of additional characteristics that a Party can take on.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partyCharacteristic")
  public List<Characteristic> getPartyCharacteristic() {
    return partyCharacteristic;
  }

  public void setPartyCharacteristic(List<Characteristic> partyCharacteristic) {
    this.partyCharacteristic = partyCharacteristic;
  }

  public Party taxExemptionCertificate(List<TaxExemptionCertificate> taxExemptionCertificate) {
    this.taxExemptionCertificate = taxExemptionCertificate;
    return this;
  }

  public Party addTaxExemptionCertificateItem(TaxExemptionCertificate taxExemptionCertificateItem) {
    if (this.taxExemptionCertificate == null) {
      this.taxExemptionCertificate = new ArrayList<>();
    }
    this.taxExemptionCertificate.add(taxExemptionCertificateItem);
    return this;
  }

  /**
   * List of tax exemptions granted to the party. For example, a war veteran might have partial exemption from state tax and a full exemption from federal tax
   * @return taxExemptionCertificate
   */
  @Valid 
  @Schema(name = "taxExemptionCertificate", description = "List of tax exemptions granted to the party. For example, a war veteran might have partial exemption from state tax and a full exemption from federal tax", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxExemptionCertificate")
  public List<TaxExemptionCertificate> getTaxExemptionCertificate() {
    return taxExemptionCertificate;
  }

  public void setTaxExemptionCertificate(List<TaxExemptionCertificate> taxExemptionCertificate) {
    this.taxExemptionCertificate = taxExemptionCertificate;
  }

  public Party creditRating(List<PartyCreditProfile> creditRating) {
    this.creditRating = creditRating;
    return this;
  }

  public Party addCreditRatingItem(PartyCreditProfile creditRatingItem) {
    if (this.creditRating == null) {
      this.creditRating = new ArrayList<>();
    }
    this.creditRating.add(creditRatingItem);
    return this;
  }

  /**
   * List of credit profiles and scores for the party, typically received from an external credit broker
   * @return creditRating
   */
  @Valid 
  @Schema(name = "creditRating", description = "List of credit profiles and scores for the party, typically received from an external credit broker", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditRating")
  public List<PartyCreditProfile> getCreditRating() {
    return creditRating;
  }

  public void setCreditRating(List<PartyCreditProfile> creditRating) {
    this.creditRating = creditRating;
  }

  public Party relatedParty(List<RelatedPartyOrPartyRole> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public Party addRelatedPartyItem(RelatedPartyOrPartyRole relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * List of parties and/or party roles related to this party
   * @return relatedParty
   */
  @Valid 
  @Schema(name = "relatedParty", description = "List of parties and/or party roles related to this party", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedParty")
  public List<RelatedPartyOrPartyRole> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyOrPartyRole> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public Party contactMedium(List<ContactMedium> contactMedium) {
    this.contactMedium = contactMedium;
    return this;
  }

  public Party addContactMediumItem(ContactMedium contactMediumItem) {
    if (this.contactMedium == null) {
      this.contactMedium = new ArrayList<>();
    }
    this.contactMedium.add(contactMediumItem);
    return this;
  }

  /**
   * List of means for contacting the party, e.g. mobile phone, email address
   * @return contactMedium
   */
  @Valid 
  @Schema(name = "contactMedium", description = "List of means for contacting the party, e.g. mobile phone, email address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactMedium")
  public List<ContactMedium> getContactMedium() {
    return contactMedium;
  }

  public void setContactMedium(List<ContactMedium> contactMedium) {
    this.contactMedium = contactMedium;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Party party = (Party) o;
    return Objects.equals(this.atType, party.atType) &&
        Objects.equals(this.atBaseType, party.atBaseType) &&
        Objects.equals(this.atSchemaLocation, party.atSchemaLocation) &&
        Objects.equals(this.href, party.href) &&
        Objects.equals(this.id, party.id) &&
        Objects.equals(this.externalReference, party.externalReference) &&
        Objects.equals(this.partyCharacteristic, party.partyCharacteristic) &&
        Objects.equals(this.taxExemptionCertificate, party.taxExemptionCertificate) &&
        Objects.equals(this.creditRating, party.creditRating) &&
        Objects.equals(this.relatedParty, party.relatedParty) &&
        Objects.equals(this.contactMedium, party.contactMedium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, externalReference, partyCharacteristic, taxExemptionCertificate, creditRating, relatedParty, contactMedium);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Party {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    partyCharacteristic: ").append(toIndentedString(partyCharacteristic)).append("\n");
    sb.append("    taxExemptionCertificate: ").append(toIndentedString(taxExemptionCertificate)).append("\n");
    sb.append("    creditRating: ").append(toIndentedString(creditRating)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    contactMedium: ").append(toIndentedString(contactMedium)).append("\n");
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

