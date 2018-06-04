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
import fi.metatavu.metaform.client.MetaformTableColumnType;
import fi.metatavu.metaform.client.MetaformTableColumnValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MetaformTableColumn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T14:36:56.681+03:00")
public class MetaformTableColumn {
  @JsonProperty("type")
  private MetaformTableColumnType type = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("calculate-sum")
  private Boolean calculateSum = null;

  @JsonProperty("sum-postfix")
  private String sumPostfix = null;

  @JsonProperty("column-width")
  private Integer columnWidth = null;

  @JsonProperty("placeholder")
  private String placeholder = null;

  @JsonProperty("readonly")
  private Boolean readonly = null;

  @JsonProperty("required")
  private Boolean required = null;

  @JsonProperty("source-url")
  private String sourceUrl = null;

  @JsonProperty("html")
  private String html = null;

  @JsonProperty("action")
  private String action = null;

  @JsonProperty("values")
  private MetaformTableColumnValues values = null;

  public MetaformTableColumn type(MetaformTableColumnType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public MetaformTableColumnType getType() {
    return type;
  }

  public void setType(MetaformTableColumnType type) {
    this.type = type;
  }

  public MetaformTableColumn title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Column title
   * @return title
  **/
  @ApiModelProperty(value = "Column title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MetaformTableColumn calculateSum(Boolean calculateSum) {
    this.calculateSum = calculateSum;
    return this;
  }

   /**
   * Defines column should automatically calculate sum
   * @return calculateSum
  **/
  @ApiModelProperty(value = "Defines column should automatically calculate sum")
  public Boolean isCalculateSum() {
    return calculateSum;
  }

  public void setCalculateSum(Boolean calculateSum) {
    this.calculateSum = calculateSum;
  }

  public MetaformTableColumn sumPostfix(String sumPostfix) {
    this.sumPostfix = sumPostfix;
    return this;
  }

   /**
   * Postfix for calculated sum
   * @return sumPostfix
  **/
  @ApiModelProperty(value = "Postfix for calculated sum")
  public String getSumPostfix() {
    return sumPostfix;
  }

  public void setSumPostfix(String sumPostfix) {
    this.sumPostfix = sumPostfix;
  }

  public MetaformTableColumn columnWidth(Integer columnWidth) {
    this.columnWidth = columnWidth;
    return this;
  }

   /**
   * Defines column width
   * @return columnWidth
  **/
  @ApiModelProperty(value = "Defines column width")
  public Integer getColumnWidth() {
    return columnWidth;
  }

  public void setColumnWidth(Integer columnWidth) {
    this.columnWidth = columnWidth;
  }

  public MetaformTableColumn placeholder(String placeholder) {
    this.placeholder = placeholder;
    return this;
  }

   /**
   * Placeholder for column field
   * @return placeholder
  **/
  @ApiModelProperty(value = "Placeholder for column field")
  public String getPlaceholder() {
    return placeholder;
  }

  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }

  public MetaformTableColumn readonly(Boolean readonly) {
    this.readonly = readonly;
    return this;
  }

   /**
   * Defines column as readonly
   * @return readonly
  **/
  @ApiModelProperty(value = "Defines column as readonly")
  public Boolean isReadonly() {
    return readonly;
  }

  public void setReadonly(Boolean readonly) {
    this.readonly = readonly;
  }

  public MetaformTableColumn required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Defines column as requires
   * @return required
  **/
  @ApiModelProperty(value = "Defines column as requires")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public MetaformTableColumn sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * Defines source url for autocomplete columns
   * @return sourceUrl
  **/
  @ApiModelProperty(value = "Defines source url for autocomplete columns")
  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public MetaformTableColumn html(String html) {
    this.html = html;
    return this;
  }

   /**
   * Html code for html columns
   * @return html
  **/
  @ApiModelProperty(value = "Html code for html columns")
  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }

  public MetaformTableColumn action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Action for button columns
   * @return action
  **/
  @ApiModelProperty(value = "Action for button columns")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public MetaformTableColumn values(MetaformTableColumnValues values) {
    this.values = values;
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(value = "")
  public MetaformTableColumnValues getValues() {
    return values;
  }

  public void setValues(MetaformTableColumnValues values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaformTableColumn metaformTableColumn = (MetaformTableColumn) o;
    return Objects.equals(this.type, metaformTableColumn.type) &&
        Objects.equals(this.title, metaformTableColumn.title) &&
        Objects.equals(this.calculateSum, metaformTableColumn.calculateSum) &&
        Objects.equals(this.sumPostfix, metaformTableColumn.sumPostfix) &&
        Objects.equals(this.columnWidth, metaformTableColumn.columnWidth) &&
        Objects.equals(this.placeholder, metaformTableColumn.placeholder) &&
        Objects.equals(this.readonly, metaformTableColumn.readonly) &&
        Objects.equals(this.required, metaformTableColumn.required) &&
        Objects.equals(this.sourceUrl, metaformTableColumn.sourceUrl) &&
        Objects.equals(this.html, metaformTableColumn.html) &&
        Objects.equals(this.action, metaformTableColumn.action) &&
        Objects.equals(this.values, metaformTableColumn.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, calculateSum, sumPostfix, columnWidth, placeholder, readonly, required, sourceUrl, html, action, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaformTableColumn {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    calculateSum: ").append(toIndentedString(calculateSum)).append("\n");
    sb.append("    sumPostfix: ").append(toIndentedString(sumPostfix)).append("\n");
    sb.append("    columnWidth: ").append(toIndentedString(columnWidth)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

