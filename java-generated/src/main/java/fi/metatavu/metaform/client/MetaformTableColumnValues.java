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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Values for enum columns
 */
@ApiModel(description = "Values for enum columns")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-02T18:24:54.049+03:00")
public class MetaformTableColumnValues {
  @JsonProperty("value")
  private String value = null;

  @JsonProperty("other")
  private String other = null;

  @JsonProperty("text")
  private String text = null;

  public MetaformTableColumnValues value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public MetaformTableColumnValues other(String other) {
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/
  @ApiModelProperty(value = "")
  public String getOther() {
    return other;
  }

  public void setOther(String other) {
    this.other = other;
  }

  public MetaformTableColumnValues text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaformTableColumnValues metaformTableColumnValues = (MetaformTableColumnValues) o;
    return Objects.equals(this.value, metaformTableColumnValues.value) &&
        Objects.equals(this.other, metaformTableColumnValues.other) &&
        Objects.equals(this.text, metaformTableColumnValues.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, other, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaformTableColumnValues {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

