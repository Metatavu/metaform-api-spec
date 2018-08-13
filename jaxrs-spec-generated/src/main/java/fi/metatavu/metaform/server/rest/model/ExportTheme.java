package fi.metatavu.metaform.server.rest.model;

import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class ExportTheme   {
  
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("id") UUID id = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("name") String name = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("parentId") UUID parentId = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("locales") String locales = null;

  /**
   **/
  public ExportTheme id(UUID id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   **/
  public ExportTheme name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public ExportTheme parentId(UUID parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public UUID getParentId() {
    return parentId;
  }
  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }

  /**
   **/
  public ExportTheme locales(String locales) {
    this.locales = locales;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getLocales() {
    return locales;
  }
  public void setLocales(String locales) {
    this.locales = locales;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportTheme exportTheme = (ExportTheme) o;
    return Objects.equals(id, exportTheme.id) &&
        Objects.equals(name, exportTheme.name) &&
        Objects.equals(parentId, exportTheme.parentId) &&
        Objects.equals(locales, exportTheme.locales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, parentId, locales);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportTheme {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

