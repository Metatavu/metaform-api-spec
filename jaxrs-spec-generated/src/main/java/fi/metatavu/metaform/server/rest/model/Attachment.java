package fi.metatavu.metaform.server.rest.model;

import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class Attachment   {
  
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("id") UUID id = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("name") String name = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("contentType") String contentType = null;

  /**
   * Entity identifier
   **/
  public Attachment id(UUID id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Entity identifier")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * Attachment&#39;s name
   **/
  public Attachment name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Attachment's name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Attachment&#39;s content type (e.g. application/pdf)
   **/
  public Attachment contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  
  @ApiModelProperty(value = "Attachment's content type (e.g. application/pdf)")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(id, attachment.id) &&
        Objects.equals(name, attachment.name) &&
        Objects.equals(contentType, attachment.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, contentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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

