package fi.metatavu.metaform.server.rest.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class MetaformFieldPermissioncontexts   {
  
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("view-group") Boolean viewGroup = false;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("edit-group") Boolean editGroup = false;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("notify-group") Boolean notifyGroup = false;

  /**
   * Field value is used as security group with view permission
   **/
  public MetaformFieldPermissioncontexts viewGroup(Boolean viewGroup) {
    this.viewGroup = viewGroup;
    return this;
  }

  
  @ApiModelProperty(value = "Field value is used as security group with view permission")
  public Boolean isViewGroup() {
    return viewGroup;
  }
  public void setViewGroup(Boolean viewGroup) {
    this.viewGroup = viewGroup;
  }

  /**
   * Field value is used as security group with edit permission
   **/
  public MetaformFieldPermissioncontexts editGroup(Boolean editGroup) {
    this.editGroup = editGroup;
    return this;
  }

  
  @ApiModelProperty(value = "Field value is used as security group with edit permission")
  public Boolean isEditGroup() {
    return editGroup;
  }
  public void setEditGroup(Boolean editGroup) {
    this.editGroup = editGroup;
  }

  /**
   * Field value is used as security group with notification permission
   **/
  public MetaformFieldPermissioncontexts notifyGroup(Boolean notifyGroup) {
    this.notifyGroup = notifyGroup;
    return this;
  }

  
  @ApiModelProperty(value = "Field value is used as security group with notification permission")
  public Boolean isNotifyGroup() {
    return notifyGroup;
  }
  public void setNotifyGroup(Boolean notifyGroup) {
    this.notifyGroup = notifyGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaformFieldPermissioncontexts metaformFieldPermissioncontexts = (MetaformFieldPermissioncontexts) o;
    return Objects.equals(viewGroup, metaformFieldPermissioncontexts.viewGroup) &&
        Objects.equals(editGroup, metaformFieldPermissioncontexts.editGroup) &&
        Objects.equals(notifyGroup, metaformFieldPermissioncontexts.notifyGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(viewGroup, editGroup, notifyGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaformFieldPermissioncontexts {\n");
    
    sb.append("    viewGroup: ").append(toIndentedString(viewGroup)).append("\n");
    sb.append("    editGroup: ").append(toIndentedString(editGroup)).append("\n");
    sb.append("    notifyGroup: ").append(toIndentedString(notifyGroup)).append("\n");
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

