package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A period of time, either as a deadline (endDateTime only) a startDateTime only, or both
 */

@Schema(name = "TimePeriod", description = "A period of time, either as a deadline (endDateTime only) a startDateTime only, or both")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-16T16:55:02.035577+05:30[GMT+05:30]", comments = "Generator version: 7.7.0")
public class TimePeriod {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDateTime;

  public TimePeriod endDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * End of the time period, using IETC-RFC-3339 format
   * @return endDateTime
   */
  @Valid 
  @Schema(name = "endDateTime", example = "1985-04-12T23:20:50.520Z", description = "End of the time period, using IETC-RFC-3339 format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDateTime")
  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }

  public TimePeriod startDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Start of the time period, using IETC-RFC-3339 format
   * @return startDateTime
   */
  @Valid 
  @Schema(name = "startDateTime", example = "1985-04-12T23:20:50.520Z", description = "Start of the time period, using IETC-RFC-3339 format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDateTime")
  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimePeriod timePeriod = (TimePeriod) o;
    return Objects.equals(this.endDateTime, timePeriod.endDateTime) &&
        Objects.equals(this.startDateTime, timePeriod.startDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDateTime, startDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimePeriod {\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
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

