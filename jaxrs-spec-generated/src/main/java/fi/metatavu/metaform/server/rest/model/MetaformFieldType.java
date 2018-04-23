package fi.metatavu.metaform.server.rest.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets MetaformFieldType
 */
public enum MetaformFieldType {
  
  TEXT("text"),
  
  HIDDEN("hidden"),
  
  EMAIL("email"),
  
  NUMBER("number"),
  
  MEMO("memo"),
  
  BOOLEAN("boolean"),
  
  RADIO("radio"),
  
  CHECKLIST("checklist"),
  
  DATE("date"),
  
  TIME("time"),
  
  DATE_TIME("date-time"),
  
  FILES("files"),
  
  TABLE("table"),
  
  LOGO("logo"),
  
  SMALL_TEXT("small-text"),
  
  HTML("html"),
  
  SUBMIT("submit"),
  
  SELECT("select"),
  
  AUTOCOMPLETE("autocomplete"),
  
  AUTOCOMPLETE_MULTIPLE("autocomplete-multiple");

  private String value;

  MetaformFieldType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MetaformFieldType fromValue(String text) {
    for (MetaformFieldType b : MetaformFieldType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


