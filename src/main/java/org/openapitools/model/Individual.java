package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Characteristic;
import org.openapitools.model.ContactMedium;
import org.openapitools.model.Disability;
import org.openapitools.model.ExternalIdentifier;
import org.openapitools.model.IndividualIdentification;
import org.openapitools.model.IndividualStateType;
import org.openapitools.model.LanguageAbility;
import org.openapitools.model.OtherNameIndividual;
import org.openapitools.model.Party;
import org.openapitools.model.PartyCreditProfile;
import org.openapitools.model.RelatedPartyOrPartyRole;
import org.openapitools.model.Skill;
import org.openapitools.model.TaxExemptionCertificate;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Individual
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-08T19:14:52.617209500+05:30[Asia/Calcutta]", comments = "Generator version: 7.7.0")
public class Individual extends Party implements PartyOrPartyRole, PatchIndividual200Response {

  private String gender;

  private String placeOfBirth;

  private String countryOfBirth;

  private String nationality;

  private String maritalStatus;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime birthDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime deathDate;

  private String title;

  private String aristocraticTitle;

  private String generation;

  private String preferredGivenName;

  private String familyNamePrefix;

  private String legalName;

  private String middleName;

  private String name;

  private String formattedName;

  private String location;

  private IndividualStateType status;

  @Valid
  private List<@Valid OtherNameIndividual> otherName = new ArrayList<>();

  @Valid
  private List<IndividualIdentification> individualIdentification = new ArrayList<>();

  @Valid
  private List<@Valid Disability> disability = new ArrayList<>();

  @Valid
  private List<@Valid LanguageAbility> languageAbility = new ArrayList<>();

  @Valid
  private List<@Valid Skill> skill = new ArrayList<>();

  private String familyName;

  private String givenName;

  public Individual() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Individual(String atType) {
    super(atType);
  }

  public Individual gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Gender
   * @return gender
   */
  
  @Schema(name = "gender", description = "Gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Individual placeOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
    return this;
  }

  /**
   * Reference to the place where the individual was born
   * @return placeOfBirth
   */
  
  @Schema(name = "placeOfBirth", description = "Reference to the place where the individual was born", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placeOfBirth")
  public String getPlaceOfBirth() {
    return placeOfBirth;
  }

  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }

