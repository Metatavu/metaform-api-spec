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
import fi.metatavu.metaform.client.MetaformFieldOption;
import fi.metatavu.metaform.client.MetaformFieldType;
import fi.metatavu.metaform.client.MetaformTableColumn;
import fi.metatavu.metaform.client.MetaformVisibleIf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * MetaformField
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-27T16:01:42.062+03:00")
public class MetaformField {
  @JsonProperty("visible-if")
  private MetaformVisibleIf visibleIf = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private MetaformFieldType type = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("required")
  private Boolean required = null;

  @JsonProperty("contexts")
  private List<String> contexts = null;

  @JsonProperty("placeholder")
  private String placeholder = null;

  @JsonProperty("class")
  private String propertyClass = null;

  @JsonProperty("readonly")
  private Boolean readonly = null;

  @JsonProperty("help")
  private String help = null;

  @JsonProperty("default")
  private String _default = null;

  @JsonProperty("min")
  private Integer min = null;

  @JsonProperty("max")
  private Integer max = null;

  @JsonProperty("step")
  private Integer step = null;

  @JsonProperty("checked")
  private Boolean checked = null;

  @JsonProperty("printable")
  private Boolean printable = null;

  @JsonProperty("options")
  private List<MetaformFieldOption> options = null;

  @JsonProperty("source-url")
  private String sourceUrl = null;

  @JsonProperty("upload-url")
  private String uploadUrl = null;

  @JsonProperty("single-file")
  private Boolean singleFile = null;

  @JsonProperty("only-images")
  private Boolean onlyImages = null;

  @JsonProperty("max-file-size")
  private Long maxFileSize = null;

  @JsonProperty("draggable")
  private Boolean draggable = null;

  @JsonProperty("columns")
  private List<MetaformTableColumn> columns = null;

  @JsonProperty("src")
  private String src = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("html")
  private String html = null;

  public MetaformField visibleIf(MetaformVisibleIf visibleIf) {
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

  public MetaformField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Field name
   * @return name
  **/
  @ApiModelProperty(value = "Field name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MetaformField type(MetaformFieldType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public MetaformFieldType getType() {
    return type;
  }

  public void setType(MetaformFieldType type) {
    this.type = type;
  }

  public MetaformField title(String title) {
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

  public MetaformField required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @ApiModelProperty(value = "")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public MetaformField contexts(List<String> contexts) {
    this.contexts = contexts;
    return this;
  }

  public MetaformField addContextsItem(String contextsItem) {
    if (this.contexts == null) {
      this.contexts = new ArrayList<String>();
    }
    this.contexts.add(contextsItem);
    return this;
  }

   /**
   * Get contexts
   * @return contexts
  **/
  @ApiModelProperty(value = "")
  public List<String> getContexts() {
    return contexts;
  }

  public void setContexts(List<String> contexts) {
    this.contexts = contexts;
  }

  public MetaformField placeholder(String placeholder) {
    this.placeholder = placeholder;
    return this;
  }

   /**
   * Get placeholder
   * @return placeholder
  **/
  @ApiModelProperty(value = "")
  public String getPlaceholder() {
    return placeholder;
  }

  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }

  public MetaformField propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * Get propertyClass
   * @return propertyClass
  **/
  @ApiModelProperty(value = "")
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public MetaformField readonly(Boolean readonly) {
    this.readonly = readonly;
    return this;
  }

   /**
   * Get readonly
   * @return readonly
  **/
  @ApiModelProperty(value = "")
  public Boolean isReadonly() {
    return readonly;
  }

  public void setReadonly(Boolean readonly) {
    this.readonly = readonly;
  }

  public MetaformField help(String help) {
    this.help = help;
    return this;
  }

   /**
   * Get help
   * @return help
  **/
  @ApiModelProperty(value = "")
  public String getHelp() {
    return help;
  }

  public void setHelp(String help) {
    this.help = help;
  }

  public MetaformField _default(String _default) {
    this._default = _default;
    return this;
  }

   /**
   * a default value for a field
   * @return _default
  **/
  @ApiModelProperty(value = "a default value for a field")
  public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }

