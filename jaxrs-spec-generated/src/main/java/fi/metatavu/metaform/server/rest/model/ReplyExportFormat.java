package fi.metatavu.metaform.server.rest.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ReplyExportFormat
 */
public enum ReplyExportFormat {
  
  XLSX("XLSX"),
  
  PDF("PDF");

  private String value;

  ReplyExportFormat(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReplyExportFormat fromValue(String text) {
    for (ReplyExportFormat b : ReplyExportFormat.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


