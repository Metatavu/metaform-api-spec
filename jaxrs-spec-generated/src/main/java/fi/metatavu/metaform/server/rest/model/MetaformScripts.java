package fi.metatavu.metaform.server.rest.model;

import fi.metatavu.metaform.server.rest.model.MetaformScript;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class MetaformScripts   {
  
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("afterSubmit") MetaformScript afterSubmit = null;

  /**
   **/
  public MetaformScripts afterSubmit(MetaformScript afterSubmit) {
    this.afterSubmit = afterSubmit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public MetaformScript getAfterSubmit() {
    return afterSubmit;
  }
  public void setAfterSubmit(MetaformScript afterSubmit) {
    this.afterSubmit = afterSubmit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaformScripts metaformScripts = (MetaformScripts) o;
    return Objects.equals(afterSubmit, metaformScripts.afterSubmit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afterSubmit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaformScripts {\n");
    
    sb.append("    afterSubmit: ").append(toIndentedString(afterSubmit)).append("\n");
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