  public MetaformField min(Integer min) {
    this.min = min;
    return this;
  }

   /**
   * Minimum value for a field. Only for number fields
   * @return min
  **/
  @ApiModelProperty(value = "Minimum value for a field. Only for number fields")
  public Integer getMin() {
    return min;
  }

  public void setMin(Integer min) {
    this.min = min;
  }

  public MetaformField max(Integer max) {
    this.max = max;
    return this;
  }

   /**
   * Maximum value for a field. Only for number fields
   * @return max
  **/
  @ApiModelProperty(value = "Maximum value for a field. Only for number fields")
  public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }

  public MetaformField step(Integer step) {
    this.step = step;
    return this;
  }

   /**
   * Value step for a field. Only for number fields
   * @return step
  **/
  @ApiModelProperty(value = "Value step for a field. Only for number fields")
  public Integer getStep() {
    return step;
  }

  public void setStep(Integer step) {
    this.step = step;
  }

  public MetaformField checked(Boolean checked) {
    this.checked = checked;
    return this;
  }

   /**
   * Whether checkbox should be checked by default. Only for checkbox fields
   * @return checked
  **/
  @ApiModelProperty(value = "Whether checkbox should be checked by default. Only for checkbox fields")
  public Boolean isChecked() {
    return checked;
  }

  public void setChecked(Boolean checked) {
    this.checked = checked;
  }

  public MetaformField printable(Boolean printable) {
    this.printable = printable;
    return this;
  }

   /**
   * Defines whether field is printable or not. Only for table fields
   * @return printable
  **/
  @ApiModelProperty(value = "Defines whether field is printable or not. Only for table fields")
  public Boolean isPrintable() {
    return printable;
  }

  public void setPrintable(Boolean printable) {
    this.printable = printable;
  }

  public MetaformField options(List<MetaformFieldOption> options) {
    this.options = options;
    return this;
  }

  public MetaformField addOptionsItem(MetaformFieldOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<MetaformFieldOption>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Options for radio, checklist, select fields
   * @return options
  **/
  @ApiModelProperty(value = "Options for radio, checklist, select fields")
  public List<MetaformFieldOption> getOptions() {
    return options;
  }

  public void setOptions(List<MetaformFieldOption> options) {
    this.options = options;
  }

  public MetaformField sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * Source url for autocomplete and autocomplete-multiple fields
   * @return sourceUrl
  **/
  @ApiModelProperty(value = "Source url for autocomplete and autocomplete-multiple fields")
  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public MetaformField uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }

   /**
   * Upload url for files field.
   * @return uploadUrl
  **/
  @ApiModelProperty(value = "Upload url for files field.")
  public String getUploadUrl() {
    return uploadUrl;
  }

  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }

  public MetaformField singleFile(Boolean singleFile) {
    this.singleFile = singleFile;
    return this;
  }

   /**
   * Defines whether file fields allow multiple files or just one
   * @return singleFile
  **/
  @ApiModelProperty(value = "Defines whether file fields allow multiple files or just one")
  public Boolean isSingleFile() {
    return singleFile;
  }

  public void setSingleFile(Boolean singleFile) {
    this.singleFile = singleFile;
  }

  public MetaformField onlyImages(Boolean onlyImages) {
    this.onlyImages = onlyImages;
    return this;
  }

   /**
   * Defines whether file fields allow only images
   * @return onlyImages
  **/
  @ApiModelProperty(value = "Defines whether file fields allow only images")
  public Boolean isOnlyImages() {
    return onlyImages;
  }

  public void setOnlyImages(Boolean onlyImages) {
    this.onlyImages = onlyImages;
  }

  public MetaformField maxFileSize(Long maxFileSize) {
    this.maxFileSize = maxFileSize;
    return this;
  }

   /**
   * Maximum upload size for image filds
   * @return maxFileSize
  **/
  @ApiModelProperty(value = "Maximum upload size for image filds")
  public Long getMaxFileSize() {
    return maxFileSize;
  }

  public void setMaxFileSize(Long maxFileSize) {
    this.maxFileSize = maxFileSize;
  }

  public MetaformField draggable(Boolean draggable) {
    this.draggable = draggable;
    return this;
  }

   /**
   * Defines whether table rows should be draggable.
   * @return draggable
  **/
  @ApiModelProperty(value = "Defines whether table rows should be draggable.")
  public Boolean isDraggable() {
    return draggable;
  }

  public void setDraggable(Boolean draggable) {
    this.draggable = draggable;
  }

  public MetaformField columns(List<MetaformTableColumn> columns) {
    this.columns = columns;
    return this;
  }

  public MetaformField addColumnsItem(MetaformTableColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<MetaformTableColumn>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Columns for table fields
   * @return columns
  **/
  @ApiModelProperty(value = "Columns for table fields")
  public List<MetaformTableColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<MetaformTableColumn> columns) {
    this.columns = columns;
  }

  public MetaformField src(String src) {
    this.src = src;
    return this;
  }

   /**
   * Url for logo field.
   * @return src
  **/
  @ApiModelProperty(value = "Url for logo field.")
  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  public MetaformField text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text for small field.
   * @return text
  **/
  @ApiModelProperty(value = "Text for small field.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MetaformField html(String html) {
    this.html = html;
    return this;
  }

   /**
   * Html code for html field.
   * @return html
  **/
  @ApiModelProperty(value = "Html code for html field.")
  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaformField metaformField = (MetaformField) o;
    return Objects.equals(this.visibleIf, metaformField.visibleIf) &&
        Objects.equals(this.name, metaformField.name) &&
        Objects.equals(this.type, metaformField.type) &&
        Objects.equals(this.title, metaformField.title) &&
        Objects.equals(this.required, metaformField.required) &&
        Objects.equals(this.contexts, metaformField.contexts) &&
        Objects.equals(this.placeholder, metaformField.placeholder) &&
        Objects.equals(this.propertyClass, metaformField.propertyClass) &&
        Objects.equals(this.readonly, metaformField.readonly) &&
        Objects.equals(this.help, metaformField.help) &&
        Objects.equals(this._default, metaformField._default) &&
        Objects.equals(this.min, metaformField.min) &&
        Objects.equals(this.max, metaformField.max) &&
        Objects.equals(this.step, metaformField.step) &&
        Objects.equals(this.checked, metaformField.checked) &&
        Objects.equals(this.printable, metaformField.printable) &&
        Objects.equals(this.options, metaformField.options) &&
        Objects.equals(this.sourceUrl, metaformField.sourceUrl) &&
        Objects.equals(this.uploadUrl, metaformField.uploadUrl) &&
        Objects.equals(this.singleFile, metaformField.singleFile) &&
        Objects.equals(this.onlyImages, metaformField.onlyImages) &&
        Objects.equals(this.maxFileSize, metaformField.maxFileSize) &&
        Objects.equals(this.draggable, metaformField.draggable) &&
        Objects.equals(this.columns, metaformField.columns) &&
        Objects.equals(this.src, metaformField.src) &&
        Objects.equals(this.text, metaformField.text) &&
        Objects.equals(this.html, metaformField.html);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visibleIf, name, type, title, required, contexts, placeholder, propertyClass, readonly, help, _default, min, max, step, checked, printable, options, sourceUrl, uploadUrl, singleFile, onlyImages, maxFileSize, draggable, columns, src, text, html);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaformField {\n");
    
    sb.append("    visibleIf: ").append(toIndentedString(visibleIf)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
    sb.append("    help: ").append(toIndentedString(help)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
    sb.append("    printable: ").append(toIndentedString(printable)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
    sb.append("    singleFile: ").append(toIndentedString(singleFile)).append("\n");
    sb.append("    onlyImages: ").append(toIndentedString(onlyImages)).append("\n");
    sb.append("    maxFileSize: ").append(toIndentedString(maxFileSize)).append("\n");
    sb.append("    draggable: ").append(toIndentedString(draggable)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
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

