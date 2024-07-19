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
import org.openapitools.model.CharacteristicFVO;
import org.openapitools.model.CharacteristicRelationshipFVO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ObjectCharacteristicFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-08T19:14:52.617209500+05:30[Asia/Calcutta]", comments = "Generator version: 7.7.0")
public class ObjectCharacteristicFVO extends CharacteristicFVO {

  private Object value;

  public ObjectCharacteristicFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ObjectCharacteristicFVO(Object value, String atType, String name) {
    super(atType, name);
    this.value = value;
  }

  public ObjectCharacteristicFVO value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Value of the characteristic
   * @return value
   */
  @NotNull 
  @Schema(name = "value", description = "Value of the characteristic", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  public ObjectCharacteristicFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ObjectCharacteristicFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ObjectCharacteristicFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ObjectCharacteristicFVO id(String id) {
    super.id(id);
    return this;
  }

  public ObjectCharacteristicFVO name(String name) {
    super.name(name);
    return this;
  }

  public ObjectCharacteristicFVO valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public ObjectCharacteristicFVO characteristicRelationship(List<CharacteristicRelationshipFVO> characteristicRelationship) {
    super.characteristicRelationship(characteristicRelationship);
    return this;
  }

  public ObjectCharacteristicFVO addCharacteristicRelationshipItem(CharacteristicRelationshipFVO characteristicRelationshipItem) {
    super.addCharacteristicRelationshipItem(characteristicRelationshipItem);
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
    ObjectCharacteristicFVO objectCharacteristicFVO = (ObjectCharacteristicFVO) o;
    return Objects.equals(this.value, objectCharacteristicFVO.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectCharacteristicFVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

