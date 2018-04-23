package fi.metatavu.metaform.server.rest.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets MetaformTableColumnType
 */
public enum MetaformTableColumnType {
  
  HIDDEN("hidden"),
  
  TEXT("text"),
  
  AUTOCOMPLETE("autocomplete"),
  
  NUMBER("number"),
  
  ENUM("enum"),
  
  DATE("date"),
  
  TIME("time"),
  
  HTML("html"),
  
  BUTTON("button");

  private String value;

  MetaformTableColumnType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MetaformTableColumnType fromValue(String text) {
    for (MetaformTableColumnType b : MetaformTableColumnType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


