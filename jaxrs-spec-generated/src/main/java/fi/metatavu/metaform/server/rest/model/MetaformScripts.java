package fi.metatavu.metaform.server.rest.model;

import fi.metatavu.metaform.server.rest.model.MetaformScript;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class MetaformScripts   {
  
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("afterCreateReply") List<MetaformScript> afterCreateReply = new ArrayList<MetaformScript>();
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("afterUpdateReply") List<MetaformScript> afterUpdateReply = new ArrayList<MetaformScript>();

  /**
   * List of scripts run after new reply is created
   **/
  public MetaformScripts afterCreateReply(List<MetaformScript> afterCreateReply) {
    this.afterCreateReply = afterCreateReply;
    return this;
  }

  
  @ApiModelProperty(value = "List of scripts run after new reply is created")
  public List<MetaformScript> getAfterCreateReply() {
    return afterCreateReply;
  }
  public void setAfterCreateReply(List<MetaformScript> afterCreateReply) {
    this.afterCreateReply = afterCreateReply;
  }

  /**
   * List of scripts run after a reply is updated
   **/
  public MetaformScripts afterUpdateReply(List<MetaformScript> afterUpdateReply) {
    this.afterUpdateReply = afterUpdateReply;
    return this;
  }

  
  @ApiModelProperty(value = "List of scripts run after a reply is updated")
  public List<MetaformScript> getAfterUpdateReply() {
    return afterUpdateReply;
  }
  public void setAfterUpdateReply(List<MetaformScript> afterUpdateReply) {
    this.afterUpdateReply = afterUpdateReply;
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
    return Objects.equals(afterCreateReply, metaformScripts.afterCreateReply) &&
        Objects.equals(afterUpdateReply, metaformScripts.afterUpdateReply);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afterCreateReply, afterUpdateReply);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaformScripts {\n");
    
    sb.append("    afterCreateReply: ").append(toIndentedString(afterCreateReply)).append("\n");
    sb.append("    afterUpdateReply: ").append(toIndentedString(afterUpdateReply)).append("\n");
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

