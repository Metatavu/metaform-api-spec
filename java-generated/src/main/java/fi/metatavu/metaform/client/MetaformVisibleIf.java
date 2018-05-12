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
import fi.metatavu.metaform.client.MetaformVisibleIf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Rule that defines whether specified object is visible
 */
@ApiModel(description = "Rule that defines whether specified object is visible")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-12T22:10:42.916+03:00")
public class MetaformVisibleIf {
  @JsonProperty("field")
  private String field = null;

  @JsonProperty("equals")
  private String equals = null;

  @JsonProperty("not-equals")
  private String notEquals = null;

  @JsonProperty("and")
  private List<MetaformVisibleIf> and = null;

  @JsonProperty("or")
  private List<MetaformVisibleIf> or = null;

  public MetaformVisibleIf field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Field where the visible if rule is relative to
   * @return field
  **/
  @ApiModelProperty(value = "Field where the visible if rule is relative to")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public MetaformVisibleIf equals(String equals) {
    this.equals = equals;
    return this;
  }

   /**
   * Value must be equal to this value. If value is specified \&quot;true\&quot; field must have any value selected
   * @return equals
  **/
  @ApiModelProperty(value = "Value must be equal to this value. If value is specified \"true\" field must have any value selected")
  public String getEquals() {
    return equals;
  }

  public void setEquals(String equals) {
    this.equals = equals;
  }

  public MetaformVisibleIf notEquals(String notEquals) {
    this.notEquals = notEquals;
    return this;
  }

   /**
   * Value must be not equal to this value.
   * @return notEquals
  **/
  @ApiModelProperty(value = "Value must be not equal to this value.")
  public String getNotEquals() {
    return notEquals;
  }

  public void setNotEquals(String notEquals) {
    this.notEquals = notEquals;
  }

  public MetaformVisibleIf and(List<MetaformVisibleIf> and) {
    this.and = and;
    return this;
  }

  public MetaformVisibleIf addAndItem(MetaformVisibleIf andItem) {
    if (this.and == null) {
      this.and = new ArrayList<MetaformVisibleIf>();
    }
    this.and.add(andItem);
    return this;
  }

   /**
   * Get and
   * @return and
  **/
  @ApiModelProperty(value = "")
  public List<MetaformVisibleIf> getAnd() {
    return and;
  }

  public void setAnd(List<MetaformVisibleIf> and) {
    this.and = and;
  }

  public MetaformVisibleIf or(List<MetaformVisibleIf> or) {
    this.or = or;
    return this;
  }

  public MetaformVisibleIf addOrItem(MetaformVisibleIf orItem) {
    if (this.or == null) {
      this.or = new ArrayList<MetaformVisibleIf>();
    }
    this.or.add(orItem);
    return this;
  }

   /**
   * Get or
   * @return or
  **/
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
    return Objects.equals(this.field, metaformVisibleIf.field) &&
        Objects.equals(this.equals, metaformVisibleIf.equals) &&
        Objects.equals(this.notEquals, metaformVisibleIf.notEquals) &&
        Objects.equals(this.and, metaformVisibleIf.and) &&
        Objects.equals(this.or, metaformVisibleIf.or);
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

