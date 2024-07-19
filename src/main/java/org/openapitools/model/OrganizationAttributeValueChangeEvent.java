package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Characteristic;
import org.openapitools.model.EntityRef;
import org.openapitools.model.OrganizationAttributeValueChangeEventPayload;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRef;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrganizationAttributeValueChangeEvent
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-08T19:14:52.617209500+05:30[Asia/Calcutta]", comments = "Generator version: 7.7.0")
public class OrganizationAttributeValueChangeEvent {

  private String atType;

  private String atBaseType;

  private String atSchemaLocation;

  private String href;

  private String id;

  private String correlationId;

  private String domain;

  private String title;

  private String description;

  private String priority;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timeOccurred;

  private EntityRef source;

  private EntityRef reportingSystem;

  @Valid
  private List<RelatedPartyRefOrPartyRoleRef> relatedParty = new ArrayList<>();

  @Valid
  private List<Characteristic> analyticCharacteristic = new ArrayList<>();

  private String eventId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime eventTime;

  private String eventType;

  private OrganizationAttributeValueChangeEventPayload event;

  public OrganizationAttributeValueChangeEvent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrganizationAttributeValueChangeEvent(String atType) {
    this.atType = atType;
  }

  public OrganizationAttributeValueChangeEvent atType(String atType) {
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

  public OrganizationAttributeValueChangeEvent atBaseType(String atBaseType) {
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

  public OrganizationAttributeValueChangeEvent atSchemaLocation(String atSchemaLocation) {
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

  public OrganizationAttributeValueChangeEvent href(String href) {
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

  public OrganizationAttributeValueChangeEvent id(String id) {
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

  public OrganizationAttributeValueChangeEvent correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * The correlation id for this event.
   * @return correlationId
   */
  
  @Schema(name = "correlationId", description = "The correlation id for this event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("correlationId")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public OrganizationAttributeValueChangeEvent domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The domain of the event.
   * @return domain
   */
  
  @Schema(name = "domain", description = "The domain of the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public OrganizationAttributeValueChangeEvent title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the event.
   * @return title
   */
  
  @Schema(name = "title", description = "The title of the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public OrganizationAttributeValueChangeEvent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An explnatory of the event.
   * @return description
   */
  
  @Schema(name = "description", description = "An explnatory of the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrganizationAttributeValueChangeEvent priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * A priority.
   * @return priority
   */
  
  @Schema(name = "priority", description = "A priority.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public OrganizationAttributeValueChangeEvent timeOccurred(OffsetDateTime timeOccurred) {
    this.timeOccurred = timeOccurred;
    return this;
  }

  /**
   * The time the event occurred.
   * @return timeOccurred
   */
  @Valid 
  @Schema(name = "timeOccurred", description = "The time the event occurred.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeOccurred")
  public OffsetDateTime getTimeOccurred() {
    return timeOccurred;
  }

  public void setTimeOccurred(OffsetDateTime timeOccurred) {
    this.timeOccurred = timeOccurred;
  }

  public OrganizationAttributeValueChangeEvent source(EntityRef source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @Valid 
  @Schema(name = "source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public EntityRef getSource() {
    return source;
  }

  public void setSource(EntityRef source) {
    this.source = source;
  }

  public OrganizationAttributeValueChangeEvent reportingSystem(EntityRef reportingSystem) {
    this.reportingSystem = reportingSystem;
    return this;
  }

  /**
   * Get reportingSystem
   * @return reportingSystem
   */
  @Valid 
  @Schema(name = "reportingSystem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reportingSystem")
  public EntityRef getReportingSystem() {
    return reportingSystem;
  }

  public void setReportingSystem(EntityRef reportingSystem) {
    this.reportingSystem = reportingSystem;
  }

  public OrganizationAttributeValueChangeEvent relatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public OrganizationAttributeValueChangeEvent addRelatedPartyItem(RelatedPartyRefOrPartyRoleRef relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Get relatedParty
   * @return relatedParty
   */
  @Valid 
  @Schema(name = "relatedParty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedParty")
  public List<RelatedPartyRefOrPartyRoleRef> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public OrganizationAttributeValueChangeEvent analyticCharacteristic(List<Characteristic> analyticCharacteristic) {
    this.analyticCharacteristic = analyticCharacteristic;
    return this;
  }

  public OrganizationAttributeValueChangeEvent addAnalyticCharacteristicItem(Characteristic analyticCharacteristicItem) {
    if (this.analyticCharacteristic == null) {
      this.analyticCharacteristic = new ArrayList<>();
    }
    this.analyticCharacteristic.add(analyticCharacteristicItem);
    return this;
  }

  /**
   * Get analyticCharacteristic
   * @return analyticCharacteristic
   */
  @Valid 
  @Schema(name = "analyticCharacteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("analyticCharacteristic")
  public List<Characteristic> getAnalyticCharacteristic() {
    return analyticCharacteristic;
  }

  public void setAnalyticCharacteristic(List<Characteristic> analyticCharacteristic) {
    this.analyticCharacteristic = analyticCharacteristic;
  }

  public OrganizationAttributeValueChangeEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The identifier of the notification.
   * @return eventId
   */
  
  @Schema(name = "eventId", description = "The identifier of the notification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public OrganizationAttributeValueChangeEvent eventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Time of the event occurrence.
   * @return eventTime
   */
  @Valid 
  @Schema(name = "eventTime", description = "Time of the event occurrence.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventTime")
  public OffsetDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }

  public OrganizationAttributeValueChangeEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The type of the notification.
   * @return eventType
   */
  
  @Schema(name = "eventType", description = "The type of the notification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public OrganizationAttributeValueChangeEvent event(OrganizationAttributeValueChangeEventPayload event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   */
  @Valid 
  @Schema(name = "event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event")
  public OrganizationAttributeValueChangeEventPayload getEvent() {
    return event;
  }

  public void setEvent(OrganizationAttributeValueChangeEventPayload event) {
    this.event = event;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationAttributeValueChangeEvent organizationAttributeValueChangeEvent = (OrganizationAttributeValueChangeEvent) o;
    return Objects.equals(this.atType, organizationAttributeValueChangeEvent.atType) &&
        Objects.equals(this.atBaseType, organizationAttributeValueChangeEvent.atBaseType) &&
        Objects.equals(this.atSchemaLocation, organizationAttributeValueChangeEvent.atSchemaLocation) &&
        Objects.equals(this.href, organizationAttributeValueChangeEvent.href) &&
        Objects.equals(this.id, organizationAttributeValueChangeEvent.id) &&
        Objects.equals(this.correlationId, organizationAttributeValueChangeEvent.correlationId) &&
        Objects.equals(this.domain, organizationAttributeValueChangeEvent.domain) &&
        Objects.equals(this.title, organizationAttributeValueChangeEvent.title) &&
        Objects.equals(this.description, organizationAttributeValueChangeEvent.description) &&
        Objects.equals(this.priority, organizationAttributeValueChangeEvent.priority) &&
        Objects.equals(this.timeOccurred, organizationAttributeValueChangeEvent.timeOccurred) &&
        Objects.equals(this.source, organizationAttributeValueChangeEvent.source) &&
        Objects.equals(this.reportingSystem, organizationAttributeValueChangeEvent.reportingSystem) &&
        Objects.equals(this.relatedParty, organizationAttributeValueChangeEvent.relatedParty) &&
        Objects.equals(this.analyticCharacteristic, organizationAttributeValueChangeEvent.analyticCharacteristic) &&
        Objects.equals(this.eventId, organizationAttributeValueChangeEvent.eventId) &&
        Objects.equals(this.eventTime, organizationAttributeValueChangeEvent.eventTime) &&
        Objects.equals(this.eventType, organizationAttributeValueChangeEvent.eventType) &&
        Objects.equals(this.event, organizationAttributeValueChangeEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, correlationId, domain, title, description, priority, timeOccurred, source, reportingSystem, relatedParty, analyticCharacteristic, eventId, eventTime, eventType, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationAttributeValueChangeEvent {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOccurred: ").append(toIndentedString(timeOccurred)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    reportingSystem: ").append(toIndentedString(reportingSystem)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    analyticCharacteristic: ").append(toIndentedString(analyticCharacteristic)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

