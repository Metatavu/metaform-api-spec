package fi.metatavu.metaform.server.rest.model;

import fi.metatavu.metaform.server.rest.model.MetaformField;
import fi.metatavu.metaform.server.rest.model.MetaformVisibleIf;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class MetaformSection   {
  
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("title") String title = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("visible-if") MetaformVisibleIf visibleIf = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("fields") List<MetaformField> fields = new ArrayList<MetaformField>();

  /**
   **/
  public MetaformSection title(String title) {
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
   **/
  public MetaformSection visibleIf(MetaformVisibleIf visibleIf) {
    this.visibleIf = visibleIf;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public MetaformVisibleIf getVisibleIf() {
    return visibleIf;
  }
  public void setVisibleIf(MetaformVisibleIf visibleIf) {
    this.visibleIf = visibleIf;
  }

  /**
   **/
  public MetaformSection fields(List<MetaformField> fields) {
    this.fields = fields;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public List<MetaformField> getFields() {
    return fields;
  }
  public void setFields(List<MetaformField> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaformSection metaformSection = (MetaformSection) o;
    return Objects.equals(title, metaformSection.title) &&
        Objects.equals(visibleIf, metaformSection.visibleIf) &&
        Objects.equals(fields, metaformSection.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, visibleIf, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaformSection {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    visibleIf: ").append(toIndentedString(visibleIf)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

