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
 * Option object for Metaform field
 */
@ApiModel(description = "Option object for Metaform field")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-03T15:52:07.692+03:00")
public class MetaformFieldOption {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("checked")
  private Boolean checked = null;

  @JsonProperty("selected")
  private Boolean selected = null;

  public MetaformFieldOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Option name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Option name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MetaformFieldOption text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Option text
   * @return text
  **/
  @ApiModelProperty(required = true, value = "Option text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MetaformFieldOption checked(Boolean checked) {
    this.checked = checked;
    return this;
  }

   /**
   * Defines whether option should be checked by default.
   * @return checked
  **/
  @ApiModelProperty(value = "Defines whether option should be checked by default.")
  public Boolean isChecked() {
    return checked;
  }

  public void setChecked(Boolean checked) {
    this.checked = checked;
  }

  public MetaformFieldOption selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

   /**
   * Defines whether option should be selected by default.
   * @return selected
  **/
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
    return Objects.equals(this.name, metaformFieldOption.name) &&
        Objects.equals(this.text, metaformFieldOption.text) &&
        Objects.equals(this.checked, metaformFieldOption.checked) &&
        Objects.equals(this.selected, metaformFieldOption.selected);
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

