package fi.metatavu.metaform.server.rest.model;

import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class ExportThemeFile   {
  
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("id") UUID id = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("path") String path = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("themeId") UUID themeId = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("content") String content = null;

  /**
   **/
  public ExportThemeFile id(UUID id) {
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
  public ExportThemeFile path(String path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  /**
   **/
  public ExportThemeFile themeId(UUID themeId) {
    this.themeId = themeId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public UUID getThemeId() {
    return themeId;
  }
  public void setThemeId(UUID themeId) {
    this.themeId = themeId;
  }

  /**
   **/
  public ExportThemeFile content(String content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportThemeFile exportThemeFile = (ExportThemeFile) o;
    return Objects.equals(id, exportThemeFile.id) &&
        Objects.equals(path, exportThemeFile.path) &&
        Objects.equals(themeId, exportThemeFile.themeId) &&
        Objects.equals(content, exportThemeFile.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, path, themeId, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportThemeFile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    themeId: ").append(toIndentedString(themeId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

