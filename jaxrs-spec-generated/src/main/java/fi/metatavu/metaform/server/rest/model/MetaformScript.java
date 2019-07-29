package fi.metatavu.metaform.server.rest.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class MetaformScript   {
  
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("type") String type = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("data") String data = null;

  /**
   **/
  public MetaformScript type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public MetaformScript data(String data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaformScript metaformScript = (MetaformScript) o;
    return Objects.equals(type, metaformScript.type) &&
        Objects.equals(data, metaformScript.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaformScript {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

