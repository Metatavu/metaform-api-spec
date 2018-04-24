package fi.metatavu.metaform.server.rest.model;

import fi.metatavu.metaform.server.rest.model.MetaformFieldOption;
import fi.metatavu.metaform.server.rest.model.MetaformFieldType;
import fi.metatavu.metaform.server.rest.model.MetaformTableColumn;
import fi.metatavu.metaform.server.rest.model.MetaformVisibleIf;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class MetaformField   {
  
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("visible-if") MetaformVisibleIf visibleIf = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("name") String name = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("type") MetaformFieldType type = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("title") String title = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("required") Boolean required = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("contexts") String contexts = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("placeholder") String placeholder = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("class") String propertyClass = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("readonly") Boolean readonly = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("help") String help = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("default") String _default = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("min") Integer min = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("max") Integer max = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("step") Integer step = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("checked") Boolean checked = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("printable") Boolean printable = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("options") List<MetaformFieldOption> options = new ArrayList<MetaformFieldOption>();
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("source-url") String sourceUrl = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("upload-url") String uploadUrl = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("single-file") Boolean singleFile = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("only-images") Boolean onlyImages = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("max-file-size") Long maxFileSize = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("draggable") Boolean draggable = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("columns") List<MetaformTableColumn> columns = new ArrayList<MetaformTableColumn>();
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("src") String src = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("text") String text = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("html") String html = null;

  /**
   **/
  public MetaformField visibleIf(MetaformVisibleIf visibleIf) {
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
   * Field name
   **/
  public MetaformField name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Field name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public MetaformField type(MetaformFieldType type) {
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
  public MetaformField title(String title) {
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
  public MetaformField required(Boolean required) {
    this.required = required;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public Boolean isRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }

  /**
   **/
  public MetaformField contexts(String contexts) {
    this.contexts = contexts;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getContexts() {
    return contexts;
  }
  public void setContexts(String contexts) {
    this.contexts = contexts;
  }

  /**
   **/
  public MetaformField placeholder(String placeholder) {
    this.placeholder = placeholder;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getPlaceholder() {
    return placeholder;
  }
  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }

  /**
   **/
  public MetaformField propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getPropertyClass() {
    return propertyClass;
  }
  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  /**
   **/
  public MetaformField readonly(Boolean readonly) {
    this.readonly = readonly;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public Boolean isReadonly() {
    return readonly;
  }
  public void setReadonly(Boolean readonly) {
    this.readonly = readonly;
  }

  /**
   **/
  public MetaformField help(String help) {
    this.help = help;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getHelp() {
    return help;
  }
  public void setHelp(String help) {
    this.help = help;
  }

  /**
   * a default value for a field
   **/
  public MetaformField _default(String _default) {
    this._default = _default;
    return this;
  }

  
  @ApiModelProperty(value = "a default value for a field")
  public String getDefault() {
    return _default;
  }
  public void setDefault(String _default) {
    this._default = _default;
  }

  /**
   * Minimum value for a field. Only for number fields
   **/
  public MetaformField min(Integer min) {
    this.min = min;
    return this;
  }

  
  @ApiModelProperty(value = "Minimum value for a field. Only for number fields")
  public Integer getMin() {
    return min;
  }
  public void setMin(Integer min) {
    this.min = min;
  }

  /**
   * Maximum value for a field. Only for number fields
   **/
  public MetaformField max(Integer max) {
    this.max = max;
    return this;
  }

  
  @ApiModelProperty(value = "Maximum value for a field. Only for number fields")
  public Integer getMax() {
    return max;
  }
  public void setMax(Integer max) {
    this.max = max;
  }

  /**
   * Value step for a field. Only for number fields
   **/
  public MetaformField step(Integer step) {
    this.step = step;
    return this;
  }

  
  @ApiModelProperty(value = "Value step for a field. Only for number fields")
  public Integer getStep() {
    return step;
  }
  public void setStep(Integer step) {
    this.step = step;
  }

  /**
   * Whether checkbox should be checked by default. Only for checkbox fields
   **/
  public MetaformField checked(Boolean checked) {
    this.checked = checked;
    return this;
  }

  
  @ApiModelProperty(value = "Whether checkbox should be checked by default. Only for checkbox fields")
  public Boolean isChecked() {
    return checked;
  }
  public void setChecked(Boolean checked) {
    this.checked = checked;
  }

  /**
   * Defines whether field is printable or not. Only for table fields
   **/
  public MetaformField printable(Boolean printable) {
    this.printable = printable;
    return this;
  }

  
  @ApiModelProperty(value = "Defines whether field is printable or not. Only for table fields")
  public Boolean isPrintable() {
    return printable;
  }
  public void setPrintable(Boolean printable) {
    this.printable = printable;
  }

  /**
   * Options for radio, checklist, select fields
   **/
  public MetaformField options(List<MetaformFieldOption> options) {
    this.options = options;
    return this;
  }

  
  @ApiModelProperty(value = "Options for radio, checklist, select fields")
  public List<MetaformFieldOption> getOptions() {
    return options;
  }
  public void setOptions(List<MetaformFieldOption> options) {
    this.options = options;
  }

  /**
   * Source url for autocomplete and autocomplete-multiple fields
   **/
  public MetaformField sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

  
  @ApiModelProperty(value = "Source url for autocomplete and autocomplete-multiple fields")
  public String getSourceUrl() {
    return sourceUrl;
  }
  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  /**
   * Upload url for files field.
   **/
  public MetaformField uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }

  
  @ApiModelProperty(value = "Upload url for files field.")
  public String getUploadUrl() {
    return uploadUrl;
  }
  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }

  /**
   * Defines whether file fields allow multiple files or just one
   **/
  public MetaformField singleFile(Boolean singleFile) {
    this.singleFile = singleFile;
    return this;
  }

  
  @ApiModelProperty(value = "Defines whether file fields allow multiple files or just one")
  public Boolean isSingleFile() {
    return singleFile;
  }
  public void setSingleFile(Boolean singleFile) {
    this.singleFile = singleFile;
  }

  /**
   * Defines whether file fields allow only images
   **/
  public MetaformField onlyImages(Boolean onlyImages) {
    this.onlyImages = onlyImages;
    return this;
  }

  
  @ApiModelProperty(value = "Defines whether file fields allow only images")
  public Boolean isOnlyImages() {
    return onlyImages;
  }
  public void setOnlyImages(Boolean onlyImages) {
    this.onlyImages = onlyImages;
  }

  /**
   * Maximum upload size for image filds
   **/
  public MetaformField maxFileSize(Long maxFileSize) {
    this.maxFileSize = maxFileSize;
    return this;
  }

  
  @ApiModelProperty(value = "Maximum upload size for image filds")
  public Long getMaxFileSize() {
    return maxFileSize;
  }
  public void setMaxFileSize(Long maxFileSize) {
    this.maxFileSize = maxFileSize;
  }

  /**
   * Defines whether table rows should be draggable.
   **/
  public MetaformField draggable(Boolean draggable) {
    this.draggable = draggable;
    return this;
  }

  
  @ApiModelProperty(value = "Defines whether table rows should be draggable.")
  public Boolean isDraggable() {
    return draggable;
  }
  public void setDraggable(Boolean draggable) {
    this.draggable = draggable;
  }

  /**
   * Columns for table fields
   **/
  public MetaformField columns(List<MetaformTableColumn> columns) {
    this.columns = columns;
    return this;
  }

  
  @ApiModelProperty(value = "Columns for table fields")
  public List<MetaformTableColumn> getColumns() {
    return columns;
  }
  public void setColumns(List<MetaformTableColumn> columns) {
    this.columns = columns;
  }

  /**
   * Url for logo field.
   **/
  public MetaformField src(String src) {
    this.src = src;
    return this;
  }

  
  @ApiModelProperty(value = "Url for logo field.")
  public String getSrc() {
    return src;
  }
  public void setSrc(String src) {
    this.src = src;
  }

  /**
   * Text for small field.
   **/
  public MetaformField text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "Text for small field.")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Html code for html field.
   **/
  public MetaformField html(String html) {
    this.html = html;
    return this;
  }

  
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
    return Objects.equals(visibleIf, metaformField.visibleIf) &&
        Objects.equals(name, metaformField.name) &&
        Objects.equals(type, metaformField.type) &&
        Objects.equals(title, metaformField.title) &&
        Objects.equals(required, metaformField.required) &&
        Objects.equals(contexts, metaformField.contexts) &&
        Objects.equals(placeholder, metaformField.placeholder) &&
        Objects.equals(propertyClass, metaformField.propertyClass) &&
        Objects.equals(readonly, metaformField.readonly) &&
        Objects.equals(help, metaformField.help) &&
        Objects.equals(_default, metaformField._default) &&
        Objects.equals(min, metaformField.min) &&
        Objects.equals(max, metaformField.max) &&
        Objects.equals(step, metaformField.step) &&
        Objects.equals(checked, metaformField.checked) &&
        Objects.equals(printable, metaformField.printable) &&
        Objects.equals(options, metaformField.options) &&
        Objects.equals(sourceUrl, metaformField.sourceUrl) &&
        Objects.equals(uploadUrl, metaformField.uploadUrl) &&
        Objects.equals(singleFile, metaformField.singleFile) &&
        Objects.equals(onlyImages, metaformField.onlyImages) &&
        Objects.equals(maxFileSize, metaformField.maxFileSize) &&
        Objects.equals(draggable, metaformField.draggable) &&
        Objects.equals(columns, metaformField.columns) &&
        Objects.equals(src, metaformField.src) &&
        Objects.equals(text, metaformField.text) &&
        Objects.equals(html, metaformField.html);
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

