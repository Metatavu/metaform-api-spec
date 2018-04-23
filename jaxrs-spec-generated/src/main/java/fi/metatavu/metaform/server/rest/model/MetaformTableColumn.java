package fi.metatavu.metaform.server.rest.model;

import fi.metatavu.metaform.server.rest.model.MetaformTableColumnType;
import fi.metatavu.metaform.server.rest.model.MetaformTableColumnValues;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class MetaformTableColumn   {
  
  private @Valid MetaformTableColumnType type = null;
  private @Valid String title = null;
  private @Valid Boolean calculateSum = null;
  private @Valid String sumPostfix = null;
  private @Valid Integer columnWidth = null;
  private @Valid String placeholder = null;
  private @Valid Boolean readonly = null;
  private @Valid Boolean required = null;
  private @Valid String sourceUrl = null;
  private @Valid String html = null;
  private @Valid String action = null;
  private @Valid MetaformTableColumnValues values = null;

  /**
   **/
  public MetaformTableColumn type(MetaformTableColumnType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public MetaformTableColumnType getType() {
    return type;
  }
  public void setType(MetaformTableColumnType type) {
    this.type = type;
  }

  /**
   * Column title
   **/
  public MetaformTableColumn title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "Column title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Defines column should automatically calculate sum
   **/
  public MetaformTableColumn calculateSum(Boolean calculateSum) {
    this.calculateSum = calculateSum;
    return this;
  }

  
  @ApiModelProperty(value = "Defines column should automatically calculate sum")
  public Boolean isCalculateSum() {
    return calculateSum;
  }
  public void setCalculateSum(Boolean calculateSum) {
    this.calculateSum = calculateSum;
  }

  /**
   * Postfix for calculated sum
   **/
  public MetaformTableColumn sumPostfix(String sumPostfix) {
    this.sumPostfix = sumPostfix;
    return this;
  }

  
  @ApiModelProperty(value = "Postfix for calculated sum")
  public String getSumPostfix() {
    return sumPostfix;
  }
  public void setSumPostfix(String sumPostfix) {
    this.sumPostfix = sumPostfix;
  }

  /**
   * Defines column width
   **/
  public MetaformTableColumn columnWidth(Integer columnWidth) {
    this.columnWidth = columnWidth;
    return this;
  }

  
  @ApiModelProperty(value = "Defines column width")
  public Integer getColumnWidth() {
    return columnWidth;
  }
  public void setColumnWidth(Integer columnWidth) {
    this.columnWidth = columnWidth;
  }

  /**
   * Placeholder for column field
   **/
  public MetaformTableColumn placeholder(String placeholder) {
    this.placeholder = placeholder;
    return this;
  }

  
  @ApiModelProperty(value = "Placeholder for column field")
  public String getPlaceholder() {
    return placeholder;
  }
  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }

  /**
   * Defines column as readonly
   **/
  public MetaformTableColumn readonly(Boolean readonly) {
    this.readonly = readonly;
    return this;
  }

  
  @ApiModelProperty(value = "Defines column as readonly")
  public Boolean isReadonly() {
    return readonly;
  }
  public void setReadonly(Boolean readonly) {
    this.readonly = readonly;
  }

  /**
   * Defines column as requires
   **/
  public MetaformTableColumn required(Boolean required) {
    this.required = required;
    return this;
  }

  
  @ApiModelProperty(value = "Defines column as requires")
  public Boolean isRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }

  /**
   * Defines source url for autocomplete columns
   **/
  public MetaformTableColumn sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

  
  @ApiModelProperty(value = "Defines source url for autocomplete columns")
  public String getSourceUrl() {
    return sourceUrl;
  }
  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  /**
   * Html code for html columns
   **/
  public MetaformTableColumn html(String html) {
    this.html = html;
    return this;
  }

  
  @ApiModelProperty(value = "Html code for html columns")
  public String getHtml() {
    return html;
  }
  public void setHtml(String html) {
    this.html = html;
  }

  /**
   * Action for button columns
   **/
  public MetaformTableColumn action(String action) {
    this.action = action;
    return this;
  }

  
  @ApiModelProperty(value = "Action for button columns")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  /**
   **/
  public MetaformTableColumn values(MetaformTableColumnValues values) {
    this.values = values;
    return this;
  }

  
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
    return Objects.equals(type, metaformTableColumn.type) &&
        Objects.equals(title, metaformTableColumn.title) &&
        Objects.equals(calculateSum, metaformTableColumn.calculateSum) &&
        Objects.equals(sumPostfix, metaformTableColumn.sumPostfix) &&
        Objects.equals(columnWidth, metaformTableColumn.columnWidth) &&
        Objects.equals(placeholder, metaformTableColumn.placeholder) &&
        Objects.equals(readonly, metaformTableColumn.readonly) &&
        Objects.equals(required, metaformTableColumn.required) &&
        Objects.equals(sourceUrl, metaformTableColumn.sourceUrl) &&
        Objects.equals(html, metaformTableColumn.html) &&
        Objects.equals(action, metaformTableColumn.action) &&
        Objects.equals(values, metaformTableColumn.values);
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

