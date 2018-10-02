/*
 * Metaform REST API
 * REST API for Metaform
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package fi.metatavu.metaform.client;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import fi.metatavu.metaform.client.MetaformField;
import fi.metatavu.metaform.client.MetaformVisibleIf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * MetaformSection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-02T18:24:54.049+03:00")
public class MetaformSection {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("visible-if")
  private MetaformVisibleIf visibleIf = null;

  @JsonProperty("fields")
  private List<MetaformField> fields = null;

  public MetaformSection title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MetaformSection visibleIf(MetaformVisibleIf visibleIf) {
    this.visibleIf = visibleIf;
    return this;
  }

   /**
   * Get visibleIf
   * @return visibleIf
  **/
  @ApiModelProperty(value = "")
  public MetaformVisibleIf getVisibleIf() {
    return visibleIf;
  }

  public void setVisibleIf(MetaformVisibleIf visibleIf) {
    this.visibleIf = visibleIf;
  }

  public MetaformSection fields(List<MetaformField> fields) {
    this.fields = fields;
    return this;
  }

  public MetaformSection addFieldsItem(MetaformField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<MetaformField>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
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
    return Objects.equals(this.title, metaformSection.title) &&
        Objects.equals(this.visibleIf, metaformSection.visibleIf) &&
        Objects.equals(this.fields, metaformSection.fields);
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

