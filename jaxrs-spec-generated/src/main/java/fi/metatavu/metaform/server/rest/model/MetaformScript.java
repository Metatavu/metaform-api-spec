package fi.metatavu.metaform.server.rest.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class MetaformScript   {
  
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("name") String name = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("language") String language = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("content") String content = null;

  /**
   **/
  public MetaformScript name(String name) {
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
  public MetaformScript language(String language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   **/
  public MetaformScript content(String content) {
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
    MetaformScript metaformScript = (MetaformScript) o;
    return Objects.equals(name, metaformScript.name) &&
        Objects.equals(language, metaformScript.language) &&
        Objects.equals(content, metaformScript.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, language, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaformScript {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