  public Individual countryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
    return this;
  }

  /**
   * Country where the individual was born
   * @return countryOfBirth
   */
  
  @Schema(name = "countryOfBirth", description = "Country where the individual was born", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countryOfBirth")
  public String getCountryOfBirth() {
    return countryOfBirth;
  }

  public void setCountryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
  }

  public Individual nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Nationality
   * @return nationality
   */
  
  @Schema(name = "nationality", description = "Nationality", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nationality")
  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public Individual maritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Marital status (married, divorced, widow ...)
   * @return maritalStatus
   */
  
  @Schema(name = "maritalStatus", description = "Marital status (married, divorced, widow ...)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maritalStatus")
  public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public Individual birthDate(OffsetDateTime birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Birth date
   * @return birthDate
   */
  @Valid 
  @Schema(name = "birthDate", description = "Birth date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("birthDate")
  public OffsetDateTime getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(OffsetDateTime birthDate) {
    this.birthDate = birthDate;
  }

  public Individual deathDate(OffsetDateTime deathDate) {
    this.deathDate = deathDate;
    return this;
  }

  /**
   * Date of death
   * @return deathDate
   */
  @Valid 
  @Schema(name = "deathDate", description = "Date of death", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deathDate")
  public OffsetDateTime getDeathDate() {
    return deathDate;
  }

  public void setDeathDate(OffsetDateTime deathDate) {
    this.deathDate = deathDate;
  }

  public Individual title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Useful for titles (aristocratic, social,...) Pr, Dr, Sir, ...
   * @return title
   */
  
  @Schema(name = "title", description = "Useful for titles (aristocratic, social,...) Pr, Dr, Sir, ...", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Individual aristocraticTitle(String aristocraticTitle) {
    this.aristocraticTitle = aristocraticTitle;
    return this;
  }

  /**
   * e.g. Baron, Graf, Earl
   * @return aristocraticTitle
   */
  
  @Schema(name = "aristocraticTitle", description = "e.g. Baron, Graf, Earl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aristocraticTitle")
  public String getAristocraticTitle() {
    return aristocraticTitle;
  }

  public void setAristocraticTitle(String aristocraticTitle) {
    this.aristocraticTitle = aristocraticTitle;
  }

  public Individual generation(String generation) {
    this.generation = generation;
    return this;
  }

  /**
   * e.g.. Sr, Jr, III (the third)
   * @return generation
   */
  
  @Schema(name = "generation", description = "e.g.. Sr, Jr, III (the third)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generation")
  public String getGeneration() {
    return generation;
  }

  public void setGeneration(String generation) {
    this.generation = generation;
  }

  public Individual preferredGivenName(String preferredGivenName) {
    this.preferredGivenName = preferredGivenName;
    return this;
  }

  /**
   * Contains the chosen name by which the individual prefers to be addressed. Note: This name may be a name other than a given name, such as a nickname
   * @return preferredGivenName
   */
  
  @Schema(name = "preferredGivenName", description = "Contains the chosen name by which the individual prefers to be addressed. Note: This name may be a name other than a given name, such as a nickname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredGivenName")
  public String getPreferredGivenName() {
    return preferredGivenName;
  }

  public void setPreferredGivenName(String preferredGivenName) {
    this.preferredGivenName = preferredGivenName;
  }

  public Individual familyNamePrefix(String familyNamePrefix) {
    this.familyNamePrefix = familyNamePrefix;
    return this;
  }

  /**
   * Family name prefix
   * @return familyNamePrefix
   */
  
  @Schema(name = "familyNamePrefix", description = "Family name prefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("familyNamePrefix")
  public String getFamilyNamePrefix() {
    return familyNamePrefix;
  }

  public void setFamilyNamePrefix(String familyNamePrefix) {
    this.familyNamePrefix = familyNamePrefix;
  }

  public Individual legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }

  /**
   * Legal name or birth name (name one has for official purposes)
   * @return legalName
   */
  
  @Schema(name = "legalName", description = "Legal name or birth name (name one has for official purposes)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("legalName")
  public String getLegalName() {
    return legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  public Individual middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Middles name or initial
   * @return middleName
   */
  
  @Schema(name = "middleName", description = "Middles name or initial", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Individual name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Full name flatten (first, middle, and last names) - this is the name that is expected to be presented in reference data types such as PartyRef, RelatedParty, etc. that refer to Individual
   * @return name
   */
  
  @Schema(name = "name", description = "Full name flatten (first, middle, and last names) - this is the name that is expected to be presented in reference data types such as PartyRef, RelatedParty, etc. that refer to Individual", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Individual formattedName(String formattedName) {
    this.formattedName = formattedName;
    return this;
  }

  /**
   * A fully formatted name in one string with all of its pieces in their proper place and all of the necessary punctuation. Useful for specific contexts (Chinese, Japanese, Korean)
   * @return formattedName
   */
  
  @Schema(name = "formattedName", description = "A fully formatted name in one string with all of its pieces in their proper place and all of the necessary punctuation. Useful for specific contexts (Chinese, Japanese, Korean)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formattedName")
  public String getFormattedName() {
    return formattedName;
  }

  public void setFormattedName(String formattedName) {
    this.formattedName = formattedName;
  }

  public Individual location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Temporary current location of the individual (may be used if the individual has approved its sharing)
   * @return location
   */
  
  @Schema(name = "location", description = "Temporary current location of the individual (may be used if the individual has approved its sharing)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Individual status(IndividualStateType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public IndividualStateType getStatus() {
    return status;
  }

  public void setStatus(IndividualStateType status) {
    this.status = status;
  }

  public Individual otherName(List<@Valid OtherNameIndividual> otherName) {
    this.otherName = otherName;
    return this;
  }

  public Individual addOtherNameItem(OtherNameIndividual otherNameItem) {
    if (this.otherName == null) {
      this.otherName = new ArrayList<>();
    }
    this.otherName.add(otherNameItem);
    return this;
  }

  /**
   * List of other names by which this individual is known
   * @return otherName
   */
  @Valid 
  @Schema(name = "otherName", description = "List of other names by which this individual is known", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("otherName")
  public List<@Valid OtherNameIndividual> getOtherName() {
    return otherName;
  }

  public void setOtherName(List<@Valid OtherNameIndividual> otherName) {
    this.otherName = otherName;
  }

  public Individual individualIdentification(List<IndividualIdentification> individualIdentification) {
    this.individualIdentification = individualIdentification;
    return this;
  }

  public Individual addIndividualIdentificationItem(IndividualIdentification individualIdentificationItem) {
    if (this.individualIdentification == null) {
      this.individualIdentification = new ArrayList<>();
    }
    this.individualIdentification.add(individualIdentificationItem);
    return this;
  }

  /**
   * List of official identifications issued to the individual, such as passport, driving licence, social security number
   * @return individualIdentification
   */
  @Valid 
  @Schema(name = "individualIdentification", description = "List of official identifications issued to the individual, such as passport, driving licence, social security number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("individualIdentification")
  public List<IndividualIdentification> getIndividualIdentification() {
    return individualIdentification;
  }

  public void setIndividualIdentification(List<IndividualIdentification> individualIdentification) {
    this.individualIdentification = individualIdentification;
  }

  public Individual disability(List<@Valid Disability> disability) {
    this.disability = disability;
    return this;
  }

  public Individual addDisabilityItem(Disability disabilityItem) {
    if (this.disability == null) {
      this.disability = new ArrayList<>();
    }
    this.disability.add(disabilityItem);
    return this;
  }

  /**
   * List of disabilities suffered by the individual
   * @return disability
   */
  @Valid 
  @Schema(name = "disability", description = "List of disabilities suffered by the individual", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disability")
  public List<@Valid Disability> getDisability() {
    return disability;
  }

  public void setDisability(List<@Valid Disability> disability) {
    this.disability = disability;
  }

  public Individual languageAbility(List<@Valid LanguageAbility> languageAbility) {
    this.languageAbility = languageAbility;
    return this;
  }

  public Individual addLanguageAbilityItem(LanguageAbility languageAbilityItem) {
    if (this.languageAbility == null) {
      this.languageAbility = new ArrayList<>();
    }
    this.languageAbility.add(languageAbilityItem);
    return this;
  }

  /**
   * List of national languages known by the individual
   * @return languageAbility
   */
  @Valid 
  @Schema(name = "languageAbility", description = "List of national languages known by the individual", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("languageAbility")
  public List<@Valid LanguageAbility> getLanguageAbility() {
    return languageAbility;
  }

  public void setLanguageAbility(List<@Valid LanguageAbility> languageAbility) {
    this.languageAbility = languageAbility;
  }

  public Individual skill(List<@Valid Skill> skill) {
    this.skill = skill;
    return this;
  }

  public Individual addSkillItem(Skill skillItem) {
    if (this.skill == null) {
      this.skill = new ArrayList<>();
    }
    this.skill.add(skillItem);
    return this;
  }

  /**
   * List of skills exhibited by the individual
   * @return skill
   */
  @Valid 
  @Schema(name = "skill", description = "List of skills exhibited by the individual", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skill")
  public List<@Valid Skill> getSkill() {
    return skill;
  }

  public void setSkill(List<@Valid Skill> skill) {
    this.skill = skill;
  }

  public Individual familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * Contains the non-chosen or inherited name. Also known as last name in the Western context
   * @return familyName
   */
  
  @Schema(name = "familyName", description = "Contains the non-chosen or inherited name. Also known as last name in the Western context", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("familyName")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public Individual givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * First name of the individual
   * @return givenName
   */
  
  @Schema(name = "givenName", description = "First name of the individual", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("givenName")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  public Individual atType(String atType) {
    super.atType(atType);
    return this;
  }

  public Individual atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public Individual atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public Individual href(String href) {
    super.href(href);
    return this;
  }

  public Individual id(String id) {
    super.id(id);
    return this;
  }

  public Individual externalReference(List<ExternalIdentifier> externalReference) {
    super.externalReference(externalReference);
    return this;
  }

  public Individual addExternalReferenceItem(ExternalIdentifier externalReferenceItem) {
    super.addExternalReferenceItem(externalReferenceItem);
    return this;
  }

  public Individual partyCharacteristic(List<Characteristic> partyCharacteristic) {
    super.partyCharacteristic(partyCharacteristic);
    return this;
  }

  public Individual addPartyCharacteristicItem(Characteristic partyCharacteristicItem) {
    super.addPartyCharacteristicItem(partyCharacteristicItem);
    return this;
  }

  public Individual taxExemptionCertificate(List<TaxExemptionCertificate> taxExemptionCertificate) {
    super.taxExemptionCertificate(taxExemptionCertificate);
    return this;
  }

  public Individual addTaxExemptionCertificateItem(TaxExemptionCertificate taxExemptionCertificateItem) {
    super.addTaxExemptionCertificateItem(taxExemptionCertificateItem);
    return this;
  }

  public Individual creditRating(List<PartyCreditProfile> creditRating) {
    super.creditRating(creditRating);
    return this;
  }

  public Individual addCreditRatingItem(PartyCreditProfile creditRatingItem) {
    super.addCreditRatingItem(creditRatingItem);
    return this;
  }

  public Individual relatedParty(List<RelatedPartyOrPartyRole> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public Individual addRelatedPartyItem(RelatedPartyOrPartyRole relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public Individual contactMedium(List<ContactMedium> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public Individual addContactMediumItem(ContactMedium contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
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
    Individual individual = (Individual) o;
    return Objects.equals(this.gender, individual.gender) &&
        Objects.equals(this.placeOfBirth, individual.placeOfBirth) &&
        Objects.equals(this.countryOfBirth, individual.countryOfBirth) &&
        Objects.equals(this.nationality, individual.nationality) &&
        Objects.equals(this.maritalStatus, individual.maritalStatus) &&
        Objects.equals(this.birthDate, individual.birthDate) &&
        Objects.equals(this.deathDate, individual.deathDate) &&
        Objects.equals(this.title, individual.title) &&
        Objects.equals(this.aristocraticTitle, individual.aristocraticTitle) &&
        Objects.equals(this.generation, individual.generation) &&
        Objects.equals(this.preferredGivenName, individual.preferredGivenName) &&
        Objects.equals(this.familyNamePrefix, individual.familyNamePrefix) &&
        Objects.equals(this.legalName, individual.legalName) &&
        Objects.equals(this.middleName, individual.middleName) &&
        Objects.equals(this.name, individual.name) &&
        Objects.equals(this.formattedName, individual.formattedName) &&
        Objects.equals(this.location, individual.location) &&
        Objects.equals(this.status, individual.status) &&
        Objects.equals(this.otherName, individual.otherName) &&
        Objects.equals(this.individualIdentification, individual.individualIdentification) &&
        Objects.equals(this.disability, individual.disability) &&
        Objects.equals(this.languageAbility, individual.languageAbility) &&
        Objects.equals(this.skill, individual.skill) &&
        Objects.equals(this.familyName, individual.familyName) &&
        Objects.equals(this.givenName, individual.givenName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender, placeOfBirth, countryOfBirth, nationality, maritalStatus, birthDate, deathDate, title, aristocraticTitle, generation, preferredGivenName, familyNamePrefix, legalName, middleName, name, formattedName, location, status, otherName, individualIdentification, disability, languageAbility, skill, familyName, givenName, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Individual {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    placeOfBirth: ").append(toIndentedString(placeOfBirth)).append("\n");
    sb.append("    countryOfBirth: ").append(toIndentedString(countryOfBirth)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    deathDate: ").append(toIndentedString(deathDate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    aristocraticTitle: ").append(toIndentedString(aristocraticTitle)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    preferredGivenName: ").append(toIndentedString(preferredGivenName)).append("\n");
    sb.append("    familyNamePrefix: ").append(toIndentedString(familyNamePrefix)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    formattedName: ").append(toIndentedString(formattedName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    otherName: ").append(toIndentedString(otherName)).append("\n");
    sb.append("    individualIdentification: ").append(toIndentedString(individualIdentification)).append("\n");
    sb.append("    disability: ").append(toIndentedString(disability)).append("\n");
    sb.append("    languageAbility: ").append(toIndentedString(languageAbility)).append("\n");
    sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
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

