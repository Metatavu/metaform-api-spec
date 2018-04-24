package fi.metatavu.metaform.server.rest.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Values for enum columns
 **/
import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Values for enum columns")

public class MetaformTableColumnValues   {
  
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("value") String value = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("other") String other = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("text") String text = null;

  /**
   **/
  public MetaformTableColumnValues value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   **/
  public MetaformTableColumnValues other(String other) {
    this.other = other;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getOther() {
    return other;
  }
  public void setOther(String other) {
    this.other = other;
  }

  /**
   **/
  public MetaformTableColumnValues text(String text) {
    this.text = text;
    return this;
  }

  
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
    return Objects.equals(value, metaformTableColumnValues.value) &&
        Objects.equals(other, metaformTableColumnValues.other) &&
        Objects.equals(text, metaformTableColumnValues.text);
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

