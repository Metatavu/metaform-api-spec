package fi.metatavu.metaform.server.rest.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Option object for Metaform field
 **/
import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Option object for Metaform field")

public class MetaformFieldOption   {
  
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("name") String name = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("text") String text = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("checked") Boolean checked = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("selected") Boolean selected = null;

  /**
   * Option name
   **/
  public MetaformFieldOption name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Option name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Option text
   **/
  public MetaformFieldOption text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Option text")
  @NotNull
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Defines whether option should be checked by default.
   **/
  public MetaformFieldOption checked(Boolean checked) {
    this.checked = checked;
    return this;
  }

  
  @ApiModelProperty(value = "Defines whether option should be checked by default.")
  public Boolean isChecked() {
    return checked;
  }
  public void setChecked(Boolean checked) {
    this.checked = checked;
  }

  /**
   * Defines whether option should be selected by default.
   **/
  public MetaformFieldOption selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

  
  @ApiModelProperty(value = "Defines whether option should be selected by default.")
  public Boolean isSelected() {
    return selected;
  }
  public void setSelected(Boolean selected) {
    this.selected = selected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaformFieldOption metaformFieldOption = (MetaformFieldOption) o;
    return Objects.equals(name, metaformFieldOption.name) &&
        Objects.equals(text, metaformFieldOption.text) &&
        Objects.equals(checked, metaformFieldOption.checked) &&
        Objects.equals(selected, metaformFieldOption.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, text, checked, selected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaformFieldOption {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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

