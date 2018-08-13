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
 * MetaformFieldFlags
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-13T12:38:59.598+03:00")
public class MetaformFieldFlags {
  @JsonProperty("managementEditable")
  private Boolean managementEditable = false;

  public MetaformFieldFlags managementEditable(Boolean managementEditable) {
    this.managementEditable = managementEditable;
    return this;
  }

   /**
   * Field should be editable in management service
   * @return managementEditable
  **/
  @ApiModelProperty(value = "Field should be editable in management service")
  public Boolean isManagementEditable() {
    return managementEditable;
  }

  public void setManagementEditable(Boolean managementEditable) {
    this.managementEditable = managementEditable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaformFieldFlags metaformFieldFlags = (MetaformFieldFlags) o;
    return Objects.equals(this.managementEditable, metaformFieldFlags.managementEditable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementEditable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaformFieldFlags {\n");
    
    sb.append("    managementEditable: ").append(toIndentedString(managementEditable)).append("\n");
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

