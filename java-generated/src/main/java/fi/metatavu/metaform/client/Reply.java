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
import fi.metatavu.metaform.client.ReplyData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Reply
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-24T13:27:12.215+03:00")
public class Reply {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("userId")
  private UUID userId = null;

  @JsonProperty("revision")
  private OffsetDateTime revision = null;

  @JsonProperty("data")
  private ReplyData data = null;

  public Reply id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Reply userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public Reply revision(OffsetDateTime revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Get revision
   * @return revision
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getRevision() {
    return revision;
  }

  public void setRevision(OffsetDateTime revision) {
    this.revision = revision;
  }

  public Reply data(ReplyData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public ReplyData getData() {
    return data;
  }

  public void setData(ReplyData data) {
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
    Reply reply = (Reply) o;
    return Objects.equals(this.id, reply.id) &&
        Objects.equals(this.userId, reply.userId) &&
        Objects.equals(this.revision, reply.revision) &&
        Objects.equals(this.data, reply.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, revision, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reply {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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

