package fi.metatavu.metaform.server.rest.model;

import fi.metatavu.metaform.server.rest.model.MetaformVisibleIf;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Rule that defines whether specified object is visible
 **/
import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Rule that defines whether specified object is visible")

public class MetaformVisibleIf   {
  
  private @Valid String field = null;
  private @Valid String equals = null;
  private @Valid String notEquals = null;
  private @Valid List<MetaformVisibleIf> and = new ArrayList<MetaformVisibleIf>();
  private @Valid List<MetaformVisibleIf> or = new ArrayList<MetaformVisibleIf>();

  /**
   * Field where the visible if rule is relative to
   **/
  public MetaformVisibleIf field(String field) {
    this.field = field;
    return this;
  }

  
  @ApiModelProperty(value = "Field where the visible if rule is relative to")
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }

  /**
   * Value must be equal to this value. If value is specified \&quot;true\&quot; field must have any value selected
   **/
  public MetaformVisibleIf equals(String equals) {
    this.equals = equals;
    return this;
  }

  
  @ApiModelProperty(value = "Value must be equal to this value. If value is specified \"true\" field must have any value selected")
  public String getEquals() {
    return equals;
  }
  public void setEquals(String equals) {
    this.equals = equals;
  }

  /**
   * Value must be not equal to this value.
   **/
  public MetaformVisibleIf notEquals(String notEquals) {
    this.notEquals = notEquals;
    return this;
  }

  
  @ApiModelProperty(value = "Value must be not equal to this value.")
  public String getNotEquals() {
    return notEquals;
  }
  public void setNotEquals(String notEquals) {
    this.notEquals = notEquals;
  }

  /**
   **/
  public MetaformVisibleIf and(List<MetaformVisibleIf> and) {
    this.and = and;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public List<MetaformVisibleIf> getAnd() {
    return and;
  }
  public void setAnd(List<MetaformVisibleIf> and) {
    this.and = and;
  }

  /**
   **/
  public MetaformVisibleIf or(List<MetaformVisibleIf> or) {
    this.or = or;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public List<MetaformVisibleIf> getOr() {
    return or;
  }
  public void setOr(List<MetaformVisibleIf> or) {
    this.or = or;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaformVisibleIf metaformVisibleIf = (MetaformVisibleIf) o;
    return Objects.equals(field, metaformVisibleIf.field) &&
        Objects.equals(equals, metaformVisibleIf.equals) &&
        Objects.equals(notEquals, metaformVisibleIf.notEquals) &&
        Objects.equals(and, metaformVisibleIf.and) &&
        Objects.equals(or, metaformVisibleIf.or);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, equals, notEquals, and, or);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaformVisibleIf {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    equals: ").append(toIndentedString(equals)).append("\n");
    sb.append("    notEquals: ").append(toIndentedString(notEquals)).append("\n");
    sb.append("    and: ").append(toIndentedString(and)).append("\n");
    sb.append("    or: ").append(toIndentedString(or)).append("\n");
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

