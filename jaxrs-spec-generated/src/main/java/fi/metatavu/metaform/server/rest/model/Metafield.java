package fi.metatavu.metaform.server.rest.model;

import fi.metatavu.metaform.server.rest.model.MetaformFieldType;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class Metafield   {
  
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("title") String title = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("name") String name = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("type") MetaformFieldType type = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("time") Boolean time = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("contexts") List<String> contexts = new ArrayList<String>();

  /**
   **/
  public Metafield title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Field name
   **/
  public Metafield name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Field name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public Metafield type(MetaformFieldType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public MetaformFieldType getType() {
    return type;
  }
  public void setType(MetaformFieldType type) {
    this.type = type;
  }

  /**
   **/
  public Metafield time(Boolean time) {
    this.time = time;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public Boolean isTime() {
    return time;
  }
  public void setTime(Boolean time) {
    this.time = time;
  }

  /**
   **/
  public Metafield contexts(List<String> contexts) {
    this.contexts = contexts;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public List<String> getContexts() {
    return contexts;
  }
  public void setContexts(List<String> contexts) {
    this.contexts = contexts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metafield metafield = (Metafield) o;
    return Objects.equals(title, metafield.title) &&
        Objects.equals(name, metafield.name) &&
        Objects.equals(type, metafield.type) &&
        Objects.equals(time, metafield.time) &&
        Objects.equals(contexts, metafield.contexts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, name, type, time, contexts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metafield {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
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

